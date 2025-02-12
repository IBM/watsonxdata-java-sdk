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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createMilvusServiceScale options.
 */
public class CreateMilvusServiceScaleOptions extends GenericModel {

  /**
   * index type.
   */
  public interface IndexType {
    /** FLAT. */
    String FLAT = "FLAT";
    /** IVF_FLAT. */
    String IVF_FLAT = "IVF_FLAT";
    /** IVF_SQ8. */
    String IVF_SQ8 = "IVF_SQ8";
    /** IVF_PQ. */
    String IVF_PQ = "IVF_PQ";
    /** HNSW. */
    String HNSW = "HNSW";
    /** SCANN. */
    String SCANN = "SCANN";
    /** GPU_CAGRA. */
    String GPU_CAGRA = "GPU_CAGRA";
    /** GPU_IVF_FLAT. */
    String GPU_IVF_FLAT = "GPU_IVF_FLAT";
    /** GPU_IVF_PQ. */
    String GPU_IVF_PQ = "GPU_IVF_PQ";
    /** GPU_BRUTE_FORCE. */
    String GPU_BRUTE_FORCE = "GPU_BRUTE_FORCE";
  }

  protected String serviceId;
  protected String tshirtSize;
  protected String indexType;
  protected Long iwCpu;
  protected Long iwMemory;
  protected Long iwReplicas;
  protected String milvusName;
  protected Long qwCpu;
  protected Long qwMemory;
  protected Long qwReplicas;
  protected Long vectorDimension;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private String tshirtSize;
    private String indexType;
    private Long iwCpu;
    private Long iwMemory;
    private Long iwReplicas;
    private String milvusName;
    private Long qwCpu;
    private Long qwMemory;
    private Long qwReplicas;
    private Long vectorDimension;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceScaleOptions instance.
     *
     * @param createMilvusServiceScaleOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceScaleOptions createMilvusServiceScaleOptions) {
      this.serviceId = createMilvusServiceScaleOptions.serviceId;
      this.tshirtSize = createMilvusServiceScaleOptions.tshirtSize;
      this.indexType = createMilvusServiceScaleOptions.indexType;
      this.iwCpu = createMilvusServiceScaleOptions.iwCpu;
      this.iwMemory = createMilvusServiceScaleOptions.iwMemory;
      this.iwReplicas = createMilvusServiceScaleOptions.iwReplicas;
      this.milvusName = createMilvusServiceScaleOptions.milvusName;
      this.qwCpu = createMilvusServiceScaleOptions.qwCpu;
      this.qwMemory = createMilvusServiceScaleOptions.qwMemory;
      this.qwReplicas = createMilvusServiceScaleOptions.qwReplicas;
      this.vectorDimension = createMilvusServiceScaleOptions.vectorDimension;
      this.authInstanceId = createMilvusServiceScaleOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serviceId the serviceId
     * @param tshirtSize the tshirtSize
     */
    public Builder(String serviceId, String tshirtSize) {
      this.serviceId = serviceId;
      this.tshirtSize = tshirtSize;
    }

    /**
     * Builds a CreateMilvusServiceScaleOptions.
     *
     * @return the new CreateMilvusServiceScaleOptions instance
     */
    public CreateMilvusServiceScaleOptions build() {
      return new CreateMilvusServiceScaleOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the tshirtSize.
     *
     * @param tshirtSize the tshirtSize
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder tshirtSize(String tshirtSize) {
      this.tshirtSize = tshirtSize;
      return this;
    }

    /**
     * Set the indexType.
     *
     * @param indexType the indexType
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder indexType(String indexType) {
      this.indexType = indexType;
      return this;
    }

    /**
     * Set the iwCpu.
     *
     * @param iwCpu the iwCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder iwCpu(long iwCpu) {
      this.iwCpu = iwCpu;
      return this;
    }

    /**
     * Set the iwMemory.
     *
     * @param iwMemory the iwMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder iwMemory(long iwMemory) {
      this.iwMemory = iwMemory;
      return this;
    }

    /**
     * Set the iwReplicas.
     *
     * @param iwReplicas the iwReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder iwReplicas(long iwReplicas) {
      this.iwReplicas = iwReplicas;
      return this;
    }

    /**
     * Set the milvusName.
     *
     * @param milvusName the milvusName
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder milvusName(String milvusName) {
      this.milvusName = milvusName;
      return this;
    }

    /**
     * Set the qwCpu.
     *
     * @param qwCpu the qwCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qwCpu(long qwCpu) {
      this.qwCpu = qwCpu;
      return this;
    }

    /**
     * Set the qwMemory.
     *
     * @param qwMemory the qwMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qwMemory(long qwMemory) {
      this.qwMemory = qwMemory;
      return this;
    }

    /**
     * Set the qwReplicas.
     *
     * @param qwReplicas the qwReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qwReplicas(long qwReplicas) {
      this.qwReplicas = qwReplicas;
      return this;
    }

    /**
     * Set the vectorDimension.
     *
     * @param vectorDimension the vectorDimension
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder vectorDimension(long vectorDimension) {
      this.vectorDimension = vectorDimension;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateMilvusServiceScaleOptions() { }

  protected CreateMilvusServiceScaleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tshirtSize,
      "tshirtSize cannot be null");
    serviceId = builder.serviceId;
    tshirtSize = builder.tshirtSize;
    indexType = builder.indexType;
    iwCpu = builder.iwCpu;
    iwMemory = builder.iwMemory;
    iwReplicas = builder.iwReplicas;
    milvusName = builder.milvusName;
    qwCpu = builder.qwCpu;
    qwMemory = builder.qwMemory;
    qwReplicas = builder.qwReplicas;
    vectorDimension = builder.vectorDimension;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateMilvusServiceScaleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serviceId.
   *
   * service id.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
  }

  /**
   * Gets the tshirtSize.
   *
   * tshirt size.
   *
   * @return the tshirtSize
   */
  public String tshirtSize() {
    return tshirtSize;
  }

  /**
   * Gets the indexType.
   *
   * index type.
   *
   * @return the indexType
   */
  public String indexType() {
    return indexType;
  }

  /**
   * Gets the iwCpu.
   *
   * index worker cpus.
   *
   * @return the iwCpu
   */
  public Long iwCpu() {
    return iwCpu;
  }

  /**
   * Gets the iwMemory.
   *
   * index worker memory.
   *
   * @return the iwMemory
   */
  public Long iwMemory() {
    return iwMemory;
  }

  /**
   * Gets the iwReplicas.
   *
   * index worker replicas.
   *
   * @return the iwReplicas
   */
  public Long iwReplicas() {
    return iwReplicas;
  }

  /**
   * Gets the milvusName.
   *
   * milvus engine id.
   *
   * @return the milvusName
   */
  public String milvusName() {
    return milvusName;
  }

  /**
   * Gets the qwCpu.
   *
   * query worker cpus.
   *
   * @return the qwCpu
   */
  public Long qwCpu() {
    return qwCpu;
  }

  /**
   * Gets the qwMemory.
   *
   * query worker memory.
   *
   * @return the qwMemory
   */
  public Long qwMemory() {
    return qwMemory;
  }

  /**
   * Gets the qwReplicas.
   *
   * query worker replicas.
   *
   * @return the qwReplicas
   */
  public Long qwReplicas() {
    return qwReplicas;
  }

  /**
   * Gets the vectorDimension.
   *
   * vector dimension.
   *
   * @return the vectorDimension
   */
  public Long vectorDimension() {
    return vectorDimension;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

