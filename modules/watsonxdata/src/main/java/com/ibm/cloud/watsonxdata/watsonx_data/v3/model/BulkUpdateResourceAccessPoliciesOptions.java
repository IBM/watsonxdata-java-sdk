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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The bulkUpdateResourceAccessPolicies options.
 */
public class BulkUpdateResourceAccessPoliciesOptions extends GenericModel {

  protected List<AccessPolicyBulkUpdate> accessPolicies;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AccessPolicyBulkUpdate> accessPolicies;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing BulkUpdateResourceAccessPoliciesOptions instance.
     *
     * @param bulkUpdateResourceAccessPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(BulkUpdateResourceAccessPoliciesOptions bulkUpdateResourceAccessPoliciesOptions) {
      this.accessPolicies = bulkUpdateResourceAccessPoliciesOptions.accessPolicies;
      this.authInstanceId = bulkUpdateResourceAccessPoliciesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BulkUpdateResourceAccessPoliciesOptions.
     *
     * @return the new BulkUpdateResourceAccessPoliciesOptions instance
     */
    public BulkUpdateResourceAccessPoliciesOptions build() {
      return new BulkUpdateResourceAccessPoliciesOptions(this);
    }

    /**
     * Adds a new element to accessPolicies.
     *
     * @param accessPolicies the new element to be added
     * @return the BulkUpdateResourceAccessPoliciesOptions builder
     */
    public Builder addAccessPolicies(AccessPolicyBulkUpdate accessPolicies) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(accessPolicies,
        "accessPolicies cannot be null");
      if (this.accessPolicies == null) {
        this.accessPolicies = new ArrayList<AccessPolicyBulkUpdate>();
      }
      this.accessPolicies.add(accessPolicies);
      return this;
    }

    /**
     * Set the accessPolicies.
     * Existing accessPolicies will be replaced.
     *
     * @param accessPolicies the accessPolicies
     * @return the BulkUpdateResourceAccessPoliciesOptions builder
     */
    public Builder accessPolicies(List<AccessPolicyBulkUpdate> accessPolicies) {
      this.accessPolicies = accessPolicies;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the BulkUpdateResourceAccessPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected BulkUpdateResourceAccessPoliciesOptions() { }

  protected BulkUpdateResourceAccessPoliciesOptions(Builder builder) {
    accessPolicies = builder.accessPolicies;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a BulkUpdateResourceAccessPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessPolicies.
   *
   * Array of access policies. Each access policy contains metadata, permission,resource, state and subject.
   *
   * @return the accessPolicies
   */
  public List<AccessPolicyBulkUpdate> accessPolicies() {
    return accessPolicies;
  }

  /**
   * Gets the authInstanceId.
   *
   * Unique identifier assigned to a specific watsonx.data instance.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

