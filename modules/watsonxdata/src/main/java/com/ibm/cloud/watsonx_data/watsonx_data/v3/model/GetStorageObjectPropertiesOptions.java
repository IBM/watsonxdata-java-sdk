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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getStorageObjectProperties options.
 */
public class GetStorageObjectPropertiesOptions extends GenericModel {

  protected String storageId;
  protected List<Path> paths;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String storageId;
    private List<Path> paths;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetStorageObjectPropertiesOptions instance.
     *
     * @param getStorageObjectPropertiesOptions the instance to initialize the Builder with
     */
    private Builder(GetStorageObjectPropertiesOptions getStorageObjectPropertiesOptions) {
      this.storageId = getStorageObjectPropertiesOptions.storageId;
      this.paths = getStorageObjectPropertiesOptions.paths;
      this.authInstanceId = getStorageObjectPropertiesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param storageId the storageId
     */
    public Builder(String storageId) {
      this.storageId = storageId;
    }

    /**
     * Builds a GetStorageObjectPropertiesOptions.
     *
     * @return the new GetStorageObjectPropertiesOptions instance
     */
    public GetStorageObjectPropertiesOptions build() {
      return new GetStorageObjectPropertiesOptions(this);
    }

    /**
     * Adds a new element to paths.
     *
     * @param paths the new element to be added
     * @return the GetStorageObjectPropertiesOptions builder
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
     * Set the storageId.
     *
     * @param storageId the storageId
     * @return the GetStorageObjectPropertiesOptions builder
     */
    public Builder storageId(String storageId) {
      this.storageId = storageId;
      return this;
    }

    /**
     * Set the paths.
     * Existing paths will be replaced.
     *
     * @param paths the paths
     * @return the GetStorageObjectPropertiesOptions builder
     */
    public Builder paths(List<Path> paths) {
      this.paths = paths;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetStorageObjectPropertiesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetStorageObjectPropertiesOptions() { }

  protected GetStorageObjectPropertiesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.storageId,
      "storageId cannot be empty");
    storageId = builder.storageId;
    paths = builder.paths;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetStorageObjectPropertiesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the storageId.
   *
   * storage id.
   *
   * @return the storageId
   */
  public String storageId() {
    return storageId;
  }

  /**
   * Gets the paths.
   *
   * storage object size.
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

