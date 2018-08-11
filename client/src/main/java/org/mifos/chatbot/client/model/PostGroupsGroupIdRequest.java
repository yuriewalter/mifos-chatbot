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
import org.mifos.chatbot.client.model.PostGroupsGroupIdClients;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostGroupsGroupIdRequest
 */

public class PostGroupsGroupIdRequest {
  @SerializedName("destinationGroupId")
  private Integer destinationGroupId = null;

  @SerializedName("clients")
  private List<PostGroupsGroupIdClients> clients = null;

  public PostGroupsGroupIdRequest destinationGroupId(Integer destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
    return this;
  }

   /**
   * Get destinationGroupId
   * @return destinationGroupId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getDestinationGroupId() {
    return destinationGroupId;
  }

  public void setDestinationGroupId(Integer destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
  }

  public PostGroupsGroupIdRequest clients(List<PostGroupsGroupIdClients> clients) {
    this.clients = clients;
    return this;
  }

  public PostGroupsGroupIdRequest addClientsItem(PostGroupsGroupIdClients clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<PostGroupsGroupIdClients>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @ApiModelProperty(value = "")
  public List<PostGroupsGroupIdClients> getClients() {
    return clients;
  }

  public void setClients(List<PostGroupsGroupIdClients> clients) {
    this.clients = clients;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostGroupsGroupIdRequest postGroupsGroupIdRequest = (PostGroupsGroupIdRequest) o;
    return Objects.equals(this.destinationGroupId, postGroupsGroupIdRequest.destinationGroupId) &&
        Objects.equals(this.clients, postGroupsGroupIdRequest.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationGroupId, clients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupsGroupIdRequest {\n");
    
    sb.append("    destinationGroupId: ").append(toIndentedString(destinationGroupId)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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

