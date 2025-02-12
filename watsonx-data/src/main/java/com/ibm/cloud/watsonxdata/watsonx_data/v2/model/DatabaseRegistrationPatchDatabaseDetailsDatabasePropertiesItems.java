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
 * Key value object.
 */
public class DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems extends GenericModel {

  protected Boolean encrypt;
  protected String key;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean encrypt;
    private String key;
    private String value;

    /**
     * Instantiates a new Builder from an existing DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems instance.
     *
     * @param databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems the instance to initialize the Builder with
     */
    private Builder(DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems) {
      this.encrypt = databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.encrypt;
      this.key = databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.key;
      this.value = databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param encrypt the encrypt
     * @param key the key
     * @param value the value
     */
    public Builder(Boolean encrypt, String key, String value) {
      this.encrypt = encrypt;
      this.key = key;
      this.value = value;
    }

    /**
     * Builds a DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.
     *
     * @return the new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems instance
     */
    public DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems build() {
      return new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems(this);
    }

    /**
     * Set the encrypt.
     *
     * @param encrypt the encrypt
     * @return the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems builder
     */
    public Builder encrypt(Boolean encrypt) {
      this.encrypt = encrypt;
      return this;
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems() { }

  protected DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encrypt,
      "encrypt cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    encrypt = builder.encrypt;
    key = builder.key;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the encrypt.
   *
   * Indicates if the value must be encrypted before storing.
   *
   * @return the encrypt
   */
  public Boolean encrypt() {
    return encrypt;
  }

  /**
   * Gets the key.
   *
   * Key of the database property.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the value.
   *
   * Value of the database property.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

