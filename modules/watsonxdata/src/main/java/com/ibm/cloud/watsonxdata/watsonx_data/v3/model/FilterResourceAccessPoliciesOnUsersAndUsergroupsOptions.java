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
 * The filterResourceAccessPoliciesOnUsersAndUsergroups options.
 */
public class FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions extends GenericModel {

  protected List<AccessPoliciesSearch> accessPoliciesSearch;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AccessPoliciesSearch> accessPoliciesSearch;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions instance.
     *
     * @param filterResourceAccessPoliciesOnUsersAndUsergroupsOptions the instance to initialize the Builder with
     */
    private Builder(FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions filterResourceAccessPoliciesOnUsersAndUsergroupsOptions) {
      this.accessPoliciesSearch = filterResourceAccessPoliciesOnUsersAndUsergroupsOptions.accessPoliciesSearch;
      this.authInstanceId = filterResourceAccessPoliciesOnUsersAndUsergroupsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accessPoliciesSearch the accessPoliciesSearch
     */
    public Builder(List<AccessPoliciesSearch> accessPoliciesSearch) {
      this.accessPoliciesSearch = accessPoliciesSearch;
    }

    /**
     * Builds a FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions.
     *
     * @return the new FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions instance
     */
    public FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions build() {
      return new FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions(this);
    }

    /**
     * Adds a new element to accessPoliciesSearch.
     *
     * @param accessPoliciesSearch the new element to be added
     * @return the FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions builder
     */
    public Builder addAccessPoliciesSearch(AccessPoliciesSearch accessPoliciesSearch) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(accessPoliciesSearch,
        "accessPoliciesSearch cannot be null");
      if (this.accessPoliciesSearch == null) {
        this.accessPoliciesSearch = new ArrayList<AccessPoliciesSearch>();
      }
      this.accessPoliciesSearch.add(accessPoliciesSearch);
      return this;
    }

    /**
     * Set the accessPoliciesSearch.
     * Existing accessPoliciesSearch will be replaced.
     *
     * @param accessPoliciesSearch the accessPoliciesSearch
     * @return the FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions builder
     */
    public Builder accessPoliciesSearch(List<AccessPoliciesSearch> accessPoliciesSearch) {
      this.accessPoliciesSearch = accessPoliciesSearch;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions() { }

  protected FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.accessPoliciesSearch,
      "accessPoliciesSearch cannot be null");
    accessPoliciesSearch = builder.accessPoliciesSearch;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessPoliciesSearch.
   *
   * Array of access policies. Each access policy contains metadata, permission,resource, state and subject.
   *
   * @return the accessPoliciesSearch
   */
  public List<AccessPoliciesSearch> accessPoliciesSearch() {
    return accessPoliciesSearch;
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

