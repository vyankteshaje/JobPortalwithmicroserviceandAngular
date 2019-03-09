package com.jobportal.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * author : Pallavi
 * Pojo Name:ClientAddressDetails
  * Date : 05/03/2019
 * */

@Entity
public class ClientAddressDetails {
	@Id
private String clientAddressId;
private String clientHouse;
private String clientStreet;
private String clientArea;
private String clientCity;
private String clientState;
private String clientCountry;
private String clientPinCode;


public String getClientAddressId() {
	return clientAddressId;
}
public void setClientAddressId(String clientAddressId) {
	this.clientAddressId = clientAddressId;
}
public String getClientHouse() {
	return clientHouse;
}
public void setClientHouse(String clientHouse) {
	this.clientHouse = clientHouse;
}
public String getClientStreet() {
	return clientStreet;
}
public void setClientStreet(String clientStreet) {
	this.clientStreet = clientStreet;
}
public String getClientArea() {
	return clientArea;
}
public void setClientArea(String clientArea) {
	this.clientArea = clientArea;
}
public String getClientCity() {
	return clientCity;
}
public void setClientCity(String clientCity) {
	this.clientCity = clientCity;
}
public String getClientState() {
	return clientState;
}
public void setClientState(String clientState) {
	this.clientState = clientState;
}
public String getClientCountry() {
	return clientCountry;
}
public void setClientCountry(String clientCountry) {
	this.clientCountry = clientCountry;
}
public String getClientPinCode() {
	return clientPinCode;
}
public void setClientPinCode(String clientPinCode) {
	this.clientPinCode = clientPinCode;
}



}
