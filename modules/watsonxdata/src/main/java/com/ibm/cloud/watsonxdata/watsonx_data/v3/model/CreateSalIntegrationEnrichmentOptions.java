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
 * The createSalIntegrationEnrichment options.
 */
public class CreateSalIntegrationEnrichmentOptions extends GenericModel {

  protected List<EnrichmentObj> changes;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<EnrichmentObj> changes;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationEnrichmentOptions instance.
     *
     * @param createSalIntegrationEnrichmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
      this.changes = createSalIntegrationEnrichmentOptions.changes;
      this.authInstanceId = createSalIntegrationEnrichmentOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSalIntegrationEnrichmentOptions.
     *
     * @return the new CreateSalIntegrationEnrichmentOptions instance
     */
    public CreateSalIntegrationEnrichmentOptions build() {
      return new CreateSalIntegrationEnrichmentOptions(this);
    }

    /**
     * Adds a new element to changes.
     *
     * @param changes the new element to be added
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder addChanges(EnrichmentObj changes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(changes,
        "changes cannot be null");
      if (this.changes == null) {
        this.changes = new ArrayList<EnrichmentObj>();
      }
      this.changes.add(changes);
      return this;
    }

    /**
     * Set the changes.
     * Existing changes will be replaced.
     *
     * @param changes the changes
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder changes(List<EnrichmentObj> changes) {
      this.changes = changes;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSalIntegrationEnrichmentOptions() { }

  protected CreateSalIntegrationEnrichmentOptions(Builder builder) {
    changes = builder.changes;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationEnrichmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the changes.
   *
   * changed to be submitted and processed by the enrichment job.
   *
   * @return the changes
   */
  public List<EnrichmentObj> changes() {
    return changes;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

