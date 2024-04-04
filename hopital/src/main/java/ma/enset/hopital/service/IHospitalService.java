package ma.enset.hopital.service;

import ma.enset.hopital.entities.Consultation;
import ma.enset.hopital.entities.Medecin;
import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.entities.RendezVous;

public interface IHospitalService {
    public Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin)  ;
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation SaveConsultation(Consultation consultation);

}
