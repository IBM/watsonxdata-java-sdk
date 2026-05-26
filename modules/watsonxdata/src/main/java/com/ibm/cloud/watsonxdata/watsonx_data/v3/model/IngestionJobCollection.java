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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Paged result for Ingestion Jobs.
 */
public class IngestionJobCollection extends GenericModel {

  protected Long limit;
  protected Long offset;
  @SerializedName("total_count")
  protected Long totalCount;
  protected List<IngestionJob> jobs;
  protected PagedResultsLink first;
  protected PagedResultsLink last;
  protected PagedResultsLink next;

  protected IngestionJobCollection() { }

  /**
   * Gets the limit.
   *
   * Pagination Limit.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * Pagination Offset.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the totalCount.
   *
   * Pagination Result Total Count.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the jobs.
   *
   * List ingestion jobs.
   *
   * @return the jobs
   */
  public List<IngestionJob> getJobs() {
    return jobs;
  }

  /**
   * Gets the first.
   *
   * Pagination next/previous page links.
   *
   * @return the first
   */
  public PagedResultsLink getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * Pagination next/previous page links.
   *
   * @return the last
   */
  public PagedResultsLink getLast() {
    return last;
  }

  /**
   * Gets the next.
   *
   * Pagination next/previous page links.
   *
   * @return the next
   */
  public PagedResultsLink getNext() {
    return next;
  }
}

