package william_martinez_proyecto2_q3;


import java.util.HashMap;
import java.util.Map;
public class Manejo_user {
    
    User_info[] userInfo;
    private final int totalUsers;
     private Map<String, Integer> hashtagTrends; // Para almacenar hashtags y su frecuencia.
    
    
    public Manejo_user(){
        userInfo = new User_info[25];
        totalUsers=0;
        hashtagTrends = new HashMap<>(); // Inicializar el mapa de tendencias de hashtags.
    
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
    
    
    public boolean agregarTwit(String username, String twit) {
        User_info usuario = buscar(username);
        if (usuario != null) {
            return usuario.getTwitsPersonales().agregarTwit(twit, username);
        }
        System.out.println("Usuario no encontrado: " + username);
        return false;
    }

    public String mostrarTwits(String username) {
        User_info usuario = buscar(username);
        if (usuario != null) {
            return usuario.getTwitsPersonales().imprimirTwits();
        }
        return "Usuario no encontrado: " + username;
    }
    
    // Método para extraer hashtags de un twit y almacenarlos en el mapa de tendencias
    private void extraerHashtags(String twit) {
        String[] palabras = twit.split(" ");
        for (String palabra : palabras) {
            if (palabra.startsWith("#")) {
                hashtagTrends.put(palabra, hashtagTrends.getOrDefault(palabra, 0) + 1);
            }
        }
    }

    // Mostrar los hashtags que están en tendencia (trending)
    public void mostrarTrendingHashtags() {
        System.out.println("Hashtags en tendencia:");
        for (Map.Entry<String, Integer> entry : hashtagTrends.entrySet()) {
            System.out.println(entry.getKey() + " - Usado " + entry.getValue() + " veces.");
        }
    }

    // Buscar twits por hashtag sin ArrayList
    public String[] buscarTwitsPorHashtag(String hashtag) {
        String[] twitsConHashtag = new String[100]; // Suponemos que tenemos hasta 100 twits con el hashtag.
        int index = 0;
        
        for (User_info usuario : userInfo) {
            if (usuario != null) {
                String[] twitsUsuario = usuario.getTwitsPersonales().getTwits();
                for (String twit : twitsUsuario) {
                    if (twit != null && twit.contains(hashtag)) {
                        twitsConHashtag[index] = twit;
                        index++;
                    }
                }
            }
        }
        
        // Retornar solo los twits no nulos
        return reducirArreglo(twitsConHashtag, index);
    }
    
    
     // Búsqueda de menciones de un usuario en todos los twits sin ArrayList
    public String[] buscarMenciones(String username) {
        String[] menciones = new String[100]; // Suponemos que hay hasta 100 menciones.
        int index = 0;

        for (User_info usuario : userInfo) {
            if (usuario != null) {
                String[] twitsUsuario = usuario.getTwitsPersonales().getTwits();
                for (String twit : twitsUsuario) {
                    if (twit != null && twit.contains("@" + username)) {
                        menciones[index] = twit;
                        index++;
                    }
                }
            }
        }

        // Retornar solo las menciones no nulas
        return reducirArreglo(menciones, index);
    }

    // Contar cuántas personas han mencionado a un usuario sin ArrayList
    public int contarPersonasQueMencionaron(String username) {
        String[] personasQueMencionaron = new String[100]; // Suponemos que hasta 100 personas lo han mencionado.
        int index = 0;

        for (User_info usuario : userInfo) {
            if (usuario != null) {
                String[] twitsUsuario = usuario.getTwitsPersonales().getTwits();
                for (String twit : twitsUsuario) {
                    if (twit != null && twit.contains("@" + username)) {
                        if (!existeEnArreglo(personasQueMencionaron, usuario.getUsername())) {
                            personasQueMencionaron[index] = usuario.getUsername();
                            index++;
                        }
                    }
                }
            }
        }

        return index; // El índice representa la cantidad de personas que mencionaron al usuario.
    }
    
    public  User_info buscarLogged(String username, String contraseña){
        for(User_info eph: userInfo){
            if(eph!=null && username.equals(eph.getUsername()) && contraseña.equals(eph.getPassword())){
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
    
      // Mostrar la lista de todos los usuarios
    public void mostrarUsuarios() {
        System.out.println("Usuarios en el sistema:");
        for (int i = 0; i < totalUsers; i++) {
            if (userInfo[i] != null) {
                System.out.println("- " + userInfo[i].getUsername());
            }
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

    private boolean existeEnArreglo(String[] personasQueMencionaron, String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String[] reducirArreglo(String[] menciones, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
}
