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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List ingestion jobs.
 */
public class IngestionJobCollection extends GenericModel {

  @SerializedName("ingestion_jobs")
  protected List<IngestionJob> ingestionJobs;
  protected IngestionJobCollectionPage first;
  protected IngestionJobCollectionPage next;

  protected IngestionJobCollection() { }

  /**
   * Gets the ingestionJobs.
   *
   * Ingestion jobs.
   *
   * @return the ingestionJobs
   */
  public List<IngestionJob> getIngestionJobs() {
    return ingestionJobs;
  }

  /**
   * Gets the first.
   *
   * A page in a pagination collection.
   *
   * @return the first
   */
  public IngestionJobCollectionPage getFirst() {
    return first;
  }

  /**
   * Gets the next.
   *
   * A page in a pagination collection.
   *
   * @return the next
   */
  public IngestionJobCollectionPage getNext() {
    return next;
  }
}

