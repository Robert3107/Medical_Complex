package pl.medicalcomplex.app.model.entity;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "specialists")
@Data
public class Specialist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String firstName;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String lastName;
    @NotNull
    private String specialization;
    @NotNull
    private String numberPWZ;
    @NotNull
    @Size(min = 10)
    @NotBlank(message = "Pole nie może być puste")
    @Column(unique = true)
    private String email;
    @NotNull
    @Size(min = 5)
    @NotBlank(message = "Pole nie może być puste")
    private String password;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String phoneNumber;
    @NotNull
    private String description;

    @OneToMany
    private List<Visit> visits;

    @OneToMany
    private List<VisitOpinion> opinions = new ArrayList<>();

    public void hashPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());

    }

}
