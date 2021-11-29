package task_3;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    // transforms students list into studentsSimple list
    public static List<StudentSimple> transform(final List<Student> students) {
        return students.stream()
                .map(student -> new StudentSimple(student.getId(), student.getFirstName()))
                .collect(Collectors.toList());
    }

    // removes students from the list, whose average mark < 3
    public static List<Student> removeBadStudents(final List<Student> students) {
        return students.stream()
                .filter(student -> student.averageValueAllSubject() > 3)
                .collect(Collectors.toList());
    }

    // returns List of English marks without repetition
    public static List<Mark> getEnglishMarks(final StudentList students){
        Collection<Mark> values = students.to_m("English").values();
        return values.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // returns sorted list by name
    public static List<Student> sortStudents(final List<Student> students) {
        return students.stream()
                .sorted((o1, o2) -> {
                    if (o1.getLastName() != o2.getLastName()) {
                        return o1.getLastName().compareTo(o2.getLastName());
                    }else if (o1.getFirstName() != o2.getFirstName()) {
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }else return o1.getMiddleName().compareTo(o2.getMiddleName());
                }).collect(Collectors.toList());
    }

    // returns best average mark
    public static double bestAverageMark(final List<Student> students){
        return students.stream()
                .map(student -> student.averageValueAllSubject())
                .max((i, j) -> i.compareTo(j))
                .get();
    }

    // returns last names with dash
    public static String lastNameWithDash(final List<Student> students){
       return students.stream()
               .map(student -> student.getLastName())
               .collect(Collectors.joining("-"));
    }

}
