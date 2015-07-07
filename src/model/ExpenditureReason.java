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
public class ExpenditureReason {

    private String expenditureReason_id;
    private String expenditureReason_title;

    public ExpenditureReason() {
    }

    public ExpenditureReason(String expenditureReason_id, String expenditureReason_title) {
        this.expenditureReason_id = expenditureReason_id;
        this.expenditureReason_title = expenditureReason_title;
    }

    /**
     * @return the expenditureReason_id
     */
    public String getExpenditureReason_id() {
        return expenditureReason_id;
    }

    /**
     * @param expenditureReason_id the expenditureReason_id to set
     */
    public void setExpenditureReason_id(String expenditureReason_id) {
        this.expenditureReason_id = expenditureReason_id;
    }

    /**
     * @return the expenditureReason_title
     */
    public String getExpenditureReason_title() {
        return expenditureReason_title;
    }

    /**
     * @param expenditureReason_title the expenditureReason_title to set
     */
    public void setExpenditureReason_title(String expenditureReason_title) {
        this.expenditureReason_title = expenditureReason_title;
    }

    public int addExpenditureReason() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO expenditureReason(expenditureReason_id,expenditureReason_title) VALUES('" + this.expenditureReason_id + "','" + this.expenditureReason_title + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchExpenditureReason() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[2];
        if (this.expenditureReason_id != null) {
            query = "SELECT * FROM expenditureReason WHERE expenditureReason_id ='" + this.expenditureReason_id + "'";
        } else if (this.expenditureReason_title != null) {
            query = "SELECT * FROM expenditureReason WHERE expenditureReason_title ='" + this.expenditureReason_title + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
        }

        return object;
    }

    public int deleteExpenditureReason() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM expenditureReason WHERE expenditureReason_id='" + this.expenditureReason_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateExpenditureReason() throws ClassNotFoundException, SQLException {
        String query = "UPDATE expenditureReason SET expenditureReason_title='" + this.expenditureReason_title + "' where  expenditureReason_id='" + this.expenditureReason_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllExpenditureReason() throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT * FROM expenditureReason";
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
