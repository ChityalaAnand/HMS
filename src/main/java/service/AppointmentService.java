package service;

import model.Appointment;
import model.Doctor;
import model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {
    Appointment saveAppointment(Appointment appointment);
    Appointment changeStatusOfAppointmentById(Long id);
    List<Appointment> getAllAppointment();
    Appointment getAppointmentByPatient(Patient patient);
    List<Appointment> getAllAppointmentListByPatient(Patient patient);
    List<Appointment> getAllAppointmentListByDoctor(Doctor doctor);

}
