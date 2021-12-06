package lpnu.service.impl;
import lpnu.dto.UserDTO;
import lpnu.entity.User;
import lpnu.mapper.UserToUserDTOMapper;
import lpnu.repository.UserRepository;
import lpnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserToUserDTOMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers()
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(long id) {
        return userMapper.toDTO(userRepository.getUserByID(id));
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO){
        final User user = userMapper.toEntity(userDTO);
        userRepository.saveUser(user);
        return userMapper.toDTO(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO){
        return null;
    }

    @Override
    public void deleteUserById(long id) {
        System.out.println("");
    }


}
