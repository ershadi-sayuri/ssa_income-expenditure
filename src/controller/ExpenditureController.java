/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Expenditure;
import model.Income;

/**
 *
 * @author Ershadi
 */
public class ExpenditureController {

    Expenditure expenditure;

    public int addExpenditure(String expenditure_id, String responsibleForExpenditure_id, String reasonforExpenditure_id, double expenditure_amount, String expenditure_date) throws SQLException, ClassNotFoundException {
        expenditure = new Expenditure(expenditure_id, responsibleForExpenditure_id, reasonforExpenditure_id, expenditure_amount, expenditure_date);
        int result = expenditure.addExpenditure();
        return result;
    }

    public Object[] searchExpenditure(String heading, String value) throws SQLException, ClassNotFoundException {
        Object[] object = null;
        if (null != heading) {
            expenditure = new Expenditure(value, null, null, 0, null);
            object = expenditure.searchExpenditure();
        }

        return object;
    }

    public int deleteExpenditure(String expenditure_id) throws ClassNotFoundException, SQLException {
        expenditure = new Expenditure(expenditure_id, null, null, 0, null);
        int result = expenditure.deleteExpenditure();
        return result;
    }

    public int updateExpenditure(String expenditure_id, String responsibleForExpenditure_id, String reasonforExpenditure_id, double expenditure_amount, String expenditure_date) throws ClassNotFoundException, SQLException {
        expenditure = new Expenditure(expenditure_id, responsibleForExpenditure_id, reasonforExpenditure_id, expenditure_amount, expenditure_date);
        int result = expenditure.updateExpenditure();
        return result;
    }

    public ArrayList<Object[]> searchAllExpenditure(String query) throws ClassNotFoundException, SQLException {
        expenditure = new Expenditure();
        ArrayList<Object[]> arrayList = expenditure.searchAllExpenditure(query);
        return arrayList;
    }

    public ArrayList<Object[]> searchExpenditureForReport(String begindate, String endDate) throws ClassNotFoundException, SQLException {
        expenditure = new Expenditure();
        ArrayList<Object[]> arrayList = expenditure.searchExpenditureForReport(begindate, endDate);
        return arrayList;
    }
}
