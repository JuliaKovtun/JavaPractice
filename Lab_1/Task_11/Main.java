package Task_11;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("12", "Renault");
        Driver driver1 = new Driver("27", "Bob Armstrong", "12");
        Customer customer1 = new Customer("35", "Oleh", "380500676320");
        Order order1 = new Order("001", "35", "Renault", "Zelena 1, Lviv", "27");

        System.out.println("Order: " + order1.getId() + "\nCustomerId: " + order1.getCustomerId() +
                            "\nCar name: " + order1.getCarName() + "\nAddress: " + order1.getAddress() +
                            "\nDriverId: " + order1.getDriverId());
    }
}
