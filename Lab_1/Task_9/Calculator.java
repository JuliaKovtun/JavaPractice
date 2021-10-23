package Task_9;

import Task_8.CustomDouble;

public class Calculator {

    public CustomDouble sum(final CustomDouble a, final CustomDouble b){
        return a.plus(b);
    }

    public CustomDouble minus(final CustomDouble a, final CustomDouble b){
        return a.minus(b);
    }

    public double multiply(final CustomDouble a, final CustomDouble b){
        return a.toDouble() * b.toDouble();
    }

    public double divide(final CustomDouble a, final CustomDouble b){
        return a.toDouble() / b.toDouble();
    }
}
