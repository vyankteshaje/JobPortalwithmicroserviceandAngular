package com.jobportal.cjc.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * author : Pallavi
 * Pojo Name:ClientEducationalDetails
* Date : 05/03/2019
* */
@Entity
public class ClientEducationalDetails {
@Id
	private String clientEducationalId;
	private String [] clientCertificateName;
	private String [] clientSkills;
	private String clientResume;
	private String clientEmploymentType;
	private String [] clientPrefferedLocations;
	
	@OneToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="clientCourseId")
	private ClientCourseDetails clientCourseDiploma;
	@OneToOne(cascade=CascadeType.ALL) 
	
	private ClientCourseDetails clientCourseSecondary;
	@OneToOne(cascade=CascadeType.ALL) 
	
	private ClientCourseDetails clientCourseHigherSecondary;
	@OneToOne(cascade=CascadeType.ALL) 

	private ClientCourseDetails clientCourseGraduation;
	@OneToOne(cascade=CascadeType.ALL) 

	private ClientCourseDetails clientCoursePostGraduation;

	
	public String getClientEducationalId() {
		return clientEducationalId;
	}
	public void setClientEducationalId(String clientEducationalId) {
		this.clientEducationalId = clientEducationalId;
	}
	
	
	public String[] getClientCertificateName() {
		return clientCertificateName;
	}
	public void setClientCertificateName(String[] clientCertificateName) {
		this.clientCertificateName = clientCertificateName;
	}
	public String[] getClientSkills() {
		return clientSkills;
	}
	public void setClientSkills(String[] clientSkills) {
		this.clientSkills = clientSkills;
	}
	public String getClientResume() {
		return clientResume;
	}
	public void setClientResume(String clientResume) {
		this.clientResume = clientResume;
	}
	public String getClientEmploymentType() {
		return clientEmploymentType;
	}
	public void setClientEmploymentType(String clientEmploymentType) {
		this.clientEmploymentType = clientEmploymentType;
	}
	public String[] getClientPrefferedLocations() {
		return clientPrefferedLocations;
	}
	public void setClientPrefferedLocations(String[] clientPrefferedLocations) {
		this.clientPrefferedLocations = clientPrefferedLocations;
	}
	public ClientCourseDetails getClientCourseDiploma() {
		return clientCourseDiploma;
	}
	public void setClientCourseDiploma(ClientCourseDetails clientCourseDiploma) {
		this.clientCourseDiploma = clientCourseDiploma;
	}
	public ClientCourseDetails getClientCourseSecondary() {
		return clientCourseSecondary;
	}
	public void setClientCourseSecondary(ClientCourseDetails clientCourseSecondary) {
		this.clientCourseSecondary = clientCourseSecondary;
	}
	public ClientCourseDetails getClientCourseHigherSecondary() {
		return clientCourseHigherSecondary;
	}
	public void setClientCourseHigherSecondary(ClientCourseDetails clientCourseHigherSecondary) {
		this.clientCourseHigherSecondary = clientCourseHigherSecondary;
	}
	public ClientCourseDetails getClientCourseGraduation() {
		return clientCourseGraduation;
	}
	public void setClientCourseGraduation(ClientCourseDetails clientCourseGraduation) {
		this.clientCourseGraduation = clientCourseGraduation;
	}
	public ClientCourseDetails getClientCoursePostGraduation() {
		return clientCoursePostGraduation;
	}
	public void setClientCoursePostGraduation(ClientCourseDetails clientCoursePostGraduation) {
		this.clientCoursePostGraduation = clientCoursePostGraduation;
	}
	
	
	
	
	
}
