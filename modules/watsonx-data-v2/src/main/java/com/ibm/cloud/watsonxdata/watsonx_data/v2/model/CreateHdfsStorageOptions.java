/*
 * (C) Copyright IBM Corp. 2024.
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createHdfsStorage options.
 */
public class CreateHdfsStorageOptions extends GenericModel {

  protected String bucketDisplayName;
  protected String bucketType;
  protected String hmsThriftUri;
  protected Long hmsThriftPort;
  protected String coreSite;
  protected String hdfsSite;
  protected String kerberos;
  protected String catalogName;
  protected String catalogType;
  protected String krb5Config;
  protected InputStream hiveKeytab;
  protected String hiveKeytabContentType;
  protected InputStream hdfsKeytab;
  protected String hdfsKeytabContentType;
  protected String hiveServerPrincipal;
  protected String hiveClientPrincipal;
  protected String hdfsPrincipal;
  protected String description;
  protected String createdOn;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketDisplayName;
    private String bucketType;
    private String hmsThriftUri;
    private Long hmsThriftPort;
    private String coreSite;
    private String hdfsSite;
    private String kerberos;
    private String catalogName;
    private String catalogType;
    private String krb5Config;
    private InputStream hiveKeytab;
    private String hiveKeytabContentType;
    private InputStream hdfsKeytab;
    private String hdfsKeytabContentType;
    private String hiveServerPrincipal;
    private String hiveClientPrincipal;
    private String hdfsPrincipal;
    private String description;
    private String createdOn;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateHdfsStorageOptions instance.
     *
     * @param createHdfsStorageOptions the instance to initialize the Builder with
     */
    private Builder(CreateHdfsStorageOptions createHdfsStorageOptions) {
      this.bucketDisplayName = createHdfsStorageOptions.bucketDisplayName;
      this.bucketType = createHdfsStorageOptions.bucketType;
      this.hmsThriftUri = createHdfsStorageOptions.hmsThriftUri;
      this.hmsThriftPort = createHdfsStorageOptions.hmsThriftPort;
      this.coreSite = createHdfsStorageOptions.coreSite;
      this.hdfsSite = createHdfsStorageOptions.hdfsSite;
      this.kerberos = createHdfsStorageOptions.kerberos;
      this.catalogName = createHdfsStorageOptions.catalogName;
      this.catalogType = createHdfsStorageOptions.catalogType;
      this.krb5Config = createHdfsStorageOptions.krb5Config;
      this.hiveKeytab = createHdfsStorageOptions.hiveKeytab;
      this.hiveKeytabContentType = createHdfsStorageOptions.hiveKeytabContentType;
      this.hdfsKeytab = createHdfsStorageOptions.hdfsKeytab;
      this.hdfsKeytabContentType = createHdfsStorageOptions.hdfsKeytabContentType;
      this.hiveServerPrincipal = createHdfsStorageOptions.hiveServerPrincipal;
      this.hiveClientPrincipal = createHdfsStorageOptions.hiveClientPrincipal;
      this.hdfsPrincipal = createHdfsStorageOptions.hdfsPrincipal;
      this.description = createHdfsStorageOptions.description;
      this.createdOn = createHdfsStorageOptions.createdOn;
      this.authInstanceId = createHdfsStorageOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @param bucketType the bucketType
     * @param hmsThriftUri the hmsThriftUri
     * @param hmsThriftPort the hmsThriftPort
     * @param coreSite the coreSite
     * @param hdfsSite the hdfsSite
     * @param kerberos the kerberos
     * @param catalogName the catalogName
     * @param catalogType the catalogType
     */
    public Builder(String bucketDisplayName, String bucketType, String hmsThriftUri, Long hmsThriftPort, String coreSite, String hdfsSite, String kerberos, String catalogName, String catalogType) {
      this.bucketDisplayName = bucketDisplayName;
      this.bucketType = bucketType;
      this.hmsThriftUri = hmsThriftUri;
      this.hmsThriftPort = hmsThriftPort;
      this.coreSite = coreSite;
      this.hdfsSite = hdfsSite;
      this.kerberos = kerberos;
      this.catalogName = catalogName;
      this.catalogType = catalogType;
    }

    /**
     * Builds a CreateHdfsStorageOptions.
     *
     * @return the new CreateHdfsStorageOptions instance
     */
    public CreateHdfsStorageOptions build() {
      return new CreateHdfsStorageOptions(this);
    }

    /**
     * Set the bucketDisplayName.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder bucketDisplayName(String bucketDisplayName) {
      this.bucketDisplayName = bucketDisplayName;
      return this;
    }

    /**
     * Set the bucketType.
     *
     * @param bucketType the bucketType
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder bucketType(String bucketType) {
      this.bucketType = bucketType;
      return this;
    }

    /**
     * Set the hmsThriftUri.
     *
     * @param hmsThriftUri the hmsThriftUri
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hmsThriftUri(String hmsThriftUri) {
      this.hmsThriftUri = hmsThriftUri;
      return this;
    }

    /**
     * Set the hmsThriftPort.
     *
     * @param hmsThriftPort the hmsThriftPort
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hmsThriftPort(long hmsThriftPort) {
      this.hmsThriftPort = hmsThriftPort;
      return this;
    }

    /**
     * Set the coreSite.
     *
     * @param coreSite the coreSite
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder coreSite(String coreSite) {
      this.coreSite = coreSite;
      return this;
    }

    /**
     * Set the hdfsSite.
     *
     * @param hdfsSite the hdfsSite
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hdfsSite(String hdfsSite) {
      this.hdfsSite = hdfsSite;
      return this;
    }

    /**
     * Set the kerberos.
     *
     * @param kerberos the kerberos
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder kerberos(String kerberos) {
      this.kerberos = kerberos;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }

    /**
     * Set the krb5Config.
     *
     * @param krb5Config the krb5Config
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder krb5Config(String krb5Config) {
      this.krb5Config = krb5Config;
      return this;
    }

    /**
     * Set the hiveKeytab.
     *
     * @param hiveKeytab the hiveKeytab
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hiveKeytab(InputStream hiveKeytab) {
      this.hiveKeytab = hiveKeytab;
      return this;
    }

    /**
     * Set the hiveKeytabContentType.
     *
     * @param hiveKeytabContentType the hiveKeytabContentType
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hiveKeytabContentType(String hiveKeytabContentType) {
      this.hiveKeytabContentType = hiveKeytabContentType;
      return this;
    }

    /**
     * Set the hdfsKeytab.
     *
     * @param hdfsKeytab the hdfsKeytab
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hdfsKeytab(InputStream hdfsKeytab) {
      this.hdfsKeytab = hdfsKeytab;
      return this;
    }

    /**
     * Set the hdfsKeytabContentType.
     *
     * @param hdfsKeytabContentType the hdfsKeytabContentType
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hdfsKeytabContentType(String hdfsKeytabContentType) {
      this.hdfsKeytabContentType = hdfsKeytabContentType;
      return this;
    }

    /**
     * Set the hiveServerPrincipal.
     *
     * @param hiveServerPrincipal the hiveServerPrincipal
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hiveServerPrincipal(String hiveServerPrincipal) {
      this.hiveServerPrincipal = hiveServerPrincipal;
      return this;
    }

    /**
     * Set the hiveClientPrincipal.
     *
     * @param hiveClientPrincipal the hiveClientPrincipal
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hiveClientPrincipal(String hiveClientPrincipal) {
      this.hiveClientPrincipal = hiveClientPrincipal;
      return this;
    }

    /**
     * Set the hdfsPrincipal.
     *
     * @param hdfsPrincipal the hdfsPrincipal
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder hdfsPrincipal(String hdfsPrincipal) {
      this.hdfsPrincipal = hdfsPrincipal;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the createdOn.
     *
     * @param createdOn the createdOn
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder createdOn(String createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateHdfsStorageOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the hiveKeytab.
     *
     * @param hiveKeytab the hiveKeytab
     * @return the CreateHdfsStorageOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder hiveKeytab(File hiveKeytab) throws FileNotFoundException {
      this.hiveKeytab = new FileInputStream(hiveKeytab);
      return this;
    }

    /**
     * Set the hdfsKeytab.
     *
     * @param hdfsKeytab the hdfsKeytab
     * @return the CreateHdfsStorageOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder hdfsKeytab(File hdfsKeytab) throws FileNotFoundException {
      this.hdfsKeytab = new FileInputStream(hdfsKeytab);
      return this;
    }
  }

  protected CreateHdfsStorageOptions() { }

  protected CreateHdfsStorageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketDisplayName,
      "bucketDisplayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketType,
      "bucketType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hmsThriftUri,
      "hmsThriftUri cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hmsThriftPort,
      "hmsThriftPort cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.coreSite,
      "coreSite cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hdfsSite,
      "hdfsSite cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.kerberos,
      "kerberos cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogType,
      "catalogType cannot be null");
    bucketDisplayName = builder.bucketDisplayName;
    bucketType = builder.bucketType;
    hmsThriftUri = builder.hmsThriftUri;
    hmsThriftPort = builder.hmsThriftPort;
    coreSite = builder.coreSite;
    hdfsSite = builder.hdfsSite;
    kerberos = builder.kerberos;
    catalogName = builder.catalogName;
    catalogType = builder.catalogType;
    krb5Config = builder.krb5Config;
    hiveKeytab = builder.hiveKeytab;
    hiveKeytabContentType = builder.hiveKeytabContentType;
    hdfsKeytab = builder.hdfsKeytab;
    hdfsKeytabContentType = builder.hdfsKeytabContentType;
    hiveServerPrincipal = builder.hiveServerPrincipal;
    hiveClientPrincipal = builder.hiveClientPrincipal;
    hdfsPrincipal = builder.hdfsPrincipal;
    description = builder.description;
    createdOn = builder.createdOn;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateHdfsStorageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketDisplayName.
   *
   * Bucket display name.
   *
   * @return the bucketDisplayName
   */
  public String bucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the bucketType.
   *
   * Bucket type.
   *
   * @return the bucketType
   */
  public String bucketType() {
    return bucketType;
  }

  /**
   * Gets the hmsThriftUri.
   *
   * HMS Thrift URI.
   *
   * @return the hmsThriftUri
   */
  public String hmsThriftUri() {
    return hmsThriftUri;
  }

  /**
   * Gets the hmsThriftPort.
   *
   * HMS Thrift Port.
   *
   * @return the hmsThriftPort
   */
  public Long hmsThriftPort() {
    return hmsThriftPort;
  }

  /**
   * Gets the coreSite.
   *
   * contents of core-site.xml file.
   *
   * @return the coreSite
   */
  public String coreSite() {
    return coreSite;
  }

  /**
   * Gets the hdfsSite.
   *
   * contents of hdfs-site.xml file.
   *
   * @return the hdfsSite
   */
  public String hdfsSite() {
    return hdfsSite;
  }

  /**
   * Gets the kerberos.
   *
   * Kerberos Flag.
   *
   * @return the kerberos
   */
  public String kerberos() {
    return kerberos;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogType.
   *
   * Catalog type.
   *
   * @return the catalogType
   */
  public String catalogType() {
    return catalogType;
  }

  /**
   * Gets the krb5Config.
   *
   * Kerberos config file.
   *
   * @return the krb5Config
   */
  public String krb5Config() {
    return krb5Config;
  }

  /**
   * Gets the hiveKeytab.
   *
   * Hive keytab file.
   *
   * @return the hiveKeytab
   */
  public InputStream hiveKeytab() {
    return hiveKeytab;
  }

  /**
   * Gets the hiveKeytabContentType.
   *
   * The content type of hiveKeytab. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the hiveKeytabContentType
   */
  public String hiveKeytabContentType() {
    return hiveKeytabContentType;
  }

  /**
   * Gets the hdfsKeytab.
   *
   * HDFS keytab file.
   *
   * @return the hdfsKeytab
   */
  public InputStream hdfsKeytab() {
    return hdfsKeytab;
  }

  /**
   * Gets the hdfsKeytabContentType.
   *
   * The content type of hdfsKeytab. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the hdfsKeytabContentType
   */
  public String hdfsKeytabContentType() {
    return hdfsKeytabContentType;
  }

  /**
   * Gets the hiveServerPrincipal.
   *
   * Hive server principal.
   *
   * @return the hiveServerPrincipal
   */
  public String hiveServerPrincipal() {
    return hiveServerPrincipal;
  }

  /**
   * Gets the hiveClientPrincipal.
   *
   * Hive client principal.
   *
   * @return the hiveClientPrincipal
   */
  public String hiveClientPrincipal() {
    return hiveClientPrincipal;
  }

  /**
   * Gets the hdfsPrincipal.
   *
   * HDFS principal.
   *
   * @return the hdfsPrincipal
   */
  public String hdfsPrincipal() {
    return hdfsPrincipal;
  }

  /**
   * Gets the description.
   *
   * Database description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String createdOn() {
    return createdOn;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

