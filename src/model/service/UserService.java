package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
//    void addUser(UserDto userDto);
//    void updateUser(UserDto userDto);
    List<UserDto> addNewUser(User user);
    List<UserDto> updateUser(User user);
    List<UserDto> deleteUser(Integer id);

}
