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
 * Update bucket parameters.
 */
public class BucketRegistrationPatch extends GenericModel {

  @SerializedName("bucket_details")
  protected BucketDetails bucketDetails;
  @SerializedName("bucket_display_name")
  protected String bucketDisplayName;
  protected String description;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketDetails bucketDetails;
    private String bucketDisplayName;
    private String description;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing BucketRegistrationPatch instance.
     *
     * @param bucketRegistrationPatch the instance to initialize the Builder with
     */
    private Builder(BucketRegistrationPatch bucketRegistrationPatch) {
      this.bucketDetails = bucketRegistrationPatch.bucketDetails;
      this.bucketDisplayName = bucketRegistrationPatch.bucketDisplayName;
      this.description = bucketRegistrationPatch.description;
      this.tags = bucketRegistrationPatch.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BucketRegistrationPatch.
     *
     * @return the new BucketRegistrationPatch instance
     */
    public BucketRegistrationPatch build() {
      return new BucketRegistrationPatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the BucketRegistrationPatch builder
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
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the BucketRegistrationPatch builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the bucketDisplayName.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @return the BucketRegistrationPatch builder
     */
    public Builder bucketDisplayName(String bucketDisplayName) {
      this.bucketDisplayName = bucketDisplayName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the BucketRegistrationPatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the BucketRegistrationPatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected BucketRegistrationPatch() { }

  protected BucketRegistrationPatch(Builder builder) {
    bucketDetails = builder.bucketDetails;
    bucketDisplayName = builder.bucketDisplayName;
    description = builder.description;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a BucketRegistrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketDetails.
   *
   * bucket details.
   *
   * @return the bucketDetails
   */
  public BucketDetails bucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * bucket display name.
   *
   * @return the bucketDisplayName
   */
  public String bucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the description.
   *
   * modified description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Construct a JSON merge-patch from the BucketRegistrationPatch.
   *
   * Note that properties of the BucketRegistrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BucketRegistrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

