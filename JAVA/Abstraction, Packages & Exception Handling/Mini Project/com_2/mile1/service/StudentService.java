package com_2.mile1.service;

import com_2.mile1.bean.Student;

public class StudentService {

    // Count students whose marks array is null
    public int findNumberOfNullMarksArray(Student[] data) {

        int count = 0;

        for (Student student : data) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    // Count students whose name is null
    public int findNumberOfNullName(Student[] data) {

        int count = 0;

        for (Student student : data) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }

        return count;
    }

    // Count null student objects
    public int findNumberOfNullObjects(Student[] data) {

        int count = 0;

        for (Student student : data) {
            if (student == null) {
                count++;
            }
        }

        return count;
    }

}