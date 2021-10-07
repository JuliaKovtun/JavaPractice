package Task_9;

import Task_8.CustomDouble;

public class Main {
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(1, 2.5);
        CustomDouble b = new CustomDouble(2, 3.1);

        Calculator calc = new Calculator();

        CustomDouble sum = calc.sum(a, b);
        System.out.println(sum.getI() + "  " + sum.getD());

        CustomDouble minus = calc.minus(a, b);
        System.out.println(minus.getI() + "  " + minus.getD());

        System.out.println(calc.multiply(a, b));

        System.out.println(calc.divide(a, b));
    }
}
