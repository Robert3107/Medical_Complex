package pl.medicalcomplex.app.model.service.visit;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medicalcomplex.app.model.entity.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {

}
