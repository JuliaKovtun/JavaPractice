package Task_7;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;

        return firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                age == user.age &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return 17 * this.getAge() +
                17 * this.getFirstName().hashCode() +
                17 * this.getLastName().hashCode() +
                17 * this.getEmail().hashCode();
    }
}
