package com.displayAttributes;

import java.sql.Date;

public class enrichedCompanySecurity {
private float Price;
private Date TRADE_DATE;
private String SECURITY_SYMBOL;
private String SECURITY_TYPE;
public float getPrice() {
	return Price;
}
public void setPrice(float price) {
	Price = price;
}
public Date getTRADE_DATE() {
	return TRADE_DATE;
}
public void setTRADE_DATE(Date tRADE_DATE) {
	TRADE_DATE = tRADE_DATE;
}
public String getSECURITY_SYMBOL() {
	return SECURITY_SYMBOL;
}
public void setSECURITY_SYMBOL(String sECURITY_SYMBOL) {
	SECURITY_SYMBOL = sECURITY_SYMBOL;
}
public String getSECURITY_TYPE() {
	return SECURITY_TYPE;
}
public void setSECURITY_TYPE(String sECURITY_TYPE) {
	SECURITY_TYPE = sECURITY_TYPE;
}
}
