package com.fick.smd.hibernate.formbean.stockbean;

// Generated 2013-2-28 14:11:48 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Stockmaxrate generated by hbm2java
 */
public class StockProps implements java.io.Serializable {

	private Integer id;
	private String stockcode;
	private float maxrate;
	private float pricehighest;
	private float pricelowest;
	private float priceyestoday;
	private float pricetoday;
	private float pricetodayend;

	private Date updatedate;

	public StockProps() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockcode() {
		return this.stockcode;
	}

	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}

	public float getMaxrate() {
		return this.maxrate;
	}

	public void setMaxrate(float maxrate) {
		this.maxrate = maxrate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public float getPricehighest() {
		return pricehighest;
	}

	public void setPricehighest(float pricehighest) {
		this.pricehighest = pricehighest;
	}

	public float getPricelowest() {
		return pricelowest;
	}

	public void setPricelowest(float pricelowest) {
		this.pricelowest = pricelowest;
	}

	public float getPriceyestoday() {
		return priceyestoday;
	}

	public void setPriceyestoday(float priceyestoday) {
		this.priceyestoday = priceyestoday;
	}

	public float getPricetoday() {
		return pricetoday;
	}

	public void setPricetoday(float pricetoday) {
		this.pricetoday = pricetoday;
	}

	public float getPricetodayend() {
		return pricetodayend;
	}

	public void setPricetodayend(float pricetodayend) {
		this.pricetodayend = pricetodayend;
	}

}
