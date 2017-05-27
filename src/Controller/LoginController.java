/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Koneksian.Koneksi;
import Model.LoginModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Archi3
 */
public class LoginController {
    public static ResultSet Login(LoginModel login)throws ClassNotFoundException, SQLException{
        Koneksi koneksi = new Koneksi();
        koneksi.dbConnection();
        String query = "SELECT * FROM User WHERE user = '" + login.getUser() + "' AND password = SHA2('" + login.getPass() + "',256)";
        Statement stm = koneksi.getConnection().createStatement();
        ResultSet executeUpdate = stm.executeQuery(query);
        return executeUpdate;
    }
}
