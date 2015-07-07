/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBConnection;
import database.DBHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ershadi
 */
public class User {

    private String user_id;
    private String user_name;
    private String user_password;

    public User() {
    }

    public User(String user_id, String user_name, String user_password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
    }

    /**
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int addUser() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO user(user_id,user_name,user_password) "
                + "VALUES('" + this.user_id + "','" + this.user_name
                + "','" + this.user_password + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchUser() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[3];
        if (this.user_id != null) {
            query = "SELECT * FROM user WHERE user_id ='" + this.user_id + "'";
        } else if (this.user_name != null) {
            query = "SELECT * FROM user WHERE user_name ='" + this.user_name + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
        }

        return object;
    }

    public int deleteUser() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM user WHERE user_id='" + this.user_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateUser() throws ClassNotFoundException, SQLException {
        String query = "UPDATE user SET user_name='"
                + this.user_name + "',user_password='" + this.user_password
                + "' where  user_id='" + this.user_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllUser() throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT * FROM user";
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);

        while (resultSet.next()) {
            Object[] object = new Object[2];
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            arrayList.add(object);
        }
        return arrayList;
    }
}
