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
import org.mifos.chatbot.client.model.TemplateMapper;
import org.mifos.chatbot.client.model.TemplateMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * GetTemplatesTemplateResponse
 */

public class GetTemplatesTemplateResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("entity")
  private Long entity = null;

  @SerializedName("type")
  private Long type = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("mappers")
  private List<TemplateMapper> mappers = null;

  public GetTemplatesTemplateResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetTemplatesTemplateResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Text", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetTemplatesTemplateResponse entity(Long entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getEntity() {
    return entity;
  }

  public void setEntity(Long entity) {
    this.entity = entity;
  }

  public GetTemplatesTemplateResponse type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "0", value = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public GetTemplatesTemplateResponse text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "This is a loan for {{loan.clientName}}", value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GetTemplatesTemplateResponse mappers(List<TemplateMapper> mappers) {
    this.mappers = mappers;
    return this;
  }

  public GetTemplatesTemplateResponse addMappersItem(TemplateMapper mappersItem) {
    if (this.mappers == null) {
      this.mappers = new ArrayList<TemplateMapper>();
    }
    this.mappers.add(mappersItem);
    return this;
  }

   /**
   * Get mappers
   * @return mappers
  **/
  @ApiModelProperty(value = "")
  public List<TemplateMapper> getMappers() {
    return mappers;
  }

  public void setMappers(List<TemplateMapper> mappers) {
    this.mappers = mappers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTemplatesTemplateResponse getTemplatesTemplateResponse = (GetTemplatesTemplateResponse) o;
    return Objects.equals(this.id, getTemplatesTemplateResponse.id) &&
        Objects.equals(this.name, getTemplatesTemplateResponse.name) &&
        Objects.equals(this.entity, getTemplatesTemplateResponse.entity) &&
        Objects.equals(this.type, getTemplatesTemplateResponse.type) &&
        Objects.equals(this.text, getTemplatesTemplateResponse.text) &&
        Objects.equals(this.mappers, getTemplatesTemplateResponse.mappers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, entity, type, text, mappers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTemplatesTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    mappers: ").append(toIndentedString(mappers)).append("\n");
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

