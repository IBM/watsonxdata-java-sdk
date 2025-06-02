/*
 * (C) Copyright IBM Corp. 2025.
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
 * The addBucketCatalog options.
 */
public class AddBucketCatalogOptions extends GenericModel {

  protected String bucketId;
  protected String basePath;
  protected String catalogName;
  protected List<String> catalogTags;
  protected String catalogType;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private String basePath;
    private String catalogName;
    private List<String> catalogTags;
    private String catalogType;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing AddBucketCatalogOptions instance.
     *
     * @param addBucketCatalogOptions the instance to initialize the Builder with
     */
    private Builder(AddBucketCatalogOptions addBucketCatalogOptions) {
      this.bucketId = addBucketCatalogOptions.bucketId;
      this.basePath = addBucketCatalogOptions.basePath;
      this.catalogName = addBucketCatalogOptions.catalogName;
      this.catalogTags = addBucketCatalogOptions.catalogTags;
      this.catalogType = addBucketCatalogOptions.catalogType;
      this.authInstanceId = addBucketCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketId the bucketId
     */
    public Builder(String bucketId) {
      this.bucketId = bucketId;
    }

    /**
     * Builds a AddBucketCatalogOptions.
     *
     * @return the new AddBucketCatalogOptions instance
     */
    public AddBucketCatalogOptions build() {
      return new AddBucketCatalogOptions(this);
    }

    /**
     * Adds a new element to catalogTags.
     *
     * @param catalogTags the new element to be added
     * @return the AddBucketCatalogOptions builder
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
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the AddBucketCatalogOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the basePath.
     *
     * @param basePath the basePath
     * @return the AddBucketCatalogOptions builder
     */
    public Builder basePath(String basePath) {
      this.basePath = basePath;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the AddBucketCatalogOptions builder
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
     * @return the AddBucketCatalogOptions builder
     */
    public Builder catalogTags(List<String> catalogTags) {
      this.catalogTags = catalogTags;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the AddBucketCatalogOptions builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the AddBucketCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the bucketCatalog.
     *
     * @param bucketCatalog the bucketCatalog
     * @return the AddBucketCatalogOptions builder
     */
    public Builder bucketCatalog(BucketCatalog bucketCatalog) {
      this.basePath = bucketCatalog.basePath();
      this.catalogName = bucketCatalog.catalogName();
      this.catalogTags = bucketCatalog.catalogTags();
      this.catalogType = bucketCatalog.catalogType();
      return this;
    }
  }

  protected AddBucketCatalogOptions() { }

  protected AddBucketCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketId,
      "bucketId cannot be empty");
    bucketId = builder.bucketId;
    basePath = builder.basePath;
    catalogName = builder.catalogName;
    catalogTags = builder.catalogTags;
    catalogType = builder.catalogType;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a AddBucketCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * bucket id.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
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

