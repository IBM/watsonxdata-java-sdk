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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Catalog settings.
 */
public class PrestoEnginePropertiesCatalog extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePropertiesCatalog instance.
     *
     * @param prestoEnginePropertiesCatalog the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalog) {
      this.catalogName = prestoEnginePropertiesCatalog.catalogName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePropertiesCatalog.
     *
     * @return the new PrestoEnginePropertiesCatalog instance
     */
    public PrestoEnginePropertiesCatalog build() {
      return new PrestoEnginePropertiesCatalog(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the PrestoEnginePropertiesCatalog builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }
  }

  protected PrestoEnginePropertiesCatalog() { }

  protected PrestoEnginePropertiesCatalog(Builder builder) {
    catalogName = builder.catalogName;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePropertiesCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Name of the catalog.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }
}

