package web.DAO;

import web.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(int id);

    User getUser(int id);

}
