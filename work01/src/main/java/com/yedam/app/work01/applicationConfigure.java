package com.yedam.app.work01;

import org.springframework.context.annotation.Bean;

public class applicationConfigure {

	@Bean
	MessageService service() {
		return new EmailMessageServiceImpl();
	}
	
	@Bean
	MyController myApplication() {
		return new MyController(service());
	}
}
