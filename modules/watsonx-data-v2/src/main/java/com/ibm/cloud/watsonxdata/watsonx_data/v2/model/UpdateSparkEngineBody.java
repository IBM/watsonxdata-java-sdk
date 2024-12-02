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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * UpdateEngine body.
 */
public class UpdateSparkEngineBody extends GenericModel {

  protected String description;
  @SerializedName("engine_details")
  protected UpdateSparkEngineBodyEngineDetails engineDetails;
  @SerializedName("engine_display_name")
  protected String engineDisplayName;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private UpdateSparkEngineBodyEngineDetails engineDetails;
    private String engineDisplayName;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing UpdateSparkEngineBody instance.
     *
     * @param updateSparkEngineBody the instance to initialize the Builder with
     */
    private Builder(UpdateSparkEngineBody updateSparkEngineBody) {
      this.description = updateSparkEngineBody.description;
      this.engineDetails = updateSparkEngineBody.engineDetails;
      this.engineDisplayName = updateSparkEngineBody.engineDisplayName;
      this.tags = updateSparkEngineBody.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateSparkEngineBody.
     *
     * @return the new UpdateSparkEngineBody instance
     */
    public UpdateSparkEngineBody build() {
      return new UpdateSparkEngineBody(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the UpdateSparkEngineBody builder
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
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSparkEngineBody builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the UpdateSparkEngineBody builder
     */
    public Builder engineDetails(UpdateSparkEngineBodyEngineDetails engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }

    /**
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the UpdateSparkEngineBody builder
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
     * @return the UpdateSparkEngineBody builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected UpdateSparkEngineBody() { }

  protected UpdateSparkEngineBody(Builder builder) {
    description = builder.description;
    engineDetails = builder.engineDetails;
    engineDisplayName = builder.engineDisplayName;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a UpdateSparkEngineBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * Modified description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the engineDetails.
   *
   * Engine details.
   *
   * @return the engineDetails
   */
  public UpdateSparkEngineBodyEngineDetails engineDetails() {
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
   * Construct a JSON merge-patch from the UpdateSparkEngineBody.
   *
   * Note that properties of the UpdateSparkEngineBody with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the UpdateSparkEngineBody
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

