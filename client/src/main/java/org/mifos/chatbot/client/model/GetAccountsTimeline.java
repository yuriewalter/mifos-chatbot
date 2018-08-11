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
import org.threeten.bp.LocalDate;

/**
 * GetAccountsTimeline
 */

public class GetAccountsTimeline {
  @SerializedName("submittedOnDate")
  private LocalDate submittedOnDate = null;

  @SerializedName("submittedByUsername")
  private String submittedByUsername = null;

  @SerializedName("submittedByFirstname")
  private String submittedByFirstname = null;

  @SerializedName("submittedByLastname")
  private String submittedByLastname = null;

  @SerializedName("approvedDate")
  private LocalDate approvedDate = null;

  @SerializedName("approvedByUsername")
  private String approvedByUsername = null;

  @SerializedName("approvedByFirstname")
  private String approvedByFirstname = null;

  @SerializedName("approvedByLastname")
  private String approvedByLastname = null;

  @SerializedName("activatedDate")
  private LocalDate activatedDate = null;

  public GetAccountsTimeline submittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @ApiModelProperty(example = "[2016, 4, 1]", value = "")
  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }

  public GetAccountsTimeline submittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
    return this;
  }

   /**
   * Get submittedByUsername
   * @return submittedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getSubmittedByUsername() {
    return submittedByUsername;
  }

  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }

  public GetAccountsTimeline submittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

   /**
   * Get submittedByFirstname
   * @return submittedByFirstname
  **/
  @ApiModelProperty(example = "App", value = "")
  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }

  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }

  public GetAccountsTimeline submittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
    return this;
  }

   /**
   * Get submittedByLastname
   * @return submittedByLastname
  **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getSubmittedByLastname() {
    return submittedByLastname;
  }

  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }

  public GetAccountsTimeline approvedDate(LocalDate approvedDate) {
    this.approvedDate = approvedDate;
    return this;
  }

   /**
   * Get approvedDate
   * @return approvedDate
  **/
  @ApiModelProperty(example = "[2016, 4, 1]", value = "")
  public LocalDate getApprovedDate() {
    return approvedDate;
  }

  public void setApprovedDate(LocalDate approvedDate) {
    this.approvedDate = approvedDate;
  }

  public GetAccountsTimeline approvedByUsername(String approvedByUsername) {
    this.approvedByUsername = approvedByUsername;
    return this;
  }

   /**
   * Get approvedByUsername
   * @return approvedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getApprovedByUsername() {
    return approvedByUsername;
  }

  public void setApprovedByUsername(String approvedByUsername) {
    this.approvedByUsername = approvedByUsername;
  }

  public GetAccountsTimeline approvedByFirstname(String approvedByFirstname) {
    this.approvedByFirstname = approvedByFirstname;
    return this;
  }

   /**
   * Get approvedByFirstname
   * @return approvedByFirstname
  **/
  @ApiModelProperty(example = "App", value = "")
  public String getApprovedByFirstname() {
    return approvedByFirstname;
  }

  public void setApprovedByFirstname(String approvedByFirstname) {
    this.approvedByFirstname = approvedByFirstname;
  }

  public GetAccountsTimeline approvedByLastname(String approvedByLastname) {
    this.approvedByLastname = approvedByLastname;
    return this;
  }

   /**
   * Get approvedByLastname
   * @return approvedByLastname
  **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getApprovedByLastname() {
    return approvedByLastname;
  }

  public void setApprovedByLastname(String approvedByLastname) {
    this.approvedByLastname = approvedByLastname;
  }

  public GetAccountsTimeline activatedDate(LocalDate activatedDate) {
    this.activatedDate = activatedDate;
    return this;
  }

   /**
   * Get activatedDate
   * @return activatedDate
  **/
  @ApiModelProperty(example = "[2016, 4, 1]", value = "")
  public LocalDate getActivatedDate() {
    return activatedDate;
  }

  public void setActivatedDate(LocalDate activatedDate) {
    this.activatedDate = activatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsTimeline getAccountsTimeline = (GetAccountsTimeline) o;
    return Objects.equals(this.submittedOnDate, getAccountsTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getAccountsTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getAccountsTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getAccountsTimeline.submittedByLastname) &&
        Objects.equals(this.approvedDate, getAccountsTimeline.approvedDate) &&
        Objects.equals(this.approvedByUsername, getAccountsTimeline.approvedByUsername) &&
        Objects.equals(this.approvedByFirstname, getAccountsTimeline.approvedByFirstname) &&
        Objects.equals(this.approvedByLastname, getAccountsTimeline.approvedByLastname) &&
        Objects.equals(this.activatedDate, getAccountsTimeline.activatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, approvedDate, approvedByUsername, approvedByFirstname, approvedByLastname, activatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsTimeline {\n");
    
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
    sb.append("    approvedByUsername: ").append(toIndentedString(approvedByUsername)).append("\n");
    sb.append("    approvedByFirstname: ").append(toIndentedString(approvedByFirstname)).append("\n");
    sb.append("    approvedByLastname: ").append(toIndentedString(approvedByLastname)).append("\n");
    sb.append("    activatedDate: ").append(toIndentedString(activatedDate)).append("\n");
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

