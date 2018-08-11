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
import org.mifos.chatbot.client.model.GetClientsDataTables;
import org.mifos.chatbot.client.model.GetClientsOfficeOptions;
import org.mifos.chatbot.client.model.GetClientsSavingProductOptions;
import org.mifos.chatbot.client.model.GetClientsStaffOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * GetClientsTemplateResponse
 */

public class GetClientsTemplateResponse {
  @SerializedName("activationDate")
  private LocalDate activationDate = null;

  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("officeOptions")
  private List<GetClientsOfficeOptions> officeOptions = null;

  @SerializedName("staffOptions")
  private List<GetClientsStaffOptions> staffOptions = null;

  @SerializedName("savingProductOptions")
  private List<GetClientsSavingProductOptions> savingProductOptions = null;

  @SerializedName("datatables")
  private List<GetClientsDataTables> datatables = null;

  public GetClientsTemplateResponse activationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @ApiModelProperty(example = "[2014, 3, 4]", value = "")
  public LocalDate getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }

  public GetClientsTemplateResponse officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public GetClientsTemplateResponse officeOptions(List<GetClientsOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
    return this;
  }

  public GetClientsTemplateResponse addOfficeOptionsItem(GetClientsOfficeOptions officeOptionsItem) {
    if (this.officeOptions == null) {
      this.officeOptions = new ArrayList<GetClientsOfficeOptions>();
    }
    this.officeOptions.add(officeOptionsItem);
    return this;
  }

   /**
   * Get officeOptions
   * @return officeOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }

  public void setOfficeOptions(List<GetClientsOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }

  public GetClientsTemplateResponse staffOptions(List<GetClientsStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
    return this;
  }

  public GetClientsTemplateResponse addStaffOptionsItem(GetClientsStaffOptions staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<GetClientsStaffOptions>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

   /**
   * Get staffOptions
   * @return staffOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsStaffOptions> getStaffOptions() {
    return staffOptions;
  }

  public void setStaffOptions(List<GetClientsStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
  }

  public GetClientsTemplateResponse savingProductOptions(List<GetClientsSavingProductOptions> savingProductOptions) {
    this.savingProductOptions = savingProductOptions;
    return this;
  }

  public GetClientsTemplateResponse addSavingProductOptionsItem(GetClientsSavingProductOptions savingProductOptionsItem) {
    if (this.savingProductOptions == null) {
      this.savingProductOptions = new ArrayList<GetClientsSavingProductOptions>();
    }
    this.savingProductOptions.add(savingProductOptionsItem);
    return this;
  }

   /**
   * Get savingProductOptions
   * @return savingProductOptions
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsSavingProductOptions> getSavingProductOptions() {
    return savingProductOptions;
  }

  public void setSavingProductOptions(List<GetClientsSavingProductOptions> savingProductOptions) {
    this.savingProductOptions = savingProductOptions;
  }

  public GetClientsTemplateResponse datatables(List<GetClientsDataTables> datatables) {
    this.datatables = datatables;
    return this;
  }

  public GetClientsTemplateResponse addDatatablesItem(GetClientsDataTables datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new ArrayList<GetClientsDataTables>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

   /**
   * Get datatables
   * @return datatables
  **/
  @ApiModelProperty(value = "")
  public List<GetClientsDataTables> getDatatables() {
    return datatables;
  }

  public void setDatatables(List<GetClientsDataTables> datatables) {
    this.datatables = datatables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsTemplateResponse getClientsTemplateResponse = (GetClientsTemplateResponse) o;
    return Objects.equals(this.activationDate, getClientsTemplateResponse.activationDate) &&
        Objects.equals(this.officeId, getClientsTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getClientsTemplateResponse.officeOptions) &&
        Objects.equals(this.staffOptions, getClientsTemplateResponse.staffOptions) &&
        Objects.equals(this.savingProductOptions, getClientsTemplateResponse.savingProductOptions) &&
        Objects.equals(this.datatables, getClientsTemplateResponse.datatables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, officeId, officeOptions, staffOptions, savingProductOptions, datatables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsTemplateResponse {\n");
    
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
    sb.append("    savingProductOptions: ").append(toIndentedString(savingProductOptions)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
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

