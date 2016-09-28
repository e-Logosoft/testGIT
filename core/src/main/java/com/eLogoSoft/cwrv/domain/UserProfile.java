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
 * UserProfile Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "UserProfile")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "UserProfile")
public class UserProfile implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "accessKey")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String accessKey;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "emailAddress")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String emailAddress;

    @Column(name = "licenseAcceptedDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date licenseAcceptedDate;

    @Column(name = "licenseVersion")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer licenseVersion;

    @Column(name = "userName")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String userName;

    @Column(name = "seenMessagesAt")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date seenMessagesAt;

    @Column(name = "inactiveTime")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer inactiveTime;

    @Column(name = "showTips")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean showTips;

    @Column(name = "status")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String status;
    
    @Column(name = "role")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String role;

    @Column(name = "userType")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer userType;

    @Column(name = "updateDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date updateDate;

    @Column(name = "version")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer version;
    
    @Column(name = "roleAccountant")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleAccountant;
    
    @Column(name = "roleActivator")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleActivator;
    
    @Column(name = "roleCheckinAgent")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleCheckinAgent;
    
    @Column(name = "roleCustomer")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleCustomer;
    
    @Column(name = "roleCustomerRepresentative")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleCustomerRepresentative;
    
    @Column(name = "roleDealer")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDealer;
    
    @Column(name = "roleDelayRepresentative")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDelayRepresentative;
    
    @Column(name = "roleDispatcher")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDispatcher;
    
    @Column(name = "roleDispatcherManager")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDispatcherManager;
    
    @Column(name = "roleDriver")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDriver;
    
    @Column(name = "roleDriverAdministrator")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleDriverAdministrator;
    
    @Column(name = "roleheadShuttler")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleheadShuttler;
   
    @Column(name = "roleOeRep")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleOeRep;
    
    @Column(name = "roleSystemAdministrator")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleSystemAdministrator;
    
    @Column(name = "roleYardManager")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean roleYardManager;
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="customerId")
    private TlmCustomer customer;
    
    @ManyToOne
    @JoinColumn(name="dealerId")
    private TlmDealer dealer;
    
    @ManyToOne
    @JoinColumn(name="driverId")
    private TlmDriver driver;
    
    @ManyToOne
    @JoinColumn(name="factoryId")
    private TlmFactory factory;
    
    @ManyToOne
    @JoinColumn(name="userLoginId")
    private UserLogin userLogin;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;
    
    @ManyToOne
    @JoinColumn(name="optionBase")
    private MdOption optionBase;
    
    
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getAccessKey() {
        return accessKey;
    }
    
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public Date getLicenseAcceptedDate() {
        return licenseAcceptedDate;
    }
    
    public void setLicenseAcceptedDate(Date licenseAcceptedDate) {
        this.licenseAcceptedDate = licenseAcceptedDate;
    }
    
    public Integer getLicenseVersion() {
        return licenseVersion;
    }
    
    public void setLicenseVersion(Integer licenseVersion) {
        this.licenseVersion = licenseVersion;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Date getSeenMessagesAt() {
        return seenMessagesAt;
    }
    
    public void setSeenMessagesAt(Date seenMessagesAt) {
        this.seenMessagesAt = seenMessagesAt;
    }
    
    public Integer getInactiveTime() {
        return inactiveTime;
    }
    
    public void setInactiveTime(Integer inactiveTime) {
        this.inactiveTime = inactiveTime;
    }
    
    public Boolean getShowTips() {
        return showTips;
    }
    
    public void setShowTips(Boolean showTips) {
        this.showTips = showTips;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public Integer getUserType() {
        return userType;
    }
    
    public void setUserType(Integer userType) {
        this.userType = userType;
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
    
    public TlmCustomer getCustomer() {
        return customer;
    }
    
    public void setCustomer(TlmCustomer customer) {
        this.customer = customer;
    }
    
    public TlmDealer getDealer() {
        return dealer;
    }
    
    public void setDealer(TlmDealer dealer) {
        this.dealer = dealer;
    }
    
    public TlmDriver getDriver() {
        return driver;
    }
    
    public void setDriver(TlmDriver driver) {
        this.driver = driver;
    }
    
    public TlmFactory getFactory() {
        return factory;
    }
    
    public void setFactory(TlmFactory factory) {
        this.factory = factory;
    }
    
	public Boolean getRoleAccountant() {
		return roleAccountant;
	}

	public void setRoleAccountant(Boolean roleAccountant) {
		this.roleAccountant = roleAccountant;
	}

	public Boolean getRoleActivator() {
		return roleActivator;
	}

	public void setRoleActivator(Boolean roleActivator) {
		this.roleActivator = roleActivator;
	}

	public Boolean getRoleCheckinAgent() {
		return roleCheckinAgent;
	}

	public void setRoleCheckinAgent(Boolean roleCheckinAgent) {
		this.roleCheckinAgent = roleCheckinAgent;
	}

	public Boolean getRoleCustomer() {
		return roleCustomer;
	}

	public void setRoleCustomer(Boolean roleCustomer) {
		this.roleCustomer = roleCustomer;
	}

	public Boolean getRoleCustomerRepresentative() {
		return roleCustomerRepresentative;
	}

	public void setRoleCustomerRepresentative(Boolean roleCustomerRepresentative) {
		this.roleCustomerRepresentative = roleCustomerRepresentative;
	}

	public Boolean getRoleDealer() {
		return roleDealer;
	}

	public void setRoleDealer(Boolean roleDealer) {
		this.roleDealer = roleDealer;
	}
	

	public Boolean getRoleDelayRepresentative() {
		return roleDelayRepresentative;
	}

	public void setRoleDelayRepresentative(Boolean roleDelayRepresentative) {
		this.roleDelayRepresentative = roleDelayRepresentative;
	}

	public Boolean getRoleDispatcher() {
		return roleDispatcher;
	}

	public void setRoleDispatcher(Boolean roleDispatcher) {
		this.roleDispatcher = roleDispatcher;
	}

	public Boolean getRoleDispatcherManager() {
		return roleDispatcherManager;
	}

	public void setRoleDispatcherManager(Boolean roleDispatcherManager) {
		this.roleDispatcherManager = roleDispatcherManager;
	}

	public Boolean getRoleDriver() {
		return roleDriver;
	}

	public void setRoleDriver(Boolean roleDriver) {
		this.roleDriver = roleDriver;
	}

	public Boolean getRoleDriverAdministrator() {
		return roleDriverAdministrator;
	}

	public void setRoleDriverAdministrator(Boolean roleDriverAdministrator) {
		this.roleDriverAdministrator = roleDriverAdministrator;
	}

	public Boolean getRoleheadShuttler() {
		return roleheadShuttler;
	}

	public void setRoleheadShuttler(Boolean roleheadShuttler) {
		this.roleheadShuttler = roleheadShuttler;
	}

	public Boolean getRoleOeRep() {
		return roleOeRep;
	}

	public void setRoleOeRep(Boolean roleOeRep) {
		this.roleOeRep = roleOeRep;
	}

	public Boolean getRoleSystemAdministrator() {
		return roleSystemAdministrator;
	}

	public void setRoleSystemAdministrator(Boolean roleSystemAdministrator) {
		this.roleSystemAdministrator = roleSystemAdministrator;
	}

	public Boolean getRoleYardManager() {
		return roleYardManager;
	}

	public void setRoleYardManager(Boolean roleYardManager) {
		this.roleYardManager = roleYardManager;
	}

	public UserLogin getUserLogin() {
        return userLogin;
    }
    
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
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
    
    
  
    public UserProfile() {
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
        if (!(obj instanceof UserProfile))
            return false;
        UserProfile equalCheck = (UserProfile) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}