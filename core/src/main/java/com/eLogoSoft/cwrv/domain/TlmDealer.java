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
 * TlmDealer Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmDealer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmDealer")
public class TlmDealer implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "billingCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String billingCode;

    @Column(name = "bolDirections")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String bolDirections;

    @Column(name = "bolWashInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String bolWashInstructions;

    @Column(name = "closedBeginDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date closedBeginDate;

    @Column(name = "closedEndDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date closedEndDate;

    @Column(name = "closedNotes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String closedNotes;

    @Column(name = "code")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String code;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "customerWashOverride")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean customerWashOverride;

    @Column(name = "deliveryContact")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryContact;

    @Column(name = "deliveryContactPhone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryContactPhone;

    @Column(name = "deliveryDays")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryDays;

    @Column(name = "deliveryHours")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryHours;

    @Column(name = "deliveryNotes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryNotes;

    @Column(name = "directions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String directions;

    @Column(name = "doNotWash")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean doNotWash;

    @Column(name = "doingBusinessAs")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String doingBusinessAs;

    @Column(name = "email")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String email;

    @Column(name = "fax")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String fax;

    @Column(name = "faxInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String faxInstructions;

    @Column(name = "holidays")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String holidays;

    @Column(name = "lastOrderDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date lastOrderDate;

    @Column(name = "lunchHours")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String lunchHours;

    @Column(name = "name")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String name;

    @Column(name = "notes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String notes;

    @Column(name = "otherText")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String otherText;

    @Column(name = "pcMilerCity")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pcMilerCity;

    @Column(name = "phone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String phone;

    @Column(name = "pickupContact")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupContact;

    @Column(name = "pickupContactPhone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupContactPhone;

    @Column(name = "pickupDays")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupDays;

    @Column(name = "pickupHours")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupHours;

    @Column(name = "pickupNotes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupNotes;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;

    @Column(name = "tollFreePhone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String tollFreePhone;

    @Column(name = "twicRequired")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean twicRequired;

    @Column(name = "updateDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date updateDate;

    @Column(name = "version")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer version;

    @Column(name = "washInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String washInstructions;

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

    @Column(name = "deliveryCity")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryCity;

    @Column(name = "deliveryCountryCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryCountryCode;

    @Column(name = "deliveryAddrLatitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double deliveryAddrLatitude;

    @Column(name = "deliveryAddrLongitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double deliveryAddrLongitude;

    @Column(name = "deliveryPostalCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryPostalCode;

    @Column(name = "deliveryStateCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryStateCode;

    @Column(name = "deliveryAddress1")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryAddress1;

    @Column(name = "deliveryAddress2")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String deliveryAddress2;

    @Column(name = "pickupCity")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupCity;

    @Column(name = "pickupCountryCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupCountryCode;

    @Column(name = "pickupAddrLatitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double pickupAddrLatitude;

    @Column(name = "pickupAddrLongitude")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Double pickupAddrLongitude;

    @Column(name = "pickupPostalCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupPostalCode;

    @Column(name = "pickupStateCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupStateCode;

    @Column(name = "pickupAddress1")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupAddress1;

    @Column(name = "pickupAddress2")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String pickupAddress2;
    
    @Column(name = "pickupSunday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupSunday;
    
    @Column(name = "pickupMonday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupMonday;
    
    @Column(name = "pickupTuesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupTuesday;
    
    @Column(name = "pickupWednesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupWednesday;
    
    @Column(name = "pickupThursday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupThursday;
    
    @Column(name = "pickupFriday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupFriday;
    
    @Column(name = "pickupSaturday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean pickupSaturday;
    
    @Column(name = "deliverySunday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliverySunday;
    
    @Column(name = "deliveryMonday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliveryMonday;
    
    @Column(name = "deliveryTuesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliveryTuesday;
    
    @Column(name = "deliveryWednesday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliveryWednesday;
    
    @Column(name = "deliveryThursday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliveryThursday;
    
    @Column(name = "deliveryFriday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliveryFriday;
    
    @Column(name = "deliverySaturday")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean deliverySaturday;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;
    
    @ManyToOne
    @JoinColumn(name="OptionBaseId")
    private MdOption optionBase;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getBillingCode() {
        return billingCode;
    }
    
    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }
    
    public String getBolDirections() {
        return bolDirections;
    }
    
    public void setBolDirections(String bolDirections) {
        this.bolDirections = bolDirections;
    }
    
    public String getBolWashInstructions() {
        return bolWashInstructions;
    }
    
    public void setBolWashInstructions(String bolWashInstructions) {
        this.bolWashInstructions = bolWashInstructions;
    }
    
    public Date getClosedBeginDate() {
        return closedBeginDate;
    }
    
    public void setClosedBeginDate(Date closedBeginDate) {
        this.closedBeginDate = closedBeginDate;
    }
    
    public Date getClosedEndDate() {
        return closedEndDate;
    }
    
    public void setClosedEndDate(Date closedEndDate) {
        this.closedEndDate = closedEndDate;
    }
    
    public String getClosedNotes() {
        return closedNotes;
    }
    
    public void setClosedNotes(String closedNotes) {
        this.closedNotes = closedNotes;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public Boolean getCustomerWashOverride() {
        return customerWashOverride;
    }
    
    public void setCustomerWashOverride(Boolean customerWashOverride) {
        this.customerWashOverride = customerWashOverride;
    }
    
    public String getDeliveryContact() {
        return deliveryContact;
    }
    
    public void setDeliveryContact(String deliveryContact) {
        this.deliveryContact = deliveryContact;
    }
    
    public String getDeliveryContactPhone() {
        return deliveryContactPhone;
    }
    
    public void setDeliveryContactPhone(String deliveryContactPhone) {
        this.deliveryContactPhone = deliveryContactPhone;
    }
    
    public String getDeliveryDays() {
        return deliveryDays;
    }
    
    public void setDeliveryDays(String deliveryDays) {
        this.deliveryDays = deliveryDays;
    }
    
    public String getDeliveryHours() {
        return deliveryHours;
    }
    
    public void setDeliveryHours(String deliveryHours) {
        this.deliveryHours = deliveryHours;
    }
    
    public String getDeliveryNotes() {
        return deliveryNotes;
    }
    
    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }
    
    public String getDirections() {
        return directions;
    }
    
    public void setDirections(String directions) {
        this.directions = directions;
    }
    
    public Boolean getDoNotWash() {
        return doNotWash;
    }
    
    public void setDoNotWash(Boolean doNotWash) {
        this.doNotWash = doNotWash;
    }
    
    public String getDoingBusinessAs() {
        return doingBusinessAs;
    }
    
    public void setDoingBusinessAs(String doingBusinessAs) {
        this.doingBusinessAs = doingBusinessAs;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFax() {
        return fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getFaxInstructions() {
        return faxInstructions;
    }
    
    public void setFaxInstructions(String faxInstructions) {
        this.faxInstructions = faxInstructions;
    }
    
    public String getHolidays() {
        return holidays;
    }
    
    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }
    
    public Date getLastOrderDate() {
        return lastOrderDate;
    }
    
    public void setLastOrderDate(Date lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }
    
    public String getLunchHours() {
        return lunchHours;
    }
    
    public void setLunchHours(String lunchHours) {
        this.lunchHours = lunchHours;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getOtherText() {
        return otherText;
    }
    
    public void setOtherText(String otherText) {
        this.otherText = otherText;
    }
    
    public String getPcMilerCity() {
        return pcMilerCity;
    }
    
    public void setPcMilerCity(String pcMilerCity) {
        this.pcMilerCity = pcMilerCity;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPickupContact() {
        return pickupContact;
    }
    
    public void setPickupContact(String pickupContact) {
        this.pickupContact = pickupContact;
    }
    
    public String getPickupContactPhone() {
        return pickupContactPhone;
    }
    
    public void setPickupContactPhone(String pickupContactPhone) {
        this.pickupContactPhone = pickupContactPhone;
    }
    
    public String getPickupDays() {
        return pickupDays;
    }
    
    public void setPickupDays(String pickupDays) {
        this.pickupDays = pickupDays;
    }
    
    public String getPickupHours() {
        return pickupHours;
    }
    
    public void setPickupHours(String pickupHours) {
        this.pickupHours = pickupHours;
    }
    
    public String getPickupNotes() {
        return pickupNotes;
    }
    
    public void setPickupNotes(String pickupNotes) {
        this.pickupNotes = pickupNotes;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getTollFreePhone() {
        return tollFreePhone;
    }
    
    public void setTollFreePhone(String tollFreePhone) {
        this.tollFreePhone = tollFreePhone;
    }
    
    public Boolean getTwicRequired() {
        return twicRequired;
    }
    
    public void setTwicRequired(Boolean twicRequired) {
        this.twicRequired = twicRequired;
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
    
    public String getWashInstructions() {
        return washInstructions;
    }
    
    public void setWashInstructions(String washInstructions) {
        this.washInstructions = washInstructions;
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
    
    public String getDeliveryCity() {
        return deliveryCity;
    }
    
    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }
    
    public String getDeliveryCountryCode() {
        return deliveryCountryCode;
    }
    
    public void setDeliveryCountryCode(String deliveryCountryCode) {
        this.deliveryCountryCode = deliveryCountryCode;
    }
    
    public Double getDeliveryAddrLatitude() {
        return deliveryAddrLatitude;
    }
    
    public void setDeliveryAddrLatitude(Double deliveryAddrLatitude) {
        this.deliveryAddrLatitude = deliveryAddrLatitude;
    }
    
    public Double getDeliveryAddrLongitude() {
        return deliveryAddrLongitude;
    }
    
    public void setDeliveryAddrLongitude(Double deliveryAddrLongitude) {
        this.deliveryAddrLongitude = deliveryAddrLongitude;
    }
    
    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }
    
    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }
    
    public String getDeliveryStateCode() {
        return deliveryStateCode;
    }
    
    public void setDeliveryStateCode(String deliveryStateCode) {
        this.deliveryStateCode = deliveryStateCode;
    }
    
    public String getDeliveryAddress1() {
        return deliveryAddress1;
    }
    
    public void setDeliveryAddress1(String deliveryAddress1) {
        this.deliveryAddress1 = deliveryAddress1;
    }
    
    public String getDeliveryAddress2() {
        return deliveryAddress2;
    }
    
    public void setDeliveryAddress2(String deliveryAddress2) {
        this.deliveryAddress2 = deliveryAddress2;
    }
    
    public String getPickupCity() {
        return pickupCity;
    }
    
    public void setPickupCity(String pickupCity) {
        this.pickupCity = pickupCity;
    }
    
    public String getPickupCountryCode() {
        return pickupCountryCode;
    }
    
    public void setPickupCountryCode(String pickupCountryCode) {
        this.pickupCountryCode = pickupCountryCode;
    }
    
    public Double getPickupAddrLatitude() {
        return pickupAddrLatitude;
    }
    
    public void setPickupAddrLatitude(Double pickupAddrLatitude) {
        this.pickupAddrLatitude = pickupAddrLatitude;
    }
    
    public Double getPickupAddrLongitude() {
        return pickupAddrLongitude;
    }
    
    public void setPickupAddrLongitude(Double pickupAddrLongitude) {
        this.pickupAddrLongitude = pickupAddrLongitude;
    }
    
    public String getPickupPostalCode() {
        return pickupPostalCode;
    }
    
    public void setPickupPostalCode(String pickupPostalCode) {
        this.pickupPostalCode = pickupPostalCode;
    }
    
    public String getPickupStateCode() {
        return pickupStateCode;
    }
    
    public void setPickupStateCode(String pickupStateCode) {
        this.pickupStateCode = pickupStateCode;
    }
    
    public String getPickupAddress1() {
        return pickupAddress1;
    }
    
    public void setPickupAddress1(String pickupAddress1) {
        this.pickupAddress1 = pickupAddress1;
    }
    
    public String getPickupAddress2() {
        return pickupAddress2;
    }
    
    public void setPickupAddress2(String pickupAddress2) {
        this.pickupAddress2 = pickupAddress2;
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
    

	public MdOption getOptionBase() {
		return optionBase;
	}

	public void setOptionBase(MdOption optionBase) {
		this.optionBase = optionBase;
	}
	
	

	public Boolean getPickupSunday() {
		return pickupSunday;
	}

	public void setPickupSunday(Boolean pickupSunday) {
		this.pickupSunday = pickupSunday;
	}

	public Boolean getPickupMonday() {
		return pickupMonday;
	}

	public void setPickupMonday(Boolean pickupMonday) {
		this.pickupMonday = pickupMonday;
	}

	public Boolean getPickupTuesday() {
		return pickupTuesday;
	}

	public void setPickupTuesday(Boolean pickupTuesday) {
		this.pickupTuesday = pickupTuesday;
	}

	public Boolean getPickupWednesday() {
		return pickupWednesday;
	}

	public void setPickupWednesday(Boolean pickupWednesday) {
		this.pickupWednesday = pickupWednesday;
	}

	public Boolean getPickupThursday() {
		return pickupThursday;
	}

	public void setPickupThursday(Boolean pickupThursday) {
		this.pickupThursday = pickupThursday;
	}

	public Boolean getPickupFriday() {
		return pickupFriday;
	}

	public void setPickupFriday(Boolean pickupFriday) {
		this.pickupFriday = pickupFriday;
	}

	public Boolean getPickupSaturday() {
		return pickupSaturday;
	}

	public void setPickupSaturday(Boolean pickupSaturday) {
		this.pickupSaturday = pickupSaturday;
	}

	public Boolean getDeliverySunday() {
		return deliverySunday;
	}

	public void setDeliverySunday(Boolean deliverySunday) {
		this.deliverySunday = deliverySunday;
	}

	public Boolean getDeliveryMonday() {
		return deliveryMonday;
	}

	public void setDeliveryMonday(Boolean deliveryMonday) {
		this.deliveryMonday = deliveryMonday;
	}

	public Boolean getDeliveryTuesday() {
		return deliveryTuesday;
	}

	public void setDeliveryTuesday(Boolean deliveryTuesday) {
		this.deliveryTuesday = deliveryTuesday;
	}

	public Boolean getDeliveryWednesday() {
		return deliveryWednesday;
	}

	public void setDeliveryWednesday(Boolean deliveryWednesday) {
		this.deliveryWednesday = deliveryWednesday;
	}

	public Boolean getDeliveryThursday() {
		return deliveryThursday;
	}

	public void setDeliveryThursday(Boolean deliveryThursday) {
		this.deliveryThursday = deliveryThursday;
	}

	public Boolean getDeliveryFriday() {
		return deliveryFriday;
	}

	public void setDeliveryFriday(Boolean deliveryFriday) {
		this.deliveryFriday = deliveryFriday;
	}

	public Boolean getDeliverySaturday() {
		return deliverySaturday;
	}

	public void setDeliverySaturday(Boolean deliverySaturday) {
		this.deliverySaturday = deliverySaturday;
	}

	public TlmDealer() {
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
        if (!(obj instanceof TlmDealer))
            return false;
        TlmDealer equalCheck = (TlmDealer) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}