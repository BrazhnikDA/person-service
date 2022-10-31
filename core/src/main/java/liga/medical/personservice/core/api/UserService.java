package liga.medical.personservice.core.api;

import liga.medical.personservice.core.model.User;

public interface UserService {
    void addNewUser(User user);

    User findUserByLogin(String login);

}
