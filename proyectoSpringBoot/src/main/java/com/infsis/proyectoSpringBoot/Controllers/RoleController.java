package com.infsis.proyectoSpringBoot.Controllers;


import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @GetMapping()
    public ResponseEntity<RoleDTO> getRoles(){
        RoleDTO roleDTO = new RoleDTO("role");
        return ResponseEntity.ok().body(roleDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> getRole(@PathVariable Integer id){
        RoleDTO roleDTO = new RoleDTO("role");
        return ResponseEntity.ok().body(roleDTO);
    }

    @PostMapping()
    public ResponseEntity<RoleDTO> saveRole(@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> updateRole(@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){

    }
}
