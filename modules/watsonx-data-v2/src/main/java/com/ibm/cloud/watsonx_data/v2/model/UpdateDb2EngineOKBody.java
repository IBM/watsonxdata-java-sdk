/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * update engine response.
 */
public class UpdateDb2EngineOKBody extends GenericModel {

  @SerializedName("db2_engine")
  protected Db2Engine db2Engine;
  protected SuccessResponse response;

  protected UpdateDb2EngineOKBody() { }

  /**
   * Gets the db2Engine.
   *
   * Db2 engine details.
   *
   * @return the db2Engine
   */
  public Db2Engine getDb2Engine() {
    return db2Engine;
  }

  /**
   * Gets the response.
   *
   * Response of success.
   *
   * @return the response
   */
  public SuccessResponse getResponse() {
    return response;
  }

}

