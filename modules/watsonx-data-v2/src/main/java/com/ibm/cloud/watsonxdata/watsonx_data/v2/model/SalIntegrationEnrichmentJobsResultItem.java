/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single result item containing entity and metadata.
 */
public class SalIntegrationEnrichmentJobsResultItem extends GenericModel {

  protected SalIntegrationEnrichmentJobsResultItemEntity entity;
  protected SalIntegrationEnrichmentJobsResultItemMetadata metadata;

  protected SalIntegrationEnrichmentJobsResultItem() { }

  /**
   * Gets the entity.
   *
   * Entity details including job information.
   *
   * @return the entity
   */
  public SalIntegrationEnrichmentJobsResultItemEntity getEntity() {
    return entity;
  }

  /**
   * Gets the metadata.
   *
   * Metadata information about the job.
   *
   * @return the metadata
   */
  public SalIntegrationEnrichmentJobsResultItemMetadata getMetadata() {
    return metadata;
  }
}

