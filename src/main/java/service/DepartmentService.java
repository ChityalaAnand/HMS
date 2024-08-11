package service;

import model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);
    Department updateDepartmentById(Long id);
    void deleteDepartmentById(Long id);
    Department getDepartmentById(Long id);
    List<Department> getAllDepartments();

}
