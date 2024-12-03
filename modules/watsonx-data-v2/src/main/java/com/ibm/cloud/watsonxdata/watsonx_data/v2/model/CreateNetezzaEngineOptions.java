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
 * The createNetezzaEngine options.
 */
public class CreateNetezzaEngineOptions extends GenericModel {

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
  protected String description;
  protected NetezzaEngineDetailsBody engineDetails;
  protected String engineDisplayName;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String origin;
    private String description;
    private NetezzaEngineDetailsBody engineDetails;
    private String engineDisplayName;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateNetezzaEngineOptions instance.
     *
     * @param createNetezzaEngineOptions the instance to initialize the Builder with
     */
    private Builder(CreateNetezzaEngineOptions createNetezzaEngineOptions) {
      this.origin = createNetezzaEngineOptions.origin;
      this.description = createNetezzaEngineOptions.description;
      this.engineDetails = createNetezzaEngineOptions.engineDetails;
      this.engineDisplayName = createNetezzaEngineOptions.engineDisplayName;
      this.tags = createNetezzaEngineOptions.tags;
      this.authInstanceId = createNetezzaEngineOptions.authInstanceId;
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
     */
    public Builder(String origin) {
      this.origin = origin;
    }

    /**
     * Builds a CreateNetezzaEngineOptions.
     *
     * @return the new CreateNetezzaEngineOptions instance
     */
    public CreateNetezzaEngineOptions build() {
      return new CreateNetezzaEngineOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateNetezzaEngineOptions builder
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
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder engineDetails(NetezzaEngineDetailsBody engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder engineDisplayName(String engineDisplayName) {
      this.engineDisplayName = engineDisplayName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateNetezzaEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateNetezzaEngineOptions() { }

  protected CreateNetezzaEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    origin = builder.origin;
    description = builder.description;
    engineDetails = builder.engineDetails;
    engineDisplayName = builder.engineDisplayName;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateNetezzaEngineOptions builder
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
   * External engine details.
   *
   * @return the engineDetails
   */
  public NetezzaEngineDetailsBody engineDetails() {
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
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

