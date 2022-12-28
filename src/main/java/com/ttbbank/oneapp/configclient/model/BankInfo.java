package com.ttbbank.oneapp.configclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BankInfo {
    @JsonProperty("bank_acct_length")
    String bankAcctLength;
    @JsonProperty("bank_logo")
    String bankLogo;
    @JsonProperty("bank_name_en")
    String bankNameEn;
    @JsonProperty("bank_name_th")
    String bankNameTh;
    @JsonProperty("bank_shortname")
    String bankShortname;
    @JsonProperty("bank_status")
    String bankStatus;
    @JsonProperty("display_order")
    String displayOrder;
    @JsonProperty("bank_cd")
    String id;
    @JsonProperty("orft_effective_date")
    Long orftEffectiveDate;
    @JsonProperty("orft_expire_date")
    Long orftExpireDate;
    @JsonProperty("promptpay_effective_date")
    Long promptpayEffectiveDate;
    @JsonProperty("promptpay_expire_date")
    Long promptpayExpireDate;
    @JsonProperty("promptpay_status")
    String promptpayStatus;
    @JsonProperty("smart_effective_date")
    Long smartEffectiveDate;
    @JsonProperty("smart_expire_date")
    Long smartExpireDate;
    @JsonProperty("update_by")
    String updateBy;
    @JsonProperty("update_date")
    Long updateDate;
}
