/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark versions list.
 */
public class SparkVersions extends GenericModel {

  protected List<SparkVersionsInfoResponse> cpp;
  protected List<SparkVersionsInfoResponse> java;

  protected SparkVersions() { }

  /**
   * Gets the cpp.
   *
   * List of Cpp Spark versions.
   *
   * @return the cpp
   */
  public List<SparkVersionsInfoResponse> getCpp() {
    return cpp;
  }

  /**
   * Gets the java.
   *
   * List of Java Spark versions.
   *
   * @return the java
   */
  public List<SparkVersionsInfoResponse> getJava() {
    return java;
  }
}

