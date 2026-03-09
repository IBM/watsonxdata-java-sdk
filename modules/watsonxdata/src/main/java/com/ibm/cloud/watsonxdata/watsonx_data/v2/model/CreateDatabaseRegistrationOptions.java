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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDatabaseRegistration options.
 */
public class CreateDatabaseRegistrationOptions extends GenericModel {

  protected String displayName;
  protected String type;
  protected DatabaseCatalogPrototype associatedCatalog;
  protected DatabaseDetailsPrototype connection;
  protected String createdAt;
  protected String description;
  protected List<DatabaseRegistrationPrototypeDatabasePropertiesItems> xProperties;
  protected String sourceAssetId;
  protected String sourceCatalogId;
  protected String sourceProjectId;
  protected List<String> tags;
  protected String targetCatalogId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String type;
    private DatabaseCatalogPrototype associatedCatalog;
    private DatabaseDetailsPrototype connection;
    private String createdAt;
    private String description;
    private List<DatabaseRegistrationPrototypeDatabasePropertiesItems> xProperties;
    private String sourceAssetId;
    private String sourceCatalogId;
    private String sourceProjectId;
    private List<String> tags;
    private String targetCatalogId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDatabaseRegistrationOptions instance.
     *
     * @param createDatabaseRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions) {
      this.displayName = createDatabaseRegistrationOptions.displayName;
      this.type = createDatabaseRegistrationOptions.type;
      this.associatedCatalog = createDatabaseRegistrationOptions.associatedCatalog;
      this.connection = createDatabaseRegistrationOptions.connection;
      this.createdAt = createDatabaseRegistrationOptions.createdAt;
      this.description = createDatabaseRegistrationOptions.description;
      this.xProperties = createDatabaseRegistrationOptions.xProperties;
      this.sourceAssetId = createDatabaseRegistrationOptions.sourceAssetId;
      this.sourceCatalogId = createDatabaseRegistrationOptions.sourceCatalogId;
      this.sourceProjectId = createDatabaseRegistrationOptions.sourceProjectId;
      this.tags = createDatabaseRegistrationOptions.tags;
      this.targetCatalogId = createDatabaseRegistrationOptions.targetCatalogId;
      this.authInstanceId = createDatabaseRegistrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param displayName the displayName
     * @param type the type
     */
    public Builder(String displayName, String type) {
      this.displayName = displayName;
      this.type = type;
    }

    /**
     * Builds a CreateDatabaseRegistrationOptions.
     *
     * @return the new CreateDatabaseRegistrationOptions instance
     */
    public CreateDatabaseRegistrationOptions build() {
      return new CreateDatabaseRegistrationOptions(this);
    }

    /**
     * Adds a new element to xProperties.
     *
     * @param xProperties the new element to be added
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder addXProperties(DatabaseRegistrationPrototypeDatabasePropertiesItems xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<DatabaseRegistrationPrototypeDatabasePropertiesItems>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the associatedCatalog.
     *
     * @param associatedCatalog the associatedCatalog
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder associatedCatalog(DatabaseCatalogPrototype associatedCatalog) {
      this.associatedCatalog = associatedCatalog;
      return this;
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder connection(DatabaseDetailsPrototype connection) {
      this.connection = connection;
      return this;
    }

    /**
     * Set the createdAt.
     *
     * @param createdAt the createdAt
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the xProperties.
     * Existing xProperties will be replaced.
     *
     * @param xProperties the xProperties
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder xProperties(List<DatabaseRegistrationPrototypeDatabasePropertiesItems> xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the sourceAssetId.
     *
     * @param sourceAssetId the sourceAssetId
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder sourceAssetId(String sourceAssetId) {
      this.sourceAssetId = sourceAssetId;
      return this;
    }

    /**
     * Set the sourceCatalogId.
     *
     * @param sourceCatalogId the sourceCatalogId
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder sourceCatalogId(String sourceCatalogId) {
      this.sourceCatalogId = sourceCatalogId;
      return this;
    }

    /**
     * Set the sourceProjectId.
     *
     * @param sourceProjectId the sourceProjectId
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder sourceProjectId(String sourceProjectId) {
      this.sourceProjectId = sourceProjectId;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the targetCatalogId.
     *
     * @param targetCatalogId the targetCatalogId
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder targetCatalogId(String targetCatalogId) {
      this.targetCatalogId = targetCatalogId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateDatabaseRegistrationOptions() { }

  protected CreateDatabaseRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    displayName = builder.displayName;
    type = builder.type;
    associatedCatalog = builder.associatedCatalog;
    connection = builder.connection;
    createdAt = builder.createdAt;
    description = builder.description;
    xProperties = builder.xProperties;
    sourceAssetId = builder.sourceAssetId;
    sourceCatalogId = builder.sourceCatalogId;
    sourceProjectId = builder.sourceProjectId;
    tags = builder.tags;
    targetCatalogId = builder.targetCatalogId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDatabaseRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * Database display name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the type.
   *
   * Connector type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the associatedCatalog.
   *
   * database catalog.
   *
   * @return the associatedCatalog
   */
  public DatabaseCatalogPrototype associatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the connection.
   *
   * database details.
   *
   * @return the connection
   */
  public DatabaseDetailsPrototype connection() {
    return connection;
  }

  /**
   * Gets the createdAt.
   *
   * Created on.
   *
   * @return the createdAt
   */
  public String createdAt() {
    return createdAt;
  }

  /**
   * Gets the description.
   *
   * Database description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the xProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the xProperties
   */
  public List<DatabaseRegistrationPrototypeDatabasePropertiesItems> xProperties() {
    return xProperties;
  }

  /**
   * Gets the sourceAssetId.
   *
   * Source connection assset Id from platform.
   *
   * @return the sourceAssetId
   */
  public String sourceAssetId() {
    return sourceAssetId;
  }

  /**
   * Gets the sourceCatalogId.
   *
   * Source catalog Id from platform.
   *
   * @return the sourceCatalogId
   */
  public String sourceCatalogId() {
    return sourceCatalogId;
  }

  /**
   * Gets the sourceProjectId.
   *
   * Source project Id from platform.
   *
   * @return the sourceProjectId
   */
  public String sourceProjectId() {
    return sourceProjectId;
  }

  /**
   * Gets the tags.
   *
   * tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the targetCatalogId.
   *
   * Target catalog id in the platform to save the database connection.
   *
   * @return the targetCatalogId
   */
  public String targetCatalogId() {
    return targetCatalogId;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

