package pl.medicalcomplex.app.model.service.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medicalcomplex.app.model.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserImplementationService implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(final User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByID(final long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public void updateUser(User user) {
        if (userRepository.existsById(user.getId())){
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUserByID(final long id) {
        userRepository.deleteById(id);
    }

    @Override
    public boolean existByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
