/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Donator;

/**
 *
 * @author Ershadi
 */
public class DonatorController {

    Donator donator;

    public int addDonator(String donator_id, String donator_name, String donator_address, String donator_phone) throws SQLException, ClassNotFoundException {
        donator = new Donator(donator_id, donator_name, donator_address, donator_phone);
        int result = donator.addDonator();
        return result;
    }

    public Object[] searchDonator(String heading, String value) throws SQLException, ClassNotFoundException {
        if (null != heading) {
            switch (heading) {
                case "donator_id":
                    donator = new Donator(value, null, null, null);
                    break;
                case "donator_name":
                    donator = new Donator(null, value, null, null);
                    break;
            }
        }

        Object[] object = donator.searchDonator();
        return object;
    }

    public int deleteDonator(String donator_id) throws ClassNotFoundException, SQLException {
        donator = new Donator(donator_id, null, null, null);
        int result = donator.deleteDonator();
        return result;
    }

    public int updateDonator(String donator_id, String donator_name, String donator_address, String donator_phone) throws ClassNotFoundException, SQLException {
        donator = new Donator(donator_id, donator_name, donator_address, donator_phone);
        int result = donator.updateDonator();
        return result;
    }

    public ArrayList<Object[]> searchAllDonator() throws ClassNotFoundException, SQLException {
        donator = new Donator();
        ArrayList<Object[]> arrayList = donator.searchAllDonator();
        return arrayList;
    }
}
