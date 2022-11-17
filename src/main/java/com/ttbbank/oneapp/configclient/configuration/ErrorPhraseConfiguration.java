package com.ttbbank.oneapp.configclient.configuration;

import com.ttbbank.oneapp.configclient.model.ErrorPhrase;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("errorphrase")
@Getter
@Setter
public class ErrorPhraseConfiguration {
    private Map<String, ErrorPhrase> data;
}
