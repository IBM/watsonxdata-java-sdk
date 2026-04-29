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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataPolicies options.
 */
public class ListDataPoliciesOptions extends GenericModel {

  protected String authInstanceId;
  protected String catalogName;
  protected String resourceId;
  protected String status;
  protected Boolean includeMetadata;
  protected Boolean includeRules;
  protected String bucketName;
  protected String serviceName;
  protected String dataArtifact;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String catalogName;
    private String resourceId;
    private String status;
    private Boolean includeMetadata;
    private Boolean includeRules;
    private String bucketName;
    private String serviceName;
    private String dataArtifact;

    /**
     * Instantiates a new Builder from an existing ListDataPoliciesOptions instance.
     *
     * @param listDataPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(ListDataPoliciesOptions listDataPoliciesOptions) {
      this.authInstanceId = listDataPoliciesOptions.authInstanceId;
      this.catalogName = listDataPoliciesOptions.catalogName;
      this.resourceId = listDataPoliciesOptions.resourceId;
      this.status = listDataPoliciesOptions.status;
      this.includeMetadata = listDataPoliciesOptions.includeMetadata;
      this.includeRules = listDataPoliciesOptions.includeRules;
      this.bucketName = listDataPoliciesOptions.bucketName;
      this.serviceName = listDataPoliciesOptions.serviceName;
      this.dataArtifact = listDataPoliciesOptions.dataArtifact;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataPoliciesOptions.
     *
     * @return the new ListDataPoliciesOptions instance
     */
    public ListDataPoliciesOptions build() {
      return new ListDataPoliciesOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListDataPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListDataPoliciesOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the resourceId.
     *
     * @param resourceId the resourceId
     * @return the ListDataPoliciesOptions builder
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListDataPoliciesOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the includeMetadata.
     *
     * @param includeMetadata the includeMetadata
     * @return the ListDataPoliciesOptions builder
     */
    public Builder includeMetadata(Boolean includeMetadata) {
      this.includeMetadata = includeMetadata;
      return this;
    }

    /**
     * Set the includeRules.
     *
     * @param includeRules the includeRules
     * @return the ListDataPoliciesOptions builder
     */
    public Builder includeRules(Boolean includeRules) {
      this.includeRules = includeRules;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the ListDataPoliciesOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the serviceName.
     *
     * @param serviceName the serviceName
     * @return the ListDataPoliciesOptions builder
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Set the dataArtifact.
     *
     * @param dataArtifact the dataArtifact
     * @return the ListDataPoliciesOptions builder
     */
    public Builder dataArtifact(String dataArtifact) {
      this.dataArtifact = dataArtifact;
      return this;
    }
  }

  protected ListDataPoliciesOptions() { }

  protected ListDataPoliciesOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
    catalogName = builder.catalogName;
    resourceId = builder.resourceId;
    status = builder.status;
    includeMetadata = builder.includeMetadata;
    includeRules = builder.includeRules;
    bucketName = builder.bucketName;
    serviceName = builder.serviceName;
    dataArtifact = builder.dataArtifact;
  }

  /**
   * New builder.
   *
   * @return a ListDataPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the catalogName.
   *
   * name of catalog as query param to filter the data polciies.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the resourceId.
   *
   * resource identifier as query param to filter the data policies.
   *
   * @return the resourceId
   */
  public String resourceId() {
    return resourceId;
  }

  /**
   * Gets the status.
   *
   * policy status as query param to filter the data policies.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the includeMetadata.
   *
   * include_metadata is a boolean query param which can be set as true if metadata policy is needed in response of get
   * data policies else set it as false.
   *
   * @return the includeMetadata
   */
  public Boolean includeMetadata() {
    return includeMetadata;
  }

  /**
   * Gets the includeRules.
   *
   * include_rules is a boolean query param which can be set as true if rules are needed in response of get data
   * policies else set it as false.
   *
   * @return the includeRules
   */
  public Boolean includeRules() {
    return includeRules;
  }

  /**
   * Gets the bucketName.
   *
   * Bucket Name is a qualified name of a storage bucket . It is of the format `bucket name`. Specify `bucket_name`
   * along with `data_artifact` to fetch policy for a bucket applicable to a data artifact.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the serviceName.
   *
   * Service Name is a qualified name of a service used . It is of the format `service name`. Specify `service_name`
   * along with `data_artifact` to fetch policy for a service applicable to a data artifact.
   *
   * @return the serviceName
   */
  public String serviceName() {
    return serviceName;
  }

  /**
   * Gets the dataArtifact.
   *
   * Data Artifact is a fully qualified table name . It is of the format `schema name:table name`. Specify
   * `catalog_name` along with `data_artifact` to fetch policy applicable to a data artifact.
   *
   * @return the dataArtifact
   */
  public String dataArtifact() {
    return dataArtifact;
  }
}

