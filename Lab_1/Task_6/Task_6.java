package Task_6;

public class Task_6 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{5, 6}, {7, 8}};

        int[][] multArr = new int[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    multArr[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for(int i = 0; i < multArr.length; i++){
            for(int j = 0; j < multArr[i].length; j++){
                System.out.print(multArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
