package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.Patient;
import ma.enset.jpa_app.entites.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository extends JpaRepository<Rendezvous,Long> {
}
