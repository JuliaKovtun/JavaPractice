package task_3;

public class StudentSimple {
    private int id;
    private String name;

    public int getId() { return id; }
    public void setId(final int id) { this.id = id; }
    public void setName(final String name) { this.name = name; }
    public String getName() { return name; }

    public StudentSimple(final int id, final String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + id + " ";
    }
}
