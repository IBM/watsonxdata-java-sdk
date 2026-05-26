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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Access Policies search request object which contains resources and subjects (users and user groups) to which the
 * access policy .
 */
public class AccessPoliciesSearch extends GenericModel {

  protected List<ResourceDetails> resources;
  @SerializedName("subjects_to_search")
  protected List<Subject> subjectsToSearch;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourceDetails> resources;
    private List<Subject> subjectsToSearch;

    /**
     * Instantiates a new Builder from an existing AccessPoliciesSearch instance.
     *
     * @param accessPoliciesSearch the instance to initialize the Builder with
     */
    private Builder(AccessPoliciesSearch accessPoliciesSearch) {
      this.resources = accessPoliciesSearch.resources;
      this.subjectsToSearch = accessPoliciesSearch.subjectsToSearch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AccessPoliciesSearch.
     *
     * @return the new AccessPoliciesSearch instance
     */
    public AccessPoliciesSearch build() {
      return new AccessPoliciesSearch(this);
    }

    /**
     * Adds a new element to resources.
     *
     * @param resources the new element to be added
     * @return the AccessPoliciesSearch builder
     */
    public Builder addResources(ResourceDetails resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<ResourceDetails>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Adds a new element to subjectsToSearch.
     *
     * @param subjectsToSearch the new element to be added
     * @return the AccessPoliciesSearch builder
     */
    public Builder addSubjectsToSearch(Subject subjectsToSearch) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subjectsToSearch,
        "subjectsToSearch cannot be null");
      if (this.subjectsToSearch == null) {
        this.subjectsToSearch = new ArrayList<Subject>();
      }
      this.subjectsToSearch.add(subjectsToSearch);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the AccessPoliciesSearch builder
     */
    public Builder resources(List<ResourceDetails> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the subjectsToSearch.
     * Existing subjectsToSearch will be replaced.
     *
     * @param subjectsToSearch the subjectsToSearch
     * @return the AccessPoliciesSearch builder
     */
    public Builder subjectsToSearch(List<Subject> subjectsToSearch) {
      this.subjectsToSearch = subjectsToSearch;
      return this;
    }
  }

  protected AccessPoliciesSearch() { }

  protected AccessPoliciesSearch(Builder builder) {
    resources = builder.resources;
    subjectsToSearch = builder.subjectsToSearch;
  }

  /**
   * New builder.
   *
   * @return a AccessPoliciesSearch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resources.
   *
   * List of resources to which the access policies should be applied.
   *
   * @return the resources
   */
  public List<ResourceDetails> resources() {
    return resources;
  }

  /**
   * Gets the subjectsToSearch.
   *
   * List of subjects (users and user groups) to which the access policy applies, along with the specified permissions.
   *
   * @return the subjectsToSearch
   */
  public List<Subject> subjectsToSearch() {
    return subjectsToSearch;
  }
}

