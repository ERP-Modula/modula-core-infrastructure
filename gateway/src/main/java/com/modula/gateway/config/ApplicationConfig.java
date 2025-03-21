package com.modula.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application")
@Data
public class ApplicationConfig {
    private SecurityConfig security;
    private UsersConfig users;

    @Data
    public static class SecurityConfig {
        private JwtConfig jwt;

        @Data
        public static class JwtConfig {
            private String secretKey;
            private long expiration;
        }
    }

    @Data
    public static class UsersConfig {
        private DefaultConfig defaultUsers;

        @Data
        public static class DefaultConfig {
            private DefaultUserConfig admin;
            private DefaultUserConfig user;

            @Data
            public static class DefaultUserConfig {
                private String username;
                private String password;
            }
        }
    }
}
