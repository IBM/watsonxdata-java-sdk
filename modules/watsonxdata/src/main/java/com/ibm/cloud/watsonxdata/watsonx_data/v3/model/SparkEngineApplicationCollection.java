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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine Application Detail.
 */
public class SparkEngineApplicationCollection extends GenericModel {

  protected List<SparkEngineApplicationSummary> applications;
  protected PaginationLink first;
  protected Long limit;
  protected PaginationLink next;

  protected SparkEngineApplicationCollection() { }

  /**
   * Gets the applications.
   *
   * Application body.
   *
   * @return the applications
   */
  public List<SparkEngineApplicationSummary> getApplications() {
    return applications;
  }

  /**
   * Gets the first.
   *
   * Link to a page of results.
   *
   * @return the first
   */
  public PaginationLink getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The number of items returned per page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * Link to a page of results.
   *
   * @return the next
   */
  public PaginationLink getNext() {
    return next;
  }
}

