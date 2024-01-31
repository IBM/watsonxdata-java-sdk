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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Application details.
 */
public class SparkApplicationDetails extends GenericModel {

  protected String application;
  protected List<String> arguments;
  protected SparkApplicationDetailsConf conf;
  protected Map<String, Object> env;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String application;
    private List<String> arguments;
    private SparkApplicationDetailsConf conf;
    private Map<String, Object> env;
    private String name;

    /**
     * Instantiates a new Builder from an existing SparkApplicationDetails instance.
     *
     * @param sparkApplicationDetails the instance to initialize the Builder with
     */
    private Builder(SparkApplicationDetails sparkApplicationDetails) {
      this.application = sparkApplicationDetails.application;
      this.arguments = sparkApplicationDetails.arguments;
      this.conf = sparkApplicationDetails.conf;
      this.env = sparkApplicationDetails.env;
      this.name = sparkApplicationDetails.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param application the application
     * @param arguments the arguments
     * @param conf the conf
     * @param env the env
     */
    public Builder(String application, List<String> arguments, SparkApplicationDetailsConf conf, Map<String, Object> env) {
      this.application = application;
      this.arguments = arguments;
      this.conf = conf;
      this.env = env;
    }

    /**
     * Builds a SparkApplicationDetails.
     *
     * @return the new SparkApplicationDetails instance
     */
    public SparkApplicationDetails build() {
      return new SparkApplicationDetails(this);
    }

    /**
     * Adds a new element to arguments.
     *
     * @param arguments the new element to be added
     * @return the SparkApplicationDetails builder
     */
    public Builder addArguments(String arguments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(arguments,
        "arguments cannot be null");
      if (this.arguments == null) {
        this.arguments = new ArrayList<String>();
      }
      this.arguments.add(arguments);
      return this;
    }

    /**
     * Set the application.
     *
     * @param application the application
     * @return the SparkApplicationDetails builder
     */
    public Builder application(String application) {
      this.application = application;
      return this;
    }

    /**
     * Set the arguments.
     * Existing arguments will be replaced.
     *
     * @param arguments the arguments
     * @return the SparkApplicationDetails builder
     */
    public Builder arguments(List<String> arguments) {
      this.arguments = arguments;
      return this;
    }

    /**
     * Set the conf.
     *
     * @param conf the conf
     * @return the SparkApplicationDetails builder
     */
    public Builder conf(SparkApplicationDetailsConf conf) {
      this.conf = conf;
      return this;
    }

    /**
     * Set the env.
     *
     * @param env the env
     * @return the SparkApplicationDetails builder
     */
    public Builder env(Map<String, Object> env) {
      this.env = env;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SparkApplicationDetails builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected SparkApplicationDetails() { }

  protected SparkApplicationDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.application,
      "application cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.arguments,
      "arguments cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.conf,
      "conf cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.env,
      "env cannot be null");
    application = builder.application;
    arguments = builder.arguments;
    conf = builder.conf;
    env = builder.env;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the application.
   *
   * Application.
   *
   * @return the application
   */
  public String application() {
    return application;
  }

  /**
   * Gets the arguments.
   *
   * List of arguments.
   *
   * @return the arguments
   */
  public List<String> arguments() {
    return arguments;
  }

  /**
   * Gets the conf.
   *
   * Application.
   *
   * @return the conf
   */
  public SparkApplicationDetailsConf conf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Application.
   *
   * @return the env
   */
  public Map<String, Object> env() {
    return env;
  }

  /**
   * Gets the name.
   *
   * Display name of the spark application.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

