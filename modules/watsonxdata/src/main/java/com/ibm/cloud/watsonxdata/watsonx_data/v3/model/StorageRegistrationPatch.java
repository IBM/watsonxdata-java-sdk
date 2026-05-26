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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Update storage parameters.
 */
public class StorageRegistrationPatch extends GenericModel {

  protected StorageDetails connection;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("system_storage_update_credentials")
  protected Boolean systemStorageUpdateCredentials;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private StorageDetails connection;
    private String description;
    private String displayName;
    private Boolean systemStorageUpdateCredentials;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing StorageRegistrationPatch instance.
     *
     * @param storageRegistrationPatch the instance to initialize the Builder with
     */
    private Builder(StorageRegistrationPatch storageRegistrationPatch) {
      this.connection = storageRegistrationPatch.connection;
      this.description = storageRegistrationPatch.description;
      this.displayName = storageRegistrationPatch.displayName;
      this.systemStorageUpdateCredentials = storageRegistrationPatch.systemStorageUpdateCredentials;
      this.tags = storageRegistrationPatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a StorageRegistrationPatch.
     *
     * @return the new StorageRegistrationPatch instance
     */
    public StorageRegistrationPatch build() {
      return new StorageRegistrationPatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the StorageRegistrationPatch builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the StorageRegistrationPatch builder
     */
    public Builder connection(StorageDetails connection) {
      this.connection = connection;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the StorageRegistrationPatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the StorageRegistrationPatch builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the systemStorageUpdateCredentials.
     *
     * @param systemStorageUpdateCredentials the systemStorageUpdateCredentials
     * @return the StorageRegistrationPatch builder
     */
    public Builder systemStorageUpdateCredentials(Boolean systemStorageUpdateCredentials) {
      this.systemStorageUpdateCredentials = systemStorageUpdateCredentials;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the StorageRegistrationPatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected StorageRegistrationPatch() { }

  protected StorageRegistrationPatch(Builder builder) {
    connection = builder.connection;
    description = builder.description;
    displayName = builder.displayName;
    systemStorageUpdateCredentials = builder.systemStorageUpdateCredentials;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a StorageRegistrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the connection.
   *
   * storage details.
   *
   * @return the connection
   */
  public StorageDetails connection() {
    return connection;
  }

  /**
   * Gets the description.
   *
   * Modified description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Storage display name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the systemStorageUpdateCredentials.
   *
   * Boolean value to specify whether the patch is for updating HMAC credentials for internal system storage.
   *
   * @return the systemStorageUpdateCredentials
   */
  public Boolean systemStorageUpdateCredentials() {
    return systemStorageUpdateCredentials;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Construct a JSON merge-patch from the StorageRegistrationPatch.
   *
   * Note that properties of the StorageRegistrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the StorageRegistrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

