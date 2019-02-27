package com.eduardo.rmi.confi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

import com.eduardo.rmi.repository.ClientRepository;

@Configuration
public class RmiConfig {
	@Autowired
	@Qualifier("clientRepository")
	ClientRepository clientRepo;
	
	  @Bean
	    RemoteExporter registerRMIExporter() {
	         
	        RmiServiceExporter exporter = new RmiServiceExporter();
	        exporter.setRegistryPort(1099);
	        exporter.setServiceName("apirmi");
	        exporter.setServiceInterface(ClientRepository.class);
	        exporter.setService(clientRepo);
	         
	        return exporter;
	    }
	
}
