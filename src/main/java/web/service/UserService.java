package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void remove(User user);
    List<User> getUsers();
    void updateUser(User user);
    User getUser(long id);
}

