package com.muzeaback.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user1")
                .roles("USER")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin1")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,admin);

    }
    protected void configure(HttpSecurity http) throws Exception {
     http.csrf().disable() .authorizeRequests() .anyRequest().permitAll();
      /* http.authorizeRequests()
               .antMatchers("/Uzytkownicy/all").permitAll()
               .anyRequest().hasRole("ADMIN")
               .and().
               formLogin().permitAll().permitAll()
                .and().logout();*/
    }
}
