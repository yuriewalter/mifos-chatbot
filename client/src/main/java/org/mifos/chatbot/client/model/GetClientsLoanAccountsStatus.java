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
import java.io.IOException;

/**
 * GetClientsLoanAccountsStatus
 */

public class GetClientsLoanAccountsStatus {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("pendingApproval")
  private Boolean pendingApproval = null;

  @SerializedName("waitingForDisbursal")
  private Boolean waitingForDisbursal = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("closedObligationsMet")
  private Boolean closedObligationsMet = null;

  @SerializedName("closedWrittenOff")
  private Boolean closedWrittenOff = null;

  @SerializedName("closedRescheduled")
  private Boolean closedRescheduled = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("overpaid")
  private Boolean overpaid = null;

  public GetClientsLoanAccountsStatus id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "300", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetClientsLoanAccountsStatus code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "loanStatusType.active", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetClientsLoanAccountsStatus value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "Active", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetClientsLoanAccountsStatus pendingApproval(Boolean pendingApproval) {
    this.pendingApproval = pendingApproval;
    return this;
  }

   /**
   * Get pendingApproval
   * @return pendingApproval
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPendingApproval() {
    return pendingApproval;
  }

  public void setPendingApproval(Boolean pendingApproval) {
    this.pendingApproval = pendingApproval;
  }

  public GetClientsLoanAccountsStatus waitingForDisbursal(Boolean waitingForDisbursal) {
    this.waitingForDisbursal = waitingForDisbursal;
    return this;
  }

   /**
   * Get waitingForDisbursal
   * @return waitingForDisbursal
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isWaitingForDisbursal() {
    return waitingForDisbursal;
  }

  public void setWaitingForDisbursal(Boolean waitingForDisbursal) {
    this.waitingForDisbursal = waitingForDisbursal;
  }

  public GetClientsLoanAccountsStatus active(Boolean active) {
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

  public GetClientsLoanAccountsStatus closedObligationsMet(Boolean closedObligationsMet) {
    this.closedObligationsMet = closedObligationsMet;
    return this;
  }

   /**
   * Get closedObligationsMet
   * @return closedObligationsMet
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isClosedObligationsMet() {
    return closedObligationsMet;
  }

  public void setClosedObligationsMet(Boolean closedObligationsMet) {
    this.closedObligationsMet = closedObligationsMet;
  }

  public GetClientsLoanAccountsStatus closedWrittenOff(Boolean closedWrittenOff) {
    this.closedWrittenOff = closedWrittenOff;
    return this;
  }

   /**
   * Get closedWrittenOff
   * @return closedWrittenOff
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isClosedWrittenOff() {
    return closedWrittenOff;
  }

  public void setClosedWrittenOff(Boolean closedWrittenOff) {
    this.closedWrittenOff = closedWrittenOff;
  }

  public GetClientsLoanAccountsStatus closedRescheduled(Boolean closedRescheduled) {
    this.closedRescheduled = closedRescheduled;
    return this;
  }

   /**
   * Get closedRescheduled
   * @return closedRescheduled
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isClosedRescheduled() {
    return closedRescheduled;
  }

  public void setClosedRescheduled(Boolean closedRescheduled) {
    this.closedRescheduled = closedRescheduled;
  }

  public GetClientsLoanAccountsStatus closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public GetClientsLoanAccountsStatus overpaid(Boolean overpaid) {
    this.overpaid = overpaid;
    return this;
  }

   /**
   * Get overpaid
   * @return overpaid
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isOverpaid() {
    return overpaid;
  }

  public void setOverpaid(Boolean overpaid) {
    this.overpaid = overpaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsLoanAccountsStatus getClientsLoanAccountsStatus = (GetClientsLoanAccountsStatus) o;
    return Objects.equals(this.id, getClientsLoanAccountsStatus.id) &&
        Objects.equals(this.code, getClientsLoanAccountsStatus.code) &&
        Objects.equals(this.value, getClientsLoanAccountsStatus.value) &&
        Objects.equals(this.pendingApproval, getClientsLoanAccountsStatus.pendingApproval) &&
        Objects.equals(this.waitingForDisbursal, getClientsLoanAccountsStatus.waitingForDisbursal) &&
        Objects.equals(this.active, getClientsLoanAccountsStatus.active) &&
        Objects.equals(this.closedObligationsMet, getClientsLoanAccountsStatus.closedObligationsMet) &&
        Objects.equals(this.closedWrittenOff, getClientsLoanAccountsStatus.closedWrittenOff) &&
        Objects.equals(this.closedRescheduled, getClientsLoanAccountsStatus.closedRescheduled) &&
        Objects.equals(this.closed, getClientsLoanAccountsStatus.closed) &&
        Objects.equals(this.overpaid, getClientsLoanAccountsStatus.overpaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, value, pendingApproval, waitingForDisbursal, active, closedObligationsMet, closedWrittenOff, closedRescheduled, closed, overpaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsLoanAccountsStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    pendingApproval: ").append(toIndentedString(pendingApproval)).append("\n");
    sb.append("    waitingForDisbursal: ").append(toIndentedString(waitingForDisbursal)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    closedObligationsMet: ").append(toIndentedString(closedObligationsMet)).append("\n");
    sb.append("    closedWrittenOff: ").append(toIndentedString(closedWrittenOff)).append("\n");
    sb.append("    closedRescheduled: ").append(toIndentedString(closedRescheduled)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    overpaid: ").append(toIndentedString(overpaid)).append("\n");
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

