package ru.job4j.stream;

import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users;

    public BankService(Map<User, List<Account>> users) {
        this.users = users;
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().
                filter(k -> k.passport().equals(passport))
                .findFirst()
                .orElse(null);

    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            return accounts.stream()
                    .filter(r -> r.requisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
}