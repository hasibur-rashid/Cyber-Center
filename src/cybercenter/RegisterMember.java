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
@Table(name = "register_member", catalog = "cyber_center", schema = "")
@NamedQueries({
    @NamedQuery(name = "RegisterMember.findAll", query = "SELECT r FROM RegisterMember r"),
    @NamedQuery(name = "RegisterMember.findByName", query = "SELECT r FROM RegisterMember r WHERE r.name = :name"),
    @NamedQuery(name = "RegisterMember.findByOccupation", query = "SELECT r FROM RegisterMember r WHERE r.occupation = :occupation"),
    @NamedQuery(name = "RegisterMember.findByGender", query = "SELECT r FROM RegisterMember r WHERE r.gender = :gender"),
    @NamedQuery(name = "RegisterMember.findByFaculty", query = "SELECT r FROM RegisterMember r WHERE r.faculty = :faculty"),
    @NamedQuery(name = "RegisterMember.findByRegNo", query = "SELECT r FROM RegisterMember r WHERE r.regNo = :regNo"),
    @NamedQuery(name = "RegisterMember.findByContactNo", query = "SELECT r FROM RegisterMember r WHERE r.contactNo = :contactNo"),
    @NamedQuery(name = "RegisterMember.findByMailAddress", query = "SELECT r FROM RegisterMember r WHERE r.mailAddress = :mailAddress"),
    @NamedQuery(name = "RegisterMember.findByAddress", query = "SELECT r FROM RegisterMember r WHERE r.address = :address"),
    @NamedQuery(name = "RegisterMember.findByType", query = "SELECT r FROM RegisterMember r WHERE r.type = :type"),
    @NamedQuery(name = "RegisterMember.findByAddmissionDate", query = "SELECT r FROM RegisterMember r WHERE r.addmissionDate = :addmissionDate"),
    @NamedQuery(name = "RegisterMember.findByMemberId", query = "SELECT r FROM RegisterMember r WHERE r.memberId = :memberId"),
    @NamedQuery(name = "RegisterMember.findByCourseName", query = "SELECT r FROM RegisterMember r WHERE r.courseName = :courseName"),
    @NamedQuery(name = "RegisterMember.findByCourseId", query = "SELECT r FROM RegisterMember r WHERE r.courseId = :courseId"),
    @NamedQuery(name = "RegisterMember.findByCourseFee", query = "SELECT r FROM RegisterMember r WHERE r.courseFee = :courseFee"),
    @NamedQuery(name = "RegisterMember.findByAmountPay", query = "SELECT r FROM RegisterMember r WHERE r.amountPay = :amountPay"),
    @NamedQuery(name = "RegisterMember.findByAmountDue", query = "SELECT r FROM RegisterMember r WHERE r.amountDue = :amountDue"),
    @NamedQuery(name = "RegisterMember.findByImage", query = "SELECT r FROM RegisterMember r WHERE r.image = :image")})
public class RegisterMember implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "occupation")
    private String occupation;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "faculty")
    private String faculty;
    @Column(name = "reg_no")
    private String regNo;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "mail_address")
    private String mailAddress;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "addmission_date")
    private String addmissionDate;
    @Id
    @Basic(optional = false)
    @Column(name = "member_id")
    private String memberId;
    @Basic(optional = false)
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_id")
    private String courseId;
    @Basic(optional = false)
    @Column(name = "course_fee")
    private String courseFee;
    @Basic(optional = false)
    @Column(name = "amount_pay")
    private String amountPay;
    @Column(name = "amount_due")
    private String amountDue;
    @Column(name = "image")
    private String image;

    public RegisterMember() {
    }

    public RegisterMember(String memberId) {
        this.memberId = memberId;
    }

    public RegisterMember(String memberId, String name, String occupation, String gender, String faculty, String contactNo, String address, String type, String addmissionDate, String courseName, String courseFee, String amountPay) {
        this.memberId = memberId;
        this.name = name;
        this.occupation = occupation;
        this.gender = gender;
        this.faculty = faculty;
        this.contactNo = contactNo;
        this.address = address;
        this.type = type;
        this.addmissionDate = addmissionDate;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.amountPay = amountPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        String oldOccupation = this.occupation;
        this.occupation = occupation;
        changeSupport.firePropertyChange("occupation", oldOccupation, occupation);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        String oldFaculty = this.faculty;
        this.faculty = faculty;
        changeSupport.firePropertyChange("faculty", oldFaculty, faculty);
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        String oldRegNo = this.regNo;
        this.regNo = regNo;
        changeSupport.firePropertyChange("regNo", oldRegNo, regNo);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        String oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        String oldMailAddress = this.mailAddress;
        this.mailAddress = mailAddress;
        changeSupport.firePropertyChange("mailAddress", oldMailAddress, mailAddress);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getAddmissionDate() {
        return addmissionDate;
    }

    public void setAddmissionDate(String addmissionDate) {
        String oldAddmissionDate = this.addmissionDate;
        this.addmissionDate = addmissionDate;
        changeSupport.firePropertyChange("addmissionDate", oldAddmissionDate, addmissionDate);
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        String oldMemberId = this.memberId;
        this.memberId = memberId;
        changeSupport.firePropertyChange("memberId", oldMemberId, memberId);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        String oldCourseName = this.courseName;
        this.courseName = courseName;
        changeSupport.firePropertyChange("courseName", oldCourseName, courseName);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        String oldCourseId = this.courseId;
        this.courseId = courseId;
        changeSupport.firePropertyChange("courseId", oldCourseId, courseId);
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        String oldCourseFee = this.courseFee;
        this.courseFee = courseFee;
        changeSupport.firePropertyChange("courseFee", oldCourseFee, courseFee);
    }

    public String getAmountPay() {
        return amountPay;
    }

    public void setAmountPay(String amountPay) {
        String oldAmountPay = this.amountPay;
        this.amountPay = amountPay;
        changeSupport.firePropertyChange("amountPay", oldAmountPay, amountPay);
    }

    public String getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(String amountDue) {
        String oldAmountDue = this.amountDue;
        this.amountDue = amountDue;
        changeSupport.firePropertyChange("amountDue", oldAmountDue, amountDue);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        String oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegisterMember)) {
            return false;
        }
        RegisterMember other = (RegisterMember) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cybercenter.RegisterMember[memberId=" + memberId + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
