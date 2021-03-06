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
import org.mifos.chatbot.client.model.Component;
import org.mifos.chatbot.client.model.Question;

import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Survey
 */

public class Survey {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("components")
  private List<Component> components = null;

  @SerializedName("questions")
  private List<Question> questions = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("validFrom")
  private OffsetDateTime validFrom = null;

  @SerializedName("validTo")
  private OffsetDateTime validTo = null;

  @SerializedName("new")
  private Boolean _new = null;

  public Survey id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Survey components(List<Component> components) {
    this.components = components;
    return this;
  }

  public Survey addComponentsItem(Component componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<Component>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @ApiModelProperty(value = "")
  public List<Component> getComponents() {
    return components;
  }

  public void setComponents(List<Component> components) {
    this.components = components;
  }

  public Survey questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public Survey addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public Survey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Survey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Survey description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Survey countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Survey validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public Survey validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public Survey _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(value = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(this.id, survey.id) &&
        Objects.equals(this.components, survey.components) &&
        Objects.equals(this.questions, survey.questions) &&
        Objects.equals(this.key, survey.key) &&
        Objects.equals(this.name, survey.name) &&
        Objects.equals(this.description, survey.description) &&
        Objects.equals(this.countryCode, survey.countryCode) &&
        Objects.equals(this.validFrom, survey.validFrom) &&
        Objects.equals(this.validTo, survey.validTo) &&
        Objects.equals(this._new, survey._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, components, questions, key, name, description, countryCode, validFrom, validTo, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

