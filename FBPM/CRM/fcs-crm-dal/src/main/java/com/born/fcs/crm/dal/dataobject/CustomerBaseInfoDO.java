/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>customer_base_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_base_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class CustomerBaseInfoDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long userId;

	private String customerId;

	private String customerName;

	private String contactMobile;

	private String sex;

	private String resoursFrom;

	private String certType;

	private String busiLicenseNo;

	private String certNo;

	private String isDistribution;

	private String customerManager;

	private long customerManagerId;

	private String director;

	private long depId;

	private String depName;

	private String depPath;

	private long directorId;

	private String inputPerson;

	private long inputPersonId;

	private String customerLevel;

	private String industryCode;

	private String countryCode;

	private String countryName;

	private String provinceCode;

	private String provinceName;

	private String cityCode;

	private String cityName;

	private String countyCode;

	private String countyName;

	private long channalId;

	private String channalName;

	private String channalType;

	private String enterpriseType;

	private String status;

	private String isTemporary;

	private String projectStatus;

	private String evalueStatus;

	private String changeStatus;

	private String customerType;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactMobile() {
		return contactMobile;
	}
	
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getResoursFrom() {
		return resoursFrom;
	}
	
	public void setResoursFrom(String resoursFrom) {
		this.resoursFrom = resoursFrom;
	}

	public String getCertType() {
		return certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
	}

	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getIsDistribution() {
		return isDistribution;
	}
	
	public void setIsDistribution(String isDistribution) {
		this.isDistribution = isDistribution;
	}

	public String getCustomerManager() {
		return customerManager;
	}
	
	public void setCustomerManager(String customerManager) {
		this.customerManager = customerManager;
	}

	public long getCustomerManagerId() {
		return customerManagerId;
	}
	
	public void setCustomerManagerId(long customerManagerId) {
		this.customerManagerId = customerManagerId;
	}

	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}

	public long getDepId() {
		return depId;
	}
	
	public void setDepId(long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}
	
	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepPath() {
		return depPath;
	}
	
	public void setDepPath(String depPath) {
		this.depPath = depPath;
	}

	public long getDirectorId() {
		return directorId;
	}
	
	public void setDirectorId(long directorId) {
		this.directorId = directorId;
	}

	public String getInputPerson() {
		return inputPerson;
	}
	
	public void setInputPerson(String inputPerson) {
		this.inputPerson = inputPerson;
	}

	public long getInputPersonId() {
		return inputPersonId;
	}
	
	public void setInputPersonId(long inputPersonId) {
		this.inputPersonId = inputPersonId;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}
	
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	public String getIndustryCode() {
		return industryCode;
	}
	
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}
	
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}
	
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyCode() {
		return countyCode;
	}
	
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountyName() {
		return countyName;
	}
	
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public long getChannalId() {
		return channalId;
	}
	
	public void setChannalId(long channalId) {
		this.channalId = channalId;
	}

	public String getChannalName() {
		return channalName;
	}
	
	public void setChannalName(String channalName) {
		this.channalName = channalName;
	}

	public String getChannalType() {
		return channalType;
	}
	
	public void setChannalType(String channalType) {
		this.channalType = channalType;
	}

	public String getEnterpriseType() {
		return enterpriseType;
	}
	
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsTemporary() {
		return isTemporary;
	}
	
	public void setIsTemporary(String isTemporary) {
		this.isTemporary = isTemporary;
	}

	public String getProjectStatus() {
		return projectStatus;
	}
	
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getEvalueStatus() {
		return evalueStatus;
	}
	
	public void setEvalueStatus(String evalueStatus) {
		this.evalueStatus = evalueStatus;
	}

	public String getChangeStatus() {
		return changeStatus;
	}
	
	public void setChangeStatus(String changeStatus) {
		this.changeStatus = changeStatus;
	}

	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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
