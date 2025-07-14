
package com.oregoom.dip.refactored.factory;


import com.oregoom.dip.refactored.persistence.EmployeePersistence;

public interface EmployeeePersistenceFactory {

    public EmployeePersistence getEmployeePersistance();

}