package web.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import web.entity.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAOImpl implements UserDAO {

//    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
