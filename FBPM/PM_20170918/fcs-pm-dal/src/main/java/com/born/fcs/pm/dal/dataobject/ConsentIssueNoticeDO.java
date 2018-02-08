/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
// auto generated imports
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * A data object class directly models database table
 * <tt>consent_issue_notice</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/consent_issue_notice.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 *
 * @author peigen
 */
public class ConsentIssueNoticeDO extends ProjectDO implements Serializable {
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -4282603875229233564L;
	
	//========== properties ==========
	
	private long noticeId;
	
	private String projectCode;
	
	private String projectName;
	
	private long customerId;
	
	private String customerName;
	
	private String customerType;
	
	private String busiType;
	
	private String busiTypeName;
	
	private long busiManagerId;
	
	private String busiManagerAccount;
	
	private String busiManagerName;
	
	private String isUploadReceipt;
	
	private String receiptAttachment;
	
	private String yourCooperationCompany;
	
	private String yourCooperationAttachment;
	
	private String myCooperationCompany;
	
	private String myCooperationAttachment;
	
	private String myCooperationContractNo;
	
	private String html;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	//查询条件部分
	
	List<Long> deptIdList;
	
	List<String> statusList;
	
	long loginUserId;
	
	long draftUserId;
	
	long pageSize;
	
	long limitStart;
	
	String sortCol;
	
	String sortOrder;
	
	//========== getters and setters ==========
	
	public long getNoticeId() {
		return noticeId;
	}
	
	public long getDraftUserId() {
		return this.draftUserId;
	}
	
	public void setDraftUserId(long draftUserId) {
		this.draftUserId = draftUserId;
	}
	
	public void setNoticeId(long noticeId) {
		this.noticeId = noticeId;
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
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public String getBusiType() {
		return busiType;
	}
	
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	
	public String getBusiTypeName() {
		return busiTypeName;
	}
	
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}
	
	public long getBusiManagerId() {
		return busiManagerId;
	}
	
	public void setBusiManagerId(long busiManagerId) {
		this.busiManagerId = busiManagerId;
	}
	
	public String getBusiManagerAccount() {
		return busiManagerAccount;
	}
	
	public void setBusiManagerAccount(String busiManagerAccount) {
		this.busiManagerAccount = busiManagerAccount;
	}
	
	public String getBusiManagerName() {
		return busiManagerName;
	}
	
	public void setBusiManagerName(String busiManagerName) {
		this.busiManagerName = busiManagerName;
	}
	
	public String getIsUploadReceipt() {
		return isUploadReceipt;
	}
	
	public void setIsUploadReceipt(String isUploadReceipt) {
		this.isUploadReceipt = isUploadReceipt;
	}
	
	public String getReceiptAttachment() {
		return receiptAttachment;
	}
	
	public void setReceiptAttachment(String receiptAttachment) {
		this.receiptAttachment = receiptAttachment;
	}
	
	public String getYourCooperationCompany() {
		return yourCooperationCompany;
	}
	
	public void setYourCooperationCompany(String yourCooperationCompany) {
		this.yourCooperationCompany = yourCooperationCompany;
	}
	
	public String getYourCooperationAttachment() {
		return yourCooperationAttachment;
	}
	
	public void setYourCooperationAttachment(String yourCooperationAttachment) {
		this.yourCooperationAttachment = yourCooperationAttachment;
	}
	
	public String getMyCooperationCompany() {
		return myCooperationCompany;
	}
	
	public void setMyCooperationCompany(String myCooperationCompany) {
		this.myCooperationCompany = myCooperationCompany;
	}
	
	public String getMyCooperationAttachment() {
		return myCooperationAttachment;
	}
	
	public void setMyCooperationAttachment(String myCooperationAttachment) {
		this.myCooperationAttachment = myCooperationAttachment;
	}
	
	public String getMyCooperationContractNo() {
		return myCooperationContractNo;
	}
	
	public void setMyCooperationContractNo(String myCooperationContractNo) {
		this.myCooperationContractNo = myCooperationContractNo;
	}
	
	public String getHtml() {
		return html;
	}
	
	public void setHtml(String html) {
		this.html = html;
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
	
	public List<Long> getDeptIdList() {
		return deptIdList;
	}
	
	public void setDeptIdList(List<Long> deptIdList) {
		this.deptIdList = deptIdList;
	}
	
	public List<String> getStatusList() {
		return statusList;
	}
	
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}
	
	public long getLoginUserId() {
		return loginUserId;
	}
	
	public void setLoginUserId(long loginUserId) {
		this.loginUserId = loginUserId;
	}
	
	public long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	
	public long getLimitStart() {
		return limitStart;
	}
	
	public void setLimitStart(long limitStart) {
		this.limitStart = limitStart;
	}
	
	public String getSortCol() {
		return sortCol;
	}
	
	public void setSortCol(String sortCol) {
		this.sortCol = sortCol;
	}
	
	public String getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(String sortOrder) {
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
