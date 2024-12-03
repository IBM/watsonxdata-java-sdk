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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List endpoints.
 */
public class EndpointCollection extends GenericModel {

  protected List<Endpoint> endpoints;

  protected EndpointCollection() { }

  /**
   * Gets the endpoints.
   *
   * List of the endpoints CPG and CAS.
   *
   * @return the endpoints
   */
  public List<Endpoint> getEndpoints() {
    return endpoints;
  }
}

