package lpnu.repository;
import lpnu.entity.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return user;
    }

    public User updateUser(User user){
        final User savedUser = getUserByID(user.getId());

        savedUser.setName(user.getName());
        savedUser.setEmail(user.getEmail());
        savedUser.setRole(user.getRole());
        return savedUser;
    }

    public void deleteUserById(long id) {
        users = users.stream()
                .filter(e -> e.getId() != id)
                .collect(Collectors.toList());

    }

}
