package com.devops.poc.bean;

import java.io.Serializable;
import java.util.Date;
public class SdmMasterE implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String coId;
	private String customerId;
	private String idType;
	private String idValue;
	private String rateplanCode;
	private String rateplantype;
	private String custCode;
	private String customerType;
	private String coStatus;
	private String paymentResp;
	private String promoSegment;
	private String custSegment;
	private String billCycleCD;
	private String iddFlag;
	private String creditLimit;
	private String language;
	private String barringStatus;
	private Date lastUpdateDate;
	private String lastUpdatedBy;
	private String  updateReason;
	private String billCycle;
	private String vipStatus;
	private Date activationDate;
	private Date suspensionDate;
	private String prgCode;
	private String contractFreeze;
	private Date commitmentStartDate;
	private Date commitmentEndDate;
	private String coreOffer;
	private String digitalSNCode;
	private Double coreOfferPrice;
	private String digitalSubscriber;
	private String sim;
	private String msisdn;
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
