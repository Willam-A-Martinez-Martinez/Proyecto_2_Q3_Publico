/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package william_martinez_proyecto2_q3;

/**
 *
 * @author DELL
 */
public class LoggedUser {
    private User_info loggedUser = null;
    
    public void loggedUser(User_info user){
        loggedUser=user;
    }
    
    public void unloggedUser(){
        loggedUser=null;
    }
    
    public boolean isLogged(){
        return loggedUser!=null;
    }
}
