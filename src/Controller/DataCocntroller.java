/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Koneksian.Koneksi;
import Model.DataModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Archi3
 */
public class DataCocntroller {
    public static ResultSet DataPraktikan(DataModel mahasiswa)throws SQLException{
        Koneksi koneksi = new Koneksi();
        koneksi.dbConnection();
        String query = "SELECT * FROM praktikan WHERE npm = '"+DataModel.getNpm()+"'";//belum
        Statement stm = koneksi.getConnection().createStatement();
        ResultSet executeUpdate = stm.executeQuery(query);
        return executeUpdate;
    }
}
//Salah pakai LoginModel jangan pakai DataModel