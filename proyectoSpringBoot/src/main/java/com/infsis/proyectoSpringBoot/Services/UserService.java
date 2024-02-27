package com.infsis.proyectoSpringBoot.Services;

import com.infsis.proyectoSpringBoot.Controllers.UserController;
import com.infsis.proyectoSpringBoot.DTOs.UserDTO;

import java.util.Optional;

public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);

    UserDTO updateUser(Integer userID, UserDTO userDTO);

    void delete(Integer userId);

}
