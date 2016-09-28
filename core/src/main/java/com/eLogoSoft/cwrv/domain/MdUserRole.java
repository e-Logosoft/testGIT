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
 * MdUserRole Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "MdUserRole")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "MdUserRole")
public class MdUserRole implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    
    
    
    @ManyToOne
    @JoinColumn(name="roleId")
    private MdPath role;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserProfile user;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public MdPath getRole() {
        return role;
    }
    
    public void setRole(MdPath role) {
        this.role = role;
    }
    
    public UserProfile getUser() {
        return user;
    }
    
    public void setUser(UserProfile user) {
        this.user = user;
    }


    public MdUserRole() {
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
        if (!(obj instanceof MdUserRole))
            return false;
        MdUserRole equalCheck = (MdUserRole) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}