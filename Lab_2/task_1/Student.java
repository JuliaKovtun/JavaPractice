package task_1;

public class Student extends Pupil{
    private String university;

    public void setUniversity(String university) {
        this.university = university;
    }
    public String getUniversity() {
        return this.university;
    }

    Student(String firstName, String lastName, String school, String university) {
        super(firstName, lastName, school);
        this.university = university;
        System.out.println("Student constructor");
    }
    static {
        System.out.println("Student static block");
    }
}
