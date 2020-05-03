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
@Table(name = "reload_history", catalog = "cyber_center", schema = "")
@NamedQueries({
    @NamedQuery(name = "ReloadHistory.findAll", query = "SELECT r FROM ReloadHistory r"),
    @NamedQuery(name = "ReloadHistory.findBySerial", query = "SELECT r FROM ReloadHistory r WHERE r.serial = :serial"),
    @NamedQuery(name = "ReloadHistory.findByReloadId", query = "SELECT r FROM ReloadHistory r WHERE r.reloadId = :reloadId"),
    @NamedQuery(name = "ReloadHistory.findByNumber", query = "SELECT r FROM ReloadHistory r WHERE r.number = :number"),
    @NamedQuery(name = "ReloadHistory.findByOparator", query = "SELECT r FROM ReloadHistory r WHERE r.oparator = :oparator"),
    @NamedQuery(name = "ReloadHistory.findByAmount", query = "SELECT r FROM ReloadHistory r WHERE r.amount = :amount"),
    @NamedQuery(name = "ReloadHistory.findByRechargeTime", query = "SELECT r FROM ReloadHistory r WHERE r.rechargeTime = :rechargeTime"),
    @NamedQuery(name = "ReloadHistory.findByDate", query = "SELECT r FROM ReloadHistory r WHERE r.date = :date"),
    @NamedQuery(name = "ReloadHistory.findByTransectionId", query = "SELECT r FROM ReloadHistory r WHERE r.transectionId = :transectionId")})
public class ReloadHistory implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "serial")
    private String serial;
    @Column(name = "reload_id")
    private String reloadId;
    @Column(name = "number")
    private String number;
    @Basic(optional = false)
    @Column(name = "oparator")
    private String oparator;
    @Basic(optional = false)
    @Column(name = "amount")
    private String amount;
    @Basic(optional = false)
    @Column(name = "recharge_time")
    private String rechargeTime;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "transection_id")
    private String transectionId;

    public ReloadHistory() {
    }

    public ReloadHistory(String serial) {
        this.serial = serial;
    }

    public ReloadHistory(String serial, String oparator, String amount, String rechargeTime, String date, String transectionId) {
        this.serial = serial;
        this.oparator = oparator;
        this.amount = amount;
        this.rechargeTime = rechargeTime;
        this.date = date;
        this.transectionId = transectionId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        String oldSerial = this.serial;
        this.serial = serial;
        changeSupport.firePropertyChange("serial", oldSerial, serial);
    }

    public String getReloadId() {
        return reloadId;
    }

    public void setReloadId(String reloadId) {
        String oldReloadId = this.reloadId;
        this.reloadId = reloadId;
        changeSupport.firePropertyChange("reloadId", oldReloadId, reloadId);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        String oldNumber = this.number;
        this.number = number;
        changeSupport.firePropertyChange("number", oldNumber, number);
    }

    public String getOparator() {
        return oparator;
    }

    public void setOparator(String oparator) {
        String oldOparator = this.oparator;
        this.oparator = oparator;
        changeSupport.firePropertyChange("oparator", oldOparator, oparator);
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        String oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        String oldRechargeTime = this.rechargeTime;
        this.rechargeTime = rechargeTime;
        changeSupport.firePropertyChange("rechargeTime", oldRechargeTime, rechargeTime);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTransectionId() {
        return transectionId;
    }

    public void setTransectionId(String transectionId) {
        String oldTransectionId = this.transectionId;
        this.transectionId = transectionId;
        changeSupport.firePropertyChange("transectionId", oldTransectionId, transectionId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serial != null ? serial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReloadHistory)) {
            return false;
        }
        ReloadHistory other = (ReloadHistory) object;
        if ((this.serial == null && other.serial != null) || (this.serial != null && !this.serial.equals(other.serial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cybercenter.ReloadHistory[serial=" + serial + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
