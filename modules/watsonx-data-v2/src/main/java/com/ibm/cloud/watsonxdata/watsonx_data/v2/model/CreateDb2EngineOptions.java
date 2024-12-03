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
 * The createDb2Engine options.
 */
public class CreateDb2EngineOptions extends GenericModel {

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
  protected Db2EngineDetailsBody engineDetails;
  protected String engineDisplayName;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String origin;
    private String description;
    private Db2EngineDetailsBody engineDetails;
    private String engineDisplayName;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDb2EngineOptions instance.
     *
     * @param createDb2EngineOptions the instance to initialize the Builder with
     */
    private Builder(CreateDb2EngineOptions createDb2EngineOptions) {
      this.origin = createDb2EngineOptions.origin;
      this.description = createDb2EngineOptions.description;
      this.engineDetails = createDb2EngineOptions.engineDetails;
      this.engineDisplayName = createDb2EngineOptions.engineDisplayName;
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
     * @param origin the origin
     */
    public Builder(String origin) {
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
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the CreateDb2EngineOptions builder
     */
    public Builder engineDetails(Db2EngineDetailsBody engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the CreateDb2EngineOptions builder
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
   * @return a CreateDb2EngineOptions builder
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
  public Db2EngineDetailsBody engineDetails() {
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

