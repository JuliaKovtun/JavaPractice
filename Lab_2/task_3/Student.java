package task_3;

public class Student {
    private String name;
    private Subject subject;

    public Student(final String name, final Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(final Subject subject) { this.subject = subject; }
    public void setName(final String name) { this.name = name; }

    public Subject getSubject() { return subject; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student: " + name + subject;
    }
}
