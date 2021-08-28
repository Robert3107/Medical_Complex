package pl.medicalcomplex.app.model.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "opinions")
public class VisitOpinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String opinion;

    @Range(min = 1, max = 5)
    private int rating;

    @ManyToOne
    private Specialist specialist;

    @ManyToOne
    private User user;

}
