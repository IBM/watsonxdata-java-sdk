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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * metadata of each access policy such as created at, created by, last modified at and last modified by.
 */
public class Metadata extends GenericModel {

  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("last_modified_at")
  protected Date lastModifiedAt;
  @SerializedName("last_modified_by")
  protected String lastModifiedBy;

  protected Metadata() { }

  /**
   * Gets the createdAt.
   *
   * Access policy creation timestamp.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * an identifier for the creator of the policy.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the lastModifiedAt.
   *
   * access policy last udpated timestamp.
   *
   * @return the lastModifiedAt
   */
  public Date getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Gets the lastModifiedBy.
   *
   * an identifier for the last modifier of the policy.
   *
   * @return the lastModifiedBy
   */
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }
}

