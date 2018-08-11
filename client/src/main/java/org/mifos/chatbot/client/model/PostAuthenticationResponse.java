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
import org.mifos.chatbot.client.model.RoleData;
import org.mifos.chatbot.client.model.EnumOptionData;
import org.mifos.chatbot.client.model.RoleData;

import java.util.ArrayList;
import java.util.List;

/**
 * PostAuthenticationResponse
 */

public class PostAuthenticationResponse {
  @SerializedName("username")
  private String username = null;

  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("base64EncodedAuthenticationKey")
  private String base64EncodedAuthenticationKey = null;

  @SerializedName("authenticated")
  private Boolean authenticated = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("staffId")
  private Long staffId = null;

  @SerializedName("staffDisplayName")
  private String staffDisplayName = null;

  @SerializedName("organisationalRole")
  private EnumOptionData organisationalRole = null;

  @SerializedName("roles")
  private List<RoleData> roles = null;

  @SerializedName("permissions")
  private List<String> permissions = null;

  public PostAuthenticationResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public PostAuthenticationResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public PostAuthenticationResponse base64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
    this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
    return this;
  }

   /**
   * Get base64EncodedAuthenticationKey
   * @return base64EncodedAuthenticationKey
  **/
  @ApiModelProperty(example = "bWlmb3M6cGFzc3dvcmQ=", value = "")
  public String getBase64EncodedAuthenticationKey() {
    return base64EncodedAuthenticationKey;
  }

  public void setBase64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
    this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
  }

  public PostAuthenticationResponse authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

   /**
   * Get authenticated
   * @return authenticated
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public PostAuthenticationResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public PostAuthenticationResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public PostAuthenticationResponse staffId(Long staffId) {
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getStaffId() {
    return staffId;
  }

  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public PostAuthenticationResponse staffDisplayName(String staffDisplayName) {
    this.staffDisplayName = staffDisplayName;
    return this;
  }

   /**
   * Get staffDisplayName
   * @return staffDisplayName
  **/
  @ApiModelProperty(example = "Director, Program", value = "")
  public String getStaffDisplayName() {
    return staffDisplayName;
  }

  public void setStaffDisplayName(String staffDisplayName) {
    this.staffDisplayName = staffDisplayName;
  }

  public PostAuthenticationResponse organisationalRole(EnumOptionData organisationalRole) {
    this.organisationalRole = organisationalRole;
    return this;
  }

   /**
   * Get organisationalRole
   * @return organisationalRole
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getOrganisationalRole() {
    return organisationalRole;
  }

  public void setOrganisationalRole(EnumOptionData organisationalRole) {
    this.organisationalRole = organisationalRole;
  }

  public PostAuthenticationResponse roles(List<RoleData> roles) {
    this.roles = roles;
    return this;
  }

  public PostAuthenticationResponse addRolesItem(RoleData rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleData>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<RoleData> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleData> roles) {
    this.roles = roles;
  }

  public PostAuthenticationResponse permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PostAuthenticationResponse addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(example = "\"ALL_FUNCTIONS\"", value = "")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAuthenticationResponse postAuthenticationResponse = (PostAuthenticationResponse) o;
    return Objects.equals(this.username, postAuthenticationResponse.username) &&
        Objects.equals(this.userId, postAuthenticationResponse.userId) &&
        Objects.equals(this.base64EncodedAuthenticationKey, postAuthenticationResponse.base64EncodedAuthenticationKey) &&
        Objects.equals(this.authenticated, postAuthenticationResponse.authenticated) &&
        Objects.equals(this.officeId, postAuthenticationResponse.officeId) &&
        Objects.equals(this.officeName, postAuthenticationResponse.officeName) &&
        Objects.equals(this.staffId, postAuthenticationResponse.staffId) &&
        Objects.equals(this.staffDisplayName, postAuthenticationResponse.staffDisplayName) &&
        Objects.equals(this.organisationalRole, postAuthenticationResponse.organisationalRole) &&
        Objects.equals(this.roles, postAuthenticationResponse.roles) &&
        Objects.equals(this.permissions, postAuthenticationResponse.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, userId, base64EncodedAuthenticationKey, authenticated, officeId, officeName, staffId, staffDisplayName, organisationalRole, roles, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAuthenticationResponse {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    base64EncodedAuthenticationKey: ").append(toIndentedString(base64EncodedAuthenticationKey)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffDisplayName: ").append(toIndentedString(staffDisplayName)).append("\n");
    sb.append("    organisationalRole: ").append(toIndentedString(organisationalRole)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

