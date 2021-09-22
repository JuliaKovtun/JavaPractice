package Task_4;

public class Task_4 {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print("\tFizzBuzz");
                continue;
            }
            if(i%3 == 0){
                System.out.print("\tFizz");
                continue;
            }
            if(i%5 == 0){
                System.out.print("\tBuzz");
                continue;
            }
            System.out.print("\t" + i);
        }
    }
}
