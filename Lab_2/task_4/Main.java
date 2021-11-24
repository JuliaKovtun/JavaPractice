package task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import task_3.Student;
import task_3.Mark;
import task_3.Subject;

public class Main {
    public static void main(String[] args) {
        final StudentList students = new StudentList();
        final Student s1 = new Student(001, "Ivan");
        final Student s2 = new Student(002, "Petr");

        students.addStudent(s1);
        students.addStudent(s2);

        students.addSubjectToAll("Math");
        s2.AddSubject("History");
        s1.AddSubject("English");

        s1.AddMark("Math",4);
        s1.AddMark("English",3);
        s2.AddMark("Math",5);
        s2.AddMark("History",5);


//        students.addStudent(s1);
//        students.addStudent(s2);

        students.printAllStudents();
        System.out.print(students.highestAverageMark());
        System.out.println();

        System.out.print(students.map("Math"));
    }
}
