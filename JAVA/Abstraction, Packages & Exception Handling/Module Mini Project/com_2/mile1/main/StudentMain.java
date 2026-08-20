package com_2.mile1.main;

import com_2.mile1.bean.Student;
import com_2.mile1.service.StudentReport;
import com_2.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public static void main(String[] args) {

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        // Initializing the student array
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        // Validate and find grades
        for (Student student : data) {

            try {

                String result = report.validate(student);

                if (result.equals("VALID")) {
                    System.out.println(student.getName() + " Grade : " + report.findGrades(student));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        // Display counts
        System.out.println("\nNumber of Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}