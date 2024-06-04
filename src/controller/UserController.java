package controller;

import model.User;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
    public List<UserDto> addUser(User user){
        return userService.addNewUser(user);
    }
    public List<UserDto> updateUser(User user){
        return userService.updateUser(user);
    }
    public List<UserDto> deleteUser(Integer id){
        return userService.deleteUser(id);
    }
}
