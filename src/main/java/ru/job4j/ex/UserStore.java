package ru.job4j.ex;

import java.util.concurrent.atomic.AtomicStampedReference;

public class UserStore {
    public static User findUser(User[] users, String login)
            throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                return users[index];
            }
        }
        throw new UserNotFoundException("Имя пользователя не найдено");
    }

    public static boolean validate(User user)
            throws UserInvalidException {
        if (user.getUsername().length() > 3 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("Пользователь не валидный");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
            System.out.println("This user has an access");
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
