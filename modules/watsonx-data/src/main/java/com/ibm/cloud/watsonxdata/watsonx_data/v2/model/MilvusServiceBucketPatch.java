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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * UpdateService body.
 */
public class MilvusServiceBucketPatch extends GenericModel {

  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("root_path")
  protected String rootPath;
  @SerializedName("tshirt_size")
  protected String tshirtSize;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketName;
    private String managedBy;
    private String rootPath;
    private String tshirtSize;

    /**
     * Instantiates a new Builder from an existing MilvusServiceBucketPatch instance.
     *
     * @param milvusServiceBucketPatch the instance to initialize the Builder with
     */
    private Builder(MilvusServiceBucketPatch milvusServiceBucketPatch) {
      this.bucketName = milvusServiceBucketPatch.bucketName;
      this.managedBy = milvusServiceBucketPatch.managedBy;
      this.rootPath = milvusServiceBucketPatch.rootPath;
      this.tshirtSize = milvusServiceBucketPatch.tshirtSize;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a MilvusServiceBucketPatch.
     *
     * @return the new MilvusServiceBucketPatch instance
     */
    public MilvusServiceBucketPatch build() {
      return new MilvusServiceBucketPatch(this);
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the MilvusServiceBucketPatch builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the MilvusServiceBucketPatch builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the rootPath.
     *
     * @param rootPath the rootPath
     * @return the MilvusServiceBucketPatch builder
     */
    public Builder rootPath(String rootPath) {
      this.rootPath = rootPath;
      return this;
    }

    /**
     * Set the tshirtSize.
     *
     * @param tshirtSize the tshirtSize
     * @return the MilvusServiceBucketPatch builder
     */
    public Builder tshirtSize(String tshirtSize) {
      this.tshirtSize = tshirtSize;
      return this;
    }
  }

  protected MilvusServiceBucketPatch() { }

  protected MilvusServiceBucketPatch(Builder builder) {
    bucketName = builder.bucketName;
    managedBy = builder.managedBy;
    rootPath = builder.rootPath;
    tshirtSize = builder.tshirtSize;
  }

  /**
   * New builder.
   *
   * @return a MilvusServiceBucketPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketName.
   *
   * bucket name.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the managedBy.
   *
   * How is the Milvus instance managed.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
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
   * Gets the tshirtSize.
   *
   * tshirt size.
   *
   * @return the tshirtSize
   */
  public String tshirtSize() {
    return tshirtSize;
  }

  /**
   * Construct a JSON merge-patch from the MilvusServiceBucketPatch.
   *
   * Note that properties of the MilvusServiceBucketPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the MilvusServiceBucketPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

