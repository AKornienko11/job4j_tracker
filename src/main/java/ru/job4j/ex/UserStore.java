package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] user, String login) throws UserNotFoundException {
        User rsl = null;
        for (int index = 0; index < user.length; index++) {
            if (!String.valueOf(user[index]).equals(login)) {
                throw new UserNotFoundException("пользователь не найден");
            } else {
                rsl = ((user[index]));
            }
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserNotInvalidException {
        boolean result = false;
        if (user.isValid()) {
            result = true;
        }
         if (result) {
             throw new UserNotInvalidException("Не валидный пользователь");
         }
     return result;
}

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");

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
}