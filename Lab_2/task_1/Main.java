package task_1;

public class Main {

    public static void main(String[] args) {

        Student student_1 = new Student("Yuliia", "Kovtun", "School #4", "LPNU");
        System.out.println("First Student: " + student_1.getFirstName() + "\t" + student_1.getLastName()
                + "\t" + student_1.getSchool() + "\t" + student_1.getUniversity());
    }
}
