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
 * First 10 rows of the table.
 */
public class PreviewIngestionFileRows extends GenericModel {

  @SerializedName("row_eight")
  protected List<String> rowEight;
  @SerializedName("row_five")
  protected List<String> rowFive;
  @SerializedName("row_four")
  protected List<String> rowFour;
  @SerializedName("row_nine")
  protected List<String> rowNine;
  @SerializedName("row_one")
  protected List<String> rowOne;
  @SerializedName("row_seven")
  protected List<String> rowSeven;
  @SerializedName("row_six")
  protected List<String> rowSix;
  @SerializedName("row_ten")
  protected List<String> rowTen;
  @SerializedName("row_three")
  protected List<String> rowThree;
  @SerializedName("row_two")
  protected List<String> rowTwo;

  protected PreviewIngestionFileRows() { }

  /**
   * Gets the rowEight.
   *
   * Each rows slice.
   *
   * @return the rowEight
   */
  public List<String> getRowEight() {
    return rowEight;
  }

  /**
   * Gets the rowFive.
   *
   * Each rows slice.
   *
   * @return the rowFive
   */
  public List<String> getRowFive() {
    return rowFive;
  }

  /**
   * Gets the rowFour.
   *
   * Each rows slice.
   *
   * @return the rowFour
   */
  public List<String> getRowFour() {
    return rowFour;
  }

  /**
   * Gets the rowNine.
   *
   * Each rows slice.
   *
   * @return the rowNine
   */
  public List<String> getRowNine() {
    return rowNine;
  }

  /**
   * Gets the rowOne.
   *
   * Each rows slice.
   *
   * @return the rowOne
   */
  public List<String> getRowOne() {
    return rowOne;
  }

  /**
   * Gets the rowSeven.
   *
   * Each rows slice.
   *
   * @return the rowSeven
   */
  public List<String> getRowSeven() {
    return rowSeven;
  }

  /**
   * Gets the rowSix.
   *
   * Each rows slice.
   *
   * @return the rowSix
   */
  public List<String> getRowSix() {
    return rowSix;
  }

  /**
   * Gets the rowTen.
   *
   * Each rows slice.
   *
   * @return the rowTen
   */
  public List<String> getRowTen() {
    return rowTen;
  }

  /**
   * Gets the rowThree.
   *
   * Each rows slice.
   *
   * @return the rowThree
   */
  public List<String> getRowThree() {
    return rowThree;
  }

  /**
   * Gets the rowTwo.
   *
   * Each rows slice.
   *
   * @return the rowTwo
   */
  public List<String> getRowTwo() {
    return rowTwo;
  }
}

