
package com.oregoom.dip.refactored.factory;

import com.oregoom.dip.refactored.persistence.EmployeePersistence;
import com.oregoom.dip.refactored.persistence.MySqlEmployeePersistence;

public class MySqlEmployeePersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new MySqlEmployeePersistence(System.getProperty("url"),
                System.getProperty("user"), System.getProperty("password"));
    }

}