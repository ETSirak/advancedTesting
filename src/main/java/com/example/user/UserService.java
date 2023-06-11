package com.example.user;

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
}

