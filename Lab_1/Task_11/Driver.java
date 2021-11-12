package Task_11;

public class Driver extends Person{
    private String carId;

    Driver(String id, String name, String carId) {
        super(id, name);
        this.carId = carId;
    }

    public void setCarId(String workingId) {
        this.carId = carId;
    }
    public String getCarId() {
        return this.carId;
    }


}
