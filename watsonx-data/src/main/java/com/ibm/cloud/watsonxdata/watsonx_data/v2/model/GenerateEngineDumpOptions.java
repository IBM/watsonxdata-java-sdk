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
 * The generateEngineDump options.
 */
public class GenerateEngineDumpOptions extends GenericModel {

  protected String dumpFileName;
  protected String dumpType;
  protected String engineId;
  protected String podName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dumpFileName;
    private String dumpType;
    private String engineId;
    private String podName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GenerateEngineDumpOptions instance.
     *
     * @param generateEngineDumpOptions the instance to initialize the Builder with
     */
    private Builder(GenerateEngineDumpOptions generateEngineDumpOptions) {
      this.dumpFileName = generateEngineDumpOptions.dumpFileName;
      this.dumpType = generateEngineDumpOptions.dumpType;
      this.engineId = generateEngineDumpOptions.engineId;
      this.podName = generateEngineDumpOptions.podName;
      this.authInstanceId = generateEngineDumpOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dumpFileName the dumpFileName
     * @param dumpType the dumpType
     * @param engineId the engineId
     * @param podName the podName
     */
    public Builder(String dumpFileName, String dumpType, String engineId, String podName) {
      this.dumpFileName = dumpFileName;
      this.dumpType = dumpType;
      this.engineId = engineId;
      this.podName = podName;
    }

    /**
     * Builds a GenerateEngineDumpOptions.
     *
     * @return the new GenerateEngineDumpOptions instance
     */
    public GenerateEngineDumpOptions build() {
      return new GenerateEngineDumpOptions(this);
    }

    /**
     * Set the dumpFileName.
     *
     * @param dumpFileName the dumpFileName
     * @return the GenerateEngineDumpOptions builder
     */
    public Builder dumpFileName(String dumpFileName) {
      this.dumpFileName = dumpFileName;
      return this;
    }

    /**
     * Set the dumpType.
     *
     * @param dumpType the dumpType
     * @return the GenerateEngineDumpOptions builder
     */
    public Builder dumpType(String dumpType) {
      this.dumpType = dumpType;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GenerateEngineDumpOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the podName.
     *
     * @param podName the podName
     * @return the GenerateEngineDumpOptions builder
     */
    public Builder podName(String podName) {
      this.podName = podName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GenerateEngineDumpOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GenerateEngineDumpOptions() { }

  protected GenerateEngineDumpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dumpFileName,
      "dumpFileName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dumpType,
      "dumpType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.podName,
      "podName cannot be null");
    dumpFileName = builder.dumpFileName;
    dumpType = builder.dumpType;
    engineId = builder.engineId;
    podName = builder.podName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GenerateEngineDumpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dumpFileName.
   *
   * Dump file name.
   *
   * @return the dumpFileName
   */
  public String dumpFileName() {
    return dumpFileName;
  }

  /**
   * Gets the dumpType.
   *
   * Dump type.
   *
   * @return the dumpType
   */
  public String dumpType() {
    return dumpType;
  }

  /**
   * Gets the engineId.
   *
   * Engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the podName.
   *
   * specify the pod name like worker-0 or cordinator-0 etc.
   *
   * @return the podName
   */
  public String podName() {
    return podName;
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

