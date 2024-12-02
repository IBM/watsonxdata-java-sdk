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
 * UpdateService body.
 */
public class MilvusServicePatch extends GenericModel {

  protected String description;
  @SerializedName("service_display_name")
  protected String serviceDisplayName;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String serviceDisplayName;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing MilvusServicePatch instance.
     *
     * @param milvusServicePatch the instance to initialize the Builder with
     */
    private Builder(MilvusServicePatch milvusServicePatch) {
      this.description = milvusServicePatch.description;
      this.serviceDisplayName = milvusServicePatch.serviceDisplayName;
      this.tags = milvusServicePatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a MilvusServicePatch.
     *
     * @return the new MilvusServicePatch instance
     */
    public MilvusServicePatch build() {
      return new MilvusServicePatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the MilvusServicePatch builder
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
     * @return the MilvusServicePatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the serviceDisplayName.
     *
     * @param serviceDisplayName the serviceDisplayName
     * @return the MilvusServicePatch builder
     */
    public Builder serviceDisplayName(String serviceDisplayName) {
      this.serviceDisplayName = serviceDisplayName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the MilvusServicePatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected MilvusServicePatch() { }

  protected MilvusServicePatch(Builder builder) {
    description = builder.description;
    serviceDisplayName = builder.serviceDisplayName;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a MilvusServicePatch builder
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
   * Gets the serviceDisplayName.
   *
   * Service display name.
   *
   * @return the serviceDisplayName
   */
  public String serviceDisplayName() {
    return serviceDisplayName;
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
   * Construct a JSON merge-patch from the MilvusServicePatch.
   *
   * Note that properties of the MilvusServicePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the MilvusServicePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

