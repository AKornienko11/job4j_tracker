package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] user, String login) throws UserNotFoundException {
        User rsl = null;
        for (User users : user) {
            if (users.getUserName().equals(login)) {
                rsl = users;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользоатель не найден");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserNotInvalidException {
        if (user.isValid() && (user.getUserName().length() < 3)) {
            throw new UserNotInvalidException("Не валидный пользователь");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        try {
            if (findUser(users, "Petr Arsentev") != null) {
                validate(user);
            }
        } catch (UserNotInvalidException e) {
            System.out.println("Не валидный пользователь");
        } catch (UserNotFoundException e) {
            System.out.println("пользователь не найден");
        }
    }
}
