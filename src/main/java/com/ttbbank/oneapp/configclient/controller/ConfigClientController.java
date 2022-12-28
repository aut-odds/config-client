package com.ttbbank.oneapp.configclient.controller;

import com.ttbbank.oneapp.configclient.configuration.BanksInfoConfiguration;
import com.ttbbank.oneapp.configclient.configuration.ConfigClientConfiguration;
import com.ttbbank.oneapp.configclient.configuration.DefaultConfiguration;
import com.ttbbank.oneapp.configclient.configuration.ErrorPhraseConfiguration;
import com.ttbbank.oneapp.configclient.model.BankInfo;
import com.ttbbank.oneapp.configclient.model.ErrorPhrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ConfigClientController {

    @Autowired
    private ConfigClientConfiguration configClientConfiguration;

    @Autowired
    private DefaultConfiguration defaultConfiguration;

    @Autowired
    private ErrorPhraseConfiguration errorPhraseConfiguration;

    @Autowired
    private BanksInfoConfiguration banksInfoConfiguration;

    @GetMapping("/")
    public String getConfigClient() {
        return configClientConfiguration.toString();
    }

    @GetMapping("/default")
    public String getDefault() {
        return defaultConfiguration.toString();
    }

    @GetMapping("/error-phrases")
    public Map<String, ErrorPhrase> getErrorPhrases() {
        return errorPhraseConfiguration.getData();
    }

    @GetMapping("/banks-info")
    public List<BankInfo> getBanksInfo() {
        return banksInfoConfiguration.getData();
    }

}
