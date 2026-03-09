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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * collection of the enrichment job run log results.
 */
public class SalEnrichmentJobRunLogs extends GenericModel {

  protected List<String> results;
  @SerializedName("total_count")
  protected Long totalCount;

  protected SalEnrichmentJobRunLogs() { }

  /**
   * Gets the results.
   *
   * response from enrichment job run log request.
   *
   * @return the results
   */
  public List<String> getResults() {
    return results;
  }

  /**
   * Gets the totalCount.
   *
   * name.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

