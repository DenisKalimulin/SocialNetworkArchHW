package ru.kalimulin.socialnetwork;

import java.util.List;

public interface UserService {
    User createUser(String username, String email);
    User getUser(String login);
    List<User> getUsers();
}
