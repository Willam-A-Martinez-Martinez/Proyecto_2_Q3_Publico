package william_martinez_proyecto2_q3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Twits {
    private String mensaje;
    private String nombreUsuario;
    private LocalDateTime fechaCreacion;

    public Twits(String mensaje, String nombreUsuario) {
        this.mensaje = mensaje;
        this.nombreUsuario=nombreUsuario;
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getFechaFormateado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return fechaCreacion.format(formatter);
    }
}
