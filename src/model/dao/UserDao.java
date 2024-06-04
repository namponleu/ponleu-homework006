package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUsers();
}
