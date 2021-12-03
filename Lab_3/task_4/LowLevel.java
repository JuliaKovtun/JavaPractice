package task_4;

public class LowLevel {
    public static void main(final String[] args) {

        SimpleThread1 simpleThread1 = new SimpleThread1();
        SimpleThread2 simpleThread2 = new SimpleThread2();
        SimpleThread3 simpleThread3 = new SimpleThread3();

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();
    }

    public static class SimpleThread1 extends Thread{
        @Override
        public void run() {
            Calculator.sum(2,4);
        }
    }

    public static class SimpleThread2 extends Thread{
        @Override
        public void run() {
            Calculator.subtraction(4,1);
        }
    }

    public static class SimpleThread3 extends Thread{
        @Override
        public void run() {
            Calculator.multiplication(2,4);
        }
    }
}