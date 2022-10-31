package liga.medical.personservice.core.web;

import liga.medical.personservice.core.api.UserValidator;
import liga.medical.personservice.core.mapping.UserMapper;
import liga.medical.personservice.core.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserValidatorImpl implements UserValidator {

    private UserMapper userMapper;

    public UserValidatorImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean isUserValid(User user) {
        if (user.getLogin() == null || user.getPassword() == null) {
            return false;
        }
        return user.getPassword().length() >= 8;
    }

    public boolean isUserNotValid(User user) {
        return userMapper.getUserByUsername(user.getLogin()) != null;
    }
}
