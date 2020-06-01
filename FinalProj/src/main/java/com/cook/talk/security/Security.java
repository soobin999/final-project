package com.cook.talk.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class Security {

	public void configure(WebSecurity web) throws Exception{
		
		web.ignoring().antMatchers("/**");
		
	}
}
