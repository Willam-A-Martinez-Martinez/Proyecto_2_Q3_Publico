package william_martinez_proyecto2_q3;

public class Manejo_user {
    
    User_info[] userInfo;
    
    public Manejo_user(){
        userInfo = new User_info[50];
    }
    
    public  User_info buscar(String username){
        for(User_info eph: userInfo){
            if(eph!=null && username.equalsIgnoreCase(eph.getUsername())){
                return eph;
            }    
        }
        return null;
    }
    
    public boolean agregarUsuario(String username, String nombreUser, String password, char generoUser, int edadUser, boolean active){
        if (buscar(username)==null){
            for (int i=0; i<userInfo.length;i++){
                if(userInfo[i]==null){
                    userInfo[i]= new User_info(username, nombreUser, password, generoUser, edadUser, active);
                    return true;
                }
            }
        }
        return false;
    }
    
}
