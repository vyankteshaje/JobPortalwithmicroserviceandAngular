package com.jobportal.cjc.service;

public interface ClientServiceInterface 
{
	public void registerClientPersonalDetails(String cliendId);
	
	public String getClientPersonalDetails(String cliendId);
	
	public void deleteClientPersonalDetails(String cliendId);
	
	public String editClientPersonalDetails(String cliendId);
	
	public String updateClientPersonalDetails(String cliendId);
}
