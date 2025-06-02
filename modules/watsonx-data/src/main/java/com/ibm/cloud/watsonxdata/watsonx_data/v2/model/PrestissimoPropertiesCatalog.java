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
 * Catalog settings.
 */
public class PrestissimoPropertiesCatalog extends GenericModel {

  @SerializedName("catalog_name")
  protected EnginePropertiesCatalog catalogName;

  /**
   * Builder.
   */
  public static class Builder {
    private EnginePropertiesCatalog catalogName;

    /**
     * Instantiates a new Builder from an existing PrestissimoPropertiesCatalog instance.
     *
     * @param prestissimoPropertiesCatalog the instance to initialize the Builder with
     */
    private Builder(PrestissimoPropertiesCatalog prestissimoPropertiesCatalog) {
      this.catalogName = prestissimoPropertiesCatalog.catalogName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoPropertiesCatalog.
     *
     * @return the new PrestissimoPropertiesCatalog instance
     */
    public PrestissimoPropertiesCatalog build() {
      return new PrestissimoPropertiesCatalog(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the PrestissimoPropertiesCatalog builder
     */
    public Builder catalogName(EnginePropertiesCatalog catalogName) {
      this.catalogName = catalogName;
      return this;
    }
  }

  protected PrestissimoPropertiesCatalog() { }

  protected PrestissimoPropertiesCatalog(Builder builder) {
    catalogName = builder.catalogName;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoPropertiesCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog settings.
   *
   * @return the catalogName
   */
  public EnginePropertiesCatalog catalogName() {
    return catalogName;
  }
}

