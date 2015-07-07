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
public class Donator {

    private String donator_id;
    private String donator_name;
    private String donator_address;
    private String donator_phone;

    public Donator() {
    }

    public Donator(String donator_id, String donator_name, String donator_address, String donator_phone) {
        this.donator_id = donator_id;
        this.donator_name = donator_name;
        this.donator_address = donator_address;
        this.donator_phone = donator_phone;
    }

    /**
     * @return the donator_id
     */
    public String getDonator_id() {
        return donator_id;
    }

    /**
     * @param donator_id the donator_id to set
     */
    public void setDonator_id(String donator_id) {
        this.donator_id = donator_id;
    }

    /**
     * @return the donator_name
     */
    public String getDonator_name() {
        return donator_name;
    }

    /**
     * @param donator_name the donator_name to set
     */
    public void setDonator_name(String donator_name) {
        this.donator_name = donator_name;
    }

    /**
     * @return the donator_address
     */
    public String getDonator_address() {
        return donator_address;
    }

    /**
     * @param donator_address the donator_address to set
     */
    public void setDonator_address(String donator_address) {
        this.donator_address = donator_address;
    }

    /**
     * @return the donator_phone
     */
    public String getDonator_phone() {
        return donator_phone;
    }

    /**
     * @param donator_phone the donator_phone to set
     */
    public void setDonator_phone(String donator_phone) {
        this.donator_phone = donator_phone;
    }

    public int addDonator() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO donator(donator_id,donator_name,donator_address,donator_phone) VALUES('" + this.donator_id + "','" + this.donator_name + "','" + this.donator_address + "','" + this.donator_phone + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchDonator() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[4];
        if (this.donator_id != null) {
            query = "SELECT * FROM donator WHERE donator_id ='" + this.donator_id + "'";
        } else if (this.donator_name != null) {
            query = "SELECT * FROM donator WHERE donator_name ='" + this.donator_name + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
        }

        return object;
    }

    public int deleteDonator() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM donator WHERE donator_id='" + this.donator_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateDonator() throws ClassNotFoundException, SQLException {
        String query = "UPDATE donator SET donator_name='" + this.donator_name + "',donator_address='" + this.donator_address + "',donator_phone='" + this.donator_phone + "' where  donator_id='" + this.donator_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllDonator() throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT * FROM donator";
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);

        while (resultSet.next()) {
            Object[] object = new Object[4];
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
            arrayList.add(object);
        }
        return arrayList;
    }
}
