/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.IncomeReason;

/**
 *
 * @author Ershadi
 */
public class IncomeReasonController {

    IncomeReason incomeReason;

    public int addIncomeReason(String incomeReason_id, String incomeReason_title) throws SQLException, ClassNotFoundException {
        incomeReason = new IncomeReason(incomeReason_id, incomeReason_title);
        int result = incomeReason.addIncomeReason();
        return result;
    }

    public Object[] searchIncomeReason(String heading, String value) throws SQLException, ClassNotFoundException {
        if (null != heading) {
            switch (heading) {
                case "incomeReason_id":
                    incomeReason = new IncomeReason(value, null);
                    break;
                case "incomeReason_title":
                    incomeReason = new IncomeReason(null, value);
                    break;
            }
        }

        Object[] object = incomeReason.searchIncomeReason();
        return object;
    }

    public int deleteIncomeReason(String incomeReason_id) throws ClassNotFoundException, SQLException {
        incomeReason = new IncomeReason(incomeReason_id, null);
        int result = incomeReason.deleteIncomeReason();
        return result;
    }

    public int updateIncomeReason(String incomeReason_id, String incomeReason_title) throws ClassNotFoundException, SQLException {
        incomeReason = new IncomeReason(incomeReason_id, incomeReason_title);
        int result = incomeReason.updateIncomeReason();
        return result;
    }

    public ArrayList<Object[]> searchAllIncomeReason() throws ClassNotFoundException, SQLException {
        incomeReason = new IncomeReason();
        ArrayList<Object[]> arrayList = incomeReason.searchAllIncomeReason();
        return arrayList;
    }
}
