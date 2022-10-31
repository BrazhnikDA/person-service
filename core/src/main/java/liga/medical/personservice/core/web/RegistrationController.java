package liga.medical.personservice.core.web;

import liga.medical.personservice.core.api.UserService;
import liga.medical.personservice.core.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final UserValidatorImpl userValidator;

    private final UserService userService;

    public RegistrationController(UserValidatorImpl userValidator, UserService userService) {
        this.userValidator = userValidator;
        this.userService = userService;
    }

    @PostMapping("/registration")
    public String validateRegistrationForm(@ModelAttribute User user, Model model) {
        if (!userValidator.isUserValid(user)) {
            model.addAttribute("error", "Пароль должен быть больше 8 символов");
            return "registration";
        }
        if (userValidator.isUserNotValid(user)) {
            model.addAttribute("error", "Данный логин уже зарегестрирован в системе");
            return "registration";
        }
        userService.addNewUser(user);
        return "redirect:/";
    }

    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }
}
