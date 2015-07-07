/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

import database.DBConnection;
import database.DBHandler;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ershadi
 */
public class IdGenerator {

    public String generateId(String table) throws SQLException, ClassNotFoundException {
        String query = null;
        String nextId = null;
        ResultSet resultSet = null;

        switch (table) {
            case "ii":
                query = "SELECT income_id FROM income ORDER BY income_id DESC LIMIT 1";
                break;
            case "ir":
                query = "SELECT incomeReason_id FROM incomeReason ORDER BY incomeReason_id DESC LIMIT 1";
                break;
            case "dd":
                query = "SELECT donator_id FROM donator ORDER BY donator_id DESC LIMIT 1";
                break;
            case "rr":
                query = "SELECT responsible_id FROM responsible ORDER BY responsible_id DESC LIMIT 1";
                break;
            case "ee":
                query = "SELECT expenditure_id FROM expenditure ORDER BY expenditure_id DESC LIMIT 1";
                break;
            case "er":
                query = "SELECT expenditureReason_id FROM expenditureReason ORDER BY expenditureReason_id DESC LIMIT 1";
                break;
            case "uu":
                query = "SELECT user_id FROM user ORDER BY user_id DESC LIMIT 1";
                break;
        }

        resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);
        if (resultSet.first()) {
            String lastId = resultSet.getString(1);
            String s_lastIdvalue = lastId.substring(2);

            int i_lastIdValue = 0;
            try {
                i_lastIdValue = Integer.parseInt(s_lastIdvalue);
            } catch (Exception exception) {
                i_lastIdValue = 0;
            }

            i_lastIdValue += 1;
            nextId = lastId.substring(0, 2) + i_lastIdValue;

        } else {
            switch (table) {
                case "ii":
                    nextId = "ii1";
                    break;
                case "ir":
                    nextId = "ir1";
                    break;
                case "dd":
                    nextId = "dd1";
                    break;
                case "rr":
                    nextId = "rr1";
                    break;
                case "ee":
                    nextId = "ee1";
                    break;
                case "er":
                    nextId = "er1";
                    break;
                case "uu":
                    nextId = "uu1";
                    break;
            }
        }

        return nextId;
    }
}
