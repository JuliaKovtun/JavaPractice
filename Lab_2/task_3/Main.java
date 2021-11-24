package task_3;

public class Main {
    public static void main(String[] args) {
        final Student stud1 = new Student(001, "Sasha", new Subject("math", new Mark(3)));
        System.out.println(stud1);
    }
}
