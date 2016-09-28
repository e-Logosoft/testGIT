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
 * TlmUnitVerification Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmUnitVerification")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmUnitVerification")
public class TlmUnitVerification implements Serializable {
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

    @Column(name = "notes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String notes;

    @Column(name = "statusCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String statusCode;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;

    @Column(name = "statusDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date statusDate;

    @Column(name = "updateDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date updateDate;

    @Column(name = "version")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer version;

    @Column(name = "unitDispatchFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private BigInteger unitDispatchFK;
    
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserProfile user;
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
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
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getStatusCode() {
        return statusCode;
    }
    
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getStatusDate() {
        return statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
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
    
    public BigInteger getUnitDispatchFK() {
        return unitDispatchFK;
    }
    
    public void setUnitDispatchFK(BigInteger unitDispatchFK) {
        this.unitDispatchFK = unitDispatchFK;
    }
    
    public UserProfile getUser() {
        return user;
    }
    
    public void setUser(UserProfile user) {
        this.user = user;
    }
    
    public UserLogin getAddUser() {
        return addUser;
    }
    
    public void setAddUser(UserLogin addUser) {
        this.addUser = addUser;
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


    public TlmUnitVerification() {
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
        if (!(obj instanceof TlmUnitVerification))
            return false;
        TlmUnitVerification equalCheck = (TlmUnitVerification) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}