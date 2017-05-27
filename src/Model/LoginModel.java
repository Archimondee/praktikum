/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Archi3
 */
public class LoginModel {
    private String username;
    private String password;
    private int npm;
    private String status;
    public LoginModel(){
        
    }
    public LoginModel(String username, String password, int npm, String status){
        this.username = username;
        this.password = password;
        this.npm = npm;
        this.status = status;
    }
    public String getUser(){
        return username;
    }
    public String getPass(){
        return password;
    }
    public int npm(){
        return npm;
    }
    public String status(){
        return status;
    }
    public void setUser(String username){
        this.username = username;
    }
    public void setPass(String password){
        this.password = password;
    }
    public void setNpm(int npm){
        this.npm = npm;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
