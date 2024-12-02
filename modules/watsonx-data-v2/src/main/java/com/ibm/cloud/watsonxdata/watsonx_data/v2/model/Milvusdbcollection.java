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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * milvus service details.
 */
public class Milvusdbcollection extends GenericModel {

  @SerializedName("collection_id")
  protected Long collectionId;
  @SerializedName("collection_name")
  protected String collectionName;
  @SerializedName("physical_channels")
  protected List<String> physicalChannels;
  @SerializedName("virtual_channels")
  protected List<String> virtualChannels;

  protected Milvusdbcollection() { }

  /**
   * Gets the collectionId.
   *
   * milvus collection id.
   *
   * @return the collectionId
   */
  public Long getCollectionId() {
    return collectionId;
  }

  /**
   * Gets the collectionName.
   *
   * milvus status.
   *
   * @return the collectionName
   */
  public String getCollectionName() {
    return collectionName;
  }

  /**
   * Gets the physicalChannels.
   *
   * milvus physical channels.
   *
   * @return the physicalChannels
   */
  public List<String> getPhysicalChannels() {
    return physicalChannels;
  }

  /**
   * Gets the virtualChannels.
   *
   * milvus virtual channels.
   *
   * @return the virtualChannels
   */
  public List<String> getVirtualChannels() {
    return virtualChannels;
  }
}

