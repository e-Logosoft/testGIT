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
 * TmDelayedUnitClaim Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TmDelayedUnitClaim")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TmDelayedUnitClaim")
public class TmDelayedUnitClaim implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "checkAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer checkAmount;

    @Column(name = "checkDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date checkDate;

    @Column(name = "damageDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date damageDate;

    @Column(name = "checkNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String checkNumber;

    @Column(name = "checkPayableTo")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String checkPayableTo;

    @Column(name = "claimAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer claimAmount;

    @Column(name = "closed")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean closed;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "notes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String notes;

    @Column(name = "particularDamageAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer particularDamageAmount;

    @Column(name = "particularDamages")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String particularDamages;

    @Column(name = "paymentDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date paymentDate;

    @Column(name = "paymentMode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String paymentMode;

    @Column(name = "repairInvoiceNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String repairInvoiceNumber;

    @Column(name = "repairOrderNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String repairOrderNumber;

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

    @Column(name = "delayedUnitDamageFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private BigInteger delayedUnitDamageFK;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="delayedUnitId")
    private TlmDelayedUnit delayedUnit;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public Integer getCheckAmount() {
        return checkAmount;
    }
    
    public void setCheckAmount(Integer checkAmount) {
        this.checkAmount = checkAmount;
    }
    
    public Date getCheckDate() {
        return checkDate;
    }
    
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getDamageDate() {
        return damageDate;
    }
    
    public void setDamageDate(Date damageDate) {
        this.damageDate = damageDate;
    }
    
    public String getCheckNumber() {
        return checkNumber;
    }
    
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
    
    public String getCheckPayableTo() {
        return checkPayableTo;
    }
    
    public void setCheckPayableTo(String checkPayableTo) {
        this.checkPayableTo = checkPayableTo;
    }
    
    public Integer getClaimAmount() {
        return claimAmount;
    }
    
    public void setClaimAmount(Integer claimAmount) {
        this.claimAmount = claimAmount;
    }
    
    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
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
    
    public Integer getParticularDamageAmount() {
        return particularDamageAmount;
    }
    
    public void setParticularDamageAmount(Integer particularDamageAmount) {
        this.particularDamageAmount = particularDamageAmount;
    }
    
    public String getParticularDamages() {
        return particularDamages;
    }
    
    public void setParticularDamages(String particularDamages) {
        this.particularDamages = particularDamages;
    }
    
    public Date getPaymentDate() {
        return paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public String getPaymentMode() {
        return paymentMode;
    }
    
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    public String getRepairInvoiceNumber() {
        return repairInvoiceNumber;
    }
    
    public void setRepairInvoiceNumber(String repairInvoiceNumber) {
        this.repairInvoiceNumber = repairInvoiceNumber;
    }
    
    public String getRepairOrderNumber() {
        return repairOrderNumber;
    }
    
    public void setRepairOrderNumber(String repairOrderNumber) {
        this.repairOrderNumber = repairOrderNumber;
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
    
    public BigInteger getDelayedUnitDamageFK() {
        return delayedUnitDamageFK;
    }
    
    public void setDelayedUnitDamageFK(BigInteger delayedUnitDamageFK) {
        this.delayedUnitDamageFK = delayedUnitDamageFK;
    }
    
    public UserLogin getAddUser() {
        return addUser;
    }
    
    public void setAddUser(UserLogin addUser) {
        this.addUser = addUser;
    }
    
    public TlmDelayedUnit getDelayedUnit() {
        return delayedUnit;
    }
    
    public void setDelayedUnit(TlmDelayedUnit delayedUnit) {
        this.delayedUnit = delayedUnit;
    }
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }


    public TmDelayedUnitClaim() {
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
        if (!(obj instanceof TmDelayedUnitClaim))
            return false;
        TmDelayedUnitClaim equalCheck = (TmDelayedUnitClaim) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}