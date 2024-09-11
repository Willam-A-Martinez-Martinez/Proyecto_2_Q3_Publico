package william_martinez_proyecto2_q3;

public class Twits {
    
    
    
    private String twits[];
    private int contadorDeTwits;
    
    public Twits(int tamaño){
        twits = new String[tamaño];
        contadorDeTwits=0;
    }
//hi
    
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
    
    
}
