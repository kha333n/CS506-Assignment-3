package com.kha333n.cs506;

import javax.servlet.ServletContext;
import java.sql.SQLException;

/**
 * Contains Employee Salary transaction related code.
 */

public class EmployeeAccountManager {
    private final int MAX = 0;
    //TODO: Find out and set MAX value...

    Employee employee;
    private static DatabaseHelper databaseHelper;


    //TODO: finalize all methods...
    public static DatabaseHelper initDatabaseHelper(ServletContext servletContext){
        databaseHelper = new DatabaseHelper(servletContext,"BC190201004.accdb");
        return databaseHelper;
    }

    void getEmployeeDetails() {

    }

    boolean isValidEmployee(){

        return true;
    }

    void withdrawSalary(){

    }

    void getSalaryMaxLimit(){

    }

}
