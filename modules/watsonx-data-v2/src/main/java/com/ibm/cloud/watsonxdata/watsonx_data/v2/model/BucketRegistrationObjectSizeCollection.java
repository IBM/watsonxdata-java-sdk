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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bucket object size.
 */
public class BucketRegistrationObjectSizeCollection extends GenericModel {

  @SerializedName("content_type")
  protected String contentType;
  @SerializedName("file_type")
  protected String fileType;
  @SerializedName("last_modified")
  protected String lastModified;
  protected Map<String, String> metadata;
  protected String path;
  protected String size;

  protected BucketRegistrationObjectSizeCollection() { }

  /**
   * Gets the contentType.
   *
   * content type.
   *
   * @return the contentType
   */
  public String getContentType() {
    return contentType;
  }

  /**
   * Gets the fileType.
   *
   * file type.
   *
   * @return the fileType
   */
  public String getFileType() {
    return fileType;
  }

  /**
   * Gets the lastModified.
   *
   * bucket last modified.
   *
   * @return the lastModified
   */
  public String getLastModified() {
    return lastModified;
  }

  /**
   * Gets the metadata.
   *
   * Additional metadata associated with the object.
   *
   * @return the metadata
   */
  public Map<String, String> getMetadata() {
    return metadata;
  }

  /**
   * Gets the path.
   *
   * bucket last modified.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Gets the size.
   *
   * size of the bucket objects.
   *
   * @return the size
   */
  public String getSize() {
    return size;
  }
}

