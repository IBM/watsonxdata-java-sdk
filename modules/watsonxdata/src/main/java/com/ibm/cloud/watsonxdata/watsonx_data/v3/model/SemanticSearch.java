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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * semantic search object of the returning result.
 */
public class SemanticSearch extends GenericModel {

  protected String id;
  @SerializedName("last_search_time")
  protected Date lastSearchTime;
  protected List<SemanticSearchResultsItem> results;
  @SerializedName("search_query")
  protected String searchQuery;

  protected SemanticSearch() { }

  /**
   * Gets the id.
   *
   * id of the semantic search query record.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lastSearchTime.
   *
   * last time of searching the same query string.
   *
   * @return the lastSearchTime
   */
  public Date getLastSearchTime() {
    return lastSearchTime;
  }

  /**
   * Gets the results.
   *
   * search results of given query.
   *
   * @return the results
   */
  public List<SemanticSearchResultsItem> getResults() {
    return results;
  }

  /**
   * Gets the searchQuery.
   *
   * input search query.
   *
   * @return the searchQuery
   */
  public String getSearchQuery() {
    return searchQuery;
  }
}

