/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Responsible;

/**
 *
 * @author Ershadi
 */
public class ResponsibleController {

    Responsible responsible;

    public int addResponsible(String responsible_id, String responsible_name) throws SQLException, ClassNotFoundException {
        responsible = new Responsible(responsible_id, responsible_name);
        int result = responsible.addResponsible();
        return result;
    }

    public Object[] searchResponsible(String heading, String value) throws SQLException, ClassNotFoundException {
        if (null != heading) {
            switch (heading) {
                case "responsible_id":
                    responsible = new Responsible(value, null);
                    break;
                case "responsible_name":
                    responsible = new Responsible(null, value);
                    break;
            }
        }

        Object[] object = responsible.searchResponsible();
        return object;
    }

    public int deleteResponsible(String responsible_id) throws ClassNotFoundException, SQLException {
        responsible = new Responsible(responsible_id, null);
        int result = responsible.deleteResponsible();
        return result;
    }

    public int updateResponsible(String responsible_id, String responsible_name) throws ClassNotFoundException, SQLException {
        responsible = new Responsible(responsible_id, responsible_name);
        int result = responsible.updateResponsible();
        return result;
    }

    public ArrayList<Object[]> searchAllResponsible() throws ClassNotFoundException, SQLException {
        responsible = new Responsible();
        ArrayList<Object[]> arrayList = responsible.searchAllResponsible();
        return arrayList;
    }
}
