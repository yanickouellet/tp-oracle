package com.deptinfo.tp3.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.deptinfo.tp3.classes.BiMembres;
import com.deptinfo.tp3.classes.MembreUtil;
@ManagedBean
@SessionScoped
public class ConnexionBean {
	private String login, motPasse;
    private BiMembres membre;
    
//    @ManagedProperty("#{listeMembres}")
//    private ListeMembres listeMembres;
//
//    public void setListeJoueurs(ListeMembres listeMembres) {
//        this.listeMembres = listeMembres;
//    }

    public BiMembres getMembre() {
        return membre;
    }

    public String getLogin() {
        return "Bonjour";
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
    	this.login = "sadfdfsa";
        membre = new MembreUtil().getMembreConnectant(login, motPasse);
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