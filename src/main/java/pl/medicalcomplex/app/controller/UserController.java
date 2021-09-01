package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.User;
import pl.medicalcomplex.app.model.repository.UserRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

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
}
