package service;

import model.GENDER;
import model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    Patient savePatient(Patient patient);
    void deletePatient(Patient patient);
    Patient getPatientById(long id);
    List<Patient> getAllPatients();
    List<Patient> getAllPatientByGender(GENDER gender);
    Patient updatePatient(Patient patient);

}
