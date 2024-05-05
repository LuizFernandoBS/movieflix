package com.devsuperior.movieflix.dtos;

import com.devsuperior.movieflix.entities.Role;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RoleDTO implements Serializable {

    private Long id;
    private String authority;

    private Set<UserDTO> usersDTO = new HashSet<>();

    public RoleDTO() {
    }

    public RoleDTO(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public RoleDTO(Role role) {
        this(role.getId(), role.getAuthority());
    }

    public RoleDTO(Role role, Set<UserDTO> usersDTO) {
        this(role);
        usersDTO.forEach(userDTO -> this.getUsersDTO().add(userDTO));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Set<UserDTO> getUsersDTO() {
        return usersDTO;
    }
}
