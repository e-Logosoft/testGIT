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
 * TlmEquipment Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmEquipment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmEquipment")
public class TlmEquipment implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "blockDispatch")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean blockDispatch;

    @Column(name = "checkOutDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date checkOutDate;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "depositAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer depositAmount;

    @Column(name = "refundAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer refundAmount;

    @Column(name = "depositReference")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String depositReference;

    @Column(name = "description")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String description;

    @Column(name = "equipmentNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String equipmentNumber;

    @Column(name = "expirationDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date expirationDate;

    @Column(name = "lostCharge")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer lostCharge;

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

    @Column(name = "checkOutUserFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private BigInteger checkOutUserFK;

    @Column(name = "lostApproverFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private BigInteger lostApproverFK;
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="driverId")
    private TlmDriver driver;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;
    
    @ManyToOne
    @JoinColumn(name="equipmentHistoryId")
    private TlmEquipmentHistory equipmentHistory;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public Boolean getBlockDispatch() {
        return blockDispatch;
    }
    
    public void setBlockDispatch(Boolean blockDispatch) {
        this.blockDispatch = blockDispatch;
    }
    
    public Date getCheckOutDate() {
        return checkOutDate;
    }
    
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Integer getDepositAmount() {
        return depositAmount;
    }
    
    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }
    
    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }
    
    public String getDepositReference() {
        return depositReference;
    }
    
    public void setDepositReference(String depositReference) {
        this.depositReference = depositReference;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getEquipmentNumber() {
        return equipmentNumber;
    }
    
    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }
    
    public Date getExpirationDate() {
        return expirationDate;
    }
    
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public Integer getLostCharge() {
        return lostCharge;
    }
    
    public void setLostCharge(Integer lostCharge) {
        this.lostCharge = lostCharge;
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
    
    public BigInteger getCheckOutUserFK() {
        return checkOutUserFK;
    }
    
    public void setCheckOutUserFK(BigInteger checkOutUserFK) {
        this.checkOutUserFK = checkOutUserFK;
    }
    
    public BigInteger getLostApproverFK() {
        return lostApproverFK;
    }
    
    public void setLostApproverFK(BigInteger lostApproverFK) {
        this.lostApproverFK = lostApproverFK;
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
    
    public TlmEquipmentHistory getEquipmentHistory() {
		return equipmentHistory;
	}

	public void setEquipmentHistory(TlmEquipmentHistory equipmentHistory) {
		this.equipmentHistory = equipmentHistory;
	}

	public TlmEquipment() {
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
        if (!(obj instanceof TlmEquipment))
            return false;
        TlmEquipment equalCheck = (TlmEquipment) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}