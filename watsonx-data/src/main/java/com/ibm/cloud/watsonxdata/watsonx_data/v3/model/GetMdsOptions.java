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
 * The getMds options.
 */
public class GetMdsOptions extends GenericModel {

  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetMdsOptions instance.
     *
     * @param getMdsOptions the instance to initialize the Builder with
     */
    private Builder(GetMdsOptions getMdsOptions) {
      this.lhInstanceId = getMdsOptions.lhInstanceId;
      this.authInstanceId = getMdsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetMdsOptions.
     *
     * @return the new GetMdsOptions instance
     */
    public GetMdsOptions build() {
      return new GetMdsOptions(this);
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the GetMdsOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetMdsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetMdsOptions() { }

  protected GetMdsOptions(Builder builder) {
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetMdsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the lhInstanceId.
   *
   * Unique identifier assigned to a specific watsonx.data instance.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
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

