package william_martinez_proyecto2_q3;

public class LoggedUser {
    private User_info loggedUser = null;
    
    public void setLoggedUser(User_info user) {
        loggedUser = user;
    }
    
    public User_info getLoggedUser() {
        return loggedUser;
    }
    
    public void unloggedUser(){
        loggedUser=null;
    }
    
    public boolean isLogged(){
        return loggedUser!=null;
    }
}
