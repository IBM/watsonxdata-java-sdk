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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GetColumns OK.
 */
public class GetTableOKBody extends GenericModel {

  protected List<Column> columns;
  protected SuccessResponse response;

  protected GetTableOKBody() { }

  /**
   * Gets the columns.
   *
   * Columns.
   *
   * @return the columns
   */
  public List<Column> getColumns() {
    return columns;
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

