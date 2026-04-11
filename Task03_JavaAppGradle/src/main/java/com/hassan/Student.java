package com.hassan;

public class Student {

    private String name;
    private int rollNumber;
    private double[] grades;

    public Student(String name, int rollNumber, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades.length == 0) return 0;
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public boolean hasPassed() {
        return calculateAverage() >= 60;
    }

    public String getName()     { return name; }
    public int getRollNumber()  { return rollNumber; }
    public double[] getGrades() { return grades; }
}