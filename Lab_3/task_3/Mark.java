package task_3;

public class Mark {
    private int value;

    public Mark(final int value){ setValue(value); }
    public int getValue() { return value; }

    void setValue(final int value){
        if (value >= 1 || value <= 5)
            this.value = value;
        else
            System.out.println("Wrong mark");
    }

    @Override
    public String toString() {
        return "\tMark: " + value;
    }

}
