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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * secret details.
 */
public class StorageDetailsAccesskeyVault extends GenericModel {

  protected String key;
  @SerializedName("secret_name")
  protected String secretName;
  @SerializedName("secret_urn")
  protected String secretUrn;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String secretName;
    private String secretUrn;

    /**
     * Instantiates a new Builder from an existing StorageDetailsAccesskeyVault instance.
     *
     * @param storageDetailsAccesskeyVault the instance to initialize the Builder with
     */
    private Builder(StorageDetailsAccesskeyVault storageDetailsAccesskeyVault) {
      this.key = storageDetailsAccesskeyVault.key;
      this.secretName = storageDetailsAccesskeyVault.secretName;
      this.secretUrn = storageDetailsAccesskeyVault.secretUrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a StorageDetailsAccesskeyVault.
     *
     * @return the new StorageDetailsAccesskeyVault instance
     */
    public StorageDetailsAccesskeyVault build() {
      return new StorageDetailsAccesskeyVault(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the StorageDetailsAccesskeyVault builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the secretName.
     *
     * @param secretName the secretName
     * @return the StorageDetailsAccesskeyVault builder
     */
    public Builder secretName(String secretName) {
      this.secretName = secretName;
      return this;
    }

    /**
     * Set the secretUrn.
     *
     * @param secretUrn the secretUrn
     * @return the StorageDetailsAccesskeyVault builder
     */
    public Builder secretUrn(String secretUrn) {
      this.secretUrn = secretUrn;
      return this;
    }
  }

  protected StorageDetailsAccesskeyVault() { }

  protected StorageDetailsAccesskeyVault(Builder builder) {
    key = builder.key;
    secretName = builder.secretName;
    secretUrn = builder.secretUrn;
  }

  /**
   * New builder.
   *
   * @return a StorageDetailsAccesskeyVault builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * secret key.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the secretName.
   *
   * secret name.
   *
   * @return the secretName
   */
  public String secretName() {
    return secretName;
  }

  /**
   * Gets the secretUrn.
   *
   * secret urn.
   *
   * @return the secretUrn
   */
  public String secretUrn() {
    return secretUrn;
  }
}

