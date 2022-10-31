package liga.medical.personservice.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String mainPage() {
        return "links";
    }

    @GetMapping("/administrator")
    public String getAdminPage() {
        return "administrator";
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "user";
    }
}
