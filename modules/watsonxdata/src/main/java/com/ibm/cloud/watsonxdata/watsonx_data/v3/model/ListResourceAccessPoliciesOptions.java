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
 * The listResourceAccessPolicies options.
 */
public class ListResourceAccessPoliciesOptions extends GenericModel {

  /**
   * Specifies the type of watsonx.data resource for which to retrieve access policies. Valid resource types include:
   * 'catalog', 'database', 'storage', 'presto', 'prestissimo', 'spark', 'milvus', and 'datastax'.
   */
  public interface ResourceType {
    /** catalog. */
    String CATALOG = "catalog";
    /** database. */
    String DATABASE = "database";
    /** storage. */
    String STORAGE = "storage";
    /** presto. */
    String PRESTO = "presto";
    /** prestissimo. */
    String PRESTISSIMO = "prestissimo";
    /** spark. */
    String SPARK = "spark";
    /** milvus. */
    String MILVUS = "milvus";
    /** datastax. */
    String DATASTAX = "datastax";
  }

  protected String authInstanceId;
  protected String resourceType;
  protected List<String> resourceId;
  protected List<String> resourceName;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String resourceType;
    private List<String> resourceId;
    private List<String> resourceName;

    /**
     * Instantiates a new Builder from an existing ListResourceAccessPoliciesOptions instance.
     *
     * @param listResourceAccessPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(ListResourceAccessPoliciesOptions listResourceAccessPoliciesOptions) {
      this.authInstanceId = listResourceAccessPoliciesOptions.authInstanceId;
      this.resourceType = listResourceAccessPoliciesOptions.resourceType;
      this.resourceId = listResourceAccessPoliciesOptions.resourceId;
      this.resourceName = listResourceAccessPoliciesOptions.resourceName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListResourceAccessPoliciesOptions.
     *
     * @return the new ListResourceAccessPoliciesOptions instance
     */
    public ListResourceAccessPoliciesOptions build() {
      return new ListResourceAccessPoliciesOptions(this);
    }

    /**
     * Adds a new element to resourceId.
     *
     * @param resourceId the new element to be added
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder addResourceId(String resourceId) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceId,
        "resourceId cannot be null");
      if (this.resourceId == null) {
        this.resourceId = new ArrayList<String>();
      }
      this.resourceId.add(resourceId);
      return this;
    }

    /**
     * Adds a new element to resourceName.
     *
     * @param resourceName the new element to be added
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder addResourceName(String resourceName) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resourceName,
        "resourceName cannot be null");
      if (this.resourceName == null) {
        this.resourceName = new ArrayList<String>();
      }
      this.resourceName.add(resourceName);
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * Set the resourceId.
     * Existing resourceId will be replaced.
     *
     * @param resourceId the resourceId
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder resourceId(List<String> resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the resourceName.
     * Existing resourceName will be replaced.
     *
     * @param resourceName the resourceName
     * @return the ListResourceAccessPoliciesOptions builder
     */
    public Builder resourceName(List<String> resourceName) {
      this.resourceName = resourceName;
      return this;
    }
  }

  protected ListResourceAccessPoliciesOptions() { }

  protected ListResourceAccessPoliciesOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
    resourceType = builder.resourceType;
    resourceId = builder.resourceId;
    resourceName = builder.resourceName;
  }

  /**
   * New builder.
   *
   * @return a ListResourceAccessPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authInstanceId.
   *
   * The unique identifier for your watsonx.data instance.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the resourceType.
   *
   * Specifies the type of watsonx.data resource for which to retrieve access policies. Valid resource types include:
   * 'catalog', 'database', 'storage', 'presto', 'prestissimo', 'spark', 'milvus', and 'datastax'.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }

  /**
   * Gets the resourceId.
   *
   * An array of resource identifiers to filter access policies. Specify one or more resource IDs (up to 10) to retrieve
   * policies for specific resources. Resource IDs are applicable for resource types: 'presto', 'prestissimo', 'spark',
   * 'milvus', 'storage', and 'database'.
   *
   * @return the resourceId
   */
  public List<String> resourceId() {
    return resourceId;
  }

  /**
   * Gets the resourceName.
   *
   * An array of resource names to filter access policies. Specify one or more resource names (up to 10) to retrieve
   * policies for specific catalog resources. This parameter is primarily used when the resource_type is 'catalog'.
   *
   * @return the resourceName
   */
  public List<String> resourceName() {
    return resourceName;
  }
}

