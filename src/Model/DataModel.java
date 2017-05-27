/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Archi3
 */
public class DataModel {
    private static int npm;
    private static String first_name;
    private static String last_name;
    private static String kelas;
    private static int lp;
    private static int la;
    private static int ujian;
    public static int getNpm(){
        return npm;
    }
    public static String getFirst(){
        return first_name;
    }
    public static String getLast(){
        return last_name;
    }
    public static String getKelas(){
        return kelas;
    }
    public static int getLa(){
        return la;
    }
    public static int getLp(){
        return lp;
    }
    public static int getUjian(){
        return ujian;
    }
    public static void setNpm(int npm){
        DataModel.npm = npm;
    }
    public static void setFirst(String first_name){
        DataModel.first_name = first_name;
    }
    public static void setLast(String last_name){
        DataModel.last_name = last_name;
    }
    public static void setKelas(String kelas){
        DataModel.kelas = kelas;
    }
    public static void setLa(int la){
        DataModel.la = la;
    }
    public static void setLp(int lp){
        DataModel.lp = lp;
    }
    public static void setUjian(int ujian){
        DataModel.ujian = ujian;
    }
}
