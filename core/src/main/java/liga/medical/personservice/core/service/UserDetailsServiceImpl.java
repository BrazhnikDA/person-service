package liga.medical.personservice.core.service;

import liga.medical.personservice.core.config.SecurityUser;
import liga.medical.personservice.core.mapping.UserMapper;
import liga.medical.personservice.core.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserMapper userMapper;

    public UserDetailsServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userMapper.getUserByUsername(login);
        if (user == null)
            throw new UsernameNotFoundException("Error: User not found");
        return SecurityUser.fromUser(user);
    }
}
