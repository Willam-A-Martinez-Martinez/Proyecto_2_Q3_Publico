package william_martinez_proyecto2_q3;

public class Twits {
    
    
    
    private String twits[];
    private int contadorDeTwits;
    
    public Twits(){
        twits = new String[20];
        contadorDeTwits=0;
    }
    
    public boolean buscarTwits(String twit){
        for (int posicionTwits = 0; posicionTwits < twits.length; posicionTwits++) {
            if(twits[posicionTwits]!=null){
                return true;
            }
        }
        return false;
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
        for(int i=0; twits.length>i ; i++){
            if(twits[i].equals(twit)){
                return false;
            }
        }
        
        if(contadorDeTwits<twits.length){
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
