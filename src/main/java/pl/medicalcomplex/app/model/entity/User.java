package pl.medicalcomplex.app.model.entity;

import lombok.Data;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String firstName;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String lastName;
    @Column(unique = true)
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String email;
    @NotNull
    @Size(min = 5)
    @NotBlank(message = "Pole nie może być puste")
    private String password;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String phoneNumber;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String pesel;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String address;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String postalCode;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String city;

    @ManyToMany
    private Set<Role> roles;

    @OneToMany
    private List<Visit> visits;

    @OneToMany
    private List<VisitOpinion> opinions = new ArrayList<>();

    public void hashPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());

    }
}
