package com.jobportal.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.cjc.model.ClientPersonalDetails;
import com.jobportal.cjc.service.ClientServiceInterface;

@RestController
public class ClientController 
{
	
		@Autowired
		ClientServiceInterface csi;

		@RequestMapping(value="/registerClient", method=RequestMethod.POST)
		public String registration(@RequestBody String cliendId)
		{
			csi.registerClientPersonalDetails(cliendId);
			return "Successfully Saved";
		}

		/*@RequestMapping(value="/getClient/{clientId}", method=RequestMethod.GET)
		public  ClientPersonalDetails getClientPersonalDetails(@PathVariable (name="clientId")String clientId )
		{
			return csi.getClientPersonalDetails(clientId);	//http://localhost:8082/getClient/13
		}*/
	
		@RequestMapping(value="/getClient/{clientId}", method=RequestMethod.GET)
		public  String getClientPersonalDetails(@PathVariable (name="clientId")String clientId )
		{
			csi.getClientPersonalDetails(clientId);	//http://localhost:8082/getClient/13
			return "Successfully Fetched";
		}
		
		@RequestMapping(value="/deleteClient/{clientId}" , method=RequestMethod.DELETE)
		public String deleteClientPersonalDetails(@PathVariable (name="clientId")String clientId)
		{
			 csi.deleteClientPersonalDetails(clientId);
			 return "Successfully Deleted";
		}
		
		@RequestMapping(value="editClient/{clientId}" ,method=RequestMethod.PUT)
		public String editClientPersonalDetails(@PathVariable (name="clientId")String clientId)
		{		 
			return	csi.editClientPersonalDetails(clientId);
		}
		
		@RequestMapping(value="updateClient/{clientId}" ,method=RequestMethod.POST)
		public String updateClientPersonalDetails(@PathVariable (name="clientId")String clientId)
		{		
			return csi.updateClientPersonalDetails(clientId);			
		}
		
}