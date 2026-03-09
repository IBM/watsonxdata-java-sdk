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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addStorageCatalog options.
 */
public class AddStorageCatalogOptions extends GenericModel {

  protected String storageId;
  protected String basePath;
  protected String catalogName;
  protected List<String> catalogTags;
  protected String catalogType;
  protected Boolean skipMdsCall;
  protected String authInstanceId;
  protected String accountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String storageId;
    private String basePath;
    private String catalogName;
    private List<String> catalogTags;
    private String catalogType;
    private Boolean skipMdsCall;
    private String authInstanceId;
    private String accountId;

    /**
     * Instantiates a new Builder from an existing AddStorageCatalogOptions instance.
     *
     * @param addStorageCatalogOptions the instance to initialize the Builder with
     */
    private Builder(AddStorageCatalogOptions addStorageCatalogOptions) {
      this.storageId = addStorageCatalogOptions.storageId;
      this.basePath = addStorageCatalogOptions.basePath;
      this.catalogName = addStorageCatalogOptions.catalogName;
      this.catalogTags = addStorageCatalogOptions.catalogTags;
      this.catalogType = addStorageCatalogOptions.catalogType;
      this.skipMdsCall = addStorageCatalogOptions.skipMdsCall;
      this.authInstanceId = addStorageCatalogOptions.authInstanceId;
      this.accountId = addStorageCatalogOptions.accountId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param storageId the storageId
     */
    public Builder(String storageId) {
      this.storageId = storageId;
    }

    /**
     * Builds a AddStorageCatalogOptions.
     *
     * @return the new AddStorageCatalogOptions instance
     */
    public AddStorageCatalogOptions build() {
      return new AddStorageCatalogOptions(this);
    }

    /**
     * Adds a new element to catalogTags.
     *
     * @param catalogTags the new element to be added
     * @return the AddStorageCatalogOptions builder
     */
    public Builder addCatalogTags(String catalogTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogTags,
        "catalogTags cannot be null");
      if (this.catalogTags == null) {
        this.catalogTags = new ArrayList<String>();
      }
      this.catalogTags.add(catalogTags);
      return this;
    }

    /**
     * Set the storageId.
     *
     * @param storageId the storageId
     * @return the AddStorageCatalogOptions builder
     */
    public Builder storageId(String storageId) {
      this.storageId = storageId;
      return this;
    }

    /**
     * Set the basePath.
     *
     * @param basePath the basePath
     * @return the AddStorageCatalogOptions builder
     */
    public Builder basePath(String basePath) {
      this.basePath = basePath;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the AddStorageCatalogOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogTags.
     * Existing catalogTags will be replaced.
     *
     * @param catalogTags the catalogTags
     * @return the AddStorageCatalogOptions builder
     */
    public Builder catalogTags(List<String> catalogTags) {
      this.catalogTags = catalogTags;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the AddStorageCatalogOptions builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }

    /**
     * Set the skipMdsCall.
     *
     * @param skipMdsCall the skipMdsCall
     * @return the AddStorageCatalogOptions builder
     */
    public Builder skipMdsCall(Boolean skipMdsCall) {
      this.skipMdsCall = skipMdsCall;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the AddStorageCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the AddStorageCatalogOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  protected AddStorageCatalogOptions() { }

  protected AddStorageCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.storageId,
      "storageId cannot be empty");
    storageId = builder.storageId;
    basePath = builder.basePath;
    catalogName = builder.catalogName;
    catalogTags = builder.catalogTags;
    catalogType = builder.catalogType;
    skipMdsCall = builder.skipMdsCall;
    authInstanceId = builder.authInstanceId;
    accountId = builder.accountId;
  }

  /**
   * New builder.
   *
   * @return a AddStorageCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the storageId.
   *
   * storage id.
   *
   * @return the storageId
   */
  public String storageId() {
    return storageId;
  }

  /**
   * Gets the basePath.
   *
   * catalog base path.
   *
   * @return the basePath
   */
  public String basePath() {
    return basePath;
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogTags.
   *
   * catalog tags.
   *
   * @return the catalogTags
   */
  public List<String> catalogTags() {
    return catalogTags;
  }

  /**
   * Gets the catalogType.
   *
   * catalog type.
   *
   * @return the catalogType
   */
  public String catalogType() {
    return catalogType;
  }

  /**
   * Gets the skipMdsCall.
   *
   * Skip MDS call when Unity catalog is added.
   *
   * @return the skipMdsCall
   */
  public Boolean skipMdsCall() {
    return skipMdsCall;
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

  /**
   * Gets the accountId.
   *
   * watsonx.data account ID.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }
}

