package com.deptinfo.tp3.classes;

// Generated 2014-12-02 13:16:42 by Hibernate Tools 4.3.1

/**
 * BiTypesmembres generated by hbm2java
 */
public class BiTypesmembres implements java.io.Serializable {

	private char typeMembre;
	private String typeDescFr;
	private String typeDescEn;
	private byte nbJoursSurEmprunt;

	public BiTypesmembres() {
	}

	public BiTypesmembres(char typeMembre, String typeDescFr,
			String typeDescEn, byte nbJoursSurEmprunt) {
		this.typeMembre = typeMembre;
		this.typeDescFr = typeDescFr;
		this.typeDescEn = typeDescEn;
		this.nbJoursSurEmprunt = nbJoursSurEmprunt;
	}

	public char getTypeMembre() {
		return this.typeMembre;
	}

	public void setTypeMembre(char typeMembre) {
		this.typeMembre = typeMembre;
	}

	public String getTypeDescFr() {
		return this.typeDescFr;
	}

	public void setTypeDescFr(String typeDescFr) {
		this.typeDescFr = typeDescFr;
	}

	public String getTypeDescEn() {
		return this.typeDescEn;
	}

	public void setTypeDescEn(String typeDescEn) {
		this.typeDescEn = typeDescEn;
	}

	public byte getNbJoursSurEmprunt() {
		return this.nbJoursSurEmprunt;
	}

	public void setNbJoursSurEmprunt(byte nbJoursSurEmprunt) {
		this.nbJoursSurEmprunt = nbJoursSurEmprunt;
	}

}
