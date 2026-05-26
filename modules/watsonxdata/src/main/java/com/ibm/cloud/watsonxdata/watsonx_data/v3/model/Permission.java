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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Permission.
 */
public class Permission extends GenericModel {

  /**
   * Eligible permission that the specific user can have on the resource type identifier provided. Resource types can be
   * presto, prestissimo, spark, milvus, database, catalogs and storages.
   */
  public interface Action {
    /** can_administer. */
    String CAN_ADMINISTER = "can_administer";
    /** can_manage. */
    String CAN_MANAGE = "can_manage";
    /** can_use. */
    String CAN_USE = "can_use";
    /** can_write. */
    String CAN_WRITE = "can_write";
    /** can_read. */
    String CAN_READ = "can_read";
    /** milvus_db_creator. */
    String MILVUS_DB_CREATOR = "milvus_db_creator";
    /** milvus_collection_creator. */
    String MILVUS_COLLECTION_CREATOR = "milvus_collection_creator";
    /** milvus_partition_creator. */
    String MILVUS_PARTITION_CREATOR = "milvus_partition_creator";
    /** schema_owner. */
    String SCHEMA_OWNER = "schema_owner";
    /** table_owner. */
    String TABLE_OWNER = "table_owner";
  }

  /**
   * Permission type to the resource. It can be explicit or implicit.
   */
  public interface PermissionType {
    /** explicit. */
    String EXPLICIT = "explicit";
    /** implicit. */
    String IMPLICIT = "implicit";
  }

  protected String action;
  @SerializedName("permission_type")
  protected String permissionType;

  protected Permission() { }

  /**
   * Gets the action.
   *
   * Eligible permission that the specific user can have on the resource type identifier provided. Resource types can be
   * presto, prestissimo, spark, milvus, database, catalogs and storages.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the permissionType.
   *
   * Permission type to the resource. It can be explicit or implicit.
   *
   * @return the permissionType
   */
  public String getPermissionType() {
    return permissionType;
  }
}

