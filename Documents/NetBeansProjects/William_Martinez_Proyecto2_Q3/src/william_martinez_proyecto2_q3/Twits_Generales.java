package william_martinez_proyecto2_q3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Twits_Generales {
    
    
    
    private String twits[];
    private int contadorDeTwits;
    private LocalDateTime fechaActual;
    
    public String getFechaHoraFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return this.fechaActual.format(formatter);
    }
    
    public Twits_Generales(){
        twits = new String[20];
        contadorDeTwits=0;
    }
    
    public String buscarTwits(String twit){
    for (String twit1 : twits) {
        if (twit1 != null && twit1.equals(twit)) {
            return twit1;
        }
    }
    return null;
}
    
    public String[] getTwits(){
    int size = 0;
    for (String twit : twits) {
        if (twit != null) {
            size++;
        }
    }
    String[] result = new String[size];
    int index = 0;
    for (String twit : twits) {
        if (twit != null) {
            result[index++] = twit;
        }
    }
    return result;
}

    public boolean agregarTwit(String twit){
        String busquedaTwit = buscarTwits(twit);
        if(busquedaTwit==null){
            twits[contadorDeTwits]=twit;
            contadorDeTwits++;
            return true;
        }
        
        return false;  

    }
    
    public String imprimirTwits(){
        String twitPrint = "";
        for (int i=twits.length-1;i>=0;i--) {
            if (twits[i] != null) {
                twitPrint += twits[i]+"\n"+fechaActual+"\n\n";
            }
        }
        return twitPrint;
    }
    
    
}
