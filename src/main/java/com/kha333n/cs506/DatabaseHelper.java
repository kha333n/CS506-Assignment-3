package com.kha333n.cs506;

import javax.servlet.ServletContext;
import java.sql.*;

public class DatabaseHelper {

    private String PATH;
    private String FILE;
    private Connection connection;

    DatabaseHelper(ServletContext servletContext,String fileName){
        PATH = servletContext.getRealPath("/assets/" + fileName);
    }

    protected Statement getConnectionStatement(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String url = "jdbc:ucanaccess://" + PATH;

            connection = DriverManager.getConnection(url);

            return connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Employee getEmployeeDetails(int ID) throws SQLException {
        Statement stmt = getConnectionStatement();
        String sql = "SELECT * FROM employee";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            if (rs.getInt("ID") == ID)
            {
                Employee employee = new Employee(rs.getInt("ID"), rs.getString("employee_name"),
                        rs.getString("employee_id"), rs.getInt("employee_password"),
                        rs.getInt("employee_salary"), rs.getInt("employee_balance"));
                connection.close();
                return employee;
            }
        }
        connection.close();
        return null;
    }

    public Employee getEmployeeDetails(String employeeID) throws SQLException {
        Statement stmt = getConnectionStatement();
        String sql = "SELECT * FROM employee";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            if (rs.getString("employee_id").equals(employeeID))
            {
                Employee employee = new Employee(rs.getInt("ID"), rs.getString("employee_name"),
                        rs.getString("employee_id"), rs.getInt("employee_password"),
                        rs.getInt("employee_salary"), rs.getInt("employee_balance"));
                connection.close();
                return employee;
            }
        }
        connection.close();
        return null;
    }

    public void updateSalaryBalance(int id, int balance) throws SQLException {
        Statement stmt = getConnectionStatement();

        String sql = "SELECT * FROM employee";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            if (rs.getInt("ID") == id)
            {
                rs.updateInt("employee_balance", balance);
                rs.updateRow();
            }
        }
        connection.close();
    }

}
