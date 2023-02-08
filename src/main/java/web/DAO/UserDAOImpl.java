package web.DAO;

import org.springframework.stereotype.Repository;
import web.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = entityManager.createQuery("FROM User", User.class).getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);

    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

}
