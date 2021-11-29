package task_3;

public class Main {
    public static void main(final String[] args) {
        final StudentList students = new StudentList();
        final Student s1 = new Student(1, "Ivan", "Olegovych", "Ivanov");
        final Student s2 = new Student(2, "Petro", "Ivanovych", "Ivanov");
        final Student s3 = new Student(3,"Katya", "Petrivna", "Sidorova");

        students.addStudent(s1);
        students.addStudent(s2);
        students.addStudent(s3);

        students.addSubjectToAll("Math");
        s1.addSubject("English");
        s2.addSubject("English");
        s3.addSubject("English");
        s2.addSubject("History");
        s3.addSubject("Art");

        s1.AddMark("Math",3);
        s2.AddMark("Math",5);
        s3.AddMark("Math",3);
        s1.AddMark("English",3);
        s2.AddMark("English",2);
        s2.AddMark("History",5);
        s3.AddMark("English",5);
        s3.AddMark("Art",4);

        System.out.println(Task3.transform(students.getStudents()));
        System.out.println(Task3.getEnglishMarks(students));
        System.out.println(Task3.sortStudents(students.getStudents()));
        System.out.println("The best average mark: " + Task3.bestAverageMark(students.getStudents()));
        System.out.println(Task3.lastNameWithDash(students.getStudents()));
        System.out.println(Task3.removeBadStudents(students.getStudents()));
    }
}
