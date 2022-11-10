package tech.getarrays.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // query method
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
