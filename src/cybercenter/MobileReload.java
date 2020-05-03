/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cybercenter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Md. Hasibur Rashid
 */
@Entity
@Table(name = "mobile_reload", catalog = "cyber_center", schema = "")
@NamedQueries({
    @NamedQuery(name = "MobileReload.findAll", query = "SELECT m FROM MobileReload m"),
    @NamedQuery(name = "MobileReload.findByReloadId", query = "SELECT m FROM MobileReload m WHERE m.reloadId = :reloadId"),
    @NamedQuery(name = "MobileReload.findByName", query = "SELECT m FROM MobileReload m WHERE m.name = :name"),
    @NamedQuery(name = "MobileReload.findByAddress", query = "SELECT m FROM MobileReload m WHERE m.address = :address"),
    @NamedQuery(name = "MobileReload.findByMob1", query = "SELECT m FROM MobileReload m WHERE m.mob1 = :mob1"),
    @NamedQuery(name = "MobileReload.findByMob2", query = "SELECT m FROM MobileReload m WHERE m.mob2 = :mob2"),
    @NamedQuery(name = "MobileReload.findByMob3", query = "SELECT m FROM MobileReload m WHERE m.mob3 = :mob3"),
    @NamedQuery(name = "MobileReload.findByMob4", query = "SELECT m FROM MobileReload m WHERE m.mob4 = :mob4"),
    @NamedQuery(name = "MobileReload.findByMob5", query = "SELECT m FROM MobileReload m WHERE m.mob5 = :mob5"),
    @NamedQuery(name = "MobileReload.findByMob6", query = "SELECT m FROM MobileReload m WHERE m.mob6 = :mob6")})
public class MobileReload implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "reload_id")
    private String reloadId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "mob1")
    private String mob1;
    @Basic(optional = false)
    @Column(name = "mob2")
    private String mob2;
    @Basic(optional = false)
    @Column(name = "mob3")
    private String mob3;
    @Basic(optional = false)
    @Column(name = "mob4")
    private String mob4;
    @Basic(optional = false)
    @Column(name = "mob5")
    private String mob5;
    @Basic(optional = false)
    @Column(name = "mob6")
    private String mob6;

    public MobileReload() {
    }

    public MobileReload(String reloadId) {
        this.reloadId = reloadId;
    }

    public MobileReload(String reloadId, String name, String address, String mob1, String mob2, String mob3, String mob4, String mob5, String mob6) {
        this.reloadId = reloadId;
        this.name = name;
        this.address = address;
        this.mob1 = mob1;
        this.mob2 = mob2;
        this.mob3 = mob3;
        this.mob4 = mob4;
        this.mob5 = mob5;
        this.mob6 = mob6;
    }

    public String getReloadId() {
        return reloadId;
    }

    public void setReloadId(String reloadId) {
        String oldReloadId = this.reloadId;
        this.reloadId = reloadId;
        changeSupport.firePropertyChange("reloadId", oldReloadId, reloadId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getMob1() {
        return mob1;
    }

    public void setMob1(String mob1) {
        String oldMob1 = this.mob1;
        this.mob1 = mob1;
        changeSupport.firePropertyChange("mob1", oldMob1, mob1);
    }

    public String getMob2() {
        return mob2;
    }

    public void setMob2(String mob2) {
        String oldMob2 = this.mob2;
        this.mob2 = mob2;
        changeSupport.firePropertyChange("mob2", oldMob2, mob2);
    }

    public String getMob3() {
        return mob3;
    }

    public void setMob3(String mob3) {
        String oldMob3 = this.mob3;
        this.mob3 = mob3;
        changeSupport.firePropertyChange("mob3", oldMob3, mob3);
    }

    public String getMob4() {
        return mob4;
    }

    public void setMob4(String mob4) {
        String oldMob4 = this.mob4;
        this.mob4 = mob4;
        changeSupport.firePropertyChange("mob4", oldMob4, mob4);
    }

    public String getMob5() {
        return mob5;
    }

    public void setMob5(String mob5) {
        String oldMob5 = this.mob5;
        this.mob5 = mob5;
        changeSupport.firePropertyChange("mob5", oldMob5, mob5);
    }

    public String getMob6() {
        return mob6;
    }

    public void setMob6(String mob6) {
        String oldMob6 = this.mob6;
        this.mob6 = mob6;
        changeSupport.firePropertyChange("mob6", oldMob6, mob6);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reloadId != null ? reloadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MobileReload)) {
            return false;
        }
        MobileReload other = (MobileReload) object;
        if ((this.reloadId == null && other.reloadId != null) || (this.reloadId != null && !this.reloadId.equals(other.reloadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cybercenter.MobileReload[reloadId=" + reloadId + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
