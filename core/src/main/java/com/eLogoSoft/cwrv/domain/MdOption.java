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
 * MdOption Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "MdOption")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "MdOption")
public class MdOption implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "optionCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String optionCode;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "displayEN")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String displayEN;

    @Column(name = "displayOrderEN")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double displayOrderEN;

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
    
    @Column(name = "optionBase")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String optionBase;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
   
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getOptionCode() {
        return optionCode;
    }
    
    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public String getDisplayEN() {
        return displayEN;
    }
    
    public void setDisplayEN(String displayEN) {
        this.displayEN = displayEN;
    }
    
    public Double getDisplayOrderEN() {
        return displayOrderEN;
    }
    
    public void setDisplayOrderEN(Double displayOrderEN) {
        this.displayOrderEN = displayOrderEN;
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

    
    public String getOptionBase() {
		return optionBase;
	}

	public void setOptionBase(String optionBase) {
		this.optionBase = optionBase;
	}

	public UserLogin getAddUser() {
        return addUser;
    }
    
    public void setAddUser(UserLogin addUser) {
        this.addUser = addUser;
    }
    
   
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }


    public MdOption() {
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
        if (!(obj instanceof MdOption))
            return false;
        MdOption equalCheck = (MdOption) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}