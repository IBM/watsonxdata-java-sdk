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
 * The createDriverDatabaseCatalog options.
 */
public class CreateDriverDatabaseCatalogOptions extends GenericModel {

  protected InputStream driver;
  protected String driverFileName;
  protected String databaseDisplayName;
  protected String databaseType;
  protected String catalogName;
  protected String hostname;
  protected String port;
  protected String username;
  protected String password;
  protected String databaseName;
  protected String driverContentType;
  protected String certificate;
  protected String certificateExtension;
  protected String ssl;
  protected String description;
  protected String createdOn;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private InputStream driver;
    private String driverFileName;
    private String databaseDisplayName;
    private String databaseType;
    private String catalogName;
    private String hostname;
    private String port;
    private String username;
    private String password;
    private String databaseName;
    private String driverContentType;
    private String certificate;
    private String certificateExtension;
    private String ssl;
    private String description;
    private String createdOn;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDriverDatabaseCatalogOptions instance.
     *
     * @param createDriverDatabaseCatalogOptions the instance to initialize the Builder with
     */
    private Builder(CreateDriverDatabaseCatalogOptions createDriverDatabaseCatalogOptions) {
      this.driver = createDriverDatabaseCatalogOptions.driver;
      this.driverFileName = createDriverDatabaseCatalogOptions.driverFileName;
      this.databaseDisplayName = createDriverDatabaseCatalogOptions.databaseDisplayName;
      this.databaseType = createDriverDatabaseCatalogOptions.databaseType;
      this.catalogName = createDriverDatabaseCatalogOptions.catalogName;
      this.hostname = createDriverDatabaseCatalogOptions.hostname;
      this.port = createDriverDatabaseCatalogOptions.port;
      this.username = createDriverDatabaseCatalogOptions.username;
      this.password = createDriverDatabaseCatalogOptions.password;
      this.databaseName = createDriverDatabaseCatalogOptions.databaseName;
      this.driverContentType = createDriverDatabaseCatalogOptions.driverContentType;
      this.certificate = createDriverDatabaseCatalogOptions.certificate;
      this.certificateExtension = createDriverDatabaseCatalogOptions.certificateExtension;
      this.ssl = createDriverDatabaseCatalogOptions.ssl;
      this.description = createDriverDatabaseCatalogOptions.description;
      this.createdOn = createDriverDatabaseCatalogOptions.createdOn;
      this.authInstanceId = createDriverDatabaseCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param driver the driver
     * @param driverFileName the driverFileName
     * @param databaseDisplayName the databaseDisplayName
     * @param databaseType the databaseType
     * @param catalogName the catalogName
     * @param hostname the hostname
     * @param port the port
     * @param username the username
     * @param password the password
     * @param databaseName the databaseName
     */
    public Builder(InputStream driver, String driverFileName, String databaseDisplayName, String databaseType, String catalogName, String hostname, String port, String username, String password, String databaseName) {
      this.driver = driver;
      this.driverFileName = driverFileName;
      this.databaseDisplayName = databaseDisplayName;
      this.databaseType = databaseType;
      this.catalogName = catalogName;
      this.hostname = hostname;
      this.port = port;
      this.username = username;
      this.password = password;
      this.databaseName = databaseName;
    }

    /**
     * Builds a CreateDriverDatabaseCatalogOptions.
     *
     * @return the new CreateDriverDatabaseCatalogOptions instance
     */
    public CreateDriverDatabaseCatalogOptions build() {
      return new CreateDriverDatabaseCatalogOptions(this);
    }

    /**
     * Set the driver.
     *
     * @param driver the driver
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder driver(InputStream driver) {
      this.driver = driver;
      return this;
    }

    /**
     * Set the driverFileName.
     *
     * @param driverFileName the driverFileName
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder driverFileName(String driverFileName) {
      this.driverFileName = driverFileName;
      return this;
    }

    /**
     * Set the databaseDisplayName.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder databaseDisplayName(String databaseDisplayName) {
      this.databaseDisplayName = databaseDisplayName;
      return this;
    }

    /**
     * Set the databaseType.
     *
     * @param databaseType the databaseType
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder databaseType(String databaseType) {
      this.databaseType = databaseType;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder port(String port) {
      this.port = port;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the databaseName.
     *
     * @param databaseName the databaseName
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder databaseName(String databaseName) {
      this.databaseName = databaseName;
      return this;
    }

    /**
     * Set the driverContentType.
     *
     * @param driverContentType the driverContentType
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder driverContentType(String driverContentType) {
      this.driverContentType = driverContentType;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder ssl(String ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the createdOn.
     *
     * @param createdOn the createdOn
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder createdOn(String createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDriverDatabaseCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the driver.
     *
     * @param driver the driver
     * @return the CreateDriverDatabaseCatalogOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder driver(File driver) throws FileNotFoundException {
      this.driver = new FileInputStream(driver);
      return this;
    }
  }

  protected CreateDriverDatabaseCatalogOptions() { }

  protected CreateDriverDatabaseCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.driver,
      "driver cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.driverFileName,
      "driverFileName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseDisplayName,
      "databaseDisplayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseType,
      "databaseType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hostname,
      "hostname cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseName,
      "databaseName cannot be null");
    driver = builder.driver;
    driverFileName = builder.driverFileName;
    databaseDisplayName = builder.databaseDisplayName;
    databaseType = builder.databaseType;
    catalogName = builder.catalogName;
    hostname = builder.hostname;
    port = builder.port;
    username = builder.username;
    password = builder.password;
    databaseName = builder.databaseName;
    driverContentType = builder.driverContentType;
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    ssl = builder.ssl;
    description = builder.description;
    createdOn = builder.createdOn;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDriverDatabaseCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the driver.
   *
   * Driver file to upload.
   *
   * @return the driver
   */
  public InputStream driver() {
    return driver;
  }

  /**
   * Gets the driverFileName.
   *
   * Name of the driver file.
   *
   * @return the driverFileName
   */
  public String driverFileName() {
    return driverFileName;
  }

  /**
   * Gets the databaseDisplayName.
   *
   * Database display name.
   *
   * @return the databaseDisplayName
   */
  public String databaseDisplayName() {
    return databaseDisplayName;
  }

  /**
   * Gets the databaseType.
   *
   * Connector type.
   *
   * @return the databaseType
   */
  public String databaseType() {
    return databaseType;
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
   * Gets the hostname.
   *
   * Host name.
   *
   * @return the hostname
   */
  public String hostname() {
    return hostname;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public String port() {
    return port;
  }

  /**
   * Gets the username.
   *
   * Username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the password.
   *
   * Psssword.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the databaseName.
   *
   * Database name.
   *
   * @return the databaseName
   */
  public String databaseName() {
    return databaseName;
  }

  /**
   * Gets the driverContentType.
   *
   * The content type of driver. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the driverContentType
   */
  public String driverContentType() {
    return driverContentType;
  }

  /**
   * Gets the certificate.
   *
   * contents of a pem/crt file.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the certificateExtension.
   *
   * extension of the certificate file.
   *
   * @return the certificateExtension
   */
  public String certificateExtension() {
    return certificateExtension;
  }

  /**
   * Gets the ssl.
   *
   * SSL Mode.
   *
   * @return the ssl
   */
  public String ssl() {
    return ssl;
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

