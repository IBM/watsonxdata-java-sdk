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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark Query Server details prototype.
 */
public class SparkEngineQueryServerDetailsPrototypes extends GenericModel {

  protected Map<String, String> conf;
  protected Map<String, String> env;
  protected String name;
  protected SparkApplicationRuntime runtime;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> conf;
    private Map<String, String> env;
    private String name;
    private SparkApplicationRuntime runtime;

    /**
     * Instantiates a new Builder from an existing SparkEngineQueryServerDetailsPrototypes instance.
     *
     * @param sparkEngineQueryServerDetailsPrototypes the instance to initialize the Builder with
     */
    private Builder(SparkEngineQueryServerDetailsPrototypes sparkEngineQueryServerDetailsPrototypes) {
      this.conf = sparkEngineQueryServerDetailsPrototypes.conf;
      this.env = sparkEngineQueryServerDetailsPrototypes.env;
      this.name = sparkEngineQueryServerDetailsPrototypes.name;
      this.runtime = sparkEngineQueryServerDetailsPrototypes.runtime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineQueryServerDetailsPrototypes.
     *
     * @return the new SparkEngineQueryServerDetailsPrototypes instance
     */
    public SparkEngineQueryServerDetailsPrototypes build() {
      return new SparkEngineQueryServerDetailsPrototypes(this);
    }

    /**
     * Set the conf.
     *
     * @param conf the conf
     * @return the SparkEngineQueryServerDetailsPrototypes builder
     */
    public Builder conf(Map<String, String> conf) {
      this.conf = conf;
      return this;
    }

    /**
     * Set the env.
     *
     * @param env the env
     * @return the SparkEngineQueryServerDetailsPrototypes builder
     */
    public Builder env(Map<String, String> env) {
      this.env = env;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SparkEngineQueryServerDetailsPrototypes builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the runtime.
     *
     * @param runtime the runtime
     * @return the SparkEngineQueryServerDetailsPrototypes builder
     */
    public Builder runtime(SparkApplicationRuntime runtime) {
      this.runtime = runtime;
      return this;
    }
  }

  protected SparkEngineQueryServerDetailsPrototypes() { }

  protected SparkEngineQueryServerDetailsPrototypes(Builder builder) {
    conf = builder.conf;
    env = builder.env;
    name = builder.name;
    runtime = builder.runtime;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineQueryServerDetailsPrototypes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the conf.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the conf
   */
  public Map<String, String> conf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the env
   */
  public Map<String, String> env() {
    return env;
  }

  /**
   * Gets the name.
   *
   * Query Server name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the runtime.
   *
   * Application runtime configuration.
   *
   * @return the runtime
   */
  public SparkApplicationRuntime runtime() {
    return runtime;
  }
}

