/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>customer_company_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_company_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class CustomerCompanyDetailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String customerId;

	private String loanCardNo;

	private String finalYearCheck;

	private String industryCode;

	private String industryName;

	private String industryAllName;

	private String isLocalGovPlatform;

	private String isExportOrientedEconomy;

	private String isGroup;

	private String isListedCompany;

	private String enterpriseType;

	private Money registerCapital = new Money(0, 0);

	private String moneyType;

	private String moneyTypeName;

	private Money actualCapital = new Money(0, 0);

	private Date establishedTime;

	private String address;

	private String subordinateRelationship;

	private String companyAddress;

	private String scale;

	private long staffNum;

	private String contactMan;

	private String contactNo;

	private String busiScope;

	private String majorProduct;

	private String relation;

	private String legalPersion;

	private String legalPersionCertNo;

	private String legalPersionAddress;

	private String actualControlMan;

	private String actualControlManCertNo;

	private String actualControlManCertType;

	private String actualControlManAddress;

	private String bankAccount;

	private String accountNo;

	private String settleBankAccount1;

	private String settleAccountNo1;

	private String settleBankAccount2;

	private String settleAccountNo2;

	private String settleBankAccount3;

	private String settleAccountNo3;

	private Money totalAsset = new Money(0, 0);

	private Money totalAssetLastYear = new Money(0, 0);

	private Money netAsset = new Money(0, 0);

	private Money netAssetLastYear = new Money(0, 0);

	private double assetLiabilityRatio;

	private double assetLiabilityRatioLastYear;

	private double liquidityRatio;

	private double quickRatio;

	private Money salesProceedsLastYear = new Money(0, 0);

	private Money totalProfitLastYear = new Money(0, 0);

	private Money salesProceedsThisYear = new Money(0, 0);

	private Money totalProfitThisYear = new Money(0, 0);

	private String busiLicenseNo;

	private String busiLicenseUrl;

	private String isOneCert;

	private String orgCode;

	private String orgCodeUrl;

	private String taxCertificateNo;

	private String taxCertificateUrl;

	private String localTaxCertNo;

	private String localTaxCertUrl;

	private String applyScanningUrl;

	private String localFinance;

	private String info1;

	private String info2;

	private String info3;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLoanCardNo() {
		return loanCardNo;
	}
	
	public void setLoanCardNo(String loanCardNo) {
		this.loanCardNo = loanCardNo;
	}

	public String getFinalYearCheck() {
		return finalYearCheck;
	}
	
	public void setFinalYearCheck(String finalYearCheck) {
		this.finalYearCheck = finalYearCheck;
	}

	public String getIndustryCode() {
		return industryCode;
	}
	
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return industryName;
	}
	
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getIndustryAllName() {
		return industryAllName;
	}
	
	public void setIndustryAllName(String industryAllName) {
		this.industryAllName = industryAllName;
	}

	public String getIsLocalGovPlatform() {
		return isLocalGovPlatform;
	}
	
	public void setIsLocalGovPlatform(String isLocalGovPlatform) {
		this.isLocalGovPlatform = isLocalGovPlatform;
	}

	public String getIsExportOrientedEconomy() {
		return isExportOrientedEconomy;
	}
	
	public void setIsExportOrientedEconomy(String isExportOrientedEconomy) {
		this.isExportOrientedEconomy = isExportOrientedEconomy;
	}

	public String getIsGroup() {
		return isGroup;
	}
	
	public void setIsGroup(String isGroup) {
		this.isGroup = isGroup;
	}

	public String getIsListedCompany() {
		return isListedCompany;
	}
	
	public void setIsListedCompany(String isListedCompany) {
		this.isListedCompany = isListedCompany;
	}

	public String getEnterpriseType() {
		return enterpriseType;
	}
	
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public Money getRegisterCapital() {
		return registerCapital;
	}
	
	public void setRegisterCapital(Money registerCapital) {
		if (registerCapital == null) {
			this.registerCapital = new Money(0, 0);
		} else {
			this.registerCapital = registerCapital;
		}
	}

	public String getMoneyType() {
		return moneyType;
	}
	
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getMoneyTypeName() {
		return moneyTypeName;
	}
	
	public void setMoneyTypeName(String moneyTypeName) {
		this.moneyTypeName = moneyTypeName;
	}

	public Money getActualCapital() {
		return actualCapital;
	}
	
	public void setActualCapital(Money actualCapital) {
		if (actualCapital == null) {
			this.actualCapital = new Money(0, 0);
		} else {
			this.actualCapital = actualCapital;
		}
	}

	public Date getEstablishedTime() {
		return establishedTime;
	}
	
	public void setEstablishedTime(Date establishedTime) {
		this.establishedTime = establishedTime;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getSubordinateRelationship() {
		return subordinateRelationship;
	}
	
	public void setSubordinateRelationship(String subordinateRelationship) {
		this.subordinateRelationship = subordinateRelationship;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}
	
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getScale() {
		return scale;
	}
	
	public void setScale(String scale) {
		this.scale = scale;
	}

	public long getStaffNum() {
		return staffNum;
	}
	
	public void setStaffNum(long staffNum) {
		this.staffNum = staffNum;
	}

	public String getContactMan() {
		return contactMan;
	}
	
	public void setContactMan(String contactMan) {
		this.contactMan = contactMan;
	}

	public String getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getBusiScope() {
		return busiScope;
	}
	
	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}

	public String getMajorProduct() {
		return majorProduct;
	}
	
	public void setMajorProduct(String majorProduct) {
		this.majorProduct = majorProduct;
	}

	public String getRelation() {
		return relation;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getLegalPersion() {
		return legalPersion;
	}
	
	public void setLegalPersion(String legalPersion) {
		this.legalPersion = legalPersion;
	}

	public String getLegalPersionCertNo() {
		return legalPersionCertNo;
	}
	
	public void setLegalPersionCertNo(String legalPersionCertNo) {
		this.legalPersionCertNo = legalPersionCertNo;
	}

	public String getLegalPersionAddress() {
		return legalPersionAddress;
	}
	
	public void setLegalPersionAddress(String legalPersionAddress) {
		this.legalPersionAddress = legalPersionAddress;
	}

	public String getActualControlMan() {
		return actualControlMan;
	}
	
	public void setActualControlMan(String actualControlMan) {
		this.actualControlMan = actualControlMan;
	}

	public String getActualControlManCertNo() {
		return actualControlManCertNo;
	}
	
	public void setActualControlManCertNo(String actualControlManCertNo) {
		this.actualControlManCertNo = actualControlManCertNo;
	}

	public String getActualControlManCertType() {
		return actualControlManCertType;
	}
	
	public void setActualControlManCertType(String actualControlManCertType) {
		this.actualControlManCertType = actualControlManCertType;
	}

	public String getActualControlManAddress() {
		return actualControlManAddress;
	}
	
	public void setActualControlManAddress(String actualControlManAddress) {
		this.actualControlManAddress = actualControlManAddress;
	}

	public String getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getSettleBankAccount1() {
		return settleBankAccount1;
	}
	
	public void setSettleBankAccount1(String settleBankAccount1) {
		this.settleBankAccount1 = settleBankAccount1;
	}

	public String getSettleAccountNo1() {
		return settleAccountNo1;
	}
	
	public void setSettleAccountNo1(String settleAccountNo1) {
		this.settleAccountNo1 = settleAccountNo1;
	}

	public String getSettleBankAccount2() {
		return settleBankAccount2;
	}
	
	public void setSettleBankAccount2(String settleBankAccount2) {
		this.settleBankAccount2 = settleBankAccount2;
	}

	public String getSettleAccountNo2() {
		return settleAccountNo2;
	}
	
	public void setSettleAccountNo2(String settleAccountNo2) {
		this.settleAccountNo2 = settleAccountNo2;
	}

	public String getSettleBankAccount3() {
		return settleBankAccount3;
	}
	
	public void setSettleBankAccount3(String settleBankAccount3) {
		this.settleBankAccount3 = settleBankAccount3;
	}

	public String getSettleAccountNo3() {
		return settleAccountNo3;
	}
	
	public void setSettleAccountNo3(String settleAccountNo3) {
		this.settleAccountNo3 = settleAccountNo3;
	}

	public Money getTotalAsset() {
		return totalAsset;
	}
	
	public void setTotalAsset(Money totalAsset) {
		if (totalAsset == null) {
			this.totalAsset = new Money(0, 0);
		} else {
			this.totalAsset = totalAsset;
		}
	}

	public Money getTotalAssetLastYear() {
		return totalAssetLastYear;
	}
	
	public void setTotalAssetLastYear(Money totalAssetLastYear) {
		if (totalAssetLastYear == null) {
			this.totalAssetLastYear = new Money(0, 0);
		} else {
			this.totalAssetLastYear = totalAssetLastYear;
		}
	}

	public Money getNetAsset() {
		return netAsset;
	}
	
	public void setNetAsset(Money netAsset) {
		if (netAsset == null) {
			this.netAsset = new Money(0, 0);
		} else {
			this.netAsset = netAsset;
		}
	}

	public Money getNetAssetLastYear() {
		return netAssetLastYear;
	}
	
	public void setNetAssetLastYear(Money netAssetLastYear) {
		if (netAssetLastYear == null) {
			this.netAssetLastYear = new Money(0, 0);
		} else {
			this.netAssetLastYear = netAssetLastYear;
		}
	}

	public double getAssetLiabilityRatio() {
		return assetLiabilityRatio;
	}
	
	public void setAssetLiabilityRatio(double assetLiabilityRatio) {
		this.assetLiabilityRatio = assetLiabilityRatio;
	}

	public double getAssetLiabilityRatioLastYear() {
		return assetLiabilityRatioLastYear;
	}
	
	public void setAssetLiabilityRatioLastYear(double assetLiabilityRatioLastYear) {
		this.assetLiabilityRatioLastYear = assetLiabilityRatioLastYear;
	}

	public double getLiquidityRatio() {
		return liquidityRatio;
	}
	
	public void setLiquidityRatio(double liquidityRatio) {
		this.liquidityRatio = liquidityRatio;
	}

	public double getQuickRatio() {
		return quickRatio;
	}
	
	public void setQuickRatio(double quickRatio) {
		this.quickRatio = quickRatio;
	}

	public Money getSalesProceedsLastYear() {
		return salesProceedsLastYear;
	}
	
	public void setSalesProceedsLastYear(Money salesProceedsLastYear) {
		if (salesProceedsLastYear == null) {
			this.salesProceedsLastYear = new Money(0, 0);
		} else {
			this.salesProceedsLastYear = salesProceedsLastYear;
		}
	}

	public Money getTotalProfitLastYear() {
		return totalProfitLastYear;
	}
	
	public void setTotalProfitLastYear(Money totalProfitLastYear) {
		if (totalProfitLastYear == null) {
			this.totalProfitLastYear = new Money(0, 0);
		} else {
			this.totalProfitLastYear = totalProfitLastYear;
		}
	}

	public Money getSalesProceedsThisYear() {
		return salesProceedsThisYear;
	}
	
	public void setSalesProceedsThisYear(Money salesProceedsThisYear) {
		if (salesProceedsThisYear == null) {
			this.salesProceedsThisYear = new Money(0, 0);
		} else {
			this.salesProceedsThisYear = salesProceedsThisYear;
		}
	}

	public Money getTotalProfitThisYear() {
		return totalProfitThisYear;
	}
	
	public void setTotalProfitThisYear(Money totalProfitThisYear) {
		if (totalProfitThisYear == null) {
			this.totalProfitThisYear = new Money(0, 0);
		} else {
			this.totalProfitThisYear = totalProfitThisYear;
		}
	}

	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
	}

	public String getBusiLicenseUrl() {
		return busiLicenseUrl;
	}
	
	public void setBusiLicenseUrl(String busiLicenseUrl) {
		this.busiLicenseUrl = busiLicenseUrl;
	}

	public String getIsOneCert() {
		return isOneCert;
	}
	
	public void setIsOneCert(String isOneCert) {
		this.isOneCert = isOneCert;
	}

	public String getOrgCode() {
		return orgCode;
	}
	
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgCodeUrl() {
		return orgCodeUrl;
	}
	
	public void setOrgCodeUrl(String orgCodeUrl) {
		this.orgCodeUrl = orgCodeUrl;
	}

	public String getTaxCertificateNo() {
		return taxCertificateNo;
	}
	
	public void setTaxCertificateNo(String taxCertificateNo) {
		this.taxCertificateNo = taxCertificateNo;
	}

	public String getTaxCertificateUrl() {
		return taxCertificateUrl;
	}
	
	public void setTaxCertificateUrl(String taxCertificateUrl) {
		this.taxCertificateUrl = taxCertificateUrl;
	}

	public String getLocalTaxCertNo() {
		return localTaxCertNo;
	}
	
	public void setLocalTaxCertNo(String localTaxCertNo) {
		this.localTaxCertNo = localTaxCertNo;
	}

	public String getLocalTaxCertUrl() {
		return localTaxCertUrl;
	}
	
	public void setLocalTaxCertUrl(String localTaxCertUrl) {
		this.localTaxCertUrl = localTaxCertUrl;
	}

	public String getApplyScanningUrl() {
		return applyScanningUrl;
	}
	
	public void setApplyScanningUrl(String applyScanningUrl) {
		this.applyScanningUrl = applyScanningUrl;
	}

	public String getLocalFinance() {
		return localFinance;
	}
	
	public void setLocalFinance(String localFinance) {
		this.localFinance = localFinance;
	}

	public String getInfo1() {
		return info1;
	}
	
	public void setInfo1(String info1) {
		this.info1 = info1;
	}

	public String getInfo2() {
		return info2;
	}
	
	public void setInfo2(String info2) {
		this.info2 = info2;
	}

	public String getInfo3() {
		return info3;
	}
	
	public void setInfo3(String info3) {
		this.info3 = info3;
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


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
