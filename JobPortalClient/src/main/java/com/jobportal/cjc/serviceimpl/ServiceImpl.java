package com.jobportal.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobportal.cjc.model.ClientPersonalDetails;
import com.jobportal.cjc.repository.ClientPersonalDetailsRepository;
import com.jobportal.cjc.service.ClientServiceInterface;

@Service
public class ServiceImpl implements ClientServiceInterface
{
	@Autowired
	ClientPersonalDetailsRepository cpd;	

	public void registerClientPersonalDetails(String cliendId) 
	{
		cpd.save(cliendId);
	}

	public String getClientPersonalDetails(String cliendId) 
	{		
		return cpd.findAllById(cliendId);
	}

	
	public void deleteClientPersonalDetails(String cliendId) 
	{
		cpd.deleteById(cliendId);		
	} 
	
	public String editClientPersonalDetails(String cliendId)
	{		
		 return cpd.findAllById(cliendId);
	}
	
	public String updateClientPersonalDetails(String cliendId) 
	{
		return cpd.save(cliendId);
	}
}