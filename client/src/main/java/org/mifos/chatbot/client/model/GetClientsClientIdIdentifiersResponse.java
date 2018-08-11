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
import org.mifos.chatbot.client.model.GetClientsDocumentType;
import java.io.IOException;

/**
 * GetClientsClientIdIdentifiersResponse
 */

public class GetClientsClientIdIdentifiersResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("documentType")
  private GetClientsDocumentType documentType = null;

  @SerializedName("documentKey")
  private String documentKey = null;

  @SerializedName("description")
  private String description = null;

  public GetClientsClientIdIdentifiersResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetClientsClientIdIdentifiersResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetClientsClientIdIdentifiersResponse documentType(GetClientsDocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")
  public GetClientsDocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(GetClientsDocumentType documentType) {
    this.documentType = documentType;
  }

  public GetClientsClientIdIdentifiersResponse documentKey(String documentKey) {
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @ApiModelProperty(example = "12345", value = "")
  public String getDocumentKey() {
    return documentKey;
  }

  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }

  public GetClientsClientIdIdentifiersResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Issued in the year 2--7", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdIdentifiersResponse getClientsClientIdIdentifiersResponse = (GetClientsClientIdIdentifiersResponse) o;
    return Objects.equals(this.id, getClientsClientIdIdentifiersResponse.id) &&
        Objects.equals(this.clientId, getClientsClientIdIdentifiersResponse.clientId) &&
        Objects.equals(this.documentType, getClientsClientIdIdentifiersResponse.documentType) &&
        Objects.equals(this.documentKey, getClientsClientIdIdentifiersResponse.documentKey) &&
        Objects.equals(this.description, getClientsClientIdIdentifiersResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, documentType, documentKey, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdIdentifiersResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

