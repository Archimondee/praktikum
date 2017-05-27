/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Koneksian.Koneksi;
import Model.LoginModel;
import Model.PraktikanModel;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Archi3
 */
public class RegisterController {
    public static int tambahUser(LoginModel register) throws SQLException{
        Koneksi koneksi = new Koneksi();
        koneksi.dbConnection();
        int id = 0;
        String query = "INSERT INTO user VALUES ('" + id + "','" +
                register.npm() + "','" +
                register.getUser() + "',SHA2('" +
                register.getPass() + "',256),'" +
                register.status() + "')";
        Statement stm = koneksi.getConnection().createStatement();
        int executeUpdate = stm.executeUpdate(query);
        return executeUpdate;
    }
    public static int tambahPraktikan(PraktikanModel praktikan) throws SQLException{
        Koneksi koneksi = new Koneksi();
        koneksi.dbConnection();
        int id = 0;
        
        String query1 = "INSERT INTO praktikan VALUES ('" + id + "','" +
                praktikan.getNpm() + "','" +
                praktikan.getFirst() + "','" +
                praktikan.getLast() + "','" +
                praktikan.getKelas() + "','" +
                praktikan.getLp() + "','" +
                praktikan.getLa() + "','" +
                praktikan.getUjian() + "','" +
                praktikan.getKehadiran() + "')";
        Statement stm1 = koneksi.getConnection().createStatement();
        int executeTambah = stm1.executeUpdate(query1);
        return executeTambah;
    }
}
