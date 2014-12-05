package com.deptinfo.tp3.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.deptinfo.tp3.classes.BiMembres;

@ManagedBean
@SessionScoped
public class ConnexionBean {
	private String login, motPasse;
    private BiMembres membre;
    
//    @ManagedProperty("#{listeJoueurs}")
//    private ListeJoueurs listeJoueurs;

//    public void setListeJoueurs(ListeJoueurs listeJoueurs) {
//        this.listeJoueurs = listeJoueurs;
//    }

    public BiMembres getMembre() {
        return membre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login.trim();
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
  
    public String verifierConnexion() {
        
    	
        membre = listeJoueurs.rechercherJoueur(login);
        return("mauvais-login");
        
//        if (membre == null) {
//          return("mauvais-login");
//        } 
//        else if (!membre.getMotPasse().equals(motPasse)) {
//          return("mauvais-mot-passe");
//        } 
//        else {
//          return("afficher-compte");
//        }
      }

}