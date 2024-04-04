package ma.enset.hopital.service;

import jakarta.transaction.Transactional;
import ma.enset.hopital.entities.Consultation;
import ma.enset.hopital.entities.Medecin;
import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.entities.RendezVous;
import ma.enset.hopital.reposirories.ConsultationRepository;
import ma.enset.hopital.reposirories.MedecinRepository;
import ma.enset.hopital.reposirories.PatientRepository;
import ma.enset.hopital.reposirories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository,
                               MedecinRepository medecinRepository,
                               RendezVousRepository rendezVousRepository,
                               ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;

    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation SaveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
