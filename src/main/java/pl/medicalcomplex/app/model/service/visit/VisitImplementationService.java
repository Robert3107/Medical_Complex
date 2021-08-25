package pl.medicalcomplex.app.model.service.visit;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medicalcomplex.app.model.entity.Visit;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class VisitImplementationService implements VisitService {

    private final VisitRepository visitRepository;

    @Override
    public List<Visit> getVisits() {
        return visitRepository.findAll();
    }

    @Override
    public Visit createVisit(final Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Optional<Visit> getVisitId(final long id) {
        return visitRepository.findById(id);
    }

    @Override
    public void updateVisit(Visit visit) {
        if (visitRepository.existsById(visit.getId())) {
            visitRepository.save(visit);
        }
    }

    @Override
    public Visit archiveVisit(Visit visit) {
        if (visitRepository.existsById(visit.getId())) {
            visit.setArchive(true);
        }
        return visit;
    }
}
