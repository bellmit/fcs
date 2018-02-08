/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports

/**
 * A data object class directly models database table <tt>report_rule</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/report_rule.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ReportRuleDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long reportId;

	private String reportName;

	private String sqlStr;

	private String accessRoles;

	private String note;

	private String filter1Name;

	private String filter1Type;

	private String filter1Sql;

	private String filter1Options;

	private String filter2Name;

	private String filter2Type;

	private String filter2Sql;

	private String filter2Options;

	private String filter3Name;

	private String filter3Type;

	private String filter3Sql;

	private String filter3Options;

	private String filter4Name;

	private String filter4Type;

	private String filter4Sql;

	private String filter4Options;

	private String filter5Name;

	private String filter5Type;

	private String filter5Sql;

	private String filter5Options;

	private String filter6Name;

	private String filter6Type;

	private String filter6Sql;

	private String filter6Options;

	private int sortOrder;

    //========== getters and setters ==========

	public long getReportId() {
		return reportId;
	}
	
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public String getReportName() {
		return reportName;
	}
	
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getSqlStr() {
		return sqlStr;
	}
	
	public void setSqlStr(String sqlStr) {
		this.sqlStr = sqlStr;
	}

	public String getAccessRoles() {
		return accessRoles;
	}
	
	public void setAccessRoles(String accessRoles) {
		this.accessRoles = accessRoles;
	}

	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}

	public String getFilter1Name() {
		return filter1Name;
	}
	
	public void setFilter1Name(String filter1Name) {
		this.filter1Name = filter1Name;
	}

	public String getFilter1Type() {
		return filter1Type;
	}
	
	public void setFilter1Type(String filter1Type) {
		this.filter1Type = filter1Type;
	}

	public String getFilter1Sql() {
		return filter1Sql;
	}
	
	public void setFilter1Sql(String filter1Sql) {
		this.filter1Sql = filter1Sql;
	}

	public String getFilter1Options() {
		return filter1Options;
	}
	
	public void setFilter1Options(String filter1Options) {
		this.filter1Options = filter1Options;
	}

	public String getFilter2Name() {
		return filter2Name;
	}
	
	public void setFilter2Name(String filter2Name) {
		this.filter2Name = filter2Name;
	}

	public String getFilter2Type() {
		return filter2Type;
	}
	
	public void setFilter2Type(String filter2Type) {
		this.filter2Type = filter2Type;
	}

	public String getFilter2Sql() {
		return filter2Sql;
	}
	
	public void setFilter2Sql(String filter2Sql) {
		this.filter2Sql = filter2Sql;
	}

	public String getFilter2Options() {
		return filter2Options;
	}
	
	public void setFilter2Options(String filter2Options) {
		this.filter2Options = filter2Options;
	}

	public String getFilter3Name() {
		return filter3Name;
	}
	
	public void setFilter3Name(String filter3Name) {
		this.filter3Name = filter3Name;
	}

	public String getFilter3Type() {
		return filter3Type;
	}
	
	public void setFilter3Type(String filter3Type) {
		this.filter3Type = filter3Type;
	}

	public String getFilter3Sql() {
		return filter3Sql;
	}
	
	public void setFilter3Sql(String filter3Sql) {
		this.filter3Sql = filter3Sql;
	}

	public String getFilter3Options() {
		return filter3Options;
	}
	
	public void setFilter3Options(String filter3Options) {
		this.filter3Options = filter3Options;
	}

	public String getFilter4Name() {
		return filter4Name;
	}
	
	public void setFilter4Name(String filter4Name) {
		this.filter4Name = filter4Name;
	}

	public String getFilter4Type() {
		return filter4Type;
	}
	
	public void setFilter4Type(String filter4Type) {
		this.filter4Type = filter4Type;
	}

	public String getFilter4Sql() {
		return filter4Sql;
	}
	
	public void setFilter4Sql(String filter4Sql) {
		this.filter4Sql = filter4Sql;
	}

	public String getFilter4Options() {
		return filter4Options;
	}
	
	public void setFilter4Options(String filter4Options) {
		this.filter4Options = filter4Options;
	}

	public String getFilter5Name() {
		return filter5Name;
	}
	
	public void setFilter5Name(String filter5Name) {
		this.filter5Name = filter5Name;
	}

	public String getFilter5Type() {
		return filter5Type;
	}
	
	public void setFilter5Type(String filter5Type) {
		this.filter5Type = filter5Type;
	}

	public String getFilter5Sql() {
		return filter5Sql;
	}
	
	public void setFilter5Sql(String filter5Sql) {
		this.filter5Sql = filter5Sql;
	}

	public String getFilter5Options() {
		return filter5Options;
	}
	
	public void setFilter5Options(String filter5Options) {
		this.filter5Options = filter5Options;
	}

	public String getFilter6Name() {
		return filter6Name;
	}
	
	public void setFilter6Name(String filter6Name) {
		this.filter6Name = filter6Name;
	}

	public String getFilter6Type() {
		return filter6Type;
	}
	
	public void setFilter6Type(String filter6Type) {
		this.filter6Type = filter6Type;
	}

	public String getFilter6Sql() {
		return filter6Sql;
	}
	
	public void setFilter6Sql(String filter6Sql) {
		this.filter6Sql = filter6Sql;
	}

	public String getFilter6Options() {
		return filter6Options;
	}
	
	public void setFilter6Options(String filter6Options) {
		this.filter6Options = filter6Options;
	}

	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
