package com.kha333n.cs506;

/**
 * Stores Employee Data.
 */
public class Employee {
    private int id;
    private String employeeName;
    private String employeeId;
    private int employeePassword;
    private int employeeSalary;
    private int currentBalance;

    Employee(){
        id = 0;
        employeeName = "NULL";
        employeeId = "NULL";
        employeePassword = 0;
        employeeSalary = 0;
        currentBalance = 0;
    }

    Employee(int ID, String employeeName, String employeeId,
             int employeePassword, int employeeSalary, int currentBalance)
    {
        this.id = ID;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeePassword = employeePassword;
        this.employeeSalary = employeeSalary;
        this.currentBalance = currentBalance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeePassword(int employeePassword) {
        this.employeePassword = employeePassword;
    }

    public int getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }
}
