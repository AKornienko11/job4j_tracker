package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double count = 0;
        double averegSum = 0;
        for (Pupil pupil : pupils) {
            List<Subject> subject = pupil.subjects();
            for (Subject rsl : subject) {
                averegSum += rsl.score();
                count++;
            }
        }
        return averegSum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double count = 0;
            double averageSum = 0;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                averageSum += subject.score();
                count++;
            }
            double averageScore = averageSum / count;
            labels.add(new Label(pupil.name(), averageScore));

        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        int count = 0;
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            count++;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Label label = new Label(key, (double) (map.get(key) / count));
            labels.add(label);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label result = null;
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double averageSum = 0;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                averageSum += subject.score();
            }
            labels.add(new Label(pupil.name(), averageSum));
        }
        double max = labels.get(0).score();
        for (Label rsl : labels) {
            if (rsl.score() >= max) {
                max = rsl.score();
                result = rsl;
            }
        }
        return result;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Label result = null;
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Label label = new Label(key, (double) (map.get(key)));
            labels.add(label);
        }
        double max = labels.get(0).score();
        for (Label rsl : labels) {
            if (rsl.score() >= max) {
                max = rsl.score();
                result = rsl;
            }
        }
        return result;
    }
}

