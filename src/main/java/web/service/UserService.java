package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(int id);

    User getUser(int id);
}
