/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TableSnapshot.
 */
public class TableSnapshot extends GenericModel {

  @SerializedName("committed_at")
  protected String committedAt;
  protected String operation;
  @SerializedName("snapshot_id")
  protected String snapshotId;
  protected Map<String, Object> summary;

  protected TableSnapshot() { }

  /**
   * Gets the committedAt.
   *
   * Committed at.
   *
   * @return the committedAt
   */
  public String getCommittedAt() {
    return committedAt;
  }

  /**
   * Gets the operation.
   *
   * Operation.
   *
   * @return the operation
   */
  public String getOperation() {
    return operation;
  }

  /**
   * Gets the snapshotId.
   *
   * Snapshot id.
   *
   * @return the snapshotId
   */
  public String getSnapshotId() {
    return snapshotId;
  }

  /**
   * Gets the summary.
   *
   * Summary.
   *
   * @return the summary
   */
  public Map<String, Object> getSummary() {
    return summary;
  }
}

