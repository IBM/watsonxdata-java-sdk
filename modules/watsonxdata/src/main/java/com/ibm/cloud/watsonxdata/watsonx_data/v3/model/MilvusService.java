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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * milvus service details.
 */
public class MilvusService extends GenericModel {

  /**
   * Index type of milvus engine.
   */
  public interface IndexType {
    /** ivf_sq8. */
    String IVF_SQ8 = "ivf_sq8";
    /** ivf_pq. */
    String IVF_PQ = "ivf_pq";
    /** hnsw. */
    String HNSW = "hnsw";
  }

  /**
   * Origin of the milvus service.
   */
  public interface Origin {
    /** native. */
    String X_NATIVE = "native";
  }

  /**
   * milvus status.
   */
  public interface Status {
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** stopped. */
    String STOPPED = "stopped";
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

  @SerializedName("access_key")
  protected String accessKey;
  protected List<String> actions;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("dc_cpu")
  protected Double dcCpu;
  @SerializedName("dc_memory")
  protected Double dcMemory;
  @SerializedName("dc_replicas")
  protected Long dcReplicas;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("dw_cpu")
  protected Double dwCpu;
  @SerializedName("dw_memory")
  protected Double dwMemory;
  @SerializedName("dw_replicas")
  protected Long dwReplicas;
  protected String endpoint;
  @SerializedName("etcd_cpu")
  protected Double etcdCpu;
  @SerializedName("etcd_memory")
  protected Double etcdMemory;
  @SerializedName("failure_message")
  protected String failureMessage;
  @SerializedName("grpc_host")
  protected String grpcHost;
  @SerializedName("grpc_port")
  protected Long grpcPort;
  @SerializedName("host_name")
  protected String hostName;
  @SerializedName("https_host")
  protected String httpsHost;
  @SerializedName("https_port")
  protected Long httpsPort;
  protected String id;
  @SerializedName("index_type")
  protected String indexType;
  @SerializedName("iw_cpu")
  protected Double iwCpu;
  @SerializedName("iw_memory")
  protected Double iwMemory;
  @SerializedName("iw_replicas")
  protected Long iwReplicas;
  @SerializedName("kafka_cpu")
  protected Double kafkaCpu;
  @SerializedName("kafka_memory")
  protected Double kafkaMemory;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String origin;
  @SerializedName("proxy_cpu")
  protected Double proxyCpu;
  @SerializedName("proxy_host")
  protected String proxyHost;
  @SerializedName("proxy_memory")
  protected Double proxyMemory;
  @SerializedName("proxy_port")
  protected Long proxyPort;
  @SerializedName("proxy_replicas")
  protected Long proxyReplicas;
  @SerializedName("qc_cpu")
  protected Double qcCpu;
  @SerializedName("qc_memory")
  protected Double qcMemory;
  @SerializedName("qc_replicas")
  protected Long qcReplicas;
  @SerializedName("qw_cpu")
  protected Double qwCpu;
  @SerializedName("qw_memory")
  protected Double qwMemory;
  @SerializedName("qw_replicas")
  protected Long qwReplicas;
  @SerializedName("rc_cpu")
  protected Double rcCpu;
  @SerializedName("rc_memory")
  protected Double rcMemory;
  @SerializedName("rc_replicas")
  protected Long rcReplicas;
  @SerializedName("root_path")
  protected String rootPath;
  @SerializedName("secret_key")
  protected String secretKey;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  @SerializedName("storage_name")
  protected String storageName;
  protected List<String> tags;
  @SerializedName("tshirt_size")
  protected String tshirtSize;
  protected String type;
  protected Long vector;
  @SerializedName("vector_dimension")
  protected Long vectorDimension;
  protected String version;

  protected MilvusService() { }

  /**
   * Gets the accessKey.
   *
   * storage access key.
   *
   * @return the accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the createdAt.
   *
   * Created time in epoch format.
   *
   * @return the createdAt
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Username of the user who created the watsonx.data instance.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the dcCpu.
   *
   * data coordinator cpus, only configurable in cpd.
   *
   * @return the dcCpu
   */
  public Double getDcCpu() {
    return dcCpu;
  }

  /**
   * Gets the dcMemory.
   *
   * data coordinator memory, only configurable in cpd.
   *
   * @return the dcMemory
   */
  public Double getDcMemory() {
    return dcMemory;
  }

  /**
   * Gets the dcReplicas.
   *
   * data coordinator replicas, only configurable in cpd.
   *
   * @return the dcReplicas
   */
  public Long getDcReplicas() {
    return dcReplicas;
  }

  /**
   * Gets the description.
   *
   * Descriptioon of Milvus service added by the user.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Display name for milvus services.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the dwCpu.
   *
   * data worker cpus, only configurable in cpd.
   *
   * @return the dwCpu
   */
  public Double getDwCpu() {
    return dwCpu;
  }

  /**
   * Gets the dwMemory.
   *
   * data worker memory, only configurable in cpd.
   *
   * @return the dwMemory
   */
  public Double getDwMemory() {
    return dwMemory;
  }

  /**
   * Gets the dwReplicas.
   *
   * data worker replicas, only configurable in cpd.
   *
   * @return the dwReplicas
   */
  public Long getDwReplicas() {
    return dwReplicas;
  }

  /**
   * Gets the endpoint.
   *
   * storage endpoint.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the etcdCpu.
   *
   * etcd cpus, only configurable in cpd.
   *
   * @return the etcdCpu
   */
  public Double getEtcdCpu() {
    return etcdCpu;
  }

  /**
   * Gets the etcdMemory.
   *
   * etcd memory, only configurable in cpd.
   *
   * @return the etcdMemory
   */
  public Double getEtcdMemory() {
    return etcdMemory;
  }

  /**
   * Gets the failureMessage.
   *
   * Failure message.
   *
   * @return the failureMessage
   */
  public String getFailureMessage() {
    return failureMessage;
  }

  /**
   * Gets the grpcHost.
   *
   * milvus grpc_host.
   *
   * @return the grpcHost
   */
  public String getGrpcHost() {
    return grpcHost;
  }

  /**
   * Gets the grpcPort.
   *
   * milvus port.
   *
   * @return the grpcPort
   */
  public Long getGrpcPort() {
    return grpcPort;
  }

  /**
   * Gets the hostName.
   *
   * milvus display name.
   *
   * @return the hostName
   */
  public String getHostName() {
    return hostName;
  }

  /**
   * Gets the httpsHost.
   *
   * milvus https_host.
   *
   * @return the httpsHost
   */
  public String getHttpsHost() {
    return httpsHost;
  }

  /**
   * Gets the httpsPort.
   *
   * milvus port.
   *
   * @return the httpsPort
   */
  public Long getHttpsPort() {
    return httpsPort;
  }

  /**
   * Gets the id.
   *
   * Engine id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the indexType.
   *
   * Index type of milvus engine.
   *
   * @return the indexType
   */
  public String getIndexType() {
    return indexType;
  }

  /**
   * Gets the iwCpu.
   *
   * index worker cpu.
   *
   * @return the iwCpu
   */
  public Double getIwCpu() {
    return iwCpu;
  }

  /**
   * Gets the iwMemory.
   *
   * index worker memory.
   *
   * @return the iwMemory
   */
  public Double getIwMemory() {
    return iwMemory;
  }

  /**
   * Gets the iwReplicas.
   *
   * index worker replicas.
   *
   * @return the iwReplicas
   */
  public Long getIwReplicas() {
    return iwReplicas;
  }

  /**
   * Gets the kafkaCpu.
   *
   * kafka cpus, only configurable in cpd.
   *
   * @return the kafkaCpu
   */
  public Double getKafkaCpu() {
    return kafkaCpu;
  }

  /**
   * Gets the kafkaMemory.
   *
   * kafka memory, only configurable in cpd.
   *
   * @return the kafkaMemory
   */
  public Double getKafkaMemory() {
    return kafkaMemory;
  }

  /**
   * Gets the managedBy.
   *
   * How is the Milvus instance managed.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the origin.
   *
   * Origin of the milvus service.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the proxyCpu.
   *
   * proxy cpus, only configurable in cpd.
   *
   * @return the proxyCpu
   */
  public Double getProxyCpu() {
    return proxyCpu;
  }

  /**
   * Gets the proxyHost.
   *
   * milvus proxy host.
   *
   * @return the proxyHost
   */
  public String getProxyHost() {
    return proxyHost;
  }

  /**
   * Gets the proxyMemory.
   *
   * proxy memory, only configurable in cpd.
   *
   * @return the proxyMemory
   */
  public Double getProxyMemory() {
    return proxyMemory;
  }

  /**
   * Gets the proxyPort.
   *
   * milvus proxy port.
   *
   * @return the proxyPort
   */
  public Long getProxyPort() {
    return proxyPort;
  }

  /**
   * Gets the proxyReplicas.
   *
   * proxy replicas, only configurable in cpd.
   *
   * @return the proxyReplicas
   */
  public Long getProxyReplicas() {
    return proxyReplicas;
  }

  /**
   * Gets the qcCpu.
   *
   * query coordinator cpus, only configurable in cpd.
   *
   * @return the qcCpu
   */
  public Double getQcCpu() {
    return qcCpu;
  }

  /**
   * Gets the qcMemory.
   *
   * query coordinator memory, only configurable in cpd.
   *
   * @return the qcMemory
   */
  public Double getQcMemory() {
    return qcMemory;
  }

  /**
   * Gets the qcReplicas.
   *
   * query coordinator replicas, only configurable in cpd.
   *
   * @return the qcReplicas
   */
  public Long getQcReplicas() {
    return qcReplicas;
  }

  /**
   * Gets the qwCpu.
   *
   * query worker cpu.
   *
   * @return the qwCpu
   */
  public Double getQwCpu() {
    return qwCpu;
  }

  /**
   * Gets the qwMemory.
   *
   * query worker memory.
   *
   * @return the qwMemory
   */
  public Double getQwMemory() {
    return qwMemory;
  }

  /**
   * Gets the qwReplicas.
   *
   * query worker replicas.
   *
   * @return the qwReplicas
   */
  public Long getQwReplicas() {
    return qwReplicas;
  }

  /**
   * Gets the rcCpu.
   *
   * root coordinator cpus, only configurable in cpd.
   *
   * @return the rcCpu
   */
  public Double getRcCpu() {
    return rcCpu;
  }

  /**
   * Gets the rcMemory.
   *
   * root coodinator memory, only configurable in cpd.
   *
   * @return the rcMemory
   */
  public Double getRcMemory() {
    return rcMemory;
  }

  /**
   * Gets the rcReplicas.
   *
   * root coordinator replicas, only configurable in cpd.
   *
   * @return the rcReplicas
   */
  public Long getRcReplicas() {
    return rcReplicas;
  }

  /**
   * Gets the rootPath.
   *
   * Root path in storage where milvus vectors will be stored.
   *
   * @return the rootPath
   */
  public String getRootPath() {
    return rootPath;
  }

  /**
   * Gets the secretKey.
   *
   * storage secret access key.
   *
   * @return the secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Gets the status.
   *
   * milvus status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusCode.
   *
   * milvus status code.
   *
   * @return the statusCode
   */
  public Long getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the storageName.
   *
   * storage name.
   *
   * @return the storageName
   */
  public String getStorageName() {
    return storageName;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the tshirtSize.
   *
   * Predefined tshirt size for the milvus service.
   *
   * @return the tshirtSize
   */
  public String getTshirtSize() {
    return tshirtSize;
  }

  /**
   * Gets the type.
   *
   * service type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vector.
   *
   * vector.
   *
   * @return the vector
   */
  public Long getVector() {
    return vector;
  }

  /**
   * Gets the vectorDimension.
   *
   * vector dimension.
   *
   * @return the vectorDimension
   */
  public Long getVectorDimension() {
    return vectorDimension;
  }

  /**
   * Gets the version.
   *
   * Milvus version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

