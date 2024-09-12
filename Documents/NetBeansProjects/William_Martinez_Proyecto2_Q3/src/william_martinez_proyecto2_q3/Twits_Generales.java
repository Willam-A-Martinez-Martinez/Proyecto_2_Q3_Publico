package william_martinez_proyecto2_q3;



public class Twits_Generales {
    
    
    
    private String twits[];
    private int contadorDeTwits;
    
    public Twits_Generales(){
        twits = new String[20];
        contadorDeTwits=0;
    }
    
    public String buscarTwits(String twit){
        for (int posicionTwits = 0; posicionTwits < twits.length; posicionTwits++) {
            if(twits[posicionTwits]!=null){
                return twit;
            }
        }
        return null;
    }
    
    public String getTwits(){
        for(String eph: twits){
            if(eph!=null){
                return eph; 
            }
        }
        return null;
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
        for(int i = 0 ; i<twits.length; i++){
            if(twits[i]!=null){
                twitPrint+=twits[i];
            }
        }
        return twitPrint;
    }
    
    
}
