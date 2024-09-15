package william_martinez_proyecto2_q3;

public class Twits_Personales {
    
    private String twits[];
    private int contadorTwits;
    
    public Twits_Personales(){
        twits = new String[20];
        contadorTwits=0;
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
        if(contadorTwits>=twits.length){
            return false;
        }
        
        if(busquedaTwit==null){
            twits[contadorTwits]=twit;
            contadorTwits++;
            return true;
        }
        
        return false;  

    }
    
    public String imprimirTwits(){
        String twitPrint = "";
        for (String twit : twits) {
            if (twit != null) {
                twitPrint += twit+"\n";
            }
        }
        return twitPrint;
    }
    
    public String[] obtenerTwits() {
        return twits;
    }

    
}
