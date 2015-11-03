package edu.madisoncollege.enterprisejava.persistence;

import edu.madisoncollege.enterprisejava.entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
/**
 * @author YOUR NAME HERE
 * @version 1.0 10/20/15.
 */
public class EmployeeDao {

    public List<Employee> getAllEmployees() throws SQLException {

            List<Employee> employees = new ArrayList<Employee>();

            Connection connection = Database.getInstance().getConnection();

            String sql = "select * from employees order by emp_id";
            Statement selectStatement = connection.createStatement();

            ResultSet results = selectStatement.executeQuery(sql);

            while (results.next()) {
                int employeeId = results.getInt("emp_id");
                String firstName = results.getString("first_name");
                String lastName = results.getString("last_name");
                String socialSecurityNumber = results.getString("ssn");
                String department = results.getString("dept");
                String room = results.getString("room");
                String phone = results.getString("phone");

                Employee employee = new Employee(employeeId, firstName, lastName, socialSecurityNumber, department, room, phone);
                employees.add(employee);
            }

            results.close();
            selectStatement.close();

            return employees;
        }



    public Employee getEmployee(int employeeId) throws SQLException {
        // TODO implement this method
//        return null;
        List<Employee> employees = new ArrayList<Employee>();

        Connection connection = Database.getInstance().getConnection();

        String sql = "select * from employees where emp_id=" + employeeId;
        Statement selectStatement = connection.createStatement();

        ResultSet results = selectStatement.executeQuery(sql);

        while (results.next()) {
            employeeId = results.getInt("emp_id");
            String firstName = results.getString("first_name");
            String lastName = results.getString("last_name");
            String socialSecurityNumber = results.getString("ssn");
            String department = results.getString("dept");
            String room = results.getString("room");
            String phone = results.getString("phone");

            Employee employee = new Employee(employeeId, firstName, lastName, socialSecurityNumber, department, room, phone);
            employees.add(employee);
        }

        results.close();
        selectStatement.close();

        return employees.get(0);

    }

    public void updateEmployee(Employee employee) {
        // TODO implement this method

    }
    public void deleteStudent(Employee employee) {
        // TODO implement this method

    }
}