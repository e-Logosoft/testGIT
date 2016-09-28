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
 * TlmCustomer Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "TlmCustomer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ELogoSoftRest/com/eLogoSoft/cwrv/domain", name = "TlmCustomer")
public class TlmCustomer implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    

    @Column(name = "allDealersFod")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean allDealersFod;

    @Column(name = "allowMiscellaneousDealers")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean allowMiscellaneousDealers;

    @Column(name = "allowReturnRates")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean allowReturnRates;

    @Column(name = "askPermits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean askPermits;

    @Column(name = "askTolls")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean askTolls;

    @Column(name = "breakdownHandlingFee")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer breakdownHandlingFee;

    @Column(name = "bulkInvoiceUnits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String bulkInvoiceUnits;

    @Column(name = "codFaxInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String codFaxInstructions;

    @Column(name = "codFaxPhoneNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String codFaxPhoneNumber;

    @Column(name = "code")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String code;

    @Column(name = "commissionFlat")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer commissionFlat;

    @Column(name = "commissionMilage")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer commissionMilage;

    @Column(name = "commissionPercentage")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer commissionPercentage;

    @Column(name = "addDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date addDate;

    @Column(name = "creditCardAddress")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String creditCardAddress;

    @Column(name = "creditCardExpirationDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String creditCardExpirationDate;

    @Column(name = "creditCardNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String creditCardNumber;

    @Column(name = "creditCardPayments")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String creditCardPayments;

    @Column(name = "creditCardPostalCode")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String creditCardPostalCode;

    @Column(name = "creditHold")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean creditHold;

    @Column(name = "description")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String description;

    @Column(name = "driverDowntimeRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer driverDowntimeRate;

    @Column(name = "driverFodPermits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverFodPermits;

    @Column(name = "driverFodTolls")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverFodTolls;

    @Column(name = "driverFs")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverFs;

    @Column(name = "driverPermits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverPermits;

    @Column(name = "driverRatePerMile")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer driverRatePerMile;

    @Column(name = "driverReturnRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer driverReturnRate;

    @Column(name = "driverTolls")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverTolls;

    @Column(name = "driverWash")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean driverWash;

    @Column(name = "emailInvoice")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String emailInvoice;

    @Column(name = "faxCodCheck")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean faxCodCheck;

    @Column(name = "faxInvoice")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String faxInvoice;

    @Column(name = "fieldRepresentative")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String fieldRepresentative;

    @Column(name = "generateCommision")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String generateCommision;

    @Column(name = "insuranceFlatRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer insuranceFlatRate;

    @Column(name = "insuranceRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer insuranceRate;

    @Column(name = "invoiceContact")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String invoiceContact;

    @Column(name = "invoiceContactFax")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String invoiceContactFax;

    @Column(name = "invoiceContactPhone")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String invoiceContactPhone;

    @Column(name = "invoiceDelaysImmediately")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoiceDelaysImmediately;

    @Column(name = "invoiceDelaysSeperately")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoiceDelaysSeperately;

    @Column(name = "invoiceDowntimeRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer invoiceDowntimeRate;

    @Column(name = "invoiceDueDays")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer invoiceDueDays;

    @Column(name = "invoiceFs")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoiceFs;

    @Column(name = "invoiceFaxNumber")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String invoiceFaxNumber;

    @Column(name = "invoiceInsuranceSurcharge")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String invoiceInsuranceSurcharge;

    @Column(name = "invoicePercentage")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer invoicePercentage;

    @Column(name = "invoicePermits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoicePermits;

    @Column(name = "invoiceRatePerMile")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer invoiceRatePerMile;

    @Column(name = "invoiceReturnRate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer invoiceReturnRate;

    @Column(name = "invoiceTolls")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoiceTolls;

    @Column(name = "invoiceWash")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean invoiceWash;

    @Column(name = "lastOrderDate")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Date lastOrderDate;

    @Column(name = "mailInvoice")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean mailInvoice;

    @Column(name = "miscellaneousCustomer")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean miscellaneousCustomer;

    @Column(name = "name")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String name;

    @Column(name = "notes")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String notes;

    @Column(name = "openBalancePayments")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String openBalancePayments;

    @Column(name = "ordersUntilCommission")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Integer ordersUntilCommission;

    @Column(name = "overrideBolWashInstructions")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean overrideBolWashInstructions;

    @Column(name = "payCommissionToDriver")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean payCommissionToDriver;

    @Column(name = "preinvoiceUnits")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean preinvoiceUnits;

    @Column(name = "region")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String region;

    @Column(name = "requireBankClient")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean requireBankClient;

    @Column(name = "requirePo")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private Boolean requirePo;

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

    @Column(name = "accountManagerFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String accountManagerFK;

    @Column(name = "commissionDriverFK")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String commissionDriverFK;
    
    
    @ManyToOne
    @JoinColumn(name="addUserId")
    private UserLogin addUser;
    
    @ManyToOne
    @JoinColumn(name="updateUserId")
    private UserLogin updateUser;
    
    @ManyToOne
    @JoinColumn(name="optionId")
    private MdOption option;
     
    @ManyToOne
    @JoinColumn(name="driverId")
    private TlmDriver driver;
   
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public Boolean getAllDealersFod() {
        return allDealersFod;
    }
    
    public void setAllDealersFod(Boolean allDealersFod) {
        this.allDealersFod = allDealersFod;
    }
    
    public Boolean getAllowMiscellaneousDealers() {
        return allowMiscellaneousDealers;
    }
    
    public void setAllowMiscellaneousDealers(Boolean allowMiscellaneousDealers) {
        this.allowMiscellaneousDealers = allowMiscellaneousDealers;
    }
    
    public Boolean getAllowReturnRates() {
        return allowReturnRates;
    }
    
    public void setAllowReturnRates(Boolean allowReturnRates) {
        this.allowReturnRates = allowReturnRates;
    }
    
    public Boolean getAskPermits() {
        return askPermits;
    }
    
    public void setAskPermits(Boolean askPermits) {
        this.askPermits = askPermits;
    }
    
    public Boolean getAskTolls() {
        return askTolls;
        
    }
    
    public void setAskTolls(Boolean askTolls) {
        this.askTolls = askTolls;
    }
    
    public Integer getBreakdownHandlingFee() {
        return breakdownHandlingFee;
    }
    
    public void setBreakdownHandlingFee(Integer breakdownHandlingFee) {
        this.breakdownHandlingFee = breakdownHandlingFee;
    }
    
    public String getBulkInvoiceUnits() {
        return bulkInvoiceUnits;
    }
    
    public void setBulkInvoiceUnits(String bulkInvoiceUnits) {
        this.bulkInvoiceUnits = bulkInvoiceUnits;
    }
    
    public String getCodFaxInstructions() {
        return codFaxInstructions;
    }
    
    public void setCodFaxInstructions(String codFaxInstructions) {
        this.codFaxInstructions = codFaxInstructions;
    }
    
    public String getCodFaxPhoneNumber() {
        return codFaxPhoneNumber;
    }
    
    public void setCodFaxPhoneNumber(String codFaxPhoneNumber) {
        this.codFaxPhoneNumber = codFaxPhoneNumber;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public Integer getCommissionFlat() {
        return commissionFlat;
    }
    
    public void setCommissionFlat(Integer commissionFlat) {
        this.commissionFlat = commissionFlat;
    }
    
    public Integer getCommissionMilage() {
        return commissionMilage;
    }
    
    public void setCommissionMilage(Integer commissionMilage) {
        this.commissionMilage = commissionMilage;
    }
    
    public Integer getCommissionPercentage() {
        return commissionPercentage;
    }
    
    public void setCommissionPercentage(Integer commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
    
    public Date getAddDate() {
        return addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public String getCreditCardAddress() {
        return creditCardAddress;
    }
    
    public void setCreditCardAddress(String creditCardAddress) {
        this.creditCardAddress = creditCardAddress;
    }
    
    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }
    
    public void setCreditCardExpirationDate(String creditCardExpirationDate) {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public String getCreditCardPayments() {
        return creditCardPayments;
    }
    
    public void setCreditCardPayments(String creditCardPayments) {
        this.creditCardPayments = creditCardPayments;
    }
    
    public String getCreditCardPostalCode() {
        return creditCardPostalCode;
    }
    
    public void setCreditCardPostalCode(String creditCardPostalCode) {
        this.creditCardPostalCode = creditCardPostalCode;
    }
    
    public Boolean getCreditHold() {
        return creditHold;
    }
    
    public void setCreditHold(Boolean creditHold) {
        this.creditHold = creditHold;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Integer getDriverDowntimeRate() {
        return driverDowntimeRate;
    }
    
    public void setDriverDowntimeRate(Integer driverDowntimeRate) {
        this.driverDowntimeRate = driverDowntimeRate;
    }
    
    public Boolean getDriverFodPermits() {
        return driverFodPermits;
    }
    
    public void setDriverFodPermits(Boolean driverFodPermits) {
        this.driverFodPermits = driverFodPermits;
    }
    
    public Boolean getDriverFodTolls() {
        return driverFodTolls;
    }
    
    public void setDriverFodTolls(Boolean driverFodTolls) {
        this.driverFodTolls = driverFodTolls;
    }
    
    public Boolean getDriverFs() {
        return driverFs;
    }
    
    public void setDriverFs(Boolean driverFs) {
        this.driverFs = driverFs;
    }
    
    public Boolean getDriverPermits() {
        return driverPermits;
    }
    
    public void setDriverPermits(Boolean driverPermits) {
        this.driverPermits = driverPermits;
    }
    
    public Integer getDriverRatePerMile() {
        return driverRatePerMile;
    }
    
    public void setDriverRatePerMile(Integer driverRatePerMile) {
        this.driverRatePerMile = driverRatePerMile;
    }
    
    public Integer getDriverReturnRate() {
        return driverReturnRate;
    }
    
    public void setDriverReturnRate(Integer driverReturnRate) {
        this.driverReturnRate = driverReturnRate;
    }
    
    public Boolean getDriverTolls() {
        return driverTolls;
    }
    
    public void setDriverTolls(Boolean driverTolls) {
        this.driverTolls = driverTolls;
    }
    
    public Boolean getDriverWash() {
        return driverWash;
    }
    
    public void setDriverWash(Boolean driverWash) {
        this.driverWash = driverWash;
    }
    
    public String getEmailInvoice() {
        return emailInvoice;
    }
    
    public void setEmailInvoice(String emailInvoice) {
        this.emailInvoice = emailInvoice;
    }
    
    public Boolean getFaxCodCheck() {
        return faxCodCheck;
    }
    
    public void setFaxCodCheck(Boolean faxCodCheck) {
        this.faxCodCheck = faxCodCheck;
    }
    
    public String getFaxInvoice() {
        return faxInvoice;
    }
    
    public void setFaxInvoice(String faxInvoice) {
        this.faxInvoice = faxInvoice;
    }
    
    public String getFieldRepresentative() {
        return fieldRepresentative;
    }
    
    public void setFieldRepresentative(String fieldRepresentative) {
        this.fieldRepresentative = fieldRepresentative;
    }
    
    public String getGenerateCommision() {
        return generateCommision;
    }
    
    public void setGenerateCommision(String generateCommision) {
        this.generateCommision = generateCommision;
    }
    
    public Integer getInsuranceFlatRate() {
        return insuranceFlatRate;
    }
    
    public void setInsuranceFlatRate(Integer insuranceFlatRate) {
        this.insuranceFlatRate = insuranceFlatRate;
    }
    
    public Integer getInsuranceRate() {
        return insuranceRate;
    }
    
    public void setInsuranceRate(Integer insuranceRate) {
        this.insuranceRate = insuranceRate;
    }
    
    public String getInvoiceContact() {
        return invoiceContact;
    }
    
    public void setInvoiceContact(String invoiceContact) {
        this.invoiceContact = invoiceContact;
    }
    
    public String getInvoiceContactFax() {
        return invoiceContactFax;
    }
    
    public void setInvoiceContactFax(String invoiceContactFax) {
        this.invoiceContactFax = invoiceContactFax;
    }
    
    public String getInvoiceContactPhone() {
        return invoiceContactPhone;
    }
    
    public void setInvoiceContactPhone(String invoiceContactPhone) {
        this.invoiceContactPhone = invoiceContactPhone;
    }
    
    public Boolean getInvoiceDelaysImmediately() {
        return invoiceDelaysImmediately;
    }
    
    public void setInvoiceDelaysImmediately(Boolean invoiceDelaysImmediately) {
        this.invoiceDelaysImmediately = invoiceDelaysImmediately;
    }
    
    public Boolean getInvoiceDelaysSeperately() {
        return invoiceDelaysSeperately;
    }
    
    public void setInvoiceDelaysSeperately(Boolean invoiceDelaysSeperately) {
        this.invoiceDelaysSeperately = invoiceDelaysSeperately;
    }
    
    public Integer getInvoiceDowntimeRate() {
        return invoiceDowntimeRate;
    }
    
    public void setInvoiceDowntimeRate(Integer invoiceDowntimeRate) {
        this.invoiceDowntimeRate = invoiceDowntimeRate;
    }
    
    public Integer getInvoiceDueDays() {
        return invoiceDueDays;
    }
    
    public void setInvoiceDueDays(Integer invoiceDueDays) {
        this.invoiceDueDays = invoiceDueDays;
    }
    
    public Boolean getInvoiceFs() {
        return invoiceFs;
    }
    
    public void setInvoiceFs(Boolean invoiceFs) {
        this.invoiceFs = invoiceFs;
    }
    
    public String getInvoiceFaxNumber() {
        return invoiceFaxNumber;
    }
    
    public void setInvoiceFaxNumber(String invoiceFaxNumber) {
        this.invoiceFaxNumber = invoiceFaxNumber;
    }
    
    public String getInvoiceInsuranceSurcharge() {
        return invoiceInsuranceSurcharge;
    }
    
    public void setInvoiceInsuranceSurcharge(String invoiceInsuranceSurcharge) {
        this.invoiceInsuranceSurcharge = invoiceInsuranceSurcharge;
    }
    
    public Integer getInvoicePercentage() {
        return invoicePercentage;
    }
    
    public void setInvoicePercentage(Integer invoicePercentage) {
        this.invoicePercentage = invoicePercentage;
    }
    
    public Boolean getInvoicePermits() {
        return invoicePermits;
    }
    
    public void setInvoicePermits(Boolean invoicePermits) {
        this.invoicePermits = invoicePermits;
    }
    
    public Integer getInvoiceRatePerMile() {
        return invoiceRatePerMile;
    }
    
    public void setInvoiceRatePerMile(Integer invoiceRatePerMile) {
        this.invoiceRatePerMile = invoiceRatePerMile;
    }
    
    public Integer getInvoiceReturnRate() {
        return invoiceReturnRate;
    }
    
    public void setInvoiceReturnRate(Integer invoiceReturnRate) {
        this.invoiceReturnRate = invoiceReturnRate;
    }
    
    public Boolean getInvoiceTolls() {
        return invoiceTolls;
    }
    
    public void setInvoiceTolls(Boolean invoiceTolls) {
        this.invoiceTolls = invoiceTolls;
    }
    
    public Boolean getInvoiceWash() {
        return invoiceWash;
    }
    
    public void setInvoiceWash(Boolean invoiceWash) {
        this.invoiceWash = invoiceWash;
    }
    
    public Date getLastOrderDate() {
        return lastOrderDate;
    }
    
    public void setLastOrderDate(Date lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }
    
    public Boolean getMailInvoice() {
        return mailInvoice;
    }
    
    public void setMailInvoice(Boolean mailInvoice) {
        this.mailInvoice = mailInvoice;
    }
    
    public Boolean getMiscellaneousCustomer() {
        return miscellaneousCustomer;
    }
    
    public void setMiscellaneousCustomer(Boolean miscellaneousCustomer) {
        this.miscellaneousCustomer = miscellaneousCustomer;
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
    
    public String getOpenBalancePayments() {
        return openBalancePayments;
    }
    
    public void setOpenBalancePayments(String openBalancePayments) {
        this.openBalancePayments = openBalancePayments;
    }
    
    public Integer getOrdersUntilCommission() {
        return ordersUntilCommission;
    }
    
    public void setOrdersUntilCommission(Integer ordersUntilCommission) {
        this.ordersUntilCommission = ordersUntilCommission;
    }
    
    public Boolean getOverrideBolWashInstructions() {
        return overrideBolWashInstructions;
    }
    
    public void setOverrideBolWashInstructions(Boolean overrideBolWashInstructions) {
        this.overrideBolWashInstructions = overrideBolWashInstructions;
    }
    
    public Boolean getPayCommissionToDriver() {
        return payCommissionToDriver;
    }
    
    public void setPayCommissionToDriver(Boolean payCommissionToDriver) {
        this.payCommissionToDriver = payCommissionToDriver;
    }
    
    public Boolean getPreinvoiceUnits() {
        return preinvoiceUnits;
    }
    
    public void setPreinvoiceUnits(Boolean preinvoiceUnits) {
        this.preinvoiceUnits = preinvoiceUnits;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public Boolean getRequireBankClient() {
        return requireBankClient;
    }
    
    public void setRequireBankClient(Boolean requireBankClient) {
        this.requireBankClient = requireBankClient;
    }
    
    public Boolean getRequirePo() {
        return requirePo;
    }
    
    public void setRequirePo(Boolean requirePo) {
        this.requirePo = requirePo;
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
    
    public String getAccountManagerFK() {
        return accountManagerFK;
    }
    
    public void setAccountManagerFK(String accountManagerFK) {
        this.accountManagerFK = accountManagerFK;
    }
    
    public String getCommissionDriverFK() {
        return commissionDriverFK;
    }
    
    public void setCommissionDriverFK(String commissionDriverFK) {
        this.commissionDriverFK = commissionDriverFK;
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
    
    public MdOption getOption() {
        return option;
    }
    
    public void setOption(MdOption option) {
        this.option = option;
    }
    public TlmDriver getDriver() {
        return driver;
    }
    
    public void setDriver(TlmDriver driver) {
        this.driver = driver;
    }


    public TlmCustomer() {
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
        if (!(obj instanceof TlmCustomer))
            return false;
        TlmCustomer equalCheck = (TlmCustomer) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}