/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * All engine details.
 */
public class Engine extends GenericModel {

  @SerializedName("db2_engines")
  protected List<Db2Engine> db2Engines;
  @SerializedName("milvus_services")
  protected List<MilvusService> milvusServices;
  @SerializedName("netezza_engines")
  protected List<NetezzaEngine> netezzaEngines;
  @SerializedName("prestissimo_engines")
  protected List<PrestissimoEngine> prestissimoEngines;
  @SerializedName("presto_engines")
  protected List<PrestoEngine> prestoEngines;
  @SerializedName("spark_engines")
  protected List<SparkEngine> sparkEngines;

  protected Engine() { }

  /**
   * Gets the db2Engines.
   *
   * list of db2 engines.
   *
   * @return the db2Engines
   */
  public List<Db2Engine> getDb2Engines() {
    return db2Engines;
  }

  /**
   * Gets the milvusServices.
   *
   * list of milvus engines.
   *
   * @return the milvusServices
   */
  public List<MilvusService> getMilvusServices() {
    return milvusServices;
  }

  /**
   * Gets the netezzaEngines.
   *
   * list of netezza engines.
   *
   * @return the netezzaEngines
   */
  public List<NetezzaEngine> getNetezzaEngines() {
    return netezzaEngines;
  }

  /**
   * Gets the prestissimoEngines.
   *
   * list of prestissimo engines.
   *
   * @return the prestissimoEngines
   */
  public List<PrestissimoEngine> getPrestissimoEngines() {
    return prestissimoEngines;
  }

  /**
   * Gets the prestoEngines.
   *
   * list of presto engines.
   *
   * @return the prestoEngines
   */
  public List<PrestoEngine> getPrestoEngines() {
    return prestoEngines;
  }

  /**
   * Gets the sparkEngines.
   *
   * list of spark engines.
   *
   * @return the sparkEngines
   */
  public List<SparkEngine> getSparkEngines() {
    return sparkEngines;
  }
}

