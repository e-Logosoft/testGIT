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
 * TlmUnitModel Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmUnitModel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmUnitModel")
public class TlmUnitModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "brand")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String brand;

    @Column(name = "ceilLength")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer ceilLength;

    @Column(name = "comments")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String comments;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "gvwr")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer gvwr;

    @Column(name = "manufacturer")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String manufacturer;

    @Column(name = "model")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String model;

    @Column(name = "modelYear")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer modelYear;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;

    @Column(name = "type")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String type;

    @Column(name = "height")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer height;

    @Column(name = "unitLength")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String unitLength;

    @Column(name = "weight")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer weight;

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
    @JoinColumn(name="unitTypeId")
    private TlmUnitType unitType;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public Integer getCeilLength() {
        return ceilLength;
    }
    
    public void setCeilLength(Integer ceilLength) {
        this.ceilLength = ceilLength;
    }
    
    public String getComments() {
        return comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Integer getGvwr() {
        return gvwr;
    }
    
    public void setGvwr(Integer gvwr) {
        this.gvwr = gvwr;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public Integer getModelYear() {
        return modelYear;
    }
    
    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    public String getUnitLength() {
        return unitLength;
    }
    
    public void setUnitLength(String unitLength) {
        this.unitLength = unitLength;
    }
    
    public Integer getWeight() {
        return weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
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
    
    public TlmUnitType getUnitType() {
        return unitType;
    }
    
    public void setUnitType(TlmUnitType unitType) {
        this.unitType = unitType;
    }
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }


    public TlmUnitModel() {
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
        if (!(obj instanceof TlmUnitModel))
            return false;
        TlmUnitModel equalCheck = (TlmUnitModel) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}