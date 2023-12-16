package ru.job4j;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

/**
 * Класс описывает работу модели для банковской системы.
 * В системе можно производить следующие действия.
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 */

public class BankService {

    /**
     * Хранение данных пользователей банка с привязанными к ним счетами
     * осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход нового пользователя  и добавляет ее в систему.
     * Если встречаются 2 пользователя с одинаковым именем, то идентификация пользователей
     * происходит по паспортным данным.
     *
     * @param user пользователь  который  добавляется в систему
     */

    public void addUser(User user) {

        users.putIfAbsent(user, new ArrayList<Account>());

    }

    /**
     * Метод принимает на вход паспорные данные пользователя  и удаляет  его из системы.
     * Т.к. пользователь индентифицируется по паспортным данным, имя пользователя не ипользуется
     *
     * @param passport данные пользователя  который  удаляется из системы
     */

    public void deleteUser(String passport) {
        users.remove(new User(passport, " "));
    }

    /**
     * Метод принимает на вход паспорные данные и новый счет с рективзитом и балансом
     * и добавляет его к пользователю.
     *
     * @param passport паспортные данные пользователя
     * @param account  новый счет пользователя
     */

    public void addAccount(String passport, Account account) {
        User person = findByPassport(passport);
        if (person != null) {
            List<Account> accounts = getAccounts(person);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод метод ищет пользователя по номеру паспорта
     *
     * @param passport паспортные данные пользователя
     * @return возврвщает пользователя или "null",
     * в зависимости от того есть ли пользователь в системе
     */

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

    /**
     * Метод  ищет  счет пользователя по реквизитам
     *
     * @param passport  паспортные данные пользователя
     * @param requisite реквизит конкретного счета
     * @return возврвщает счет или "null",
     * в зависимости от того есть ли счет с указанными реквизитами у пользователя
     */

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

    /**
     * Метод ищет все счета, которые пренадлежат пользователю.
     *
     * @param user данные пользователя
     * @return возращает список счетов пользователя
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт:
     *
     * @param srcPassport   паспортные данные пользователя, со счета которого переводят средства.
     * @param destPassport  паспортные данные пользователя, на счет которого переводят средства.
     * @param destPassport   реквизиты счета, с которого переводят средства.
     * @param destRequisite реквизиты счета, на который переводят средства.
     * @return возвращает "false" если счёт не найден или не хватает денег на счёте,
     * с которого переводят средства.
     */

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