/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

import database.DBHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ershadi
 */
public class BackupManager {

    public static void createNewDatabase() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException, InterruptedException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "admin");

        String query = "create database iaedb;";
        int result = DBHandler.setData(conn, query);

        if (result == 1) {
            createDB("iaedb", "root", "admin", "db_backup/create_database.txt");
        }
        conn.close();

        query = null;
        result = 0;
        System.gc();
    }

    public static boolean createBackup(String dbName, String dbUserName, String dbPassword, String path) {
        String executeCmd = "mysqldump -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r " + path;
        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup created successfully");
                return true;
            } else {
                System.out.println("Could not create the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        executeCmd = null;
        runtimeProcess = null;
        System.gc();

        return false;
    }

    public static boolean createDB(String dbName, String dbUserName, String dbPassword, String source) {
        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName, "-e", "source " + source};

        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            } else {
                System.out.println("Could not restore the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        executeCmd = null;
        runtimeProcess = null;
        System.gc();
        return false;
    }

    public static boolean restoreBackup(String dbUserName, String dbPassword, String source) {
        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + source};

        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            } else {
                System.out.println("Could not restore the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        executeCmd = null;
        runtimeProcess = null;
        System.gc();
        return false;
    }
}
