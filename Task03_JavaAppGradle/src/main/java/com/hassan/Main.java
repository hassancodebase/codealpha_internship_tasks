package com.hassan;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ali Hassan",   101, new double[]{85, 90, 78, 92, 88}),
                new Student("Sara Khan",    102, new double[]{72, 68, 75, 80, 70}),
                new Student("Ahmed Raza",   103, new double[]{95, 98, 92, 96, 94}),
                new Student("Fatima Malik", 104, new double[]{55, 60, 58, 52, 65}),
                new Student("Usman Tariq",  105, new double[]{78, 82, 80, 75, 79}),
        };

        System.out.println("========== STUDENT REPORT CARD ==========");
        System.out.printf("%-20s %-6s %-10s %-8s %-8s%n",
                "Name", "Roll", "Average", "Grade", "Status");
        System.out.println("------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-20s %-6d %-10.2f %-8s %-8s%n",
                    s.getName(),
                    s.getRollNumber(),
                    s.calculateAverage(),
                    s.getLetterGrade(),
                    s.hasPassed() ? "PASS" : "FAIL"
            );
        }

        System.out.println("==========================================");
        System.out.printf("  Class Average  : %.2f%%%n",
                GradeCalculator.classAverage(students));
        System.out.printf("  Highest Score  : %.2f%%%n",
                GradeCalculator.findHighest(students));
        System.out.printf("  Lowest Score   : %.2f%%%n",
                GradeCalculator.findLowest(students));
        System.out.printf("  Students Passed: %d / %d%n",
                GradeCalculator.countPassed(students), students.length);
        System.out.println("==========================================");
    }
}