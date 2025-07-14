
package com.oregoom.dip.refactored;
import com.oregoom.dip.refactored.factory.EmployeeMemoryPersistenceFactory;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(new EmployeeMemoryPersistenceFactory());
    }

}