package sevices;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Management<User> {

    static List<User> userList = new ArrayList<>();

    static {
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("Dung");
        user1.setPassword("789");
        user1.setRole("Admin");
        userList.add(user1);
    }

    public static User user;

    @Override
    public User finById(long id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return userList.get(i);
            }
        }
        return null;
    }

    @Override
    public void printlist() {
        System.out.printf("%-16s%-26s%-26s%n", "Id:", "User Name:", "Role:");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }

    }

    @Override
    public void updateById(long id, User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.get(i).setPassword(user.getPassword());
                break;
            }
        }
    }

    @Override
    public void add(User user) {
        user.setId(userList.size() + 1);
        user.setRole("User");
        userList.add(user);
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.remove(i);
                break;
            }
        }
    }
    public boolean checkLogin(String username, String password) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username) && userList.get(i).getPassword().equals(password)) {
                user = userList.get(i);
                return true;
            }
        }
        return false;
    }
}
