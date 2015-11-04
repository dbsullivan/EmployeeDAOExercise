package edu.madisoncollege.enterprisejava;

import edu.madisoncollege.enterprisejava.entity.Employee;
import edu.madisoncollege.enterprisejava.persistence.Database;
import edu.madisoncollege.enterprisejava.persistence.EmployeeDao;

import java.sql.SQLException;

/**
 * @author paulawaite
 * @version 1.0 10/20/15.
 */
public class EmployeeDriver {
    /** The main method is used to run the various
     *   Dao methods.
     *
     * @param args
     */
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        try {
            Database.getInstance().connect();
            // 1. getAllEmployees
            System.out.println(dao.getAllEmployees());

            //TODO add code to call the other dao methods
            // 2. getEmployee
            System.out.println("Employee 109: " + dao.getEmployee(109));

            // 3. updateEmployee
            int employeeId = 200;
            String firstName = "Sammy";
            String lastName = "Davis";
            String socialSecurityNumber = "222-33-4444";
            String department = "ET";
            String room = "100";
            String phone = "4148887771";

            Employee AddEmployee = new Employee(employeeId, firstName, lastName, socialSecurityNumber, department, room, phone);
            dao.updateEmployee(AddEmployee);

            System.out.println("Employee 200: " + dao.getEmployee(200));

          // 4. deleteEmployee
            Employee deleteEmployee = new Employee(200, null, null, null, null, null, null);
            dao.deleteEmployee(deleteEmployee);
//            System.out.println(dao.getEmployee(200)); // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 if he's gone.

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
