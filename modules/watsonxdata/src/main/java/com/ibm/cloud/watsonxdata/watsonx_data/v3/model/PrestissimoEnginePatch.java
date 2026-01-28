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
 * Update prestissimo engine body.
 */
public class PrestissimoEnginePatch extends GenericModel {

  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("properties")
  protected PrestissimoEngineProperties xProperties;
  @SerializedName("remove_engine_properties")
  protected RemovePrestissimoEngineProperties removeEngineProperties;
  @SerializedName("restart_type")
  protected String restartType;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String displayName;
    private PrestissimoEngineProperties xProperties;
    private RemovePrestissimoEngineProperties removeEngineProperties;
    private String restartType;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePatch instance.
     *
     * @param prestissimoEnginePatch the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePatch prestissimoEnginePatch) {
      this.description = prestissimoEnginePatch.description;
      this.displayName = prestissimoEnginePatch.displayName;
      this.xProperties = prestissimoEnginePatch.xProperties;
      this.removeEngineProperties = prestissimoEnginePatch.removeEngineProperties;
      this.restartType = prestissimoEnginePatch.restartType;
      this.tags = prestissimoEnginePatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePatch.
     *
     * @return the new PrestissimoEnginePatch instance
     */
    public PrestissimoEnginePatch build() {
      return new PrestissimoEnginePatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the PrestissimoEnginePatch builder
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
     * @return the PrestissimoEnginePatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the PrestissimoEnginePatch builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the xProperties.
     *
     * @param xProperties the xProperties
     * @return the PrestissimoEnginePatch builder
     */
    public Builder xProperties(PrestissimoEngineProperties xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the removeEngineProperties.
     *
     * @param removeEngineProperties the removeEngineProperties
     * @return the PrestissimoEnginePatch builder
     */
    public Builder removeEngineProperties(RemovePrestissimoEngineProperties removeEngineProperties) {
      this.removeEngineProperties = removeEngineProperties;
      return this;
    }

    /**
     * Set the restartType.
     *
     * @param restartType the restartType
     * @return the PrestissimoEnginePatch builder
     */
    public Builder restartType(String restartType) {
      this.restartType = restartType;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the PrestissimoEnginePatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected PrestissimoEnginePatch() { }

  protected PrestissimoEnginePatch(Builder builder) {
    description = builder.description;
    displayName = builder.displayName;
    xProperties = builder.xProperties;
    removeEngineProperties = builder.removeEngineProperties;
    restartType = builder.restartType;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePatch builder
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
   * Gets the xProperties.
   *
   * Engine properties.
   *
   * @return the xProperties
   */
  public PrestissimoEngineProperties xProperties() {
    return xProperties;
  }

  /**
   * Gets the removeEngineProperties.
   *
   * RemoveEngine properties.
   *
   * @return the removeEngineProperties
   */
  public RemovePrestissimoEngineProperties removeEngineProperties() {
    return removeEngineProperties;
  }

  /**
   * Gets the restartType.
   *
   * engine will restart accordingily.
   *
   * @return the restartType
   */
  public String restartType() {
    return restartType;
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
   * Construct a JSON merge-patch from the PrestissimoEnginePatch.
   *
   * Note that properties of the PrestissimoEnginePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PrestissimoEnginePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

