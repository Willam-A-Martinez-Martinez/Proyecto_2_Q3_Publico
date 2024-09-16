package william_martinez_proyecto2_q3;

public class Followers {

    static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    private String[] followers;
    private int followerCount;

    public Followers() {
        this.followers= new String[25]; 
        this.followerCount=0;
    }
    
    public int getFollowersCount() {
        return followerCount;
    }
    
    public void addFollower() {
        followerCount++;
    }

    public void addFollower(String username) {
        if (followerCount < followers.length) { // Validamos si hay espacio
            if (!isFollower(username)) { // Verifica si ya existe el seguidor
                followers[followerCount] = username;
                followerCount++; // Aumenta el contador de seguidores
                System.out.println(username + " ahora te sigue.");
            } else {
                System.out.println(username + " ya es tu seguidor.");
            }
        } else {
            System.out.println("No puedes tener más seguidores, el límite está lleno.");
        }
    }
     
   // Método para validar si el usuario ya es un seguidor
   public boolean isFollower(String Username) {
          for (int i = 0; i < followerCount; i++) {
            if (followers[i].equals(Username)) {
                return true; // Ya es seguidor
            }
        }
        return false;
    }
     // Método para obtener la lista de seguidores
    public String[] getFollowersList() {
        String[] currentFollowers = new String[followerCount];
        for (int i = 0; i < followerCount; i++) {
            currentFollowers[i] = followers[i];
        }
        return currentFollowers; // Devuelve una copia de la lista actual de seguidores
    }
    //Método para mostrar la lista de seguidores
      public void showFollowers() {
        if (followerCount == 0) {
            System.out.println("No tienes seguidores.");
        } else {
            System.out.println("Tus seguidores son:");
            for (int i = 0; i < followerCount; i++) {
                System.out.println("- " + followers[i]);
            }
        }
    }

    boolean followUser(String usernameToFollow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

