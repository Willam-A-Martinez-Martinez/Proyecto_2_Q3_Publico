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
        System.out.println("Usuario no encontrado: " + username);
        return null;
    }
    
    public  User_info buscarLogIn(String username, String password){
        for(User_info eph: userInfo){
            if(eph!=null && username.equals(eph.getUsername()) && password.equals(eph.getPassword())){
                return eph;
            }    
        }
        System.out.println("Usuario no encontrado: " + username);
        return null;
    }
    
    public boolean agregarUsuario(String username, String nombreUser, String password, char generoUser, int edadUser) {
        if (buscar(username) != null) {
            System.out.println("El usuario ya esta registrado");
            return false;
        }
        
        for (int i = 0; i < userInfo.length; i++) {
            if (userInfo[i] == null) {
                userInfo[i] = new User_info(nombreUser, username, password, generoUser, edadUser);
                System.out.println("Usuario registrado exitosamente:" +username);
                return true;
            }
        }
        
        System.out.println("No se puede registrar al usuario");
        return false;
    }





//    if (buscar(username) != null) {
//        System.out.println("El usuario ya está registrado: " + username);
//        return false; // Usuario ya registrado
//    }
//
//    // Intentar agregar el nuevo usuario en la primera posición vacía
//    for (int i = 0; i < userInfo.length; i++) {
//        if (userInfo[i] == null) {
//            userInfo[i] = new User_info(username, nombreUser, password, generoUser, edadUser);
//            System.out.println("Usuario registrado con éxito: " + username);
//            return true;
//        }
//    }
//    
//    // Si el arreglo está lleno
//    System.out.println("No se puede registrar al usuario, el sistema está lleno.");
//    return false;


//        if (buscar(username)==null){
//            for (int i=0; i<userInfo.length;i++){
//                if(userInfo[i]==null){
//                    userInfo[i]= new User_info(username, nombreUser, password, generoUser, edadUser);
//                    return true;
//                }
//            }
//        }
//        return false;
    }
