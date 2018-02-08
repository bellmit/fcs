package com.born.fcs.pm.ws.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 尽调-授信方案-反担保措施-保证
 *
 * @author lirz
 * 
 * 2016-8-25 上午11:35:46
 *
 */
public enum GuarantorTypeEnum {
	
	LEGAL_PERSON_RELATED("LEGAL_PERSON_RELATED", "法人连带"),
	LEGAL_PERSON_GENERAL("LEGAL_PERSON_GENERAL", "法人一般"),
	PERSONAL_RELATED("PERSONAL_RELATED", "个人连带"),
	PERSONAL_GENERAL("PERSONAL_GENERAL", "个人一般"), ;
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 构造一个<code>GuarantorTypeEnum</code>枚举对象
	 * 
	 * @param code
	 * @param message
	 */
	private GuarantorTypeEnum(String code, String message) {
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
	 * @return GuarantorTypeEnum
	 */
	public static GuarantorTypeEnum getByCode(String code) {
		for (GuarantorTypeEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<GuarantorTypeEnum>
	 */
	public static List<GuarantorTypeEnum> getAllEnum() {
		List<GuarantorTypeEnum> list = new ArrayList<GuarantorTypeEnum>();
		for (GuarantorTypeEnum _enum : values()) {
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
		for (GuarantorTypeEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
