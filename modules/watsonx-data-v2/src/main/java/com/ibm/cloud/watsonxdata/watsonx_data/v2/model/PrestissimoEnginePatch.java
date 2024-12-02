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
 * Update prestissimo engine body.
 */
public class PrestissimoEnginePatch extends GenericModel {

  /**
   * Triggers engine restart if value is force.
   */
  public interface EngineRestart {
    /** force. */
    String FORCE = "force";
    /** false. */
    String X_FALSE = "false";
  }

  protected String description;
  @SerializedName("engine_display_name")
  protected String engineDisplayName;
  @SerializedName("engine_properties")
  protected PrestissimoEngineEngineProperties engineProperties;
  @SerializedName("engine_restart")
  protected String engineRestart;
  @SerializedName("remove_engine_properties")
  protected RemoveEngineProperties removeEngineProperties;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String engineDisplayName;
    private PrestissimoEngineEngineProperties engineProperties;
    private String engineRestart;
    private RemoveEngineProperties removeEngineProperties;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePatch instance.
     *
     * @param prestissimoEnginePatch the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePatch prestissimoEnginePatch) {
      this.description = prestissimoEnginePatch.description;
      this.engineDisplayName = prestissimoEnginePatch.engineDisplayName;
      this.engineProperties = prestissimoEnginePatch.engineProperties;
      this.engineRestart = prestissimoEnginePatch.engineRestart;
      this.removeEngineProperties = prestissimoEnginePatch.removeEngineProperties;
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
     * Set the engineDisplayName.
     *
     * @param engineDisplayName the engineDisplayName
     * @return the PrestissimoEnginePatch builder
     */
    public Builder engineDisplayName(String engineDisplayName) {
      this.engineDisplayName = engineDisplayName;
      return this;
    }

    /**
     * Set the engineProperties.
     *
     * @param engineProperties the engineProperties
     * @return the PrestissimoEnginePatch builder
     */
    public Builder engineProperties(PrestissimoEngineEngineProperties engineProperties) {
      this.engineProperties = engineProperties;
      return this;
    }

    /**
     * Set the engineRestart.
     *
     * @param engineRestart the engineRestart
     * @return the PrestissimoEnginePatch builder
     */
    public Builder engineRestart(String engineRestart) {
      this.engineRestart = engineRestart;
      return this;
    }

    /**
     * Set the removeEngineProperties.
     *
     * @param removeEngineProperties the removeEngineProperties
     * @return the PrestissimoEnginePatch builder
     */
    public Builder removeEngineProperties(RemoveEngineProperties removeEngineProperties) {
      this.removeEngineProperties = removeEngineProperties;
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
    engineDisplayName = builder.engineDisplayName;
    engineProperties = builder.engineProperties;
    engineRestart = builder.engineRestart;
    removeEngineProperties = builder.removeEngineProperties;
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
   * Gets the engineProperties.
   *
   * Engine properties.
   *
   * @return the engineProperties
   */
  public PrestissimoEngineEngineProperties engineProperties() {
    return engineProperties;
  }

  /**
   * Gets the engineRestart.
   *
   * Triggers engine restart if value is force.
   *
   * @return the engineRestart
   */
  public String engineRestart() {
    return engineRestart;
  }

  /**
   * Gets the removeEngineProperties.
   *
   * RemoveEngine properties.
   *
   * @return the removeEngineProperties
   */
  public RemoveEngineProperties removeEngineProperties() {
    return removeEngineProperties;
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

