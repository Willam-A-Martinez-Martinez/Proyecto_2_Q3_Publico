package william_martinez_proyecto2_q3;

import java.time.LocalDateTime;



public class User_info {
    /*
    Para poder crear una cuenta se debe tener los siguientes datos antes (FORMATO EN CLASE PROPUESTO):
- Nombre del usuario (STRING)
- Genero ( M o F para Masculino o Femenino respectivamente ) (CHAR)
- Username (STRING)
- Password (STRING)
- Fecha de entrada al sistema (DATE)  Se tomaria automaticamente de la fecha actual.
- Edad del usuario (INT)

    */
    private String nombreUser, username, password;
    private char generoUser;
    private int edadUser;
    private boolean active;
    private LocalDateTime fechaActual;
    private boolean isActive;
    private String followers[];
    private String following[];
    private int totalFollowers;
    private int totalFollowing;
    

    public User_info(String nombreUser, String username, String password, char generoUser, int edadUser) {
        this.nombreUser = nombreUser;
        this.username = username;
        this.password = password;
        this.generoUser = generoUser;
        this.edadUser = edadUser;
        this.active = true;
        this.fechaActual=LocalDateTime.now();
        this.followers = new String[25];  // Máximo 100 seguidores
        this.following = new String[25];  // Máximo 100 usuarios que sigue
        this.totalFollowers = 0;
        this.totalFollowing = 0;
    }
   

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGeneroUser() {
        return generoUser;
    }

    public void setGeneroUser(char generoUser) {
        this.generoUser = generoUser;
    }

    public int getEdadUser() {
        return edadUser;
    }

    public void setEdadUser(int edadUser) {
        this.edadUser = edadUser;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
      
    public void desactivarCuenta() {
        this.active = false;
    }

    public LocalDateTime getFechaActual() {
        return fechaActual;
    }
      public boolean yaEsFollower(String usernameFollower) {
        for (int i = 0; i < totalFollowers; i++) {
            if (followers[i].equals(usernameFollower)) {
                return true;
            }
        }
        return false;
      }
      
         // Métodos para manejar followers
    public void agregarFollower(String usernameFollower) {
        if (totalFollowers < 100 && !yaEsFollower(usernameFollower)) {
            followers[totalFollowers++] = usernameFollower;
        }
    }
      
      public void agregarFollowing(String usernameFollowing) {
        if (totalFollowing < following.length && !yaSigueA(usernameFollowing)) {
            following[totalFollowing++] = usernameFollowing;
        }
    }
      
      public boolean yaSigueA(String usernameFollowing) {
        for (int i = 0; i < totalFollowing; i++) {
            if (following[i].equals(usernameFollowing)) {
                return true;
            }
        }
        return false;
    }
       
       // Mostrar información del perfil del usuario
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombreUser);
        System.out.println("Género: " + generoUser);
        System.out.println("Username: " + username);
        System.out.println("Edad: " + edadUser);
        System.out.println("Fecha de Entrada: " + fechaActual);
        System.out.println("Estado: " + (isActive ? "Activa" : "Desactivada"));
    }
}

    
    

