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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * UpdateService body.
 */
public class MilvusServiceStoragePatch extends GenericModel {

  @SerializedName("root_path")
  protected String rootPath;
  @SerializedName("storage_name")
  protected String storageName;

  /**
   * Builder.
   */
  public static class Builder {
    private String rootPath;
    private String storageName;

    /**
     * Instantiates a new Builder from an existing MilvusServiceStoragePatch instance.
     *
     * @param milvusServiceStoragePatch the instance to initialize the Builder with
     */
    private Builder(MilvusServiceStoragePatch milvusServiceStoragePatch) {
      this.rootPath = milvusServiceStoragePatch.rootPath;
      this.storageName = milvusServiceStoragePatch.storageName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rootPath the rootPath
     * @param storageName the storageName
     */
    public Builder(String rootPath, String storageName) {
      this.rootPath = rootPath;
      this.storageName = storageName;
    }

    /**
     * Builds a MilvusServiceStoragePatch.
     *
     * @return the new MilvusServiceStoragePatch instance
     */
    public MilvusServiceStoragePatch build() {
      return new MilvusServiceStoragePatch(this);
    }

    /**
     * Set the rootPath.
     *
     * @param rootPath the rootPath
     * @return the MilvusServiceStoragePatch builder
     */
    public Builder rootPath(String rootPath) {
      this.rootPath = rootPath;
      return this;
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the MilvusServiceStoragePatch builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
      return this;
    }
  }

  protected MilvusServiceStoragePatch() { }

  protected MilvusServiceStoragePatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootPath,
      "rootPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.storageName,
      "storageName cannot be null");
    rootPath = builder.rootPath;
    storageName = builder.storageName;
  }

  /**
   * New builder.
   *
   * @return a MilvusServiceStoragePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rootPath.
   *
   * root path.
   *
   * @return the rootPath
   */
  public String rootPath() {
    return rootPath;
  }

  /**
   * Gets the storageName.
   *
   * storage name.
   *
   * @return the storageName
   */
  public String storageName() {
    return storageName;
  }

  /**
   * Construct a JSON merge-patch from the MilvusServiceStoragePatch.
   *
   * Note that properties of the MilvusServiceStoragePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the MilvusServiceStoragePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

