/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "cotise_le_Mois", catalog = "Gestion_Cotisation", schema = "")
@NamedQueries({
    @NamedQuery(name = "CotiseleMois.findAll", query = "SELECT c FROM CotiseleMois c")
    , @NamedQuery(name = "CotiseleMois.findByIdMembre", query = "SELECT c FROM CotiseleMois c WHERE c.cotiseleMoisPK.idMembre = :idMembre")
    , @NamedQuery(name = "CotiseleMois.findByMois", query = "SELECT c FROM CotiseleMois c WHERE c.cotiseleMoisPK.mois = :mois")})
public class CotiseleMois implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotiseleMoisPK cotiseleMoisPK;

    public CotiseleMois() {
    }

    public CotiseleMois(CotiseleMoisPK cotiseleMoisPK) {
        this.cotiseleMoisPK = cotiseleMoisPK;
    }

    public CotiseleMois(int idMembre, String mois) {
        this.cotiseleMoisPK = new CotiseleMoisPK(idMembre, mois);
    }

    public CotiseleMoisPK getCotiseleMoisPK() {
        return cotiseleMoisPK;
    }

    public void setCotiseleMoisPK(CotiseleMoisPK cotiseleMoisPK) {
        this.cotiseleMoisPK = cotiseleMoisPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotiseleMoisPK != null ? cotiseleMoisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotiseleMois)) {
            return false;
        }
        CotiseleMois other = (CotiseleMois) object;
        if ((this.cotiseleMoisPK == null && other.cotiseleMoisPK != null) || (this.cotiseleMoisPK != null && !this.cotiseleMoisPK.equals(other.cotiseleMoisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.CotiseleMois[ cotiseleMoisPK=" + cotiseleMoisPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
