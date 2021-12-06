package lpnu.repository;
import lpnu.entity.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> users = new ArrayList<>();
    private long id = 1;

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByID(long id) {
        return users.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public User saveUser(User user){
        user.setId(id);
        id++;
        users.add(user);
        System.out.println("");
        return user;
    }

    public User updateUser(User user){
        return null;
    }

    public void deleteUserById(long id) {
        System.out.println("");
    }

}
