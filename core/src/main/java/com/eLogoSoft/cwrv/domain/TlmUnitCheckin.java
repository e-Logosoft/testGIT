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
 * TlmUnitCheckin Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmUnitCheckin")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmUnitCheckin")
public class TlmUnitCheckin implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "checkInDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date checkInDate;

    @Column(name = "city")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String city;

    @Column(name = "countryCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String countryCode;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "etaDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date etaDate;

    @Column(name = "addrLatitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double addrLatitude;

    @Column(name = "addrLongitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double addrLongitude;

    @Column(name = "note")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String note;

    @Column(name = "postalCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String postalCode;

    @Column(name = "stateCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String stateCode;

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

        
    public Date getCheckInDate() {
        return checkInDate;
    }
    
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
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
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Date getEtaDate() {
        return etaDate;
    }
    
    public void setEtaDate(Date etaDate) {
        this.etaDate = etaDate;
    }
    
    public Double getAddrLatitude() {
        return addrLatitude;
    }
    
    public void setAddrLatitude(Double addrLatitude) {
        this.addrLatitude = addrLatitude;
    }
    
    public Double getAddrLongitude() {
        return addrLongitude;
    }
    
    public void setAddrLongitude(Double addrLongitude) {
        this.addrLongitude = addrLongitude;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
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


    public TlmUnitCheckin() {
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
        if (!(obj instanceof TlmUnitCheckin))
            return false;
        TlmUnitCheckin equalCheck = (TlmUnitCheckin) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}