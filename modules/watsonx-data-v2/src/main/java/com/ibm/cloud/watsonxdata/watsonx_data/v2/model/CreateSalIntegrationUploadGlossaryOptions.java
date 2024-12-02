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
 * The createSalIntegrationUploadGlossary options.
 */
public class CreateSalIntegrationUploadGlossaryOptions extends GenericModel {

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

  protected String replaceOption;
  protected InputStream glossaryCsv;
  protected String glossaryCsvContentType;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String replaceOption;
    private InputStream glossaryCsv;
    private String glossaryCsvContentType;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationUploadGlossaryOptions instance.
     *
     * @param createSalIntegrationUploadGlossaryOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptions) {
      this.replaceOption = createSalIntegrationUploadGlossaryOptions.replaceOption;
      this.glossaryCsv = createSalIntegrationUploadGlossaryOptions.glossaryCsv;
      this.glossaryCsvContentType = createSalIntegrationUploadGlossaryOptions.glossaryCsvContentType;
      this.authInstanceId = createSalIntegrationUploadGlossaryOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param replaceOption the replaceOption
     */
    public Builder(String replaceOption) {
      this.replaceOption = replaceOption;
    }

    /**
     * Builds a CreateSalIntegrationUploadGlossaryOptions.
     *
     * @return the new CreateSalIntegrationUploadGlossaryOptions instance
     */
    public CreateSalIntegrationUploadGlossaryOptions build() {
      return new CreateSalIntegrationUploadGlossaryOptions(this);
    }

    /**
     * Set the replaceOption.
     *
     * @param replaceOption the replaceOption
     * @return the CreateSalIntegrationUploadGlossaryOptions builder
     */
    public Builder replaceOption(String replaceOption) {
      this.replaceOption = replaceOption;
      return this;
    }

    /**
     * Set the glossaryCsv.
     *
     * @param glossaryCsv the glossaryCsv
     * @return the CreateSalIntegrationUploadGlossaryOptions builder
     */
    public Builder glossaryCsv(InputStream glossaryCsv) {
      this.glossaryCsv = glossaryCsv;
      return this;
    }

    /**
     * Set the glossaryCsvContentType.
     *
     * @param glossaryCsvContentType the glossaryCsvContentType
     * @return the CreateSalIntegrationUploadGlossaryOptions builder
     */
    public Builder glossaryCsvContentType(String glossaryCsvContentType) {
      this.glossaryCsvContentType = glossaryCsvContentType;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationUploadGlossaryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the glossaryCsv.
     *
     * @param glossaryCsv the glossaryCsv
     * @return the CreateSalIntegrationUploadGlossaryOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder glossaryCsv(File glossaryCsv) throws FileNotFoundException {
      this.glossaryCsv = new FileInputStream(glossaryCsv);
      return this;
    }
  }

  protected CreateSalIntegrationUploadGlossaryOptions() { }

  protected CreateSalIntegrationUploadGlossaryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replaceOption,
      "replaceOption cannot be null");
    replaceOption = builder.replaceOption;
    glossaryCsv = builder.glossaryCsv;
    glossaryCsvContentType = builder.glossaryCsvContentType;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationUploadGlossaryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

