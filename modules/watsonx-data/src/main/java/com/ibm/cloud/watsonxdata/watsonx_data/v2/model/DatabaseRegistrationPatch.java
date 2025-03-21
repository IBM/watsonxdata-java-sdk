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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * update db body.
 */
public class DatabaseRegistrationPatch extends GenericModel {

  @SerializedName("database_details")
  protected DatabaseRegistrationPatchDatabaseDetails databaseDetails;
  @SerializedName("database_display_name")
  protected String databaseDisplayName;
  protected String description;
  protected List<String> tags;
  protected List<DatabaseRegistrationPatchTopicsItems> topics;

  /**
   * Builder.
   */
  public static class Builder {
    private DatabaseRegistrationPatchDatabaseDetails databaseDetails;
    private String databaseDisplayName;
    private String description;
    private List<String> tags;
    private List<DatabaseRegistrationPatchTopicsItems> topics;

    /**
     * Instantiates a new Builder from an existing DatabaseRegistrationPatch instance.
     *
     * @param databaseRegistrationPatch the instance to initialize the Builder with
     */
    private Builder(DatabaseRegistrationPatch databaseRegistrationPatch) {
      this.databaseDetails = databaseRegistrationPatch.databaseDetails;
      this.databaseDisplayName = databaseRegistrationPatch.databaseDisplayName;
      this.description = databaseRegistrationPatch.description;
      this.tags = databaseRegistrationPatch.tags;
      this.topics = databaseRegistrationPatch.topics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseRegistrationPatch.
     *
     * @return the new DatabaseRegistrationPatch instance
     */
    public DatabaseRegistrationPatch build() {
      return new DatabaseRegistrationPatch(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the DatabaseRegistrationPatch builder
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
     * Adds a new element to topics.
     *
     * @param topics the new element to be added
     * @return the DatabaseRegistrationPatch builder
     */
    public Builder addTopics(DatabaseRegistrationPatchTopicsItems topics) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(topics,
        "topics cannot be null");
      if (this.topics == null) {
        this.topics = new ArrayList<DatabaseRegistrationPatchTopicsItems>();
      }
      this.topics.add(topics);
      return this;
    }

    /**
     * Set the databaseDetails.
     *
     * @param databaseDetails the databaseDetails
     * @return the DatabaseRegistrationPatch builder
     */
    public Builder databaseDetails(DatabaseRegistrationPatchDatabaseDetails databaseDetails) {
      this.databaseDetails = databaseDetails;
      return this;
    }

    /**
     * Set the databaseDisplayName.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @return the DatabaseRegistrationPatch builder
     */
    public Builder databaseDisplayName(String databaseDisplayName) {
      this.databaseDisplayName = databaseDisplayName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DatabaseRegistrationPatch builder
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
     * @return the DatabaseRegistrationPatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the topics.
     * Existing topics will be replaced.
     *
     * @param topics the topics
     * @return the DatabaseRegistrationPatch builder
     */
    public Builder topics(List<DatabaseRegistrationPatchTopicsItems> topics) {
      this.topics = topics;
      return this;
    }
  }

  protected DatabaseRegistrationPatch() { }

  protected DatabaseRegistrationPatch(Builder builder) {
    databaseDetails = builder.databaseDetails;
    databaseDisplayName = builder.databaseDisplayName;
    description = builder.description;
    tags = builder.tags;
    topics = builder.topics;
  }

  /**
   * New builder.
   *
   * @return a DatabaseRegistrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseDetails.
   *
   * New database details.
   *
   * @return the databaseDetails
   */
  public DatabaseRegistrationPatchDatabaseDetails databaseDetails() {
    return databaseDetails;
  }

  /**
   * Gets the databaseDisplayName.
   *
   * New database display name.
   *
   * @return the databaseDisplayName
   */
  public String databaseDisplayName() {
    return databaseDisplayName;
  }

  /**
   * Gets the description.
   *
   * New database description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tags.
   *
   * New tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the topics.
   *
   * List of topics.
   *
   * @return the topics
   */
  public List<DatabaseRegistrationPatchTopicsItems> topics() {
    return topics;
  }

  /**
   * Construct a JSON merge-patch from the DatabaseRegistrationPatch.
   *
   * Note that properties of the DatabaseRegistrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the DatabaseRegistrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

