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

  protected String origin;
  protected String type;
  protected String description;
  protected String serviceDisplayName;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String origin;
    private String type;
    private String description;
    private String serviceDisplayName;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceOptions instance.
     *
     * @param createMilvusServiceOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceOptions createMilvusServiceOptions) {
      this.origin = createMilvusServiceOptions.origin;
      this.type = createMilvusServiceOptions.type;
      this.description = createMilvusServiceOptions.description;
      this.serviceDisplayName = createMilvusServiceOptions.serviceDisplayName;
      this.tags = createMilvusServiceOptions.tags;
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
     * @param origin the origin
     * @param type the type
     */
    public Builder(String origin, String type) {
      this.origin = origin;
      this.type = type;
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
     * Set the type.
     *
     * @param type the type
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder type(String type) {
      this.type = type;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    origin = builder.origin;
    type = builder.type;
    description = builder.description;
    serviceDisplayName = builder.serviceDisplayName;
    tags = builder.tags;
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
   * Gets the type.
   *
   * service type.
   *
   * @return the type
   */
  public String type() {
    return type;
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
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

