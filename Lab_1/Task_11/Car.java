package Task_11;

public class Car {
    private String id;
    private String name;

    Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
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
            Car other = (Car)obj;
            if (this.hashCode() != other.hashCode()) {
                return false;
            } else {
                return this.id.equals(other.id);
            }
        }
    }
}
