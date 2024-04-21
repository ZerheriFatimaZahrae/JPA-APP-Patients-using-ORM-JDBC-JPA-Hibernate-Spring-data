package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findUserByUsername(String username);
}
