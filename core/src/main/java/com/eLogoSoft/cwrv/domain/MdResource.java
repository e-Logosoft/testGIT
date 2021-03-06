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
 * MdResource Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "MdResource")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "MdResource")
public class MdResource implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "displayEN")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String displayEN;

    @Column(name = "resourceName")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String resourceName;

    @Column(name = "resourceType")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer resourceType;
    
    
    @ManyToOne
    @JoinColumn(name="mdClassId")
    private MdClass mdClass;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getDisplayEN() {
        return displayEN;
    }
    
    public void setDisplayEN(String displayEN) {
        this.displayEN = displayEN;
    }
    
    public String getResourceName() {
        return resourceName;
    }
    
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    public Integer getResourceType() {
        return resourceType;
    }
    
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }
    
    public MdClass getMdClass() {
        return mdClass;
    }
    
    public void setMdClass(MdClass mdClass) {
        this.mdClass = mdClass;
    }


    public MdResource() {
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
        if (!(obj instanceof MdResource))
            return false;
        MdResource equalCheck = (MdResource) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}