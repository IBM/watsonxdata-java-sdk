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
 * The createMilvusServiceBilling options.
 */
public class CreateMilvusServiceBillingOptions extends GenericModel {

  protected Double iwCpu;
  protected Double iwMemory;
  protected Long iwReplicas;
  protected Double qwCpu;
  protected Double qwMemory;
  protected Long qwReplicas;
  protected Double dcCpu;
  protected Double dcMemory;
  protected Long dcReplicas;
  protected Double dwCpu;
  protected Double dwMemory;
  protected Long dwReplicas;
  protected Double etcdCpu;
  protected Double etcdMemory;
  protected Double kafkaCpu;
  protected Double kafkaMemory;
  protected Double proxyCpu;
  protected Double proxyMemory;
  protected Long proxyReplicas;
  protected Double qcCpu;
  protected Double qcMemory;
  protected Long qcReplicas;
  protected Double rcCpu;
  protected Double rcMemory;
  protected Long rcReplicas;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private Double iwCpu;
    private Double iwMemory;
    private Long iwReplicas;
    private Double qwCpu;
    private Double qwMemory;
    private Long qwReplicas;
    private Double dcCpu;
    private Double dcMemory;
    private Long dcReplicas;
    private Double dwCpu;
    private Double dwMemory;
    private Long dwReplicas;
    private Double etcdCpu;
    private Double etcdMemory;
    private Double kafkaCpu;
    private Double kafkaMemory;
    private Double proxyCpu;
    private Double proxyMemory;
    private Long proxyReplicas;
    private Double qcCpu;
    private Double qcMemory;
    private Long qcReplicas;
    private Double rcCpu;
    private Double rcMemory;
    private Long rcReplicas;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceBillingOptions instance.
     *
     * @param createMilvusServiceBillingOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceBillingOptions createMilvusServiceBillingOptions) {
      this.iwCpu = createMilvusServiceBillingOptions.iwCpu;
      this.iwMemory = createMilvusServiceBillingOptions.iwMemory;
      this.iwReplicas = createMilvusServiceBillingOptions.iwReplicas;
      this.qwCpu = createMilvusServiceBillingOptions.qwCpu;
      this.qwMemory = createMilvusServiceBillingOptions.qwMemory;
      this.qwReplicas = createMilvusServiceBillingOptions.qwReplicas;
      this.dcCpu = createMilvusServiceBillingOptions.dcCpu;
      this.dcMemory = createMilvusServiceBillingOptions.dcMemory;
      this.dcReplicas = createMilvusServiceBillingOptions.dcReplicas;
      this.dwCpu = createMilvusServiceBillingOptions.dwCpu;
      this.dwMemory = createMilvusServiceBillingOptions.dwMemory;
      this.dwReplicas = createMilvusServiceBillingOptions.dwReplicas;
      this.etcdCpu = createMilvusServiceBillingOptions.etcdCpu;
      this.etcdMemory = createMilvusServiceBillingOptions.etcdMemory;
      this.kafkaCpu = createMilvusServiceBillingOptions.kafkaCpu;
      this.kafkaMemory = createMilvusServiceBillingOptions.kafkaMemory;
      this.proxyCpu = createMilvusServiceBillingOptions.proxyCpu;
      this.proxyMemory = createMilvusServiceBillingOptions.proxyMemory;
      this.proxyReplicas = createMilvusServiceBillingOptions.proxyReplicas;
      this.qcCpu = createMilvusServiceBillingOptions.qcCpu;
      this.qcMemory = createMilvusServiceBillingOptions.qcMemory;
      this.qcReplicas = createMilvusServiceBillingOptions.qcReplicas;
      this.rcCpu = createMilvusServiceBillingOptions.rcCpu;
      this.rcMemory = createMilvusServiceBillingOptions.rcMemory;
      this.rcReplicas = createMilvusServiceBillingOptions.rcReplicas;
      this.authInstanceId = createMilvusServiceBillingOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param iwCpu the iwCpu
     * @param iwMemory the iwMemory
     * @param iwReplicas the iwReplicas
     * @param qwCpu the qwCpu
     * @param qwMemory the qwMemory
     * @param qwReplicas the qwReplicas
     */
    public Builder(Double iwCpu, Double iwMemory, Long iwReplicas, Double qwCpu, Double qwMemory, Long qwReplicas) {
      this.iwCpu = iwCpu;
      this.iwMemory = iwMemory;
      this.iwReplicas = iwReplicas;
      this.qwCpu = qwCpu;
      this.qwMemory = qwMemory;
      this.qwReplicas = qwReplicas;
    }

    /**
     * Builds a CreateMilvusServiceBillingOptions.
     *
     * @return the new CreateMilvusServiceBillingOptions instance
     */
    public CreateMilvusServiceBillingOptions build() {
      return new CreateMilvusServiceBillingOptions(this);
    }

    /**
     * Set the iwCpu.
     *
     * @param iwCpu the iwCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder iwCpu(Double iwCpu) {
      this.iwCpu = iwCpu;
      return this;
    }

    /**
     * Set the iwMemory.
     *
     * @param iwMemory the iwMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder iwMemory(Double iwMemory) {
      this.iwMemory = iwMemory;
      return this;
    }

    /**
     * Set the iwReplicas.
     *
     * @param iwReplicas the iwReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder iwReplicas(long iwReplicas) {
      this.iwReplicas = iwReplicas;
      return this;
    }

    /**
     * Set the qwCpu.
     *
     * @param qwCpu the qwCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qwCpu(Double qwCpu) {
      this.qwCpu = qwCpu;
      return this;
    }

    /**
     * Set the qwMemory.
     *
     * @param qwMemory the qwMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qwMemory(Double qwMemory) {
      this.qwMemory = qwMemory;
      return this;
    }

    /**
     * Set the qwReplicas.
     *
     * @param qwReplicas the qwReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qwReplicas(long qwReplicas) {
      this.qwReplicas = qwReplicas;
      return this;
    }

    /**
     * Set the dcCpu.
     *
     * @param dcCpu the dcCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dcCpu(Double dcCpu) {
      this.dcCpu = dcCpu;
      return this;
    }

    /**
     * Set the dcMemory.
     *
     * @param dcMemory the dcMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dcMemory(Double dcMemory) {
      this.dcMemory = dcMemory;
      return this;
    }

    /**
     * Set the dcReplicas.
     *
     * @param dcReplicas the dcReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dcReplicas(long dcReplicas) {
      this.dcReplicas = dcReplicas;
      return this;
    }

    /**
     * Set the dwCpu.
     *
     * @param dwCpu the dwCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dwCpu(Double dwCpu) {
      this.dwCpu = dwCpu;
      return this;
    }

    /**
     * Set the dwMemory.
     *
     * @param dwMemory the dwMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dwMemory(Double dwMemory) {
      this.dwMemory = dwMemory;
      return this;
    }

    /**
     * Set the dwReplicas.
     *
     * @param dwReplicas the dwReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder dwReplicas(long dwReplicas) {
      this.dwReplicas = dwReplicas;
      return this;
    }

    /**
     * Set the etcdCpu.
     *
     * @param etcdCpu the etcdCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder etcdCpu(Double etcdCpu) {
      this.etcdCpu = etcdCpu;
      return this;
    }

    /**
     * Set the etcdMemory.
     *
     * @param etcdMemory the etcdMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder etcdMemory(Double etcdMemory) {
      this.etcdMemory = etcdMemory;
      return this;
    }

    /**
     * Set the kafkaCpu.
     *
     * @param kafkaCpu the kafkaCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder kafkaCpu(Double kafkaCpu) {
      this.kafkaCpu = kafkaCpu;
      return this;
    }

    /**
     * Set the kafkaMemory.
     *
     * @param kafkaMemory the kafkaMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder kafkaMemory(Double kafkaMemory) {
      this.kafkaMemory = kafkaMemory;
      return this;
    }

    /**
     * Set the proxyCpu.
     *
     * @param proxyCpu the proxyCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder proxyCpu(Double proxyCpu) {
      this.proxyCpu = proxyCpu;
      return this;
    }

    /**
     * Set the proxyMemory.
     *
     * @param proxyMemory the proxyMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder proxyMemory(Double proxyMemory) {
      this.proxyMemory = proxyMemory;
      return this;
    }

    /**
     * Set the proxyReplicas.
     *
     * @param proxyReplicas the proxyReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder proxyReplicas(long proxyReplicas) {
      this.proxyReplicas = proxyReplicas;
      return this;
    }

    /**
     * Set the qcCpu.
     *
     * @param qcCpu the qcCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qcCpu(Double qcCpu) {
      this.qcCpu = qcCpu;
      return this;
    }

    /**
     * Set the qcMemory.
     *
     * @param qcMemory the qcMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qcMemory(Double qcMemory) {
      this.qcMemory = qcMemory;
      return this;
    }

    /**
     * Set the qcReplicas.
     *
     * @param qcReplicas the qcReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder qcReplicas(long qcReplicas) {
      this.qcReplicas = qcReplicas;
      return this;
    }

    /**
     * Set the rcCpu.
     *
     * @param rcCpu the rcCpu
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder rcCpu(Double rcCpu) {
      this.rcCpu = rcCpu;
      return this;
    }

    /**
     * Set the rcMemory.
     *
     * @param rcMemory the rcMemory
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder rcMemory(Double rcMemory) {
      this.rcMemory = rcMemory;
      return this;
    }

    /**
     * Set the rcReplicas.
     *
     * @param rcReplicas the rcReplicas
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder rcReplicas(long rcReplicas) {
      this.rcReplicas = rcReplicas;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateMilvusServiceBillingOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateMilvusServiceBillingOptions() { }

  protected CreateMilvusServiceBillingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.iwCpu,
      "iwCpu cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.iwMemory,
      "iwMemory cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.iwReplicas,
      "iwReplicas cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.qwCpu,
      "qwCpu cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.qwMemory,
      "qwMemory cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.qwReplicas,
      "qwReplicas cannot be null");
    iwCpu = builder.iwCpu;
    iwMemory = builder.iwMemory;
    iwReplicas = builder.iwReplicas;
    qwCpu = builder.qwCpu;
    qwMemory = builder.qwMemory;
    qwReplicas = builder.qwReplicas;
    dcCpu = builder.dcCpu;
    dcMemory = builder.dcMemory;
    dcReplicas = builder.dcReplicas;
    dwCpu = builder.dwCpu;
    dwMemory = builder.dwMemory;
    dwReplicas = builder.dwReplicas;
    etcdCpu = builder.etcdCpu;
    etcdMemory = builder.etcdMemory;
    kafkaCpu = builder.kafkaCpu;
    kafkaMemory = builder.kafkaMemory;
    proxyCpu = builder.proxyCpu;
    proxyMemory = builder.proxyMemory;
    proxyReplicas = builder.proxyReplicas;
    qcCpu = builder.qcCpu;
    qcMemory = builder.qcMemory;
    qcReplicas = builder.qcReplicas;
    rcCpu = builder.rcCpu;
    rcMemory = builder.rcMemory;
    rcReplicas = builder.rcReplicas;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateMilvusServiceBillingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * index worker memory, number in Gi for cpd, and Mi for Saas.
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
   * query worker memory, number in Gi for cpd, and Mi for Saas.
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
   * Gets the dcCpu.
   *
   * data coordinator cpus.
   *
   * @return the dcCpu
   */
  public Double dcCpu() {
    return dcCpu;
  }

  /**
   * Gets the dcMemory.
   *
   * data coordinator memory, number in Gi for cpd, and Mi for Saas.
   *
   * @return the dcMemory
   */
  public Double dcMemory() {
    return dcMemory;
  }

  /**
   * Gets the dcReplicas.
   *
   * data coordinator replicas.
   *
   * @return the dcReplicas
   */
  public Long dcReplicas() {
    return dcReplicas;
  }

  /**
   * Gets the dwCpu.
   *
   * data worker cpus.
   *
   * @return the dwCpu
   */
  public Double dwCpu() {
    return dwCpu;
  }

  /**
   * Gets the dwMemory.
   *
   * data worker memory, number in Gi for cpd, and Mi for Saas.
   *
   * @return the dwMemory
   */
  public Double dwMemory() {
    return dwMemory;
  }

  /**
   * Gets the dwReplicas.
   *
   * data worker replicas.
   *
   * @return the dwReplicas
   */
  public Long dwReplicas() {
    return dwReplicas;
  }

  /**
   * Gets the etcdCpu.
   *
   * etcd cpus.
   *
   * @return the etcdCpu
   */
  public Double etcdCpu() {
    return etcdCpu;
  }

  /**
   * Gets the etcdMemory.
   *
   * etcd memory.
   *
   * @return the etcdMemory
   */
  public Double etcdMemory() {
    return etcdMemory;
  }

  /**
   * Gets the kafkaCpu.
   *
   * kafka cpus.
   *
   * @return the kafkaCpu
   */
  public Double kafkaCpu() {
    return kafkaCpu;
  }

  /**
   * Gets the kafkaMemory.
   *
   * kafka memory.
   *
   * @return the kafkaMemory
   */
  public Double kafkaMemory() {
    return kafkaMemory;
  }

  /**
   * Gets the proxyCpu.
   *
   * proxy cpus.
   *
   * @return the proxyCpu
   */
  public Double proxyCpu() {
    return proxyCpu;
  }

  /**
   * Gets the proxyMemory.
   *
   * proxy memory, number in Gi for cpd, and Mi for Saas.
   *
   * @return the proxyMemory
   */
  public Double proxyMemory() {
    return proxyMemory;
  }

  /**
   * Gets the proxyReplicas.
   *
   * proxy replicas.
   *
   * @return the proxyReplicas
   */
  public Long proxyReplicas() {
    return proxyReplicas;
  }

  /**
   * Gets the qcCpu.
   *
   * query coordinator cpus.
   *
   * @return the qcCpu
   */
  public Double qcCpu() {
    return qcCpu;
  }

  /**
   * Gets the qcMemory.
   *
   * query coordinator memory, number in Gi for cpd, and Mi for Saas.
   *
   * @return the qcMemory
   */
  public Double qcMemory() {
    return qcMemory;
  }

  /**
   * Gets the qcReplicas.
   *
   * query coordinator replicas.
   *
   * @return the qcReplicas
   */
  public Long qcReplicas() {
    return qcReplicas;
  }

  /**
   * Gets the rcCpu.
   *
   * root coordinator cpus.
   *
   * @return the rcCpu
   */
  public Double rcCpu() {
    return rcCpu;
  }

  /**
   * Gets the rcMemory.
   *
   * root coodinator memory, number in Gi for cpd, and Mi for Saas.
   *
   * @return the rcMemory
   */
  public Double rcMemory() {
    return rcMemory;
  }

  /**
   * Gets the rcReplicas.
   *
   * root coordinator replicas.
   *
   * @return the rcReplicas
   */
  public Long rcReplicas() {
    return rcReplicas;
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

