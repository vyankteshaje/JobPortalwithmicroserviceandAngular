package com.jobportal.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * author : Pallavi
 * Pojo Name:ClientCourseDetails
 * Date : 05/03/2019
 * */
@Entity
public class ClientCourseDetails {
	@Id
private String clientCourseId;
private String clientCourseName;
private String clientCourseStartDate;
private String clientCourseEndDate;
private String clientCourseInstituteName;
private String clientCourseSpecialization;
private String clientCourseEducationGap;
private String clientCoursePercentage;
private String clientCourseType;
public String getClientCourseId() {
	return clientCourseId;
}
public void setClientCourseId(String clientCourseId) {
	this.clientCourseId = clientCourseId;
}
public String getClientCourseName() {
	return clientCourseName;
}
public void setClientCourseName(String clientCourseName) {
	this.clientCourseName = clientCourseName;
}
public String getClientCourseStartDate() {
	return clientCourseStartDate;
}
public void setClientCourseStartDate(String clientCourseStartDate) {
	this.clientCourseStartDate = clientCourseStartDate;
}
public String getClientCourseEndDate() {
	return clientCourseEndDate;
}
public void setClientCourseEndDate(String clientCourseEndDate) {
	this.clientCourseEndDate = clientCourseEndDate;
}
public String getClientCourseInstituteName() {
	return clientCourseInstituteName;
}
public void setClientCourseInstituteName(String clientCourseInstituteName) {
	this.clientCourseInstituteName = clientCourseInstituteName;
}
public String getClientCourseSpecialization() {
	return clientCourseSpecialization;
}
public void setClientCourseSpecialization(String clientCourseSpecialization) {
	this.clientCourseSpecialization = clientCourseSpecialization;
}
public String getClientCourseEducationGap() {
	return clientCourseEducationGap;
}
public void setClientCourseEducationGap(String clientCourseEducationGap) {
	this.clientCourseEducationGap = clientCourseEducationGap;
}
public String getClientCoursePercentage() {
	return clientCoursePercentage;
}
public void setClientCoursePercentage(String clientCoursePercentage) {
	this.clientCoursePercentage = clientCoursePercentage;
}
public String getClientCourseType() {
	return clientCourseType;
}
public void setClientCourseType(String clientCourseType) {
	this.clientCourseType = clientCourseType;
}



	
	
	
}
