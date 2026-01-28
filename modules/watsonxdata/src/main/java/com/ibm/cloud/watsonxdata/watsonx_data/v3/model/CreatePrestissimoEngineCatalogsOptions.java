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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPrestissimoEngineCatalogs options.
 */
public class CreatePrestissimoEngineCatalogsOptions extends GenericModel {

  protected String id;
  protected List<String> catalogNames;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> catalogNames;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreatePrestissimoEngineCatalogsOptions instance.
     *
     * @param createPrestissimoEngineCatalogsOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions) {
      this.id = createPrestissimoEngineCatalogsOptions.id;
      this.catalogNames = createPrestissimoEngineCatalogsOptions.catalogNames;
      this.authInstanceId = createPrestissimoEngineCatalogsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param catalogNames the catalogNames
     */
    public Builder(String id, List<String> catalogNames) {
      this.id = id;
      this.catalogNames = catalogNames;
    }

    /**
     * Builds a CreatePrestissimoEngineCatalogsOptions.
     *
     * @return the new CreatePrestissimoEngineCatalogsOptions instance
     */
    public CreatePrestissimoEngineCatalogsOptions build() {
      return new CreatePrestissimoEngineCatalogsOptions(this);
    }

    /**
     * Adds a new element to catalogNames.
     *
     * @param catalogNames the new element to be added
     * @return the CreatePrestissimoEngineCatalogsOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the catalogNames.
     * Existing catalogNames will be replaced.
     *
     * @param catalogNames the catalogNames
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder catalogNames(List<String> catalogNames) {
      this.catalogNames = catalogNames;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreatePrestissimoEngineCatalogsOptions() { }

  protected CreatePrestissimoEngineCatalogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogNames,
      "catalogNames cannot be null");
    id = builder.id;
    catalogNames = builder.catalogNames;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreatePrestissimoEngineCatalogsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the catalogNames.
   *
   * Catalog names.
   *
   * @return the catalogNames
   */
  public List<String> catalogNames() {
    return catalogNames;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

