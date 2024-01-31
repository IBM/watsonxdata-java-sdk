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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.84.2-a032c73d-20240125-175315
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v2;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.watsonx_data.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDriverDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEnginePauseCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEnginePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineRestartCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineRestartOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineResumeCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineScaleCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEnginePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineRestartOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDeactivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Engines;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDeploymentsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDeploymentsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListMilvusServicesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListNetezzaEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListOtherEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSchemasOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplacePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplacePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestBucketConnectionOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestBucketConnectionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestDatabaseConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ValidateDatabaseConnectionOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * This is the Public API for IBM watsonx.data.
 *
 * API Version: 2.0.0
 */
public class WatsonxData extends BaseService {

  /**
   * Default service name used when configuring the `WatsonxData` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "watsonx_data";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://region.lakehouse.cloud.ibm.com/lakehouse/api/v2";

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
   * Get bucket registrations.
   *
   * Get list of registered buckets.
   *
   * @param listBucketRegistrationsOptions the {@link ListBucketRegistrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistrationCollection}
   */
  public ServiceCall<BucketRegistrationCollection> listBucketRegistrations(ListBucketRegistrationsOptions listBucketRegistrationsOptions) {
    if (listBucketRegistrationsOptions == null) {
      listBucketRegistrationsOptions = new ListBucketRegistrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listBucketRegistrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBucketRegistrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listBucketRegistrationsOptions.authInstanceId());
    }
    ResponseConverter<BucketRegistrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get bucket registrations.
   *
   * Get list of registered buckets.
   *
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistrationCollection}
   */
  public ServiceCall<BucketRegistrationCollection> listBucketRegistrations() {
    return listBucketRegistrations(null);
  }

  /**
   * Register bucket.
   *
   * Register a new bucket.
   *
   * @param createBucketRegistrationOptions the {@link CreateBucketRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistration}
   */
  public ServiceCall<BucketRegistration> createBucketRegistration(CreateBucketRegistrationOptions createBucketRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBucketRegistrationOptions,
      "createBucketRegistrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createBucketRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createBucketRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createBucketRegistrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("bucket_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.bucketDetails()));
    contentJson.addProperty("bucket_type", createBucketRegistrationOptions.bucketType());
    contentJson.addProperty("description", createBucketRegistrationOptions.description());
    contentJson.addProperty("managed_by", createBucketRegistrationOptions.managedBy());
    if (createBucketRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.associatedCatalog()));
    }
    if (createBucketRegistrationOptions.bucketDisplayName() != null) {
      contentJson.addProperty("bucket_display_name", createBucketRegistrationOptions.bucketDisplayName());
    }
    if (createBucketRegistrationOptions.region() != null) {
      contentJson.addProperty("region", createBucketRegistrationOptions.region());
    }
    if (createBucketRegistrationOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BucketRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get bucket.
   *
   * Get a registered bucket.
   *
   * @param getBucketRegistrationOptions the {@link GetBucketRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistration}
   */
  public ServiceCall<BucketRegistration> getBucketRegistration(GetBucketRegistrationOptions getBucketRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBucketRegistrationOptions,
      "getBucketRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", getBucketRegistrationOptions.bucketId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getBucketRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBucketRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getBucketRegistrationOptions.authInstanceId());
    }
    ResponseConverter<BucketRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister Bucket.
   *
   * Unregister a bucket.
   *
   * @param deleteBucketRegistrationOptions the {@link DeleteBucketRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBucketRegistration(DeleteBucketRegistrationOptions deleteBucketRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBucketRegistrationOptions,
      "deleteBucketRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", deleteBucketRegistrationOptions.bucketId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteBucketRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteBucketRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteBucketRegistrationOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update bucket.
   *
   * Update bucket details &amp; credentials.
   *
   * @param updateBucketRegistrationOptions the {@link UpdateBucketRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistration}
   */
  public ServiceCall<BucketRegistration> updateBucketRegistration(UpdateBucketRegistrationOptions updateBucketRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBucketRegistrationOptions,
      "updateBucketRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", updateBucketRegistrationOptions.bucketId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateBucketRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateBucketRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateBucketRegistrationOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateBucketRegistrationOptions.body()), "application/json-patch+json");
    ResponseConverter<BucketRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Activate Bucket.
   *
   * Activate a registered bucket.
   *
   * @param createActivateBucketOptions the {@link CreateActivateBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateActivateBucketCreatedBody}
   */
  public ServiceCall<CreateActivateBucketCreatedBody> createActivateBucket(CreateActivateBucketOptions createActivateBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActivateBucketOptions,
      "createActivateBucketOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", createActivateBucketOptions.bucketId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}/activate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createActivateBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActivateBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createActivateBucketOptions.authInstanceId());
    }
    ResponseConverter<CreateActivateBucketCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateActivateBucketCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deactivate Bucket.
   *
   * Deactivate a bucket.
   *
   * @param deleteDeactivateBucketOptions the {@link DeleteDeactivateBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDeactivateBucket(DeleteDeactivateBucketOptions deleteDeactivateBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDeactivateBucketOptions,
      "deleteDeactivateBucketOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", deleteDeactivateBucketOptions.bucketId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}/deactivate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteDeactivateBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDeactivateBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDeactivateBucketOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List bucket objects.
   *
   * Fetch all objects from a given bucket.
   *
   * @param listBucketObjectsOptions the {@link ListBucketObjectsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketRegistrationObjectCollection}
   */
  public ServiceCall<BucketRegistrationObjectCollection> listBucketObjects(ListBucketObjectsOptions listBucketObjectsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listBucketObjectsOptions,
      "listBucketObjectsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", listBucketObjectsOptions.bucketId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}/objects", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listBucketObjects");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBucketObjectsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listBucketObjectsOptions.authInstanceId());
    }
    ResponseConverter<BucketRegistrationObjectCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistrationObjectCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check bucket credentials to be valid.
   *
   * Check whether provided bucket credentials are valid or not.
   *
   * @param testBucketConnectionOptions the {@link TestBucketConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TestBucketConnectionOKBody}
   */
  public ServiceCall<TestBucketConnectionOKBody> testBucketConnection(TestBucketConnectionOptions testBucketConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(testBucketConnectionOptions,
      "testBucketConnectionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/test_bucket_connection"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "testBucketConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (testBucketConnectionOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", testBucketConnectionOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("access_key", testBucketConnectionOptions.accessKey());
    contentJson.addProperty("bucket_name", testBucketConnectionOptions.bucketName());
    contentJson.addProperty("bucket_type", testBucketConnectionOptions.bucketType());
    contentJson.addProperty("endpoint", testBucketConnectionOptions.endpoint());
    contentJson.addProperty("region", testBucketConnectionOptions.region());
    contentJson.addProperty("secret_key", testBucketConnectionOptions.secretKey());
    builder.bodyJson(contentJson);
    ResponseConverter<TestBucketConnectionOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TestBucketConnectionOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add/Create database with driver.
   *
   * Add or create a new database with driver.
   *
   * @param createDriverDatabaseCatalogOptions the {@link CreateDriverDatabaseCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseRegistration}
   */
  public ServiceCall<DatabaseRegistration> createDriverDatabaseCatalog(CreateDriverDatabaseCatalogOptions createDriverDatabaseCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDriverDatabaseCatalogOptions,
      "createDriverDatabaseCatalogOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_driver_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createDriverDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDriverDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDriverDatabaseCatalogOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody driverBody = RequestUtils.inputStreamBody(createDriverDatabaseCatalogOptions.driver(), createDriverDatabaseCatalogOptions.driverContentType());
    multipartBuilder.addFormDataPart("driver", "filename", driverBody);
    multipartBuilder.addFormDataPart("driver_file_name", createDriverDatabaseCatalogOptions.driverFileName());
    multipartBuilder.addFormDataPart("database_display_name", createDriverDatabaseCatalogOptions.databaseDisplayName());
    multipartBuilder.addFormDataPart("database_type", createDriverDatabaseCatalogOptions.databaseType());
    multipartBuilder.addFormDataPart("catalog_name", createDriverDatabaseCatalogOptions.catalogName());
    multipartBuilder.addFormDataPart("hostname", createDriverDatabaseCatalogOptions.hostname());
    multipartBuilder.addFormDataPart("port", createDriverDatabaseCatalogOptions.port());
    multipartBuilder.addFormDataPart("username", createDriverDatabaseCatalogOptions.username());
    multipartBuilder.addFormDataPart("password", createDriverDatabaseCatalogOptions.password());
    multipartBuilder.addFormDataPart("database_name", createDriverDatabaseCatalogOptions.databaseName());
    if (createDriverDatabaseCatalogOptions.certificate() != null) {
      multipartBuilder.addFormDataPart("certificate", createDriverDatabaseCatalogOptions.certificate());
    }
    if (createDriverDatabaseCatalogOptions.certificateExtension() != null) {
      multipartBuilder.addFormDataPart("certificate_extension", createDriverDatabaseCatalogOptions.certificateExtension());
    }
    if (createDriverDatabaseCatalogOptions.ssl() != null) {
      multipartBuilder.addFormDataPart("ssl", createDriverDatabaseCatalogOptions.ssl());
    }
    if (createDriverDatabaseCatalogOptions.description() != null) {
      multipartBuilder.addFormDataPart("description", createDriverDatabaseCatalogOptions.description());
    }
    if (createDriverDatabaseCatalogOptions.createdOn() != null) {
      multipartBuilder.addFormDataPart("created_on", createDriverDatabaseCatalogOptions.createdOn());
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listDatabaseRegistrations");
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createDatabaseRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDatabaseRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDatabaseRegistrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("database_display_name", createDatabaseRegistrationOptions.databaseDisplayName());
    contentJson.addProperty("database_type", createDatabaseRegistrationOptions.databaseType());
    if (createDatabaseRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.associatedCatalog()));
    }
    if (createDatabaseRegistrationOptions.createdOn() != null) {
      contentJson.addProperty("created_on", createDatabaseRegistrationOptions.createdOn());
    }
    if (createDatabaseRegistrationOptions.databaseDetails() != null) {
      contentJson.add("database_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.databaseDetails()));
    }
    if (createDatabaseRegistrationOptions.databaseProperties() != null) {
      contentJson.add("database_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.databaseProperties()));
    }
    if (createDatabaseRegistrationOptions.description() != null) {
      contentJson.addProperty("description", createDatabaseRegistrationOptions.description());
    }
    if (createDatabaseRegistrationOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseRegistrationOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
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
    pathParamsMap.put("database_id", getDatabaseOptions.databaseId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getDatabase");
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
    pathParamsMap.put("database_id", deleteDatabaseCatalogOptions.databaseId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDatabaseCatalogOptions.authInstanceId());
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
    pathParamsMap.put("database_id", updateDatabaseOptions.databaseId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/database_registrations/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDatabaseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDatabaseOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDatabaseOptions.body()), "application/json-patch+json");
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "validateDatabaseConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (validateDatabaseConnectionOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", validateDatabaseConnectionOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("database_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateDatabaseConnectionOptions.databaseDetails()));
    contentJson.addProperty("database_type", validateDatabaseConnectionOptions.databaseType());
    if (validateDatabaseConnectionOptions.certificate() != null) {
      contentJson.addProperty("certificate", validateDatabaseConnectionOptions.certificate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TestDatabaseConnectionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TestDatabaseConnectionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of db2 engines.
   *
   * Get list of all db2 engines.
   *
   * @param listDb2EnginesOptions the {@link ListDb2EnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Db2EngineCollection}
   */
  public ServiceCall<Db2EngineCollection> listDb2Engines(ListDb2EnginesOptions listDb2EnginesOptions) {
    if (listDb2EnginesOptions == null) {
      listDb2EnginesOptions = new ListDb2EnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listDb2Engines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDb2EnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listDb2EnginesOptions.authInstanceId());
    }
    ResponseConverter<Db2EngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Db2EngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of db2 engines.
   *
   * Get list of all db2 engines.
   *
   * @return a {@link ServiceCall} with a result of type {@link Db2EngineCollection}
   */
  public ServiceCall<Db2EngineCollection> listDb2Engines() {
    return listDb2Engines(null);
  }

  /**
   * Create db2 engine.
   *
   * Create a new db2 engine.
   *
   * @param createDb2EngineOptions the {@link CreateDb2EngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Db2Engine}
   */
  public ServiceCall<Db2Engine> createDb2Engine(CreateDb2EngineOptions createDb2EngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDb2EngineOptions,
      "createDb2EngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createDb2Engine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDb2EngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDb2EngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createDb2EngineOptions.origin());
    contentJson.addProperty("type", createDb2EngineOptions.type());
    if (createDb2EngineOptions.description() != null) {
      contentJson.addProperty("description", createDb2EngineOptions.description());
    }
    if (createDb2EngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDb2EngineOptions.engineDetails()));
    }
    if (createDb2EngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createDb2EngineOptions.engineDisplayName());
    }
    if (createDb2EngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDb2EngineOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Db2Engine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Db2Engine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete db2 engine.
   *
   * Delete a db2 engine.
   *
   * @param deleteDb2EngineOptions the {@link DeleteDb2EngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDb2Engine(DeleteDb2EngineOptions deleteDb2EngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDb2EngineOptions,
      "deleteDb2EngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteDb2EngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteDb2Engine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDb2EngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDb2EngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update db2 engine.
   *
   * Update details of db2 engine.
   *
   * @param updateDb2EngineOptions the {@link UpdateDb2EngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Db2Engine}
   */
  public ServiceCall<Db2Engine> updateDb2Engine(UpdateDb2EngineOptions updateDb2EngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDb2EngineOptions,
      "updateDb2EngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updateDb2EngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateDb2Engine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDb2EngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDb2EngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDb2EngineOptions.body()), "application/json-patch+json");
    ResponseConverter<Db2Engine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Db2Engine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all engines.
   *
   * Get all engine details.
   *
   * @param getEnginesOptions the {@link GetEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Engines}
   */
  public ServiceCall<Engines> getEngines(GetEnginesOptions getEnginesOptions) {
    if (getEnginesOptions == null) {
      getEnginesOptions = new GetEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getEnginesOptions.authInstanceId());
    }
    ResponseConverter<Engines> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Engines>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all engines.
   *
   * Get all engine details.
   *
   * @return a {@link ServiceCall} with a result of type {@link Engines}
   */
  public ServiceCall<Engines> getEngines() {
    return getEngines(null);
  }

  /**
   * Get deployments.
   *
   * Get list of all deployments.
   *
   * @param getDeploymentsOptions the {@link GetDeploymentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetDeploymentsOKBody}
   */
  public ServiceCall<GetDeploymentsOKBody> getDeployments(GetDeploymentsOptions getDeploymentsOptions) {
    if (getDeploymentsOptions == null) {
      getDeploymentsOptions = new GetDeploymentsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getDeployments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDeploymentsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDeploymentsOptions.authInstanceId());
    }
    ResponseConverter<GetDeploymentsOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetDeploymentsOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get deployments.
   *
   * Get list of all deployments.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetDeploymentsOKBody}
   */
  public ServiceCall<GetDeploymentsOKBody> getDeployments() {
    return getDeployments(null);
  }

  /**
   * Get list of netezza engines.
   *
   * Get list of all netezza engines.
   *
   * @param listNetezzaEnginesOptions the {@link ListNetezzaEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetezzaEngineCollection}
   */
  public ServiceCall<NetezzaEngineCollection> listNetezzaEngines(ListNetezzaEnginesOptions listNetezzaEnginesOptions) {
    if (listNetezzaEnginesOptions == null) {
      listNetezzaEnginesOptions = new ListNetezzaEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listNetezzaEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listNetezzaEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listNetezzaEnginesOptions.authInstanceId());
    }
    ResponseConverter<NetezzaEngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetezzaEngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of netezza engines.
   *
   * Get list of all netezza engines.
   *
   * @return a {@link ServiceCall} with a result of type {@link NetezzaEngineCollection}
   */
  public ServiceCall<NetezzaEngineCollection> listNetezzaEngines() {
    return listNetezzaEngines(null);
  }

  /**
   * Create netezza engine.
   *
   * Create a new netezza engine.
   *
   * @param createNetezzaEngineOptions the {@link CreateNetezzaEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetezzaEngine}
   */
  public ServiceCall<NetezzaEngine> createNetezzaEngine(CreateNetezzaEngineOptions createNetezzaEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createNetezzaEngineOptions,
      "createNetezzaEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createNetezzaEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createNetezzaEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createNetezzaEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createNetezzaEngineOptions.origin());
    contentJson.addProperty("type", createNetezzaEngineOptions.type());
    if (createNetezzaEngineOptions.description() != null) {
      contentJson.addProperty("description", createNetezzaEngineOptions.description());
    }
    if (createNetezzaEngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createNetezzaEngineOptions.engineDetails()));
    }
    if (createNetezzaEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createNetezzaEngineOptions.engineDisplayName());
    }
    if (createNetezzaEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createNetezzaEngineOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<NetezzaEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetezzaEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete netezza engine.
   *
   * Delete a netezza engine.
   *
   * @param deleteNetezzaEngineOptions the {@link DeleteNetezzaEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteNetezzaEngine(DeleteNetezzaEngineOptions deleteNetezzaEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteNetezzaEngineOptions,
      "deleteNetezzaEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteNetezzaEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteNetezzaEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteNetezzaEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteNetezzaEngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update netezza engine.
   *
   * Update details of netezza engine.
   *
   * @param updateNetezzaEngineOptions the {@link UpdateNetezzaEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link NetezzaEngine}
   */
  public ServiceCall<NetezzaEngine> updateNetezzaEngine(UpdateNetezzaEngineOptions updateNetezzaEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateNetezzaEngineOptions,
      "updateNetezzaEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updateNetezzaEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateNetezzaEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateNetezzaEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateNetezzaEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateNetezzaEngineOptions.body()), "application/json-patch+json");
    ResponseConverter<NetezzaEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetezzaEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List other engines.
   *
   * list all other engine details.
   *
   * @param listOtherEnginesOptions the {@link ListOtherEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OtherEngineCollection}
   */
  public ServiceCall<OtherEngineCollection> listOtherEngines(ListOtherEnginesOptions listOtherEnginesOptions) {
    if (listOtherEnginesOptions == null) {
      listOtherEnginesOptions = new ListOtherEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/other_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listOtherEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listOtherEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listOtherEnginesOptions.authInstanceId());
    }
    ResponseConverter<OtherEngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OtherEngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List other engines.
   *
   * list all other engine details.
   *
   * @return a {@link ServiceCall} with a result of type {@link OtherEngineCollection}
   */
  public ServiceCall<OtherEngineCollection> listOtherEngines() {
    return listOtherEngines(null);
  }

  /**
   * Create other engine.
   *
   * Create a new engine.
   *
   * @param createOtherEngineOptions the {@link CreateOtherEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OtherEngine}
   */
  public ServiceCall<OtherEngine> createOtherEngine(CreateOtherEngineOptions createOtherEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createOtherEngineOptions,
      "createOtherEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/other_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createOtherEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createOtherEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createOtherEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOtherEngineOptions.engineDetails()));
    contentJson.addProperty("engine_display_name", createOtherEngineOptions.engineDisplayName());
    if (createOtherEngineOptions.description() != null) {
      contentJson.addProperty("description", createOtherEngineOptions.description());
    }
    if (createOtherEngineOptions.origin() != null) {
      contentJson.addProperty("origin", createOtherEngineOptions.origin());
    }
    if (createOtherEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOtherEngineOptions.tags()));
    }
    if (createOtherEngineOptions.type() != null) {
      contentJson.addProperty("type", createOtherEngineOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<OtherEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OtherEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete engine.
   *
   * Delete an engine from lakehouse.
   *
   * @param deleteOtherEngineOptions the {@link DeleteOtherEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteOtherEngine(DeleteOtherEngineOptions deleteOtherEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteOtherEngineOptions,
      "deleteOtherEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteOtherEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/other_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteOtherEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteOtherEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteOtherEngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of prestissimo engines.
   *
   * Get list of all prestissimo engines.
   *
   * @param listPrestissimoEnginesOptions the {@link ListPrestissimoEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngineCollection}
   */
  public ServiceCall<PrestissimoEngineCollection> listPrestissimoEngines(ListPrestissimoEnginesOptions listPrestissimoEnginesOptions) {
    if (listPrestissimoEnginesOptions == null) {
      listPrestissimoEnginesOptions = new ListPrestissimoEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listPrestissimoEngines");
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
   * Get list of prestissimo engines.
   *
   * Get list of all prestissimo engines.
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createPrestissimoEngineOptions.origin());
    contentJson.addProperty("type", createPrestissimoEngineOptions.type());
    if (createPrestissimoEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.associatedCatalogs()));
    }
    if (createPrestissimoEngineOptions.description() != null) {
      contentJson.addProperty("description", createPrestissimoEngineOptions.description());
    }
    if (createPrestissimoEngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.engineDetails()));
    }
    if (createPrestissimoEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createPrestissimoEngineOptions.engineDisplayName());
    }
    if (createPrestissimoEngineOptions.region() != null) {
      contentJson.addProperty("region", createPrestissimoEngineOptions.region());
    }
    if (createPrestissimoEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineOptions.tags()));
    }
    if (createPrestissimoEngineOptions.version() != null) {
      contentJson.addProperty("version", createPrestissimoEngineOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestissimoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestissimoEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get prestissimo engine.
   *
   * Get details of one prestissimo engine.
   *
   * @param getPrestissimoEngineOptions the {@link GetPrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngine}
   */
  public ServiceCall<PrestissimoEngine> getPrestissimoEngine(GetPrestissimoEngineOptions getPrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestissimoEngineOptions,
      "getPrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getPrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getPrestissimoEngine");
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
    pathParamsMap.put("engine_id", deletePrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deletePrestissimoEngine");
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
    pathParamsMap.put("engine_id", updatePrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updatePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updatePrestissimoEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updatePrestissimoEngineOptions.body()), "application/json-patch+json");
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
    pathParamsMap.put("engine_id", listPrestissimoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listPrestissimoEngineCatalogs");
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
   * @param replacePrestissimoEngineCatalogsOptions the {@link ReplacePrestissimoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> replacePrestissimoEngineCatalogs(ReplacePrestissimoEngineCatalogsOptions replacePrestissimoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replacePrestissimoEngineCatalogsOptions,
      "replacePrestissimoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", replacePrestissimoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "replacePrestissimoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replacePrestissimoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replacePrestissimoEngineCatalogsOptions.authInstanceId());
    }
    builder.query("catalog_names", String.valueOf(replacePrestissimoEngineCatalogsOptions.catalogNames()));
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
    pathParamsMap.put("engine_id", deletePrestissimoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deletePrestissimoEngineCatalogs");
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
   * Get prestissimo engine catalog.
   *
   * Get catalog attached to a prestissimo engine.
   *
   * @param getPrestissimoEngineCatalogOptions the {@link GetPrestissimoEngineCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> getPrestissimoEngineCatalog(GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestissimoEngineCatalogOptions,
      "getPrestissimoEngineCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getPrestissimoEngineCatalogOptions.engineId());
    pathParamsMap.put("catalog_id", getPrestissimoEngineCatalogOptions.catalogId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs/{catalog_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getPrestissimoEngineCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPrestissimoEngineCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPrestissimoEngineCatalogOptions.authInstanceId());
    }
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Pause prestissimo engine.
   *
   * Pause a running prestissimo engine.
   *
   * @param createPrestissimoEnginePauseOptions the {@link CreatePrestissimoEnginePauseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createPrestissimoEnginePause(CreatePrestissimoEnginePauseOptions createPrestissimoEnginePauseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEnginePauseOptions,
      "createPrestissimoEnginePauseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestissimoEnginePauseOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEnginePause");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEnginePauseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEnginePauseOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain query.
   *
   * Explain a query statement.
   *
   * @param runPrestissimoExplainStatementOptions the {@link RunPrestissimoExplainStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResultPrestissimoExplainStatement}
   */
  public ServiceCall<ResultPrestissimoExplainStatement> runPrestissimoExplainStatement(RunPrestissimoExplainStatementOptions runPrestissimoExplainStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runPrestissimoExplainStatementOptions,
      "runPrestissimoExplainStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", runPrestissimoExplainStatementOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/query_explain", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "runPrestissimoExplainStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runPrestissimoExplainStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runPrestissimoExplainStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runPrestissimoExplainStatementOptions.statement());
    if (runPrestissimoExplainStatementOptions.format() != null) {
      contentJson.addProperty("format", runPrestissimoExplainStatementOptions.format());
    }
    if (runPrestissimoExplainStatementOptions.type() != null) {
      contentJson.addProperty("type", runPrestissimoExplainStatementOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResultPrestissimoExplainStatement> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResultPrestissimoExplainStatement>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain analyze.
   *
   * Return query metrics after query is complete.
   *
   * @param runPrestissimoExplainAnalyzeStatementOptions the {@link RunPrestissimoExplainAnalyzeStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResultRunPrestissimoExplainAnalyzeStatement}
   */
  public ServiceCall<ResultRunPrestissimoExplainAnalyzeStatement> runPrestissimoExplainAnalyzeStatement(RunPrestissimoExplainAnalyzeStatementOptions runPrestissimoExplainAnalyzeStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runPrestissimoExplainAnalyzeStatementOptions,
      "runPrestissimoExplainAnalyzeStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", runPrestissimoExplainAnalyzeStatementOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/query_explain_analyze", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "runPrestissimoExplainAnalyzeStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runPrestissimoExplainAnalyzeStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runPrestissimoExplainAnalyzeStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runPrestissimoExplainAnalyzeStatementOptions.statement());
    if (runPrestissimoExplainAnalyzeStatementOptions.verbose() != null) {
      contentJson.addProperty("verbose", runPrestissimoExplainAnalyzeStatementOptions.verbose());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResultRunPrestissimoExplainAnalyzeStatement> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResultRunPrestissimoExplainAnalyzeStatement>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart a prestissimo engine.
   *
   * Restart an existing prestissimo engine.
   *
   * @param createPrestissimoEngineRestartOptions the {@link CreatePrestissimoEngineRestartOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createPrestissimoEngineRestart(CreatePrestissimoEngineRestartOptions createPrestissimoEngineRestartOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineRestartOptions,
      "createPrestissimoEngineRestartOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestissimoEngineRestartOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEngineRestart");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineRestartOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineRestartOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume prestissimo engine.
   *
   * Resume a paused prestissimo engine.
   *
   * @param createPrestissimoEngineResumeOptions the {@link CreatePrestissimoEngineResumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createPrestissimoEngineResume(CreatePrestissimoEngineResumeOptions createPrestissimoEngineResumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineResumeOptions,
      "createPrestissimoEngineResumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestissimoEngineResumeOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEngineResume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineResumeOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineResumeOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale a prestissimo engine.
   *
   * Scale an existing prestissimo engine.
   *
   * @param createPrestissimoEngineScaleOptions the {@link CreatePrestissimoEngineScaleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createPrestissimoEngineScale(CreatePrestissimoEngineScaleOptions createPrestissimoEngineScaleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineScaleOptions,
      "createPrestissimoEngineScaleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestissimoEngineScaleOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEngineScale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineScaleOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineScaleOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPrestissimoEngineScaleOptions.coordinator() != null) {
      contentJson.add("coordinator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineScaleOptions.coordinator()));
    }
    if (createPrestissimoEngineScaleOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestissimoEngineScaleOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of presto engines.
   *
   * Get list of all presto engines.
   *
   * @param listPrestoEnginesOptions the {@link ListPrestoEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineCollection}
   */
  public ServiceCall<PrestoEngineCollection> listPrestoEngines(ListPrestoEnginesOptions listPrestoEnginesOptions) {
    if (listPrestoEnginesOptions == null) {
      listPrestoEnginesOptions = new ListPrestoEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listPrestoEngines");
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
   * Get list of presto engines.
   *
   * Get list of all presto engines.
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createPrestoEngineOptions.origin());
    contentJson.addProperty("type", createPrestoEngineOptions.type());
    if (createPrestoEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.associatedCatalogs()));
    }
    if (createPrestoEngineOptions.description() != null) {
      contentJson.addProperty("description", createPrestoEngineOptions.description());
    }
    if (createPrestoEngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.engineDetails()));
    }
    if (createPrestoEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createPrestoEngineOptions.engineDisplayName());
    }
    if (createPrestoEngineOptions.region() != null) {
      contentJson.addProperty("region", createPrestoEngineOptions.region());
    }
    if (createPrestoEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineOptions.tags()));
    }
    if (createPrestoEngineOptions.version() != null) {
      contentJson.addProperty("version", createPrestoEngineOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestoEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngine>() { }.getType());
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
    pathParamsMap.put("engine_id", getPrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getPrestoEngine");
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
    pathParamsMap.put("engine_id", deleteEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteEngine");
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
    pathParamsMap.put("engine_id", updatePrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updatePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updatePrestoEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updatePrestoEngineOptions.body()), "application/json-patch+json");
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listPrestoEngineCatalogs");
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
   * @param replacePrestoEngineCatalogsOptions the {@link ReplacePrestoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> replacePrestoEngineCatalogs(ReplacePrestoEngineCatalogsOptions replacePrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replacePrestoEngineCatalogsOptions,
      "replacePrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", replacePrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "replacePrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replacePrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replacePrestoEngineCatalogsOptions.authInstanceId());
    }
    builder.query("catalog_names", String.valueOf(replacePrestoEngineCatalogsOptions.catalogNames()));
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deletePrestoEngineCatalogs");
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
   * Get presto engine catalog.
   *
   * Get catalog attached to presto engine.
   *
   * @param getPrestoEngineCatalogOptions the {@link GetPrestoEngineCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> getPrestoEngineCatalog(GetPrestoEngineCatalogOptions getPrestoEngineCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestoEngineCatalogOptions,
      "getPrestoEngineCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getPrestoEngineCatalogOptions.engineId());
    pathParamsMap.put("catalog_id", getPrestoEngineCatalogOptions.catalogId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs/{catalog_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getPrestoEngineCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPrestoEngineCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPrestoEngineCatalogOptions.authInstanceId());
    }
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Pause presto engine.
   *
   * Pause a running presto engine.
   *
   * @param createEnginePauseOptions the {@link CreateEnginePauseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEnginePauseCreatedBody}
   */
  public ServiceCall<CreateEnginePauseCreatedBody> createEnginePause(CreateEnginePauseOptions createEnginePauseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEnginePauseOptions,
      "createEnginePauseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createEnginePauseOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createEnginePause");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createEnginePauseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEnginePauseOptions.authInstanceId());
    }
    ResponseConverter<CreateEnginePauseCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateEnginePauseCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain presto query.
   *
   * Explain a query statement.
   *
   * @param runExplainStatementOptions the {@link RunExplainStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RunExplainStatementOKBody}
   */
  public ServiceCall<RunExplainStatementOKBody> runExplainStatement(RunExplainStatementOptions runExplainStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runExplainStatementOptions,
      "runExplainStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", runExplainStatementOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/query_explain", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "runExplainStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runExplainStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runExplainStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runExplainStatementOptions.statement());
    if (runExplainStatementOptions.format() != null) {
      contentJson.addProperty("format", runExplainStatementOptions.format());
    }
    if (runExplainStatementOptions.type() != null) {
      contentJson.addProperty("type", runExplainStatementOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RunExplainStatementOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RunExplainStatementOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain presto analyze.
   *
   * Return query metrics after query is complete.
   *
   * @param runExplainAnalyzeStatementOptions the {@link RunExplainAnalyzeStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RunExplainAnalyzeStatementOKBody}
   */
  public ServiceCall<RunExplainAnalyzeStatementOKBody> runExplainAnalyzeStatement(RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runExplainAnalyzeStatementOptions,
      "runExplainAnalyzeStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", runExplainAnalyzeStatementOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/query_explain_analyze", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "runExplainAnalyzeStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runExplainAnalyzeStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runExplainAnalyzeStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runExplainAnalyzeStatementOptions.statement());
    if (runExplainAnalyzeStatementOptions.verbose() != null) {
      contentJson.addProperty("verbose", runExplainAnalyzeStatementOptions.verbose());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RunExplainAnalyzeStatementOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RunExplainAnalyzeStatementOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart a presto engine.
   *
   * Restart an existing presto engine.
   *
   * @param createEngineRestartOptions the {@link CreateEngineRestartOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineRestartCreatedBody}
   */
  public ServiceCall<CreateEngineRestartCreatedBody> createEngineRestart(CreateEngineRestartOptions createEngineRestartOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEngineRestartOptions,
      "createEngineRestartOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createEngineRestartOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createEngineRestart");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createEngineRestartOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEngineRestartOptions.authInstanceId());
    }
    ResponseConverter<CreateEngineRestartCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateEngineRestartCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume presto engine.
   *
   * Resume a paused presto engine.
   *
   * @param createEngineResumeOptions the {@link CreateEngineResumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineResumeCreatedBody}
   */
  public ServiceCall<CreateEngineResumeCreatedBody> createEngineResume(CreateEngineResumeOptions createEngineResumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEngineResumeOptions,
      "createEngineResumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createEngineResumeOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createEngineResume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createEngineResumeOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEngineResumeOptions.authInstanceId());
    }
    ResponseConverter<CreateEngineResumeCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateEngineResumeCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale a presto engine.
   *
   * Scale an existing presto engine.
   *
   * @param createEngineScaleOptions the {@link CreateEngineScaleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineScaleCreatedBody}
   */
  public ServiceCall<CreateEngineScaleCreatedBody> createEngineScale(CreateEngineScaleOptions createEngineScaleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEngineScaleOptions,
      "createEngineScaleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createEngineScaleOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createEngineScale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createEngineScaleOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEngineScaleOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createEngineScaleOptions.coordinator() != null) {
      contentJson.add("coordinator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineScaleOptions.coordinator()));
    }
    if (createEngineScaleOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineScaleOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CreateEngineScaleCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateEngineScaleCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all spark engines.
   *
   * List all spark engines.
   *
   * @param listSparkEnginesOptions the {@link ListSparkEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineCollection}
   */
  public ServiceCall<SparkEngineCollection> listSparkEngines(ListSparkEnginesOptions listSparkEnginesOptions) {
    if (listSparkEnginesOptions == null) {
      listSparkEnginesOptions = new ListSparkEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listSparkEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkEnginesOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all spark engines.
   *
   * List all spark engines.
   *
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineCollection}
   */
  public ServiceCall<SparkEngineCollection> listSparkEngines() {
    return listSparkEngines(null);
  }

  /**
   * Create spark engine.
   *
   * Create a new spark  engine.
   *
   * @param createSparkEngineOptions the {@link CreateSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngine}
   */
  public ServiceCall<SparkEngine> createSparkEngine(CreateSparkEngineOptions createSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineOptions,
      "createSparkEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createSparkEngineOptions.origin());
    contentJson.addProperty("type", createSparkEngineOptions.type());
    if (createSparkEngineOptions.description() != null) {
      contentJson.addProperty("description", createSparkEngineOptions.description());
    }
    if (createSparkEngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.engineDetails()));
    }
    if (createSparkEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createSparkEngineOptions.engineDisplayName());
    }
    if (createSparkEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete spark engine.
   *
   * Delete a spark engine.
   *
   * @param deleteSparkEngineOptions the {@link DeleteSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngine(DeleteSparkEngineOptions deleteSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineOptions,
      "deleteSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update spark engine.
   *
   * Update details of spark engine.
   *
   * @param updateSparkEngineOptions the {@link UpdateSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngine}
   */
  public ServiceCall<SparkEngine> updateSparkEngine(UpdateSparkEngineOptions updateSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSparkEngineOptions,
      "updateSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updateSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSparkEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateSparkEngineOptions.body()), "application/json-patch+json");
    ResponseConverter<SparkEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all applications in a spark engine.
   *
   * List all applications in a spark engine.
   *
   * @param listSparkEngineApplicationsOptions the {@link ListSparkEngineApplicationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationStatusCollection}
   */
  public ServiceCall<SparkEngineApplicationStatusCollection> listSparkEngineApplications(ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSparkEngineApplicationsOptions,
      "listSparkEngineApplicationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", listSparkEngineApplicationsOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listSparkEngineApplications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkEngineApplicationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkEngineApplicationsOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineApplicationStatusCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationStatusCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit engine applications.
   *
   * Submit engine applications.
   *
   * @param createSparkEngineApplicationOptions the {@link CreateSparkEngineApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationStatus}
   */
  public ServiceCall<SparkEngineApplicationStatus> createSparkEngineApplication(CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineApplicationOptions,
      "createSparkEngineApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createSparkEngineApplicationOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSparkEngineApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineApplicationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineApplicationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("application_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.applicationDetails()));
    if (createSparkEngineApplicationOptions.jobEndpoint() != null) {
      contentJson.addProperty("job_endpoint", createSparkEngineApplicationOptions.jobEndpoint());
    }
    if (createSparkEngineApplicationOptions.serviceInstanceId() != null) {
      contentJson.addProperty("service_instance_id", createSparkEngineApplicationOptions.serviceInstanceId());
    }
    if (createSparkEngineApplicationOptions.type() != null) {
      contentJson.addProperty("type", createSparkEngineApplicationOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkEngineApplicationStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop Spark Applications.
   *
   * Stop a running spark application.
   *
   * @param deleteSparkEngineApplicationsOptions the {@link DeleteSparkEngineApplicationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngineApplications(DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineApplicationsOptions,
      "deleteSparkEngineApplicationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteSparkEngineApplicationsOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSparkEngineApplications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineApplicationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineApplicationsOptions.authInstanceId());
    }
    builder.query("application_id", String.valueOf(deleteSparkEngineApplicationsOptions.applicationId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get spark application.
   *
   * Get status of spark application.
   *
   * @param getSparkEngineApplicationStatusOptions the {@link GetSparkEngineApplicationStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationStatus}
   */
  public ServiceCall<SparkEngineApplicationStatus> getSparkEngineApplicationStatus(GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineApplicationStatusOptions,
      "getSparkEngineApplicationStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineApplicationStatusOptions.engineId());
    pathParamsMap.put("application_id", getSparkEngineApplicationStatusOptions.applicationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications/{application_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSparkEngineApplicationStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineApplicationStatusOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineApplicationStatusOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineApplicationStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @param testLhConsoleOptions the {@link TestLHConsoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> testLHConsole(TestLHConsoleOptions testLhConsoleOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ready"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "testLHConsole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> testLHConsole() {
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listCatalogsOptions.authInstanceId());
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
    pathParamsMap.put("catalog_id", getCatalogOptions.catalogId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getCatalog");
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
   * List all schemas.
   *
   * List all schemas in catalog.
   *
   * @param listSchemasOptions the {@link ListSchemasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListSchemasOKBody}
   */
  public ServiceCall<ListSchemasOKBody> listSchemas(ListSchemasOptions listSchemasOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSchemasOptions,
      "listSchemasOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", listSchemasOptions.catalogId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listSchemas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSchemasOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSchemasOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(listSchemasOptions.engineId()));
    ResponseConverter<ListSchemasOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSchemasOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create schema.
   *
   * Create a new schema.
   *
   * @param createSchemaOptions the {@link CreateSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateSchemaCreatedBody}
   */
  public ServiceCall<CreateSchemaCreatedBody> createSchema(CreateSchemaOptions createSchemaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSchemaOptions,
      "createSchemaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", createSchemaOptions.catalogId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSchema");
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
    contentJson.addProperty("schema_name", createSchemaOptions.schemaName());
    if (createSchemaOptions.bucketName() != null) {
      contentJson.addProperty("bucket_name", createSchemaOptions.bucketName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CreateSchemaCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateSchemaCreatedBody>() { }.getType());
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
    pathParamsMap.put("catalog_id", deleteSchemaOptions.catalogId());
    pathParamsMap.put("schema_id", deleteSchemaOptions.schemaId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSchema");
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
    pathParamsMap.put("catalog_id", listTablesOptions.catalogId());
    pathParamsMap.put("schema_id", listTablesOptions.schemaId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listTables");
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
    pathParamsMap.put("catalog_id", getTableOptions.catalogId());
    pathParamsMap.put("schema_id", getTableOptions.schemaId());
    pathParamsMap.put("table_id", getTableOptions.tableId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getTableOptions.engineId()));
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
    pathParamsMap.put("catalog_id", deleteTableOptions.catalogId());
    pathParamsMap.put("schema_id", deleteTableOptions.schemaId());
    pathParamsMap.put("table_id", deleteTableOptions.tableId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(deleteTableOptions.engineId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Alter table.
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
    pathParamsMap.put("catalog_id", updateTableOptions.catalogId());
    pathParamsMap.put("schema_id", updateTableOptions.schemaId());
    pathParamsMap.put("table_id", updateTableOptions.tableId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(updateTableOptions.engineId()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateTableOptions.body()), "application/json-patch+json");
    ResponseConverter<Table> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Table>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all columns of a table.
   *
   * List all columns of a table in a given a schema for a given catalog.
   *
   * @param listColumnsOptions the {@link ListColumnsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ColumnCollection}
   */
  public ServiceCall<ColumnCollection> listColumns(ListColumnsOptions listColumnsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listColumnsOptions,
      "listColumnsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", listColumnsOptions.catalogId());
    pathParamsMap.put("schema_id", listColumnsOptions.schemaId());
    pathParamsMap.put("table_id", listColumnsOptions.tableId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/columns", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listColumns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listColumnsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listColumnsOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(listColumnsOptions.engineId()));
    ResponseConverter<ColumnCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ColumnCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add column(s).
   *
   * Add one or multiple columns to a table in a schema for a given catalog.
   *
   * @param createColumnsOptions the {@link CreateColumnsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ColumnCollection}
   */
  public ServiceCall<ColumnCollection> createColumns(CreateColumnsOptions createColumnsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createColumnsOptions,
      "createColumnsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", createColumnsOptions.catalogId());
    pathParamsMap.put("schema_id", createColumnsOptions.schemaId());
    pathParamsMap.put("table_id", createColumnsOptions.tableId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/columns", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createColumns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createColumnsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createColumnsOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(createColumnsOptions.engineId()));
    final JsonObject contentJson = new JsonObject();
    if (createColumnsOptions.columns() != null) {
      contentJson.add("columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createColumnsOptions.columns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ColumnCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ColumnCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete column.
   *
   * Delete column in a table for a given schema and catalog.
   *
   * @param deleteColumnOptions the {@link DeleteColumnOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteColumn(DeleteColumnOptions deleteColumnOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteColumnOptions,
      "deleteColumnOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", deleteColumnOptions.catalogId());
    pathParamsMap.put("schema_id", deleteColumnOptions.schemaId());
    pathParamsMap.put("table_id", deleteColumnOptions.tableId());
    pathParamsMap.put("column_id", deleteColumnOptions.columnId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/columns/{column_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteColumn");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteColumnOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteColumnOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(deleteColumnOptions.engineId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Alter column.
   *
   * Update the given column - rename column.
   *
   * @param updateColumnOptions the {@link UpdateColumnOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Column}
   */
  public ServiceCall<Column> updateColumn(UpdateColumnOptions updateColumnOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateColumnOptions,
      "updateColumnOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", updateColumnOptions.catalogId());
    pathParamsMap.put("schema_id", updateColumnOptions.schemaId());
    pathParamsMap.put("table_id", updateColumnOptions.tableId());
    pathParamsMap.put("column_id", updateColumnOptions.columnId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/columns/{column_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateColumn");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateColumnOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateColumnOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(updateColumnOptions.engineId()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateColumnOptions.body()), "application/json-patch+json");
    ResponseConverter<Column> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Column>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get table snapshots.
   *
   * List all table snapshots.
   *
   * @param listTableSnapshotsOptions the {@link ListTableSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TableSnapshotCollection}
   */
  public ServiceCall<TableSnapshotCollection> listTableSnapshots(ListTableSnapshotsOptions listTableSnapshotsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTableSnapshotsOptions,
      "listTableSnapshotsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", listTableSnapshotsOptions.catalogId());
    pathParamsMap.put("schema_id", listTableSnapshotsOptions.schemaId());
    pathParamsMap.put("table_id", listTableSnapshotsOptions.tableId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/snapshots", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listTableSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTableSnapshotsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listTableSnapshotsOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(listTableSnapshotsOptions.engineId()));
    ResponseConverter<TableSnapshotCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableSnapshotCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rollback snapshot.
   *
   * Rollback to a table snapshot.
   *
   * @param replaceSnapshotOptions the {@link ReplaceSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReplaceSnapshotCreatedBody}
   */
  public ServiceCall<ReplaceSnapshotCreatedBody> replaceSnapshot(ReplaceSnapshotOptions replaceSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSnapshotOptions,
      "replaceSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", replaceSnapshotOptions.catalogId());
    pathParamsMap.put("schema_id", replaceSnapshotOptions.schemaId());
    pathParamsMap.put("table_id", replaceSnapshotOptions.tableId());
    pathParamsMap.put("snapshot_id", replaceSnapshotOptions.snapshotId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/snapshots/{snapshot_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "replaceSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceSnapshotOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replaceSnapshotOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(replaceSnapshotOptions.engineId()));
    ResponseConverter<ReplaceSnapshotCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReplaceSnapshotCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * External Iceberg table registration.
   *
   * Synchronize the external Iceberg table registration for a catalog identified by catalog_id.
   *
   * @param updateSyncCatalogOptions the {@link UpdateSyncCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UpdateSyncCatalogOKBody}
   */
  public ServiceCall<UpdateSyncCatalogOKBody> updateSyncCatalog(UpdateSyncCatalogOptions updateSyncCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSyncCatalogOptions,
      "updateSyncCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", updateSyncCatalogOptions.catalogId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/sync", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateSyncCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSyncCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSyncCatalogOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateSyncCatalogOptions.body()), "application/json-patch+json");
    ResponseConverter<UpdateSyncCatalogOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UpdateSyncCatalogOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of milvus services.
   *
   * Get list milvus services.
   *
   * @param listMilvusServicesOptions the {@link ListMilvusServicesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusServiceCollection}
   */
  public ServiceCall<MilvusServiceCollection> listMilvusServices(ListMilvusServicesOptions listMilvusServicesOptions) {
    if (listMilvusServicesOptions == null) {
      listMilvusServicesOptions = new ListMilvusServicesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listMilvusServices");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMilvusServicesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listMilvusServicesOptions.authInstanceId());
    }
    ResponseConverter<MilvusServiceCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusServiceCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of milvus services.
   *
   * Get list milvus services.
   *
   * @return a {@link ServiceCall} with a result of type {@link MilvusServiceCollection}
   */
  public ServiceCall<MilvusServiceCollection> listMilvusServices() {
    return listMilvusServices(null);
  }

  /**
   * Create milvus service.
   *
   * Create milvus service.
   *
   * @param createMilvusServiceOptions the {@link CreateMilvusServiceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusService}
   */
  public ServiceCall<MilvusService> createMilvusService(CreateMilvusServiceOptions createMilvusServiceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMilvusServiceOptions,
      "createMilvusServiceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("origin", createMilvusServiceOptions.origin());
    contentJson.addProperty("type", createMilvusServiceOptions.type());
    if (createMilvusServiceOptions.description() != null) {
      contentJson.addProperty("description", createMilvusServiceOptions.description());
    }
    if (createMilvusServiceOptions.serviceDisplayName() != null) {
      contentJson.addProperty("service_display_name", createMilvusServiceOptions.serviceDisplayName());
    }
    if (createMilvusServiceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMilvusServiceOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get milvus service.
   *
   * Get milvus service.
   *
   * @param getMilvusServiceOptions the {@link GetMilvusServiceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusService}
   */
  public ServiceCall<MilvusService> getMilvusService(GetMilvusServiceOptions getMilvusServiceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMilvusServiceOptions,
      "getMilvusServiceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", getMilvusServiceOptions.serviceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getMilvusServiceOptions.authInstanceId());
    }
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete milvus service.
   *
   * Delete milvus service.
   *
   * @param deleteMilvusServiceOptions the {@link DeleteMilvusServiceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteMilvusService(DeleteMilvusServiceOptions deleteMilvusServiceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMilvusServiceOptions,
      "deleteMilvusServiceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", deleteMilvusServiceOptions.serviceId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteMilvusServiceOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update milvus service.
   *
   * Update details of milvus service.
   *
   * @param updateMilvusServiceOptions the {@link UpdateMilvusServiceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusService}
   */
  public ServiceCall<MilvusService> updateMilvusService(UpdateMilvusServiceOptions updateMilvusServiceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMilvusServiceOptions,
      "updateMilvusServiceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", updateMilvusServiceOptions.serviceId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMilvusServiceOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateMilvusServiceOptions.body()), "application/json-patch+json");
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
