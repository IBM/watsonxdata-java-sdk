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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addStorageCatalog options.
 */
public class AddStorageCatalogOptions extends GenericModel {

  protected String storageId;
  protected List<String> catalogTags;
  protected String basePath;
  protected String catalogName;
  protected String catalogType;
  protected Boolean skipMdsCall;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String storageId;
    private List<String> catalogTags;
    private String basePath;
    private String catalogName;
    private String catalogType;
    private Boolean skipMdsCall;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing AddStorageCatalogOptions instance.
     *
     * @param addStorageCatalogOptions the instance to initialize the Builder with
     */
    private Builder(AddStorageCatalogOptions addStorageCatalogOptions) {
      this.storageId = addStorageCatalogOptions.storageId;
      this.catalogTags = addStorageCatalogOptions.catalogTags;
      this.basePath = addStorageCatalogOptions.basePath;
      this.catalogName = addStorageCatalogOptions.catalogName;
      this.catalogType = addStorageCatalogOptions.catalogType;
      this.skipMdsCall = addStorageCatalogOptions.skipMdsCall;
      this.authInstanceId = addStorageCatalogOptions.authInstanceId;
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
     * @param catalogTags the catalogTags
     */
    public Builder(String storageId, List<String> catalogTags) {
      this.storageId = storageId;
      this.catalogTags = catalogTags;
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
     * Set the storageCatalogPrototype.
     *
     * @param storageCatalogPrototype the storageCatalogPrototype
     * @return the AddStorageCatalogOptions builder
     */
    public Builder storageCatalogPrototype(StorageCatalogPrototype storageCatalogPrototype) {
      this.catalogTags = storageCatalogPrototype.catalogTags();
      this.basePath = storageCatalogPrototype.basePath();
      this.catalogName = storageCatalogPrototype.catalogName();
      this.catalogType = storageCatalogPrototype.catalogType();
      return this;
    }
  }

  protected AddStorageCatalogOptions() { }

  protected AddStorageCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.storageId,
      "storageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogTags,
      "catalogTags cannot be null");
    storageId = builder.storageId;
    catalogTags = builder.catalogTags;
    basePath = builder.basePath;
    catalogName = builder.catalogName;
    catalogType = builder.catalogType;
    skipMdsCall = builder.skipMdsCall;
    authInstanceId = builder.authInstanceId;
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
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

