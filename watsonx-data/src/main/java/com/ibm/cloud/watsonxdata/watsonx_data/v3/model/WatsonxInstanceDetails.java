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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List all Instance Details.
 */
public class WatsonxInstanceDetails extends GenericModel {

  protected List<ResourceCollection> resources;
  @SerializedName("watsonx_data_instance")
  protected Resource watsonxDataInstance;

  protected WatsonxInstanceDetails() { }

  /**
   * Gets the resources.
   *
   * Engines and Services.
   *
   * @return the resources
   */
  public List<ResourceCollection> getResources() {
    return resources;
  }

  /**
   * Gets the watsonxDataInstance.
   *
   * Watsonx Instance Details.
   *
   * @return the watsonxDataInstance
   */
  public Resource getWatsonxDataInstance() {
    return watsonxDataInstance;
  }
}

