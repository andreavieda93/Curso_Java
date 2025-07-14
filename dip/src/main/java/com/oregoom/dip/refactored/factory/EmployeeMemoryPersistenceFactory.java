
package com.oregoom.dip.refactored.factory;
import com.oregoom.dip.refactored.persistence.EmployeeMemoryPersistence;
import com.oregoom.dip.refactored.persistence.EmployeePersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new EmployeeMemoryPersistence();
    }

}