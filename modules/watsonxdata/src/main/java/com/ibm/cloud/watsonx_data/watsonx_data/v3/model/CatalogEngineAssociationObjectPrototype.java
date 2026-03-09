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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Define the catalog details.
 */
public class CatalogEngineAssociationObjectPrototype extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("engine_id")
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing CatalogEngineAssociationObjectPrototype instance.
     *
     * @param catalogEngineAssociationObjectPrototype the instance to initialize the Builder with
     */
    private Builder(CatalogEngineAssociationObjectPrototype catalogEngineAssociationObjectPrototype) {
      this.catalogName = catalogEngineAssociationObjectPrototype.catalogName;
      this.engineId = catalogEngineAssociationObjectPrototype.engineId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CatalogEngineAssociationObjectPrototype.
     *
     * @return the new CatalogEngineAssociationObjectPrototype instance
     */
    public CatalogEngineAssociationObjectPrototype build() {
      return new CatalogEngineAssociationObjectPrototype(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CatalogEngineAssociationObjectPrototype builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CatalogEngineAssociationObjectPrototype builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }
  }

  protected CatalogEngineAssociationObjectPrototype() { }

  protected CatalogEngineAssociationObjectPrototype(Builder builder) {
    catalogName = builder.catalogName;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a CatalogEngineAssociationObjectPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the engineId.
   *
   * Engine Id associated to a catalog.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }
}

