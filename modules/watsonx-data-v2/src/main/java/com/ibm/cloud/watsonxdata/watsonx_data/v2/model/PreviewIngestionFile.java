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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schema of the data in the source file.
 */
public class PreviewIngestionFile extends GenericModel {

  @SerializedName("column_names")
  protected List<String> columnNames;
  @SerializedName("column_types")
  protected List<String> columnTypes;
  @SerializedName("file_name")
  protected String fileName;
  protected PreviewIngestionFileRows rows;

  protected PreviewIngestionFile() { }

  /**
   * Gets the columnNames.
   *
   * Array of column names of the table.
   *
   * @return the columnNames
   */
  public List<String> getColumnNames() {
    return columnNames;
  }

  /**
   * Gets the columnTypes.
   *
   * Array of column types of the table.
   *
   * @return the columnTypes
   */
  public List<String> getColumnTypes() {
    return columnTypes;
  }

  /**
   * Gets the fileName.
   *
   * Name of the file being previewed.
   *
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Gets the rows.
   *
   * First 10 rows of the table.
   *
   * @return the rows
   */
  public PreviewIngestionFileRows getRows() {
    return rows;
  }
}

