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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of catalogs associated with `ikc`.
 */
public class Catalogs extends GenericModel {

  @SerializedName("catalog_names")
  protected List<String> catalogNames;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> catalogNames;

    /**
     * Instantiates a new Builder from an existing Catalogs instance.
     *
     * @param catalogs the instance to initialize the Builder with
     */
    private Builder(Catalogs catalogs) {
      this.catalogNames = catalogs.catalogNames;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogNames the catalogNames
     */
    public Builder(List<String> catalogNames) {
      this.catalogNames = catalogNames;
    }

    /**
     * Builds a Catalogs.
     *
     * @return the new Catalogs instance
     */
    public Catalogs build() {
      return new Catalogs(this);
    }

    /**
     * Adds a new element to catalogNames.
     *
     * @param catalogNames the new element to be added
     * @return the Catalogs builder
     */
    public Builder addCatalogNames(String catalogNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogNames,
        "catalogNames cannot be null");
      if (this.catalogNames == null) {
        this.catalogNames = new ArrayList<String>();
      }
      this.catalogNames.add(catalogNames);
      return this;
    }

    /**
     * Set the catalogNames.
     * Existing catalogNames will be replaced.
     *
     * @param catalogNames the catalogNames
     * @return the Catalogs builder
     */
    public Builder catalogNames(List<String> catalogNames) {
      this.catalogNames = catalogNames;
      return this;
    }
  }

  protected Catalogs() { }

  protected Catalogs(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogNames,
      "catalogNames cannot be null");
    catalogNames = builder.catalogNames;
  }

  /**
   * New builder.
   *
   * @return a Catalogs builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogNames.
   *
   * Comma separated list of catalogs for which `ikc` needs to be enabled.
   *
   * @return the catalogNames
   */
  public List<String> catalogNames() {
    return catalogNames;
  }
}

