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
 * This data policy object contains the unique name of data policy, metadata of the data policy, catalog name, data
 * artifact which is used to identify the object in the resource, policy status, resource id and the list of rules in
 * data policy.
 */
public class PolicyV2 extends GenericModel {

  /**
   * The data policy status. Values can be active or inactive.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("data_artifact")
  protected String dataArtifact;
  protected String description;
  protected GetDataPolicyMetadata metadata;
  @SerializedName("policy_name")
  protected String policyName;
  @SerializedName("resource_id")
  protected String resourceId;
  @SerializedName("rule_count")
  protected Long ruleCount;
  protected List<PolicyRuleV2> rules;
  protected String status;

  protected PolicyV2() { }

  /**
   * Gets the catalogName.
   *
   * name of catalog on which the data policy applies.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the dataArtifact.
   *
   * The data artifact used to identify the object in the resource.
   *
   * @return the dataArtifact
   */
  public String getDataArtifact() {
    return dataArtifact;
  }

  /**
   * Gets the description.
   *
   * More detailed description of the policy.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the metadata.
   *
   * Metadata for data policy. It contains  policy identifier, creator of the policy, time when thw policy got created,
   * time when the policy got updated, last modifier of the policy and the version of data policy.
   *
   * @return the metadata
   */
  public GetDataPolicyMetadata getMetadata() {
    return metadata;
  }

  /**
   * Gets the policyName.
   *
   * The unique name of the data policy.
   *
   * @return the policyName
   */
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Gets the resourceId.
   *
   * identifier of the resource on which the data policy applies.
   *
   * @return the resourceId
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Gets the ruleCount.
   *
   * Total number of rules in each data policy. Rule defines who can access what.
   *
   * @return the ruleCount
   */
  public Long getRuleCount() {
    return ruleCount;
  }

  /**
   * Gets the rules.
   *
   * The rules list.
   *
   * @return the rules
   */
  public List<PolicyRuleV2> getRules() {
    return rules;
  }

  /**
   * Gets the status.
   *
   * The data policy status. Values can be active or inactive.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

