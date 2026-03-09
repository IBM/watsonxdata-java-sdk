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
public class CatalogEngineAssociationPatchObjectPrototype extends GenericModel {

  protected String action;
  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("engine_id")
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String catalogName;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing CatalogEngineAssociationPatchObjectPrototype instance.
     *
     * @param catalogEngineAssociationPatchObjectPrototype the instance to initialize the Builder with
     */
    private Builder(CatalogEngineAssociationPatchObjectPrototype catalogEngineAssociationPatchObjectPrototype) {
      this.action = catalogEngineAssociationPatchObjectPrototype.action;
      this.catalogName = catalogEngineAssociationPatchObjectPrototype.catalogName;
      this.engineId = catalogEngineAssociationPatchObjectPrototype.engineId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CatalogEngineAssociationPatchObjectPrototype.
     *
     * @return the new CatalogEngineAssociationPatchObjectPrototype instance
     */
    public CatalogEngineAssociationPatchObjectPrototype build() {
      return new CatalogEngineAssociationPatchObjectPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CatalogEngineAssociationPatchObjectPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CatalogEngineAssociationPatchObjectPrototype builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CatalogEngineAssociationPatchObjectPrototype builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }
  }

  protected CatalogEngineAssociationPatchObjectPrototype() { }

  protected CatalogEngineAssociationPatchObjectPrototype(Builder builder) {
    action = builder.action;
    catalogName = builder.catalogName;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a CatalogEngineAssociationPatchObjectPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * Action to be associated with catalog.
   *
   * @return the action
   */
  public String action() {
    return action;
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

