package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.Consultation;
import ma.enset.jpa_app.entites.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
