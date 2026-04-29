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
 * subject can be user or group who can access on the provided resource.
 */
public class SubjectBulkUpdateData extends GenericModel {

  /**
   * Subject type can be user or group.
   */
  public interface Type {
    /** user. */
    String USER = "user";
    /** group. */
    String GROUP = "group";
  }

  protected String type;
  protected String value;

  protected SubjectBulkUpdateData() { }

  /**
   * Gets the type.
   *
   * Subject type can be user or group.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * value can be user name or group id.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

