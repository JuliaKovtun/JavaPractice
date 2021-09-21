package Task_1;

public class Task_1
{
    public static void main(String[] args){
        final String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String tmp;

        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j].length() > array[j+1].length()){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
