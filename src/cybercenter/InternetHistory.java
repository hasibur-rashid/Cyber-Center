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
@Table(name = "internet_history", catalog = "cyber_center", schema = "")
@NamedQueries({
    @NamedQuery(name = "InternetHistory.findAll", query = "SELECT i FROM InternetHistory i"),
    @NamedQuery(name = "InternetHistory.findByMemberId", query = "SELECT i FROM InternetHistory i WHERE i.memberId = :memberId"),
    @NamedQuery(name = "InternetHistory.findByComputerId", query = "SELECT i FROM InternetHistory i WHERE i.computerId = :computerId"),
    @NamedQuery(name = "InternetHistory.findByName", query = "SELECT i FROM InternetHistory i WHERE i.name = :name"),
    @NamedQuery(name = "InternetHistory.findByFaculty", query = "SELECT i FROM InternetHistory i WHERE i.faculty = :faculty"),
    @NamedQuery(name = "InternetHistory.findByOccupation", query = "SELECT i FROM InternetHistory i WHERE i.occupation = :occupation"),
    @NamedQuery(name = "InternetHistory.findByRegno", query = "SELECT i FROM InternetHistory i WHERE i.regno = :regno"),
    @NamedQuery(name = "InternetHistory.findByDate", query = "SELECT i FROM InternetHistory i WHERE i.date = :date"),
    @NamedQuery(name = "InternetHistory.findByStartedTime", query = "SELECT i FROM InternetHistory i WHERE i.startedTime = :startedTime"),
    @NamedQuery(name = "InternetHistory.findByStoppedTime", query = "SELECT i FROM InternetHistory i WHERE i.stoppedTime = :stoppedTime"),
    @NamedQuery(name = "InternetHistory.findByUsedTime", query = "SELECT i FROM InternetHistory i WHERE i.usedTime = :usedTime"),
    @NamedQuery(name = "InternetHistory.findByInternetBill", query = "SELECT i FROM InternetHistory i WHERE i.internetBill = :internetBill"),
    @NamedQuery(name = "InternetHistory.findByOtherBill", query = "SELECT i FROM InternetHistory i WHERE i.otherBill = :otherBill"),
    @NamedQuery(name = "InternetHistory.findByDiscount", query = "SELECT i FROM InternetHistory i WHERE i.discount = :discount"),
    @NamedQuery(name = "InternetHistory.findByTotalCost", query = "SELECT i FROM InternetHistory i WHERE i.totalCost = :totalCost"),
    @NamedQuery(name = "InternetHistory.findByNo", query = "SELECT i FROM InternetHistory i WHERE i.no = :no")})
public class InternetHistory implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "member_id")
    private String memberId;
    @Basic(optional = false)
    @Column(name = "computer_id")
    private String computerId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "faculty")
    private String faculty;
    @Basic(optional = false)
    @Column(name = "occupation")
    private String occupation;
    @Basic(optional = false)
    @Column(name = "regno")
    private String regno;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "started_time")
    private String startedTime;
    @Basic(optional = false)
    @Column(name = "stopped_time")
    private String stoppedTime;
    @Basic(optional = false)
    @Column(name = "used_time")
    private String usedTime;
    @Basic(optional = false)
    @Column(name = "internet_bill")
    private String internetBill;
    @Basic(optional = false)
    @Column(name = "other_bill")
    private String otherBill;
    @Basic(optional = false)
    @Column(name = "discount")
    private String discount;
    @Basic(optional = false)
    @Column(name = "total_cost")
    private String totalCost;
    @Id
    @Basic(optional = false)
    @Column(name = "No")
    private String no;

    public InternetHistory() {
    }

    public InternetHistory(String no) {
        this.no = no;
    }

    public InternetHistory(String no, String memberId, String computerId, String name, String faculty, String occupation, String regno, String date, String startedTime, String stoppedTime, String usedTime, String internetBill, String otherBill, String discount, String totalCost) {
        this.no = no;
        this.memberId = memberId;
        this.computerId = computerId;
        this.name = name;
        this.faculty = faculty;
        this.occupation = occupation;
        this.regno = regno;
        this.date = date;
        this.startedTime = startedTime;
        this.stoppedTime = stoppedTime;
        this.usedTime = usedTime;
        this.internetBill = internetBill;
        this.otherBill = otherBill;
        this.discount = discount;
        this.totalCost = totalCost;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        String oldMemberId = this.memberId;
        this.memberId = memberId;
        changeSupport.firePropertyChange("memberId", oldMemberId, memberId);
    }

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        String oldComputerId = this.computerId;
        this.computerId = computerId;
        changeSupport.firePropertyChange("computerId", oldComputerId, computerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        String oldFaculty = this.faculty;
        this.faculty = faculty;
        changeSupport.firePropertyChange("faculty", oldFaculty, faculty);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        String oldOccupation = this.occupation;
        this.occupation = occupation;
        changeSupport.firePropertyChange("occupation", oldOccupation, occupation);
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        String oldRegno = this.regno;
        this.regno = regno;
        changeSupport.firePropertyChange("regno", oldRegno, regno);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(String startedTime) {
        String oldStartedTime = this.startedTime;
        this.startedTime = startedTime;
        changeSupport.firePropertyChange("startedTime", oldStartedTime, startedTime);
    }

    public String getStoppedTime() {
        return stoppedTime;
    }

    public void setStoppedTime(String stoppedTime) {
        String oldStoppedTime = this.stoppedTime;
        this.stoppedTime = stoppedTime;
        changeSupport.firePropertyChange("stoppedTime", oldStoppedTime, stoppedTime);
    }

    public String getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(String usedTime) {
        String oldUsedTime = this.usedTime;
        this.usedTime = usedTime;
        changeSupport.firePropertyChange("usedTime", oldUsedTime, usedTime);
    }

    public String getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(String internetBill) {
        String oldInternetBill = this.internetBill;
        this.internetBill = internetBill;
        changeSupport.firePropertyChange("internetBill", oldInternetBill, internetBill);
    }

    public String getOtherBill() {
        return otherBill;
    }

    public void setOtherBill(String otherBill) {
        String oldOtherBill = this.otherBill;
        this.otherBill = otherBill;
        changeSupport.firePropertyChange("otherBill", oldOtherBill, otherBill);
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        String oldDiscount = this.discount;
        this.discount = discount;
        changeSupport.firePropertyChange("discount", oldDiscount, discount);
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        String oldTotalCost = this.totalCost;
        this.totalCost = totalCost;
        changeSupport.firePropertyChange("totalCost", oldTotalCost, totalCost);
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        String oldNo = this.no;
        this.no = no;
        changeSupport.firePropertyChange("no", oldNo, no);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InternetHistory)) {
            return false;
        }
        InternetHistory other = (InternetHistory) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cybercenter.InternetHistory[no=" + no + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
