package view;

import controller.UserController;
import model.User;
import model.dao.UserDao;
import model.dto.UserDto;

public class View {
    private static final UserController userController = new UserController();
    public static void UI(){
        System.out.println("=".repeat(60));
        System.out.println("\t".repeat(6) + "View");
        System.out.println("=".repeat(60));
        System.out.println("Default data");
        userController.getAllUsers()
                .forEach(System.out::println);
        System.out.println("=".repeat(60));

        System.out.println("add new user");
        userController.addUser(
                new User(4,"Jacky","Jacky23@gmail.com")
        ).forEach(System.out::println);

        System.out.println("update user");
        userController.updateUser(
                new User(1,"Jacky","Jacky23@gmail.com")
        ).forEach(System.out::println);

        System.out.println("delete user");
        userController.deleteUser(2).forEach(System.out::println);
    }
}
