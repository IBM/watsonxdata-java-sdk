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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ColumnInfoAdditionalProperties.
 */
public class ColumnInfoAdditionalProperties extends GenericModel {

  @SerializedName("column_description")
  protected String columnDescription;
  @SerializedName("column_terms")
  protected List<Map<String, String>> columnTerms;
  @SerializedName("semantic_description")
  protected ColumnInfoAdditionalPropertiesSemanticDescription semanticDescription;
  @SerializedName("semantic_name")
  protected ColumnInfoAdditionalPropertiesSemanticName semanticName;

  protected ColumnInfoAdditionalProperties() { }

  /**
   * Gets the columnDescription.
   *
   * description of the column.
   *
   * @return the columnDescription
   */
  public String getColumnDescription() {
    return columnDescription;
  }

  /**
   * Gets the columnTerms.
   *
   * terms assinged to the column.
   *
   * @return the columnTerms
   */
  public List<Map<String, String>> getColumnTerms() {
    return columnTerms;
  }

  /**
   * Gets the semanticDescription.
   *
   * semantic description properties of the column.
   *
   * @return the semanticDescription
   */
  public ColumnInfoAdditionalPropertiesSemanticDescription getSemanticDescription() {
    return semanticDescription;
  }

  /**
   * Gets the semanticName.
   *
   * semantic name properties of the column.
   *
   * @return the semanticName
   */
  public ColumnInfoAdditionalPropertiesSemanticName getSemanticName() {
    return semanticName;
  }
}

