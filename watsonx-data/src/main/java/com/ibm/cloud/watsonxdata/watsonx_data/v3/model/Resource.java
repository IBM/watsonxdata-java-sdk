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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Watsonx Instance Details.
 */
public class Resource extends GenericModel {

  @SerializedName("ca_certificate")
  protected String caCertificate;
  @SerializedName("default_configs")
  protected Map<String, String> defaultConfigs;
  protected InstanceResourceEndpoint external;
  @SerializedName("grpc_api_endpoint")
  protected InstanceResourceEndpoint grpcApiEndpoint;
  protected String hostname;
  protected String id;
  @SerializedName("instance_crn")
  protected String instanceCrn;
  @SerializedName("instance_id")
  protected String instanceId;
  protected InstanceResourceEndpoint internal;
  @SerializedName("jdbc_class")
  protected String jdbcClass;
  @SerializedName("jdbc_urls")
  protected JdbcThriftUrls jdbcUrls;
  @SerializedName("mds_rest_urls")
  protected MDSRestUrls mdsRestUrls;
  protected String name;
  protected Long port;
  @SerializedName("proxy_api_endpoint")
  protected InstanceResourceEndpoint proxyApiEndpoint;
  @SerializedName("rest_api_endpoint")
  protected InstanceResourceEndpoint restApiEndpoint;
  @SerializedName("rest_hostname")
  protected String restHostname;
  @SerializedName("rest_port")
  protected Long restPort;
  @SerializedName("spark_engine_endpoint")
  protected String sparkEngineEndpoint;
  @SerializedName("ssl_certificate")
  protected String sslCertificate;
  @SerializedName("thrift_urls")
  protected JdbcThriftUrls thriftUrls;
  protected String type;
  protected String version;
  @SerializedName("watsonx_data_application_endpoint")
  protected String watsonxDataApplicationEndpoint;

  protected Resource() { }

  /**
   * Gets the caCertificate.
   *
   * ca certificate.
   *
   * @return the caCertificate
   */
  public String getCaCertificate() {
    return caCertificate;
  }

  /**
   * Gets the defaultConfigs.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the defaultConfigs
   */
  public Map<String, String> getDefaultConfigs() {
    return defaultConfigs;
  }

  /**
   * Gets the external.
   *
   * host and portname.
   *
   * @return the external
   */
  public InstanceResourceEndpoint getExternal() {
    return external;
  }

  /**
   * Gets the grpcApiEndpoint.
   *
   * host and portname.
   *
   * @return the grpcApiEndpoint
   */
  public InstanceResourceEndpoint getGrpcApiEndpoint() {
    return grpcApiEndpoint;
  }

  /**
   * Gets the hostname.
   *
   * Instance Host name.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the id.
   *
   * ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instanceCrn.
   *
   * instance CRN.
   *
   * @return the instanceCrn
   */
  public String getInstanceCrn() {
    return instanceCrn;
  }

  /**
   * Gets the instanceId.
   *
   * instance id.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the internal.
   *
   * host and portname.
   *
   * @return the internal
   */
  public InstanceResourceEndpoint getInternal() {
    return internal;
  }

  /**
   * Gets the jdbcClass.
   *
   * JDBC Class.
   *
   * @return the jdbcClass
   */
  public String getJdbcClass() {
    return jdbcClass;
  }

  /**
   * Gets the jdbcUrls.
   *
   * JDBC Thrift Urls.
   *
   * @return the jdbcUrls
   */
  public JdbcThriftUrls getJdbcUrls() {
    return jdbcUrls;
  }

  /**
   * Gets the mdsRestUrls.
   *
   * MDS Rest Urls.
   *
   * @return the mdsRestUrls
   */
  public MDSRestUrls getMdsRestUrls() {
    return mdsRestUrls;
  }

  /**
   * Gets the name.
   *
   * engines services name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the proxyApiEndpoint.
   *
   * host and portname.
   *
   * @return the proxyApiEndpoint
   */
  public InstanceResourceEndpoint getProxyApiEndpoint() {
    return proxyApiEndpoint;
  }

  /**
   * Gets the restApiEndpoint.
   *
   * host and portname.
   *
   * @return the restApiEndpoint
   */
  public InstanceResourceEndpoint getRestApiEndpoint() {
    return restApiEndpoint;
  }

  /**
   * Gets the restHostname.
   *
   * Rest Host name.
   *
   * @return the restHostname
   */
  public String getRestHostname() {
    return restHostname;
  }

  /**
   * Gets the restPort.
   *
   * Rest Port.
   *
   * @return the restPort
   */
  public Long getRestPort() {
    return restPort;
  }

  /**
   * Gets the sparkEngineEndpoint.
   *
   * Spark Engine endpoint.
   *
   * @return the sparkEngineEndpoint
   */
  public String getSparkEngineEndpoint() {
    return sparkEngineEndpoint;
  }

  /**
   * Gets the sslCertificate.
   *
   * ssl certificate.
   *
   * @return the sslCertificate
   */
  public String getSslCertificate() {
    return sslCertificate;
  }

  /**
   * Gets the thriftUrls.
   *
   * JDBC Thrift Urls.
   *
   * @return the thriftUrls
   */
  public JdbcThriftUrls getThriftUrls() {
    return thriftUrls;
  }

  /**
   * Gets the type.
   *
   * Type of engine/service.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the version.
   *
   * engine version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the watsonxDataApplicationEndpoint.
   *
   * Watsonx data application endpoint.
   *
   * @return the watsonxDataApplicationEndpoint
   */
  public String getWatsonxDataApplicationEndpoint() {
    return watsonxDataApplicationEndpoint;
  }
}

