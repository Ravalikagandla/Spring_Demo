package com.greatlearning.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.greatlearning.springDemo")
public class springConfig {
	
	@Bean
	public ExpertAdvice practiceAdvice() {
		
	}

}
