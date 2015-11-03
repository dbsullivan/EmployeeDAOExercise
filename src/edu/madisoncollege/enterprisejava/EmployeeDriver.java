package edu.madisoncollege.enterprisejava;

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
            Database.getInstance().connect();
            System.out.println(dao.getEmployee(109));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
