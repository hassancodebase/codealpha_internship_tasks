package com.hassan;

public class GradeCalculator {

    public static double findHighest(Student[] students) {
        double highest = 0;
        for (Student s : students) {
            if (s.calculateAverage() > highest)
                highest = s.calculateAverage();
        }
        return highest;
    }

    public static double findLowest(Student[] students) {
        double lowest = 100;
        for (Student s : students) {
            if (s.calculateAverage() < lowest)
                lowest = s.calculateAverage();
        }
        return lowest;
    }

    public static double classAverage(Student[] students) {
        double total = 0;
        for (Student s : students) {
            total += s.calculateAverage();
        }
        return total / students.length;
    }

    public static int countPassed(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.hasPassed()) count++;
        }
        return count;
    }
}