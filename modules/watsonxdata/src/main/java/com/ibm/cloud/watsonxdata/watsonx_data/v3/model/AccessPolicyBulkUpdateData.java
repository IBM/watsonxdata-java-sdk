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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * access policy details of the provided resource type and resource id or name. This details include metadata,
 * permissions, resource, state and subject.
 */
public class AccessPolicyBulkUpdateData extends GenericModel {

  /**
   * state of each policy. It can be either active or inactive.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  protected Metadata metadata;
  protected List<Permission> permissions;
  protected ResourceDetailsBulkUpdate resource;
  protected String state;
  protected SubjectBulkUpdateData subject;

  protected AccessPolicyBulkUpdateData() { }

  /**
   * Gets the metadata.
   *
   * metadata of each access policy such as created at, created by, last modified at and last modified by.
   *
   * @return the metadata
   */
  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * Gets the permissions.
   *
   * the permissions the given user or group has, on the provided resource.
   *
   * @return the permissions
   */
  public List<Permission> getPermissions() {
    return permissions;
  }

  /**
   * Gets the resource.
   *
   * This resource details contain resource type and resource id or name.
   *
   * @return the resource
   */
  public ResourceDetailsBulkUpdate getResource() {
    return resource;
  }

  /**
   * Gets the state.
   *
   * state of each policy. It can be either active or inactive.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the subject.
   *
   * subject can be user or group who can access on the provided resource.
   *
   * @return the subject
   */
  public SubjectBulkUpdateData getSubject() {
    return subject;
  }
}

