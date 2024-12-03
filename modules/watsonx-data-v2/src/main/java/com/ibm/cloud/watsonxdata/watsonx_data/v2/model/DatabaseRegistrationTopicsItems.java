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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Topic.
 */
public class DatabaseRegistrationTopicsItems extends GenericModel {

  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("file_contents")
  protected String fileContents;
  @SerializedName("file_name")
  protected String fileName;
  @SerializedName("topic_name")
  protected String topicName;

  protected DatabaseRegistrationTopicsItems() { }

  /**
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the fileContents.
   *
   * file content.
   *
   * @return the fileContents
   */
  public String getFileContents() {
    return fileContents;
  }

  /**
   * Gets the fileName.
   *
   * file name.
   *
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Gets the topicName.
   *
   * topic name.
   *
   * @return the topicName
   */
  public String getTopicName() {
    return topicName;
  }
}

