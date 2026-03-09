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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark Query Server detail.
 */
public class SparkEngineQueryServerDetail extends GenericModel {

  protected Map<String, String> conf;
  protected Map<String, String> env;
  protected String name;
  @SerializedName("spark_version")
  protected String sparkVersion;

  protected SparkEngineQueryServerDetail() { }

  /**
   * Gets the conf.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the conf
   */
  public Map<String, String> getConf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the env
   */
  public Map<String, String> getEnv() {
    return env;
  }

  /**
   * Gets the name.
   *
   * Query Server name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the sparkVersion.
   *
   * Spark Version.
   *
   * @return the sparkVersion
   */
  public String getSparkVersion() {
    return sparkVersion;
  }
}

