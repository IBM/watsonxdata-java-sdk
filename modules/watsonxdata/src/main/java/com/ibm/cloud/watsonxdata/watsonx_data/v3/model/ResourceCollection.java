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
 * Get Milvus Service Detail for target type = cpd.
 */
public class ResourceCollection extends GenericModel {

  protected List<Resource> details;
  protected String type;

  protected ResourceCollection() { }

  /**
   * Gets the details.
   *
   * List of engines or services details.
   *
   * @return the details
   */
  public List<Resource> getDetails() {
    return details;
  }

  /**
   * Gets the type.
   *
   * Type of engine/service.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

