/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "Membre", catalog = "Gestion_Cotisation", schema = "")
@NamedQueries({
    @NamedQuery(name = "Membre_1.findAll", query = "SELECT m FROM Membre_1 m")
    , @NamedQuery(name = "Membre_1.findById", query = "SELECT m FROM Membre_1 m WHERE m.id = :id")
    , @NamedQuery(name = "Membre_1.findByPrenom", query = "SELECT m FROM Membre_1 m WHERE m.prenom = :prenom")
    , @NamedQuery(name = "Membre_1.findByNom", query = "SELECT m FROM Membre_1 m WHERE m.nom = :nom")
    , @NamedQuery(name = "Membre_1.findByAdresse", query = "SELECT m FROM Membre_1 m WHERE m.adresse = :adresse")
    , @NamedQuery(name = "Membre_1.findByPoste", query = "SELECT m FROM Membre_1 m WHERE m.poste = :poste")
    , @NamedQuery(name = "Membre_1.findByNumero", query = "SELECT m FROM Membre_1 m WHERE m.numero = :numero")
    , @NamedQuery(name = "Membre_1.findByMatricule", query = "SELECT m FROM Membre_1 m WHERE m.matricule = :matricule")})
public class Membre_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "poste")
    private String poste;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "matricule")
    private String matricule;

    public Membre_1() {
    }

    public Membre_1(Integer id) {
        this.id = id;
    }

    public Membre_1(Integer id, String prenom, String nom, String adresse, String poste, int numero, String matricule) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.poste = poste;
        this.numero = numero;
        this.matricule = matricule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        String oldPrenom = this.prenom;
        this.prenom = prenom;
        changeSupport.firePropertyChange("prenom", oldPrenom, prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        String oldPoste = this.poste;
        this.poste = poste;
        changeSupport.firePropertyChange("poste", oldPoste, poste);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        String oldMatricule = this.matricule;
        this.matricule = matricule;
        changeSupport.firePropertyChange("matricule", oldMatricule, matricule);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membre_1)) {
            return false;
        }
        Membre_1 other = (Membre_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.Membre_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
