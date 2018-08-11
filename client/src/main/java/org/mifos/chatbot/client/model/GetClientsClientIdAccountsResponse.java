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
import org.mifos.chatbot.client.model.GetClientsLoanAccounts;
import org.mifos.chatbot.client.model.GetClientsSavingsAccounts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetClientsClientIdAccountsResponse
 */

public class GetClientsClientIdAccountsResponse {
  @SerializedName("loanAccounts")
  private List<GetClientsLoanAccounts> loanAccounts = null;

  @SerializedName("savingsAccounts")
  private List<GetClientsSavingsAccounts> savingsAccounts = null;

  public GetClientsClientIdAccountsResponse loanAccounts(List<GetClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addLoanAccountsItem(GetClientsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new ArrayList<GetClientsLoanAccounts>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }

  public void setLoanAccounts(List<GetClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }

  public GetClientsClientIdAccountsResponse savingsAccounts(List<GetClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addSavingsAccountsItem(GetClientsSavingsAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new ArrayList<GetClientsSavingsAccounts>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

   /**
   * Get savingsAccounts
   * @return savingsAccounts
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsSavingsAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }

  public void setSavingsAccounts(List<GetClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdAccountsResponse getClientsClientIdAccountsResponse = (GetClientsClientIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getClientsClientIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getClientsClientIdAccountsResponse.savingsAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdAccountsResponse {\n");
    
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
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

