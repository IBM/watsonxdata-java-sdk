/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bucket object size.
 */
public class BucketObjectSizePathsItems extends GenericModel {

  protected String path;

  /**
   * Builder.
   */
  public static class Builder {
    private String path;

    /**
     * Instantiates a new Builder from an existing BucketObjectSizePathsItems instance.
     *
     * @param bucketObjectSizePathsItems the instance to initialize the Builder with
     */
    private Builder(BucketObjectSizePathsItems bucketObjectSizePathsItems) {
      this.path = bucketObjectSizePathsItems.path;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BucketObjectSizePathsItems.
     *
     * @return the new BucketObjectSizePathsItems instance
     */
    public BucketObjectSizePathsItems build() {
      return new BucketObjectSizePathsItems(this);
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the BucketObjectSizePathsItems builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }
  }

  protected BucketObjectSizePathsItems() { }

  protected BucketObjectSizePathsItems(Builder builder) {
    path = builder.path;
  }

  /**
   * New builder.
   *
   * @return a BucketObjectSizePathsItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the path.
   *
   * object path.
   *
   * @return the path
   */
  public String path() {
    return path;
  }
}

