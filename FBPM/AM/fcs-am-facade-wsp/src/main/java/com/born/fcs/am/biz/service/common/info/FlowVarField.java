package com.born.fcs.am.biz.service.common.info;

import com.born.fcs.am.ws.enums.base.FlowVarTypeEnum;

/**
 * 流程变量
 * 
 * 
 * @author qch
 * 
 */
public class FlowVarField {
	/**
	 * 流程变量名
	 */
	String varName;
	/**
	 * 流程变量值
	 */
	String varVal;
	/**
	 * 变量数据类型
	 */
	FlowVarTypeEnum varType;

	public String getVarName() {
		return this.varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	public String getVarVal() {
		return this.varVal;
	}

	public void setVarVal(String varVal) {
		this.varVal = varVal;
	}

	public FlowVarTypeEnum getVarType() {
		return this.varType;
	}

	public void setVarType(FlowVarTypeEnum varType) {
		this.varType = varType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlowVarField [varName=");
		builder.append(varName);
		builder.append(", varVal=");
		builder.append(varVal);
		builder.append(", varType=");
		builder.append(varType);
		builder.append("]");
		return builder.toString();
	}

}
