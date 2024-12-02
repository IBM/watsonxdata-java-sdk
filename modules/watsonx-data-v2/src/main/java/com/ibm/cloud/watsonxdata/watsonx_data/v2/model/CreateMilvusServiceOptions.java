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
 * The createMilvusService options.
 */
public class CreateMilvusServiceOptions extends GenericModel {

  protected String bucketName;
  protected String origin;
  protected String rootPath;
  protected String serviceDisplayName;
  protected String bucketType;
  protected String description;
  protected List<String> tags;
  protected String tshirtSize;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketName;
    private String origin;
    private String rootPath;
    private String serviceDisplayName;
    private String bucketType;
    private String description;
    private List<String> tags;
    private String tshirtSize;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceOptions instance.
     *
     * @param createMilvusServiceOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceOptions createMilvusServiceOptions) {
      this.bucketName = createMilvusServiceOptions.bucketName;
      this.origin = createMilvusServiceOptions.origin;
      this.rootPath = createMilvusServiceOptions.rootPath;
      this.serviceDisplayName = createMilvusServiceOptions.serviceDisplayName;
      this.bucketType = createMilvusServiceOptions.bucketType;
      this.description = createMilvusServiceOptions.description;
      this.tags = createMilvusServiceOptions.tags;
      this.tshirtSize = createMilvusServiceOptions.tshirtSize;
      this.authInstanceId = createMilvusServiceOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketName the bucketName
     * @param origin the origin
     * @param rootPath the rootPath
     * @param serviceDisplayName the serviceDisplayName
     */
    public Builder(String bucketName, String origin, String rootPath, String serviceDisplayName) {
      this.bucketName = bucketName;
      this.origin = origin;
      this.rootPath = rootPath;
      this.serviceDisplayName = serviceDisplayName;
    }

    /**
     * Builds a CreateMilvusServiceOptions.
     *
     * @return the new CreateMilvusServiceOptions instance
     */
    public CreateMilvusServiceOptions build() {
      return new CreateMilvusServiceOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateMilvusServiceOptions builder
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
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the rootPath.
     *
     * @param rootPath the rootPath
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder rootPath(String rootPath) {
      this.rootPath = rootPath;
      return this;
    }

    /**
     * Set the serviceDisplayName.
     *
     * @param serviceDisplayName the serviceDisplayName
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder serviceDisplayName(String serviceDisplayName) {
      this.serviceDisplayName = serviceDisplayName;
      return this;
    }

    /**
     * Set the bucketType.
     *
     * @param bucketType the bucketType
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder bucketType(String bucketType) {
      this.bucketType = bucketType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the tshirtSize.
     *
     * @param tshirtSize the tshirtSize
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder tshirtSize(String tshirtSize) {
      this.tshirtSize = tshirtSize;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateMilvusServiceOptions() { }

  protected CreateMilvusServiceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootPath,
      "rootPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serviceDisplayName,
      "serviceDisplayName cannot be null");
    bucketName = builder.bucketName;
    origin = builder.origin;
    rootPath = builder.rootPath;
    serviceDisplayName = builder.serviceDisplayName;
    bucketType = builder.bucketType;
    description = builder.description;
    tags = builder.tags;
    tshirtSize = builder.tshirtSize;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateMilvusServiceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketName.
   *
   * bucket name.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the origin.
   *
   * Origin - place holder.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the rootPath.
   *
   * root path.
   *
   * @return the rootPath
   */
  public String rootPath() {
    return rootPath;
  }

  /**
   * Gets the serviceDisplayName.
   *
   * Service display name.
   *
   * @return the serviceDisplayName
   */
  public String serviceDisplayName() {
    return serviceDisplayName;
  }

  /**
   * Gets the bucketType.
   *
   * bucket type.
   *
   * @return the bucketType
   */
  public String bucketType() {
    return bucketType;
  }

  /**
   * Gets the description.
   *
   * Service description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Gets the tshirtSize.
   *
   * tshirt size.
   *
   * @return the tshirtSize
   */
  public String tshirtSize() {
    return tshirtSize;
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

