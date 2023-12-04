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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Application Details.
 */
public class SparkEngineApplicationStatusApplicationDetails extends GenericModel {

  protected String application;
  protected List<String> arguments;
  protected SparkEngineApplicationStatusApplicationDetailsConf conf;
  protected Map<String, Object> env;
  protected String name;

  protected SparkEngineApplicationStatusApplicationDetails() { }

  /**
   * Gets the application.
   *
   * Engine display name.
   *
   * @return the application
   */
  public String getApplication() {
    return application;
  }

  /**
   * Gets the arguments.
   *
   * List of arguments.
   *
   * @return the arguments
   */
  public List<String> getArguments() {
    return arguments;
  }

  /**
   * Gets the conf.
   *
   * Application.
   *
   * @return the conf
   */
  public SparkEngineApplicationStatusApplicationDetailsConf getConf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Environment variables.
   *
   * @return the env
   */
  public Map<String, Object> getEnv() {
    return env;
  }

  /**
   * Gets the name.
   *
   * Application name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

