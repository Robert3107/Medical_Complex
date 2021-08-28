package pl.medicalcomplex.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medicalcomplex.app.model.entity.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    List<Visit> findVisitsByEndVisitIsTrue();

    Visit findVisitByEndVisitIsTrueAndIdEquals(Long id);
}
