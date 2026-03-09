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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSalIntegrationGlossaryUploadProcesses options.
 */
public class CreateSalIntegrationGlossaryUploadProcessesOptions extends GenericModel {

  /**
   * glossary upload replace option.
   */
  public interface ReplaceOption {
    /** all. */
    String ALL = "all";
    /** specified. */
    String SPECIFIED = "specified";
    /** empty. */
    String EMPTY = "empty";
  }

  protected InputStream glossaryCsv;
  protected String replaceOption;
  protected String glossaryCsvContentType;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private InputStream glossaryCsv;
    private String replaceOption;
    private String glossaryCsvContentType;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationGlossaryUploadProcessesOptions instance.
     *
     * @param createSalIntegrationGlossaryUploadProcessesOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationGlossaryUploadProcessesOptions createSalIntegrationGlossaryUploadProcessesOptions) {
      this.glossaryCsv = createSalIntegrationGlossaryUploadProcessesOptions.glossaryCsv;
      this.replaceOption = createSalIntegrationGlossaryUploadProcessesOptions.replaceOption;
      this.glossaryCsvContentType = createSalIntegrationGlossaryUploadProcessesOptions.glossaryCsvContentType;
      this.authInstanceId = createSalIntegrationGlossaryUploadProcessesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param glossaryCsv the glossaryCsv
     * @param replaceOption the replaceOption
     */
    public Builder(InputStream glossaryCsv, String replaceOption) {
      this.glossaryCsv = glossaryCsv;
      this.replaceOption = replaceOption;
    }

    /**
     * Builds a CreateSalIntegrationGlossaryUploadProcessesOptions.
     *
     * @return the new CreateSalIntegrationGlossaryUploadProcessesOptions instance
     */
    public CreateSalIntegrationGlossaryUploadProcessesOptions build() {
      return new CreateSalIntegrationGlossaryUploadProcessesOptions(this);
    }

    /**
     * Set the glossaryCsv.
     *
     * @param glossaryCsv the glossaryCsv
     * @return the CreateSalIntegrationGlossaryUploadProcessesOptions builder
     */
    public Builder glossaryCsv(InputStream glossaryCsv) {
      this.glossaryCsv = glossaryCsv;
      return this;
    }

    /**
     * Set the replaceOption.
     *
     * @param replaceOption the replaceOption
     * @return the CreateSalIntegrationGlossaryUploadProcessesOptions builder
     */
    public Builder replaceOption(String replaceOption) {
      this.replaceOption = replaceOption;
      return this;
    }

    /**
     * Set the glossaryCsvContentType.
     *
     * @param glossaryCsvContentType the glossaryCsvContentType
     * @return the CreateSalIntegrationGlossaryUploadProcessesOptions builder
     */
    public Builder glossaryCsvContentType(String glossaryCsvContentType) {
      this.glossaryCsvContentType = glossaryCsvContentType;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationGlossaryUploadProcessesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the glossaryCsv.
     *
     * @param glossaryCsv the glossaryCsv
     * @return the CreateSalIntegrationGlossaryUploadProcessesOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder glossaryCsv(File glossaryCsv) throws FileNotFoundException {
      this.glossaryCsv = new FileInputStream(glossaryCsv);
      return this;
    }
  }

  protected CreateSalIntegrationGlossaryUploadProcessesOptions() { }

  protected CreateSalIntegrationGlossaryUploadProcessesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.glossaryCsv,
      "glossaryCsv cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replaceOption,
      "replaceOption cannot be null");
    glossaryCsv = builder.glossaryCsv;
    replaceOption = builder.replaceOption;
    glossaryCsvContentType = builder.glossaryCsvContentType;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationGlossaryUploadProcessesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the glossaryCsv.
   *
   * Glossary CSV file.
   *
   * @return the glossaryCsv
   */
  public InputStream glossaryCsv() {
    return glossaryCsv;
  }

  /**
   * Gets the replaceOption.
   *
   * glossary upload replace option.
   *
   * @return the replaceOption
   */
  public String replaceOption() {
    return replaceOption;
  }

  /**
   * Gets the glossaryCsvContentType.
   *
   * The content type of glossaryCsv. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the glossaryCsvContentType
   */
  public String glossaryCsvContentType() {
    return glossaryCsvContentType;
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

