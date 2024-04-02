package web.pp_3_3_1_spring_boot.service;



import java.util.List;

import web.pp_3_3_1_spring_boot.model.User;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(long id, User updateUser);
}
