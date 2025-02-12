/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadTableResponse.
 */
public class LoadTableResponse extends GenericModel {

  @SerializedName("metadata_location")
  protected String metadataLocation;
  @SerializedName("table_path")
  protected String tablePath;

  protected LoadTableResponse() { }

  /**
   * Gets the metadataLocation.
   *
   * Metadata location.
   *
   * @return the metadataLocation
   */
  public String getMetadataLocation() {
    return metadataLocation;
  }

  /**
   * Gets the tablePath.
   *
   * Path to the table.
   *
   * @return the tablePath
   */
  public String getTablePath() {
    return tablePath;
  }
}

