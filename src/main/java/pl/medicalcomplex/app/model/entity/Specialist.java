package pl.medicalcomplex.app.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Size(min = 10)
    private String description;
    private String opinion;

}
