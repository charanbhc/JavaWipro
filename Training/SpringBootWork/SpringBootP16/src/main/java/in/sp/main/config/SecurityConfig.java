package in.sp.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() 
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/index.html", "/signup", "/signin", "/student/register", "/css/**", "/js/**", "/images/**").permitAll() // Allow public access
                .requestMatchers("/welcome").authenticated() // Require login for welcome page
                .anyRequest().authenticated() // Everything else requires authentication
            )
            .formLogin(login -> login
                .loginPage("/signin") // Redirects to /signin when authentication is needed
                .defaultSuccessUrl("/welcome", true) // Redirect to /welcome after successful login
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/") // Redirect to index after logout
                .permitAll()
            )
            .sessionManagement(session -> session
                .invalidSessionUrl("/") // Redirect to index if session expires
            );

        return http.build();
    }
}
