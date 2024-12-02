/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * storage details.
 */
public class StorageDetails extends GenericModel {

  @SerializedName("access_key")
  protected String accessKey;
  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("auth_mode")
  protected String authMode;
  @SerializedName("container_name")
  protected String containerName;
  @SerializedName("directory_id")
  protected String directoryId;
  protected String endpoint;
  @SerializedName("sas_token")
  protected String sasToken;
  @SerializedName("secret_key")
  protected String secretKey;
  @SerializedName("storage_account_name")
  protected String storageAccountName;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKey;
    private String applicationId;
    private String authMode;
    private String containerName;
    private String directoryId;
    private String endpoint;
    private String sasToken;
    private String secretKey;
    private String storageAccountName;

    /**
     * Instantiates a new Builder from an existing StorageDetails instance.
     *
     * @param storageDetails the instance to initialize the Builder with
     */
    private Builder(StorageDetails storageDetails) {
      this.accessKey = storageDetails.accessKey;
      this.applicationId = storageDetails.applicationId;
      this.authMode = storageDetails.authMode;
      this.containerName = storageDetails.containerName;
      this.directoryId = storageDetails.directoryId;
      this.endpoint = storageDetails.endpoint;
      this.sasToken = storageDetails.sasToken;
      this.secretKey = storageDetails.secretKey;
      this.storageAccountName = storageDetails.storageAccountName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authMode the authMode
     * @param containerName the containerName
     * @param endpoint the endpoint
     * @param storageAccountName the storageAccountName
     */
    public Builder(String authMode, String containerName, String endpoint, String storageAccountName) {
      this.authMode = authMode;
      this.containerName = containerName;
      this.endpoint = endpoint;
      this.storageAccountName = storageAccountName;
    }

    /**
     * Builds a StorageDetails.
     *
     * @return the new StorageDetails instance
     */
    public StorageDetails build() {
      return new StorageDetails(this);
    }

    /**
     * Set the accessKey.
     *
     * @param accessKey the accessKey
     * @return the StorageDetails builder
     */
    public Builder accessKey(String accessKey) {
      this.accessKey = accessKey;
      return this;
    }

    /**
     * Set the applicationId.
     *
     * @param applicationId the applicationId
     * @return the StorageDetails builder
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    /**
     * Set the authMode.
     *
     * @param authMode the authMode
     * @return the StorageDetails builder
     */
    public Builder authMode(String authMode) {
      this.authMode = authMode;
      return this;
    }

    /**
     * Set the containerName.
     *
     * @param containerName the containerName
     * @return the StorageDetails builder
     */
    public Builder containerName(String containerName) {
      this.containerName = containerName;
      return this;
    }

    /**
     * Set the directoryId.
     *
     * @param directoryId the directoryId
     * @return the StorageDetails builder
     */
    public Builder directoryId(String directoryId) {
      this.directoryId = directoryId;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the StorageDetails builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the sasToken.
     *
     * @param sasToken the sasToken
     * @return the StorageDetails builder
     */
    public Builder sasToken(String sasToken) {
      this.sasToken = sasToken;
      return this;
    }

    /**
     * Set the secretKey.
     *
     * @param secretKey the secretKey
     * @return the StorageDetails builder
     */
    public Builder secretKey(String secretKey) {
      this.secretKey = secretKey;
      return this;
    }

    /**
     * Set the storageAccountName.
     *
     * @param storageAccountName the storageAccountName
     * @return the StorageDetails builder
     */
    public Builder storageAccountName(String storageAccountName) {
      this.storageAccountName = storageAccountName;
      return this;
    }
  }

  protected StorageDetails() { }

  protected StorageDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authMode,
      "authMode cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerName,
      "containerName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.storageAccountName,
      "storageAccountName cannot be null");
    accessKey = builder.accessKey;
    applicationId = builder.applicationId;
    authMode = builder.authMode;
    containerName = builder.containerName;
    directoryId = builder.directoryId;
    endpoint = builder.endpoint;
    sasToken = builder.sasToken;
    secretKey = builder.secretKey;
    storageAccountName = builder.storageAccountName;
  }

  /**
   * New builder.
   *
   * @return a StorageDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessKey.
   *
   * Access key ID, encrypted during bucket registration.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the applicationId.
   *
   * Application Id for bucket registration.
   *
   * @return the applicationId
   */
  public String applicationId() {
    return applicationId;
  }

  /**
   * Gets the authMode.
   *
   * Auth mode types.
   *
   * @return the authMode
   */
  public String authMode() {
    return authMode;
  }

  /**
   * Gets the containerName.
   *
   * actual container name.
   *
   * @return the containerName
   */
  public String containerName() {
    return containerName;
  }

  /**
   * Gets the directoryId.
   *
   * Directory Id for bucket registration.
   *
   * @return the directoryId
   */
  public String directoryId() {
    return directoryId;
  }

  /**
   * Gets the endpoint.
   *
   * ADLS endpoint.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the sasToken.
   *
   * sas token, encrypted during bucket registration.
   *
   * @return the sasToken
   */
  public String sasToken() {
    return sasToken;
  }

  /**
   * Gets the secretKey.
   *
   * Secret access key, encrypted during bucket registration.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
  }

  /**
   * Gets the storageAccountName.
   *
   * actual storage name.
   *
   * @return the storageAccountName
   */
  public String storageAccountName() {
    return storageAccountName;
  }
}

