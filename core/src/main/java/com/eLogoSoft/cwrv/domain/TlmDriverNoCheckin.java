package com.eLogoSoft.cwrv.domain;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.Id;
import java.util.Date;
import java.math.*;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 * TlmDriverNoCheckin Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmDriverNoCheckin")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmDriverNoCheckin")
public class TlmDriverNoCheckin implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "missedDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date missedDate;

    @Column(name = "notes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String notes;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;

    @Column(name = "updateDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date updateDate;

    @Column(name = "version")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer version;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="dispatchId")
    private TlmUnitDispatch dispatch;
    
    @ManyToOne
    @JoinColumn(name="driverId")
    private TlmDriver driver;
    
    @ManyToOne
    @JoinColumn(name="unitId")
    private TlmUnit unit;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Date getMissedDate() {
        return missedDate;
    }
    
    public void setMissedDate(Date missedDate) {
        this.missedDate = missedDate;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getUpdateDate() {
        return updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
    public Integer getVersion() {
        return version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public UserLogin getAddUser() {
        return addUser;
    }
    
    public void setAddUser(UserLogin addUser) {
        this.addUser = addUser;
    }
    
    public TlmUnitDispatch getDispatch() {
        return dispatch;
    }
    
    public void setDispatch(TlmUnitDispatch dispatch) {
        this.dispatch = dispatch;
    }
    
    public TlmDriver getDriver() {
        return driver;
    }
    
    public void setDriver(TlmDriver driver) {
        this.driver = driver;
    }
    
    public TlmUnit getUnit() {
        return unit;
    }
    
    public void setUnit(TlmUnit unit) {
        this.unit = unit;
    }
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }


    public TlmDriverNoCheckin() {
    }


    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("id=[").append(id).append("] ");
        return buffer.toString();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
        return result;
    }


    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof TlmDriverNoCheckin))
            return false;
        TlmDriverNoCheckin equalCheck = (TlmDriverNoCheckin) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}