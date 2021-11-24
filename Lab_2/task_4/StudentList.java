package task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import task_3.Student;
import task_3.Mark;
import task_3.Subject;


public class StudentList {
    private List<Student> students;

    public StudentList()
    {
        students = new ArrayList<Student>();
    }

    public void addStudent(final Student student){
        students.add(student);
    }

    public void addSubjectToAll(final String subject){
        for(Student student: students){
            student.AddSubject(subject);
        }
    }

    public void printAllStudents(){
        for(final Student student : students){
            System.out.println(student.toString());
        }
    }

//    Повертає найкращого студента
    public Student highestAverageMark()
    {
        Student best_student = null;

        if(students.size()>0) {
            best_student = students.get(0);
            for (final Student student : students) {
                if(best_student.AverageValueAllSubject() < student.AverageValueAllSubject())
                {
                    best_student = student;
                }
            }
        }
        return best_student;
    }

//    Map де ключем буде унікальний ідентифікатор, а значенням
//- оцінки із заданого предмету
    public Map<Integer, Mark> map(final String subject_name)
    {
        final Map<Integer, Mark> result = new HashMap<>();
        Subject subject = null;

        for (final Student student : students) {
            subject = student.findSubject(subject_name);
            if(subject!= null) {
                result.put(student.getId(), subject.getMark());
            }
        }
        return result;
    }


}
