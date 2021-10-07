package Task_8;

public class Main {
    public static void main(String[] args) {
        CustomDouble  a = new CustomDouble(2, 1.5);
        CustomDouble  b = new CustomDouble(1, 1.5);

        System.out.println(a.toDouble());
        CustomDouble c = a.plus(b);
        CustomDouble d = a.minus(b);
        System.out.println(c.getI() + "  " + c.getD());
        System.out.println(d.getI() + "  " + d.getD());

        boolean t = a.moreThan(b);
        System.out.println(t);

        boolean w = a.lessThan(b);
        System.out.println(w);
    }
}
