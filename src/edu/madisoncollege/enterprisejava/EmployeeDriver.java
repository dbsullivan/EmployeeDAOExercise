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
            System.out.println(dao.getAllEmployees());

            //TODO add code to call the other dao methods
            System.out.println(dao.getEmployee(109));


    // update employee 116 with new last name
//            System.out.println("Before update: " + dao.getEmployee(116));
//
//            int employeeId = 116;
//            String lastName = "Tillman-Spillman";
//            Employee UpdateEmployee = dao.getEmployee(116);
//            dao.updateEmployee(UpdateEmployee);
//            System.out.println("After update: " + dao.getEmployee(116));


//           deleteStudent(Employee employee)

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
