package task_4;

public class Calculator {
    public static void sum(final int a, final int b){
        System.out.println("sum started");
        System.out.println("a + b = " + (a + b));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("sum finished");
    }

    public static void subtraction(final int a, final int b){
        System.out.println("subtraction started");
        System.out.println("a - b = " + (a - b));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }
        System.out.println("subtraction finished");
    }

    public static void multiplication(final int a, final int b){
        System.out.println("multiplication started");
        System.out.println("a * b = " + (a * b));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("multiplication finished");
    }
}

