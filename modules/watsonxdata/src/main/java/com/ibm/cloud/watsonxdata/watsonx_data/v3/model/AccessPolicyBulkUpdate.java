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
 * Add or update the access permissions of the specified users and user groups on the provided resource.
 */
public class AccessPolicyBulkUpdate extends GenericModel {

  protected List<ResourceDetailsBulkUpdate> resources;
  protected List<SubjectBulkUpdate> subjects;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourceDetailsBulkUpdate> resources;
    private List<SubjectBulkUpdate> subjects;

    /**
     * Instantiates a new Builder from an existing AccessPolicyBulkUpdate instance.
     *
     * @param accessPolicyBulkUpdate the instance to initialize the Builder with
     */
    private Builder(AccessPolicyBulkUpdate accessPolicyBulkUpdate) {
      this.resources = accessPolicyBulkUpdate.resources;
      this.subjects = accessPolicyBulkUpdate.subjects;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AccessPolicyBulkUpdate.
     *
     * @return the new AccessPolicyBulkUpdate instance
     */
    public AccessPolicyBulkUpdate build() {
      return new AccessPolicyBulkUpdate(this);
    }

    /**
     * Adds a new element to resources.
     *
     * @param resources the new element to be added
     * @return the AccessPolicyBulkUpdate builder
     */
    public Builder addResources(ResourceDetailsBulkUpdate resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<ResourceDetailsBulkUpdate>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Adds a new element to subjects.
     *
     * @param subjects the new element to be added
     * @return the AccessPolicyBulkUpdate builder
     */
    public Builder addSubjects(SubjectBulkUpdate subjects) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subjects,
        "subjects cannot be null");
      if (this.subjects == null) {
        this.subjects = new ArrayList<SubjectBulkUpdate>();
      }
      this.subjects.add(subjects);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the AccessPolicyBulkUpdate builder
     */
    public Builder resources(List<ResourceDetailsBulkUpdate> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the subjects.
     * Existing subjects will be replaced.
     *
     * @param subjects the subjects
     * @return the AccessPolicyBulkUpdate builder
     */
    public Builder subjects(List<SubjectBulkUpdate> subjects) {
      this.subjects = subjects;
      return this;
    }
  }

  protected AccessPolicyBulkUpdate() { }

  protected AccessPolicyBulkUpdate(Builder builder) {
    resources = builder.resources;
    subjects = builder.subjects;
  }

  /**
   * New builder.
   *
   * @return a AccessPolicyBulkUpdate builder
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
  public List<ResourceDetailsBulkUpdate> resources() {
    return resources;
  }

  /**
   * Gets the subjects.
   *
   * List of subjects (users and user groups) to which the access policy applies, along with the specified permissions.
   *
   * @return the subjects
   */
  public List<SubjectBulkUpdate> subjects() {
    return subjects;
  }
}

