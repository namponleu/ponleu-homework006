package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final List<User> userList = new ArrayList<>(
            List.of(
                    new User(1,"alice","alice1232@gmail.com"),
                    new User(2,"william","wiliam123@gmail.com")
            )
    );
    @Override
    public void addNewUser(User user) {
        userList.add(user);
    }

    @Override
    public void updateUser(User user) {
        userList.stream()
                .filter(user1 ->user1.getId().equals(user.getId()))
                .findFirst()
                .ifPresentOrElse(user1 -> {
                    user1.setName(user.getName());
                    user1.setEmail(user.getEmail());
                },
                        () -> System.out.println("Could not found the user " + user.getId())
                );
    }

    @Override
    public void deleteUser(Integer id) {
        userList.removeIf(e -> e.getId().equals(id));
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
