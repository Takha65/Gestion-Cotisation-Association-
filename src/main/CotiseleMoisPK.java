/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author macbookpro
 */
@Embeddable
public class CotiseleMoisPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_membre")
    private int idMembre;
    @Basic(optional = false)
    @Column(name = "mois")
    private String mois;

    public CotiseleMoisPK() {
    }

    public CotiseleMoisPK(int idMembre, String mois) {
        this.idMembre = idMembre;
        this.mois = mois;
    }

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMembre;
        hash += (mois != null ? mois.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotiseleMoisPK)) {
            return false;
        }
        CotiseleMoisPK other = (CotiseleMoisPK) object;
        if (this.idMembre != other.idMembre) {
            return false;
        }
        if ((this.mois == null && other.mois != null) || (this.mois != null && !this.mois.equals(other.mois))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.CotiseleMoisPK[ idMembre=" + idMembre + ", mois=" + mois + " ]";
    }
    
}
