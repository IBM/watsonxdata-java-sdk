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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of SAL Mapping details of given watsonx.data schemas.
 */
public class SalIntegrationMappings extends GenericModel {

  protected List<SalIntegrationMappingObj> mappings;
  protected String next;

  protected SalIntegrationMappings() { }

  /**
   * Gets the mappings.
   *
   * list of results as sal maapping in Watsonx.data vs Watsonx.data Intelligence metadata.
   *
   * @return the mappings
   */
  public List<SalIntegrationMappingObj> getMappings() {
    return mappings;
  }

  /**
   * Gets the next.
   *
   * reference for next part of the query results (if results number exceed 100).
   *
   * @return the next
   */
  public String getNext() {
    return next;
  }
}

