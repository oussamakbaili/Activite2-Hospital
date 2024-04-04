package ma.enset.hopital.reposirories;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
