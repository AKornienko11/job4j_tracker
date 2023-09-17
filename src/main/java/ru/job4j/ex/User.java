package ru.job4j.ex;

public class User {
    private String userName;
    private boolean valid;

    public User(String userName, boolean valid) {
        this.userName = userName;
        this.valid = valid;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isValid() {
        valid = true;
        if ((getUserName() == null) && (userName.length() < 3)) {
            valid = false;
        }
        return valid;
    }
}
