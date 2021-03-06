package com.born.fcs.pm.ws.order.financialproject;

import java.util.Date;

import org.springframework.util.Assert;

import com.born.fcs.pm.ws.enums.BooleanEnum;
import com.born.fcs.pm.ws.order.base.ProcessOrder;
import com.yjf.common.lang.util.money.Money;

/**
 * 理财项目维护或到期维护Order
 *
 * @author wuzj
 */
public class FinancialProjectOrder extends ProcessOrder {
	
	private static final long serialVersionUID = 1913018019845785446L;
	/** 项目编号 */
	private String projectCode;
	/** 实际申购日 */
	private Date actualBuyDate;
	/** 实际到期日 */
	private Date actualExpireDate;
	/** 实际单价 */
	private Money actualPrice = new Money(0, 0);
	/** 实际申购数 */
	private long actualBuyNum;
	/** 实收本金 */
	private Money actualPrincipal = new Money(0, 0);
	/** 实收利息 */
	private Money actualInterest = new Money(0, 0);
	/** 是否信息维护 */
	private BooleanEnum isConfirm = BooleanEnum.NO;
	/** 是否到期信息维护 */
	private BooleanEnum isConfirmExpire = BooleanEnum.NO;
	/** 维护的收益率 */
	private double interestRate;
	/** 是否滚动 */
	private String isRoll;
	/** 是否开放 */
	private String isOpen;
	
	@Override
	public void check() {
		if (isConfirmExpire == BooleanEnum.IS) {//到期信息维护
			Assert.isTrue(!("IS".equals(isRoll) && "IS".equals(isOpen)), "滚动和开放不能同时为是");
		}
	}
	
	public String getProjectCode() {
		return this.projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public Date getActualBuyDate() {
		return this.actualBuyDate;
	}
	
	public void setActualBuyDate(Date actualBuyDate) {
		this.actualBuyDate = actualBuyDate;
	}
	
	public Date getActualExpireDate() {
		return this.actualExpireDate;
	}
	
	public void setActualExpireDate(Date actualExpireDate) {
		this.actualExpireDate = actualExpireDate;
	}
	
	public Money getActualPrice() {
		return this.actualPrice;
	}
	
	public void setActualPrice(Money actualPrice) {
		this.actualPrice = actualPrice;
	}
	
	public long getActualBuyNum() {
		return this.actualBuyNum;
	}
	
	public void setActualBuyNum(long actualBuyNum) {
		this.actualBuyNum = actualBuyNum;
	}
	
	public Money getActualPrincipal() {
		return this.actualPrincipal;
	}
	
	public void setActualPrincipal(Money actualPrincipal) {
		this.actualPrincipal = actualPrincipal;
	}
	
	public Money getActualInterest() {
		return this.actualInterest;
	}
	
	public void setActualInterest(Money actualInterest) {
		this.actualInterest = actualInterest;
	}
	
	public BooleanEnum getIsConfirm() {
		return this.isConfirm;
	}
	
	public void setIsConfirm(BooleanEnum isConfirm) {
		this.isConfirm = isConfirm;
	}
	
	public BooleanEnum getIsConfirmExpire() {
		return this.isConfirmExpire;
	}
	
	public void setIsConfirmExpire(BooleanEnum isConfirmExpire) {
		this.isConfirmExpire = isConfirmExpire;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String getIsRoll() {
		return this.isRoll;
	}
	
	public void setIsRoll(String isRoll) {
		this.isRoll = isRoll;
	}
	
	public String getIsOpen() {
		return this.isOpen;
	}
	
	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}
	
}
