package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.User;
import pl.medicalcomplex.app.model.entity.VisitOpinion;
import pl.medicalcomplex.app.model.repository.UserRepository;
import pl.medicalcomplex.app.model.repository.VisitOpinionRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final VisitOpinionRepository visitOpinionRepository;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/register")
    public User addUser(@RequestBody User user) {
        user.hashPassword(user.getPassword());
        return userRepository.save(user);
    }

    @PostMapping("/edit")
    public User editUser(@RequestBody User user) {
        userRepository.findById(user.getId());

        return userRepository.save(user);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/opinions/{id}")
    public List<VisitOpinion> opinionList(@PathVariable Long id){
        return visitOpinionRepository.findAllByUserId(id);
    }
}
