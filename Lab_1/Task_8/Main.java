package Task_8;

public class Main {
    public static void main(String[] args) {
        final CustomDouble  a = new CustomDouble(2, 1.5);
        final CustomDouble  b = new CustomDouble(1, 1.5);

        System.out.println(a.toDouble());
        final CustomDouble c = a.plus(b);
        final CustomDouble d = a.minus(b);
        System.out.println(c.getI() + "  " + c.getD());
        System.out.println(d.getI() + "  " + d.getD());

        final boolean t = a.moreThan(b);
        System.out.println(t);

        final boolean w = a.lessThan(b);
        System.out.println(w);
    }
}
