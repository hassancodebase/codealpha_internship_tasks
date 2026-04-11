package com.hassan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCalculateAverage() {
        Student s = new Student("Test", 1, new double[]{80, 90, 70});
        assertEquals(80.0, s.calculateAverage(), 0.01);
    }

    @Test
    void testLetterGradeA() {
        Student s = new Student("Test", 1, new double[]{95, 92, 98});
        assertEquals("A", s.getLetterGrade());
    }

    @Test
    void testLetterGradeF() {
        Student s = new Student("Test", 1, new double[]{40, 50, 45});
        assertEquals("F", s.getLetterGrade());
    }

    @Test
    void testHasPassed() {
        Student pass = new Student("Pass", 1, new double[]{70, 80, 75});
        Student fail = new Student("Fail", 1, new double[]{40, 50, 45});
        assertTrue(pass.hasPassed());
        assertFalse(fail.hasPassed());
    }

    @Test
    void testClassAverage() {
        Student[] students = {
                new Student("A", 1, new double[]{80, 80}),
                new Student("B", 2, new double[]{60, 60}),
        };
        assertEquals(70.0, GradeCalculator.classAverage(students), 0.01);
    }
}