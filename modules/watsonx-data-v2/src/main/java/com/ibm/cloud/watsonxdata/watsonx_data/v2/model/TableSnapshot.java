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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TableSnapshot.
 */
public class TableSnapshot extends GenericModel {

  @SerializedName("added_data_files")
  protected String addedDataFiles;
  @SerializedName("added_files_size")
  protected String addedFilesSize;
  @SerializedName("added_records")
  protected String addedRecords;
  @SerializedName("changed_partition_count")
  protected String changedPartitionCount;
  @SerializedName("committed_at")
  protected String committedAt;
  protected String operation;
  @SerializedName("snapshot_id")
  protected String snapshotId;
  @SerializedName("total_data_files")
  protected String totalDataFiles;
  @SerializedName("total_delete_files")
  protected String totalDeleteFiles;
  @SerializedName("total_equality_deletes")
  protected String totalEqualityDeletes;
  @SerializedName("total_position_deletes")
  protected String totalPositionDeletes;
  @SerializedName("total_records")
  protected String totalRecords;

  protected TableSnapshot() { }

  /**
   * Gets the addedDataFiles.
   *
   * Added data files.
   *
   * @return the addedDataFiles
   */
  public String getAddedDataFiles() {
    return addedDataFiles;
  }

  /**
   * Gets the addedFilesSize.
   *
   * Added files size.
   *
   * @return the addedFilesSize
   */
  public String getAddedFilesSize() {
    return addedFilesSize;
  }

  /**
   * Gets the addedRecords.
   *
   * Added records.
   *
   * @return the addedRecords
   */
  public String getAddedRecords() {
    return addedRecords;
  }

  /**
   * Gets the changedPartitionCount.
   *
   * Changed partition count.
   *
   * @return the changedPartitionCount
   */
  public String getChangedPartitionCount() {
    return changedPartitionCount;
  }

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
   * Gets the totalDataFiles.
   *
   * Total data files.
   *
   * @return the totalDataFiles
   */
  public String getTotalDataFiles() {
    return totalDataFiles;
  }

  /**
   * Gets the totalDeleteFiles.
   *
   * Total delete files.
   *
   * @return the totalDeleteFiles
   */
  public String getTotalDeleteFiles() {
    return totalDeleteFiles;
  }

  /**
   * Gets the totalEqualityDeletes.
   *
   * Total equality deletes.
   *
   * @return the totalEqualityDeletes
   */
  public String getTotalEqualityDeletes() {
    return totalEqualityDeletes;
  }

  /**
   * Gets the totalPositionDeletes.
   *
   * Total position deletes.
   *
   * @return the totalPositionDeletes
   */
  public String getTotalPositionDeletes() {
    return totalPositionDeletes;
  }

  /**
   * Gets the totalRecords.
   *
   * Total records.
   *
   * @return the totalRecords
   */
  public String getTotalRecords() {
    return totalRecords;
  }
}

