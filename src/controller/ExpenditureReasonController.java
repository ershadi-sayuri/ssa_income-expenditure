/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ExpenditureReason;

/**
 *
 * @author Ershadi
 */
public class ExpenditureReasonController {

    ExpenditureReason expenditureReason;

    public int addExpenditureReason(String expenditureReason_id, String expenditureReason_title) throws SQLException, ClassNotFoundException {
        expenditureReason = new ExpenditureReason(expenditureReason_id, expenditureReason_title);
        int result = expenditureReason.addExpenditureReason();
        return result;
    }

    public Object[] searchExpenditureReason(String heading, String value) throws SQLException, ClassNotFoundException {
        if (null != heading) {
            switch (heading) {
                case "expenditureReason_id":
                    expenditureReason = new ExpenditureReason(value, null);
                    break;
                case "expenditureReason_title":
                    expenditureReason = new ExpenditureReason(null, value);
                    break;
            }
        }

        Object[] object = expenditureReason.searchExpenditureReason();
        return object;
    }

    public int deleteExpenditureReason(String expenditureReason_id) throws ClassNotFoundException, SQLException {
        expenditureReason = new ExpenditureReason(expenditureReason_id, null);
        int result = expenditureReason.deleteExpenditureReason();
        return result;
    }

    public int updateExpenditureReason(String expenditureReason_id, String expenditureReason_title) throws ClassNotFoundException, SQLException {
        expenditureReason = new ExpenditureReason(expenditureReason_id, expenditureReason_title);
        int result = expenditureReason.updateExpenditureReason();
        return result;
    }

    public ArrayList<Object[]> searchAllExpenditureReason() throws ClassNotFoundException, SQLException {
        expenditureReason = new ExpenditureReason();
        ArrayList<Object[]> arrayList = expenditureReason.searchAllExpenditureReason();
        return arrayList;
    }
}
