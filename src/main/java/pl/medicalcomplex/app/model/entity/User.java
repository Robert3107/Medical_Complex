package pl.medicalcomplex.app.model.entity;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
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
    private Long PESEL;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String address;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String postalCode;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPESEL() {
        return PESEL;
    }

    public void setPESEL(Long PESEL) {
        this.PESEL = PESEL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
