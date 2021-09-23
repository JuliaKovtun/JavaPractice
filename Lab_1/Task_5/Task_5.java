package Task_5;

public class Task_5 {
    public static void main(String[] args) {

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("Не транспонована матриця:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr = new int[2][3];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {
                arr[j][i] = array[i][j];
            }
        }

        System.out.println("Транспонована матриця:");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
