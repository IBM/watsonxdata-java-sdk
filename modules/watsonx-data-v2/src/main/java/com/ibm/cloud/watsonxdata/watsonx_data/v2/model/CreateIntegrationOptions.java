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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIntegration options.
 */
public class CreateIntegrationOptions extends GenericModel {

  protected String apikey;
  protected Boolean enableDataPolicyWithinWxd;
  protected String password;
  protected String resource;
  protected String serviceType;
  protected List<String> storageCatalogs;
  protected String url;
  protected String username;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String apikey;
    private Boolean enableDataPolicyWithinWxd;
    private String password;
    private String resource;
    private String serviceType;
    private List<String> storageCatalogs;
    private String url;
    private String username;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateIntegrationOptions instance.
     *
     * @param createIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateIntegrationOptions createIntegrationOptions) {
      this.apikey = createIntegrationOptions.apikey;
      this.enableDataPolicyWithinWxd = createIntegrationOptions.enableDataPolicyWithinWxd;
      this.password = createIntegrationOptions.password;
      this.resource = createIntegrationOptions.resource;
      this.serviceType = createIntegrationOptions.serviceType;
      this.storageCatalogs = createIntegrationOptions.storageCatalogs;
      this.url = createIntegrationOptions.url;
      this.username = createIntegrationOptions.username;
      this.authInstanceId = createIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateIntegrationOptions.
     *
     * @return the new CreateIntegrationOptions instance
     */
    public CreateIntegrationOptions build() {
      return new CreateIntegrationOptions(this);
    }

    /**
     * Adds a new element to storageCatalogs.
     *
     * @param storageCatalogs the new element to be added
     * @return the CreateIntegrationOptions builder
     */
    public Builder addStorageCatalogs(String storageCatalogs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(storageCatalogs,
        "storageCatalogs cannot be null");
      if (this.storageCatalogs == null) {
        this.storageCatalogs = new ArrayList<String>();
      }
      this.storageCatalogs.add(storageCatalogs);
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the CreateIntegrationOptions builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the enableDataPolicyWithinWxd.
     *
     * @param enableDataPolicyWithinWxd the enableDataPolicyWithinWxd
     * @return the CreateIntegrationOptions builder
     */
    public Builder enableDataPolicyWithinWxd(Boolean enableDataPolicyWithinWxd) {
      this.enableDataPolicyWithinWxd = enableDataPolicyWithinWxd;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the CreateIntegrationOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the CreateIntegrationOptions builder
     */
    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Set the serviceType.
     *
     * @param serviceType the serviceType
     * @return the CreateIntegrationOptions builder
     */
    public Builder serviceType(String serviceType) {
      this.serviceType = serviceType;
      return this;
    }

    /**
     * Set the storageCatalogs.
     * Existing storageCatalogs will be replaced.
     *
     * @param storageCatalogs the storageCatalogs
     * @return the CreateIntegrationOptions builder
     */
    public Builder storageCatalogs(List<String> storageCatalogs) {
      this.storageCatalogs = storageCatalogs;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the CreateIntegrationOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the CreateIntegrationOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateIntegrationOptions() { }

  protected CreateIntegrationOptions(Builder builder) {
    apikey = builder.apikey;
    enableDataPolicyWithinWxd = builder.enableDataPolicyWithinWxd;
    password = builder.password;
    resource = builder.resource;
    serviceType = builder.serviceType;
    storageCatalogs = builder.storageCatalogs;
    url = builder.url;
    username = builder.username;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apikey.
   *
   * Integration APIKEY.
   *
   * @return the apikey
   */
  public String apikey() {
    return apikey;
  }

  /**
   * Gets the enableDataPolicyWithinWxd.
   *
   * data policy enabler with wxd for ranger.
   *
   * @return the enableDataPolicyWithinWxd
   */
  public Boolean enableDataPolicyWithinWxd() {
    return enableDataPolicyWithinWxd;
  }

  /**
   * Gets the password.
   *
   * Integration password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the resource.
   *
   * resouce for ranger.
   *
   * @return the resource
   */
  public String resource() {
    return resource;
  }

  /**
   * Gets the serviceType.
   *
   * Integration type.
   *
   * @return the serviceType
   */
  public String serviceType() {
    return serviceType;
  }

  /**
   * Gets the storageCatalogs.
   *
   * Comma separated list of bucket catalogs which have ikc enabled.
   *
   * @return the storageCatalogs
   */
  public List<String> storageCatalogs() {
    return storageCatalogs;
  }

  /**
   * Gets the url.
   *
   * Integration Connection URL.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the username.
   *
   * Integration username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

