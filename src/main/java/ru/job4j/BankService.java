package ru.job4j;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {

        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User person = findByPassport(passport);
        List<Account> personal = getAccounts(person);
        if (personal != null) {
            if (!personal.contains(account)) {
                personal.add(account);
            }
        }
        users.put(person, personal);
    }

    public User findByPassport(String passport) {
        User person = null;
        for (User rsl : users.keySet()) {
            if (rsl.getPassport().equals(passport)) {
                person = rsl;
                break;
            }
        }
        return person;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account findRequisite = null;
        List<Account> persons = getAccounts(findByPassport(passport));
        if (persons != null) {
            for (Account rsl : persons) {
                if (rsl.getRequisite().equals(requisite)) {
                    findRequisite = rsl;
                    break;
                }

            }
        }
        return findRequisite;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account req1 = findByRequisite(srcPassport, srcRequisite);
        Account req2 = findByRequisite(destPassport, destRequisite);
        if (req1 != null && req2 != null) {
            if (req1.getBalance() >= amount) {
                req1.setBalance(req1.getBalance() - amount);
                req2.setBalance(req2.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}