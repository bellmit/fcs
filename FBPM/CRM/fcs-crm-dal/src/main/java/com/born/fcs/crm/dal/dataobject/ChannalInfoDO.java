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
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>channal_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/channal_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ChannalInfoDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private String channelCode;

	private String channelName;

	private String channelType;

	private String institutionalAttributes;

	private String address;

	private String contactPerson1;

	private String contactMobile1;

	private String contactPerson2;

	private String contactMobile2;

	private String leadings;

	private double lossAllocationRate;

	private double bondRate;

	private Money creditAmount = new Money(0, 0);

	private Money creditAmountUsed = new Money(0, 0);

	private String isCreditAmount;

	private Money singleLimit = new Money(0, 0);

	private String isSingleLimit;

	private double times;

	private String isTimes;

	private double percent;

	private String isPercent;

	private Date creditStartDate;

	private Date creditEndDate;

	private int compensatoryLimit;

	private String dayType;

	private String straddleYear;

	private String enclosureUrl;

	private String status;

	private String inputPerson;

	private String isTemporary;

	private String isRemind;

	private String isHistory;

	private String contractNo;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getChannelCode() {
		return channelCode;
	}
	
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelType() {
		return channelType;
	}
	
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getInstitutionalAttributes() {
		return institutionalAttributes;
	}
	
	public void setInstitutionalAttributes(String institutionalAttributes) {
		this.institutionalAttributes = institutionalAttributes;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactPerson1() {
		return contactPerson1;
	}
	
	public void setContactPerson1(String contactPerson1) {
		this.contactPerson1 = contactPerson1;
	}

	public String getContactMobile1() {
		return contactMobile1;
	}
	
	public void setContactMobile1(String contactMobile1) {
		this.contactMobile1 = contactMobile1;
	}

	public String getContactPerson2() {
		return contactPerson2;
	}
	
	public void setContactPerson2(String contactPerson2) {
		this.contactPerson2 = contactPerson2;
	}

	public String getContactMobile2() {
		return contactMobile2;
	}
	
	public void setContactMobile2(String contactMobile2) {
		this.contactMobile2 = contactMobile2;
	}

	public String getLeadings() {
		return leadings;
	}
	
	public void setLeadings(String leadings) {
		this.leadings = leadings;
	}

	public double getLossAllocationRate() {
		return lossAllocationRate;
	}
	
	public void setLossAllocationRate(double lossAllocationRate) {
		this.lossAllocationRate = lossAllocationRate;
	}

	public double getBondRate() {
		return bondRate;
	}
	
	public void setBondRate(double bondRate) {
		this.bondRate = bondRate;
	}

	public Money getCreditAmount() {
		return creditAmount;
	}
	
	public void setCreditAmount(Money creditAmount) {
		if (creditAmount == null) {
			this.creditAmount = new Money(0, 0);
		} else {
			this.creditAmount = creditAmount;
		}
	}

	public Money getCreditAmountUsed() {
		return creditAmountUsed;
	}
	
	public void setCreditAmountUsed(Money creditAmountUsed) {
		if (creditAmountUsed == null) {
			this.creditAmountUsed = new Money(0, 0);
		} else {
			this.creditAmountUsed = creditAmountUsed;
		}
	}

	public String getIsCreditAmount() {
		return isCreditAmount;
	}
	
	public void setIsCreditAmount(String isCreditAmount) {
		this.isCreditAmount = isCreditAmount;
	}

	public Money getSingleLimit() {
		return singleLimit;
	}
	
	public void setSingleLimit(Money singleLimit) {
		if (singleLimit == null) {
			this.singleLimit = new Money(0, 0);
		} else {
			this.singleLimit = singleLimit;
		}
	}

	public String getIsSingleLimit() {
		return isSingleLimit;
	}
	
	public void setIsSingleLimit(String isSingleLimit) {
		this.isSingleLimit = isSingleLimit;
	}

	public double getTimes() {
		return times;
	}
	
	public void setTimes(double times) {
		this.times = times;
	}

	public String getIsTimes() {
		return isTimes;
	}
	
	public void setIsTimes(String isTimes) {
		this.isTimes = isTimes;
	}

	public double getPercent() {
		return percent;
	}
	
	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getIsPercent() {
		return isPercent;
	}
	
	public void setIsPercent(String isPercent) {
		this.isPercent = isPercent;
	}

	public Date getCreditStartDate() {
		return creditStartDate;
	}
	
	public void setCreditStartDate(Date creditStartDate) {
		this.creditStartDate = creditStartDate;
	}

	public Date getCreditEndDate() {
		return creditEndDate;
	}
	
	public void setCreditEndDate(Date creditEndDate) {
		this.creditEndDate = creditEndDate;
	}

	public int getCompensatoryLimit() {
		return compensatoryLimit;
	}
	
	public void setCompensatoryLimit(int compensatoryLimit) {
		this.compensatoryLimit = compensatoryLimit;
	}

	public String getDayType() {
		return dayType;
	}
	
	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getStraddleYear() {
		return straddleYear;
	}
	
	public void setStraddleYear(String straddleYear) {
		this.straddleYear = straddleYear;
	}

	public String getEnclosureUrl() {
		return enclosureUrl;
	}
	
	public void setEnclosureUrl(String enclosureUrl) {
		this.enclosureUrl = enclosureUrl;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getInputPerson() {
		return inputPerson;
	}
	
	public void setInputPerson(String inputPerson) {
		this.inputPerson = inputPerson;
	}

	public String getIsTemporary() {
		return isTemporary;
	}
	
	public void setIsTemporary(String isTemporary) {
		this.isTemporary = isTemporary;
	}

	public String getIsRemind() {
		return isRemind;
	}
	
	public void setIsRemind(String isRemind) {
		this.isRemind = isRemind;
	}

	public String getIsHistory() {
		return isHistory;
	}
	
	public void setIsHistory(String isHistory) {
		this.isHistory = isHistory;
	}

	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
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
