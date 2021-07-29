package pl.medicalcomplex.app.model.service.visit;

import pl.medicalcomplex.app.model.entity.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitService {

    List<Visit> getVisits();

    void createVisit(Visit visit);

    Optional<Visit> getVisitId(long id);

    void updateVisit(Visit visit);

    void archiveVisit(Visit visit);

}
