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
public class IncomeReason {

    private String incomeReason_id;
    private String incomeReason_title;

    public IncomeReason() {
    }

    public IncomeReason(String incomeReason_id, String incomeReason_title) {
        this.incomeReason_id = incomeReason_id;
        this.incomeReason_title = incomeReason_title;
    }

    /**
     * @return the incomeReason_id
     */
    public String getIncomeReason_id() {
        return incomeReason_id;
    }

    /**
     * @param incomeReason_id the incomeReason_id to set
     */
    public void setIncomeReason_id(String incomeReason_id) {
        this.incomeReason_id = incomeReason_id;
    }

    /**
     * @return the incomeReason_title
     */
    public String getIncomeReason_title() {
        return incomeReason_title;
    }

    /**
     * @param incomeReason_title the incomeReason_title to set
     */
    public void setIncomeReason_title(String incomeReason_title) {
        this.incomeReason_title = incomeReason_title;
    }

    public int addIncomeReason() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO incomeReason(incomeReason_id,incomeReason_title) VALUES('" + this.incomeReason_id + "','" + this.incomeReason_title + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchIncomeReason() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[2];
        if (this.incomeReason_id != null) {
            query = "SELECT * FROM incomeReason WHERE incomeReason_id ='" + this.incomeReason_id + "'";
        } else if (this.incomeReason_title != null) {
            query = "SELECT * FROM incomeReason WHERE incomeReason_title ='" + this.incomeReason_title + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
        }

        return object;
    }

    public int deleteIncomeReason() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM incomeReason WHERE incomeReason_id='" + this.incomeReason_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateIncomeReason() throws ClassNotFoundException, SQLException {
        String query = "UPDATE incomeReason SET incomeReason_title='" + this.incomeReason_title + "' where  incomeReason_id='" + this.incomeReason_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllIncomeReason() throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT * FROM incomeReason";
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
