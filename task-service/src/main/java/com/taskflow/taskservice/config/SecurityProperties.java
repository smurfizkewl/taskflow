package com.taskflow.taskservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.security.user")
public class SecurityProperties {

    private String name;
    private String password;
    private String role;
}
