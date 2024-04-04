package ma.enset.hopital.reposirories;

import ma.enset.hopital.entities.Consultation;
import ma.enset.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
