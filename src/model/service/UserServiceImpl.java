package model.service;

import mapper.Mapper;
import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }

    @Override
    public List<UserDto> addNewUser(User user) {
        userDao.addNewUser(user);
        return List.of();

    }

    @Override
    public List<UserDto> updateUser(User user) {
        userDao.updateUser(user);
        return List.of();
    }

    @Override
    public List<UserDto> deleteUser(Integer id) {
        userDao.deleteUser(id);
        return List.of();
    }


//    @Override
//    public void addUser(UserDto userDto) {
//        userDao.addNewUser(
//                new User(4,"cat","cat23@gmail.com")
//        );
//    }
//
//    @Override
//    public void updateUser(UserDto userDto) {
//        userDao.updateUser(
//                new User(1,"Jacky", "jacky2342@gmail.com")
//        );
//    }
}
