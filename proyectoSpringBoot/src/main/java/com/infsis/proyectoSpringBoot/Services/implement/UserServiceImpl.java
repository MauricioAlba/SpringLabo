package com.infsis.proyectoSpringBoot.Services.implement;

import com.infsis.proyectoSpringBoot.DTOs.UserDTO;
import com.infsis.proyectoSpringBoot.Models.User;
import com.infsis.proyectoSpringBoot.Services.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public Optional<UserDTO> getUserById(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userID, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {

    }


    private UserDTO UsertoDto(User user){
        UserDTO userDTO = new UserDTO(
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private  User DtoToUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }

}
