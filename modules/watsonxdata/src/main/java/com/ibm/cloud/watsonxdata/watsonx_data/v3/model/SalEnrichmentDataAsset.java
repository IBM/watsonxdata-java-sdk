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
 * SAL encrichmed asset in IKC associated with table in Watsonx.data.
 */
public class SalEnrichmentDataAsset extends GenericModel {

  protected List<String> attributes;
  protected String id;
  protected String name;
  @SerializedName("resource_key")
  protected String resourceKey;
  @SerializedName("schema_name")
  protected String schemaName;

  protected SalEnrichmentDataAsset() { }

  /**
   * Gets the attributes.
   *
   * attributes of the asset.
   *
   * @return the attributes
   */
  public List<String> getAttributes() {
    return attributes;
  }

  /**
   * Gets the id.
   *
   * data asset id in IKC.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * asset name (table name).
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceKey.
   *
   * unique resource name of IKC asset.
   *
   * @return the resourceKey
   */
  public String getResourceKey() {
    return resourceKey;
  }

  /**
   * Gets the schemaName.
   *
   * schema name.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }
}

