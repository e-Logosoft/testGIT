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
 * TlmDriverGarnishment Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmDriverGarnishment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmDriverGarnishment")
public class TlmDriverGarnishment implements Serializable {
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

    @Column(name = "checkStubText")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String checkStubText;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "maximumAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer maximumAmount;

    @Column(name = "name")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String name;

    @Column(name = "next")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean next;

    @Column(name = "percentage")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double percentage;

    @Column(name = "period")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String period;

    @Column(name = "periodAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer periodAmount;

    @Column(name = "sequence")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer sequence;

    @Column(name = "setAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer setAmount;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;

    @Column(name = "totalAmount")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer totalAmount;

    @Column(name = "updateDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date updateDate;

    @Column(name = "version")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer version;

    @Column(name = "city")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String city;

    @Column(name = "countryCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String countryCode;

    @Column(name = "postalCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String postalCode;

    @Column(name = "stateCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String stateCode;

    @Column(name = "address1")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String address1;

    @Column(name = "address2")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String address2;
    
    
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

        
    public Integer getCheckAmount() {
        return checkAmount;
    }
    
    public void setCheckAmount(Integer checkAmount) {
        this.checkAmount = checkAmount;
    }
    
    public String getCheckStubText() {
        return checkStubText;
    }
    
    public void setCheckStubText(String checkStubText) {
        this.checkStubText = checkStubText;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Integer getMaximumAmount() {
        return maximumAmount;
    }
    
    public void setMaximumAmount(Integer maximumAmount) {
        this.maximumAmount = maximumAmount;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean getNext() {
        return next;
    }
    
    public void setNext(Boolean next) {
        this.next = next;
    }
    
    public Double getPercentage() {
        return percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }
    
    public Integer getPeriodAmount() {
        return periodAmount;
    }
    
    public void setPeriodAmount(Integer periodAmount) {
        this.periodAmount = periodAmount;
    }
    
    public Integer getSequence() {
        return sequence;
    }
    
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    
    public Integer getSetAmount() {
        return setAmount;
    }
    
    public void setSetAmount(Integer setAmount) {
        this.setAmount = setAmount;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Integer getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
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
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getStateCode() {
        return stateCode;
    }
    
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
    
    public String getAddress1() {
        return address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
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


    public TlmDriverGarnishment() {
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
        if (!(obj instanceof TlmDriverGarnishment))
            return false;
        TlmDriverGarnishment equalCheck = (TlmDriverGarnishment) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}