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
import com.ibm.cloud.watsonx_data.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ColumnsCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EndpointCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetAllColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetEndpointsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetInstanceConfigurationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetMdsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetTableDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListAllSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListAllTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListStorageRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Mds;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessReadyResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateMdsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.WatsonxInstanceDetails;
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
   * Collection of Prestissimo engines.
   *
   * Collection of Prestissimo engines.
   *
   * @param listPrestissimoEnginesOptions the {@link ListPrestissimoEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngineCollection}
   */
  public ServiceCall<PrestissimoEngineCollection> listPrestissimoEngines(ListPrestissimoEnginesOptions listPrestissimoEnginesOptions) {
    if (listPrestissimoEnginesOptions == null) {
      listPrestissimoEnginesOptions = new ListPrestissimoEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listPrestissimoEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPrestissimoEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listPrestissimoEnginesOptions.authInstanceId());
    }
    ResponseConverter<PrestissimoEngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestissimoEngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Collection of Prestissimo engines.
   *
   * Collection of Prestissimo engines.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngineCollection}
   */
  public ServiceCall<PrestissimoEngineCollection> listPrestissimoEngines() {
    return listPrestissimoEngines(null);
  }

  /**
   * Create prestissimo engine.
   *
   * Create a new prestissimo engine.
   *
   * @param createPrestissimoEngineOptions the {@link CreatePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngine}
   */
  public ServiceCall<PrestissimoEngine> createPrestissimoEngine(CreatePrestissimoEngineOptions createPrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineOptions,
      "createPrestissimoEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createPrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.configuration()));
    contentJson.addProperty("display_name", createPrestissimoEngineOptions.displayName());
    contentJson.addProperty("origin", createPrestissimoEngineOptions.origin());
    if (createPrestissimoEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.associatedCatalogs()));
    }
    if (createPrestissimoEngineOptions.description() != null) {
      contentJson.addProperty("description", createPrestissimoEngineOptions.description());
    }
    if (createPrestissimoEngineOptions.id() != null) {
      contentJson.addProperty("id", createPrestissimoEngineOptions.id());
    }
    if (createPrestissimoEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestissimoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestissimoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get prestissimo engine.
   *
   * Prestissimo engine details.
   *
   * @param getPrestissimoEngineOptions the {@link GetPrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngine}
   */
  public ServiceCall<PrestissimoEngine> getPrestissimoEngine(GetPrestissimoEngineOptions getPrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestissimoEngineOptions,
      "getPrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getPrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPrestissimoEngineOptions.authInstanceId());
    }
    ResponseConverter<PrestissimoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestissimoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete prestissimo engine.
   *
   * Delete a prestissimo engine.
   *
   * @param deletePrestissimoEngineOptions the {@link DeletePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrestissimoEngine(DeletePrestissimoEngineOptions deletePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePrestissimoEngineOptions,
      "deletePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deletePrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deletePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deletePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deletePrestissimoEngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update prestissimo engine.
   *
   * Update details of prestissimo engine.
   *
   * @param updatePrestissimoEngineOptions the {@link UpdatePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngine}
   */
  public ServiceCall<PrestissimoEngine> updatePrestissimoEngine(UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrestissimoEngineOptions,
      "updatePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updatePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updatePrestissimoEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrestissimoEngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<PrestissimoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestissimoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get prestissimo engine catalogs.
   *
   * Get list of all catalogs attached a prestissimo engine.
   *
   * @param listPrestissimoEngineCatalogsOptions the {@link ListPrestissimoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listPrestissimoEngineCatalogs(ListPrestissimoEngineCatalogsOptions listPrestissimoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPrestissimoEngineCatalogsOptions,
      "listPrestissimoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listPrestissimoEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listPrestissimoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPrestissimoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listPrestissimoEngineCatalogsOptions.authInstanceId());
    }
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate catalogs to a prestissimo engine.
   *
   * Associate one or more catalogs to a prestissimo engine.
   *
   * @param createPrestissimoEngineCatalogsOptions the {@link CreatePrestissimoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> createPrestissimoEngineCatalogs(CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineCatalogsOptions,
      "createPrestissimoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createPrestissimoEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createPrestissimoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("catalog_names", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineCatalogsOptions.catalogNames()));
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate catalogs from a prestissimo engine.
   *
   * Disassociate one or more catalogs from a prestissimo engine.
   *
   * @param deletePrestissimoEngineCatalogsOptions the {@link DeletePrestissimoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrestissimoEngineCatalogs(DeletePrestissimoEngineCatalogsOptions deletePrestissimoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePrestissimoEngineCatalogsOptions,
      "deletePrestissimoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deletePrestissimoEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deletePrestissimoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deletePrestissimoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deletePrestissimoEngineCatalogsOptions.authInstanceId());
    }
    builder.query("catalog_names", String.valueOf(deletePrestissimoEngineCatalogsOptions.catalogNames()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of Presto(Java) engines.
   *
   * Get list of all Presto(Java) engines.
   *
   * @param listPrestoEnginesOptions the {@link ListPrestoEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineCollection}
   */
  public ServiceCall<PrestoEngineCollection> listPrestoEngines(ListPrestoEnginesOptions listPrestoEnginesOptions) {
    if (listPrestoEnginesOptions == null) {
      listPrestoEnginesOptions = new ListPrestoEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listPrestoEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPrestoEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listPrestoEnginesOptions.authInstanceId());
    }
    ResponseConverter<PrestoEngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of Presto(Java) engines.
   *
   * Get list of all Presto(Java) engines.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineCollection}
   */
  public ServiceCall<PrestoEngineCollection> listPrestoEngines() {
    return listPrestoEngines(null);
  }

  /**
   * Create presto engine.
   *
   * Create a new presto engine.
   *
   * @param createPrestoEngineOptions the {@link CreatePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngine}
   */
  public ServiceCall<PrestoEngine> createPrestoEngine(CreatePrestoEngineOptions createPrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestoEngineOptions,
      "createPrestoEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createPrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.configuration()));
    contentJson.addProperty("display_name", createPrestoEngineOptions.displayName());
    contentJson.addProperty("origin", createPrestoEngineOptions.origin());
    if (createPrestoEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.associatedCatalogs()));
    }
    if (createPrestoEngineOptions.description() != null) {
      contentJson.addProperty("description", createPrestoEngineOptions.description());
    }
    if (createPrestoEngineOptions.id() != null) {
      contentJson.addProperty("id", createPrestoEngineOptions.id());
    }
    if (createPrestoEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get presto engine catalogs.
   *
   * Get list of all catalogs attached to a presto engine.
   *
   * @param listPrestoEngineCatalogsOptions the {@link ListPrestoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listPrestoEngineCatalogs(ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPrestoEngineCatalogsOptions,
      "listPrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", listPrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listPrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listPrestoEngineCatalogsOptions.authInstanceId());
    }
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate catalogs to presto engine.
   *
   * Associate one or more catalogs to a presto engine.
   *
   * @param createPrestoEngineCatalogsOptions the {@link CreatePrestoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> createPrestoEngineCatalogs(CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestoEngineCatalogsOptions,
      "createPrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createPrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestoEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPrestoEngineCatalogsOptions.catalogNames() != null) {
      contentJson.add("catalog_names", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineCatalogsOptions.catalogNames()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate catalogs from a presto engine.
   *
   * Disassociate one or more catalogs from a presto engine.
   *
   * @param deletePrestoEngineCatalogsOptions the {@link DeletePrestoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrestoEngineCatalogs(DeletePrestoEngineCatalogsOptions deletePrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePrestoEngineCatalogsOptions,
      "deletePrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deletePrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deletePrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deletePrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deletePrestoEngineCatalogsOptions.authInstanceId());
    }
    builder.query("catalog_names", String.valueOf(deletePrestoEngineCatalogsOptions.catalogNames()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get presto engine.
   *
   * Get details of one presto engine.
   *
   * @param getPrestoEngineOptions the {@link GetPrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngine}
   */
  public ServiceCall<PrestoEngine> getPrestoEngine(GetPrestoEngineOptions getPrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestoEngineOptions,
      "getPrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getPrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPrestoEngineOptions.authInstanceId());
    }
    ResponseConverter<PrestoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete presto engine.
   *
   * Delete a presto engine.
   *
   * @param deleteEngineOptions the {@link DeleteEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteEngine(DeleteEngineOptions deleteEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteEngineOptions,
      "deleteEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteEngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteEngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update presto engine.
   *
   * Update details of presto engine.
   *
   * @param updatePrestoEngineOptions the {@link UpdatePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngine}
   */
  public ServiceCall<PrestoEngine> updatePrestoEngine(UpdatePrestoEngineOptions updatePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrestoEngineOptions,
      "updatePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updatePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updatePrestoEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrestoEngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<PrestoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @param testLhConsoleOptions the {@link TestLHConsoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessReadyResponse}
   */
  public ServiceCall<SuccessReadyResponse> testLHConsole(TestLHConsoleOptions testLhConsoleOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ready"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "testLHConsole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SuccessReadyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessReadyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @return a {@link ServiceCall} with a result of type {@link SuccessReadyResponse}
   */
  public ServiceCall<SuccessReadyResponse> testLHConsole() {
    return testLHConsole(null);
  }

  /**
   * List all registered catalogs.
   *
   * List all registered catalogs.
   *
   * @param listCatalogsOptions the {@link ListCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listCatalogs(ListCatalogsOptions listCatalogsOptions) {
    if (listCatalogsOptions == null) {
      listCatalogsOptions = new ListCatalogsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listCatalogsOptions.authInstanceId());
    }
    if (listCatalogsOptions.secret() != null) {
      builder.header("Secret", listCatalogsOptions.secret());
    }
    if (listCatalogsOptions.defaultCatalogs() != null) {
      builder.query("default_catalogs", String.valueOf(listCatalogsOptions.defaultCatalogs()));
    }
    if (listCatalogsOptions.view() != null) {
      builder.query("view", String.valueOf(listCatalogsOptions.view()));
    }
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all registered catalogs.
   *
   * List all registered catalogs.
   *
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listCatalogs() {
    return listCatalogs(null);
  }

  /**
   * Get catalog engine association.
   *
   * Get catalog engine association.
   *
   * @param getCatalogEngineAssociationOptions the {@link GetCatalogEngineAssociationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogEngineResponse}
   */
  public ServiceCall<CatalogEngineResponse> getCatalogEngineAssociation(GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCatalogEngineAssociationOptions,
      "getCatalogEngineAssociationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", getCatalogEngineAssociationOptions.catalogName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/engines", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getCatalogEngineAssociation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCatalogEngineAssociationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getCatalogEngineAssociationOptions.authInstanceId());
    }
    ResponseConverter<CatalogEngineResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogEngineResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete schema.
   *
   * Delete a schema.
   *
   * @param deleteSchemaOptions the {@link DeleteSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSchema(DeleteSchemaOptions deleteSchemaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSchemaOptions,
      "deleteSchemaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", deleteSchemaOptions.catalogName());
    pathParamsMap.put("schema_name", deleteSchemaOptions.schemaName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSchema");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSchemaOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSchemaOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(deleteSchemaOptions.engineId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all tables.
   *
   * List all tables in a schema in a catalog for a given engine.
   *
   * @param listTablesOptions the {@link ListTablesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TableCollection}
   */
  public ServiceCall<TableCollection> listTables(ListTablesOptions listTablesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTablesOptions,
      "listTablesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", listTablesOptions.catalogName());
    pathParamsMap.put("schema_name", listTablesOptions.schemaName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listTables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTablesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listTablesOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(listTablesOptions.engineId()));
    ResponseConverter<TableCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get table details.
   *
   * Get details of a given table in a catalog and schema.
   *
   * @param getTableOptions the {@link GetTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Table}
   */
  public ServiceCall<Table> getTable(GetTableOptions getTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTableOptions,
      "getTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", getTableOptions.catalogName());
    pathParamsMap.put("schema_name", getTableOptions.schemaName());
    pathParamsMap.put("table_name", getTableOptions.tableName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getTableOptions.engineId()));
    if (getTableOptions.type() != null) {
      builder.query("type", String.valueOf(getTableOptions.type()));
    }
    ResponseConverter<Table> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Table>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete table.
   *
   * Delete table for a given schema and catalog.
   *
   * @param deleteTableOptions the {@link DeleteTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTable(DeleteTableOptions deleteTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTableOptions,
      "deleteTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", deleteTableOptions.catalogName());
    pathParamsMap.put("schema_name", deleteTableOptions.schemaName());
    pathParamsMap.put("table_name", deleteTableOptions.tableName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(deleteTableOptions.engineId()));
    if (deleteTableOptions.type() != null) {
      builder.query("type", String.valueOf(deleteTableOptions.type()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rename table.
   *
   * Rename table.
   *
   * @param updateTableOptions the {@link UpdateTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Table}
   */
  public ServiceCall<Table> updateTable(UpdateTableOptions updateTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTableOptions,
      "updateTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", updateTableOptions.catalogName());
    pathParamsMap.put("schema_name", updateTableOptions.schemaName());
    pathParamsMap.put("table_name", updateTableOptions.tableName());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(updateTableOptions.engineId()));
    if (updateTableOptions.type() != null) {
      builder.query("type", String.valueOf(updateTableOptions.type()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateTableOptions.body()), "application/merge-patch+json");
    ResponseConverter<Table> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Table>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all schemas.
   *
   * List all schemas in catalog.
   *
   * @param listSchemasOptions the {@link ListSchemasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchemasCollection}
   */
  public ServiceCall<SchemasCollection> listSchemas(ListSchemasOptions listSchemasOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSchemasOptions,
      "listSchemasOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSchemasOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{id}/schemas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSchemas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSchemasOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSchemasOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(listSchemasOptions.engineId()));
    ResponseConverter<SchemasCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchemasCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create schema.
   *
   * Create a new schema.
   *
   * @param createSchemaOptions the {@link CreateSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchemaPrototype}
   */
  public ServiceCall<SchemaPrototype> createSchema(CreateSchemaOptions createSchemaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSchemaOptions,
      "createSchemaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSchemaOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{id}/schemas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSchema");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSchemaOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSchemaOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(createSchemaOptions.engineId()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("custom_path", createSchemaOptions.customPath());
    contentJson.addProperty("name", createSchemaOptions.name());
    if (createSchemaOptions.hostname() != null) {
      contentJson.addProperty("hostname", createSchemaOptions.hostname());
    }
    if (createSchemaOptions.port() != null) {
      contentJson.addProperty("port", createSchemaOptions.port());
    }
    if (createSchemaOptions.storageName() != null) {
      contentJson.addProperty("storage_name", createSchemaOptions.storageName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SchemaPrototype> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchemaPrototype>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get catalog properties by catalog_id.
   *
   * Get catalog properties of a catalog identified by catalog_id.
   *
   * @param getCatalogOptions the {@link GetCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> getCatalog(GetCatalogOptions getCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCatalogOptions,
      "getCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getCatalogOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getCatalogOptions.authInstanceId());
    }
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete catalog catalog_id.
   *
   * Delete catalog identified by catalog_id.
   *
   * @param deleteCatalogOptions the {@link DeleteCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCatalog(DeleteCatalogOptions deleteCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCatalogOptions,
      "deleteCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", deleteCatalogOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteCatalogOptions.authInstanceId());
    }
    if (deleteCatalogOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(deleteCatalogOptions.skipMdsCall()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration for mds.
   *
   * Get configuration for metadata service.
   *
   * @param getMdsOptions the {@link GetMdsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Mds}
   */
  public ServiceCall<Mds> getMds(GetMdsOptions getMdsOptions) {
    if (getMdsOptions == null) {
      getMdsOptions = new GetMdsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/configuration/mds"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getMds");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMdsOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getMdsOptions.lhInstanceId());
    }
    if (getMdsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getMdsOptions.authInstanceId());
    }
    ResponseConverter<Mds> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Mds>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration for mds.
   *
   * Get configuration for metadata service.
   *
   * @return a {@link ServiceCall} with a result of type {@link Mds}
   */
  public ServiceCall<Mds> getMds() {
    return getMds(null);
  }

  /**
   * Enable or disable MDS.
   *
   * Enable or disable MDS.
   *
   * @param updateMdsOptions the {@link UpdateMdsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Mds}
   */
  public ServiceCall<Mds> updateMds(UpdateMdsOptions updateMdsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMdsOptions,
      "updateMdsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/configuration/mds"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateMds");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMdsOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateMdsOptions.lhInstanceId());
    }
    if (updateMdsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMdsOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateMdsOptions.body()), "application/json-patch+json");
    ResponseConverter<Mds> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Mds>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the instane configuration.
   *
   * Gives a list of the various engines and resources present in the instance, along with the details of the instance.
   *
   * @param getInstanceConfigurationOptions the {@link GetInstanceConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WatsonxInstanceDetails}
   */
  public ServiceCall<WatsonxInstanceDetails> getInstanceConfiguration(GetInstanceConfigurationOptions getInstanceConfigurationOptions) {
    if (getInstanceConfigurationOptions == null) {
      getInstanceConfigurationOptions = new GetInstanceConfigurationOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_configuration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getInstanceConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getInstanceConfigurationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getInstanceConfigurationOptions.authInstanceId());
    }
    ResponseConverter<WatsonxInstanceDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WatsonxInstanceDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the instane configuration.
   *
   * Gives a list of the various engines and resources present in the instance, along with the details of the instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link WatsonxInstanceDetails}
   */
  public ServiceCall<WatsonxInstanceDetails> getInstanceConfiguration() {
    return getInstanceConfiguration(null);
  }

  /**
   * Get CPG and CAS endpoints.
   *
   * Get CPG and CAS endpoints.
   *
   * @param getEndpointsOptions the {@link GetEndpointsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointCollection}
   */
  public ServiceCall<EndpointCollection> getEndpoints(GetEndpointsOptions getEndpointsOptions) {
    if (getEndpointsOptions == null) {
      getEndpointsOptions = new GetEndpointsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoints"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getEndpoints");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEndpointsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getEndpointsOptions.authInstanceId());
    }
    ResponseConverter<EndpointCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EndpointCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get CPG and CAS endpoints.
   *
   * Get CPG and CAS endpoints.
   *
   * @return a {@link ServiceCall} with a result of type {@link EndpointCollection}
   */
  public ServiceCall<EndpointCollection> getEndpoints() {
    return getEndpoints(null);
  }

  /**
   * Register delta and hudi tables.
   *
   * Register delta and hudi tables.
   *
   * @param registerTableOptions the {@link RegisterTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RegisterTableCreatedBody}
   */
  public ServiceCall<RegisterTableCreatedBody> registerTable(RegisterTableOptions registerTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(registerTableOptions,
      "registerTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", registerTableOptions.catalogId());
    pathParamsMap.put("schema_id", registerTableOptions.schemaId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/register", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "registerTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (registerTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", registerTableOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("metadata_location", registerTableOptions.metadataLocation());
    contentJson.addProperty("table_name", registerTableOptions.tableName());
    builder.bodyJson(contentJson);
    ResponseConverter<RegisterTableCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RegisterTableCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all columns.
   *
   * Get all columns.
   *
   * @param getAllColumnsOptions the {@link GetAllColumnsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ColumnsCollection}
   */
  public ServiceCall<ColumnsCollection> getAllColumns(GetAllColumnsOptions getAllColumnsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllColumnsOptions,
      "getAllColumnsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/columns"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getAllColumns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAllColumnsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getAllColumnsOptions.authInstanceId());
    }
    builder.query("catalog_name", String.valueOf(getAllColumnsOptions.catalogName()));
    if (getAllColumnsOptions.tableName() != null) {
      builder.query("table_name", String.valueOf(getAllColumnsOptions.tableName()));
    }
    if (getAllColumnsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(getAllColumnsOptions.schemaName()));
    }
    ResponseConverter<ColumnsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ColumnsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all schemas for a given catalog.
   *
   * List Schemas for a catalog with the given catalog_name.
   *
   * @param listAllSchemasOptions the {@link ListAllSchemasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchemaResponseCollection}
   */
  public ServiceCall<SchemaResponseCollection> listAllSchemas(ListAllSchemasOptions listAllSchemasOptions) {
    if (listAllSchemasOptions == null) {
      listAllSchemasOptions = new ListAllSchemasOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/schemas"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listAllSchemas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllSchemasOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listAllSchemasOptions.authInstanceId());
    }
    if (listAllSchemasOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listAllSchemasOptions.catalogName()));
    }
    if (listAllSchemasOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(listAllSchemasOptions.schemaName()));
    }
    ResponseConverter<SchemaResponseCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchemaResponseCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all schemas for a given catalog.
   *
   * List Schemas for a catalog with the given catalog_name.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchemaResponseCollection}
   */
  public ServiceCall<SchemaResponseCollection> listAllSchemas() {
    return listAllSchemas(null);
  }

  /**
   * Get all tables.
   *
   * Get all tables.
   *
   * @param listAllTablesOptions the {@link ListAllTablesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TableResponseCollection}
   */
  public ServiceCall<TableResponseCollection> listAllTables(ListAllTablesOptions listAllTablesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAllTablesOptions,
      "listAllTablesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listAllTables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllTablesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listAllTablesOptions.authInstanceId());
    }
    builder.query("catalog_name", String.valueOf(listAllTablesOptions.catalogName()));
    if (listAllTablesOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(listAllTablesOptions.schemaName()));
    }
    ResponseConverter<TableResponseCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableResponseCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get table details.
   *
   * Get table details.
   *
   * @param getTableDetailsOptions the {@link GetTableDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TableResponse}
   */
  public ServiceCall<TableResponse> getTableDetails(GetTableDetailsOptions getTableDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTableDetailsOptions,
      "getTableDetailsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("table_name", getTableDetailsOptions.tableName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables/{table_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getTableDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTableDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTableDetailsOptions.authInstanceId());
    }
    builder.query("catalog_name", String.valueOf(getTableDetailsOptions.catalogName()));
    if (getTableDetailsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(getTableDetailsOptions.schemaName()));
    }
    ResponseConverter<TableResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get storage registrations.
   *
   * Get list of registered storages.
   *
   * @param listStorageRegistrationsOptions the {@link ListStorageRegistrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistrationCollection}
   */
  public ServiceCall<StorageRegistrationCollection> listStorageRegistrations(ListStorageRegistrationsOptions listStorageRegistrationsOptions) {
    if (listStorageRegistrationsOptions == null) {
      listStorageRegistrationsOptions = new ListStorageRegistrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listStorageRegistrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listStorageRegistrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listStorageRegistrationsOptions.authInstanceId());
    }
    ResponseConverter<StorageRegistrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageRegistrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get storage registrations.
   *
   * Get list of registered storages.
   *
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistrationCollection}
   */
  public ServiceCall<StorageRegistrationCollection> listStorageRegistrations() {
    return listStorageRegistrations(null);
  }

  /**
   * Register storage.
   *
   * Register a new storage.
   *
   * @param createStorageRegistrationOptions the {@link CreateStorageRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistration}
   */
  public ServiceCall<StorageRegistration> createStorageRegistration(CreateStorageRegistrationOptions createStorageRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createStorageRegistrationOptions,
      "createStorageRegistrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createStorageRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createStorageRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createStorageRegistrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("description", createStorageRegistrationOptions.description());
    contentJson.addProperty("display_name", createStorageRegistrationOptions.displayName());
    contentJson.addProperty("managed_by", createStorageRegistrationOptions.managedBy());
    contentJson.addProperty("type", createStorageRegistrationOptions.type());
    if (createStorageRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createStorageRegistrationOptions.associatedCatalog()));
    }
    if (createStorageRegistrationOptions.connection() != null) {
      contentJson.add("connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createStorageRegistrationOptions.connection()));
    }
    if (createStorageRegistrationOptions.region() != null) {
      contentJson.addProperty("region", createStorageRegistrationOptions.region());
    }
    if (createStorageRegistrationOptions.storageUse() != null) {
      contentJson.addProperty("storage_use", createStorageRegistrationOptions.storageUse());
    }
    if (createStorageRegistrationOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createStorageRegistrationOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<StorageRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
