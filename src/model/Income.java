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
public class Income {

    private String income_id;
    private String donator_id;
    private String incomeReason_id;
    private double income_amount;
    private String income_date;
    private String responsible_id;

    public Income() {
    }

    public Income(String income_id) {
        this.income_id = income_id;
    }

    public Income(String income_id, String donator_id, String incomeReason_id, double income_amount, String income_date, String responsible_id) {
        this.income_id = income_id;
        this.donator_id = donator_id;
        this.incomeReason_id = incomeReason_id;
        this.income_amount = income_amount;
        this.income_date = income_date;
        this.responsible_id = responsible_id;
    }

    /**
     * @return the income_id
     */
    public String getIncome_id() {
        return income_id;
    }

    /**
     * @param income_id the income_id to set
     */
    public void setIncome_id(String income_id) {
        this.income_id = income_id;
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
     * @return the income_date
     */
    public String getIncome_date() {
        return income_date;
    }

    /**
     * @param income_date the income_date to set
     */
    public void setIncome_date(String income_date) {
        this.income_date = income_date;
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
     * @return the income_amount
     */
    public double getIncome_amount() {
        return income_amount;
    }

    /**
     * @param income_amount the income_amount to set
     */
    public void setIncome_amount(double income_amount) {
        this.income_amount = income_amount;
    }

    public int addIncome() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO income(income_id,donator_id,"
                + "incomeReason_id,responsible_id,income_date,income_amount) "
                + "VALUES('" + this.income_id + "','" + this.donator_id
                + "','" + this.incomeReason_id + "','" + this.responsible_id
                + "','" + this.income_date + "','" + this.income_amount + "')";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public Object[] searchIncome() throws SQLException, ClassNotFoundException {
        String query = null;
        Object object[] = new Object[6];
        if (this.income_id != null) {
            query = "SELECT * FROM income WHERE income_id ='" + this.income_id + "'";
        }

        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.next()) {
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
            object[4] = resultSet.getString(5);
            object[5] = resultSet.getString(6);
        }

        return object;
    }

    public int deleteIncome() throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM income WHERE income_id='" + this.income_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public int updateIncome() throws ClassNotFoundException, SQLException {
        String query = "UPDATE income SET donator_id='"
                + this.donator_id + "',incomeReason_id='" + this.incomeReason_id
                + "',responsible_id='" + this.responsible_id + "',income_date='"
                + this.income_date + "',income_amount='" + this.income_amount
                + "' where  income_id='" + this.income_id + "'";
        int result = DBHandler.setData(DBConnection.getConnectionToDB(), query);
        return result;
    }

    public ArrayList<Object[]> searchAllIncome(String search_query) throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = search_query;
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);

        while (resultSet.next()) {
            Object[] object = new Object[6];
            object[0] = resultSet.getString(1);
            object[1] = resultSet.getString(2);
            object[2] = resultSet.getString(3);
            object[3] = resultSet.getString(4);
            object[4] = resultSet.getString(5);
            object[5] = resultSet.getString(6);

            arrayList.add(object);
        }
        return arrayList;
    }
    
    public ArrayList<Object[]> searchIncomeForReport(String beginDate,String endDate) throws ClassNotFoundException, SQLException {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String query = "SELECT incomeReason_id, SUM(income_amount) FROM income WHERE income_date BETWEEN '"+beginDate+"' AND '"+endDate+"' GROUP BY incomeReason_id";
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
