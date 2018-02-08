/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>evaluating_financial_set</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/evaluating_financial_set.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class EvaluatingFinancialSetDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private String year;

	private String string1;

	private String string2;

	private String string3;

	private String string4;

	private String string5;

	private String string6;

	private String string7;

	private String string8;

	private String string9;

	private String string10;

	private String string11;

	private String string12;

	private String string13;

	private String string14;

	private String string15;

	private String string16;

	private String string17;

	private String string18;

	private String string19;

	private String string20;

	private String string21;

	private String calculatingFormula;

	private String typeChild;

	private String type;

	private Date rowAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public String getString1() {
		return string1;
	}
	
	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}
	
	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}
	
	public void setString3(String string3) {
		this.string3 = string3;
	}

	public String getString4() {
		return string4;
	}
	
	public void setString4(String string4) {
		this.string4 = string4;
	}

	public String getString5() {
		return string5;
	}
	
	public void setString5(String string5) {
		this.string5 = string5;
	}

	public String getString6() {
		return string6;
	}
	
	public void setString6(String string6) {
		this.string6 = string6;
	}

	public String getString7() {
		return string7;
	}
	
	public void setString7(String string7) {
		this.string7 = string7;
	}

	public String getString8() {
		return string8;
	}
	
	public void setString8(String string8) {
		this.string8 = string8;
	}

	public String getString9() {
		return string9;
	}
	
	public void setString9(String string9) {
		this.string9 = string9;
	}

	public String getString10() {
		return string10;
	}
	
	public void setString10(String string10) {
		this.string10 = string10;
	}

	public String getString11() {
		return string11;
	}
	
	public void setString11(String string11) {
		this.string11 = string11;
	}

	public String getString12() {
		return string12;
	}
	
	public void setString12(String string12) {
		this.string12 = string12;
	}

	public String getString13() {
		return string13;
	}
	
	public void setString13(String string13) {
		this.string13 = string13;
	}

	public String getString14() {
		return string14;
	}
	
	public void setString14(String string14) {
		this.string14 = string14;
	}

	public String getString15() {
		return string15;
	}
	
	public void setString15(String string15) {
		this.string15 = string15;
	}

	public String getString16() {
		return string16;
	}
	
	public void setString16(String string16) {
		this.string16 = string16;
	}

	public String getString17() {
		return string17;
	}
	
	public void setString17(String string17) {
		this.string17 = string17;
	}

	public String getString18() {
		return string18;
	}
	
	public void setString18(String string18) {
		this.string18 = string18;
	}

	public String getString19() {
		return string19;
	}
	
	public void setString19(String string19) {
		this.string19 = string19;
	}

	public String getString20() {
		return string20;
	}
	
	public void setString20(String string20) {
		this.string20 = string20;
	}

	public String getString21() {
		return string21;
	}
	
	public void setString21(String string21) {
		this.string21 = string21;
	}

	public String getCalculatingFormula() {
		return calculatingFormula;
	}
	
	public void setCalculatingFormula(String calculatingFormula) {
		this.calculatingFormula = calculatingFormula;
	}

	public String getTypeChild() {
		return typeChild;
	}
	
	public void setTypeChild(String typeChild) {
		this.typeChild = typeChild;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public Date getRowAddTime() {
		return rowAddTime;
	}
	
	public void setRowAddTime(Date rowAddTime) {
		this.rowAddTime = rowAddTime;
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
