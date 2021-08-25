package pl.medicalcomplex.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.medicalcomplex.app.model.entity.User;
import pl.medicalcomplex.app.model.service.user.UserImplementationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserImplementationService userImplementationService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userImplementationService.getUsers();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userImplementationService.createUser(user);
    }

    @PostMapping("/delete")
    public ResponseEntity<User> deleteUser(@RequestBody Long id) {
        userImplementationService.deleteUserByID(id);

        return ResponseEntity.ok().build();
    }
}
