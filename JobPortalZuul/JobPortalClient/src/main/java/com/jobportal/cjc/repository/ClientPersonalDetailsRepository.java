package com.jobportal.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.cjc.model.ClientPersonalDetails;

@Repository
public interface ClientPersonalDetailsRepository extends CrudRepository<ClientPersonalDetails, String> 
{

	String save(String cliendId);

	String findAllById(String cliendId);
	
}
