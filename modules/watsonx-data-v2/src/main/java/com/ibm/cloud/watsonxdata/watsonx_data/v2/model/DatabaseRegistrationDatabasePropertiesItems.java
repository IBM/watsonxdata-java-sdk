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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Key value object.
 */
public class DatabaseRegistrationDatabasePropertiesItems extends GenericModel {

  protected Boolean encrypt;
  protected String key;
  protected String value;

  protected DatabaseRegistrationDatabasePropertiesItems() { }

  /**
   * Gets the encrypt.
   *
   * Wether the value is to be encrypted before storing.
   *
   * @return the encrypt
   */
  public Boolean isEncrypt() {
    return encrypt;
  }

  /**
   * Gets the key.
   *
   * Key of the database property.
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }

  /**
   * Gets the value.
   *
   * Value of the database property.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

