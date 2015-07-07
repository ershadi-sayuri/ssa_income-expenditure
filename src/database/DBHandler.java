/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DBHandler {

    public static int setData(Connection connection, String query) throws SQLException, ClassNotFoundException {
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(query);
        stm = null;
        System.gc();
        return result;
    }

    public static ResultSet getData(Connection connection, String query) throws SQLException, ClassNotFoundException {
        Statement stm = connection.createStatement();
        ResultSet resultSet = stm.executeQuery(query);
        stm = null;
        System.gc();
        return resultSet;
    }
}
