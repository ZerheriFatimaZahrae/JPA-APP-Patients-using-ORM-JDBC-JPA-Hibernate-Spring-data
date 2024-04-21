package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.Role;
import ma.enset.jpa_app.entites.User;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByRoleName(String name);
    Role findById(Long id);

}
