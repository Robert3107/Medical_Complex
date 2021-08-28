package pl.medicalcomplex.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medicalcomplex.app.model.entity.Specialist;

import java.util.List;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {

    List<Specialist> findSpecialistBySpecialization(String specialization);

    Specialist findSpecialistById(long id);

    Specialist findSpecialistByFirstNameAndLastName(String firstName, String lastName);

}
