package com.devsuperior.movieflix.dtos;
import com.devsuperior.movieflix.entities.User;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserDTO implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String password;

    private Set<ReviewDTO> reviewsDTO = new HashSet<>();

    private Set<RoleDTO> rolesDTO = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDTO(User user) {
        this(user.getId(), user.getName(), user.getEmail(),
                user.getPassword());
    }

    public UserDTO(User user, Set<ReviewDTO> reviewsDTO, Set<RoleDTO> rolesDTO) {
        this(user);
        reviewsDTO.forEach(reviewDTO -> this.getReviewsDTO().add(reviewDTO));
        rolesDTO.forEach(roleDTO -> this.getRolesDTO().add(roleDTO));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<ReviewDTO> getReviewsDTO() {
        return reviewsDTO;
    }

    public Set<RoleDTO> getRolesDTO() {
        return rolesDTO;
    }
}
