package task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentList {
    private List<Student> students;

    public StudentList()
    {
        students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(final Student student){ students.add(student); }

//      Додає предмет всім студентам
    public void addSubjectToAll(final String subject){
        for(Student student: students){
            student.addSubject(subject);
        }
    }

    public void printAllStudents(){
        for(final Student student : students){
            System.out.println(student.toString());
        }
    }

//    Повертає студента з найвищим середнім балом
    public Student highestAverageMark() {
        Student best_student = null;
        if(students.size()>0) {
            best_student = students.get(0);
            for (final Student student : students) {
                if(best_student.averageValueAllSubject() < student.averageValueAllSubject()) {
                    best_student = student;
                }
            }
        }
        return best_student;
    }

//    Map де ключем буде унікальний ідентифікатор, а значенням
//- оцінки із заданого предмету
    public Map<Integer, Mark> to_m(final String subject_name) {
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
