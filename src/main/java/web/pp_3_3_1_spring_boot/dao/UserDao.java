package web.pp_3_3_1_spring_boot.dao;



import web.pp_3_3_1_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(long id, User updateUser);

}
