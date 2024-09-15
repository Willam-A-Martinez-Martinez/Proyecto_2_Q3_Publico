package william_martinez_proyecto2_q3;

public class Twits_Timeline {

    private Twits_Generales twitsGenerales;

    // Constructor para recibir los twits generales
    public Twits_Timeline(Twits_Generales twitsGenerales) {
        this.twitsGenerales = twitsGenerales;
    }

    // Método para mostrar el timeline del usuario
    public String mostrarTimeline(User_info usuario) {
    String timelineContent = "Timeline de " + usuario.getUsername() + ":\n";
    String[] followingList = usuario.getFollowing();
    
    Twits[] todosLosTwits = twitsGenerales.obtenerTwits();
    
    for (int i = todosLosTwits.length - 1; i >= 0; i--) {
        Twits twit = todosLosTwits[i];
        if (twit != null) {
            String autorTwit = twit.getNombreUsuario();
            if (autorTwit.equals(usuario.getUsername()) || isInFollowingList(autorTwit, followingList)) {
                timelineContent += "   -" + autorTwit + "\n[" + twit.getFechaFormateado() + "]: " + twit.getMensaje() + "\n";
                timelineContent += "-----------------------------------------------\n";
            }
        }
    }
    return timelineContent;
}

    // Método para verificar si el autor del twit está en la lista de usuarios seguidos
    private boolean isInFollowingList(String autorTwit, String[] followingList) {
        for (String following : followingList) {
            if (following != null && following.equals(autorTwit)) {
                return true; // El autor del twit está siendo seguido
            }
        }
        return false;
    }
}
