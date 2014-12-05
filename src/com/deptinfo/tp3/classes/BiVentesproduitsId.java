package com.deptinfo.tp3.classes;

// Generated 2014-12-02 13:16:42 by Hibernate Tools 4.3.1

/**
 * BiVentesproduitsId generated by hbm2java
 */
public class BiVentesproduitsId implements java.io.Serializable {

	private int venteId;
	private int codeProduit;

	public BiVentesproduitsId() {
	}

	public BiVentesproduitsId(int venteId, int codeProduit) {
		this.venteId = venteId;
		this.codeProduit = codeProduit;
	}

	public int getVenteId() {
		return this.venteId;
	}

	public void setVenteId(int venteId) {
		this.venteId = venteId;
	}

	public int getCodeProduit() {
		return this.codeProduit;
	}

	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BiVentesproduitsId))
			return false;
		BiVentesproduitsId castOther = (BiVentesproduitsId) other;

		return (this.getVenteId() == castOther.getVenteId())
				&& (this.getCodeProduit() == castOther.getCodeProduit());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getVenteId();
		result = 37 * result + this.getCodeProduit();
		return result;
	}

}