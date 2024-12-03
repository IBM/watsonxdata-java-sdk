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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Update an Integration body.
 */
public class IntegrationPatch extends GenericModel {

  protected String apikey;
  @SerializedName("enable_data_policy_within_wxd")
  protected Boolean enableDataPolicyWithinWxd;
  protected String password;
  protected String resource;
  @SerializedName("storage_catalogs")
  protected List<String> storageCatalogs;
  protected String url;
  protected String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String apikey;
    private Boolean enableDataPolicyWithinWxd;
    private String password;
    private String resource;
    private List<String> storageCatalogs;
    private String url;
    private String username;

    /**
     * Instantiates a new Builder from an existing IntegrationPatch instance.
     *
     * @param integrationPatch the instance to initialize the Builder with
     */
    private Builder(IntegrationPatch integrationPatch) {
      this.apikey = integrationPatch.apikey;
      this.enableDataPolicyWithinWxd = integrationPatch.enableDataPolicyWithinWxd;
      this.password = integrationPatch.password;
      this.resource = integrationPatch.resource;
      this.storageCatalogs = integrationPatch.storageCatalogs;
      this.url = integrationPatch.url;
      this.username = integrationPatch.username;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IntegrationPatch.
     *
     * @return the new IntegrationPatch instance
     */
    public IntegrationPatch build() {
      return new IntegrationPatch(this);
    }

    /**
     * Adds a new element to storageCatalogs.
     *
     * @param storageCatalogs the new element to be added
     * @return the IntegrationPatch builder
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
     * @return the IntegrationPatch builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the enableDataPolicyWithinWxd.
     *
     * @param enableDataPolicyWithinWxd the enableDataPolicyWithinWxd
     * @return the IntegrationPatch builder
     */
    public Builder enableDataPolicyWithinWxd(Boolean enableDataPolicyWithinWxd) {
      this.enableDataPolicyWithinWxd = enableDataPolicyWithinWxd;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the IntegrationPatch builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the IntegrationPatch builder
     */
    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Set the storageCatalogs.
     * Existing storageCatalogs will be replaced.
     *
     * @param storageCatalogs the storageCatalogs
     * @return the IntegrationPatch builder
     */
    public Builder storageCatalogs(List<String> storageCatalogs) {
      this.storageCatalogs = storageCatalogs;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the IntegrationPatch builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the IntegrationPatch builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  protected IntegrationPatch() { }

  protected IntegrationPatch(Builder builder) {
    apikey = builder.apikey;
    enableDataPolicyWithinWxd = builder.enableDataPolicyWithinWxd;
    password = builder.password;
    resource = builder.resource;
    storageCatalogs = builder.storageCatalogs;
    url = builder.url;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a IntegrationPatch builder
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
   * Construct a JSON merge-patch from the IntegrationPatch.
   *
   * Note that properties of the IntegrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the IntegrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

