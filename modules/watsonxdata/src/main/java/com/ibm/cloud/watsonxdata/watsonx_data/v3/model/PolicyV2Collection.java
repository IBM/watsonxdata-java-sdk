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
 * PolicyV2Collection schema contains the list of data policies.
 */
public class PolicyV2Collection extends GenericModel {

  @SerializedName("data_policies")
  protected List<PolicyV2> dataPolicies;
  @SerializedName("total_count")
  protected Long totalCount;

  protected PolicyV2Collection() { }

  /**
   * Gets the dataPolicies.
   *
   * policy collection.
   *
   * @return the dataPolicies
   */
  public List<PolicyV2> getDataPolicies() {
    return dataPolicies;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of policies retrieved as reponse of get data policies.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

