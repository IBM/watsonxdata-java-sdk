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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * create engine successful.
 */
public class CreateNetezzaEngineCreatedBody extends GenericModel {

  protected NetezzaEngine engine;
  protected SuccessResponse response;

  protected CreateNetezzaEngineCreatedBody() { }

  /**
   * Gets the engine.
   *
   * Netezza engine details.
   *
   * @return the engine
   */
  public NetezzaEngine getEngine() {
    return engine;
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

