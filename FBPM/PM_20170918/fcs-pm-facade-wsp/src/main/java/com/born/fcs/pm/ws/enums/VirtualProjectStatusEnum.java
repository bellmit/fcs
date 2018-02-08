package com.born.fcs.pm.ws.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 虚拟项目状态
 *
 * @author wuzj
 */
public enum VirtualProjectStatusEnum {
	
	DRAFT("DRAFT", "草稿"),
	
	SUBMIT("SUBMIT", "已提交"),
	
	IN_USE("IN_USE", "已使用");
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 构造一个<code>VirtualProjectStatusEnum</code>枚举对象
	 * 
	 * @param code
	 * @param message
	 */
	private VirtualProjectStatusEnum(String code, String message) {
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
	 * @return VirtualProjectStatusEnum
	 */
	public static VirtualProjectStatusEnum getByCode(String code) {
		for (VirtualProjectStatusEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<VirtualProjectStatusEnum>
	 */
	public static List<VirtualProjectStatusEnum> getAllEnum() {
		List<VirtualProjectStatusEnum> list = new ArrayList<VirtualProjectStatusEnum>();
		for (VirtualProjectStatusEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public static List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (VirtualProjectStatusEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
