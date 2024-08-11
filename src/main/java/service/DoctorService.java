package service;

import model.Department;
import model.Doctor;
import model.GENDER;
import model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    Doctor saveDoctor(Doctor doctor);
    void deleteDoctor(Doctor doctor);
    Doctor getDoctorById(long id);
    List<Doctor> getAllDoctors();
    List<Doctor> getAllDoctorByGender(Doctor doctor);
    Doctor updateDoctor(Doctor doctor);
    List<Doctor> getAllDoctorByDepartment(Department department);
    Doctor getDoctorByDepartmentAndId(Department department,Long id);
}
