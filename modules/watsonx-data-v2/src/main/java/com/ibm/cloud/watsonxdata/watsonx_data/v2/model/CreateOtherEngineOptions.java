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
 * The createOtherEngine options.
 */
public class CreateOtherEngineOptions extends GenericModel {

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

  protected OtherEngineDetailsBody engineDetails;
  protected String engineDisplayName;
  protected String description;
  protected String origin;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private OtherEngineDetailsBody engineDetails;
    private String engineDisplayName;
    private String description;
    private String origin;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateOtherEngineOptions instance.
     *
     * @param createOtherEngineOptions the instance to initialize the Builder with
     */
    private Builder(CreateOtherEngineOptions createOtherEngineOptions) {
      this.engineDetails = createOtherEngineOptions.engineDetails;
      this.engineDisplayName = createOtherEngineOptions.engineDisplayName;
      this.description = createOtherEngineOptions.description;
      this.origin = createOtherEngineOptions.origin;
      this.tags = createOtherEngineOptions.tags;
      this.authInstanceId = createOtherEngineOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineDetails the engineDetails
     * @param engineDisplayName the engineDisplayName
     */
    public Builder(OtherEngineDetailsBody engineDetails, String engineDisplayName) {
      this.engineDetails = engineDetails;
      this.engineDisplayName = engineDisplayName;
    }

    /**
     * Builds a CreateOtherEngineOptions.
     *
     * @return the new CreateOtherEngineOptions instance
     */
    public CreateOtherEngineOptions build() {
      return new CreateOtherEngineOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateOtherEngineOptions builder
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
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the CreateOtherEngineOptions builder
     */
    public Builder engineDetails(OtherEngineDetailsBody engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the CreateOtherEngineOptions builder
     */
    public Builder engineDisplayName(String engineDisplayName) {
      this.engineDisplayName = engineDisplayName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateOtherEngineOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the CreateOtherEngineOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateOtherEngineOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateOtherEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateOtherEngineOptions() { }

  protected CreateOtherEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineDetails,
      "engineDetails cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineDisplayName,
      "engineDisplayName cannot be null");
    engineDetails = builder.engineDetails;
    engineDisplayName = builder.engineDisplayName;
    description = builder.description;
    origin = builder.origin;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateOtherEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineDetails.
   *
   * External engine details.
   *
   * @return the engineDetails
   */
  public OtherEngineDetailsBody engineDetails() {
    return engineDetails;
  }

  /**
   * Gets the engineDisplayName.
   *
   * engine display name.
   *
   * @return the engineDisplayName
   */
  public String engineDisplayName() {
    return engineDisplayName;
  }

  /**
   * Gets the description.
   *
   * engine description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Gets the tags.
   *
   * other engine tags.
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

