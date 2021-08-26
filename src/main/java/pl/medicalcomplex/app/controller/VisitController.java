package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.Visit;
import pl.medicalcomplex.app.model.service.visit.VisitImplementationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visits")
public class VisitController {

    private final VisitImplementationService visitImplementationService;

    @GetMapping("/all")
    public List<Visit> getAllVisits() {
        return visitImplementationService.getVisits();
    }

    @PostMapping("/add")
    public Visit addVisit(@RequestBody Visit visit) {
        return visitImplementationService.createVisit(visit);
    }

    @PostMapping("/archive")
    public Visit archiveVisit(@RequestBody Visit visit) {
        return visitImplementationService.archiveVisit(visit);

    }

}
