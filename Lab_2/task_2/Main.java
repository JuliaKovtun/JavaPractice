package task_2;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);
        stack.push(13);

        System.out.println("isEmpty: ");
        System.out.println(stack.isEmpty());

        for (Integer value : stack) {
            System.out.print(value + " ");
        }

        stack.pop();
        stack.pop();

        System.out.println("");

        for (Integer value : stack) {
            System.out.print(value + " ");
        }
    }
}
