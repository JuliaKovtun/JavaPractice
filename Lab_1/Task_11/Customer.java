package Task_11;

public class Customer extends Person{
    private String phone;

    Customer(String id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }
}
