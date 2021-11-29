package task_1;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private String email;

    public User(final String firstName, final String lastName,
                final int age, final Address address,
                final String email) {
        try{
            validate(firstName, lastName, age, address, email);
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
            this.email = email;
        }catch(UncheckedException e) {
            System.out.println(e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
        }

    }

    public void setLastName(final String lastName) { this.lastName = lastName; }
    public String getLastName(){ return this.lastName; }
    public void setFirstName(final String firstName) { this.firstName = firstName; }
    public String getFirstName(){ return this.firstName; }
    public void setAge(final int age) { this.age = age; }
    public int getAge(){return this.age; }
    public void setAddress(final Address address) { this.address = address; }
    public Address getAddress(){ return this.address; }
    public void setEmail(final String email) { this.email = email; }
    public String getEmail(){ return this.email; }



    public void validate(final String firstName, final String lastName,
                         final int age, final Address address,
                         final String email) throws UncheckedException {
        boolean valid = true;
        if(firstName == ""){
            valid = false;
            throw new UncheckedException("First name is empty", StatusCode.ERROR_500);
        }
        if(lastName == ""){
            valid = false;
            throw new UncheckedException("Last name is empty", StatusCode.ERROR_500);
        }
        if(age < 0 || age == 0 || age > 100){
            valid = false;
            throw new UncheckedException("Wrong age", StatusCode.ERROR_500);
        }
        if(address.getAddress() == ""){
            valid = false;
            throw new UncheckedException("Address is empty", StatusCode.ERROR_500);
        }
        if(email == ""){
            valid = false;
            throw new UncheckedException("Email is empty", StatusCode.ERROR_500);
        }
    }

}
