package com.example.userTest;

import com.example.user.User;
import com.example.user.UserRepository;
import com.example.user.UserService;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        // Test if user is added to the repository
        userRepository.addUser(new User("Erki", 20));
        userRepository.addUser(new User("Tonis", 17));

        // Test if user is older or younger than 18
        System.out.println("Erki older 18? " + userService.isUserOlderThan18("Erki")); //true
        System.out.println("Tonis older than 18? " + userService.isUserOlderThan18("Tonis")); //false
        System.out.println("Is Miki mouse older than 18? " + userService.isUserOlderThan18("miki mouse")); //false (no user)
    }
}

