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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDatabaseRegistration options.
 */
public class CreateDatabaseRegistrationOptions extends GenericModel {

  protected String databaseDisplayName;
  protected String databaseType;
  protected DatabaseCatalog associatedCatalog;
  protected String createdOn;
  protected DatabaseDetails databaseDetails;
  protected List<DatabaseRegistrationPrototypeDatabasePropertiesItems> databaseProperties;
  protected String description;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseDisplayName;
    private String databaseType;
    private DatabaseCatalog associatedCatalog;
    private String createdOn;
    private DatabaseDetails databaseDetails;
    private List<DatabaseRegistrationPrototypeDatabasePropertiesItems> databaseProperties;
    private String description;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDatabaseRegistrationOptions instance.
     *
     * @param createDatabaseRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions) {
      this.databaseDisplayName = createDatabaseRegistrationOptions.databaseDisplayName;
      this.databaseType = createDatabaseRegistrationOptions.databaseType;
      this.associatedCatalog = createDatabaseRegistrationOptions.associatedCatalog;
      this.createdOn = createDatabaseRegistrationOptions.createdOn;
      this.databaseDetails = createDatabaseRegistrationOptions.databaseDetails;
      this.databaseProperties = createDatabaseRegistrationOptions.databaseProperties;
      this.description = createDatabaseRegistrationOptions.description;
      this.tags = createDatabaseRegistrationOptions.tags;
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
     * @param databaseDisplayName the databaseDisplayName
     * @param databaseType the databaseType
     */
    public Builder(String databaseDisplayName, String databaseType) {
      this.databaseDisplayName = databaseDisplayName;
      this.databaseType = databaseType;
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
     * Adds a new element to databaseProperties.
     *
     * @param databaseProperties the new element to be added
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder addDatabaseProperties(DatabaseRegistrationPrototypeDatabasePropertiesItems databaseProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(databaseProperties,
        "databaseProperties cannot be null");
      if (this.databaseProperties == null) {
        this.databaseProperties = new ArrayList<DatabaseRegistrationPrototypeDatabasePropertiesItems>();
      }
      this.databaseProperties.add(databaseProperties);
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
     * Set the databaseDisplayName.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder databaseDisplayName(String databaseDisplayName) {
      this.databaseDisplayName = databaseDisplayName;
      return this;
    }

    /**
     * Set the databaseType.
     *
     * @param databaseType the databaseType
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder databaseType(String databaseType) {
      this.databaseType = databaseType;
      return this;
    }

    /**
     * Set the associatedCatalog.
     *
     * @param associatedCatalog the associatedCatalog
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder associatedCatalog(DatabaseCatalog associatedCatalog) {
      this.associatedCatalog = associatedCatalog;
      return this;
    }

    /**
     * Set the createdOn.
     *
     * @param createdOn the createdOn
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder createdOn(String createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Set the databaseDetails.
     *
     * @param databaseDetails the databaseDetails
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder databaseDetails(DatabaseDetails databaseDetails) {
      this.databaseDetails = databaseDetails;
      return this;
    }

    /**
     * Set the databaseProperties.
     * Existing databaseProperties will be replaced.
     *
     * @param databaseProperties the databaseProperties
     * @return the CreateDatabaseRegistrationOptions builder
     */
    public Builder databaseProperties(List<DatabaseRegistrationPrototypeDatabasePropertiesItems> databaseProperties) {
      this.databaseProperties = databaseProperties;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseDisplayName,
      "databaseDisplayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseType,
      "databaseType cannot be null");
    databaseDisplayName = builder.databaseDisplayName;
    databaseType = builder.databaseType;
    associatedCatalog = builder.associatedCatalog;
    createdOn = builder.createdOn;
    databaseDetails = builder.databaseDetails;
    databaseProperties = builder.databaseProperties;
    description = builder.description;
    tags = builder.tags;
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
   * Gets the databaseDisplayName.
   *
   * Database display name.
   *
   * @return the databaseDisplayName
   */
  public String databaseDisplayName() {
    return databaseDisplayName;
  }

  /**
   * Gets the databaseType.
   *
   * Connector type.
   *
   * @return the databaseType
   */
  public String databaseType() {
    return databaseType;
  }

  /**
   * Gets the associatedCatalog.
   *
   * database catalog.
   *
   * @return the associatedCatalog
   */
  public DatabaseCatalog associatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String createdOn() {
    return createdOn;
  }

  /**
   * Gets the databaseDetails.
   *
   * database details.
   *
   * @return the databaseDetails
   */
  public DatabaseDetails databaseDetails() {
    return databaseDetails;
  }

  /**
   * Gets the databaseProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the databaseProperties
   */
  public List<DatabaseRegistrationPrototypeDatabasePropertiesItems> databaseProperties() {
    return databaseProperties;
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
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

