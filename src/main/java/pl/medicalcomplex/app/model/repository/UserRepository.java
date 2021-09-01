package pl.medicalcomplex.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalcomplex.app.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByFirstName(String firstName);

    User findByEmail(String email);
}
