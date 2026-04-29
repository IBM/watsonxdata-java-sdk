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
 * Metadata for data policy. It contains  policy identifier, creator of the policy, time when thw policy got created,
 * time when the policy got updated, last modifier of the policy and the version of data policy.
 */
public class GetDataPolicyMetadata extends GenericModel {

  @SerializedName("created_at")
  protected String createdAt;
  protected String creator;
  protected String modifier;
  protected String pid;
  @SerializedName("updated_at")
  protected String updatedAt;
  protected String version;

  protected GetDataPolicyMetadata() { }

  /**
   * Gets the createdAt.
   *
   * time when the policy was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the creator.
   *
   * an identifier for the creator of the policy.
   *
   * @return the creator
   */
  public String getCreator() {
    return creator;
  }

  /**
   * Gets the modifier.
   *
   * an identifier for the last modifier of the policy.
   *
   * @return the modifier
   */
  public String getModifier() {
    return modifier;
  }

  /**
   * Gets the pid.
   *
   * an unique identifier for the policy.
   *
   * @return the pid
   */
  public String getPid() {
    return pid;
  }

  /**
   * Gets the updatedAt.
   *
   * time when the policy was last updated.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the version.
   *
   * data policy version. This version will update on each data policy update.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

