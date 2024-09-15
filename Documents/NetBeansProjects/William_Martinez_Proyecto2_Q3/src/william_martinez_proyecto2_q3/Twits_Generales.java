package william_martinez_proyecto2_q3;

public class Twits_Generales {

    private Twits[] twits;  // Arreglo de objetos Twit
    private int contadorDeTwits;

    public Twits_Generales() {
        twits = new Twits[20];
        contadorDeTwits = 0;
    }

    public Twits buscarTwit(String mensaje) {
        for (Twits twit : twits) {
            if (twit != null && twit.getMensaje().equals(mensaje)) {
                return twit;
            }
        }
        return null;
    }

    public boolean agregarTwit(String mensaje, String usuario) {
        if (contadorDeTwits >= twits.length) {
            return false;
        }
        if (buscarTwit(mensaje) == null) {
            twits[contadorDeTwits] = new Twits(mensaje, usuario);
            contadorDeTwits++;
            return true;
        }
        return false;
    }

    public String imprimirTwits() {
        String twitPrint = "";
        for (int i = twits.length - 1; i >= 0; i--) {
            if (twits[i] != null) {
                twitPrint += "   -" + twits[i].getNombreUsuario() + "\n[" + twits[i].getFechaFormateado() + "] " + ": " + twits[i].getMensaje() + "\n-----------------------------------------------\n";
            }
        }
        return twitPrint;
    }

    public Twits[] obtenerTwits() {
        return twits;
    }
}
