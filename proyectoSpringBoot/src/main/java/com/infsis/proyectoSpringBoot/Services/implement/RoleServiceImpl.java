package com.infsis.proyectoSpringBoot.Services.implement;

import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;
import com.infsis.proyectoSpringBoot.Models.Role;
import com.infsis.proyectoSpringBoot.Services.RoleService;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {


    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void delete(Integer roleId) {

    }

    private RoleDTO RoletoDto(Role role){
        RoleDTO roleDTO = new RoleDTO(
                role.getName()
        );

        return roleDTO;
    }


    private Role DtoToRole(RoleDTO roleDTO){
        Role role = new Role();
        role.setName(roleDTO.getName());


        return role;
    }
}
