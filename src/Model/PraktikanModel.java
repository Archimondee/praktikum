/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Archi3
 */
public class PraktikanModel {
    private int npm;
    private String first_name;
    private String last_name;
    private String kelas;
    private int la;
    private int lp;
    private int ujian;
    private int kehadiran;
    public PraktikanModel(){
        
    }
    public PraktikanModel(int npm, String first_name, String last_name, String kelas, int la, int lp, int ujian, int kehadiran){
        this.npm = npm;
        this.first_name = first_name;
        this.last_name = last_name;
        this.kelas = kelas;
    }
    public int getNpm(){
        return npm;
    }
    public String getFirst(){
        return first_name;
    }
    public String getLast(){
        return last_name;
    }
    public String getKelas(){
        return kelas;
    }
    public int getLa(){
        return la;
    }
    public int getLp(){
        return lp;
    }
    public int getUjian(){
        return ujian;
    }
    public int getKehadiran(){
        return kehadiran;
    }
    public void setNpm(int npm){
        this.npm = npm;
    }
    public void setFirst(String first_name){
        this.first_name = first_name;
    }
    public void setLast(String last_name){
        this.last_name = last_name;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setLa(int la){
        this.la = la;
    }
    public void setLp(int lp){
        this.lp = lp;
    }
    public void setUjian(int ujian){
        this.ujian = ujian;
    }
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
}
