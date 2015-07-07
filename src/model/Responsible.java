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
public class Responsible {

    private String responsible_id;
    private String responsible_name;

    public Responsible() {
    }

    public Responsible(String responsible_id, String responsible_name) {
        this.responsible_id = responsible_id;
        this.responsible_name = responsible_name;
    }

    /**
     * @return the responsible_id
     */
    public String getResponsible_id() {
        return responsible_id;
    }

    /**
     * @param responsible_id the responsible_id to set
     */
    public void setResponsible_id(String responsible_id) {
        this.responsible_id = responsible_id;
    }

    /**
     * @return the responsible_name
     */
    public String getResponsible_name() {
        return responsible_name;
    }

    /**
     * @param responsible_name the responsible_name to set
     */
    public void setResponsible_name(String responsible_name) {
        this.responsible_name = responsible_name;
    }

    public int addResponsible() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO responsible(responsible_id,responsible_name) VALUES('" + this.responsible_id + "','" + this.responsible_name + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchResponsible() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[2];
        if (this.responsible_id != null) {
            query = "SELECT * FROM responsible WHERE responsible_id ='" + this.responsible_id + "'";
        } else if (this.responsible_name != null) {
            query = "SELECT * FROM responsible WHERE responsible_name ='" + this.responsible_name + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
        }

        return object;
    }

    public int deleteResponsible() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM responsible WHERE responsible_id='" + this.responsible_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateResponsible() throws ClassNotFoundException, SQLException {
        String query = "UPDATE responsible SET responsible_name='" + this.responsible_name + "' where  responsible_id='" + this.responsible_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllResponsible() throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT * FROM responsible";
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
