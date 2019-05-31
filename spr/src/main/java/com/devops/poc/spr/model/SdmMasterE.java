package com.devops.poc.spr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="SDM_MASTER_MAIN", schema="SYSTEM")
public class SdmMasterE implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sprIdGenerator")
	@SequenceGenerator(name = "sprIdGenerator", sequenceName = "SDM_MASTER_MAIN_SEQ")
	private Long id;
	
	@Column(name="CONTRACT_ID")
	private String coId;
	
	@Column(name="CUSTOMER_ID")
	private String customerId;
	
	@Column(name="ID_TYPE")
	private String idType;
	
	@Column(name="ID_VALUE")
	private String idValue;
	
	@Column(name="RATE_PLAN_CODE")
	private String rateplanCode;
	
	@Column(name="RATE_PLAN_TYPE")
	private String rateplantype;
	
	@Column(name="CUST_CODE")
	private String custCode;
	
	@Column(name="CUSTOMER_TYPE")
	private String customerType;
	
	@Column(name="CONTRACT_STATUS")
	private String coStatus;
	
	@Column(name="PMT_RESP_FLAG")
	private String paymentResp;
	
	@Column(name="PROMO_SEGMENT")
	private String promoSegment;
	
	@Column(name="CUSTOMER_SEGMENT")
	private String custSegment;
	
	@Column(name="BILL_CYCLE_CD")
	private String billCycleCD;
	
	@Column(name="IDD_FLAG")
	private String iddFlag;
	
	@Column(name="CREDIT_LIMIT")
	private String creditLimit;
	
	@Column(name="LNGUAGE")
	private String language;
	
	@Column(name="BARRING_STATUS")
	private String barringStatus;
	
	@Column(name="LAST_UPDT_DT")
	private Date lastUpdateDate;
	
	@Column(name="LAST_UPDT_BY")
	private String lastUpdatedBy;
	
	@Column(name="UPDATE_REASON")
	private String  updateReason;
	
	@Column(name="BILLCYCLE")
	private String billCycle;
	
	@Column(name="VIP_STATUS")
	private String vipStatus;
	
	@Column(name="ACTIVATION_DATE")
	private Date activationDate;
	
	@Column(name="SUSPENSION_DATE")
	private Date suspensionDate;
	
	@Column(name="PRGCODE")
	private String prgCode;
	
	@Column(name="CONTRACT_FREEZE")
	private String contractFreeze;
	
	@Column(name="COMMITMENT_STARTDATE")
	private Date commitmentStartDate;
	
	@Column(name="COMMITMENT_ENDDATE")
	private Date commitmentEndDate;
	
	@Column(name="CORE_OFFER")
	private String coreOffer;
	
	@Column(name="DIGITAL_SN_CODE")
	private String digitalSNCode;
	
	@Column(name="CORE_OFFER_PRICE")
	private Double coreOfferPrice;
	
	@Column(name="DIGITAL_SUBSCRIBER")
	private String digitalSubscriber;
	
	@Column(name="SIM")
	private String sim;
	
	@Column(name="MSISDN")
	private String msisdn;
	
	@Column(name="IMSI")
	private String imsi;
	
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getCoId() {
		return coId;
	}
	public void setCoId(String coId) {
		this.coId = coId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getRateplanCode() {
		return rateplanCode;
	}
	public void setRateplanCode(String rateplanCode) {
		this.rateplanCode = rateplanCode;
	}
	public String getRateplantype() {
		return rateplantype;
	}
	public void setRateplantype(String rateplantype) {
		this.rateplantype = rateplantype;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCoStatus() {
		return coStatus;
	}
	public void setCoStatus(String coStatus) {
		this.coStatus = coStatus;
	}
	public String getPaymentResp() {
		return paymentResp;
	}
	public void setPaymentResp(String paymentResp) {
		this.paymentResp = paymentResp;
	}
	public String getPromoSegment() {
		return promoSegment;
	}
	public void setPromoSegment(String promoSegment) {
		this.promoSegment = promoSegment;
	}
	public String getCustSegment() {
		return custSegment;
	}
	public void setCustSegment(String custSegment) {
		this.custSegment = custSegment;
	}
	public String getBillCycleCD() {
		return billCycleCD;
	}
	public void setBillCycleCD(String billCycleCD) {
		this.billCycleCD = billCycleCD;
	}
	public String getIddFlag() {
		return iddFlag;
	}
	public void setIddFlag(String iddFlag) {
		this.iddFlag = iddFlag;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getBarringStatus() {
		return barringStatus;
	}
	public void setBarringStatus(String barringStatus) {
		this.barringStatus = barringStatus;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getUpdateReason() {
		return updateReason;
	}
	public void setUpdateReason(String updateReason) {
		this.updateReason = updateReason;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}
	public String getVipStatus() {
		return vipStatus;
	}
	public void setVipStatus(String vipStatus) {
		this.vipStatus = vipStatus;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public Date getSuspensionDate() {
		return suspensionDate;
	}
	public void setSuspensionDate(Date suspensionDate) {
		this.suspensionDate = suspensionDate;
	}
	public String getPrgCode() {
		return prgCode;
	}
	public void setPrgCode(String prgCode) {
		this.prgCode = prgCode;
	}
	public String getContractFreeze() {
		return contractFreeze;
	}
	public void setContractFreeze(String contractFreeze) {
		this.contractFreeze = contractFreeze;
	}
	public Date getCommitmentStartDate() {
		return commitmentStartDate;
	}
	public void setCommitmentStartDate(Date commitmentStartDate) {
		this.commitmentStartDate = commitmentStartDate;
	}
	public Date getCommitmentEndDate() {
		return commitmentEndDate;
	}
	public void setCommitmentEndDate(Date commitmentEndDate) {
		this.commitmentEndDate = commitmentEndDate;
	}
	public String getCoreOffer() {
		return coreOffer;
	}
	public void setCoreOffer(String coreOffer) {
		this.coreOffer = coreOffer;
	}
	public String getDigitalSNCode() {
		return digitalSNCode;
	}
	public void setDigitalSNCode(String digitalSNCode) {
		this.digitalSNCode = digitalSNCode;
	}
	public Double getCoreOfferPrice() {
		return coreOfferPrice;
	}
	public void setCoreOfferPrice(Double coreOfferPrice) {
		this.coreOfferPrice = coreOfferPrice;
	}
	public String getDigitalSubscriber() {
		return digitalSubscriber;
	}
	public void setDigitalSubscriber(String digitalSubscriber) {
		this.digitalSubscriber = digitalSubscriber;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}
}
