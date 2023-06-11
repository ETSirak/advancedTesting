package com.example.userTest;

/*
import com.example.user.User;
import com.example.user.UserRepository;
import com.example.user.UserService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        System.out.println("Is Miki Mouse older than 18? " + userService.isUserOlderThan18("Miki Mouse")); //false (no user)


        public void testFindUsersOlderThan18_returnSuccessfully(){
            //given
            User testUser = new User("ABC", 19);
            User testUser2 = new User("DEF", 21);
            User testUser3 = new User("GHI", 9);

            when(userRepository.findAll()).thenReturn(List.of(testUser, testUser2, testUser3));
            UserService userService1 = new UserService(userRepository);
//when
            List<User> olderThan18 = userService1.findUsersOlderThan18();

            //then
            assert olderThan18.size() > 0;
            assert olderThan18.size() == 2;
            verify(userRepository).findAll();
        }


    }}*/
