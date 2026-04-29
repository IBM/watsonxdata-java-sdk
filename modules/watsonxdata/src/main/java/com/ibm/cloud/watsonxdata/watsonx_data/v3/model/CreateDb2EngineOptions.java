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
 * The createDb2Engine options.
 */
public class CreateDb2EngineOptions extends GenericModel {

  /**
   * Origin of the engine.
   */
  public interface Origin {
    /** external. */
    String EXTERNAL = "external";
  }

  protected Db2EngineDetailsBody configuration;
  protected String displayName;
  protected String origin;
  protected String description;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private Db2EngineDetailsBody configuration;
    private String displayName;
    private String origin;
    private String description;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDb2EngineOptions instance.
     *
     * @param createDb2EngineOptions the instance to initialize the Builder with
     */
    private Builder(CreateDb2EngineOptions createDb2EngineOptions) {
      this.configuration = createDb2EngineOptions.configuration;
      this.displayName = createDb2EngineOptions.displayName;
      this.origin = createDb2EngineOptions.origin;
      this.description = createDb2EngineOptions.description;
      this.tags = createDb2EngineOptions.tags;
      this.authInstanceId = createDb2EngineOptions.authInstanceId;
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
    public Builder(Db2EngineDetailsBody configuration, String displayName, String origin) {
      this.configuration = configuration;
      this.displayName = displayName;
      this.origin = origin;
    }

    /**
     * Builds a CreateDb2EngineOptions.
     *
     * @return the new CreateDb2EngineOptions instance
     */
    public CreateDb2EngineOptions build() {
      return new CreateDb2EngineOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateDb2EngineOptions builder
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
     * @return the CreateDb2EngineOptions builder
     */
    public Builder configuration(Db2EngineDetailsBody configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateDb2EngineOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the CreateDb2EngineOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDb2EngineOptions builder
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
     * @return the CreateDb2EngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDb2EngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateDb2EngineOptions() { }

  protected CreateDb2EngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configuration,
      "configuration cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    configuration = builder.configuration;
    displayName = builder.displayName;
    origin = builder.origin;
    description = builder.description;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDb2EngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configuration.
   *
   * External engine details.
   *
   * @return the configuration
   */
  public Db2EngineDetailsBody configuration() {
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
   * Origin of the engine.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
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
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

