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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request payload to update semantic automation layer(SAL) integration properties.
 */
public class SalIntegrationPatch extends GenericModel {

  protected String apikey;
  @SerializedName("engine_id")
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String apikey;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing SalIntegrationPatch instance.
     *
     * @param salIntegrationPatch the instance to initialize the Builder with
     */
    private Builder(SalIntegrationPatch salIntegrationPatch) {
      this.apikey = salIntegrationPatch.apikey;
      this.engineId = salIntegrationPatch.engineId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationPatch.
     *
     * @return the new SalIntegrationPatch instance
     */
    public SalIntegrationPatch build() {
      return new SalIntegrationPatch(this);
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the SalIntegrationPatch builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the SalIntegrationPatch builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }
  }

  protected SalIntegrationPatch() { }

  protected SalIntegrationPatch(Builder builder) {
    apikey = builder.apikey;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apikey.
   *
   * IAM apikey.
   *
   * @return the apikey
   */
  public String apikey() {
    return apikey;
  }

  /**
   * Gets the engineId.
   *
   * Engine ID(support presto and prestissimo) of which registering for integration.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Construct a JSON merge-patch from the SalIntegrationPatch.
   *
   * Note that properties of the SalIntegrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SalIntegrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

