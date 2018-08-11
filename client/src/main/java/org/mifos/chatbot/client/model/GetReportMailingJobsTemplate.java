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
import org.mifos.chatbot.client.model.EnumOptionData;
import org.mifos.chatbot.client.model.EnumOptionData;

import java.util.ArrayList;
import java.util.List;

/**
 * GetReportMailingJobsTemplate
 */

public class GetReportMailingJobsTemplate {
  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("emailAttachmentFileFormatOptions")
  private List<EnumOptionData> emailAttachmentFileFormatOptions = null;

  @SerializedName("stretchyReportParamDateOptions")
  private List<EnumOptionData> stretchyReportParamDateOptions = null;

  public GetReportMailingJobsTemplate isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetReportMailingJobsTemplate emailAttachmentFileFormatOptions(List<EnumOptionData> emailAttachmentFileFormatOptions) {
    this.emailAttachmentFileFormatOptions = emailAttachmentFileFormatOptions;
    return this;
  }

  public GetReportMailingJobsTemplate addEmailAttachmentFileFormatOptionsItem(EnumOptionData emailAttachmentFileFormatOptionsItem) {
    if (this.emailAttachmentFileFormatOptions == null) {
      this.emailAttachmentFileFormatOptions = new ArrayList<EnumOptionData>();
    }
    this.emailAttachmentFileFormatOptions.add(emailAttachmentFileFormatOptionsItem);
    return this;
  }

   /**
   * Get emailAttachmentFileFormatOptions
   * @return emailAttachmentFileFormatOptions
  **/
  @ApiModelProperty(value = "")
  public List<EnumOptionData> getEmailAttachmentFileFormatOptions() {
    return emailAttachmentFileFormatOptions;
  }

  public void setEmailAttachmentFileFormatOptions(List<EnumOptionData> emailAttachmentFileFormatOptions) {
    this.emailAttachmentFileFormatOptions = emailAttachmentFileFormatOptions;
  }

  public GetReportMailingJobsTemplate stretchyReportParamDateOptions(List<EnumOptionData> stretchyReportParamDateOptions) {
    this.stretchyReportParamDateOptions = stretchyReportParamDateOptions;
    return this;
  }

  public GetReportMailingJobsTemplate addStretchyReportParamDateOptionsItem(EnumOptionData stretchyReportParamDateOptionsItem) {
    if (this.stretchyReportParamDateOptions == null) {
      this.stretchyReportParamDateOptions = new ArrayList<EnumOptionData>();
    }
    this.stretchyReportParamDateOptions.add(stretchyReportParamDateOptionsItem);
    return this;
  }

   /**
   * Get stretchyReportParamDateOptions
   * @return stretchyReportParamDateOptions
  **/
  @ApiModelProperty(value = "")
  public List<EnumOptionData> getStretchyReportParamDateOptions() {
    return stretchyReportParamDateOptions;
  }

  public void setStretchyReportParamDateOptions(List<EnumOptionData> stretchyReportParamDateOptions) {
    this.stretchyReportParamDateOptions = stretchyReportParamDateOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportMailingJobsTemplate getReportMailingJobsTemplate = (GetReportMailingJobsTemplate) o;
    return Objects.equals(this.isActive, getReportMailingJobsTemplate.isActive) &&
        Objects.equals(this.emailAttachmentFileFormatOptions, getReportMailingJobsTemplate.emailAttachmentFileFormatOptions) &&
        Objects.equals(this.stretchyReportParamDateOptions, getReportMailingJobsTemplate.stretchyReportParamDateOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, emailAttachmentFileFormatOptions, stretchyReportParamDateOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportMailingJobsTemplate {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    emailAttachmentFileFormatOptions: ").append(toIndentedString(emailAttachmentFileFormatOptions)).append("\n");
    sb.append("    stretchyReportParamDateOptions: ").append(toIndentedString(stretchyReportParamDateOptions)).append("\n");
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

