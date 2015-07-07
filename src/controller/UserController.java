/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author Ershadi
 */
public class UserController {

    User user;

    public int addUser(String user_id, String user_name, String user_password) throws SQLException, ClassNotFoundException {
        user = new User(user_id, user_name, user_password);
        int result = user.addUser();
        return result;
    }

    public Object[] searchUser(String heading, String value) throws SQLException, ClassNotFoundException {
        if (null != heading) {
            switch (heading) {
                case "user_id":
                    user = new User(value, null, null);
                    break;
                case "user_name":
                    user = new User(null, value, null);
                    break;
            }
        }

        Object[] object = user.searchUser();
        return object;
    }

    public int deleteUser(String user_id) throws ClassNotFoundException, SQLException {
        user = new User(user_id, null, null);
        int result = user.deleteUser();
        return result;
    }

    public int updateUser(String user_id, String user_name, String user_password) throws ClassNotFoundException, SQLException {
        user = new User(user_id, user_name, user_password);
        int result = user.updateUser();
        return result;
    }

    public ArrayList<Object[]> searchAllUser() throws ClassNotFoundException, SQLException {
        user = new User();
        ArrayList<Object[]> arrayList = user.searchAllUser();
        return arrayList;
    }
}
