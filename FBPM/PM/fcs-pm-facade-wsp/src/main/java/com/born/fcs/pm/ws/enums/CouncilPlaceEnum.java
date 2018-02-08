package com.born.fcs.pm.ws.enums;

public enum CouncilPlaceEnum {
	PLACE1("一会议室(五楼)", "一会议室(五楼)"),
	PLACE2("二会议室(四楼)", "二会议室(四楼)"),
	PLACE3("三会议室(三楼)", "三会议室(三楼)"),
	PLACE4("四会议室(二楼)", "四会议室(二楼)"),
	PLACE5("五会议室(负一楼)", "五会议室(负一楼)"), ;
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 
	 * @param code 枚举值
	 * @param message 枚举描述
	 */
	private CouncilPlaceEnum(String code, String message) {
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
	 * @return CouncilPlaceEnum
	 */
	public static CouncilPlaceEnum getByCode(String code) {
		for (CouncilPlaceEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<CouncilPlaceEnum>
	 */
	public static java.util.List<CouncilPlaceEnum> getAllEnum() {
		java.util.List<CouncilPlaceEnum> list = new java.util.ArrayList<CouncilPlaceEnum>(
			values().length);
		for (CouncilPlaceEnum _enum : values()) {
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
		for (CouncilPlaceEnum _enum : values()) {
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
		CouncilPlaceEnum _enum = getByCode(code);
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
	public static String getCode(CouncilPlaceEnum _enum) {
		if (_enum == null) {
			return null;
		}
		return _enum.getCode();
	}
}
