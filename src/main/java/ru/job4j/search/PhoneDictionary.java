package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        Predicate<Person> phone = (var person) -> (person.getPhone().contains(key));
        Predicate<Person> name = (var person) -> person.getName().contains(key);
        Predicate<Person> address = (var person) -> person.getAddress().contains(key);
        Predicate<Person> surName = (var person) -> person.getSurname().contains(key);
        Predicate<Person> combine = phone.or(address).or(name).or(surName);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}









