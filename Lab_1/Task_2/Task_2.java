package Task_2;

public class Task_2 {
    public static void main(String[] args) {

        final String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            num += array[i].length();
        }
        System.out.println(num);
    }
}
