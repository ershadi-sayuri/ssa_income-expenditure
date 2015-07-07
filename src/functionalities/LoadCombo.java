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
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Ershadi
 */
public class LoadCombo {

    private ArrayList<String> arrayListWithoutDuplicates;

    public void loadCombo(JComboBox comboBox, String tableName, String heading) throws ClassNotFoundException, SQLException {
        arrayListWithoutDuplicates = new ArrayList<>();

        String query = "SELECT " + heading + " FROM " + tableName;
        ResultSet resultSet = DBHandler.getData(DBConnection.getConnectionToDB(), query);

        while (resultSet.next()) {
            if (!arrayListWithoutDuplicates.contains(resultSet.getString(1))) {
                arrayListWithoutDuplicates.add(resultSet.getString(1));
                comboBox.addItem(resultSet.getString(1));
            }
        }
    }
}
