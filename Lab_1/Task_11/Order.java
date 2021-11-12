package Task_11;

public class Order {
    private String id;
    private String customerId;
    private String carName;
    private String address;
    private String driverId;

    Order(String id, String customerId, String carName, String address, String driverId) {
        this.id = id;
        this.customerId = customerId;
        this.carName = carName;
        this.address = address;
        this.driverId = driverId;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerId() {
        return this.customerId;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getCarName() {
        return this.carName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
    public String getDriverId() {
        return this.driverId;
    }
    public int hashCode() {
        return this.id.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof Car)) {
            return false;
        } else {
            Order other = (Order)obj;
            if (this.hashCode() != other.hashCode()) {
                return false;
            } else {
                return this.id.equals(other.id);
            }
        }
    }
}
