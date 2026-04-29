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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * This resource details contain resource type and resource id or name.
 */
public class ResourceDetailsBulkUpdate extends GenericModel {

  /**
   * Type of resource.
   */
  public interface Type {
    /** catalog. */
    String CATALOG = "catalog";
    /** storage. */
    String STORAGE = "storage";
    /** presto. */
    String PRESTO = "presto";
    /** database. */
    String DATABASE = "database";
    /** prestissimo. */
    String PRESTISSIMO = "prestissimo";
    /** milvus. */
    String MILVUS = "milvus";
    /** spark. */
    String SPARK = "spark";
    /** datastax. */
    String DATASTAX = "datastax";
  }

  protected String id;
  protected String name;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String type;

    /**
     * Instantiates a new Builder from an existing ResourceDetailsBulkUpdate instance.
     *
     * @param resourceDetailsBulkUpdate the instance to initialize the Builder with
     */
    private Builder(ResourceDetailsBulkUpdate resourceDetailsBulkUpdate) {
      this.id = resourceDetailsBulkUpdate.id;
      this.name = resourceDetailsBulkUpdate.name;
      this.type = resourceDetailsBulkUpdate.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a ResourceDetailsBulkUpdate.
     *
     * @return the new ResourceDetailsBulkUpdate instance
     */
    public ResourceDetailsBulkUpdate build() {
      return new ResourceDetailsBulkUpdate(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ResourceDetailsBulkUpdate builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ResourceDetailsBulkUpdate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ResourceDetailsBulkUpdate builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected ResourceDetailsBulkUpdate() { }

  protected ResourceDetailsBulkUpdate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    name = builder.name;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a ResourceDetailsBulkUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Identifier of the resource.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the resource.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Type of resource.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

