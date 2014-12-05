package com.deptinfo.tp3.classes;

// Generated 2014-12-02 13:16:42 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BiEmprunts generated by hbm2java
 */
public class BiEmprunts implements java.io.Serializable {

	private int empruntId;
	private BiCopiesarticles biCopiesarticles;
	private BiMembres biMembres;
	private BiModespaiements biModespaiements;
	private Date dateEmprunt;
	private Date dateRetourPrevue;
	private Date dateRetour;
	private Integer nbJoursDeRetard;
	private BigDecimal amendeParJour;
	private char indicateurPerte;
	private BigDecimal prixUnitaire;
	private BigDecimal totalAmende;
	private Set biCommentaireses = new HashSet(0);

	public BiEmprunts() {
	}

	public BiEmprunts(int empruntId, BiCopiesarticles biCopiesarticles,
			BiMembres biMembres, Date dateEmprunt, Date dateRetourPrevue,
			BigDecimal amendeParJour, char indicateurPerte,
			BigDecimal prixUnitaire) {
		this.empruntId = empruntId;
		this.biCopiesarticles = biCopiesarticles;
		this.biMembres = biMembres;
		this.dateEmprunt = dateEmprunt;
		this.dateRetourPrevue = dateRetourPrevue;
		this.amendeParJour = amendeParJour;
		this.indicateurPerte = indicateurPerte;
		this.prixUnitaire = prixUnitaire;
	}

	public BiEmprunts(int empruntId, BiCopiesarticles biCopiesarticles,
			BiMembres biMembres, BiModespaiements biModespaiements,
			Date dateEmprunt, Date dateRetourPrevue, Date dateRetour,
			Integer nbJoursDeRetard, BigDecimal amendeParJour,
			char indicateurPerte, BigDecimal prixUnitaire,
			BigDecimal totalAmende, Set biCommentaireses) {
		this.empruntId = empruntId;
		this.biCopiesarticles = biCopiesarticles;
		this.biMembres = biMembres;
		this.biModespaiements = biModespaiements;
		this.dateEmprunt = dateEmprunt;
		this.dateRetourPrevue = dateRetourPrevue;
		this.dateRetour = dateRetour;
		this.nbJoursDeRetard = nbJoursDeRetard;
		this.amendeParJour = amendeParJour;
		this.indicateurPerte = indicateurPerte;
		this.prixUnitaire = prixUnitaire;
		this.totalAmende = totalAmende;
		this.biCommentaireses = biCommentaireses;
	}

	public int getEmpruntId() {
		return this.empruntId;
	}

	public void setEmpruntId(int empruntId) {
		this.empruntId = empruntId;
	}

	public BiCopiesarticles getBiCopiesarticles() {
		return this.biCopiesarticles;
	}

	public void setBiCopiesarticles(BiCopiesarticles biCopiesarticles) {
		this.biCopiesarticles = biCopiesarticles;
	}

	public BiMembres getBiMembres() {
		return this.biMembres;
	}

	public void setBiMembres(BiMembres biMembres) {
		this.biMembres = biMembres;
	}

	public BiModespaiements getBiModespaiements() {
		return this.biModespaiements;
	}

	public void setBiModespaiements(BiModespaiements biModespaiements) {
		this.biModespaiements = biModespaiements;
	}

	public Date getDateEmprunt() {
		return this.dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetourPrevue() {
		return this.dateRetourPrevue;
	}

	public void setDateRetourPrevue(Date dateRetourPrevue) {
		this.dateRetourPrevue = dateRetourPrevue;
	}

	public Date getDateRetour() {
		return this.dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Integer getNbJoursDeRetard() {
		return this.nbJoursDeRetard;
	}

	public void setNbJoursDeRetard(Integer nbJoursDeRetard) {
		this.nbJoursDeRetard = nbJoursDeRetard;
	}

	public BigDecimal getAmendeParJour() {
		return this.amendeParJour;
	}

	public void setAmendeParJour(BigDecimal amendeParJour) {
		this.amendeParJour = amendeParJour;
	}

	public char getIndicateurPerte() {
		return this.indicateurPerte;
	}

	public void setIndicateurPerte(char indicateurPerte) {
		this.indicateurPerte = indicateurPerte;
	}

	public BigDecimal getPrixUnitaire() {
		return this.prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public BigDecimal getTotalAmende() {
		return this.totalAmende;
	}

	public void setTotalAmende(BigDecimal totalAmende) {
		this.totalAmende = totalAmende;
	}

	public Set getBiCommentaireses() {
		return this.biCommentaireses;
	}

	public void setBiCommentaireses(Set biCommentaireses) {
		this.biCommentaireses = biCommentaireses;
	}

}