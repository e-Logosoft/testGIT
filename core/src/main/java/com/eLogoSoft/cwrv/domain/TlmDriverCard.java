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
 * TlmDriverCard Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmDriverCard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmDriverCard")
public class TlmDriverCard implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "cancelledDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date cancelledDate;

    @Column(name = "cancelledReason")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String cancelledReason;

    @Column(name = "cardExpiration")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date cardExpiration;

    @Column(name = "comdataCardNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String comdataCardNumber;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "issuedDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date issuedDate;

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

    @Column(name = "cancelledByFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String cancelledByFK;

    @Column(name = "issuedByFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String issuedByFK;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="driverId")
    private TlmDriver driver;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public Date getCancelledDate() {
        return cancelledDate;
    }
    
    public void setCancelledDate(Date cancelledDate) {
        this.cancelledDate = cancelledDate;
    }
    
    public String getCancelledReason() {
        return cancelledReason;
    }
    
    public void setCancelledReason(String cancelledReason) {
        this.cancelledReason = cancelledReason;
    }
    
    public Date getCardExpiration() {
        return cardExpiration;
    }
    
    public void setCardExpiration(Date cardExpiration) {
        this.cardExpiration = cardExpiration;
    }
    
    public String getComdataCardNumber() {
        return comdataCardNumber;
    }
    
    public void setComdataCardNumber(String comdataCardNumber) {
        this.comdataCardNumber = comdataCardNumber;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Date getIssuedDate() {
        return issuedDate;
    }
    
    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
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
    
    public String getCancelledByFK() {
        return cancelledByFK;
    }
    
    public void setCancelledByFK(String cancelledByFK) {
        this.cancelledByFK = cancelledByFK;
    }
    
    public String getIssuedByFK() {
        return issuedByFK;
    }
    
    public void setIssuedByFK(String issuedByFK) {
        this.issuedByFK = issuedByFK;
    }
    
    public UserLogin getAddUser() {
        return addUser;
    }
    
    public void setAddUser(UserLogin addUser) {
        this.addUser = addUser;
    }
    
    public TlmDriver getDriver() {
        return driver;
    }
    
    public void setDriver(TlmDriver driver) {
        this.driver = driver;
    }
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }


    public TlmDriverCard() {
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
        if (!(obj instanceof TlmDriverCard))
            return false;
        TlmDriverCard equalCheck = (TlmDriverCard) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}