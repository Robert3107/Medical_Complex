package pl.medicalcomplex.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medicalcomplex.app.model.entity.VisitOpinion;

import java.util.List;

public interface VisitOpinionRepository extends JpaRepository<VisitOpinion, Long> {
    List<VisitOpinion> findAllBySpecialist_FirstNameAndSpecialist_LastName(String firstName, String lastName);
}
