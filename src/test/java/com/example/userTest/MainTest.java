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
        userRepository.addUser(new User("Alice", 20));
        userRepository.addUser(new User("Bob", 17));

        // Test if user is older or younger than 18
        System.out.println("Is Alice older than 18? " + userService.isUserOlderThan18("Alice")); //true
        System.out.println("Is Bob older than 18? " + userService.isUserOlderThan18("Bob")); //false
        System.out.println("Is Charlie older than 18? " + userService.isUserOlderThan18("Charlie")); //false (no user)
    }
}

