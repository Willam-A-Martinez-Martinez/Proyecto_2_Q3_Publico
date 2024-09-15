package william_martinez_proyecto2_q3;

public class Following {
    private String[] following;
    private int followingTotal;
    
        public Following() {
            this.following = new String[25];
            this.followingTotal=0;
        }
         
    public int getFollowingCount() {
        return followingTotal;
    }
    
    public void addFollowing() {
        followingTotal++;
    }

        
 // Método para agregar un usuario a la lista de siguiendo si no está ya en la lista
    public void addFollowing(String username) {
        if (followingTotal < following.length) { // Verificamos si hay espacio
            if (!isFollowing(username)) { // Verifica si ya está siguiendo al usuario
                following[followingTotal] = username;
                followingTotal++; // Aumentamos el contador de siguiendo
                System.out.println("Ahora sigues a " + username + ".");
            } else {
                System.out.println("Ya sigues a " + username + ".");
            }
        } else {
            System.out.println("No puedes seguir a más personas, el límite está lleno.");
        }
    }

    // Método para validar si el usuario ya está siendo seguido
    private boolean isFollowing(String username) {
        for (int i = 0; i < followingTotal; i++) {
            if (following[i].equals(username)) {
                return true; // Ya sigue a este usuario
            }
        }
        return false;
    }

    // Método para obtener la lista de personas que está siguiendo
    public String[] getFollowingList() {
        String[] currentFollowing = new String[followingTotal];
        for (int i = 0; i < followingTotal; i++) {
            currentFollowing[i] = following[i];
        }
        return currentFollowing; // Devuelve una copia de la lista actual de siguiendo
    }

    // Método para mostrar la lista de personas que está siguiendo
    public void showFollowing() {
        if (followingTotal == 0) {
            System.out.println("No estás siguiendo a nadie.");
        } else {
            System.out.println("Estás siguiendo a:");
            for (int i = 0; i < followingTotal; i++) {
                System.out.println("- " + following[i]);
            }
        }
    }       
        
}

        
