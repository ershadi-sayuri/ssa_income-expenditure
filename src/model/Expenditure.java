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
public class Expenditure {

    private String expenditure_id;
    private String responsible_id;
    private String reasonforExpenditure_id;
    private double expenditure_amount;
    private String expenditure_date;

    public Expenditure() {
    }

    public Expenditure(String expenditure_id, String responsible_id, String reasonforExpenditure_id, double expenditure_amount, String expenditure_date) {
        this.expenditure_id = expenditure_id;
        this.responsible_id = responsible_id;
        this.reasonforExpenditure_id = reasonforExpenditure_id;
        this.expenditure_amount = expenditure_amount;
        this.expenditure_date = expenditure_date;
    }

    /**
     * @return the expenditure_id
     */
    public String getExpenditure_id() {
        return expenditure_id;
    }

    /**
     * @param expenditure_id the expenditure_id to set
     */
    public void setExpenditure_id(String expenditure_id) {
        this.expenditure_id = expenditure_id;
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
     * @return the reasonforExpenditure_id
     */
    public String getReasonforExpenditure_id() {
        return reasonforExpenditure_id;
    }

    /**
     * @param reasonforExpenditure_id the reasonforExpenditure_id to set
     */
    public void setReasonforExpenditure_id(String reasonforExpenditure_id) {
        this.reasonforExpenditure_id = reasonforExpenditure_id;
    }

    /**
     * @return the expenditure_amount
     */
    public double getExpenditure_amount() {
        return expenditure_amount;
    }

    /**
     * @param expenditure_amount the expenditure_amount to set
     */
    public void setExpenditure_amount(double expenditure_amount) {
        this.expenditure_amount = expenditure_amount;
    }

    /**
     * @return the expenditure_date
     */
    public String getExpenditure_date() {
        return expenditure_date;
    }

    /**
     * @param expenditure_date the expenditure_date to set
     */
    public void setExpenditure_date(String expenditure_date) {
        this.expenditure_date = expenditure_date;
    }

    public int addExpenditure() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO expenditure(expenditure_id,responsibleForExpenditure_id,"
                + "reasonforExpenditure_id,expenditure_amount,expenditure_date) "
                + "VALUES('" + this.expenditure_id + "','" + this.responsible_id
                + "','" + this.reasonforExpenditure_id + "','" + this.expenditure_amount
                + "','" + this.expenditure_date + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchExpenditure() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[5];
        if (this.expenditure_id != null) {
            query = "SELECT * FROM expenditure WHERE expenditure_id ='" + this.expenditure_id + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
            object[4] = resultSet.getString(5);
        }

        return object;
    }

    public int deleteExpenditure() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM expenditure WHERE expenditure_id='" + this.expenditure_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateExpenditure() throws ClassNotFoundException, SQLException {
        String query = "UPDATE expenditure SET responsibleForExpenditure_id='"
                + this.responsible_id + "',reasonforExpenditure_id='" + this.reasonforExpenditure_id
                + "',expenditure_amount='" + this.expenditure_amount + "',expenditure_date='"
                + this.expenditure_date + "' where  expenditure_id='" + this.expenditure_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllExpenditure(String search_query) throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = search_query;
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);

        while (resultSet.next()) {
            Object[] object = new Object[5];
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
            object[4] = resultSet.getString(5);

            arrayList.add(object);
        }
        return arrayList;
    }

    public ArrayList<Object[]> searchExpenditureForReport(String beginDate, String endDate) throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT reasonforExpenditure_id, SUM(expenditure_amount) FROM expenditure WHERE expenditure_date BETWEEN '" + beginDate + "' AND '" + endDate + "' GROUP BY reasonforExpenditure_id";
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
