package com.example.user;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserOlderThan18(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return user.getAge() > 18;
        }
        return false;
    }
    public List<User> findUsersOlderThan18(){
        List<User> users = userRepository.findAll();
        return users.stream().
                filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
    }
}

