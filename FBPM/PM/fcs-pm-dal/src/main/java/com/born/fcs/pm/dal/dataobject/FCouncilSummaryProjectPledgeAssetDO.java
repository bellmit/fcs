/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>f_council_summary_project_pledge_asset</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_pledge_asset.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FCouncilSummaryProjectPledgeAssetDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long spId;

	private String type;

	private String typeDesc;

	private long assetsId;

	private String assetType;

	private String ownershipName;

	private Money evaluationPrice = new Money(0, 0);

	private double pledgeRate;

	private String synPosition;

	private String postposition;

	private Money debtedAmount = new Money(0, 0);

	private String assetRemark;

	private String remark;

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getSpId() {
		return spId;
	}
	
	public void setSpId(long spId) {
		this.spId = spId;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeDesc() {
		return typeDesc;
	}
	
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public long getAssetsId() {
		return assetsId;
	}
	
	public void setAssetsId(long assetsId) {
		this.assetsId = assetsId;
	}

	public String getAssetType() {
		return assetType;
	}
	
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getOwnershipName() {
		return ownershipName;
	}
	
	public void setOwnershipName(String ownershipName) {
		this.ownershipName = ownershipName;
	}

	public Money getEvaluationPrice() {
		return evaluationPrice;
	}
	
	public void setEvaluationPrice(Money evaluationPrice) {
		if (evaluationPrice == null) {
			this.evaluationPrice = new Money(0, 0);
		} else {
			this.evaluationPrice = evaluationPrice;
		}
	}

	public double getPledgeRate() {
		return pledgeRate;
	}
	
	public void setPledgeRate(double pledgeRate) {
		this.pledgeRate = pledgeRate;
	}

	public String getSynPosition() {
		return synPosition;
	}
	
	public void setSynPosition(String synPosition) {
		this.synPosition = synPosition;
	}

	public String getPostposition() {
		return postposition;
	}
	
	public void setPostposition(String postposition) {
		this.postposition = postposition;
	}

	public Money getDebtedAmount() {
		return debtedAmount;
	}
	
	public void setDebtedAmount(Money debtedAmount) {
		if (debtedAmount == null) {
			this.debtedAmount = new Money(0, 0);
		} else {
			this.debtedAmount = debtedAmount;
		}
	}

	public String getAssetRemark() {
		return assetRemark;
	}
	
	public void setAssetRemark(String assetRemark) {
		this.assetRemark = assetRemark;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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