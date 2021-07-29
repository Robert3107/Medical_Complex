package pl.medicalcomplex.app.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "visits")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostaCode() {
        return postaCode;
    }

    public void setPostaCode(String postaCode) {
        this.postaCode = postaCode;
    }

    public String getVisitCost() {
        return visitCost;
    }

    public void setVisitCost(String visitCost) {
        this.visitCost = visitCost;
    }

    public boolean isArchive() {
        return isArchive;
    }

    public void setArchive(boolean archive) {
        isArchive = archive;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }
}
