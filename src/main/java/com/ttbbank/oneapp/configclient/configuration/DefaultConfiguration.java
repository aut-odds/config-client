package com.ttbbank.oneapp.configclient.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
@Getter
@Setter
@ToString
public class DefaultConfiguration {
    @Value("${foo}")
    private String foo;
}
