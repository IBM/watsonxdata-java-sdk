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
 * UpdateEngine body.
 */
public class NetezzaEnginePatch extends GenericModel {

  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String displayName;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing NetezzaEnginePatch instance.
     *
     * @param netezzaEnginePatch the instance to initialize the Builder with
     */
    private Builder(NetezzaEnginePatch netezzaEnginePatch) {
      this.description = netezzaEnginePatch.description;
      this.displayName = netezzaEnginePatch.displayName;
      this.tags = netezzaEnginePatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NetezzaEnginePatch.
     *
     * @return the new NetezzaEnginePatch instance
     */
    public NetezzaEnginePatch build() {
      return new NetezzaEnginePatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the NetezzaEnginePatch builder
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
     * @return the NetezzaEnginePatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the NetezzaEnginePatch builder
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
     * @return the NetezzaEnginePatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected NetezzaEnginePatch() { }

  protected NetezzaEnginePatch(Builder builder) {
    description = builder.description;
    displayName = builder.displayName;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a NetezzaEnginePatch builder
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
   * Construct a JSON merge-patch from the NetezzaEnginePatch.
   *
   * Note that properties of the NetezzaEnginePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the NetezzaEnginePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

