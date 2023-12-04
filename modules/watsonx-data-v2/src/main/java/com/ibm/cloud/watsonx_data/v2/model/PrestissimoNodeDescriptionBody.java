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
 * Node details.
 */
public class PrestissimoNodeDescriptionBody extends GenericModel {

  @SerializedName("node_type")
  protected String nodeType;
  protected Long quantity;

  protected PrestissimoNodeDescriptionBody() { }

  /**
   * Gets the nodeType.
   *
   * Node Type, r5, m, i..
   *
   * @return the nodeType
   */
  public String getNodeType() {
    return nodeType;
  }

  /**
   * Gets the quantity.
   *
   * Number of nodes.
   *
   * @return the quantity
   */
  public Long getQuantity() {
    return quantity;
  }
}

