/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.watsonx_data.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * milvus service details.
 */
public class MilvusService extends GenericModel {

  /**
   * milvus status.
   */
  public interface Status {
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** stopped. */
    String STOPPED = "stopped";
  }

  protected List<String> actions;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected Long createdOn;
  protected String description;
  @SerializedName("grpc_port")
  protected Long grpcPort;
  @SerializedName("host_name")
  protected String hostName;
  @SerializedName("https_port")
  protected Long httpsPort;
  protected String origin;
  @SerializedName("service_display_name")
  protected String serviceDisplayName;
  @SerializedName("service_id")
  protected String serviceId;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  protected List<String> tags;
  protected String type;

  protected MilvusService() { }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the createdBy.
   *
   * Created user name.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * Created time in epoch format.
   *
   * @return the createdOn
   */
  public Long getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * Service description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the grpcPort.
   *
   * milvus port.
   *
   * @return the grpcPort
   */
  public Long getGrpcPort() {
    return grpcPort;
  }

  /**
   * Gets the hostName.
   *
   * milvus display name.
   *
   * @return the hostName
   */
  public String getHostName() {
    return hostName;
  }

  /**
   * Gets the httpsPort.
   *
   * milvus port.
   *
   * @return the httpsPort
   */
  public Long getHttpsPort() {
    return httpsPort;
  }

  /**
   * Gets the origin.
   *
   * Origin - place holder.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the serviceDisplayName.
   *
   * Service display name.
   *
   * @return the serviceDisplayName
   */
  public String getServiceDisplayName() {
    return serviceDisplayName;
  }

  /**
   * Gets the serviceId.
   *
   * Service programmatic name.
   *
   * @return the serviceId
   */
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Gets the status.
   *
   * milvus status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusCode.
   *
   * milvus status code.
   *
   * @return the statusCode
   */
  public Long getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the type.
   *
   * service type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

