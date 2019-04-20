package com.trlogic;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrlogicMVCConfiguration {
	
	@Autowired
	private TrlogicMVCProperties trlogicMVCProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Aktif : " + trlogicMVCProperties.isAktif());
	}
}
