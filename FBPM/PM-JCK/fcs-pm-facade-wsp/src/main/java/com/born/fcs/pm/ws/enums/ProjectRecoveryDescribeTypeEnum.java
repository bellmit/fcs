/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * hjiajie 下午6:02:54 创建
 */
package com.born.fcs.pm.ws.enums;

/**
 * 
 * 描述类型 【拍卖/变卖】 from --追偿跟踪表 - 诉讼-执行-执行内容
 * @author hjiajie
 * 
 */
public enum ProjectRecoveryDescribeTypeEnum {
	
	/*** 拍卖 **/
	AUCTION("AUCTION", "拍卖"),
	/*** 变卖 **/
	SELL_OFF("SELL_OFF", "变卖"), ;
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 
	 * @param code 枚举值
	 * @param message 枚举描述
	 */
	private ProjectRecoveryDescribeTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 * 
	 * @param code
	 * @return ProjectRecoveryDescribeTypeEnum
	 */
	public static ProjectRecoveryDescribeTypeEnum getByCode(String code) {
		for (ProjectRecoveryDescribeTypeEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<ProjectRecoveryDescribeTypeEnum>
	 */
	public static java.util.List<ProjectRecoveryDescribeTypeEnum> getAllEnum() {
		java.util.List<ProjectRecoveryDescribeTypeEnum> list = new java.util.ArrayList<ProjectRecoveryDescribeTypeEnum>(
			values().length);
		for (ProjectRecoveryDescribeTypeEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public static java.util.List<String> getAllEnumCode() {
		java.util.List<String> list = new java.util.ArrayList<String>(values().length);
		for (ProjectRecoveryDescribeTypeEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
	
	/**
	 * 通过code获取msg
	 * @param code 枚举值
	 * @return
	 */
	public static String getMsgByCode(String code) {
		if (code == null) {
			return null;
		}
		ProjectRecoveryDescribeTypeEnum _enum = getByCode(code);
		if (_enum == null) {
			return null;
		}
		return _enum.getMessage();
	}
	
	/**
	 * 获取枚举code
	 * @param _enum
	 * @return
	 */
	public static String getCode(ProjectRecoveryDescribeTypeEnum _enum) {
		if (_enum == null) {
			return null;
		}
		return _enum.getCode();
	}
}
