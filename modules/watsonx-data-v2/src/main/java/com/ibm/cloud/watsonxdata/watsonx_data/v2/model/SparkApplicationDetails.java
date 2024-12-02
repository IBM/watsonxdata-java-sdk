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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Application details.
 */
public class SparkApplicationDetails extends GenericModel {

  protected String application;
  protected List<String> arguments;
  @SerializedName("class")
  protected String xClass;
  protected SparkApplicationConfig conf;
  protected SparkApplicationEnv env;
  protected String files;
  protected String jars;
  protected String name;
  protected String packages;
  protected String repositories;
  @SerializedName("spark_version")
  protected String sparkVersion;
  protected SparkApplicationDetailsRuntime runtime;

  /**
   * Builder.
   */
  public static class Builder {
    private String application;
    private List<String> arguments;
    private String xClass;
    private SparkApplicationConfig conf;
    private SparkApplicationEnv env;
    private String files;
    private String jars;
    private String name;
    private String packages;
    private String repositories;
    private String sparkVersion;
    private SparkApplicationDetailsRuntime runtime;

    /**
     * Instantiates a new Builder from an existing SparkApplicationDetails instance.
     *
     * @param sparkApplicationDetails the instance to initialize the Builder with
     */
    private Builder(SparkApplicationDetails sparkApplicationDetails) {
      this.application = sparkApplicationDetails.application;
      this.arguments = sparkApplicationDetails.arguments;
      this.xClass = sparkApplicationDetails.xClass;
      this.conf = sparkApplicationDetails.conf;
      this.env = sparkApplicationDetails.env;
      this.files = sparkApplicationDetails.files;
      this.jars = sparkApplicationDetails.jars;
      this.name = sparkApplicationDetails.name;
      this.packages = sparkApplicationDetails.packages;
      this.repositories = sparkApplicationDetails.repositories;
      this.sparkVersion = sparkApplicationDetails.sparkVersion;
      this.runtime = sparkApplicationDetails.runtime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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
     * Set the xClass.
     *
     * @param xClass the xClass
     * @return the SparkApplicationDetails builder
     */
    public Builder xClass(String xClass) {
      this.xClass = xClass;
      return this;
    }

    /**
     * Set the conf.
     *
     * @param conf the conf
     * @return the SparkApplicationDetails builder
     */
    public Builder conf(SparkApplicationConfig conf) {
      this.conf = conf;
      return this;
    }

    /**
     * Set the env.
     *
     * @param env the env
     * @return the SparkApplicationDetails builder
     */
    public Builder env(SparkApplicationEnv env) {
      this.env = env;
      return this;
    }

    /**
     * Set the files.
     *
     * @param files the files
     * @return the SparkApplicationDetails builder
     */
    public Builder files(String files) {
      this.files = files;
      return this;
    }

    /**
     * Set the jars.
     *
     * @param jars the jars
     * @return the SparkApplicationDetails builder
     */
    public Builder jars(String jars) {
      this.jars = jars;
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

    /**
     * Set the packages.
     *
     * @param packages the packages
     * @return the SparkApplicationDetails builder
     */
    public Builder packages(String packages) {
      this.packages = packages;
      return this;
    }

    /**
     * Set the repositories.
     *
     * @param repositories the repositories
     * @return the SparkApplicationDetails builder
     */
    public Builder repositories(String repositories) {
      this.repositories = repositories;
      return this;
    }

    /**
     * Set the sparkVersion.
     *
     * @param sparkVersion the sparkVersion
     * @return the SparkApplicationDetails builder
     */
    public Builder sparkVersion(String sparkVersion) {
      this.sparkVersion = sparkVersion;
      return this;
    }

    /**
     * Set the runtime.
     *
     * @param runtime the runtime
     * @return the SparkApplicationDetails builder
     */
    public Builder runtime(SparkApplicationDetailsRuntime runtime) {
      this.runtime = runtime;
      return this;
    }
  }

  protected SparkApplicationDetails() { }

  protected SparkApplicationDetails(Builder builder) {
    application = builder.application;
    arguments = builder.arguments;
    xClass = builder.xClass;
    conf = builder.conf;
    env = builder.env;
    files = builder.files;
    jars = builder.jars;
    name = builder.name;
    packages = builder.packages;
    repositories = builder.repositories;
    sparkVersion = builder.sparkVersion;
    runtime = builder.runtime;
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
   * Gets the xClass.
   *
   * Class.
   *
   * @return the xClass
   */
  public String xClass() {
    return xClass;
  }

  /**
   * Gets the conf.
   *
   * Spark applications details configuration.
   *
   * @return the conf
   */
  public SparkApplicationConfig conf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Spark applications details env samples.
   *
   * @return the env
   */
  public SparkApplicationEnv env() {
    return env;
  }

  /**
   * Gets the files.
   *
   * Files.
   *
   * @return the files
   */
  public String files() {
    return files;
  }

  /**
   * Gets the jars.
   *
   * Jars.
   *
   * @return the jars
   */
  public String jars() {
    return jars;
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

  /**
   * Gets the packages.
   *
   * Packages.
   *
   * @return the packages
   */
  public String packages() {
    return packages;
  }

  /**
   * Gets the repositories.
   *
   * Repositories.
   *
   * @return the repositories
   */
  public String repositories() {
    return repositories;
  }

  /**
   * Gets the sparkVersion.
   *
   * Spark Version.
   *
   * @return the sparkVersion
   */
  public String sparkVersion() {
    return sparkVersion;
  }

  /**
   * Gets the runtime.
   *
   * application run time.
   *
   * @return the runtime
   */
  public SparkApplicationDetailsRuntime runtime() {
    return runtime;
  }
}

