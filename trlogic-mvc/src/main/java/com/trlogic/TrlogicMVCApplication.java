package com.trlogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=TrlogicMVCProperties.class)
public class TrlogicMVCApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrlogicMVCApplication.class, args);
	}

}
