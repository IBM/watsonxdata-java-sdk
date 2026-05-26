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
 * A list of access policies applied to users and user groups for the specified resources.
 */
public class AccessPolicies extends GenericModel {

  @SerializedName("access_policies")
  protected List<AccessPolicy> accessPolicies;
  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("instance_id")
  protected String instanceId;
  protected Long limit;
  protected Long offset;
  @SerializedName("total_count")
  protected Long totalCount;

  protected AccessPolicies() { }

  /**
   * Gets the accessPolicies.
   *
   * Array of access policies. Each access policy contains metadata, permission,resource, state and subject.
   *
   * @return the accessPolicies
   */
  public List<AccessPolicy> getAccessPolicies() {
    return accessPolicies;
  }

  /**
   * Gets the accountId.
   *
   * account id of the logged in user.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier assigned to a specific watsonx.data instance.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the limit.
   *
   * maximum number of records in a page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * number of records to skip from the start of the list.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of access policies matching the query criteria across all pages. This value represents the complete
   * count of policies in the system and is used for pagination calculations.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

