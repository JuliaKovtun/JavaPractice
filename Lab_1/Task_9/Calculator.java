package Task_9;

import Task_8.CustomDouble;

public class Calculator {

    public CustomDouble sum(CustomDouble a, CustomDouble b){
        return a.plus(b);
    }

    public CustomDouble minus(CustomDouble a, CustomDouble b){
        return a.minus(b);
    }

    public double multiply(CustomDouble a, CustomDouble b){
        return a.toDouble() * b.toDouble();
    }

    public double divide(CustomDouble a, CustomDouble b){
        return a.toDouble() / b.toDouble();
    }
}
