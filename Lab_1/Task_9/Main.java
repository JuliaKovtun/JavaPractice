package Task_9;

import Task_8.CustomDouble;

public class Main {
    public static void main(String[] args) {
        final CustomDouble a = new CustomDouble(1, 2.5);
        final CustomDouble b = new CustomDouble(2, 3.1);

        final Calculator calc = new Calculator();

        final CustomDouble sum = calc.sum(a, b);
        System.out.println(sum.getI() + "  " + sum.getD());

        final CustomDouble minus = calc.minus(a, b);
        System.out.println(minus.getI() + "  " + minus.getD());

        System.out.println(calc.multiply(a, b));

        System.out.println(calc.divide(a, b));
    }
}
