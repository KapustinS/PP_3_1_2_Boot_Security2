package academy.kata.PP_3_1_2_SECURITY.dao;

import academy.kata.PP_3_1_2_SECURITY.model.Role;
import academy.kata.PP_3_1_2_SECURITY.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User showById(int id);

    void update(User user);

    void delete(int id);

    Optional<User> showByEmail(String email);

    List<Role> getAllAvailableRoles();
}
