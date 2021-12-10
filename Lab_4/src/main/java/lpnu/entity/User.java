package lpnu.entity;

import lpnu.entity.enumeration.UserRole;

public class User {
    private long id;
    private String name;
    private String email;
    private UserRole role;

    public User(){
    }

    public User(final long id, final String name, final String email, final UserRole role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public long getId(){return this.id;}
    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public UserRole getRole(){return this.role;}
    public void setId(final long id){this.id = id;}
    public void setName(final String name){this.name = name;}
    public void setEmail(final String email){this.email = email;}
    public void setRole(final UserRole role){this.role = role;}

//   @Override
    public String ToString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + "\'" +
                ", email='" + email + "\'" +
                ", role='" + role + "\'" +
                "}";
    }

}
