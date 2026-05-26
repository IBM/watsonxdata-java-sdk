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
 * The createDataPolicy options.
 */
public class CreateDataPolicyOptions extends GenericModel {

  /**
   * status of data policy. Values can be active or inactive.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  protected String dataArtifact;
  protected List<RuleV2> rules;
  protected String catalogName;
  protected String catalogType;
  protected String description;
  protected String policyName;
  protected String resourceId;
  protected String status;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataArtifact;
    private List<RuleV2> rules;
    private String catalogName;
    private String catalogType;
    private String description;
    private String policyName;
    private String resourceId;
    private String status;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDataPolicyOptions instance.
     *
     * @param createDataPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataPolicyOptions createDataPolicyOptions) {
      this.dataArtifact = createDataPolicyOptions.dataArtifact;
      this.rules = createDataPolicyOptions.rules;
      this.catalogName = createDataPolicyOptions.catalogName;
      this.catalogType = createDataPolicyOptions.catalogType;
      this.description = createDataPolicyOptions.description;
      this.policyName = createDataPolicyOptions.policyName;
      this.resourceId = createDataPolicyOptions.resourceId;
      this.status = createDataPolicyOptions.status;
      this.authInstanceId = createDataPolicyOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataArtifact the dataArtifact
     * @param rules the rules
     */
    public Builder(String dataArtifact, List<RuleV2> rules) {
      this.dataArtifact = dataArtifact;
      this.rules = rules;
    }

    /**
     * Builds a CreateDataPolicyOptions.
     *
     * @return the new CreateDataPolicyOptions instance
     */
    public CreateDataPolicyOptions build() {
      return new CreateDataPolicyOptions(this);
    }

    /**
     * Adds a new element to rules.
     *
     * @param rules the new element to be added
     * @return the CreateDataPolicyOptions builder
     */
    public Builder addRules(RuleV2 rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<RuleV2>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the dataArtifact.
     *
     * @param dataArtifact the dataArtifact
     * @return the CreateDataPolicyOptions builder
     */
    public Builder dataArtifact(String dataArtifact) {
      this.dataArtifact = dataArtifact;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the CreateDataPolicyOptions builder
     */
    public Builder rules(List<RuleV2> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateDataPolicyOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the CreateDataPolicyOptions builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDataPolicyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the policyName.
     *
     * @param policyName the policyName
     * @return the CreateDataPolicyOptions builder
     */
    public Builder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    /**
     * Set the resourceId.
     *
     * @param resourceId the resourceId
     * @return the CreateDataPolicyOptions builder
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the CreateDataPolicyOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDataPolicyOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateDataPolicyOptions() { }

  protected CreateDataPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataArtifact,
      "dataArtifact cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    dataArtifact = builder.dataArtifact;
    rules = builder.rules;
    catalogName = builder.catalogName;
    catalogType = builder.catalogType;
    description = builder.description;
    policyName = builder.policyName;
    resourceId = builder.resourceId;
    status = builder.status;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDataPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataArtifact.
   *
   * The data artifact provides the full path of the resource to which the data policy applies.
   *
   * @return the dataArtifact
   */
  public String dataArtifact() {
    return dataArtifact;
  }

  /**
   * Gets the rules.
   *
   * rules is the array RuleV2. RuleV2 contains the effect, actions and grantees.
   *
   * @return the rules
   */
  public List<RuleV2> rules() {
    return rules;
  }

  /**
   * Gets the catalogName.
   *
   * name of the catalog in which the data policy resource is residing.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogType.
   *
   * type of the catalog in which the data policy resource is residing.
   *
   * @return the catalogType
   */
  public String catalogType() {
    return catalogType;
  }

  /**
   * Gets the description.
   *
   * a more detailed description of the policy.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the policyName.
   *
   * The unique name of the data policy.It should be in a given pattern.
   *
   * @return the policyName
   */
  public String policyName() {
    return policyName;
  }

  /**
   * Gets the resourceId.
   *
   * identifier of the resource on which the data policy is created on.
   *
   * @return the resourceId
   */
  public String resourceId() {
    return resourceId;
  }

  /**
   * Gets the status.
   *
   * status of data policy. Values can be active or inactive.
   *
   * @return the status
   */
  public String status() {
    return status;
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

