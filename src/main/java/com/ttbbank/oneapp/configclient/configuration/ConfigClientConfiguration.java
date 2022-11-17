package com.ttbbank.oneapp.configclient.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Getter
@Setter
@ToString
public class ConfigClientConfiguration {

    @Value("${server.port}")
    private String serverPort;

    @Value("${management.endpoints.web.exposure.include}")
    private List<String> managementEndpointsWebExposureInclude;

}
