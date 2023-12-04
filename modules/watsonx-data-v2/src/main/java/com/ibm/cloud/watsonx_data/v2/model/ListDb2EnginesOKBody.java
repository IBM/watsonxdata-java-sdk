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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * list db2 engines.
 */
public class ListDb2EnginesOKBody extends GenericModel {

  @SerializedName("db2_engines")
  protected List<Db2Engine> db2Engines;
  protected SuccessResponse response;

  protected ListDb2EnginesOKBody() { }

  /**
   * Gets the db2Engines.
   *
   * list db2 engines.
   *
   * @return the db2Engines
   */
  public List<Db2Engine> getDb2Engines() {
    return db2Engines;
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

