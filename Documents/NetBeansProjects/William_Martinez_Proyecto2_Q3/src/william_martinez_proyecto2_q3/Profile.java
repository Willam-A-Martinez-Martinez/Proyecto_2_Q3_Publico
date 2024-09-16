/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package william_martinez_proyecto2_q3;

/**
 *
 * @author Miguel Angel Marin
 */
public class Profile {
    private String username;
    private Following following;
    private Followers followers;

    public Profile(String username) {
        this.username = username;
        this.following = new Following(); // Lista de personas que sigue
        this.followers = new Followers(); // Lista de seguidores
    }

    public void followUser(String otherUsername) {
        following.addFollowing(otherUsername); // Seguir a otro usuario
    }

    public void addFollower(String otherUsername) {
        followers.addFollower(otherUsername); // Agregar un nuevo seguidor
    }

    public void showMyFollowing() {
        following.showFollowing(); // Mostrar a las personas que sigue
    }

    public void showMyFollowers() {
        followers.showFollowers(); // Mostrar a los seguidores
    }
}
