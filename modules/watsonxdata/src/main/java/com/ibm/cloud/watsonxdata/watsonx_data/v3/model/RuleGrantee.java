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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RuleGrantee contain type which can be user_identity or tag. Use user_identity as type for user or group. Key can be
 * user_name for user or group_id for acess groups. Value can be username and access group id.
 */
public class RuleGrantee extends GenericModel {

  /**
   * grantee key can be user_name for user and group_id for user group.
   */
  public interface Key {
    /** user_name. */
    String USER_NAME = "user_name";
    /** group_id. */
    String GROUP_ID = "group_id";
    /** attribute_name. */
    String ATTRIBUTE_NAME = "attribute_name";
  }

  /**
   * grantee type. Values can be user_identity or tag.
   */
  public interface Type {
    /** user_identity. */
    String USER_IDENTITY = "user_identity";
    /** tag. */
    String TAG = "tag";
  }

  protected String key;
  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String type;
    private String value;

    /**
     * Instantiates a new Builder from an existing RuleGrantee instance.
     *
     * @param ruleGrantee the instance to initialize the Builder with
     */
    private Builder(RuleGrantee ruleGrantee) {
      this.key = ruleGrantee.key;
      this.type = ruleGrantee.type;
      this.value = ruleGrantee.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param key the key
     * @param type the type
     * @param value the value
     */
    public Builder(String key, String type, String value) {
      this.key = key;
      this.type = type;
      this.value = value;
    }

    /**
     * Builds a RuleGrantee.
     *
     * @return the new RuleGrantee instance
     */
    public RuleGrantee build() {
      return new RuleGrantee(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the RuleGrantee builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RuleGrantee builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the RuleGrantee builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected RuleGrantee() { }

  protected RuleGrantee(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    key = builder.key;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a RuleGrantee builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * grantee key can be user_name for user and group_id for user group.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the type.
   *
   * grantee type. Values can be user_identity or tag.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * grantee value can be username or group id.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

