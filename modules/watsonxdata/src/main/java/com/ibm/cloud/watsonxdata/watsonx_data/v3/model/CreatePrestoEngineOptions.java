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
 * The createPrestoEngine options.
 */
public class CreatePrestoEngineOptions extends GenericModel {

  /**
   * Origin of presto engine .
   */
  public interface Origin {
    /** native. */
    String X_NATIVE = "native";
  }

  protected EngineDetails configuration;
  protected String displayName;
  protected String origin;
  protected List<String> associatedCatalogs;
  protected String description;
  protected String id;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private EngineDetails configuration;
    private String displayName;
    private String origin;
    private List<String> associatedCatalogs;
    private String description;
    private String id;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreatePrestoEngineOptions instance.
     *
     * @param createPrestoEngineOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrestoEngineOptions createPrestoEngineOptions) {
      this.configuration = createPrestoEngineOptions.configuration;
      this.displayName = createPrestoEngineOptions.displayName;
      this.origin = createPrestoEngineOptions.origin;
      this.associatedCatalogs = createPrestoEngineOptions.associatedCatalogs;
      this.description = createPrestoEngineOptions.description;
      this.id = createPrestoEngineOptions.id;
      this.tags = createPrestoEngineOptions.tags;
      this.authInstanceId = createPrestoEngineOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param configuration the configuration
     * @param displayName the displayName
     * @param origin the origin
     */
    public Builder(EngineDetails configuration, String displayName, String origin) {
      this.configuration = configuration;
      this.displayName = displayName;
      this.origin = origin;
    }

    /**
     * Builds a CreatePrestoEngineOptions.
     *
     * @return the new CreatePrestoEngineOptions instance
     */
    public CreatePrestoEngineOptions build() {
      return new CreatePrestoEngineOptions(this);
    }

    /**
     * Adds a new element to associatedCatalogs.
     *
     * @param associatedCatalogs the new element to be added
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder addAssociatedCatalogs(String associatedCatalogs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(associatedCatalogs,
        "associatedCatalogs cannot be null");
      if (this.associatedCatalogs == null) {
        this.associatedCatalogs = new ArrayList<String>();
      }
      this.associatedCatalogs.add(associatedCatalogs);
      return this;
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreatePrestoEngineOptions builder
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
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder configuration(EngineDetails configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the associatedCatalogs.
     * Existing associatedCatalogs will be replaced.
     *
     * @param associatedCatalogs the associatedCatalogs
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder associatedCatalogs(List<String> associatedCatalogs) {
      this.associatedCatalogs = associatedCatalogs;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreatePrestoEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreatePrestoEngineOptions() { }

  protected CreatePrestoEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configuration,
      "configuration cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    configuration = builder.configuration;
    displayName = builder.displayName;
    origin = builder.origin;
    associatedCatalogs = builder.associatedCatalogs;
    description = builder.description;
    id = builder.id;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreatePrestoEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configuration.
   *
   * Engine configuration details.
   *
   * @return the configuration
   */
  public EngineDetails configuration() {
    return configuration;
  }

  /**
   * Gets the displayName.
   *
   * Engine display name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the origin.
   *
   * Origin of presto engine .
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * Catalogs associated to the presto engine.
   *
   * @return the associatedCatalogs
   */
  public List<String> associatedCatalogs() {
    return associatedCatalogs;
  }

  /**
   * Gets the description.
   *
   * Engine description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the id.
   *
   * Engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

