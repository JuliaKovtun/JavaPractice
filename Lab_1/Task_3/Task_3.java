package Task_3;

public class Task_3 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] array2 = {'H', 'e', 'l', 'l', 'o'};

        String mixedStr = "";
        String tmp;

        for(int j = 0; j < array1.length && j < array2.length; j++){
            tmp = Integer.toString(array1[j]) + Character.toString(array2[j]);
            mixedStr = mixedStr.concat(tmp);
        }
        System.out.println(mixedStr);
    }
}
