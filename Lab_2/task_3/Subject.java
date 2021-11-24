package task_3;

public class Subject {
    private String name;
    private Mark mark;

    public Subject(final String name, final Mark mark){
        this.name = name;
        this.mark = mark;
    }

    public Subject(final String name){
        this.name = name;
    }

    public void setMark(final Mark mark) { this.mark = mark; }
    public void setName(final String name) { this.name = name; }

    public Mark getMark() { return mark; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "\tSubject: " + name + getMark();
    }
}
