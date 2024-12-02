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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Catalog settings.
 */
public class PrestissimoEnginePropertiesCatalog extends GenericModel {

  @SerializedName("catalog_name")
  protected List<String> catalogName;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> catalogName;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePropertiesCatalog instance.
     *
     * @param prestissimoEnginePropertiesCatalog the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePropertiesCatalog prestissimoEnginePropertiesCatalog) {
      this.catalogName = prestissimoEnginePropertiesCatalog.catalogName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePropertiesCatalog.
     *
     * @return the new PrestissimoEnginePropertiesCatalog instance
     */
    public PrestissimoEnginePropertiesCatalog build() {
      return new PrestissimoEnginePropertiesCatalog(this);
    }

    /**
     * Adds a new element to catalogName.
     *
     * @param catalogName the new element to be added
     * @return the PrestissimoEnginePropertiesCatalog builder
     */
    public Builder addCatalogName(String catalogName) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogName,
        "catalogName cannot be null");
      if (this.catalogName == null) {
        this.catalogName = new ArrayList<String>();
      }
      this.catalogName.add(catalogName);
      return this;
    }

    /**
     * Set the catalogName.
     * Existing catalogName will be replaced.
     *
     * @param catalogName the catalogName
     * @return the PrestissimoEnginePropertiesCatalog builder
     */
    public Builder catalogName(List<String> catalogName) {
      this.catalogName = catalogName;
      return this;
    }
  }

  protected PrestissimoEnginePropertiesCatalog() { }

  protected PrestissimoEnginePropertiesCatalog(Builder builder) {
    catalogName = builder.catalogName;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePropertiesCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public List<String> catalogName() {
    return catalogName;
  }
}

