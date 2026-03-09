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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createMilvusServiceScale options.
 */
public class CreateMilvusServiceScaleOptions extends GenericModel {

  /**
   * tshirt size.
   */
  public interface TshirtSize {
    /** starter. */
    String STARTER = "starter";
    /** small. */
    String SMALL = "small";
    /** medium. */
    String MEDIUM = "medium";
    /** large. */
    String LARGE = "large";
    /** xlarge. */
    String XLARGE = "xlarge";
    /** xxlarge. */
    String XXLARGE = "xxlarge";
    /** custom. */
    String CUSTOM = "custom";
  }

  /**
   * index type, required for custom size.
   */
  public interface IndexType {
    /** flat. */
    String FLAT = "flat";
    /** ivf_flat. */
    String IVF_FLAT = "ivf_flat";
    /** ivf_sq8. */
    String IVF_SQ8 = "ivf_sq8";
    /** ivf_pq. */
    String IVF_PQ = "ivf_pq";
    /** hnsw. */
    String HNSW = "hnsw";
    /** scann. */
    String SCANN = "scann";
    /** gpu. */
    String GPU = "gpu";
    /** gpu_cagra. */
    String GPU_CAGRA = "gpu_cagra";
    /** gpu_ivf_flat. */
    String GPU_IVF_FLAT = "gpu_ivf_flat";
    /** gpu_ivf_pq. */
    String GPU_IVF_PQ = "gpu_ivf_pq";
    /** gpu_brute_force. */
    String GPU_BRUTE_FORCE = "gpu_brute_force";
  }

  protected String id;
  protected String tshirtSize;
  protected Double dcCpu;
  protected Double dcMemory;
  protected Long dcReplicas;
  protected Double dwCpu;
  protected Double dwMemory;
  protected Long dwReplicas;
  protected Double etcdCpu;
  protected Double etcdMemory;
  protected String indexType;
  protected Double iwCpu;
  protected Double iwMemory;
  protected Long iwReplicas;
  protected Double kafkaCpu;
  protected Double kafkaMemory;
  protected Double proxyCpu;
  protected Double proxyMemory;
  protected Long proxyReplicas;
  protected Double qcCpu;
  protected Double qcMemory;
  protected Long qcReplicas;
  protected Double qwCpu;
  protected Double qwMemory;
  protected Long qwReplicas;
  protected Double rcCpu;
  protected Double rcMemory;
  protected Long rcReplicas;
  protected Long vector;
  protected Long vectorDimension;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String tshirtSize;
    private Double dcCpu;
    private Double dcMemory;
    private Long dcReplicas;
    private Double dwCpu;
    private Double dwMemory;
    private Long dwReplicas;
    private Double etcdCpu;
    private Double etcdMemory;
    private String indexType;
    private Double iwCpu;
    private Double iwMemory;
    private Long iwReplicas;
    private Double kafkaCpu;
    private Double kafkaMemory;
    private Double proxyCpu;
    private Double proxyMemory;
    private Long proxyReplicas;
    private Double qcCpu;
    private Double qcMemory;
    private Long qcReplicas;
    private Double qwCpu;
    private Double qwMemory;
    private Long qwReplicas;
    private Double rcCpu;
    private Double rcMemory;
    private Long rcReplicas;
    private Long vector;
    private Long vectorDimension;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceScaleOptions instance.
     *
     * @param createMilvusServiceScaleOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceScaleOptions createMilvusServiceScaleOptions) {
      this.id = createMilvusServiceScaleOptions.id;
      this.tshirtSize = createMilvusServiceScaleOptions.tshirtSize;
      this.dcCpu = createMilvusServiceScaleOptions.dcCpu;
      this.dcMemory = createMilvusServiceScaleOptions.dcMemory;
      this.dcReplicas = createMilvusServiceScaleOptions.dcReplicas;
      this.dwCpu = createMilvusServiceScaleOptions.dwCpu;
      this.dwMemory = createMilvusServiceScaleOptions.dwMemory;
      this.dwReplicas = createMilvusServiceScaleOptions.dwReplicas;
      this.etcdCpu = createMilvusServiceScaleOptions.etcdCpu;
      this.etcdMemory = createMilvusServiceScaleOptions.etcdMemory;
      this.indexType = createMilvusServiceScaleOptions.indexType;
      this.iwCpu = createMilvusServiceScaleOptions.iwCpu;
      this.iwMemory = createMilvusServiceScaleOptions.iwMemory;
      this.iwReplicas = createMilvusServiceScaleOptions.iwReplicas;
      this.kafkaCpu = createMilvusServiceScaleOptions.kafkaCpu;
      this.kafkaMemory = createMilvusServiceScaleOptions.kafkaMemory;
      this.proxyCpu = createMilvusServiceScaleOptions.proxyCpu;
      this.proxyMemory = createMilvusServiceScaleOptions.proxyMemory;
      this.proxyReplicas = createMilvusServiceScaleOptions.proxyReplicas;
      this.qcCpu = createMilvusServiceScaleOptions.qcCpu;
      this.qcMemory = createMilvusServiceScaleOptions.qcMemory;
      this.qcReplicas = createMilvusServiceScaleOptions.qcReplicas;
      this.qwCpu = createMilvusServiceScaleOptions.qwCpu;
      this.qwMemory = createMilvusServiceScaleOptions.qwMemory;
      this.qwReplicas = createMilvusServiceScaleOptions.qwReplicas;
      this.rcCpu = createMilvusServiceScaleOptions.rcCpu;
      this.rcMemory = createMilvusServiceScaleOptions.rcMemory;
      this.rcReplicas = createMilvusServiceScaleOptions.rcReplicas;
      this.vector = createMilvusServiceScaleOptions.vector;
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
     * @param id the id
     * @param tshirtSize the tshirtSize
     */
    public Builder(String id, String tshirtSize) {
      this.id = id;
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
     * Set the id.
     *
     * @param id the id
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
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
     * Set the dcCpu.
     *
     * @param dcCpu the dcCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dcCpu(Double dcCpu) {
      this.dcCpu = dcCpu;
      return this;
    }

    /**
     * Set the dcMemory.
     *
     * @param dcMemory the dcMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dcMemory(Double dcMemory) {
      this.dcMemory = dcMemory;
      return this;
    }

    /**
     * Set the dcReplicas.
     *
     * @param dcReplicas the dcReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dcReplicas(long dcReplicas) {
      this.dcReplicas = dcReplicas;
      return this;
    }

    /**
     * Set the dwCpu.
     *
     * @param dwCpu the dwCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dwCpu(Double dwCpu) {
      this.dwCpu = dwCpu;
      return this;
    }

    /**
     * Set the dwMemory.
     *
     * @param dwMemory the dwMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dwMemory(Double dwMemory) {
      this.dwMemory = dwMemory;
      return this;
    }

    /**
     * Set the dwReplicas.
     *
     * @param dwReplicas the dwReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder dwReplicas(long dwReplicas) {
      this.dwReplicas = dwReplicas;
      return this;
    }

    /**
     * Set the etcdCpu.
     *
     * @param etcdCpu the etcdCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder etcdCpu(Double etcdCpu) {
      this.etcdCpu = etcdCpu;
      return this;
    }

    /**
     * Set the etcdMemory.
     *
     * @param etcdMemory the etcdMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder etcdMemory(Double etcdMemory) {
      this.etcdMemory = etcdMemory;
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
    public Builder iwCpu(Double iwCpu) {
      this.iwCpu = iwCpu;
      return this;
    }

    /**
     * Set the iwMemory.
     *
     * @param iwMemory the iwMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder iwMemory(Double iwMemory) {
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
     * Set the kafkaCpu.
     *
     * @param kafkaCpu the kafkaCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder kafkaCpu(Double kafkaCpu) {
      this.kafkaCpu = kafkaCpu;
      return this;
    }

    /**
     * Set the kafkaMemory.
     *
     * @param kafkaMemory the kafkaMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder kafkaMemory(Double kafkaMemory) {
      this.kafkaMemory = kafkaMemory;
      return this;
    }

    /**
     * Set the proxyCpu.
     *
     * @param proxyCpu the proxyCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder proxyCpu(Double proxyCpu) {
      this.proxyCpu = proxyCpu;
      return this;
    }

    /**
     * Set the proxyMemory.
     *
     * @param proxyMemory the proxyMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder proxyMemory(Double proxyMemory) {
      this.proxyMemory = proxyMemory;
      return this;
    }

    /**
     * Set the proxyReplicas.
     *
     * @param proxyReplicas the proxyReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder proxyReplicas(long proxyReplicas) {
      this.proxyReplicas = proxyReplicas;
      return this;
    }

    /**
     * Set the qcCpu.
     *
     * @param qcCpu the qcCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qcCpu(Double qcCpu) {
      this.qcCpu = qcCpu;
      return this;
    }

    /**
     * Set the qcMemory.
     *
     * @param qcMemory the qcMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qcMemory(Double qcMemory) {
      this.qcMemory = qcMemory;
      return this;
    }

    /**
     * Set the qcReplicas.
     *
     * @param qcReplicas the qcReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qcReplicas(long qcReplicas) {
      this.qcReplicas = qcReplicas;
      return this;
    }

    /**
     * Set the qwCpu.
     *
     * @param qwCpu the qwCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qwCpu(Double qwCpu) {
      this.qwCpu = qwCpu;
      return this;
    }

    /**
     * Set the qwMemory.
     *
     * @param qwMemory the qwMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder qwMemory(Double qwMemory) {
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
     * Set the rcCpu.
     *
     * @param rcCpu the rcCpu
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder rcCpu(Double rcCpu) {
      this.rcCpu = rcCpu;
      return this;
    }

    /**
     * Set the rcMemory.
     *
     * @param rcMemory the rcMemory
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder rcMemory(Double rcMemory) {
      this.rcMemory = rcMemory;
      return this;
    }

    /**
     * Set the rcReplicas.
     *
     * @param rcReplicas the rcReplicas
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder rcReplicas(long rcReplicas) {
      this.rcReplicas = rcReplicas;
      return this;
    }

    /**
     * Set the vector.
     *
     * @param vector the vector
     * @return the CreateMilvusServiceScaleOptions builder
     */
    public Builder vector(long vector) {
      this.vector = vector;
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
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tshirtSize,
      "tshirtSize cannot be null");
    id = builder.id;
    tshirtSize = builder.tshirtSize;
    dcCpu = builder.dcCpu;
    dcMemory = builder.dcMemory;
    dcReplicas = builder.dcReplicas;
    dwCpu = builder.dwCpu;
    dwMemory = builder.dwMemory;
    dwReplicas = builder.dwReplicas;
    etcdCpu = builder.etcdCpu;
    etcdMemory = builder.etcdMemory;
    indexType = builder.indexType;
    iwCpu = builder.iwCpu;
    iwMemory = builder.iwMemory;
    iwReplicas = builder.iwReplicas;
    kafkaCpu = builder.kafkaCpu;
    kafkaMemory = builder.kafkaMemory;
    proxyCpu = builder.proxyCpu;
    proxyMemory = builder.proxyMemory;
    proxyReplicas = builder.proxyReplicas;
    qcCpu = builder.qcCpu;
    qcMemory = builder.qcMemory;
    qcReplicas = builder.qcReplicas;
    qwCpu = builder.qwCpu;
    qwMemory = builder.qwMemory;
    qwReplicas = builder.qwReplicas;
    rcCpu = builder.rcCpu;
    rcMemory = builder.rcMemory;
    rcReplicas = builder.rcReplicas;
    vector = builder.vector;
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
   * Gets the id.
   *
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the dcCpu.
   *
   * data coordinator cpus, only configurable in cpd.
   *
   * @return the dcCpu
   */
  public Double dcCpu() {
    return dcCpu;
  }

  /**
   * Gets the dcMemory.
   *
   * data coordinator memory, only configurable in cpd.
   *
   * @return the dcMemory
   */
  public Double dcMemory() {
    return dcMemory;
  }

  /**
   * Gets the dcReplicas.
   *
   * data coordinator replicas, only configurable in cpd.
   *
   * @return the dcReplicas
   */
  public Long dcReplicas() {
    return dcReplicas;
  }

  /**
   * Gets the dwCpu.
   *
   * data worker cpus, only configurable in cpd.
   *
   * @return the dwCpu
   */
  public Double dwCpu() {
    return dwCpu;
  }

  /**
   * Gets the dwMemory.
   *
   * data worker memory, only configurable in cpd.
   *
   * @return the dwMemory
   */
  public Double dwMemory() {
    return dwMemory;
  }

  /**
   * Gets the dwReplicas.
   *
   * data worker replicas, only configurable in cpd.
   *
   * @return the dwReplicas
   */
  public Long dwReplicas() {
    return dwReplicas;
  }

  /**
   * Gets the etcdCpu.
   *
   * etcd cpus, only configurable in cpd.
   *
   * @return the etcdCpu
   */
  public Double etcdCpu() {
    return etcdCpu;
  }

  /**
   * Gets the etcdMemory.
   *
   * etcd memory, only configurable in cpd.
   *
   * @return the etcdMemory
   */
  public Double etcdMemory() {
    return etcdMemory;
  }

  /**
   * Gets the indexType.
   *
   * index type, required for custom size.
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
  public Double iwCpu() {
    return iwCpu;
  }

  /**
   * Gets the iwMemory.
   *
   * index worker memory.
   *
   * @return the iwMemory
   */
  public Double iwMemory() {
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
   * Gets the kafkaCpu.
   *
   * kafka cpus, only configurable in cpd.
   *
   * @return the kafkaCpu
   */
  public Double kafkaCpu() {
    return kafkaCpu;
  }

  /**
   * Gets the kafkaMemory.
   *
   * kafka memory, only configurable in cpd.
   *
   * @return the kafkaMemory
   */
  public Double kafkaMemory() {
    return kafkaMemory;
  }

  /**
   * Gets the proxyCpu.
   *
   * proxy cpus, only configurable in cpd.
   *
   * @return the proxyCpu
   */
  public Double proxyCpu() {
    return proxyCpu;
  }

  /**
   * Gets the proxyMemory.
   *
   * proxy memory, only configurable in cpd.
   *
   * @return the proxyMemory
   */
  public Double proxyMemory() {
    return proxyMemory;
  }

  /**
   * Gets the proxyReplicas.
   *
   * proxy replicas, only configurable in cpd.
   *
   * @return the proxyReplicas
   */
  public Long proxyReplicas() {
    return proxyReplicas;
  }

  /**
   * Gets the qcCpu.
   *
   * query coordinator cpus, only configurable in cpd.
   *
   * @return the qcCpu
   */
  public Double qcCpu() {
    return qcCpu;
  }

  /**
   * Gets the qcMemory.
   *
   * query coordinator memory, only configurable in cpd.
   *
   * @return the qcMemory
   */
  public Double qcMemory() {
    return qcMemory;
  }

  /**
   * Gets the qcReplicas.
   *
   * query coordinator replicas, only configurable in cpd.
   *
   * @return the qcReplicas
   */
  public Long qcReplicas() {
    return qcReplicas;
  }

  /**
   * Gets the qwCpu.
   *
   * query worker cpus.
   *
   * @return the qwCpu
   */
  public Double qwCpu() {
    return qwCpu;
  }

  /**
   * Gets the qwMemory.
   *
   * query worker memory.
   *
   * @return the qwMemory
   */
  public Double qwMemory() {
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
   * Gets the rcCpu.
   *
   * root coordinator cpus, only configurable in cpd.
   *
   * @return the rcCpu
   */
  public Double rcCpu() {
    return rcCpu;
  }

  /**
   * Gets the rcMemory.
   *
   * root coodinator memory, only configurable in cpd.
   *
   * @return the rcMemory
   */
  public Double rcMemory() {
    return rcMemory;
  }

  /**
   * Gets the rcReplicas.
   *
   * root coordinator replicas, only configurable in cpd.
   *
   * @return the rcReplicas
   */
  public Long rcReplicas() {
    return rcReplicas;
  }

  /**
   * Gets the vector.
   *
   * vector.
   *
   * @return the vector
   */
  public Long vector() {
    return vector;
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
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

