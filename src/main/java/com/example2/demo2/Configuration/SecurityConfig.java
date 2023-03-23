//    package com.example2.demo2.Configuration;
//
//    import org.springframework.context.annotation.Bean;
//    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//    import org.springframework.security.config.annotation.web.builders.WebSecurity;
//    import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//    import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//    import org.springframework.security.web.SecurityFilterChain;
//    import org.springframework.stereotype.Component;
//
//    import static org.springframework.security.config.Customizer.withDefaults;
//
//    @Component
//    public class SecurityConfig extends WebSecurityConfigurerAdapter {
//        /*
//        Configuring HttpSecurity
//    In Spring Security 5.4 we introduced the ability to configure HttpSecurity by creating a SecurityFilterChain bean.
//
//    Below is an example configuration using the WebSecurityConfigurerAdapter that secures all endpoints with HTTP Basic:
//         */
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests((authz) -> authz
//                            .anyRequest().authenticated()
//                    )
//                    .httpBasic(withDefaults());
//        }
//    /*
//    Going forward, the recommended way of doing this is registering a SecurityFilterChain bean:
//     */
//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests((authz) -> authz
//                            .anyRequest().authenticated()
//                    )
//                    .httpBasic(withDefaults());
//            return http.build();
//        }
//    /*
//    *Configuring WebSecurity
//    In Spring Security 5.4 we also introduced the WebSecurityCustomizer.
//
//    The WebSecurityCustomizer is a callback interface that can be used to customize WebSecurity.
//
//    Below is an example configuration using the WebSecurityConfigurerAdapter that ignores requests that match /ignore1 or /ignore2:
//     */
//        @Override
//        public void configure(WebSecurity web) {
//            web.ignoring().antMatchers("/ignore1", "/ignore2");
//        }
///*
//Going forward, the recommended way of doing this is registering a WebSecurityCustomizer bean:
// */
//        @Bean
//        public WebSecurityCustomizer webSecurityCustomizer() {
//            return (web) -> web.ignoring().antMatchers("/ignore1", "/ignore2");
//        }
//    }
