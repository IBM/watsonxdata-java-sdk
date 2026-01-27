/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * storage details.
 */
public class StorageDetails extends GenericModel {

  @SerializedName("access_key")
  protected String accessKey;
  @SerializedName("access_key_vault")
  protected SecretDetails accessKeyVault;
  @SerializedName("account_name")
  protected String accountName;
  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("auth_mode")
  protected String authMode;
  @SerializedName("container_name")
  protected String containerName;
  @SerializedName("directory_id")
  protected String directoryId;
  protected String endpoint;
  @SerializedName("key_file")
  protected String keyFile;
  @SerializedName("mrap_arn")
  protected String mrapArn;
  protected String name;
  protected String provider;
  protected String region;
  @SerializedName("role_arn")
  protected String roleArn;
  @SerializedName("sas_token")
  protected String sasToken;
  @SerializedName("secret_key")
  protected String secretKey;
  @SerializedName("secret_key_vault")
  protected SecretDetails secretKeyVault;
  @SerializedName("vault_enabled")
  protected Boolean vaultEnabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKey;
    private SecretDetails accessKeyVault;
    private String accountName;
    private String applicationId;
    private String authMode;
    private String containerName;
    private String directoryId;
    private String endpoint;
    private String keyFile;
    private String mrapArn;
    private String name;
    private String provider;
    private String region;
    private String roleArn;
    private String sasToken;
    private String secretKey;
    private SecretDetails secretKeyVault;
    private Boolean vaultEnabled;

    /**
     * Instantiates a new Builder from an existing StorageDetails instance.
     *
     * @param storageDetails the instance to initialize the Builder with
     */
    private Builder(StorageDetails storageDetails) {
      this.accessKey = storageDetails.accessKey;
      this.accessKeyVault = storageDetails.accessKeyVault;
      this.accountName = storageDetails.accountName;
      this.applicationId = storageDetails.applicationId;
      this.authMode = storageDetails.authMode;
      this.containerName = storageDetails.containerName;
      this.directoryId = storageDetails.directoryId;
      this.endpoint = storageDetails.endpoint;
      this.keyFile = storageDetails.keyFile;
      this.mrapArn = storageDetails.mrapArn;
      this.name = storageDetails.name;
      this.provider = storageDetails.provider;
      this.region = storageDetails.region;
      this.roleArn = storageDetails.roleArn;
      this.sasToken = storageDetails.sasToken;
      this.secretKey = storageDetails.secretKey;
      this.secretKeyVault = storageDetails.secretKeyVault;
      this.vaultEnabled = storageDetails.vaultEnabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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
     * Set the accessKeyVault.
     *
     * @param accessKeyVault the accessKeyVault
     * @return the StorageDetails builder
     */
    public Builder accessKeyVault(SecretDetails accessKeyVault) {
      this.accessKeyVault = accessKeyVault;
      return this;
    }

    /**
     * Set the accountName.
     *
     * @param accountName the accountName
     * @return the StorageDetails builder
     */
    public Builder accountName(String accountName) {
      this.accountName = accountName;
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
     * Set the keyFile.
     *
     * @param keyFile the keyFile
     * @return the StorageDetails builder
     */
    public Builder keyFile(String keyFile) {
      this.keyFile = keyFile;
      return this;
    }

    /**
     * Set the mrapArn.
     *
     * @param mrapArn the mrapArn
     * @return the StorageDetails builder
     */
    public Builder mrapArn(String mrapArn) {
      this.mrapArn = mrapArn;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the StorageDetails builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the provider.
     *
     * @param provider the provider
     * @return the StorageDetails builder
     */
    public Builder provider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the StorageDetails builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the roleArn.
     *
     * @param roleArn the roleArn
     * @return the StorageDetails builder
     */
    public Builder roleArn(String roleArn) {
      this.roleArn = roleArn;
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
     * Set the secretKeyVault.
     *
     * @param secretKeyVault the secretKeyVault
     * @return the StorageDetails builder
     */
    public Builder secretKeyVault(SecretDetails secretKeyVault) {
      this.secretKeyVault = secretKeyVault;
      return this;
    }

    /**
     * Set the vaultEnabled.
     *
     * @param vaultEnabled the vaultEnabled
     * @return the StorageDetails builder
     */
    public Builder vaultEnabled(Boolean vaultEnabled) {
      this.vaultEnabled = vaultEnabled;
      return this;
    }
  }

  protected StorageDetails() { }

  protected StorageDetails(Builder builder) {
    accessKey = builder.accessKey;
    accessKeyVault = builder.accessKeyVault;
    accountName = builder.accountName;
    applicationId = builder.applicationId;
    authMode = builder.authMode;
    containerName = builder.containerName;
    directoryId = builder.directoryId;
    endpoint = builder.endpoint;
    keyFile = builder.keyFile;
    mrapArn = builder.mrapArn;
    name = builder.name;
    provider = builder.provider;
    region = builder.region;
    roleArn = builder.roleArn;
    sasToken = builder.sasToken;
    secretKey = builder.secretKey;
    secretKeyVault = builder.secretKeyVault;
    vaultEnabled = builder.vaultEnabled;
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
   * Access key ID, encrypted during storage registration.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the accessKeyVault.
   *
   * secret details.
   *
   * @return the accessKeyVault
   */
  public SecretDetails accessKeyVault() {
    return accessKeyVault;
  }

  /**
   * Gets the accountName.
   *
   * actual storage name.
   *
   * @return the accountName
   */
  public String accountName() {
    return accountName;
  }

  /**
   * Gets the applicationId.
   *
   * Application Id for storage registration.
   *
   * @return the applicationId
   */
  public String applicationId() {
    return applicationId;
  }

  /**
   * Gets the authMode.
   *
   * auth mode.
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
   * Directory Id for storage registration.
   *
   * @return the directoryId
   */
  public String directoryId() {
    return directoryId;
  }

  /**
   * Gets the endpoint.
   *
   * Cos endpoint.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the keyFile.
   *
   * Key file, encrypted during storage registration.
   *
   * @return the keyFile
   */
  public String keyFile() {
    return keyFile;
  }

  /**
   * Gets the mrapArn.
   *
   * arn role.
   *
   * @return the mrapArn
   */
  public String mrapArn() {
    return mrapArn;
  }

  /**
   * Gets the name.
   *
   * actual storage name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the provider.
   *
   * storage provider.
   *
   * @return the provider
   */
  public String provider() {
    return provider;
  }

  /**
   * Gets the region.
   *
   * Region where the storage is located.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the roleArn.
   *
   * arn role.
   *
   * @return the roleArn
   */
  public String roleArn() {
    return roleArn;
  }

  /**
   * Gets the sasToken.
   *
   * sas token, encrypted during storage registration.
   *
   * @return the sasToken
   */
  public String sasToken() {
    return sasToken;
  }

  /**
   * Gets the secretKey.
   *
   * Secret access key, encrypted during storage registration.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
  }

  /**
   * Gets the secretKeyVault.
   *
   * secret details.
   *
   * @return the secretKeyVault
   */
  public SecretDetails secretKeyVault() {
    return secretKeyVault;
  }

  /**
   * Gets the vaultEnabled.
   *
   * vault enabled or not.
   *
   * @return the vaultEnabled
   */
  public Boolean vaultEnabled() {
    return vaultEnabled;
  }
}

