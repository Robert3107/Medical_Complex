package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.Visit;
import pl.medicalcomplex.app.model.repository.VisitRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visits")
public class VisitController {

    private final VisitRepository visitRepository;

    @GetMapping("/all")
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    @PostMapping("/add")
    public Visit addVisit(@RequestBody Visit visit) {
        return visitRepository.save(visit);
    }

    @PostMapping("/edit")
    public Visit editVisit(@RequestBody Visit visit) {
        visitRepository.findById(visit.getId());

        return visitRepository.save(visit);
    }

    @PostMapping("/closeVisit/{id}")
    public Visit archiveVisit(@PathVariable Long id) {
        Visit visit = visitRepository.findById(id).get();
        visit.setEndVisit(true);
        return visitRepository.save(visit);

    }

}
