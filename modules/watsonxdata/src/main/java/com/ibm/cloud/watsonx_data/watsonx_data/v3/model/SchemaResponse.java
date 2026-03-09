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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Get schema details.
 */
public class SchemaResponse extends GenericModel {

  protected String catalog;
  protected String location;
  protected String message;
  @SerializedName("message_code")
  protected String messageCode;
  protected String owner;
  protected SchemaResponseSummary schema;
  @SerializedName("schema_name")
  protected String schemaName;
  protected String storage;

  protected SchemaResponse() { }

  /**
   * Gets the catalog.
   *
   * The catalog that this schema is associated to.
   *
   * @return the catalog
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * Gets the location.
   *
   * schema location.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the message.
   *
   * Response message string.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the messageCode.
   *
   * Message code string.
   *
   * @return the messageCode
   */
  public String getMessageCode() {
    return messageCode;
  }

  /**
   * Gets the owner.
   *
   * Owner of the storage.
   *
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * Gets the schema.
   *
   * Summary of the schema response.
   *
   * @return the schema
   */
  public SchemaResponseSummary getSchema() {
    return schema;
  }

  /**
   * Gets the schemaName.
   *
   * Name of the schema.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * Gets the storage.
   *
   * The storage linked to the catalog.
   *
   * @return the storage
   */
  public String getStorage() {
    return storage;
  }
}

