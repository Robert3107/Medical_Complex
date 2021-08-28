package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.Specialist;
import pl.medicalcomplex.app.model.repository.SpecialistRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/specialist")
public class SpecialistController {

    //TODO dodać wskazywanie widoków i ich zwracanie
    private final SpecialistRepository specialistRepository;

    @GetMapping("/all")
    public List<Specialist> getAllSpecialist() {
        return specialistRepository.findAll();
    }

    @PostMapping("/add")
    public Specialist addSpecialist(@RequestBody Specialist specialist) {
        specialist.hashPassword(specialist.getPassword());

        return specialistRepository.save(specialist);
    }

    @PostMapping("/edit")
    public Specialist editSpecialist(@RequestBody Specialist specialist) {
        specialistRepository.findById(specialist.getId());

        return specialistRepository.save(specialist);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Specialist> deleteSpecialist(@PathVariable Long id) {
        specialistRepository.deleteById(id);

        return ResponseEntity.ok().build();
    }


}
