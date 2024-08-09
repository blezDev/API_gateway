package com.blez.gateway.config;

//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsConfigurationSource;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//import java.util.List;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
///*
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//
//        configuration.addAllowedMethod("*");
//        configuration.addAllowedHeader("*");
//        configuration.addAllowedOriginPattern("*");
//        configuration.setAllowCredentials(true);
//        UrlBasedCorsConfigurationSource source = new
//                UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//*/
//@Bean
//public CorsConfigurationSource corsConfigurationSource() {
//    CorsConfiguration corsConfig = new CorsConfiguration();
//    corsConfig.setAllowedOrigins(List.of("http://localhost:4200"));
//    corsConfig.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//    corsConfig.setAllowedHeaders(List.of("*"));
//    corsConfig.setAllowCredentials(true);
//
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    source.registerCorsConfiguration("/**", corsConfig);
//    return source;
//}
//    @Bean
//    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http) throws Exception {
//        return http
//                .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .cors(cors -> {
//                    cors.configurationSource(corsConfigurationSource());
//                })
//                .authorizeExchange(exchanges  ->
//                        exchanges
//                                .anyExchange()
//                                .permitAll())
//                .build();
//    }
//
//
//}
