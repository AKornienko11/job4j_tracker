package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student learner = new Student();
        learner.setName(" Kornienko A.A.");
        learner.setGroup(" intern ");
        learner.setBeginning(new Date(1682845200000L));
        System.out.println(learner.getName() + learner.getGroup() + learner.getBeginning());
    }
}
