/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetSavingsCurrency;
import org.mifos.chatbot.client.model.GetSavingsProductsAccountingMappingOptions;
import org.mifos.chatbot.client.model.GetSavingsProductsChargeOptions;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCalculationDaysInYearType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCalculationType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestCompoundingPeriodType;
import org.mifos.chatbot.client.model.GetSavingsProductsInterestPostingPeriodType;
import org.mifos.chatbot.client.model.GetSavingsProductsLockinPeriodFrequencyTypeOptions;
import org.mifos.chatbot.client.model.GetSavingsProductsPaymentTypeOptions;
import org.mifos.chatbot.client.model.GetSavingsProductsTemplateAccountingRule;
import org.mifos.chatbot.client.model.GetSavingsProductsWithdrawalFeeTypeOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetSavingsProductsTemplateResponse
 */

public class GetSavingsProductsTemplateResponse {
  @SerializedName("currency")
  private GetSavingsCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetSavingsProductsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("accountingRule")
  private GetSavingsProductsTemplateAccountingRule accountingRule = null;

  @SerializedName("currencyOptions")
  private List<GetSavingsCurrency> currencyOptions = null;

  @SerializedName("interestCompoundingPeriodTypeOptions")
  private List<GetSavingsProductsInterestCompoundingPeriodType> interestCompoundingPeriodTypeOptions = null;

  @SerializedName("interestPostingPeriodTypeOptions")
  private List<GetSavingsProductsInterestPostingPeriodType> interestPostingPeriodTypeOptions = null;

  @SerializedName("interestCalculationTypeOptions")
  private List<GetSavingsProductsInterestCalculationType> interestCalculationTypeOptions = null;

  @SerializedName("interestCalculationDaysInYearTypeOptions")
  private List<GetSavingsProductsInterestCalculationDaysInYearType> interestCalculationDaysInYearTypeOptions = null;

  @SerializedName("lockinPeriodFrequencyTypeOptions")
  private List<GetSavingsProductsLockinPeriodFrequencyTypeOptions> lockinPeriodFrequencyTypeOptions = null;

  @SerializedName("withdrawalFeeTypeOptions")
  private List<GetSavingsProductsWithdrawalFeeTypeOptions> withdrawalFeeTypeOptions = null;

  @SerializedName("paymentTypeOptions")
  private List<GetSavingsProductsPaymentTypeOptions> paymentTypeOptions = null;

  @SerializedName("accountingRuleOptions")
  private List<GetSavingsProductsTemplateAccountingRule> accountingRuleOptions = null;

  @SerializedName("accountingMappingOptions")
  private List<GetSavingsProductsAccountingMappingOptions> accountingMappingOptions = null;

  @SerializedName("chargeOptions")
  private List<GetSavingsProductsChargeOptions> chargeOptions = null;

  public GetSavingsProductsTemplateResponse currency(GetSavingsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetSavingsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetSavingsCurrency currency) {
    this.currency = currency;
  }

  public GetSavingsProductsTemplateResponse interestCompoundingPeriodType(GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetSavingsProductsTemplateResponse interestPostingPeriodType(GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetSavingsProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetSavingsProductsTemplateResponse interestCalculationType(GetSavingsProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetSavingsProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetSavingsProductsTemplateResponse interestCalculationDaysInYearType(GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetSavingsProductsTemplateResponse accountingRule(GetSavingsProductsTemplateAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @ApiModelProperty(value = "")
  public GetSavingsProductsTemplateAccountingRule getAccountingRule() {
    return accountingRule;
  }

  public void setAccountingRule(GetSavingsProductsTemplateAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
  }

  public GetSavingsProductsTemplateResponse currencyOptions(List<GetSavingsCurrency> currencyOptions) {
    this.currencyOptions = currencyOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addCurrencyOptionsItem(GetSavingsCurrency currencyOptionsItem) {
    if (this.currencyOptions == null) {
      this.currencyOptions = new ArrayList<GetSavingsCurrency>();
    }
    this.currencyOptions.add(currencyOptionsItem);
    return this;
  }

   /**
   * Get currencyOptions
   * @return currencyOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsCurrency> getCurrencyOptions() {
    return currencyOptions;
  }

  public void setCurrencyOptions(List<GetSavingsCurrency> currencyOptions) {
    this.currencyOptions = currencyOptions;
  }

  public GetSavingsProductsTemplateResponse interestCompoundingPeriodTypeOptions(List<GetSavingsProductsInterestCompoundingPeriodType> interestCompoundingPeriodTypeOptions) {
    this.interestCompoundingPeriodTypeOptions = interestCompoundingPeriodTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addInterestCompoundingPeriodTypeOptionsItem(GetSavingsProductsInterestCompoundingPeriodType interestCompoundingPeriodTypeOptionsItem) {
    if (this.interestCompoundingPeriodTypeOptions == null) {
      this.interestCompoundingPeriodTypeOptions = new ArrayList<GetSavingsProductsInterestCompoundingPeriodType>();
    }
    this.interestCompoundingPeriodTypeOptions.add(interestCompoundingPeriodTypeOptionsItem);
    return this;
  }

   /**
   * Get interestCompoundingPeriodTypeOptions
   * @return interestCompoundingPeriodTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsInterestCompoundingPeriodType> getInterestCompoundingPeriodTypeOptions() {
    return interestCompoundingPeriodTypeOptions;
  }

  public void setInterestCompoundingPeriodTypeOptions(List<GetSavingsProductsInterestCompoundingPeriodType> interestCompoundingPeriodTypeOptions) {
    this.interestCompoundingPeriodTypeOptions = interestCompoundingPeriodTypeOptions;
  }

  public GetSavingsProductsTemplateResponse interestPostingPeriodTypeOptions(List<GetSavingsProductsInterestPostingPeriodType> interestPostingPeriodTypeOptions) {
    this.interestPostingPeriodTypeOptions = interestPostingPeriodTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addInterestPostingPeriodTypeOptionsItem(GetSavingsProductsInterestPostingPeriodType interestPostingPeriodTypeOptionsItem) {
    if (this.interestPostingPeriodTypeOptions == null) {
      this.interestPostingPeriodTypeOptions = new ArrayList<GetSavingsProductsInterestPostingPeriodType>();
    }
    this.interestPostingPeriodTypeOptions.add(interestPostingPeriodTypeOptionsItem);
    return this;
  }

   /**
   * Get interestPostingPeriodTypeOptions
   * @return interestPostingPeriodTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsInterestPostingPeriodType> getInterestPostingPeriodTypeOptions() {
    return interestPostingPeriodTypeOptions;
  }

  public void setInterestPostingPeriodTypeOptions(List<GetSavingsProductsInterestPostingPeriodType> interestPostingPeriodTypeOptions) {
    this.interestPostingPeriodTypeOptions = interestPostingPeriodTypeOptions;
  }

  public GetSavingsProductsTemplateResponse interestCalculationTypeOptions(List<GetSavingsProductsInterestCalculationType> interestCalculationTypeOptions) {
    this.interestCalculationTypeOptions = interestCalculationTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addInterestCalculationTypeOptionsItem(GetSavingsProductsInterestCalculationType interestCalculationTypeOptionsItem) {
    if (this.interestCalculationTypeOptions == null) {
      this.interestCalculationTypeOptions = new ArrayList<GetSavingsProductsInterestCalculationType>();
    }
    this.interestCalculationTypeOptions.add(interestCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get interestCalculationTypeOptions
   * @return interestCalculationTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsInterestCalculationType> getInterestCalculationTypeOptions() {
    return interestCalculationTypeOptions;
  }

  public void setInterestCalculationTypeOptions(List<GetSavingsProductsInterestCalculationType> interestCalculationTypeOptions) {
    this.interestCalculationTypeOptions = interestCalculationTypeOptions;
  }

  public GetSavingsProductsTemplateResponse interestCalculationDaysInYearTypeOptions(List<GetSavingsProductsInterestCalculationDaysInYearType> interestCalculationDaysInYearTypeOptions) {
    this.interestCalculationDaysInYearTypeOptions = interestCalculationDaysInYearTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addInterestCalculationDaysInYearTypeOptionsItem(GetSavingsProductsInterestCalculationDaysInYearType interestCalculationDaysInYearTypeOptionsItem) {
    if (this.interestCalculationDaysInYearTypeOptions == null) {
      this.interestCalculationDaysInYearTypeOptions = new ArrayList<GetSavingsProductsInterestCalculationDaysInYearType>();
    }
    this.interestCalculationDaysInYearTypeOptions.add(interestCalculationDaysInYearTypeOptionsItem);
    return this;
  }

   /**
   * Get interestCalculationDaysInYearTypeOptions
   * @return interestCalculationDaysInYearTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsInterestCalculationDaysInYearType> getInterestCalculationDaysInYearTypeOptions() {
    return interestCalculationDaysInYearTypeOptions;
  }

  public void setInterestCalculationDaysInYearTypeOptions(List<GetSavingsProductsInterestCalculationDaysInYearType> interestCalculationDaysInYearTypeOptions) {
    this.interestCalculationDaysInYearTypeOptions = interestCalculationDaysInYearTypeOptions;
  }

  public GetSavingsProductsTemplateResponse lockinPeriodFrequencyTypeOptions(List<GetSavingsProductsLockinPeriodFrequencyTypeOptions> lockinPeriodFrequencyTypeOptions) {
    this.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addLockinPeriodFrequencyTypeOptionsItem(GetSavingsProductsLockinPeriodFrequencyTypeOptions lockinPeriodFrequencyTypeOptionsItem) {
    if (this.lockinPeriodFrequencyTypeOptions == null) {
      this.lockinPeriodFrequencyTypeOptions = new ArrayList<GetSavingsProductsLockinPeriodFrequencyTypeOptions>();
    }
    this.lockinPeriodFrequencyTypeOptions.add(lockinPeriodFrequencyTypeOptionsItem);
    return this;
  }

   /**
   * Get lockinPeriodFrequencyTypeOptions
   * @return lockinPeriodFrequencyTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsLockinPeriodFrequencyTypeOptions> getLockinPeriodFrequencyTypeOptions() {
    return lockinPeriodFrequencyTypeOptions;
  }

  public void setLockinPeriodFrequencyTypeOptions(List<GetSavingsProductsLockinPeriodFrequencyTypeOptions> lockinPeriodFrequencyTypeOptions) {
    this.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions;
  }

  public GetSavingsProductsTemplateResponse withdrawalFeeTypeOptions(List<GetSavingsProductsWithdrawalFeeTypeOptions> withdrawalFeeTypeOptions) {
    this.withdrawalFeeTypeOptions = withdrawalFeeTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addWithdrawalFeeTypeOptionsItem(GetSavingsProductsWithdrawalFeeTypeOptions withdrawalFeeTypeOptionsItem) {
    if (this.withdrawalFeeTypeOptions == null) {
      this.withdrawalFeeTypeOptions = new ArrayList<GetSavingsProductsWithdrawalFeeTypeOptions>();
    }
    this.withdrawalFeeTypeOptions.add(withdrawalFeeTypeOptionsItem);
    return this;
  }

   /**
   * Get withdrawalFeeTypeOptions
   * @return withdrawalFeeTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsWithdrawalFeeTypeOptions> getWithdrawalFeeTypeOptions() {
    return withdrawalFeeTypeOptions;
  }

  public void setWithdrawalFeeTypeOptions(List<GetSavingsProductsWithdrawalFeeTypeOptions> withdrawalFeeTypeOptions) {
    this.withdrawalFeeTypeOptions = withdrawalFeeTypeOptions;
  }

  public GetSavingsProductsTemplateResponse paymentTypeOptions(List<GetSavingsProductsPaymentTypeOptions> paymentTypeOptions) {
    this.paymentTypeOptions = paymentTypeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addPaymentTypeOptionsItem(GetSavingsProductsPaymentTypeOptions paymentTypeOptionsItem) {
    if (this.paymentTypeOptions == null) {
      this.paymentTypeOptions = new ArrayList<GetSavingsProductsPaymentTypeOptions>();
    }
    this.paymentTypeOptions.add(paymentTypeOptionsItem);
    return this;
  }

   /**
   * Get paymentTypeOptions
   * @return paymentTypeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsPaymentTypeOptions> getPaymentTypeOptions() {
    return paymentTypeOptions;
  }

  public void setPaymentTypeOptions(List<GetSavingsProductsPaymentTypeOptions> paymentTypeOptions) {
    this.paymentTypeOptions = paymentTypeOptions;
  }

  public GetSavingsProductsTemplateResponse accountingRuleOptions(List<GetSavingsProductsTemplateAccountingRule> accountingRuleOptions) {
    this.accountingRuleOptions = accountingRuleOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addAccountingRuleOptionsItem(GetSavingsProductsTemplateAccountingRule accountingRuleOptionsItem) {
    if (this.accountingRuleOptions == null) {
      this.accountingRuleOptions = new ArrayList<GetSavingsProductsTemplateAccountingRule>();
    }
    this.accountingRuleOptions.add(accountingRuleOptionsItem);
    return this;
  }

   /**
   * Get accountingRuleOptions
   * @return accountingRuleOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsTemplateAccountingRule> getAccountingRuleOptions() {
    return accountingRuleOptions;
  }

  public void setAccountingRuleOptions(List<GetSavingsProductsTemplateAccountingRule> accountingRuleOptions) {
    this.accountingRuleOptions = accountingRuleOptions;
  }

  public GetSavingsProductsTemplateResponse accountingMappingOptions(List<GetSavingsProductsAccountingMappingOptions> accountingMappingOptions) {
    this.accountingMappingOptions = accountingMappingOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addAccountingMappingOptionsItem(GetSavingsProductsAccountingMappingOptions accountingMappingOptionsItem) {
    if (this.accountingMappingOptions == null) {
      this.accountingMappingOptions = new ArrayList<GetSavingsProductsAccountingMappingOptions>();
    }
    this.accountingMappingOptions.add(accountingMappingOptionsItem);
    return this;
  }

   /**
   * Get accountingMappingOptions
   * @return accountingMappingOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsAccountingMappingOptions> getAccountingMappingOptions() {
    return accountingMappingOptions;
  }

  public void setAccountingMappingOptions(List<GetSavingsProductsAccountingMappingOptions> accountingMappingOptions) {
    this.accountingMappingOptions = accountingMappingOptions;
  }

  public GetSavingsProductsTemplateResponse chargeOptions(List<GetSavingsProductsChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
    return this;
  }

  public GetSavingsProductsTemplateResponse addChargeOptionsItem(GetSavingsProductsChargeOptions chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new ArrayList<GetSavingsProductsChargeOptions>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetSavingsProductsChargeOptions> getChargeOptions() {
    return chargeOptions;
  }

  public void setChargeOptions(List<GetSavingsProductsChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsTemplateResponse getSavingsProductsTemplateResponse = (GetSavingsProductsTemplateResponse) o;
    return Objects.equals(this.currency, getSavingsProductsTemplateResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getSavingsProductsTemplateResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getSavingsProductsTemplateResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getSavingsProductsTemplateResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getSavingsProductsTemplateResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.accountingRule, getSavingsProductsTemplateResponse.accountingRule) &&
        Objects.equals(this.currencyOptions, getSavingsProductsTemplateResponse.currencyOptions) &&
        Objects.equals(this.interestCompoundingPeriodTypeOptions, getSavingsProductsTemplateResponse.interestCompoundingPeriodTypeOptions) &&
        Objects.equals(this.interestPostingPeriodTypeOptions, getSavingsProductsTemplateResponse.interestPostingPeriodTypeOptions) &&
        Objects.equals(this.interestCalculationTypeOptions, getSavingsProductsTemplateResponse.interestCalculationTypeOptions) &&
        Objects.equals(this.interestCalculationDaysInYearTypeOptions, getSavingsProductsTemplateResponse.interestCalculationDaysInYearTypeOptions) &&
        Objects.equals(this.lockinPeriodFrequencyTypeOptions, getSavingsProductsTemplateResponse.lockinPeriodFrequencyTypeOptions) &&
        Objects.equals(this.withdrawalFeeTypeOptions, getSavingsProductsTemplateResponse.withdrawalFeeTypeOptions) &&
        Objects.equals(this.paymentTypeOptions, getSavingsProductsTemplateResponse.paymentTypeOptions) &&
        Objects.equals(this.accountingRuleOptions, getSavingsProductsTemplateResponse.accountingRuleOptions) &&
        Objects.equals(this.accountingMappingOptions, getSavingsProductsTemplateResponse.accountingMappingOptions) &&
        Objects.equals(this.chargeOptions, getSavingsProductsTemplateResponse.chargeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, accountingRule, currencyOptions, interestCompoundingPeriodTypeOptions, interestPostingPeriodTypeOptions, interestCalculationTypeOptions, interestCalculationDaysInYearTypeOptions, lockinPeriodFrequencyTypeOptions, withdrawalFeeTypeOptions, paymentTypeOptions, accountingRuleOptions, accountingMappingOptions, chargeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsTemplateResponse {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
    sb.append("    currencyOptions: ").append(toIndentedString(currencyOptions)).append("\n");
    sb.append("    interestCompoundingPeriodTypeOptions: ").append(toIndentedString(interestCompoundingPeriodTypeOptions)).append("\n");
    sb.append("    interestPostingPeriodTypeOptions: ").append(toIndentedString(interestPostingPeriodTypeOptions)).append("\n");
    sb.append("    interestCalculationTypeOptions: ").append(toIndentedString(interestCalculationTypeOptions)).append("\n");
    sb.append("    interestCalculationDaysInYearTypeOptions: ").append(toIndentedString(interestCalculationDaysInYearTypeOptions)).append("\n");
    sb.append("    lockinPeriodFrequencyTypeOptions: ").append(toIndentedString(lockinPeriodFrequencyTypeOptions)).append("\n");
    sb.append("    withdrawalFeeTypeOptions: ").append(toIndentedString(withdrawalFeeTypeOptions)).append("\n");
    sb.append("    paymentTypeOptions: ").append(toIndentedString(paymentTypeOptions)).append("\n");
    sb.append("    accountingRuleOptions: ").append(toIndentedString(accountingRuleOptions)).append("\n");
    sb.append("    accountingMappingOptions: ").append(toIndentedString(accountingMappingOptions)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

