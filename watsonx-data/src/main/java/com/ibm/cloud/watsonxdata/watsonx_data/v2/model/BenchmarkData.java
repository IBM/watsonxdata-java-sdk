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

import java.util.Date;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.DateTypeAdapter;

/**
 * BenchmarkData.
 */
public class BenchmarkData extends GenericModel {

  protected Bandwidth bandwidth;
  @JsonAdapter(DateTypeAdapter.class)
  protected Date date;
  @SerializedName("num_files")
  protected Long numFiles;
  protected Results results;
  @SerializedName("size_files")
  protected Long sizeFiles;
  protected String time;

  protected BenchmarkData() { }

  /**
   * Gets the bandwidth.
   *
   * @return the bandwidth
   */
  public Bandwidth getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the date.
   *
   * Date of the benchmark (YYYY-MM-DD).
   *
   * @return the date
   */
  public Date getDate() {
    return date;
  }

  /**
   * Gets the numFiles.
   *
   * Number of files used in the benchmark.
   *
   * @return the numFiles
   */
  public Long getNumFiles() {
    return numFiles;
  }

  /**
   * Gets the results.
   *
   * @return the results
   */
  public Results getResults() {
    return results;
  }

  /**
   * Gets the sizeFiles.
   *
   * Size of files in bytes. Maximum supported 1TB.
   *
   * @return the sizeFiles
   */
  public Long getSizeFiles() {
    return sizeFiles;
  }

  /**
   * Gets the time.
   *
   * Time of the benchmark (HH:mm:ss).
   *
   * @return the time
   */
  public String getTime() {
    return time;
  }
}

