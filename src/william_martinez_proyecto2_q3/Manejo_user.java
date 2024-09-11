package william_martinez_proyecto2_q3;

public class Manejo_user {
    
    User_info[] userInfo;
    private final int totalUsers;
    
    public Manejo_user(){
        userInfo = new User_info[25];
        totalUsers=0;
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
     // Verificacion de si el username es Unico.
    public boolean crearUsuario(String username, String nombreUser, String password, char generoUser, int edadUser){
if (buscar(username) != null) {
        System.out.println("El usuario ya está registrado: " + username);
        return false; // Usuario ya registrado
    }


    // Intentar agregar el nuevo usuario en la primera posición vacía
    for (int i = 0; i < userInfo.length; i++) {
        if (userInfo[i] == null) {
            userInfo[i] = new User_info(username, nombreUser, password, generoUser, edadUser);
            System.out.println("Usuario registrado con éxito: " + username);
            return true;
        }
    }
        return false;
 }
        // Buscar usuario por username
    public User_info buscarUsuario(String username){
        for (int i = 0; i < totalUsers; i++) {
            if (userInfo[i] != null && userInfo[i].getUsername().equals(username)) {
                return userInfo[i];
            }
        }
        return null;
    }

    // Método para que un usuario siga a otro
    public void seguirUsuario(String usernameSeguidor, String usernameSeguido) {
        User_info usuarioSeguidor = buscarUsuario(usernameSeguidor);
        User_info usuarioSeguido = buscarUsuario(usernameSeguido);

        if (usuarioSeguidor != null && usuarioSeguido != null) {
            usuarioSeguidor.agregarFollowing(usernameSeguido);
            usuarioSeguido.agregarFollower(usernameSeguidor);
            System.out.println(usernameSeguidor + " ahora sigue a " + usernameSeguido);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }


      

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
