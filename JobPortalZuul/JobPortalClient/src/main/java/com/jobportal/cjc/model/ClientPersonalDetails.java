package com.jobportal.cjc.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * author : Pallavi
 * Pojo : ClientPersonalDetails
 * Date : 05/03/2019
 * */
@Entity
public class ClientPersonalDetails
{
		@Id
		private String clientId;
		private String clientFirstName;
		private String clientMiddletName;
		private String clientLastName;
		private String clientGender;
		private String clientMobile;
		private String clientDateOfBirth;
		private String [] clientLanguageKnown;
		private String clientMaritalStatus;
		private String clientNationality;
		private String clientDateOfRegistration;
		private String clientType;
		private String clientPhoto;
		
		@OneToOne(cascade=CascadeType.ALL) 
		@JoinColumn(name="clientAddressId")
		private ClientAddressDetails clientLocalAddress;
		
		@OneToOne(cascade=CascadeType.ALL) 
		private ClientAddressDetails clientPermanentAddress;
		
		@OneToOne(cascade=CascadeType.ALL) 
		@JoinColumn(name="clientEducationalId")
		private ClientEducationalDetails clientEducationalDetails;
		
		@OneToOne(cascade=CascadeType.ALL) 
		@JoinColumn(name="clientExperienceId")
		private ClientExperienceDetails clientExperienceDetails;
		
		@OneToOne(cascade=CascadeType.ALL) 
		@JoinColumn(name="email")
		private Login login;

		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getClientFirstName() {
			return clientFirstName;
		}
		public void setClientFirstName(String clientFirstName) {
			this.clientFirstName = clientFirstName;
		}
		
		public String getClientMiddletName() {
			return clientMiddletName;
		}
		
		public void setClientMiddletName(String clientMiddletName) {
			this.clientMiddletName = clientMiddletName;
		}
		public String getClientLastName() {
			return clientLastName;
		}
		
		public void setClientLastName(String clientLastName) {
			this.clientLastName = clientLastName;
		}
		public String getClientGender() {
			return clientGender;
		}
		
		public void setClientGender(String clientGender) {
			this.clientGender = clientGender;
		}
		public String getClientMobile() {
			return clientMobile;
		}
		public void setClientMobile(String clientMobile) {
			this.clientMobile = clientMobile;
		}
		
		public Login getLogin() {
			return login;
		}
		public void setLogin(Login login) {
			this.login = login;
		}
		public String getClientDateOfBirth() {
			return clientDateOfBirth;
		}
		public void setClientDateOfBirth(String clientDateOfBirth) {
			this.clientDateOfBirth = clientDateOfBirth;
		}
		
		public String[] getClientLanguageKnown() {
			return clientLanguageKnown;
		}
		public void setClientLanguageKnown(String[] clientLanguageKnown) {
			this.clientLanguageKnown = clientLanguageKnown;
		}
		
		public String getClientMaritalStatus() {
			return clientMaritalStatus;
		}
		public void setClientMaritalStatus(String clientMaritalStatus) {
			this.clientMaritalStatus = clientMaritalStatus;
		}
		
		public String getClientNationality() {
			return clientNationality;
		}
		public void setClientNationality(String clientNationality) {
			this.clientNationality = clientNationality;
		}
		
		public String getClientDateOfRegistration() {
			return clientDateOfRegistration;
		}
		public void setClientDateOfRegistration(String clientDateOfRegistration) {
			this.clientDateOfRegistration = clientDateOfRegistration;
		}
		
		public String getClientType() {
			return clientType;
		}
		public void setClientType(String clientType) {
			this.clientType = clientType;
		}
		
		public String getClientPhoto() {
			return clientPhoto;
		}
		public void setClientPhoto(String clientPhoto) {
			this.clientPhoto = clientPhoto;
		}
		
		public ClientAddressDetails getClientLocalAddress() {
			return clientLocalAddress;
		}
		public void setClientLocalAddress(ClientAddressDetails clientLocalAddress) {
			this.clientLocalAddress = clientLocalAddress;
		}
		
		public ClientAddressDetails getClientPermanentAddress() {
			return clientPermanentAddress;
		}
		public void setClientPermanentAddress(ClientAddressDetails clientPermanentAddress) {
			this.clientPermanentAddress = clientPermanentAddress;
		}
		
		public ClientEducationalDetails getClientEducationalDetails() {
			return clientEducationalDetails;
		}
		public void setClientEducationalDetails(ClientEducationalDetails clientEducationalDetails) {
			this.clientEducationalDetails = clientEducationalDetails;
		}

		public ClientExperienceDetails getClientExperienceDetails() {
			return clientExperienceDetails;
		}
		public void setClientExperienceDetails(ClientExperienceDetails clientExperienceDetails) {
			this.clientExperienceDetails = clientExperienceDetails;
		}
		
}
