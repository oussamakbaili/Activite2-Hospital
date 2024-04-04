package ma.enset.hopital.reposirories;

import ma.enset.hopital.entities.Medecin;
import ma.enset.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String Name);
}
