package com_2.mile1.service;

import com_2.mile1.bean.Student;
import com_2.mile1.exception.NullMarksArrayException;
import com_2.mile1.exception.NullNameException;
import com_2.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // Method to find the grade
    public String findGrades(Student student) {

        int sum = 0;

        for (int mark : student.getMarks()) {

            if (mark < 35) {
                student.setGrade("F");
                return "F";
            }

            sum += mark;
        }

        if (sum < 150) {
            student.setGrade("C");
            return "C";
        } else if (sum < 200) {
            student.setGrade("B");
            return "B";
        } else if (sum < 250) {
            student.setGrade("A");
            return "A";
        } else {
            student.setGrade("A+");
            return "A+";
        }
    }

    // Method to validate the student object
    public String validate(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null) {
            throw new NullStudentObjectException("Student object is null");
        }

        if (student.getName() == null) {
            throw new NullNameException("Student name is null");
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException("Marks array is null");
        }

        return "VALID";
    }

}
