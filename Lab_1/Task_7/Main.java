package Task_7;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Ivan");
        user.setLastName("Ivanov");
        user.setAge(25);
        user.setEmail("ivanov@gmail.com");

        System.out.println("Your name is " + user.getFirstName() + " " + user.getLastName());
        System.out.println("You are " + user.getAge() + " years old. Your email is " + user.getEmail());

        final User user2 = new User();
        System.out.println(user.equals(user2));
    }

}
