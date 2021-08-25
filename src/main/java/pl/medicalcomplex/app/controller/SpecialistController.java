package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.Specialist;
import pl.medicalcomplex.app.model.service.specialist.SpecialistImplementationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/specialist")
public class SpecialistController {

    private final SpecialistImplementationService specialistImplementationService;

    @GetMapping("/all")
    public List<Specialist> getAllSpecialist() {
        return specialistImplementationService.getSpecialists();
    }

    @PostMapping("/add")
    public Specialist addSpecialist(@RequestBody Specialist specialist) {
        return specialistImplementationService.createSpecialist(specialist);
    }

    @PostMapping("/delete")
    public ResponseEntity<Specialist> deleteSpecialist(@RequestBody Long id) {
        specialistImplementationService.deleteSpecialistById(id);

        return ResponseEntity.ok().build();
    }


}
