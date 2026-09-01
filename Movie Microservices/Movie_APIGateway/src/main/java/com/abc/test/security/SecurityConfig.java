package com.abc.test.security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http

            // Enable CORS
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))

            // Disable CSRF for our REST application
            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth

                // Allow browser CORS preflight request
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()

                // Admin APIs
                .requestMatchers("/admin/**")
                .hasRole("ADMIN")

                // User APIs
                .requestMatchers("/users/**")
                .hasRole("USER")

                .anyRequest()
                .authenticated()
            )

            .httpBasic(httpBasic -> {});

        return http.build();
    }


    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration = new CorsConfiguration();

        // React application
        configuration.setAllowedOrigins(
                Arrays.asList("http://localhost:3000")
        );

        // HTTP methods
        configuration.setAllowedMethods(
                Arrays.asList(
                        "GET",
                        "POST",
                        "PUT",
                        "DELETE",
                        "OPTIONS"
                )
        );

        // Headers sent by React/Axios
        configuration.setAllowedHeaders(
                Arrays.asList(
                        "Authorization",
                        "Content-Type"
                )
        );

        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration("/**", configuration);

        return source;
    }


    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails admin = User
                .withUsername("admin")
                .password("admin")
                .roles("ADMIN")
                .build();

        UserDetails ramesh = User
                .withUsername("ramesh")
                .password("a")
                .roles("USER")
                .build();

        UserDetails geeta = User
                .withUsername("suresh")
                .password("a")
                .roles("USER")
                .build();

        UserDetails sushma = User
                .withUsername("geeta")
                .password("a")
                .roles("USER")
                .build();

        UserDetails bhola = User
                .withUsername("sangeeta")
                .password("a")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(
                admin,
                ramesh,
                geeta,
                sushma,
                bhola
        );
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}