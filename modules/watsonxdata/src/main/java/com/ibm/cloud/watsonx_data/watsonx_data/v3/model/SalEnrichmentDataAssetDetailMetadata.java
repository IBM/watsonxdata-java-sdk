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
 * data asset(table) metadata properties.
 */
public class SalEnrichmentDataAssetDetailMetadata extends GenericModel {

  protected String name;
  protected List<String> tags;

  protected SalEnrichmentDataAssetDetailMetadata() { }

  /**
   * Gets the name.
   *
   * table name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the tags.
   *
   * tags for table.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }
}

