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

import org.mifos.chatbot.client.model.FloatingRatePeriod;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.AppUser;
import org.mifos.chatbot.client.model.FloatingRatePeriod;

import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * FloatingRate
 */

public class FloatingRate {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("floatingRatePeriods")
  private List<FloatingRatePeriod> floatingRatePeriods = null;

  @SerializedName("createdBy")
  private AppUser createdBy = null;

  @SerializedName("modifiedBy")
  private AppUser modifiedBy = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("modifiedOn")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("baseLendingRate")
  private Boolean baseLendingRate = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("new")
  private Boolean _new = null;

  public FloatingRate id(Long id) {
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

  public FloatingRate name(String name) {
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

  public FloatingRate floatingRatePeriods(List<FloatingRatePeriod> floatingRatePeriods) {
    this.floatingRatePeriods = floatingRatePeriods;
    return this;
  }

  public FloatingRate addFloatingRatePeriodsItem(FloatingRatePeriod floatingRatePeriodsItem) {
    if (this.floatingRatePeriods == null) {
      this.floatingRatePeriods = new ArrayList<FloatingRatePeriod>();
    }
    this.floatingRatePeriods.add(floatingRatePeriodsItem);
    return this;
  }

   /**
   * Get floatingRatePeriods
   * @return floatingRatePeriods
  **/
  @ApiModelProperty(value = "")
  public List<FloatingRatePeriod> getFloatingRatePeriods() {
    return floatingRatePeriods;
  }

  public void setFloatingRatePeriods(List<FloatingRatePeriod> floatingRatePeriods) {
    this.floatingRatePeriods = floatingRatePeriods;
  }

  public FloatingRate createdBy(AppUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public AppUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AppUser createdBy) {
    this.createdBy = createdBy;
  }

  public FloatingRate modifiedBy(AppUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public AppUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(AppUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public FloatingRate createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public FloatingRate modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public FloatingRate baseLendingRate(Boolean baseLendingRate) {
    this.baseLendingRate = baseLendingRate;
    return this;
  }

   /**
   * Get baseLendingRate
   * @return baseLendingRate
  **/
  @ApiModelProperty(value = "")
  public Boolean isBaseLendingRate() {
    return baseLendingRate;
  }

  public void setBaseLendingRate(Boolean baseLendingRate) {
    this.baseLendingRate = baseLendingRate;
  }

  public FloatingRate active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public FloatingRate _new(Boolean _new) {
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
    FloatingRate floatingRate = (FloatingRate) o;
    return Objects.equals(this.id, floatingRate.id) &&
        Objects.equals(this.name, floatingRate.name) &&
        Objects.equals(this.floatingRatePeriods, floatingRate.floatingRatePeriods) &&
        Objects.equals(this.createdBy, floatingRate.createdBy) &&
        Objects.equals(this.modifiedBy, floatingRate.modifiedBy) &&
        Objects.equals(this.createdOn, floatingRate.createdOn) &&
        Objects.equals(this.modifiedOn, floatingRate.modifiedOn) &&
        Objects.equals(this.baseLendingRate, floatingRate.baseLendingRate) &&
        Objects.equals(this.active, floatingRate.active) &&
        Objects.equals(this._new, floatingRate._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, floatingRatePeriods, createdBy, modifiedBy, createdOn, modifiedOn, baseLendingRate, active, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatingRate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    floatingRatePeriods: ").append(toIndentedString(floatingRatePeriods)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    baseLendingRate: ").append(toIndentedString(baseLendingRate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

