package com.example.loans.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@ToString
@Configuration
@ConfigurationProperties(prefix = "loans")
public class LoansCloudConfigs {
    private String msg;
    @JsonProperty("build-version")
    private String buildVersion;

    private Map<String, String> mailDetails;

    private List<String> activeBranches;
}
