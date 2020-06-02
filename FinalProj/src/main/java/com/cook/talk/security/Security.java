package com.cook.talk.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class Security extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(WebSecurity web) throws Exception{

		web.ignoring().antMatchers("/**");
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        //HttpSecurity를 이용해 http요청에 대한 웹 기반 보안 구성 가능 
		
		http.authorizeRequests()
                // 페이지 권한 설정 HttpServletRequest에 따라 접근을 제한 
		
                .antMatchers("/admin/**").hasRole("ADMIN")
               //antMatchers로 특정 경로 지정,hasRole/permitAll메서드 역할에 따른 접근 설정을 잡아준다. 
               // /admin으로 시작하는 경로는  어드민 사용자만 접근 가능         
                .antMatchers("/user/myinfo").hasRole("MEMBER")
                .antMatchers("/**").permitAll()
                //모든 경로에 대해서 권한없이 접근 가능 
                
                .and( )//로그인 설정 
                .formLogin()
                .loginPage("/user/login")
                //커스텀 로그인 폼 사용시 loginPage 메소드 사용한다. 이때 action경로와 loginPage()의 파라미터 경로가 일치해야 인증 처리 가능 
               
                .defaultSuccessUrl("/user/login/result")
               //컨트롤러에서 url매핑이 있어야함. 
                .permitAll()
                
                .and()//로그아웃 설정 
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
                .logoutSuccessUrl("/user/logout/result")
                .invalidateHttpSession(true)
                .and()
                //403 예외 처리 핸들링 
                .exceptionHandling().accessDeniedPage("/user/denid");
	
     
                //모든 경로에 대해서 권한없이 접근 가능 
    }
}
