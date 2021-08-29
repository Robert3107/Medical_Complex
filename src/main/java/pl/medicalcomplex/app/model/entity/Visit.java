package pl.medicalcomplex.app.model.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "visits")
@Data
public class Visit {

    //TODO encje "placówka"

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Specialist specialist;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate visitDate;
    @NotNull
    private LocalTime visitTime;
    @NotNull
    private String outpost;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String postalCode;
    @NotNull
    private String visitCost;
    private boolean endVisit = false;

}
