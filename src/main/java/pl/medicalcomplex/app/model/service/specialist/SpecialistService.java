package pl.medicalcomplex.app.model.service.specialist;

import pl.medicalcomplex.app.model.entity.Specialist;

import java.util.List;
import java.util.Optional;

public interface SpecialistService {

    List<Specialist> getSpecialists();

    Specialist createSpecialist(Specialist specialist);

    Optional<Specialist> getSpecialistById(long id);

    void updateSpecialist(Specialist specialist);

    void deleteSpecialistById(long id);

    List<Specialist> findSpecialistBySpecialization(String specialization);
}
