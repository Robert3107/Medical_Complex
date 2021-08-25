package pl.medicalcomplex.app.model.service.visit;

import pl.medicalcomplex.app.model.entity.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitService {

    List<Visit> getVisits();

    Visit createVisit(Visit visit);

    Optional<Visit> getVisitId(long id);

    void updateVisit(Visit visit);

    Visit archiveVisit(Visit visit);

}
