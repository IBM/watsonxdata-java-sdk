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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Results.
 */
public class Results extends GenericModel {

  @SerializedName("create_bucket_time_sec")
  protected String createBucketTimeSec;
  @SerializedName("download_files_time_sec")
  protected String downloadFilesTimeSec;
  @SerializedName("erase_bucket_time_sec")
  protected String eraseBucketTimeSec;
  @SerializedName("erase_objects_time_sec")
  protected String eraseObjectsTimeSec;
  @SerializedName("list_files_time_sec")
  protected String listFilesTimeSec;
  @SerializedName("total_operations_time_sec")
  protected String totalOperationsTimeSec;
  @SerializedName("upload_files_time_sec")
  protected String uploadFilesTimeSec;

  protected Results() { }

  /**
   * Gets the createBucketTimeSec.
   *
   * Time taken to create a bucket.
   *
   * @return the createBucketTimeSec
   */
  public String getCreateBucketTimeSec() {
    return createBucketTimeSec;
  }

  /**
   * Gets the downloadFilesTimeSec.
   *
   * Time taken to download files.
   *
   * @return the downloadFilesTimeSec
   */
  public String getDownloadFilesTimeSec() {
    return downloadFilesTimeSec;
  }

  /**
   * Gets the eraseBucketTimeSec.
   *
   * Time taken to erase a bucket.
   *
   * @return the eraseBucketTimeSec
   */
  public String getEraseBucketTimeSec() {
    return eraseBucketTimeSec;
  }

  /**
   * Gets the eraseObjectsTimeSec.
   *
   * Time taken to erase objects.
   *
   * @return the eraseObjectsTimeSec
   */
  public String getEraseObjectsTimeSec() {
    return eraseObjectsTimeSec;
  }

  /**
   * Gets the listFilesTimeSec.
   *
   * Time taken to list files.
   *
   * @return the listFilesTimeSec
   */
  public String getListFilesTimeSec() {
    return listFilesTimeSec;
  }

  /**
   * Gets the totalOperationsTimeSec.
   *
   * Total time for all operations.
   *
   * @return the totalOperationsTimeSec
   */
  public String getTotalOperationsTimeSec() {
    return totalOperationsTimeSec;
  }

  /**
   * Gets the uploadFilesTimeSec.
   *
   * Time taken to upload files.
   *
   * @return the uploadFilesTimeSec
   */
  public String getUploadFilesTimeSec() {
    return uploadFilesTimeSec;
  }
}

