package pl.medicalcomplex.app.controller;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.VisitOpinion;
import pl.medicalcomplex.app.model.repository.VisitOpinionRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/opinions")
@JsonDeserialize
public class VisitOpinionController {

    private final VisitOpinionRepository visitOpinionRepository;

    @GetMapping("/all")
    private List<VisitOpinion> getAllOpinions() {
        return visitOpinionRepository.findAll();
    }

    @PostMapping("/add")
    private VisitOpinion addOpinion(@RequestBody VisitOpinion visitOpinion) {
        return visitOpinionRepository.save(visitOpinion);
    }

    @GetMapping("/{firstName}/{lastName}")
    private List<VisitOpinion> getSpecialistOpinion(@PathVariable String firstName, @PathVariable String lastName) {
        return visitOpinionRepository.findAllBySpecialist_FirstNameAndSpecialist_LastName(firstName, lastName);
    }

    @PostMapping("/delete/{id}")
    private ResponseEntity<VisitOpinion> deleteOpinion(@PathVariable Long id) {
        visitOpinionRepository.deleteById(id);

        return ResponseEntity.ok().build();
    }
}
