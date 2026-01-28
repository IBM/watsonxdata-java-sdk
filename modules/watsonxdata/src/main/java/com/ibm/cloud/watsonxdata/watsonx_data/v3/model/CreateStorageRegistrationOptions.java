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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createStorageRegistration options.
 */
public class CreateStorageRegistrationOptions extends GenericModel {

  /**
   * managed by.
   */
  public interface ManagedBy {
    /** ibm. */
    String IBM = "ibm";
    /** customer. */
    String CUSTOMER = "customer";
  }

  /**
   * storage type.
   */
  public interface Type {
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** minio. */
    String MINIO = "minio";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
    /** ibm_ceph. */
    String IBM_CEPH = "ibm_ceph";
    /** adls_gen1. */
    String ADLS_GEN1 = "adls_gen1";
    /** adls_gen2. */
    String ADLS_GEN2 = "adls_gen2";
    /** google_cs. */
    String GOOGLE_CS = "google_cs";
    /** ozone. */
    String OZONE = "ozone";
    /** ibm_storage_scale. */
    String IBM_STORAGE_SCALE = "ibm_storage_scale";
    /** s3. */
    String S3 = "s3";
  }

  /**
   * bucket use to define whether the bucket is for query monitoring or acl.
   */
  public interface StorageUse {
    /** qhmm. */
    String QHMM = "qhmm";
    /** acl. */
    String ACL = "acl";
  }

  protected String description;
  protected String displayName;
  protected String managedBy;
  protected String type;
  protected StorageCatalogPrototype associatedCatalog;
  protected StorageDetails connection;
  protected String region;
  protected String storageUse;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String displayName;
    private String managedBy;
    private String type;
    private StorageCatalogPrototype associatedCatalog;
    private StorageDetails connection;
    private String region;
    private String storageUse;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateStorageRegistrationOptions instance.
     *
     * @param createStorageRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateStorageRegistrationOptions createStorageRegistrationOptions) {
      this.description = createStorageRegistrationOptions.description;
      this.displayName = createStorageRegistrationOptions.displayName;
      this.managedBy = createStorageRegistrationOptions.managedBy;
      this.type = createStorageRegistrationOptions.type;
      this.associatedCatalog = createStorageRegistrationOptions.associatedCatalog;
      this.connection = createStorageRegistrationOptions.connection;
      this.region = createStorageRegistrationOptions.region;
      this.storageUse = createStorageRegistrationOptions.storageUse;
      this.tags = createStorageRegistrationOptions.tags;
      this.authInstanceId = createStorageRegistrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param description the description
     * @param displayName the displayName
     * @param managedBy the managedBy
     * @param type the type
     */
    public Builder(String description, String displayName, String managedBy, String type) {
      this.description = description;
      this.displayName = displayName;
      this.managedBy = managedBy;
      this.type = type;
    }

    /**
     * Builds a CreateStorageRegistrationOptions.
     *
     * @return the new CreateStorageRegistrationOptions instance
     */
    public CreateStorageRegistrationOptions build() {
      return new CreateStorageRegistrationOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateStorageRegistrationOptions builder
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
     * Set the description.
     *
     * @param description the description
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the associatedCatalog.
     *
     * @param associatedCatalog the associatedCatalog
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder associatedCatalog(StorageCatalogPrototype associatedCatalog) {
      this.associatedCatalog = associatedCatalog;
      return this;
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder connection(StorageDetails connection) {
      this.connection = connection;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the storageUse.
     *
     * @param storageUse the storageUse
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder storageUse(String storageUse) {
      this.storageUse = storageUse;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateStorageRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateStorageRegistrationOptions() { }

  protected CreateStorageRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managedBy,
      "managedBy cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    description = builder.description;
    displayName = builder.displayName;
    managedBy = builder.managedBy;
    type = builder.type;
    associatedCatalog = builder.associatedCatalog;
    connection = builder.connection;
    region = builder.region;
    storageUse = builder.storageUse;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateStorageRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * storage description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Storage display name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the managedBy.
   *
   * managed by.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
  }

  /**
   * Gets the type.
   *
   * storage type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the associatedCatalog.
   *
   * storage catalog.
   *
   * @return the associatedCatalog
   */
  public StorageCatalogPrototype associatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the connection.
   *
   * storage details.
   *
   * @return the connection
   */
  public StorageDetails connection() {
    return connection;
  }

  /**
   * Gets the region.
   *
   * Region where the storage is located.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the storageUse.
   *
   * bucket use to define whether the bucket is for query monitoring or acl.
   *
   * @return the storageUse
   */
  public String storageUse() {
    return storageUse;
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
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

