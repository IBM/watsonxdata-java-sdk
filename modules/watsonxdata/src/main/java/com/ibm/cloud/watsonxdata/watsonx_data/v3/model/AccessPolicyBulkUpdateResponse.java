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
 * A list of access policies applied to users and user groups for the specified resources after.
 */
public class AccessPolicyBulkUpdateResponse extends GenericModel {

  @SerializedName("access_policies")
  protected List<AccessPolicyBulkUpdateData> accessPolicies;
  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("instance_id")
  protected String instanceId;

  protected AccessPolicyBulkUpdateResponse() { }

  /**
   * Gets the accessPolicies.
   *
   * Array of access policies. Each access policy contains metadata, permission,resource, state and subject.
   *
   * @return the accessPolicies
   */
  public List<AccessPolicyBulkUpdateData> getAccessPolicies() {
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
}

