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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetLoanChargeTemplateChargeAppliesTo;
import org.mifos.chatbot.client.model.GetLoanCurrency;
import org.mifos.chatbot.client.model.GetLoansLoanIdChargeCalculationType;
import org.mifos.chatbot.client.model.GetLoansLoanIdChargePaymentMode;
import org.mifos.chatbot.client.model.GetLoansLoanIdChargeTimeType;
import org.mifos.chatbot.client.model.GetLoansLoanIdFeeFrequency;
import org.mifos.chatbot.client.model.GetLoanCurrency;

/**
 * GetLoansLoanIdOverdueCharges
 */

public class GetLoansLoanIdOverdueCharges {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  @SerializedName("currency")
  private GetLoanCurrency currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("chargeTimeType")
  private GetLoansLoanIdChargeTimeType chargeTimeType = null;

  @SerializedName("chargeAppliesTo")
  private GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo = null;

  @SerializedName("chargeCalculationType")
  private GetLoansLoanIdChargeCalculationType chargeCalculationType = null;

  @SerializedName("chargePaymentMode")
  private GetLoansLoanIdChargePaymentMode chargePaymentMode = null;

  @SerializedName("feeInterval")
  private Integer feeInterval = null;

  @SerializedName("feeFrequency")
  private GetLoansLoanIdFeeFrequency feeFrequency = null;

  public GetLoansLoanIdOverdueCharges id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "20", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetLoansLoanIdOverdueCharges name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "overdraft penality", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetLoansLoanIdOverdueCharges active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetLoansLoanIdOverdueCharges penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }

  public GetLoansLoanIdOverdueCharges currency(GetLoanCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetLoanCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetLoanCurrency currency) {
    this.currency = currency;
  }

  public GetLoansLoanIdOverdueCharges amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "3.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetLoansLoanIdOverdueCharges chargeTimeType(GetLoansLoanIdChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }

  public void setChargeTimeType(GetLoansLoanIdChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }

  public GetLoansLoanIdOverdueCharges chargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
    return this;
  }

   /**
   * Get chargeAppliesTo
   * @return chargeAppliesTo
  **/
  @ApiModelProperty(value = "")
  public GetLoanChargeTemplateChargeAppliesTo getChargeAppliesTo() {
    return chargeAppliesTo;
  }

  public void setChargeAppliesTo(GetLoanChargeTemplateChargeAppliesTo chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
  }

  public GetLoansLoanIdOverdueCharges chargeCalculationType(GetLoansLoanIdChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }

  public void setChargeCalculationType(GetLoansLoanIdChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }

  public GetLoansLoanIdOverdueCharges chargePaymentMode(GetLoansLoanIdChargePaymentMode chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdChargePaymentMode getChargePaymentMode() {
    return chargePaymentMode;
  }

  public void setChargePaymentMode(GetLoansLoanIdChargePaymentMode chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }

  public GetLoansLoanIdOverdueCharges feeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
    return this;
  }

   /**
   * Get feeInterval
   * @return feeInterval
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getFeeInterval() {
    return feeInterval;
  }

  public void setFeeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
  }

  public GetLoansLoanIdOverdueCharges feeFrequency(GetLoansLoanIdFeeFrequency feeFrequency) {
    this.feeFrequency = feeFrequency;
    return this;
  }

   /**
   * Get feeFrequency
   * @return feeFrequency
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdFeeFrequency getFeeFrequency() {
    return feeFrequency;
  }

  public void setFeeFrequency(GetLoansLoanIdFeeFrequency feeFrequency) {
    this.feeFrequency = feeFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdOverdueCharges getLoansLoanIdOverdueCharges = (GetLoansLoanIdOverdueCharges) o;
    return Objects.equals(this.id, getLoansLoanIdOverdueCharges.id) &&
        Objects.equals(this.name, getLoansLoanIdOverdueCharges.name) &&
        Objects.equals(this.active, getLoansLoanIdOverdueCharges.active) &&
        Objects.equals(this.penalty, getLoansLoanIdOverdueCharges.penalty) &&
        Objects.equals(this.currency, getLoansLoanIdOverdueCharges.currency) &&
        Objects.equals(this.amount, getLoansLoanIdOverdueCharges.amount) &&
        Objects.equals(this.chargeTimeType, getLoansLoanIdOverdueCharges.chargeTimeType) &&
        Objects.equals(this.chargeAppliesTo, getLoansLoanIdOverdueCharges.chargeAppliesTo) &&
        Objects.equals(this.chargeCalculationType, getLoansLoanIdOverdueCharges.chargeCalculationType) &&
        Objects.equals(this.chargePaymentMode, getLoansLoanIdOverdueCharges.chargePaymentMode) &&
        Objects.equals(this.feeInterval, getLoansLoanIdOverdueCharges.feeInterval) &&
        Objects.equals(this.feeFrequency, getLoansLoanIdOverdueCharges.feeFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, penalty, currency, amount, chargeTimeType, chargeAppliesTo, chargeCalculationType, chargePaymentMode, feeInterval, feeFrequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdOverdueCharges {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    feeInterval: ").append(toIndentedString(feeInterval)).append("\n");
    sb.append("    feeFrequency: ").append(toIndentedString(feeFrequency)).append("\n");
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

