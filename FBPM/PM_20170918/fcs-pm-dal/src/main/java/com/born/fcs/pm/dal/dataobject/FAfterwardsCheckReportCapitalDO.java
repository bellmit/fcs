/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>f_afterwards_check_report_capital</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_report_capital.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FAfterwardsCheckReportCapitalDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long capitalId;

	private long formId;

	private String capitalType;

	private String capitalItem;

	private String capitalValue1;

	private String capitalValue2;

	private String capitalValue3;

	private String capitalValue4;

	private String capitalValue5;

	private String capitalValue6;

	private String capitalValue7;

	private String capitalValue8;

	private String capitalValue9;

	private String capitalValue10;

	private String delAble;

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getCapitalId() {
		return capitalId;
	}
	
	public void setCapitalId(long capitalId) {
		this.capitalId = capitalId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getCapitalType() {
		return capitalType;
	}
	
	public void setCapitalType(String capitalType) {
		this.capitalType = capitalType;
	}

	public String getCapitalItem() {
		return capitalItem;
	}
	
	public void setCapitalItem(String capitalItem) {
		this.capitalItem = capitalItem;
	}

	public String getCapitalValue1() {
		return capitalValue1;
	}
	
	public void setCapitalValue1(String capitalValue1) {
		this.capitalValue1 = capitalValue1;
	}

	public String getCapitalValue2() {
		return capitalValue2;
	}
	
	public void setCapitalValue2(String capitalValue2) {
		this.capitalValue2 = capitalValue2;
	}

	public String getCapitalValue3() {
		return capitalValue3;
	}
	
	public void setCapitalValue3(String capitalValue3) {
		this.capitalValue3 = capitalValue3;
	}

	public String getCapitalValue4() {
		return capitalValue4;
	}
	
	public void setCapitalValue4(String capitalValue4) {
		this.capitalValue4 = capitalValue4;
	}

	public String getCapitalValue5() {
		return capitalValue5;
	}
	
	public void setCapitalValue5(String capitalValue5) {
		this.capitalValue5 = capitalValue5;
	}

	public String getCapitalValue6() {
		return capitalValue6;
	}
	
	public void setCapitalValue6(String capitalValue6) {
		this.capitalValue6 = capitalValue6;
	}

	public String getCapitalValue7() {
		return capitalValue7;
	}
	
	public void setCapitalValue7(String capitalValue7) {
		this.capitalValue7 = capitalValue7;
	}

	public String getCapitalValue8() {
		return capitalValue8;
	}
	
	public void setCapitalValue8(String capitalValue8) {
		this.capitalValue8 = capitalValue8;
	}

	public String getCapitalValue9() {
		return capitalValue9;
	}
	
	public void setCapitalValue9(String capitalValue9) {
		this.capitalValue9 = capitalValue9;
	}

	public String getCapitalValue10() {
		return capitalValue10;
	}
	
	public void setCapitalValue10(String capitalValue10) {
		this.capitalValue10 = capitalValue10;
	}

	public String getDelAble() {
		return delAble;
	}
	
	public void setDelAble(String delAble) {
		this.delAble = delAble;
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
