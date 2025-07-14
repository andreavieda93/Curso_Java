
package com.oregoom.dip.refactored.persistence;

import java.util.List;

import com.oregoom.dip.refactored.Employee;

public interface EmployeePersistence {

    public List<Employee> findAll();

    public void save(Employee employee);
}
