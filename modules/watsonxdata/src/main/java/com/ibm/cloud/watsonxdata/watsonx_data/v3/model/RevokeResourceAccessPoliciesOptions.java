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
 * The revokeResourceAccessPolicies options.
 */
public class RevokeResourceAccessPoliciesOptions extends GenericModel {

  protected List<ResourceDetails> resources;
  protected List<SubjectRevoke> subjects;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourceDetails> resources;
    private List<SubjectRevoke> subjects;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RevokeResourceAccessPoliciesOptions instance.
     *
     * @param revokeResourceAccessPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(RevokeResourceAccessPoliciesOptions revokeResourceAccessPoliciesOptions) {
      this.resources = revokeResourceAccessPoliciesOptions.resources;
      this.subjects = revokeResourceAccessPoliciesOptions.subjects;
      this.authInstanceId = revokeResourceAccessPoliciesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RevokeResourceAccessPoliciesOptions.
     *
     * @return the new RevokeResourceAccessPoliciesOptions instance
     */
    public RevokeResourceAccessPoliciesOptions build() {
      return new RevokeResourceAccessPoliciesOptions(this);
    }

    /**
     * Adds a new element to resources.
     *
     * @param resources the new element to be added
     * @return the RevokeResourceAccessPoliciesOptions builder
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
     * Adds a new element to subjects.
     *
     * @param subjects the new element to be added
     * @return the RevokeResourceAccessPoliciesOptions builder
     */
    public Builder addSubjects(SubjectRevoke subjects) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subjects,
        "subjects cannot be null");
      if (this.subjects == null) {
        this.subjects = new ArrayList<SubjectRevoke>();
      }
      this.subjects.add(subjects);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the RevokeResourceAccessPoliciesOptions builder
     */
    public Builder resources(List<ResourceDetails> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the subjects.
     * Existing subjects will be replaced.
     *
     * @param subjects the subjects
     * @return the RevokeResourceAccessPoliciesOptions builder
     */
    public Builder subjects(List<SubjectRevoke> subjects) {
      this.subjects = subjects;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RevokeResourceAccessPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RevokeResourceAccessPoliciesOptions() { }

  protected RevokeResourceAccessPoliciesOptions(Builder builder) {
    resources = builder.resources;
    subjects = builder.subjects;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RevokeResourceAccessPoliciesOptions builder
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
   * Gets the subjects.
   *
   * List of subjects (users and user groups) to which the access policy applies, along with the specified permissions.
   *
   * @return the subjects
   */
  public List<SubjectRevoke> subjects() {
    return subjects;
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

