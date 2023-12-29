package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment attachments1, Attachment attachments2) {
                return Integer.compare(attachments1.getSize(), attachments2.getSize());
            }
        };

        Arrays.sort(attachments, comparator);
        for (Attachment a : attachments) {
            System.out.println(a);
        }
        System.out.println();

        Comparator<Attachment> comparator1 = (attachment11, attachment22) ->
               attachment11.getName().compareTo(attachment22.getName());

        Arrays.sort(attachments, comparator1);
        for (Attachment a1 : attachments) {
            System.out.println(a1);
        }
        System.out.println();

        Comparator<Attachment> comparator2 = (attachment1, attachment2) ->
        Integer.compare(attachment2.getName().length(), attachment1.getName().length());

        Arrays.sort(attachments, comparator2);
        for (Attachment a2 : attachments) {
            System.out.println(a2);
        }

    }
}
