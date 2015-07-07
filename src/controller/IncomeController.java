/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Income;

/**
 *
 * @author Ershadi
 */
public class IncomeController {

    Income income;

    public int addIncome(String income_id, String donator_id, String incomeReason_id, double income_amount, String income_date, String responsible_id) throws SQLException, ClassNotFoundException {
        income = new Income(income_id, donator_id, incomeReason_id, income_amount, income_date, responsible_id);
        int result = income.addIncome();
        return result;
    }

    public Object[] searchIncome(String heading, String value) throws SQLException, ClassNotFoundException {
        Object[] object = null;
        if (null != heading) {
            income = new Income(value);
            object = income.searchIncome();
        }

        return object;
    }

    public int deleteIncome(String income_id) throws ClassNotFoundException, SQLException {
        income = new Income(income_id);
        int result = income.deleteIncome();
        return result;
    }

    public int updateIncome(String income_id, String donator_id, String incomeReason_id, double income_amount, String income_date, String responsible_id) throws ClassNotFoundException, SQLException {
        income = new Income(income_id, donator_id, incomeReason_id, income_amount, income_date, responsible_id);
        int result = income.updateIncome();
        return result;
    }

    public ArrayList<Object[]> searchAllIncome(String query) throws ClassNotFoundException, SQLException {
        income = new Income();
        ArrayList<Object[]> arrayList = income.searchAllIncome(query);
        return arrayList;
    }
    
    public ArrayList<Object[]> searchIncomeForReport(String begindate, String endDate) throws ClassNotFoundException, SQLException {
        income = new Income();
        ArrayList<Object[]> arrayList = income.searchIncomeForReport(begindate,endDate);
        return arrayList;
    }
}
