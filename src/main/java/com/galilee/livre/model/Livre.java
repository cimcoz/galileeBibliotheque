package com.galilee.livre.model;

import java.io.Serializable;

public class Livre implements Serializable{
	private static final long serialVersionId = 1L;
	
	private Long livreId;
	private String livreTitre;
	private String livreAuteur;
	private String livreType;
	private String livreCode;
	private int livreNbrExemp;
	private int livreNbrDispo;
	
	public Livre(){}
	
	public Livre(String livreTitre,String livreAuteur,String livreType,String livreCode,
			int livreNbrExemp,int livreNbrDispo){
		this.livreTitre=livreTitre;
		this.livreAuteur=livreAuteur;
		this.livreType=livreType;
		this.livreCode=livreCode;
		this.livreNbrExemp=livreNbrExemp;
		this.livreNbrDispo=livreNbrDispo;
	}

	public Long getLivreId() {
		return livreId;
	}

	public void setLivreId(Long livreId) {
		this.livreId = livreId;
	}

	public String getLivreTitre() {
		return livreTitre;
	}

	public void setLivreTitre(String livreTitre) {
		this.livreTitre = livreTitre;
	}

	public String getLivreAuteur() {
		return livreAuteur;
	}

	public void setLivreAuteur(String livreAuteur) {
		this.livreAuteur = livreAuteur;
	}

	public String getLivreCode() {
		return livreCode;
	}

	public void setLivreCode(String livreCode) {
		this.livreCode = livreCode;
	}

	public int getLivreNbrExemp() {
		return livreNbrExemp;
	}

	public void setLivreNbrExemp(int livreNbrExemp) {
		this.livreNbrExemp = livreNbrExemp;
	}

	public int getLivreNbrDispo() {
		return livreNbrDispo;
	}

	public void setLivreNbrDispo(int livreNbrDispo) {
		this.livreNbrDispo = livreNbrDispo;
	}
	
	public String getLivreType() {
		return livreType;
	}

	public void setLivreType(String livreType) {
		this.livreType = livreType;
	}

	public String toString(){
		String str = "Titre: "+livreTitre+
					"\nAuteur: "+livreAuteur+
					"\nCode: "+livreCode+
					"\nNombre Exemplaire: "+livreNbrExemp+
					"\nNombre Disponible"+livreNbrDispo+"\n";
		return str;
	}
	
	public String toString2(){
		String str = "Id: "+livreId+"\nTitre: "+livreTitre+
					"\nAuteur: "+livreAuteur+
					"\nCode: "+livreCode+"\n";
		return str;
	}
	
}
