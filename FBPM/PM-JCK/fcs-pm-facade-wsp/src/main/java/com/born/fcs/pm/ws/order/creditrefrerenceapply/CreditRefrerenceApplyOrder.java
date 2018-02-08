package com.born.fcs.pm.ws.order.creditrefrerenceapply;

import java.util.Date;

import com.born.fcs.pm.ws.order.base.FormOrderBase;
import com.yjf.common.lang.util.money.Money;

/**
 * 征信管理Order
 *
 * @author heh
 */
public class CreditRefrerenceApplyOrder extends FormOrderBase {
	
	private static final long serialVersionUID = -8755049323475771922L;
	private Long id;
	
	private String companyName;
	private String projectCode;
	
	private String projectName;
	
	private String afmgApprovalUrl;
	private String address;
	
	private String busiLicenseNo;
	
	private String legalPersion;
	
	private Date establishedTime;
	
	private String registerCapitalStr;
	
	private String busiScope;
	
	private String busiLicenseUrl;
	
	private String authUrl;
	
	private String legalPersionCertFront;
	
	private String legalPersionCertBack;
	
	private String loanCardFront;
	
	private String loanCardBack;
	
	private long applyManId;
	
	private String applyManName;
	
	private String status;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	private String applyStatus;
	private String creditReport;

	private String isBeforeFinishCouncil;

	private String isThreeInOne;

	private String orgCode;

	private String taxRegCertificateNo;

	private String socialUnityCreditCode;

	private String loanCardNo;

	private String attachment;

	private String isNeedAttach;

	private String localTaxCertNo;

	public String getLocalTaxCertNo() {
		return localTaxCertNo;
	}

	public void setLocalTaxCertNo(String localTaxCertNo) {
		this.localTaxCertNo = localTaxCertNo;
	}

	public String getIsNeedAttach() {
		return isNeedAttach;
	}

	public void setIsNeedAttach(String isNeedAttach) {
		this.isNeedAttach = isNeedAttach;
	}

	public String getLoanCardNo() {
		return loanCardNo;
	}

	public void setLoanCardNo(String loanCardNo) {
		this.loanCardNo = loanCardNo;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getIsThreeInOne() {
		return isThreeInOne;
	}

	public void setIsThreeInOne(String isThreeInOne) {
		this.isThreeInOne = isThreeInOne;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getTaxRegCertificateNo() {
		return taxRegCertificateNo;
	}

	public void setTaxRegCertificateNo(String taxRegCertificateNo) {
		this.taxRegCertificateNo = taxRegCertificateNo;
	}

	public String getSocialUnityCreditCode() {
		return socialUnityCreditCode;
	}

	public void setSocialUnityCreditCode(String socialUnityCreditCode) {
		this.socialUnityCreditCode = socialUnityCreditCode;
	}

	//========== getters and setters ==========
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
	}
	
	public String getLegalPersion() {
		return legalPersion;
	}
	
	public void setLegalPersion(String legalPersion) {
		this.legalPersion = legalPersion;
	}
	
	public Date getEstablishedTime() {
		return establishedTime;
	}
	
	public void setEstablishedTime(Date establishedTime) {
		this.establishedTime = establishedTime;
	}
	
	public Money getRegisterCapital() {
		if (null == this.registerCapitalStr) {
			return new Money(0L);
		}
		return Money.amout(this.registerCapitalStr);
	}
	
	public String getRegisterCapitalStr() {
		return registerCapitalStr;
	}
	
	public void setRegisterCapitalStr(String registerCapitalStr) {
		this.registerCapitalStr = registerCapitalStr;
	}
	
	public String getBusiScope() {
		return busiScope;
	}
	
	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}
	
	public String getBusiLicenseUrl() {
		return busiLicenseUrl;
	}
	
	public void setBusiLicenseUrl(String busiLicenseUrl) {
		this.busiLicenseUrl = busiLicenseUrl;
	}
	
	public String getAuthUrl() {
		return authUrl;
	}
	
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	
	public String getLegalPersionCertFront() {
		return legalPersionCertFront;
	}
	
	public void setLegalPersionCertFront(String legalPersionCertFront) {
		this.legalPersionCertFront = legalPersionCertFront;
	}
	
	public String getLegalPersionCertBack() {
		return legalPersionCertBack;
	}
	
	public void setLegalPersionCertBack(String legalPersionCertBack) {
		this.legalPersionCertBack = legalPersionCertBack;
	}
	
	public String getLoanCardFront() {
		return loanCardFront;
	}
	
	public void setLoanCardFront(String loanCardFront) {
		this.loanCardFront = loanCardFront;
	}
	
	public String getLoanCardBack() {
		return loanCardBack;
	}
	
	public void setLoanCardBack(String loanCardBack) {
		this.loanCardBack = loanCardBack;
	}
	
	public long getApplyManId() {
		return applyManId;
	}
	
	public void setApplyManId(long applyManId) {
		this.applyManId = applyManId;
	}
	
	public String getApplyManName() {
		return applyManName;
	}
	
	public void setApplyManName(String applyManName) {
		this.applyManName = applyManName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public String getApplyStatus() {
		return applyStatus;
	}
	
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	
	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getAfmgApprovalUrl() {
		return afmgApprovalUrl;
	}
	
	public void setAfmgApprovalUrl(String afmgApprovalUrl) {
		this.afmgApprovalUrl = afmgApprovalUrl;
	}

	public String getCreditReport() {
		return creditReport;
	}

	public void setCreditReport(String creditReport) {
		this.creditReport = creditReport;
	}

	public String getIsBeforeFinishCouncil() {
		return isBeforeFinishCouncil;
	}

	public void setIsBeforeFinishCouncil(String isBeforeFinishCouncil) {
		this.isBeforeFinishCouncil = isBeforeFinishCouncil;
	}

}
