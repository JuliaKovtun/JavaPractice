package lpnu.dto;

public class UserDTO {
    private long id;
    private String name;
    private String email;

    public UserDTO(){
    }

    public UserDTO(final long id, final String name, final String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    public long getId(){return this.id;}
    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public void setId(final long id){this.id = id;}
    public void setName(final String name){this.name=name;}
    public void setEmail(final String email){this.email=email;}

    public String ToString(){
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + "\'" +
                ", email='" + email + "\'" +
                "}";
    }

}
