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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDriverRegistration options.
 */
public class CreateDriverRegistrationOptions extends GenericModel {

  protected InputStream driver;
  protected String driverName;
  protected String connectionType;
  protected String driverContentType;
  protected String version;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private InputStream driver;
    private String driverName;
    private String connectionType;
    private String driverContentType;
    private String version;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDriverRegistrationOptions instance.
     *
     * @param createDriverRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateDriverRegistrationOptions createDriverRegistrationOptions) {
      this.driver = createDriverRegistrationOptions.driver;
      this.driverName = createDriverRegistrationOptions.driverName;
      this.connectionType = createDriverRegistrationOptions.connectionType;
      this.driverContentType = createDriverRegistrationOptions.driverContentType;
      this.version = createDriverRegistrationOptions.version;
      this.authInstanceId = createDriverRegistrationOptions.authInstanceId;
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
     * @param driverName the driverName
     * @param connectionType the connectionType
     */
    public Builder(InputStream driver, String driverName, String connectionType) {
      this.driver = driver;
      this.driverName = driverName;
      this.connectionType = connectionType;
    }

    /**
     * Builds a CreateDriverRegistrationOptions.
     *
     * @return the new CreateDriverRegistrationOptions instance
     */
    public CreateDriverRegistrationOptions build() {
      return new CreateDriverRegistrationOptions(this);
    }

    /**
     * Set the driver.
     *
     * @param driver the driver
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder driver(InputStream driver) {
      this.driver = driver;
      return this;
    }

    /**
     * Set the driverName.
     *
     * @param driverName the driverName
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder driverName(String driverName) {
      this.driverName = driverName;
      return this;
    }

    /**
     * Set the connectionType.
     *
     * @param connectionType the connectionType
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder connectionType(String connectionType) {
      this.connectionType = connectionType;
      return this;
    }

    /**
     * Set the driverContentType.
     *
     * @param driverContentType the driverContentType
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder driverContentType(String driverContentType) {
      this.driverContentType = driverContentType;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDriverRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the driver.
     *
     * @param driver the driver
     * @return the CreateDriverRegistrationOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder driver(File driver) throws FileNotFoundException {
      this.driver = new FileInputStream(driver);
      return this;
    }
  }

  protected CreateDriverRegistrationOptions() { }

  protected CreateDriverRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.driver,
      "driver cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.driverName,
      "driverName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionType,
      "connectionType cannot be null");
    driver = builder.driver;
    driverName = builder.driverName;
    connectionType = builder.connectionType;
    driverContentType = builder.driverContentType;
    version = builder.version;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDriverRegistrationOptions builder
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
   * Gets the driverName.
   *
   * Driver name.
   *
   * @return the driverName
   */
  public String driverName() {
    return driverName;
  }

  /**
   * Gets the connectionType.
   *
   * Driver connection type.
   *
   * @return the connectionType
   */
  public String connectionType() {
    return connectionType;
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
   * Gets the version.
   *
   * Driver status.
   *
   * @return the version
   */
  public String version() {
    return version;
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

