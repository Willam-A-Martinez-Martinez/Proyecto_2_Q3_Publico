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

    public User_info(String nombreUser, String username, String password, char generoUser, int edadUser) {
        this.nombreUser = nombreUser;
        this.username = username;
        this.password = password;
        this.generoUser = generoUser;
        this.edadUser = edadUser;
        this.active = true;
        this.fechaActual=LocalDateTime.now();
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

    public LocalDateTime getFechaActual() {
        return fechaActual;
    }
    
    
    
}
