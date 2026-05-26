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
 * The object includes subjects (users and user groups) whose permissions need to be revoked.
 */
public class SubjectRevoke extends GenericModel {

  protected List<String> permissions;
  protected Subject subject;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> permissions;
    private Subject subject;

    /**
     * Instantiates a new Builder from an existing SubjectRevoke instance.
     *
     * @param subjectRevoke the instance to initialize the Builder with
     */
    private Builder(SubjectRevoke subjectRevoke) {
      this.permissions = subjectRevoke.permissions;
      this.subject = subjectRevoke.subject;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubjectRevoke.
     *
     * @return the new SubjectRevoke instance
     */
    public SubjectRevoke build() {
      return new SubjectRevoke(this);
    }

    /**
     * Adds a new element to permissions.
     *
     * @param permissions the new element to be added
     * @return the SubjectRevoke builder
     */
    public Builder addPermissions(String permissions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(permissions,
        "permissions cannot be null");
      if (this.permissions == null) {
        this.permissions = new ArrayList<String>();
      }
      this.permissions.add(permissions);
      return this;
    }

    /**
     * Set the permissions.
     * Existing permissions will be replaced.
     *
     * @param permissions the permissions
     * @return the SubjectRevoke builder
     */
    public Builder permissions(List<String> permissions) {
      this.permissions = permissions;
      return this;
    }

    /**
     * Set the subject.
     *
     * @param subject the subject
     * @return the SubjectRevoke builder
     */
    public Builder subject(Subject subject) {
      this.subject = subject;
      return this;
    }
  }

  protected SubjectRevoke() { }

  protected SubjectRevoke(Builder builder) {
    permissions = builder.permissions;
    subject = builder.subject;
  }

  /**
   * New builder.
   *
   * @return a SubjectRevoke builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the permissions.
   *
   * the permissions to be revoked for the given user or group on the provided resource.
   *
   * @return the permissions
   */
  public List<String> permissions() {
    return permissions;
  }

  /**
   * Gets the subject.
   *
   * subject can be user or group who can access on the provided resource.
   *
   * @return the subject
   */
  public Subject subject() {
    return subject;
  }
}

