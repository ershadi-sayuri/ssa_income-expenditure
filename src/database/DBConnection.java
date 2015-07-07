/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBConnection {

    private static final String url = "jdbc:mysql://localhost/iaedb";
    private static final String user = "root";
    private static final String password = "admin";

    private static Connection conn = null;
    private static DBConnection dbconn = null;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    }

    private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbconn == null) {
            dbconn = new DBConnection();
        }
        return dbconn;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException {
        return getDBConnection().conn;
    }
}
