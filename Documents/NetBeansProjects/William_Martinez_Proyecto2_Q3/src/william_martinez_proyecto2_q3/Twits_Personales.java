package william_martinez_proyecto2_q3;

public class Twits_Personales {

    private Twits twits[];
    private int contadorTwits;

    public Twits_Personales() {
        twits = new Twits[20];
        contadorTwits = 0;
    }

    public int getContadorTwits() {
        return contadorTwits;
    }

    public Twits buscarTwit(String twitMensaje) {
        for (Twits twit : twits) {
            if (twit != null && twit.getMensaje().equals(twitMensaje)) {
                return twit;
            }
        }
        return null;
    }

    public boolean agregarTwit(String mensaje, String username) {
        if (contadorTwits >= twits.length) {
            return false; // No hay espacio para más twits
        }
        if (buscarTwit(mensaje) == null) {
            twits[contadorTwits] = new Twits(mensaje, username);
            contadorTwits++;
            return true;
        }
        return false;
    }

    public String imprimirTwits() {
        String twitPrint = "";
        for (Twits twit : twits) {
            if (twit != null) {
                twitPrint += "   -"+twit.getNombreUsuario() + "\n[" + twit.getFechaFormateado() + "] " + ": " + twit.getMensaje() + "\n-----------------------------------------------\n";
            }
        }
        return twitPrint;
    }

    public Twits[] obtenerTwits() {
        return twits;
    }

    String[] getTwits() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
