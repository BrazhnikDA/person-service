package liga.medical.personservice.core.api;

import liga.medical.personservice.core.model.User;

public interface UserValidator {
    boolean isUserValid(User user);

    boolean isUserNotValid(User user);
}
