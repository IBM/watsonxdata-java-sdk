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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Information to update spark engine.
 */
public class SparkEnginePatch extends GenericModel {

  protected SparkEnginePatchEngineDetails configuration;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private SparkEnginePatchEngineDetails configuration;
    private String description;
    private String displayName;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing SparkEnginePatch instance.
     *
     * @param sparkEnginePatch the instance to initialize the Builder with
     */
    private Builder(SparkEnginePatch sparkEnginePatch) {
      this.configuration = sparkEnginePatch.configuration;
      this.description = sparkEnginePatch.description;
      this.displayName = sparkEnginePatch.displayName;
      this.tags = sparkEnginePatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEnginePatch.
     *
     * @return the new SparkEnginePatch instance
     */
    public SparkEnginePatch build() {
      return new SparkEnginePatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the SparkEnginePatch builder
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
     * @return the SparkEnginePatch builder
     */
    public Builder configuration(SparkEnginePatchEngineDetails configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SparkEnginePatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the SparkEnginePatch builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the SparkEnginePatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected SparkEnginePatch() { }

  protected SparkEnginePatch(Builder builder) {
    configuration = builder.configuration;
    description = builder.description;
    displayName = builder.displayName;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a SparkEnginePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configuration.
   *
   * Engine details.
   *
   * @return the configuration
   */
  public SparkEnginePatchEngineDetails configuration() {
    return configuration;
  }

  /**
   * Gets the description.
   *
   * Update the information related engine.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Display name to identify engine.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
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
   * Construct a JSON merge-patch from the SparkEnginePatch.
   *
   * Note that properties of the SparkEnginePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SparkEnginePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

