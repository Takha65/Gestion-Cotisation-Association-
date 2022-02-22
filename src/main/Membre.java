/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author macbookpro
 */
public class Membre {
    private String prenom,nom,poste,matricule,adresse,etat,adhesion;
    private int numero;

    public String getEtat() {
        return etat;
    }

    public Membre(String prenom, String nom, String poste, String matricule, String adresse, int numero) {
        this.prenom = prenom;
        this.nom = nom;
        this.poste = poste;
        this.matricule = matricule;
        this.adresse = adresse;
        this.numero = numero;
    }
    public Membre(String prenom, String nom, String poste, String matricule, String adresse, int numero,String etat) {
        this.prenom = prenom;
        this.nom = nom;
        this.poste = poste;
        this.matricule = matricule;
        this.adresse = adresse;
        this.numero = numero;
        this.etat=etat;
    }
        public Membre(String prenom, String nom, String poste, String matricule, String adresse, int numero,String etat,String adhesion) {
        this.prenom = prenom;
        this.nom = nom;
        this.poste = poste;
        this.matricule = matricule;
        this.adresse = adresse;
        this.numero = numero;
        this.etat=etat;
        this.adhesion=adhesion;// ceci est la date d'adhesion  du client 
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPoste() {
        return poste;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumero() {
        return numero;
    }
    public String getAdhesion(){
        return adhesion;
    }

    
    
    
}
