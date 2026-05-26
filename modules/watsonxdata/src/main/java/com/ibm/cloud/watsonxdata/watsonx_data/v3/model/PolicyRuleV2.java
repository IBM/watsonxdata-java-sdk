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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PolicyRuleV2.
 */
public class PolicyRuleV2 extends GenericModel {

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
  protected TransformColumnResponseProperties transformColumns;
  @SerializedName("transform_rows")
  protected RowFilterProperties transformRows;

  protected PolicyRuleV2() { }

  /**
   * Gets the actions.
   *
   * the actions to enforce when the data policy triggers.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the effect.
   *
   * defines the effect of the data policy. Values can be allow or deny. Deny will have priority over allow.
   *
   * @return the effect
   */
  public String getEffect() {
    return effect;
  }

  /**
   * Gets the grantees.
   *
   * the grantees to be granted.
   *
   * @return the grantees
   */
  public List<RuleGrantee> getGrantees() {
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
  public TransformColumnResponseProperties getTransformColumns() {
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
  public RowFilterProperties getTransformRows() {
    return transformRows;
  }
}

