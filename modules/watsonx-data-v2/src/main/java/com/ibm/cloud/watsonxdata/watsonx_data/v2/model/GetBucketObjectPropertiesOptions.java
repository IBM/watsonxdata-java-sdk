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
 * The getBucketObjectProperties options.
 */
public class GetBucketObjectPropertiesOptions extends GenericModel {

  protected String bucketId;
  protected List<Path> paths;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private List<Path> paths;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetBucketObjectPropertiesOptions instance.
     *
     * @param getBucketObjectPropertiesOptions the instance to initialize the Builder with
     */
    private Builder(GetBucketObjectPropertiesOptions getBucketObjectPropertiesOptions) {
      this.bucketId = getBucketObjectPropertiesOptions.bucketId;
      this.paths = getBucketObjectPropertiesOptions.paths;
      this.authInstanceId = getBucketObjectPropertiesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketId the bucketId
     */
    public Builder(String bucketId) {
      this.bucketId = bucketId;
    }

    /**
     * Builds a GetBucketObjectPropertiesOptions.
     *
     * @return the new GetBucketObjectPropertiesOptions instance
     */
    public GetBucketObjectPropertiesOptions build() {
      return new GetBucketObjectPropertiesOptions(this);
    }

    /**
     * Adds a new element to paths.
     *
     * @param paths the new element to be added
     * @return the GetBucketObjectPropertiesOptions builder
     */
    public Builder addPaths(Path paths) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(paths,
        "paths cannot be null");
      if (this.paths == null) {
        this.paths = new ArrayList<Path>();
      }
      this.paths.add(paths);
      return this;
    }

    /**
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the GetBucketObjectPropertiesOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the paths.
     * Existing paths will be replaced.
     *
     * @param paths the paths
     * @return the GetBucketObjectPropertiesOptions builder
     */
    public Builder paths(List<Path> paths) {
      this.paths = paths;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetBucketObjectPropertiesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetBucketObjectPropertiesOptions() { }

  protected GetBucketObjectPropertiesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketId,
      "bucketId cannot be empty");
    bucketId = builder.bucketId;
    paths = builder.paths;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetBucketObjectPropertiesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * bucket id.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
  }

  /**
   * Gets the paths.
   *
   * bucket object size.
   *
   * @return the paths
   */
  public List<Path> paths() {
    return paths;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

