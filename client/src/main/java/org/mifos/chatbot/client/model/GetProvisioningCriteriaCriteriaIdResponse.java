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
import org.mifos.chatbot.client.model.LoanProductData;
import org.mifos.chatbot.client.model.ProvisioningCriteriaDefinitionData;
import org.mifos.chatbot.client.model.LoanProductData;

import java.util.ArrayList;
import java.util.List;

/**
 * GetProvisioningCriteriaCriteriaIdResponse
 */

public class GetProvisioningCriteriaCriteriaIdResponse {
  @SerializedName("criteriaId")
  private Long criteriaId = null;

  @SerializedName("criteriaName")
  private String criteriaName = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("loanProducts")
  private List<LoanProductData> loanProducts = null;

  @SerializedName("provisioningcriteria")
  private List<ProvisioningCriteriaDefinitionData> provisioningcriteria = null;

  public GetProvisioningCriteriaCriteriaIdResponse criteriaId(Long criteriaId) {
    this.criteriaId = criteriaId;
    return this;
  }

   /**
   * Get criteriaId
   * @return criteriaId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getCriteriaId() {
    return criteriaId;
  }

  public void setCriteriaId(Long criteriaId) {
    this.criteriaId = criteriaId;
  }

  public GetProvisioningCriteriaCriteriaIdResponse criteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
    return this;
  }

   /**
   * Get criteriaName
   * @return criteriaName
  **/
  @ApiModelProperty(example = "High Risk Products Criteria", value = "")
  public String getCriteriaName() {
    return criteriaName;
  }

  public void setCriteriaName(String criteriaName) {
    this.criteriaName = criteriaName;
  }

  public GetProvisioningCriteriaCriteriaIdResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetProvisioningCriteriaCriteriaIdResponse loanProducts(List<LoanProductData> loanProducts) {
    this.loanProducts = loanProducts;
    return this;
  }

  public GetProvisioningCriteriaCriteriaIdResponse addLoanProductsItem(LoanProductData loanProductsItem) {
    if (this.loanProducts == null) {
      this.loanProducts = new ArrayList<LoanProductData>();
    }
    this.loanProducts.add(loanProductsItem);
    return this;
  }

   /**
   * Get loanProducts
   * @return loanProducts
  **/
  @ApiModelProperty(value = "")
  public List<LoanProductData> getLoanProducts() {
    return loanProducts;
  }

  public void setLoanProducts(List<LoanProductData> loanProducts) {
    this.loanProducts = loanProducts;
  }

  public GetProvisioningCriteriaCriteriaIdResponse provisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
    this.provisioningcriteria = provisioningcriteria;
    return this;
  }

  public GetProvisioningCriteriaCriteriaIdResponse addProvisioningcriteriaItem(ProvisioningCriteriaDefinitionData provisioningcriteriaItem) {
    if (this.provisioningcriteria == null) {
      this.provisioningcriteria = new ArrayList<ProvisioningCriteriaDefinitionData>();
    }
    this.provisioningcriteria.add(provisioningcriteriaItem);
    return this;
  }

   /**
   * Get provisioningcriteria
   * @return provisioningcriteria
  **/
  @ApiModelProperty(value = "")
  public List<ProvisioningCriteriaDefinitionData> getProvisioningcriteria() {
    return provisioningcriteria;
  }

  public void setProvisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
    this.provisioningcriteria = provisioningcriteria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProvisioningCriteriaCriteriaIdResponse getProvisioningCriteriaCriteriaIdResponse = (GetProvisioningCriteriaCriteriaIdResponse) o;
    return Objects.equals(this.criteriaId, getProvisioningCriteriaCriteriaIdResponse.criteriaId) &&
        Objects.equals(this.criteriaName, getProvisioningCriteriaCriteriaIdResponse.criteriaName) &&
        Objects.equals(this.createdBy, getProvisioningCriteriaCriteriaIdResponse.createdBy) &&
        Objects.equals(this.loanProducts, getProvisioningCriteriaCriteriaIdResponse.loanProducts) &&
        Objects.equals(this.provisioningcriteria, getProvisioningCriteriaCriteriaIdResponse.provisioningcriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaId, criteriaName, createdBy, loanProducts, provisioningcriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProvisioningCriteriaCriteriaIdResponse {\n");
    
    sb.append("    criteriaId: ").append(toIndentedString(criteriaId)).append("\n");
    sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    loanProducts: ").append(toIndentedString(loanProducts)).append("\n");
    sb.append("    provisioningcriteria: ").append(toIndentedString(provisioningcriteria)).append("\n");
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

