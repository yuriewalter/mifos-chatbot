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
import org.mifos.chatbot.client.model.GetSelfBeneficiariesAccountOptions;
import java.io.IOException;

/**
 * GetSelfBeneficiariesTPTResponse
 */

public class GetSelfBeneficiariesTPTResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("accountType")
  private GetSelfBeneficiariesAccountOptions accountType = null;

  @SerializedName("accountNumber")
  private Long accountNumber = null;

  @SerializedName("transferLimit")
  private Integer transferLimit = null;

  public GetSelfBeneficiariesTPTResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSelfBeneficiariesTPTResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Client2Savings", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSelfBeneficiariesTPTResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Test Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetSelfBeneficiariesTPTResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "FN2 LN2", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetSelfBeneficiariesTPTResponse accountType(GetSelfBeneficiariesAccountOptions accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public GetSelfBeneficiariesAccountOptions getAccountType() {
    return accountType;
  }

  public void setAccountType(GetSelfBeneficiariesAccountOptions accountType) {
    this.accountType = accountType;
  }

  public GetSelfBeneficiariesTPTResponse accountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "2", value = "")
  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public GetSelfBeneficiariesTPTResponse transferLimit(Integer transferLimit) {
    this.transferLimit = transferLimit;
    return this;
  }

   /**
   * Get transferLimit
   * @return transferLimit
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getTransferLimit() {
    return transferLimit;
  }

  public void setTransferLimit(Integer transferLimit) {
    this.transferLimit = transferLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfBeneficiariesTPTResponse getSelfBeneficiariesTPTResponse = (GetSelfBeneficiariesTPTResponse) o;
    return Objects.equals(this.id, getSelfBeneficiariesTPTResponse.id) &&
        Objects.equals(this.name, getSelfBeneficiariesTPTResponse.name) &&
        Objects.equals(this.officeName, getSelfBeneficiariesTPTResponse.officeName) &&
        Objects.equals(this.clientName, getSelfBeneficiariesTPTResponse.clientName) &&
        Objects.equals(this.accountType, getSelfBeneficiariesTPTResponse.accountType) &&
        Objects.equals(this.accountNumber, getSelfBeneficiariesTPTResponse.accountNumber) &&
        Objects.equals(this.transferLimit, getSelfBeneficiariesTPTResponse.transferLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, officeName, clientName, accountType, accountNumber, transferLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfBeneficiariesTPTResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    transferLimit: ").append(toIndentedString(transferLimit)).append("\n");
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

