package com.example.accounts.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@ToString
@Configuration
@ConfigurationProperties(prefix = "accounts")
public class AccountsCloudConfigs {
    private String msg;
    private String buildVersion;

    private Map<String, String> mailDetails;

    private List<String> activeBranches;
}
