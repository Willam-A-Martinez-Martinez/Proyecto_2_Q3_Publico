/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package william_martinez_proyecto2_q3;

/**
 *
 * @author DELL
 */
public class Twits_Personales {
    
        private String twits[];
    private int contadorDeTwits;
    
    public Twits_Personales(){
        twits = new String[20];
        contadorDeTwits=0;
    }

    public int getContadorDeTwits() {
        return contadorDeTwits;
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
