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
 * A data object class directly models database table <tt>f_stamp_apply_file</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_stamp_apply_file.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FStampApplyFileDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long applyId;

	private String contractCode;

	private long replaceApplyId;

	private String fileName;

	private String fileConent;

	private int legalChapterNum;

	private int cachetNum;

	private String isReplaceOld;

	private int oldFileNum;

	private int sortOrder;

	private String remark;

	private String oldFileContent;

	private int oldLegalChapterNum;

	private int oldCachetNum;

	private String oldFileName;

	private String source;

	private String invalid;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getApplyId() {
		return applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	public String getContractCode() {
		return contractCode;
	}
	
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public long getReplaceApplyId() {
		return replaceApplyId;
	}
	
	public void setReplaceApplyId(long replaceApplyId) {
		this.replaceApplyId = replaceApplyId;
	}

	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileConent() {
		return fileConent;
	}
	
	public void setFileConent(String fileConent) {
		this.fileConent = fileConent;
	}

	public int getLegalChapterNum() {
		return legalChapterNum;
	}
	
	public void setLegalChapterNum(int legalChapterNum) {
		this.legalChapterNum = legalChapterNum;
	}

	public int getCachetNum() {
		return cachetNum;
	}
	
	public void setCachetNum(int cachetNum) {
		this.cachetNum = cachetNum;
	}

	public String getIsReplaceOld() {
		return isReplaceOld;
	}
	
	public void setIsReplaceOld(String isReplaceOld) {
		this.isReplaceOld = isReplaceOld;
	}

	public int getOldFileNum() {
		return oldFileNum;
	}
	
	public void setOldFileNum(int oldFileNum) {
		this.oldFileNum = oldFileNum;
	}

	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOldFileContent() {
		return oldFileContent;
	}
	
	public void setOldFileContent(String oldFileContent) {
		this.oldFileContent = oldFileContent;
	}

	public int getOldLegalChapterNum() {
		return oldLegalChapterNum;
	}
	
	public void setOldLegalChapterNum(int oldLegalChapterNum) {
		this.oldLegalChapterNum = oldLegalChapterNum;
	}

	public int getOldCachetNum() {
		return oldCachetNum;
	}
	
	public void setOldCachetNum(int oldCachetNum) {
		this.oldCachetNum = oldCachetNum;
	}

	public String getOldFileName() {
		return oldFileName;
	}
	
	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}

	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	public String getInvalid() {
		return invalid;
	}
	
	public void setInvalid(String invalid) {
		this.invalid = invalid;
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
