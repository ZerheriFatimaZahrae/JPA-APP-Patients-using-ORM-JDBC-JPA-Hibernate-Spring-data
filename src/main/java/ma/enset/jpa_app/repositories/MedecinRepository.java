package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.Medecin;
import ma.enset.jpa_app.entites.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
