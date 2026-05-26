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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RuleV2.
 */
public class RuleV2 extends GenericModel {

  /**
   * defines the effect of the data policy. Values can be allow or deny. Deny will have priority over allow.
   */
  public interface Effect {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  protected List<String> actions;
  protected String effect;
  protected List<RuleGrantee> grantees;
  @SerializedName("transform_columns")
  protected TransformColumnProperties transformColumns;
  @SerializedName("transform_rows")
  protected RowFilterProperties transformRows;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> actions;
    private String effect;
    private List<RuleGrantee> grantees;
    private TransformColumnProperties transformColumns;
    private RowFilterProperties transformRows;

    /**
     * Instantiates a new Builder from an existing RuleV2 instance.
     *
     * @param ruleV2 the instance to initialize the Builder with
     */
    private Builder(RuleV2 ruleV2) {
      this.actions = ruleV2.actions;
      this.effect = ruleV2.effect;
      this.grantees = ruleV2.grantees;
      this.transformColumns = ruleV2.transformColumns;
      this.transformRows = ruleV2.transformRows;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actions the actions
     * @param grantees the grantees
     */
    public Builder(List<String> actions, List<RuleGrantee> grantees) {
      this.actions = actions;
      this.grantees = grantees;
    }

    /**
     * Builds a RuleV2.
     *
     * @return the new RuleV2 instance
     */
    public RuleV2 build() {
      return new RuleV2(this);
    }

    /**
     * Adds a new element to actions.
     *
     * @param actions the new element to be added
     * @return the RuleV2 builder
     */
    public Builder addActions(String actions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(actions,
        "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<String>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Adds a new element to grantees.
     *
     * @param grantees the new element to be added
     * @return the RuleV2 builder
     */
    public Builder addGrantees(RuleGrantee grantees) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(grantees,
        "grantees cannot be null");
      if (this.grantees == null) {
        this.grantees = new ArrayList<RuleGrantee>();
      }
      this.grantees.add(grantees);
      return this;
    }

    /**
     * Set the actions.
     * Existing actions will be replaced.
     *
     * @param actions the actions
     * @return the RuleV2 builder
     */
    public Builder actions(List<String> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * Set the effect.
     *
     * @param effect the effect
     * @return the RuleV2 builder
     */
    public Builder effect(String effect) {
      this.effect = effect;
      return this;
    }

    /**
     * Set the grantees.
     * Existing grantees will be replaced.
     *
     * @param grantees the grantees
     * @return the RuleV2 builder
     */
    public Builder grantees(List<RuleGrantee> grantees) {
      this.grantees = grantees;
      return this;
    }

    /**
     * Set the transformColumns.
     *
     * @param transformColumns the transformColumns
     * @return the RuleV2 builder
     */
    public Builder transformColumns(TransformColumnProperties transformColumns) {
      this.transformColumns = transformColumns;
      return this;
    }

    /**
     * Set the transformRows.
     *
     * @param transformRows the transformRows
     * @return the RuleV2 builder
     */
    public Builder transformRows(RowFilterProperties transformRows) {
      this.transformRows = transformRows;
      return this;
    }
  }

  protected RuleV2() { }

  protected RuleV2(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actions,
      "actions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.grantees,
      "grantees cannot be null");
    actions = builder.actions;
    effect = builder.effect;
    grantees = builder.grantees;
    transformColumns = builder.transformColumns;
    transformRows = builder.transformRows;
  }

  /**
   * New builder.
   *
   * @return a RuleV2 builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actions.
   *
   * the actions to enforce when the data policy triggers.
   *
   * @return the actions
   */
  public List<String> actions() {
    return actions;
  }

  /**
   * Gets the effect.
   *
   * defines the effect of the data policy. Values can be allow or deny. Deny will have priority over allow.
   *
   * @return the effect
   */
  public String effect() {
    return effect;
  }

  /**
   * Gets the grantees.
   *
   * the grantees to be granted. Each rule grantee contains type, key and value. Type can be user_identity or tag. key
   * can be user_name, group_id or attribute_name. Value can be name of user_name or the group id of access user group.
   *
   * @return the grantees
   */
  public List<RuleGrantee> grantees() {
    return grantees;
  }

  /**
   * Gets the transformColumns.
   *
   * Defines column-level data masking transformation properties. This schema specifies the type of masking to apply to
   * sensitive data columns, optional masking conditions, and the list of users or groups (grantees) who are authorized
   * to view the masked data. Column masking helps protect sensitive information while maintaining data utility for
   * authorized users.
   *
   * @return the transformColumns
   */
  public TransformColumnProperties transformColumns() {
    return transformColumns;
  }

  /**
   * Gets the transformRows.
   *
   * Defines row-level filtering properties for data access control. This schema specifies filter conditions that
   * determine which rows of data are visible to specific users or groups (grantees). Row filtering enables fine-grained
   * access control by restricting data visibility based on row attribute values, ensuring users only see data they are
   * authorized to access.
   *
   * @return the transformRows
   */
  public RowFilterProperties transformRows() {
    return transformRows;
  }
}

