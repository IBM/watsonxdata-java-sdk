/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createEngine options.
 */
public class CreateEngineOptions extends GenericModel {

  /**
   * Origin - created or registered.
   */
  public interface Origin {
    /** native. */
    String X_NATIVE = "native";
    /** external. */
    String EXTERNAL = "external";
    /** discover. */
    String DISCOVER = "discover";
  }

  protected String origin;
  protected String type;
  protected List<String> associatedCatalogs;
  protected String description;
  protected EngineDetailsBody engineDetails;
  protected String engineDisplayName;
  protected Boolean firstTimeUse;
  protected String region;
  protected List<String> tags;
  protected String version;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String origin;
    private String type;
    private List<String> associatedCatalogs;
    private String description;
    private EngineDetailsBody engineDetails;
    private String engineDisplayName;
    private Boolean firstTimeUse;
    private String region;
    private List<String> tags;
    private String version;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateEngineOptions instance.
     *
     * @param createEngineOptions the instance to initialize the Builder with
     */
    private Builder(CreateEngineOptions createEngineOptions) {
      this.origin = createEngineOptions.origin;
      this.type = createEngineOptions.type;
      this.associatedCatalogs = createEngineOptions.associatedCatalogs;
      this.description = createEngineOptions.description;
      this.engineDetails = createEngineOptions.engineDetails;
      this.engineDisplayName = createEngineOptions.engineDisplayName;
      this.firstTimeUse = createEngineOptions.firstTimeUse;
      this.region = createEngineOptions.region;
      this.tags = createEngineOptions.tags;
      this.version = createEngineOptions.version;
      this.authInstanceId = createEngineOptions.authInstanceId;
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
     * Builds a CreateEngineOptions.
     *
     * @return the new CreateEngineOptions instance
     */
    public CreateEngineOptions build() {
      return new CreateEngineOptions(this);
    }

    /**
     * Adds an associatedCatalogs to associatedCatalogs.
     *
     * @param associatedCatalogs the new associatedCatalogs
     * @return the CreateEngineOptions builder
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
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateEngineOptions builder
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
     * @return the CreateEngineOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateEngineOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the associatedCatalogs.
     * Existing associatedCatalogs will be replaced.
     *
     * @param associatedCatalogs the associatedCatalogs
     * @return the CreateEngineOptions builder
     */
    public Builder associatedCatalogs(List<String> associatedCatalogs) {
      this.associatedCatalogs = associatedCatalogs;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateEngineOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the CreateEngineOptions builder
     */
    public Builder engineDetails(EngineDetailsBody engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the CreateEngineOptions builder
     */
    public Builder engineDisplayName(String engineDisplayName) {
      this.engineDisplayName = engineDisplayName;
      return this;
    }

    /**
     * Set the firstTimeUse.
     *
     * @param firstTimeUse the firstTimeUse
     * @return the CreateEngineOptions builder
     */
    public Builder firstTimeUse(Boolean firstTimeUse) {
      this.firstTimeUse = firstTimeUse;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CreateEngineOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateEngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateEngineOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateEngineOptions() { }

  protected CreateEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    origin = builder.origin;
    type = builder.type;
    associatedCatalogs = builder.associatedCatalogs;
    description = builder.description;
    engineDetails = builder.engineDetails;
    engineDisplayName = builder.engineDisplayName;
    firstTimeUse = builder.firstTimeUse;
    region = builder.region;
    tags = builder.tags;
    version = builder.version;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the origin.
   *
   * Origin - created or registered.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the type.
   *
   * Engine type presto, others like netezza.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * Associated catalogs.
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
   * Gets the engineDetails.
   *
   * Node details.
   *
   * @return the engineDetails
   */
  public EngineDetailsBody engineDetails() {
    return engineDetails;
  }

  /**
   * Gets the engineDisplayName.
   *
   * Engine display name.
   *
   * @return the engineDisplayName
   */
  public String engineDisplayName() {
    return engineDisplayName;
  }

  /**
   * Gets the firstTimeUse.
   *
   * Optional parameter for UI - set as true when first time use.
   *
   * @return the firstTimeUse
   */
  public Boolean firstTimeUse() {
    return firstTimeUse;
  }

  /**
   * Gets the region.
   *
   * Region (cloud).
   *
   * @return the region
   */
  public String region() {
    return region;
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
   * Gets the version.
   *
   * Version like 0.278 for presto or else.
   *
   * @return the version
   */
  public String version() {
    return version;
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

