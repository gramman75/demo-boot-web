package com.gramman75;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gramman75.formatter.PersonFormatter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	/*
	 * Spring Web MVC를 사용할 경우 Config에서 Formatter를 등록해 줘야 함.
	 * Spring Boot에서는 Formatter를 Bean(@Component)으로 등록 하면 자동 Formmatter로 등록 됨.
	 */
//	@Override
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addFormatter(new PersonFormatter());
//	}
	
	

}
