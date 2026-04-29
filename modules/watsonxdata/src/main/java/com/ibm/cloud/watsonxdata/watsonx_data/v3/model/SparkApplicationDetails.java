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

package com.ibm.cloud.watsonxdata.watsonx_data.v3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Application details.
 */
public class SparkApplicationDetails extends GenericModel {

  protected String application;
  protected String archives;
  protected List<String> arguments;
  @SerializedName("class")
  protected String xClass;
  protected Map<String, String> conf;
  protected Map<String, String> env;
  protected String files;
  protected String jars;
  protected String name;
  protected String packages;
  protected String repositories;
  protected SparkApplicationRuntime runtime;
  @SerializedName("spark_version")
  protected String sparkVersion;

  /**
   * Builder.
   */
  public static class Builder {
    private String application;
    private String archives;
    private List<String> arguments;
    private String xClass;
    private Map<String, String> conf;
    private Map<String, String> env;
    private String files;
    private String jars;
    private String name;
    private String packages;
    private String repositories;
    private SparkApplicationRuntime runtime;
    private String sparkVersion;

    /**
     * Instantiates a new Builder from an existing SparkApplicationDetails instance.
     *
     * @param sparkApplicationDetails the instance to initialize the Builder with
     */
    private Builder(SparkApplicationDetails sparkApplicationDetails) {
      this.application = sparkApplicationDetails.application;
      this.archives = sparkApplicationDetails.archives;
      this.arguments = sparkApplicationDetails.arguments;
      this.xClass = sparkApplicationDetails.xClass;
      this.conf = sparkApplicationDetails.conf;
      this.env = sparkApplicationDetails.env;
      this.files = sparkApplicationDetails.files;
      this.jars = sparkApplicationDetails.jars;
      this.name = sparkApplicationDetails.name;
      this.packages = sparkApplicationDetails.packages;
      this.repositories = sparkApplicationDetails.repositories;
      this.runtime = sparkApplicationDetails.runtime;
      this.sparkVersion = sparkApplicationDetails.sparkVersion;
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
     */
    public Builder(String application) {
      this.application = application;
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
     * Set the archives.
     *
     * @param archives the archives
     * @return the SparkApplicationDetails builder
     */
    public Builder archives(String archives) {
      this.archives = archives;
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
    public Builder conf(Map<String, String> conf) {
      this.conf = conf;
      return this;
    }

    /**
     * Set the env.
     *
     * @param env the env
     * @return the SparkApplicationDetails builder
     */
    public Builder env(Map<String, String> env) {
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
     * Set the runtime.
     *
     * @param runtime the runtime
     * @return the SparkApplicationDetails builder
     */
    public Builder runtime(SparkApplicationRuntime runtime) {
      this.runtime = runtime;
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
  }

  protected SparkApplicationDetails() { }

  protected SparkApplicationDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.application,
      "application cannot be null");
    application = builder.application;
    archives = builder.archives;
    arguments = builder.arguments;
    xClass = builder.xClass;
    conf = builder.conf;
    env = builder.env;
    files = builder.files;
    jars = builder.jars;
    name = builder.name;
    packages = builder.packages;
    repositories = builder.repositories;
    runtime = builder.runtime;
    sparkVersion = builder.sparkVersion;
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
   * Path/URL for the application script or jar file. The file can be in object storage or in a mounted volume (volumes
   * available only in software).
   *
   * @return the application
   */
  public String application() {
    return application;
  }

  /**
   * Gets the archives.
   *
   * Comma separated list of zip file paths in object storage or volumes. These files will be extracted and loaded into
   * the working directory of all executor nodes of the Spark cluster created to run this application.
   *
   * @return the archives
   */
  public String archives() {
    return archives;
  }

  /**
   * Gets the arguments.
   *
   * List of arguments. This should be set if the application script requires any arguments.
   *
   * @return the arguments
   */
  public List<String> arguments() {
    return arguments;
  }

  /**
   * Gets the xClass.
   *
   * Main class for application jar. Set only if using a jar file for application.
   *
   * @return the xClass
   */
  public String xClass() {
    return xClass;
  }

  /**
   * Gets the conf.
   *
   * Default Spark configuration properties to be updated. To remove a property, set its value to null.
   *
   * @return the conf
   */
  public Map<String, String> conf() {
    return conf;
  }

  /**
   * Gets the env.
   *
   * Default Spark configuration properties to be updated. To remove a property, set its value to null.
   *
   * @return the env
   */
  public Map<String, String> env() {
    return env;
  }

  /**
   * Gets the files.
   *
   * Comma separated list of file paths in object storage or volumes. These files will be loaded into the working
   * directory of all executor nodes of the Spark cluster created to run this application.
   *
   * @return the files
   */
  public String files() {
    return files;
  }

  /**
   * Gets the jars.
   *
   * Comma separated list for file paths for jars in object storage or volumes. These files will be loaded into the
   * classpath of executor and driver nodes of the Spark application cluster. This should be set only if the application
   * is a jar file and if you want to satisfy third party library dependencies of the application via these jars.
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
   * Comma separated list of package identifiers that recognizable by maven. These packages will be downloaded from
   * default maven repo or any additional maven repositories that you may have specified in the request. Applicable only
   * for java/scala applications.
   *
   * @return the packages
   */
  public String packages() {
    return packages;
  }

  /**
   * Gets the repositories.
   *
   * Comma separated list of maven repository urls. In addition to default maven repo, the repositories specified here
   * will be used to search for any specified packages. Applicable only for java/scala applications.
   *
   * @return the repositories
   */
  public String repositories() {
    return repositories;
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
}

