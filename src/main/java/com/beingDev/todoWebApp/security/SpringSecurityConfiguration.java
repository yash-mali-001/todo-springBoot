package com.beingDev.todoWebApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {
    //LDAP or DataBase to store the users
    //In Memory

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        String username = "Yash";
        String password = "123456";
        UserDetails userDetails = createNewUser(username, password);
        return new InMemoryUserDetailsManager(userDetails);
    }

    public UserDetails createNewUser(String username, String password) {
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        return User.builder().passwordEncoder(passwordEncoder).username(username).password(password).roles("USER", "ADMIN").build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests(authz -> authz
//                        .anyRequest().authenticated()
//                )
//                .formLogin(withDefaults())
//                .csrf(AbstractHttpConfigurer::disable) // Disable CSRF protection
//                .headers(headers -> headers
//                        .frameOptions().disable() // Disable X-Frame-Options
//                );
//        return httpSecurity.build();
//    }
}
