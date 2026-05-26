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
 * The createIngestionJob options.
 */
public class CreateIngestionJobOptions extends GenericModel {

  protected String authInstanceId;
  protected String id;
  protected SourceDetails source;
  protected TargetDetails target;
  protected IngestionEngine engine;
  protected String engineId;
  protected ExecuteConfig executeConfig;
  protected IcebergSourceTable sourceIcebergTable;
  protected String partitionBy;
  protected CapacityDetails capacity;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String id;
    private SourceDetails source;
    private TargetDetails target;
    private IngestionEngine engine;
    private String engineId;
    private ExecuteConfig executeConfig;
    private IcebergSourceTable sourceIcebergTable;
    private String partitionBy;
    private CapacityDetails capacity;

    /**
     * Instantiates a new Builder from an existing CreateIngestionJobOptions instance.
     *
     * @param createIngestionJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateIngestionJobOptions createIngestionJobOptions) {
      this.authInstanceId = createIngestionJobOptions.authInstanceId;
      this.id = createIngestionJobOptions.id;
      this.source = createIngestionJobOptions.source;
      this.target = createIngestionJobOptions.target;
      this.engine = createIngestionJobOptions.engine;
      this.engineId = createIngestionJobOptions.engineId;
      this.executeConfig = createIngestionJobOptions.executeConfig;
      this.sourceIcebergTable = createIngestionJobOptions.sourceIcebergTable;
      this.partitionBy = createIngestionJobOptions.partitionBy;
      this.capacity = createIngestionJobOptions.capacity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authInstanceId the authInstanceId
     * @param id the id
     * @param source the source
     * @param target the target
     */
    public Builder(String authInstanceId, String id, SourceDetails source, TargetDetails target) {
      this.authInstanceId = authInstanceId;
      this.id = id;
      this.source = source;
      this.target = target;
    }

    /**
     * Builds a CreateIngestionJobOptions.
     *
     * @return the new CreateIngestionJobOptions instance
     */
    public CreateIngestionJobOptions build() {
      return new CreateIngestionJobOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateIngestionJobOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateIngestionJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateIngestionJobOptions builder
     */
    public Builder source(SourceDetails source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateIngestionJobOptions builder
     */
    public Builder target(TargetDetails target) {
      this.target = target;
      return this;
    }

    /**
     * Set the engine.
     *
     * @param engine the engine
     * @return the CreateIngestionJobOptions builder
     */
    public Builder engine(IngestionEngine engine) {
      this.engine = engine;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateIngestionJobOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the executeConfig.
     *
     * @param executeConfig the executeConfig
     * @return the CreateIngestionJobOptions builder
     */
    public Builder executeConfig(ExecuteConfig executeConfig) {
      this.executeConfig = executeConfig;
      return this;
    }

    /**
     * Set the sourceIcebergTable.
     *
     * @param sourceIcebergTable the sourceIcebergTable
     * @return the CreateIngestionJobOptions builder
     */
    public Builder sourceIcebergTable(IcebergSourceTable sourceIcebergTable) {
      this.sourceIcebergTable = sourceIcebergTable;
      return this;
    }

    /**
     * Set the partitionBy.
     *
     * @param partitionBy the partitionBy
     * @return the CreateIngestionJobOptions builder
     */
    public Builder partitionBy(String partitionBy) {
      this.partitionBy = partitionBy;
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the CreateIngestionJobOptions builder
     */
    public Builder capacity(CapacityDetails capacity) {
      this.capacity = capacity;
      return this;
    }
  }

  protected CreateIngestionJobOptions() { }

  protected CreateIngestionJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    authInstanceId = builder.authInstanceId;
    id = builder.id;
    source = builder.source;
    target = builder.target;
    engine = builder.engine;
    engineId = builder.engineId;
    executeConfig = builder.executeConfig;
    sourceIcebergTable = builder.sourceIcebergTable;
    partitionBy = builder.partitionBy;
    capacity = builder.capacity;
  }

  /**
   * New builder.
   *
   * @return a CreateIngestionJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authInstanceId.
   *
   * Lakehouse Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the id.
   *
   * Job ID of the ingestion job.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the source.
   *
   * Details of ingestion source files.
   *
   * @return the source
   */
  public SourceDetails source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * Details of ingestion target table.
   *
   * @return the target
   */
  public TargetDetails target() {
    return target;
  }

  /**
   * Gets the engine.
   *
   * Spark Engine Detail.
   *
   * @return the engine
   */
  public IngestionEngine engine() {
    return engine;
  }

  /**
   * Gets the engineId.
   *
   * ID of the spark engine to be used for ingestion.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the executeConfig.
   *
   * Ingestion engine configuration.
   *
   * @return the executeConfig
   */
  public ExecuteConfig executeConfig() {
    return executeConfig;
  }

  /**
   * Gets the sourceIcebergTable.
   *
   * Iceberg source table information.
   *
   * @return the sourceIcebergTable
   */
  public IcebergSourceTable sourceIcebergTable() {
    return sourceIcebergTable;
  }

  /**
   * Gets the partitionBy.
   *
   * Comma delimited list of columns to partition by.
   *
   * @return the partitionBy
   */
  public String partitionBy() {
    return partitionBy;
  }

  /**
   * Gets the capacity.
   *
   * Capacity Details.
   *
   * @return the capacity
   */
  public CapacityDetails capacity() {
    return capacity;
  }
}

