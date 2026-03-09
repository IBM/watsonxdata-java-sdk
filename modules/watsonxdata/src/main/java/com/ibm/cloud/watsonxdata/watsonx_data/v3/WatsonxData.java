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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.104.0-b4a47c49-20250418-184351
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v3;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.watsonxdata.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabasePropertiesCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDatabasePropertiesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TestDatabaseConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateDatabaseConnectionOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * This is the Public API for IBM watsonx.data.
 *
 * API Version: 3.0.0
 */
public class WatsonxData extends BaseService {

  /**
   * Default service name used when configuring the `WatsonxData` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "watsonx_data";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://region.lakehouse.cloud.ibm.com/lakehouse/api/v3";

 /**
   * Class method which constructs an instance of the `WatsonxData` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `WatsonxData` client using external configuration
   */
  public static WatsonxData newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WatsonxData` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WatsonxData` client using external configuration
   */
  public static WatsonxData newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WatsonxData service = new WatsonxData(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WatsonxData` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WatsonxData(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Internal API to Get database properties.
   *
   * Internal API to Get database properties.
   *
   * @param getDatabasePropertiesOptions the {@link GetDatabasePropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabasePropertiesCollection}
   */
  public ServiceCall<DatabasePropertiesCollection> getDatabaseProperties(GetDatabasePropertiesOptions getDatabasePropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatabasePropertiesOptions,
      "getDatabasePropertiesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_properties"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getDatabaseProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("Secret", getDatabasePropertiesOptions.secret());
    if (getDatabasePropertiesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDatabasePropertiesOptions.authInstanceId());
    }
    if (getDatabasePropertiesOptions.databaseIds() != null) {
      builder.query("database_ids", String.valueOf(getDatabasePropertiesOptions.databaseIds()));
    }
    ResponseConverter<DatabasePropertiesCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabasePropertiesCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get databases.
   *
   * Get list of databases.
   *
   * @param listDatabaseRegistrationsOptions the {@link ListDatabaseRegistrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistrationCollection}
   */
  public ServiceCall<DatabaseRegistrationCollection> listDatabaseRegistrations(ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptions) {
    if (listDatabaseRegistrationsOptions == null) {
      listDatabaseRegistrationsOptions = new ListDatabaseRegistrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listDatabaseRegistrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDatabaseRegistrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listDatabaseRegistrationsOptions.authInstanceId());
    }
    ResponseConverter<DatabaseRegistrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get databases.
   *
   * Get list of databases.
   *
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistrationCollection}
   */
  public ServiceCall<DatabaseRegistrationCollection> listDatabaseRegistrations() {
    return listDatabaseRegistrations(null);
  }

  /**
   * Add/Create database.
   *
   * Add or create a new database.
   *
   * @param createDatabaseRegistrationOptions the {@link CreateDatabaseRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistration}
   */
  public ServiceCall<DatabaseRegistration> createDatabaseRegistration(CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDatabaseRegistrationOptions,
      "createDatabaseRegistrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createDatabaseRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDatabaseRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDatabaseRegistrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", createDatabaseRegistrationOptions.displayName());
    contentJson.addProperty("type", createDatabaseRegistrationOptions.type());
    if (createDatabaseRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.associatedCatalog()));
    }
    if (createDatabaseRegistrationOptions.connection() != null) {
      contentJson.add("connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.connection()));
    }
    if (createDatabaseRegistrationOptions.createdAt() != null) {
      contentJson.addProperty("created_at", createDatabaseRegistrationOptions.createdAt());
    }
    if (createDatabaseRegistrationOptions.description() != null) {
      contentJson.addProperty("description", createDatabaseRegistrationOptions.description());
    }
    if (createDatabaseRegistrationOptions.xProperties() != null) {
      contentJson.add("properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.xProperties()));
    }
    if (createDatabaseRegistrationOptions.sourceAssetId() != null) {
      contentJson.addProperty("source_asset_id", createDatabaseRegistrationOptions.sourceAssetId());
    }
    if (createDatabaseRegistrationOptions.sourceCatalogId() != null) {
      contentJson.addProperty("source_catalog_id", createDatabaseRegistrationOptions.sourceCatalogId());
    }
    if (createDatabaseRegistrationOptions.sourceProjectId() != null) {
      contentJson.addProperty("source_project_id", createDatabaseRegistrationOptions.sourceProjectId());
    }
    if (createDatabaseRegistrationOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.tags()));
    }
    if (createDatabaseRegistrationOptions.targetCatalogId() != null) {
      contentJson.addProperty("target_catalog_id", createDatabaseRegistrationOptions.targetCatalogId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Post database catalog.
   *
   * Add catalog to a registered database.
   *
   * @param addDatabaseCatalogOptions the {@link AddDatabaseCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> addDatabaseCatalog(AddDatabaseCatalogOptions addDatabaseCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addDatabaseCatalogOptions,
      "addDatabaseCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("database_id", addDatabaseCatalogOptions.databaseId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{database_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "addDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", addDatabaseCatalogOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (addDatabaseCatalogOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", addDatabaseCatalogOptions.catalogName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get database.
   *
   * Get a registered databases.
   *
   * @param getDatabaseOptions the {@link GetDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistration}
   */
  public ServiceCall<DatabaseRegistration> getDatabase(GetDatabaseOptions getDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatabaseOptions,
      "getDatabaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDatabaseOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDatabaseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDatabaseOptions.authInstanceId());
    }
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete database.
   *
   * Delete a database.
   *
   * @param deleteDatabaseCatalogOptions the {@link DeleteDatabaseCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDatabaseCatalog(DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDatabaseCatalogOptions,
      "deleteDatabaseCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDatabaseCatalogOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDatabaseCatalogOptions.authInstanceId());
    }
    if (deleteDatabaseCatalogOptions.secret() != null) {
      builder.header("Secret", deleteDatabaseCatalogOptions.secret());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update database.
   *
   * Update database details.
   *
   * @param updateDatabaseOptions the {@link UpdateDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistration}
   */
  public ServiceCall<DatabaseRegistration> updateDatabase(UpdateDatabaseOptions updateDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDatabaseOptions,
      "updateDatabaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateDatabaseOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDatabaseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDatabaseOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDatabaseOptions.body()), "application/merge-patch+json");
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Validate database connection.
   *
   * API to validate the database connection.
   *
   * @param validateDatabaseConnectionOptions the {@link ValidateDatabaseConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TestDatabaseConnectionResponse}
   */
  public ServiceCall<TestDatabaseConnectionResponse> validateDatabaseConnection(ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(validateDatabaseConnectionOptions,
      "validateDatabaseConnectionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/test_database_connection"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "validateDatabaseConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (validateDatabaseConnectionOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", validateDatabaseConnectionOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", validateDatabaseConnectionOptions.type());
    if (validateDatabaseConnectionOptions.certificate() != null) {
      contentJson.addProperty("certificate", validateDatabaseConnectionOptions.certificate());
    }
    if (validateDatabaseConnectionOptions.certificateExtension() != null) {
      contentJson.addProperty("certificate_extension", validateDatabaseConnectionOptions.certificateExtension());
    }
    if (validateDatabaseConnectionOptions.connection() != null) {
      contentJson.add("connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateDatabaseConnectionOptions.connection()));
    }
    if (validateDatabaseConnectionOptions.id() != null) {
      contentJson.addProperty("id", validateDatabaseConnectionOptions.id());
    }
    if (validateDatabaseConnectionOptions.sourceAssetId() != null) {
      contentJson.addProperty("source_asset_id", validateDatabaseConnectionOptions.sourceAssetId());
    }
    if (validateDatabaseConnectionOptions.sourceCatalogId() != null) {
      contentJson.addProperty("source_catalog_id", validateDatabaseConnectionOptions.sourceCatalogId());
    }
    if (validateDatabaseConnectionOptions.sourceProjectId() != null) {
      contentJson.addProperty("source_project_id", validateDatabaseConnectionOptions.sourceProjectId());
    }
    if (validateDatabaseConnectionOptions.targetCatalogId() != null) {
      contentJson.addProperty("target_catalog_id", validateDatabaseConnectionOptions.targetCatalogId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TestDatabaseConnectionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TestDatabaseConnectionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
