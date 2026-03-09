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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createMilvusService options.
 */
public class CreateMilvusServiceOptions extends GenericModel {

  /**
   * Origin of the milvus service.
   */
  public interface Origin {
    /** native. */
    String X_NATIVE = "native";
  }

  /**
   * Predefined tshirt size for the milvus service.
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
    /** custom. */
    String CUSTOM = "custom";
  }

  /**
   * index type.
   */
  public interface IndexType {
    /** ivf_sq8. */
    String IVF_SQ8 = "ivf_sq8";
    /** ivf_pq. */
    String IVF_PQ = "ivf_pq";
    /** hnsw. */
    String HNSW = "hnsw";
  }

  protected String displayName;
  protected String origin;
  protected String rootPath;
  protected String tshirtSize;
  protected Double dcCpu;
  protected Double dcMemory;
  protected Long dcReplicas;
  protected String description;
  protected Double dwCpu;
  protected Double dwMemory;
  protected Long dwReplicas;
  protected Double etcdCpu;
  protected Double etcdMemory;
  protected String id;
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
  protected String storageName;
  protected List<String> tags;
  protected Long vector;
  protected Long vectorDimension;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String origin;
    private String rootPath;
    private String tshirtSize;
    private Double dcCpu;
    private Double dcMemory;
    private Long dcReplicas;
    private String description;
    private Double dwCpu;
    private Double dwMemory;
    private Long dwReplicas;
    private Double etcdCpu;
    private Double etcdMemory;
    private String id;
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
    private String storageName;
    private List<String> tags;
    private Long vector;
    private Long vectorDimension;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServiceOptions instance.
     *
     * @param createMilvusServiceOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServiceOptions createMilvusServiceOptions) {
      this.displayName = createMilvusServiceOptions.displayName;
      this.origin = createMilvusServiceOptions.origin;
      this.rootPath = createMilvusServiceOptions.rootPath;
      this.tshirtSize = createMilvusServiceOptions.tshirtSize;
      this.dcCpu = createMilvusServiceOptions.dcCpu;
      this.dcMemory = createMilvusServiceOptions.dcMemory;
      this.dcReplicas = createMilvusServiceOptions.dcReplicas;
      this.description = createMilvusServiceOptions.description;
      this.dwCpu = createMilvusServiceOptions.dwCpu;
      this.dwMemory = createMilvusServiceOptions.dwMemory;
      this.dwReplicas = createMilvusServiceOptions.dwReplicas;
      this.etcdCpu = createMilvusServiceOptions.etcdCpu;
      this.etcdMemory = createMilvusServiceOptions.etcdMemory;
      this.id = createMilvusServiceOptions.id;
      this.indexType = createMilvusServiceOptions.indexType;
      this.iwCpu = createMilvusServiceOptions.iwCpu;
      this.iwMemory = createMilvusServiceOptions.iwMemory;
      this.iwReplicas = createMilvusServiceOptions.iwReplicas;
      this.kafkaCpu = createMilvusServiceOptions.kafkaCpu;
      this.kafkaMemory = createMilvusServiceOptions.kafkaMemory;
      this.proxyCpu = createMilvusServiceOptions.proxyCpu;
      this.proxyMemory = createMilvusServiceOptions.proxyMemory;
      this.proxyReplicas = createMilvusServiceOptions.proxyReplicas;
      this.qcCpu = createMilvusServiceOptions.qcCpu;
      this.qcMemory = createMilvusServiceOptions.qcMemory;
      this.qcReplicas = createMilvusServiceOptions.qcReplicas;
      this.qwCpu = createMilvusServiceOptions.qwCpu;
      this.qwMemory = createMilvusServiceOptions.qwMemory;
      this.qwReplicas = createMilvusServiceOptions.qwReplicas;
      this.rcCpu = createMilvusServiceOptions.rcCpu;
      this.rcMemory = createMilvusServiceOptions.rcMemory;
      this.rcReplicas = createMilvusServiceOptions.rcReplicas;
      this.storageName = createMilvusServiceOptions.storageName;
      this.tags = createMilvusServiceOptions.tags;
      this.vector = createMilvusServiceOptions.vector;
      this.vectorDimension = createMilvusServiceOptions.vectorDimension;
      this.authInstanceId = createMilvusServiceOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param displayName the displayName
     * @param origin the origin
     * @param rootPath the rootPath
     * @param tshirtSize the tshirtSize
     */
    public Builder(String displayName, String origin, String rootPath, String tshirtSize) {
      this.displayName = displayName;
      this.origin = origin;
      this.rootPath = rootPath;
      this.tshirtSize = tshirtSize;
    }

    /**
     * Builds a CreateMilvusServiceOptions.
     *
     * @return the new CreateMilvusServiceOptions instance
     */
    public CreateMilvusServiceOptions build() {
      return new CreateMilvusServiceOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the rootPath.
     *
     * @param rootPath the rootPath
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder rootPath(String rootPath) {
      this.rootPath = rootPath;
      return this;
    }

    /**
     * Set the tshirtSize.
     *
     * @param tshirtSize the tshirtSize
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder tshirtSize(String tshirtSize) {
      this.tshirtSize = tshirtSize;
      return this;
    }

    /**
     * Set the dcCpu.
     *
     * @param dcCpu the dcCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dcCpu(Double dcCpu) {
      this.dcCpu = dcCpu;
      return this;
    }

    /**
     * Set the dcMemory.
     *
     * @param dcMemory the dcMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dcMemory(Double dcMemory) {
      this.dcMemory = dcMemory;
      return this;
    }

    /**
     * Set the dcReplicas.
     *
     * @param dcReplicas the dcReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dcReplicas(long dcReplicas) {
      this.dcReplicas = dcReplicas;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the dwCpu.
     *
     * @param dwCpu the dwCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dwCpu(Double dwCpu) {
      this.dwCpu = dwCpu;
      return this;
    }

    /**
     * Set the dwMemory.
     *
     * @param dwMemory the dwMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dwMemory(Double dwMemory) {
      this.dwMemory = dwMemory;
      return this;
    }

    /**
     * Set the dwReplicas.
     *
     * @param dwReplicas the dwReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder dwReplicas(long dwReplicas) {
      this.dwReplicas = dwReplicas;
      return this;
    }

    /**
     * Set the etcdCpu.
     *
     * @param etcdCpu the etcdCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder etcdCpu(Double etcdCpu) {
      this.etcdCpu = etcdCpu;
      return this;
    }

    /**
     * Set the etcdMemory.
     *
     * @param etcdMemory the etcdMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder etcdMemory(Double etcdMemory) {
      this.etcdMemory = etcdMemory;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the indexType.
     *
     * @param indexType the indexType
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder indexType(String indexType) {
      this.indexType = indexType;
      return this;
    }

    /**
     * Set the iwCpu.
     *
     * @param iwCpu the iwCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder iwCpu(Double iwCpu) {
      this.iwCpu = iwCpu;
      return this;
    }

    /**
     * Set the iwMemory.
     *
     * @param iwMemory the iwMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder iwMemory(Double iwMemory) {
      this.iwMemory = iwMemory;
      return this;
    }

    /**
     * Set the iwReplicas.
     *
     * @param iwReplicas the iwReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder iwReplicas(long iwReplicas) {
      this.iwReplicas = iwReplicas;
      return this;
    }

    /**
     * Set the kafkaCpu.
     *
     * @param kafkaCpu the kafkaCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder kafkaCpu(Double kafkaCpu) {
      this.kafkaCpu = kafkaCpu;
      return this;
    }

    /**
     * Set the kafkaMemory.
     *
     * @param kafkaMemory the kafkaMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder kafkaMemory(Double kafkaMemory) {
      this.kafkaMemory = kafkaMemory;
      return this;
    }

    /**
     * Set the proxyCpu.
     *
     * @param proxyCpu the proxyCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder proxyCpu(Double proxyCpu) {
      this.proxyCpu = proxyCpu;
      return this;
    }

    /**
     * Set the proxyMemory.
     *
     * @param proxyMemory the proxyMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder proxyMemory(Double proxyMemory) {
      this.proxyMemory = proxyMemory;
      return this;
    }

    /**
     * Set the proxyReplicas.
     *
     * @param proxyReplicas the proxyReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder proxyReplicas(long proxyReplicas) {
      this.proxyReplicas = proxyReplicas;
      return this;
    }

    /**
     * Set the qcCpu.
     *
     * @param qcCpu the qcCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qcCpu(Double qcCpu) {
      this.qcCpu = qcCpu;
      return this;
    }

    /**
     * Set the qcMemory.
     *
     * @param qcMemory the qcMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qcMemory(Double qcMemory) {
      this.qcMemory = qcMemory;
      return this;
    }

    /**
     * Set the qcReplicas.
     *
     * @param qcReplicas the qcReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qcReplicas(long qcReplicas) {
      this.qcReplicas = qcReplicas;
      return this;
    }

    /**
     * Set the qwCpu.
     *
     * @param qwCpu the qwCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qwCpu(Double qwCpu) {
      this.qwCpu = qwCpu;
      return this;
    }

    /**
     * Set the qwMemory.
     *
     * @param qwMemory the qwMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qwMemory(Double qwMemory) {
      this.qwMemory = qwMemory;
      return this;
    }

    /**
     * Set the qwReplicas.
     *
     * @param qwReplicas the qwReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder qwReplicas(long qwReplicas) {
      this.qwReplicas = qwReplicas;
      return this;
    }

    /**
     * Set the rcCpu.
     *
     * @param rcCpu the rcCpu
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder rcCpu(Double rcCpu) {
      this.rcCpu = rcCpu;
      return this;
    }

    /**
     * Set the rcMemory.
     *
     * @param rcMemory the rcMemory
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder rcMemory(Double rcMemory) {
      this.rcMemory = rcMemory;
      return this;
    }

    /**
     * Set the rcReplicas.
     *
     * @param rcReplicas the rcReplicas
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder rcReplicas(long rcReplicas) {
      this.rcReplicas = rcReplicas;
      return this;
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the vector.
     *
     * @param vector the vector
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder vector(long vector) {
      this.vector = vector;
      return this;
    }

    /**
     * Set the vectorDimension.
     *
     * @param vectorDimension the vectorDimension
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder vectorDimension(long vectorDimension) {
      this.vectorDimension = vectorDimension;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateMilvusServiceOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateMilvusServiceOptions() { }

  protected CreateMilvusServiceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origin,
      "origin cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootPath,
      "rootPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tshirtSize,
      "tshirtSize cannot be null");
    displayName = builder.displayName;
    origin = builder.origin;
    rootPath = builder.rootPath;
    tshirtSize = builder.tshirtSize;
    dcCpu = builder.dcCpu;
    dcMemory = builder.dcMemory;
    dcReplicas = builder.dcReplicas;
    description = builder.description;
    dwCpu = builder.dwCpu;
    dwMemory = builder.dwMemory;
    dwReplicas = builder.dwReplicas;
    etcdCpu = builder.etcdCpu;
    etcdMemory = builder.etcdMemory;
    id = builder.id;
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
    storageName = builder.storageName;
    tags = builder.tags;
    vector = builder.vector;
    vectorDimension = builder.vectorDimension;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateMilvusServiceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * Display name for milvus services.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the origin.
   *
   * Origin of the milvus service.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the rootPath.
   *
   * Root path in storage where milvus vectors will be stored.
   *
   * @return the rootPath
   */
  public String rootPath() {
    return rootPath;
  }

  /**
   * Gets the tshirtSize.
   *
   * Predefined tshirt size for the milvus service.
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
   * Gets the description.
   *
   * Descriptioon of Milvus service added by the user.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Gets the id.
   *
   * Engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * index worker cpu.
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
   * query worker cpu.
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
   * Gets the storageName.
   *
   * storage name.
   *
   * @return the storageName
   */
  public String storageName() {
    return storageName;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
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

