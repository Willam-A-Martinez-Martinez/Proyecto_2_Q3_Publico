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
    private Followers followers= new Followers();
    private Following following= new Following();
    
    private String nombreUser, username, password;
    private char generoUser;
    private int edadUser;
    private boolean active;
    private boolean logged;
    private LocalDateTime fechaActual;
    

    public User_info(String nombreUser, String username, String password, char generoUser, int edadUser) {
        this.nombreUser = nombreUser;
        this.username = username;
        this.password = password;
        this.generoUser = generoUser;
        this.edadUser = edadUser;
        active = true;
        logged = false;
        this.fechaActual=LocalDateTime.now();
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }
    
    public void setLogged(boolean logged){
        this.logged = logged;
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

    public LocalDateTime getFechaActual() {
        return fechaActual;
    }
    
    
    
}
