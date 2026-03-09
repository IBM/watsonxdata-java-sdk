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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List storage objects.
 */
public class StorageRegistrationObjectCollection extends GenericModel {

  protected Boolean isTruncated;
  protected String lastFetched;
  protected List<String> objects;

  protected StorageRegistrationObjectCollection() { }

  /**
   * Gets the isTruncated.
   *
   * Indicates whether there are more objects to retrieve when using this api as paginated equals to true.
   *
   * @return the isTruncated
   */
  public Boolean isIsTruncated() {
    return isTruncated;
  }

  /**
   * Gets the lastFetched.
   *
   * Indicates last item fetched when using this api as paginated equals to true.
   *
   * @return the lastFetched
   */
  public String getLastFetched() {
    return lastFetched;
  }

  /**
   * Gets the objects.
   *
   * storage object.
   *
   * @return the objects
   */
  public List<String> getObjects() {
    return objects;
  }
}

