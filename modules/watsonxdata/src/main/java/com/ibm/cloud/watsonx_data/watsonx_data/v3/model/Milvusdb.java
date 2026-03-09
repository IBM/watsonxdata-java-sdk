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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Details of the Milvus database.
 *
 * This type supports additional properties of type Object.
 */
public class Milvusdb extends DynamicModel<Object> {

  @SerializedName("id")
  protected String id;

  public Milvusdb() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * List of databases.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }
}
