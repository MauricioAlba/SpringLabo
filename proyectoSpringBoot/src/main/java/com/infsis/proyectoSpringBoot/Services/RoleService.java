package com.infsis.proyectoSpringBoot.Services;

import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;

import java.util.Optional;

public interface RoleService {

    Optional<RoleDTO> getRoleById(Integer roleId);

    RoleDTO saveRole(RoleDTO roleDTO);

    RoleDTO updateRole(Integer roleId, RoleDTO roleDTO);

    void delete(Integer roleId);
}
