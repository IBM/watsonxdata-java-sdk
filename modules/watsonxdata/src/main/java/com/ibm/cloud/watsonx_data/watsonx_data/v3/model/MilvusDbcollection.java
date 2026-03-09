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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of the Milvus database collection.
 */
public class MilvusDbcollection extends GenericModel {

  protected Long id;
  protected String name;
  @SerializedName("physical_channels")
  protected List<String> physicalChannels;
  @SerializedName("virtual_channels")
  protected List<String> virtualChannels;

  protected MilvusDbcollection() { }

  /**
   * Gets the id.
   *
   * milvus collection id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the collection.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the physicalChannels.
   *
   * list of physical channels.
   *
   * @return the physicalChannels
   */
  public List<String> getPhysicalChannels() {
    return physicalChannels;
  }

  /**
   * Gets the virtualChannels.
   *
   * list of virtual channels.
   *
   * @return the virtualChannels
   */
  public List<String> getVirtualChannels() {
    return virtualChannels;
  }
}

