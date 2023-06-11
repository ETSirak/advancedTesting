package com.example.user;


import java.util.ArrayList;
import java.util.List;

    public class UserRepository {
        private List<User> users;

        public UserRepository() {
            users = new ArrayList<>();
        }

        public void addUser(User user) {
            users.add(user);
        }

        public User findByUsername(String username) {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    return user;
                }
            }
            return null;
        }
}
