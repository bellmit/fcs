package com.born.fcs.pm.ws.info.fund;

import java.util.Date;

import com.born.fcs.pm.ws.info.common.BaseToStringInfo;
import com.yjf.common.lang.util.money.Money;

/**
 * 放用款申请 - 回执
 *
 * @author wuzj
 */
public class FLoanUseApplyReceiptInfo extends BaseToStringInfo {
	
	private static final long serialVersionUID = -441307682022450732L;
	
	private long id;
	
	private long applyId;
	
	/** 实际金额 */
	private Money actualAmount = new Money(0, 0);
	
	/** 实际保证金 */
	private Money actualDepositAmount = new Money(0, 0);
	
	/** 实际放款时间 */
	private Date actualLoanTime;
	
	/** 流动资金贷款 */
	private Money liquidityLoanAmount = new Money(0, 0);
	/** 固定资产融资 */
	private Money fixedAssetsFinancingAmount = new Money(0, 0);
	/** 承兑汇票担保 */
	private Money acceptanceBillAmount = new Money(0, 0);
	/** 信用证担保 */
	private Money creditLetterAmount = new Money(0, 0);
	
	private String busiSubType;
	
	private String busiSubTypeName;
	
	/** 放款凭证 */
	private String voucherUrl;
	/** 其他资料 */
	private String otherName;
	private String otherUrl;
	
	private String remark;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getApplyId() {
		return this.applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}
	
	public Money getActualAmount() {
		return this.actualAmount;
	}
	
	public void setActualAmount(Money actualAmount) {
		this.actualAmount = actualAmount;
	}
	
	public Money getActualDepositAmount() {
		return this.actualDepositAmount;
	}
	
	public void setActualDepositAmount(Money actualDepositAmount) {
		this.actualDepositAmount = actualDepositAmount;
	}
	
	public Date getActualLoanTime() {
		return this.actualLoanTime;
	}
	
	public void setActualLoanTime(Date actualLoanTime) {
		this.actualLoanTime = actualLoanTime;
	}
	
	public Money getLiquidityLoanAmount() {
		return this.liquidityLoanAmount;
	}
	
	public void setLiquidityLoanAmount(Money liquidityLoanAmount) {
		this.liquidityLoanAmount = liquidityLoanAmount;
	}
	
	public Money getFixedAssetsFinancingAmount() {
		return this.fixedAssetsFinancingAmount;
	}
	
	public void setFixedAssetsFinancingAmount(Money fixedAssetsFinancingAmount) {
		this.fixedAssetsFinancingAmount = fixedAssetsFinancingAmount;
	}
	
	public Money getAcceptanceBillAmount() {
		return this.acceptanceBillAmount;
	}
	
	public void setAcceptanceBillAmount(Money acceptanceBillAmount) {
		this.acceptanceBillAmount = acceptanceBillAmount;
	}
	
	public Money getCreditLetterAmount() {
		return this.creditLetterAmount;
	}
	
	public void setCreditLetterAmount(Money creditLetterAmount) {
		this.creditLetterAmount = creditLetterAmount;
	}
	
	public String getBusiSubType() {
		return this.busiSubType;
	}
	
	public void setBusiSubType(String busiSubType) {
		this.busiSubType = busiSubType;
	}
	
	public String getBusiSubTypeName() {
		return this.busiSubTypeName;
	}
	
	public void setBusiSubTypeName(String busiSubTypeName) {
		this.busiSubTypeName = busiSubTypeName;
	}
	
	public String getVoucherUrl() {
		return this.voucherUrl;
	}
	
	public void setVoucherUrl(String voucherUrl) {
		this.voucherUrl = voucherUrl;
	}
	
	public String getOtherName() {
		return this.otherName;
	}
	
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	
	public String getOtherUrl() {
		return this.otherUrl;
	}
	
	public void setOtherUrl(String otherUrl) {
		this.otherUrl = otherUrl;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Date getRawAddTime() {
		return this.rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return this.rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
}
