package com.eLogoSoft.cwrv.domain;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Date;
import java.math.*;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 * TlmYard Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmYard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmYard")
public class TlmYard implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "bolDirections")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String bolDirections;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "deliveryInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryInstructions;

    @Column(name = "manager")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String manager;

    @Column(name = "supervisor")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String supervisor;

    @Column(name = "directions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String directions;

    @Column(name = "fax")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String fax;

    @Column(name = "hours")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String hours;

    @Column(name = "name")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String name;

    @Column(name = "openDays")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String openDays;

    @Column(name = "outbound")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean outbound;

    @Column(name = "phone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String phone;

    @Column(name = "pickupInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupInstructions;

    @Column(name = "reload")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean reload;

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

    @Column(name = "city")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String city;

    @Column(name = "countryCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String countryCode;

    @Column(name = "addrLatitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double addrLatitude;

    @Column(name = "addrLongitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double addrLongitude;

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
    
    @Column(name = "sunday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean sunday;
    
    @Column(name = "monday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean monday;
    
    @Column(name = "tuesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean tuesday;
    
    @Column(name = "wednesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean wednesday;
    
    @Column(name = "thursday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean thursday;
    
    @Column(name = "friday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean friday;
    
    @Column(name = "saturday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean saturday;
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="managerUserId")
    private UserProfile managerUser;
    
    @ManyToOne
    @JoinColumn(name="printerGroupId")
    private TlmPrinterGroup printerGroup;
    
    @ManyToOne
    @JoinColumn(name="supervisorUserId")
    private UserProfile supervisorUser;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;
    
    @ManyToOne
    @JoinColumn(name="stateId")
    private MdOption state;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getBolDirections() {
        return bolDirections;
    }
    
    public void setBolDirections(String bolDirections) {
        this.bolDirections = bolDirections;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }
    
    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }
    
    public String getDirections() {
        return directions;
    }
    
    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getManager() {
        return manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getSupervisor() {
        return supervisor;
    }
    
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    public String getFax() {
        return fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getHours() {
        return hours;
    }
    
    public void setHours(String hours) {
        this.hours = hours;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getOpenDays() {
        return openDays;
    }
    
    public void setOpenDays(String openDays) {
        this.openDays = openDays;
    }
    
    public Boolean getOutbound() {
        return outbound;
    }
    
    public void setOutbound(Boolean outbound) {
        this.outbound = outbound;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPickupInstructions() {
        return pickupInstructions;
    }
    
    public void setPickupInstructions(String pickupInstructions) {
        this.pickupInstructions = pickupInstructions;
    }
    
    public Boolean getReload() {
        return reload;
    }
    
    public void setReload(Boolean reload) {
        this.reload = reload;
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
    
    public UserProfile getManagerUser() {
        return managerUser;
    }
    
    public void setManagerUser(UserProfile managerUser) {
        this.managerUser = managerUser;
    }
    
    public TlmPrinterGroup getPrinterGroup() {
        return printerGroup;
    }
    
    public void setPrinterGroup(TlmPrinterGroup printerGroup) {
        this.printerGroup = printerGroup;
    }
    
    public UserProfile getSupervisorUser() {
        return supervisorUser;
    }
    
    public void setSupervisorUser(UserProfile supervisorUser) {
        this.supervisorUser = supervisorUser;
    }
    
    public UserLogin getUpdateUser() {
        return updateUser;
    }
    
    public void setUpdateUser(UserLogin updateUser) {
        this.updateUser = updateUser;
    }
    
    public MdOption getState() {
		return state;
	}

	public void setState(MdOption state) {
		this.state = state;
	}
	

	public Boolean getSunday() {
		return sunday;
	}

	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}

	public Boolean getMonday() {
		return monday;
	}

	public void setMonday(Boolean monday) {
		this.monday = monday;
	}

	public Boolean getTuesday() {
		return tuesday;
	}

	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}

	public Boolean getWednesday() {
		return wednesday;
	}

	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}

	public Boolean getThursday() {
		return thursday;
	}

	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}

	public Boolean getFriday() {
		return friday;
	}

	public void setFriday(Boolean friday) {
		this.friday = friday;
	}

	public Boolean getSaturday() {
		return saturday;
	}

	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}

	public TlmYard() {
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
        if (!(obj instanceof TlmYard))
            return false;
        TlmYard equalCheck = (TlmYard) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}