package com.jobportal.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * author : Pallavi
 * Pojo Name:ClientExperienceDetails
  * Date : 05/03/2019
 * */
@Entity
public class ClientExperienceDetails {
@Id
	private String clientExperienceId;
	private String clientExperienceJobTitle;
	private String clientExperienceCompanyName;
	private String clientExperienceWorkDescription;
	private String clientExperienceYear;
	private String clientExperienceWorkGap;
	private String clientExperienceCTC;
	
	
	public String getClientExperienceId() {
		return clientExperienceId;
	}
	public void setClientExperienceId(String clientExperienceId) {
		this.clientExperienceId = clientExperienceId;
	}
	public String getClientExperienceJobTitle() {
		return clientExperienceJobTitle;
	}
	public void setClientExperienceJobTitle(String clientExperienceJobTitle) {
		this.clientExperienceJobTitle = clientExperienceJobTitle;
	}
	public String getClientExperienceCompanyName() {
		return clientExperienceCompanyName;
	}
	public void setClientExperienceCompanyName(String clientExperienceCompanyName) {
		this.clientExperienceCompanyName = clientExperienceCompanyName;
	}
	public String getClientExperienceWorkDescription() {
		return clientExperienceWorkDescription;
	}
	public void setClientExperienceWorkDescription(String clientExperienceWorkDescription) {
		this.clientExperienceWorkDescription = clientExperienceWorkDescription;
	}
	
	public String getClientExperienceYear() {
		return clientExperienceYear;
	}
	public void setClientExperienceYear(String clientExperienceYear) {
		this.clientExperienceYear = clientExperienceYear;
	}
	public String getClientExperienceWorkGap() {
		return clientExperienceWorkGap;
	}
	public void setClientExperienceWorkGap(String clientExperienceWorkGap) {
		this.clientExperienceWorkGap = clientExperienceWorkGap;
	}
	public String getClientExperienceCTC() {
		return clientExperienceCTC;
	}
	public void setClientExperienceCTC(String clientExperienceCTC) {
		this.clientExperienceCTC = clientExperienceCTC;
	}
	
}
