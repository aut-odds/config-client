package com.ttbbank.oneapp.configclient.configuration;

import com.ttbbank.oneapp.configclient.model.BankInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties("banks-info")
@Getter
@Setter
public class BanksInfoConfiguration {
    private List<BankInfo> data;
}
