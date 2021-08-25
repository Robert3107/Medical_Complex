package pl.medicalcomplex.app.model.service.specialist;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medicalcomplex.app.model.entity.Specialist;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class SpecialistImplementationService implements SpecialistService {

    private final SpecialistRepository specialistRepository;

    @Override
    public List<Specialist> getSpecialists() {
        return specialistRepository.findAll();
    }

    @Override
    public Specialist createSpecialist(Specialist specialist) {
       return specialistRepository.save(specialist);
    }

    @Override
    public Optional<Specialist> getSpecialistById(long id) {
        return specialistRepository.findById(id);
    }

    @Override
    public void updateSpecialist(Specialist specialist) {
        if (specialistRepository.existsById(specialist.getId())) {
            specialistRepository.save(specialist);
        }
    }

    @Override
    public void deleteSpecialistById(long id) {
        specialistRepository.deleteById(id);
    }

    @Override
    public List<Specialist> findSpecialistBySpecialization(String specialization) {
        return specialistRepository.findSpecialistBySpecialization(specialization);
    }
}
