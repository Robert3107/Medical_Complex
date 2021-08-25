package pl.medicalcomplex.app.model.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "visits")
@Data
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private LocalDate visitDate;
    @DateTimeFormat(pattern = "h:mm")
    private LocalTime visitTime;
    private String address;
    private String city;
    private String postaCode;
    private String visitCost;
    private boolean isArchive = false;
    @OneToOne
    private User user;
    @OneToOne
    private Specialist specialist;

}
