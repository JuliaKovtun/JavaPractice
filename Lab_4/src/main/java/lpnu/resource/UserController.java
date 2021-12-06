package lpnu.resource;

import lpnu.dto.UserDTO;
import lpnu.entity.User;
import lpnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserDTO getUserById(@PathVariable final long id) {
        return userService.getUserById(id);
    }


    @PostMapping("/users")
    public UserDTO saveUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }


    @PutMapping("/users")
    public UserDTO updateUser(@RequestBody UserDTO user) {
        return userService.updateUser(user);
    }


    @DeleteMapping("/users/{id}")
    public ResponseEntity deleteUserById(@PathVariable final long id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

}
