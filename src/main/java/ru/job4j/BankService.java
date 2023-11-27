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
        users.remove(new User(passport, " "));
    }

    public void addAccount(String passport, Account account) {
        User person = findByPassport(passport);
        if (person != null) {
            List<Account> accounts = getAccounts(person);
            if (findByRequisite(person.getPassport(), account.getRequisite()) == null) {
                accounts.add(account);
            }
        }
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
        if (getAccounts(findByPassport(passport)) != null) {
            for (Account rsl : getAccounts(findByPassport(passport))) {
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
        Account srcReq = findByRequisite(srcPassport, srcRequisite);
        Account destReq = findByRequisite(destPassport, destRequisite);
        if (srcReq != null && destReq != null) {
            if (srcReq.getBalance() >= amount) {
                srcReq.setBalance(srcReq.getBalance() - amount);
                destReq.setBalance(destReq.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}