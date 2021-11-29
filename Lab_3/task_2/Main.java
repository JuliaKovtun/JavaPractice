package task_2;
import java.io.IOException;

public class Main {
    public static void main(final String[] args) {
        try (File file = new File()) {
            file.readlines();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
