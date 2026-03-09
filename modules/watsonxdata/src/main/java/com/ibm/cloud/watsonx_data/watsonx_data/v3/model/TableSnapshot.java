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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Snapshot of a table's state after a commit.
 */
public class TableSnapshot extends GenericModel {

  /**
   * Type of operation that triggered the snapshot.
   */
  public interface Operation {
    /** append. */
    String APPEND = "append";
    /** overwrite. */
    String OVERWRITE = "overwrite";
    /** delete. */
    String DELETE = "delete";
    /** replace. */
    String REPLACE = "replace";
    /** merge. */
    String MERGE = "merge";
    /** compact. */
    String COMPACT = "compact";
    /** alter. */
    String ALTER = "alter";
  }

  @SerializedName("added_data_files")
  protected String addedDataFiles;
  @SerializedName("added_files_size")
  protected String addedFilesSize;
  @SerializedName("added_records")
  protected String addedRecords;
  @SerializedName("changed_partition_count")
  protected String changedPartitionCount;
  @SerializedName("committed_at")
  protected Date committedAt;
  @SerializedName("is_current_snapshot")
  protected Boolean isCurrentSnapshot;
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
   * Number of data files added in this snapshot.
   *
   * @return the addedDataFiles
   */
  public String getAddedDataFiles() {
    return addedDataFiles;
  }

  /**
   * Gets the addedFilesSize.
   *
   * Total size (in bytes) of the added files.
   *
   * @return the addedFilesSize
   */
  public String getAddedFilesSize() {
    return addedFilesSize;
  }

  /**
   * Gets the addedRecords.
   *
   * Number of records added in this snapshot.
   *
   * @return the addedRecords
   */
  public String getAddedRecords() {
    return addedRecords;
  }

  /**
   * Gets the changedPartitionCount.
   *
   * Number of partitions that were changed in the snapshot.
   *
   * @return the changedPartitionCount
   */
  public String getChangedPartitionCount() {
    return changedPartitionCount;
  }

  /**
   * Gets the committedAt.
   *
   * Timestamp when the snapshot was committed in ISO 8601 format.
   *
   * @return the committedAt
   */
  public Date getCommittedAt() {
    return committedAt;
  }

  /**
   * Gets the isCurrentSnapshot.
   *
   * The current snapshot.
   *
   * @return the isCurrentSnapshot
   */
  public Boolean isIsCurrentSnapshot() {
    return isCurrentSnapshot;
  }

  /**
   * Gets the operation.
   *
   * Type of operation that triggered the snapshot.
   *
   * @return the operation
   */
  public String getOperation() {
    return operation;
  }

  /**
   * Gets the snapshotId.
   *
   * Unique identifier of the snapshot, consisting of alphanumeric characters and hyphens.
   *
   * @return the snapshotId
   */
  public String getSnapshotId() {
    return snapshotId;
  }

  /**
   * Gets the totalDataFiles.
   *
   * Total number of data files after the snapshot.
   *
   * @return the totalDataFiles
   */
  public String getTotalDataFiles() {
    return totalDataFiles;
  }

  /**
   * Gets the totalDeleteFiles.
   *
   * Total number of delete files after the snapshot.
   *
   * @return the totalDeleteFiles
   */
  public String getTotalDeleteFiles() {
    return totalDeleteFiles;
  }

  /**
   * Gets the totalEqualityDeletes.
   *
   * Number of equality-based deletes in the snapshot.
   *
   * @return the totalEqualityDeletes
   */
  public String getTotalEqualityDeletes() {
    return totalEqualityDeletes;
  }

  /**
   * Gets the totalPositionDeletes.
   *
   * Number of position-based deletes in the snapshot.
   *
   * @return the totalPositionDeletes
   */
  public String getTotalPositionDeletes() {
    return totalPositionDeletes;
  }

  /**
   * Gets the totalRecords.
   *
   * Total number of records after applying the snapshot.
   *
   * @return the totalRecords
   */
  public String getTotalRecords() {
    return totalRecords;
  }
}

