package task_1;

public class Pupil extends Person{
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return this.school;
    }

    Pupil(String firstName, String lastName, String school) {
        super(firstName, lastName);
        this.school = school;
        System.out.println("Pupil constructor");
    }

    static {
        System.out.println("Pupil static block");
    }

}
