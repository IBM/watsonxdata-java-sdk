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
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.watsonx_data.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicyBulkUpdateResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddStorageCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BulkUpdateResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateHdfsStorageOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateIngestionJobOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateMilvusServicePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateMilvusServiceResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateMilvusServiceScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSalIntegrationEnrichmentOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSalIntegrationUploadGlossaryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2EngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSalMetadataOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSemanticSearchQueriesByIdOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetIngestionJobOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetIntegrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestissimoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestoEngineConfigOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationEnrichmentAssetsByIdOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationEnrichmentJobRunLogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationGlossaryTermsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSalIntegrationUploadGlossaryStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineApplicationUiOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineHistoryServerUiOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetStorageObjectPropertiesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJobCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Integration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IntegrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListAllIntegrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListIngestionJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListMilvusDatabaseCollectionsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListMilvusDatabasePartitionsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListMilvusServiceDatabasesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListMilvusServicesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListNetezzaEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListOtherEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSalIntegrationEnrichmentAssetsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSalIntegrationEnrichmentJobRunsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSalIntegrationEnrichmentJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSalIntegrationEnrichmentMappingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListStorageRegistrationsObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListStorageRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.LoadTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.LoadTableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDatabaseCollections;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDatabasePartitions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PatchAutoscalingSuccess;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyV2Collection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEnginePropertiesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineSuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoQueryExplain;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RestartPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RestartPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumeSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RevokeResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RollbackTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RunPrestissimoExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RunPrestissimoExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentDataAsset;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentDataAssetCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentJobRunLogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentJobRuns;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentJobs;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettings;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryTerms;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryUploadProcess;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryUploadStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegrationMappings;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchList;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkHistoryServer;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageObjectProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponsePrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateMilvusServiceBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineAutoscalingOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineConfigOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateIntegration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateIntegrationOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

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
  public static final String DEFAULT_SERVICE_URL = "https://region.lakehouse.cloud.ibm.com/lakehouse/api";

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
   * Add/Create HDFS storage.
   *
   * Add or create a new HDFS database.
   *
   * @param createHdfsStorageOptions the {@link CreateHdfsStorageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HdfsStorageRegistration}
   */
  public ServiceCall<HdfsStorageRegistration> createHdfsStorage(CreateHdfsStorageOptions createHdfsStorageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createHdfsStorageOptions,
      "createHdfsStorageOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_hdfs_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createHdfsStorage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createHdfsStorageOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createHdfsStorageOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("display_name", createHdfsStorageOptions.displayName());
    multipartBuilder.addFormDataPart("type", createHdfsStorageOptions.type());
    multipartBuilder.addFormDataPart("hms_thrift_uri", createHdfsStorageOptions.hmsThriftUri());
    multipartBuilder.addFormDataPart("hms_thrift_port", String.valueOf(createHdfsStorageOptions.hmsThriftPort()));
    multipartBuilder.addFormDataPart("core_site", createHdfsStorageOptions.coreSite());
    multipartBuilder.addFormDataPart("hdfs_site", createHdfsStorageOptions.hdfsSite());
    multipartBuilder.addFormDataPart("kerberos", createHdfsStorageOptions.kerberos());
    multipartBuilder.addFormDataPart("catalog_name", createHdfsStorageOptions.catalogName());
    multipartBuilder.addFormDataPart("catalog_type", createHdfsStorageOptions.catalogType());
    if (createHdfsStorageOptions.krb5Config() != null) {
      multipartBuilder.addFormDataPart("krb5_config", createHdfsStorageOptions.krb5Config());
    }
    if (createHdfsStorageOptions.hiveKeytab() != null) {
      okhttp3.RequestBody hiveKeytabBody = RequestUtils.inputStreamBody(createHdfsStorageOptions.hiveKeytab(), createHdfsStorageOptions.hiveKeytabContentType());
      multipartBuilder.addFormDataPart("hive_keytab", "filename", hiveKeytabBody);
    }
    if (createHdfsStorageOptions.hdfsKeytab() != null) {
      okhttp3.RequestBody hdfsKeytabBody = RequestUtils.inputStreamBody(createHdfsStorageOptions.hdfsKeytab(), createHdfsStorageOptions.hdfsKeytabContentType());
      multipartBuilder.addFormDataPart("hdfs_keytab", "filename", hdfsKeytabBody);
    }
    if (createHdfsStorageOptions.hiveServerPrincipal() != null) {
      multipartBuilder.addFormDataPart("hive_server_principal", createHdfsStorageOptions.hiveServerPrincipal());
    }
    if (createHdfsStorageOptions.hiveClientPrincipal() != null) {
      multipartBuilder.addFormDataPart("hive_client_principal", createHdfsStorageOptions.hiveClientPrincipal());
    }
    if (createHdfsStorageOptions.hdfsPrincipal() != null) {
      multipartBuilder.addFormDataPart("hdfs_principal", createHdfsStorageOptions.hdfsPrincipal());
    }
    if (createHdfsStorageOptions.description() != null) {
      multipartBuilder.addFormDataPart("description", createHdfsStorageOptions.description());
    }
    if (createHdfsStorageOptions.createdAt() != null) {
      multipartBuilder.addFormDataPart("created_at", createHdfsStorageOptions.createdAt());
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<HdfsStorageRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HdfsStorageRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of storage registrations.
   *
   * Get list of storage registrations.
   *
   * @param listStorageRegistrationsOptions the {@link ListStorageRegistrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistrationCollection}
   */
  public ServiceCall<StorageRegistrationCollection> listStorageRegistrations(ListStorageRegistrationsOptions listStorageRegistrationsOptions) {
    if (listStorageRegistrationsOptions == null) {
      listStorageRegistrationsOptions = new ListStorageRegistrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations"));
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
   * Get list of storage registrations.
   *
   * Get list of storage registrations.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations"));
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

  /**
   * Get storage.
   *
   * Get a registered storage.
   *
   * @param getStorageRegistrationOptions the {@link GetStorageRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistration}
   */
  public ServiceCall<StorageRegistration> getStorageRegistration(GetStorageRegistrationOptions getStorageRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getStorageRegistrationOptions,
      "getStorageRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getStorageRegistrationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getStorageRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getStorageRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getStorageRegistrationOptions.authInstanceId());
    }
    if (getStorageRegistrationOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(getStorageRegistrationOptions.skipMdsCall()));
    }
    ResponseConverter<StorageRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister Storage.
   *
   * Unregister a storage.
   *
   * @param deleteStorageRegistrationOptions the {@link DeleteStorageRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteStorageRegistration(DeleteStorageRegistrationOptions deleteStorageRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteStorageRegistrationOptions,
      "deleteStorageRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteStorageRegistrationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteStorageRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteStorageRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteStorageRegistrationOptions.authInstanceId());
    }
    if (deleteStorageRegistrationOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(deleteStorageRegistrationOptions.skipMdsCall()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update storage.
   *
   * Update storage details &amp; credentials.
   *
   * @param updateStorageRegistrationOptions the {@link UpdateStorageRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistration}
   */
  public ServiceCall<StorageRegistration> updateStorageRegistration(UpdateStorageRegistrationOptions updateStorageRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateStorageRegistrationOptions,
      "updateStorageRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateStorageRegistrationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateStorageRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateStorageRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateStorageRegistrationOptions.authInstanceId());
    }
    if (updateStorageRegistrationOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(updateStorageRegistrationOptions.skipMdsCall()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateStorageRegistrationOptions.body()), "application/merge-patch+json");
    ResponseConverter<StorageRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add storage catalog.
   *
   * Add storage catalog.
   *
   * @param addStorageCatalogOptions the {@link AddStorageCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> addStorageCatalog(AddStorageCatalogOptions addStorageCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addStorageCatalogOptions,
      "addStorageCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("storage_id", addStorageCatalogOptions.storageId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{storage_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "addStorageCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addStorageCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", addStorageCatalogOptions.authInstanceId());
    }
    if (addStorageCatalogOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(addStorageCatalogOptions.skipMdsCall()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("catalog_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addStorageCatalogOptions.catalogTags()));
    if (addStorageCatalogOptions.basePath() != null) {
      contentJson.addProperty("base_path", addStorageCatalogOptions.basePath());
    }
    if (addStorageCatalogOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", addStorageCatalogOptions.catalogName());
    }
    if (addStorageCatalogOptions.catalogType() != null) {
      contentJson.addProperty("catalog_type", addStorageCatalogOptions.catalogType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get storage object properties.
   *
   * Get storage object properties.
   *
   * @param getStorageObjectPropertiesOptions the {@link GetStorageObjectPropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageObjectProperties}
   */
  public ServiceCall<StorageObjectProperties> getStorageObjectProperties(GetStorageObjectPropertiesOptions getStorageObjectPropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getStorageObjectPropertiesOptions,
      "getStorageObjectPropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("storage_id", getStorageObjectPropertiesOptions.storageId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{storage_id}/object_properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getStorageObjectProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getStorageObjectPropertiesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getStorageObjectPropertiesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (getStorageObjectPropertiesOptions.paths() != null) {
      contentJson.add("paths", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getStorageObjectPropertiesOptions.paths()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<StorageObjectProperties> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageObjectProperties>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List storage objects.
   *
   * Fetch all objects from a given storage.
   *
   * @param listStorageRegistrationsObjectsOptions the {@link ListStorageRegistrationsObjectsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageRegistrationObjectCollection}
   */
  public ServiceCall<StorageRegistrationObjectCollection> listStorageRegistrationsObjects(ListStorageRegistrationsObjectsOptions listStorageRegistrationsObjectsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listStorageRegistrationsObjectsOptions,
      "listStorageRegistrationsObjectsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("storage_id", listStorageRegistrationsObjectsOptions.storageId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/storage_registrations/{storage_id}/objects", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listStorageRegistrationsObjects");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listStorageRegistrationsObjectsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listStorageRegistrationsObjectsOptions.authInstanceId());
    }
    if (listStorageRegistrationsObjectsOptions.path() != null) {
      builder.query("path", String.valueOf(listStorageRegistrationsObjectsOptions.path()));
    }
    if (listStorageRegistrationsObjectsOptions.paginated() != null) {
      builder.query("paginated", String.valueOf(listStorageRegistrationsObjectsOptions.paginated()));
    }
    if (listStorageRegistrationsObjectsOptions.pageSize() != null) {
      builder.query("page_size", String.valueOf(listStorageRegistrationsObjectsOptions.pageSize()));
    }
    if (listStorageRegistrationsObjectsOptions.prefix() != null) {
      builder.query("prefix", String.valueOf(listStorageRegistrationsObjectsOptions.prefix()));
    }
    if (listStorageRegistrationsObjectsOptions.startAfter() != null) {
      builder.query("start_after", String.valueOf(listStorageRegistrationsObjectsOptions.startAfter()));
    }
    ResponseConverter<StorageRegistrationObjectCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageRegistrationObjectCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of databases.
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations"));
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
   * Get list of databases.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations"));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations/{database_id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteDatabaseCatalog");
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
    pathParamsMap.put("id", updateDatabaseOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/database_registrations/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines"));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines"));
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
   * Update Autoscaling Configuration.
   *
   * Update autoscaling configuration for an existing running Presto engine.
   *
   * @param updatePrestoEngineAutoscalingOptions the {@link UpdatePrestoEngineAutoscalingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PatchAutoscalingSuccess}
   */
  public ServiceCall<PatchAutoscalingSuccess> updatePrestoEngineAutoscaling(UpdatePrestoEngineAutoscalingOptions updatePrestoEngineAutoscalingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrestoEngineAutoscalingOptions,
      "updatePrestoEngineAutoscalingOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updatePrestoEngineAutoscalingOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/autoscaling", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updatePrestoEngineAutoscaling");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePrestoEngineAutoscalingOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updatePrestoEngineAutoscalingOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrestoEngineAutoscalingOptions.updateAutoScalingRequestPatch()), "application/merge-patch+json");
    ResponseConverter<PatchAutoscalingSuccess> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PatchAutoscalingSuccess>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/catalogs", pathParamsMap));
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
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> createPrestoEngineCatalogs(CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestoEngineCatalogsOptions,
      "createPrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createPrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestoEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("catalog_names", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPrestoEngineCatalogsOptions.catalogNames()));
    builder.bodyJson(contentJson);
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/catalogs", pathParamsMap));
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
    pathParamsMap.put("id", getPrestoEngineCatalogOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/catalogs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getPrestoEngineCatalog");
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
   * Get Presto Engine Configuration.
   *
   * Retrieve Presto engine configuration properties. Supports filtering by sections: catalog, configuration,
   * event_listener, global, jmx_exporter_config, jvm, log_config.
   *
   * @param getPrestoEngineConfigOptions the {@link GetPrestoEngineConfigOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEnginePropertiesDetails}
   */
  public ServiceCall<PrestoEnginePropertiesDetails> getPrestoEngineConfig(GetPrestoEngineConfigOptions getPrestoEngineConfigOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrestoEngineConfigOptions,
      "getPrestoEngineConfigOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getPrestoEngineConfigOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getPrestoEngineConfig");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", getPrestoEngineConfigOptions.authInstanceId());
    if (getPrestoEngineConfigOptions.sections() != null) {
      builder.query("sections", String.valueOf(getPrestoEngineConfigOptions.sections()));
    }
    ResponseConverter<PrestoEnginePropertiesDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEnginePropertiesDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update Presto Engine Configuration.
   *
   * Update Presto engine configuration properties including catalog, configuration, event_listener, global,
   * jmx_exporter_config, jvm, and log_config settings.
   *
   * @param updatePrestoEngineConfigOptions the {@link UpdatePrestoEngineConfigOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> updatePrestoEngineConfig(UpdatePrestoEngineConfigOptions updatePrestoEngineConfigOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePrestoEngineConfigOptions,
      "updatePrestoEngineConfigOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updatePrestoEngineConfigOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{engine_id}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updatePrestoEngineConfig");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("AuthInstanceId", updatePrestoEngineConfigOptions.authInstanceId());
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrestoEngineConfigOptions.prestoEnginePropertiesDetailsPatch()), "application/merge-patch+json");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}", pathParamsMap));
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
   * Pause presto engine.
   *
   * Pause a running presto engine.
   *
   * @param pausePrestoEngineOptions the {@link PausePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineSuccessResponse}
   */
  public ServiceCall<PrestoEngineSuccessResponse> pausePrestoEngine(PausePrestoEngineOptions pausePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pausePrestoEngineOptions,
      "pausePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", pausePrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "pausePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (pausePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", pausePrestoEngineOptions.authInstanceId());
    }
    ResponseConverter<PrestoEngineSuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngineSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain presto query.
   *
   * Explain a query statement.
   *
   * @param runExplainStatementOptions the {@link RunExplainStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoQueryExplain}
   */
  public ServiceCall<PrestoQueryExplain> runExplainStatement(RunExplainStatementOptions runExplainStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runExplainStatementOptions,
      "runExplainStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", runExplainStatementOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/query_explain", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "runExplainStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runExplainStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runExplainStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runExplainStatementOptions.statement());
    if (runExplainStatementOptions.catalog() != null) {
      contentJson.addProperty("catalog", runExplainStatementOptions.catalog());
    }
    if (runExplainStatementOptions.format() != null) {
      contentJson.addProperty("format", runExplainStatementOptions.format());
    }
    if (runExplainStatementOptions.schema() != null) {
      contentJson.addProperty("schema", runExplainStatementOptions.schema());
    }
    if (runExplainStatementOptions.type() != null) {
      contentJson.addProperty("type", runExplainStatementOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestoQueryExplain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoQueryExplain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain presto analyze.
   *
   * Return query metrics after query is complete.
   *
   * @param runExplainAnalyzeStatementOptions the {@link RunExplainAnalyzeStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoQueryExplain}
   */
  public ServiceCall<PrestoQueryExplain> runExplainAnalyzeStatement(RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runExplainAnalyzeStatementOptions,
      "runExplainAnalyzeStatementOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", runExplainAnalyzeStatementOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/query_explain_analyze", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "runExplainAnalyzeStatement");
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
    ResponseConverter<PrestoQueryExplain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoQueryExplain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart a presto engine.
   *
   * Restart an existing presto engine.
   *
   * @param restartPrestoEngineOptions the {@link RestartPrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineSuccessResponse}
   */
  public ServiceCall<PrestoEngineSuccessResponse> restartPrestoEngine(RestartPrestoEngineOptions restartPrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restartPrestoEngineOptions,
      "restartPrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", restartPrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "restartPrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (restartPrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", restartPrestoEngineOptions.authInstanceId());
    }
    ResponseConverter<PrestoEngineSuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngineSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume Presto(Java) engine.
   *
   * Resume a paused presto engine.
   *
   * @param resumePrestoEngineOptions the {@link ResumePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineSuccessResponse}
   */
  public ServiceCall<PrestoEngineSuccessResponse> resumePrestoEngine(ResumePrestoEngineOptions resumePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumePrestoEngineOptions,
      "resumePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", resumePrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "resumePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (resumePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", resumePrestoEngineOptions.authInstanceId());
    }
    ResponseConverter<PrestoEngineSuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngineSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale a presto engine.
   *
   * Scale an existing presto engine.
   *
   * @param scalePrestoEngineOptions the {@link ScalePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestoEngineSuccessResponse}
   */
  public ServiceCall<PrestoEngineSuccessResponse> scalePrestoEngine(ScalePrestoEngineOptions scalePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scalePrestoEngineOptions,
      "scalePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", scalePrestoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/presto_engines/{id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "scalePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (scalePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", scalePrestoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (scalePrestoEngineOptions.coordinator() != null) {
      contentJson.add("coordinator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(scalePrestoEngineOptions.coordinator()));
    }
    if (scalePrestoEngineOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(scalePrestoEngineOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrestoEngineSuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrestoEngineSuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of prestissimo engines.
   *
   * Get list of prestissimo engines.
   *
   * @param listPrestissimoEnginesOptions the {@link ListPrestissimoEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrestissimoEngineCollection}
   */
  public ServiceCall<PrestissimoEngineCollection> listPrestissimoEngines(ListPrestissimoEnginesOptions listPrestissimoEnginesOptions) {
    if (listPrestissimoEnginesOptions == null) {
      listPrestissimoEnginesOptions = new ListPrestissimoEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines"));
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
   * Get list of prestissimo engines.
   *
   * Get list of prestissimo engines.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines"));
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
    pathParamsMap.put("id", getPrestissimoEngineCatalogOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{engine_id}/catalogs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getPrestissimoEngineCatalog");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/catalogs", pathParamsMap));
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
   * Pause prestissimo engine.
   *
   * Pause a running prestissimo engine ie, only available is SAAS.
   *
   * @param pausePrestissimoEngineOptions the {@link PausePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> pausePrestissimoEngine(PausePrestissimoEngineOptions pausePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pausePrestissimoEngineOptions,
      "pausePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", pausePrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "pausePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (pausePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", pausePrestissimoEngineOptions.authInstanceId());
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
    pathParamsMap.put("id", runPrestissimoExplainStatementOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/query_explain", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "runPrestissimoExplainStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (runPrestissimoExplainStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", runPrestissimoExplainStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("statement", runPrestissimoExplainStatementOptions.statement());
    if (runPrestissimoExplainStatementOptions.catalog() != null) {
      contentJson.addProperty("catalog", runPrestissimoExplainStatementOptions.catalog());
    }
    if (runPrestissimoExplainStatementOptions.format() != null) {
      contentJson.addProperty("format", runPrestissimoExplainStatementOptions.format());
    }
    if (runPrestissimoExplainStatementOptions.schema() != null) {
      contentJson.addProperty("schema", runPrestissimoExplainStatementOptions.schema());
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
    pathParamsMap.put("id", runPrestissimoExplainAnalyzeStatementOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/query_explain_analyze", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "runPrestissimoExplainAnalyzeStatement");
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
   * @param restartPrestissimoEngineOptions the {@link RestartPrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> restartPrestissimoEngine(RestartPrestissimoEngineOptions restartPrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restartPrestissimoEngineOptions,
      "restartPrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", restartPrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "restartPrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (restartPrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", restartPrestissimoEngineOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume prestissimo engine.
   *
   * Resume a paused prestissimo engine ie, only available is SAAS.
   *
   * @param resumePrestissimoEngineOptions the {@link ResumePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> resumePrestissimoEngine(ResumePrestissimoEngineOptions resumePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumePrestissimoEngineOptions,
      "resumePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", resumePrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "resumePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (resumePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", resumePrestissimoEngineOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale a prestissimo engine.
   *
   * Scale an existing prestissimo engine ie, only available is SAAS.
   *
   * @param scalePrestissimoEngineOptions the {@link ScalePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> scalePrestissimoEngine(ScalePrestissimoEngineOptions scalePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scalePrestissimoEngineOptions,
      "scalePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", scalePrestissimoEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/prestissimo_engines/{id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "scalePrestissimoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (scalePrestissimoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", scalePrestissimoEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (scalePrestissimoEngineOptions.coordinator() != null) {
      contentJson.add("coordinator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(scalePrestissimoEngineOptions.coordinator()));
    }
    if (scalePrestissimoEngineOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(scalePrestissimoEngineOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/db2_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listDb2Engines");
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/db2_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createDb2Engine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDb2EngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDb2EngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDb2EngineOptions.configuration()));
    contentJson.addProperty("display_name", createDb2EngineOptions.displayName());
    contentJson.addProperty("origin", createDb2EngineOptions.origin());
    if (createDb2EngineOptions.description() != null) {
      contentJson.addProperty("description", createDb2EngineOptions.description());
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
    pathParamsMap.put("id", deleteDb2EngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/db2_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteDb2Engine");
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
    pathParamsMap.put("id", updateDb2EngineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/db2_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateDb2Engine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDb2EngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDb2EngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDb2EngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<Db2Engine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Db2Engine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of other engines.
   *
   * Get list of other engines.
   *
   * @param listOtherEnginesOptions the {@link ListOtherEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OtherEngineCollection}
   */
  public ServiceCall<OtherEngineCollection> listOtherEngines(ListOtherEnginesOptions listOtherEnginesOptions) {
    if (listOtherEnginesOptions == null) {
      listOtherEnginesOptions = new ListOtherEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/other_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listOtherEngines");
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
   * Get list of other engines.
   *
   * Get list of other engines.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/other_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createOtherEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createOtherEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createOtherEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOtherEngineOptions.configuration()));
    contentJson.addProperty("display_name", createOtherEngineOptions.displayName());
    contentJson.addProperty("origin", createOtherEngineOptions.origin());
    if (createOtherEngineOptions.description() != null) {
      contentJson.addProperty("description", createOtherEngineOptions.description());
    }
    if (createOtherEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOtherEngineOptions.tags()));
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
    pathParamsMap.put("id", deleteOtherEngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/other_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteOtherEngine");
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
   * Get list of Netezza engines.
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/netezza_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listNetezzaEngines");
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
   * Get list of Netezza engines.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/netezza_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createNetezzaEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createNetezzaEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createNetezzaEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createNetezzaEngineOptions.configuration()));
    contentJson.addProperty("display_name", createNetezzaEngineOptions.displayName());
    contentJson.addProperty("origin", createNetezzaEngineOptions.origin());
    if (createNetezzaEngineOptions.description() != null) {
      contentJson.addProperty("description", createNetezzaEngineOptions.description());
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
    pathParamsMap.put("id", deleteNetezzaEngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/netezza_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteNetezzaEngine");
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
    pathParamsMap.put("id", updateNetezzaEngineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/netezza_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateNetezzaEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateNetezzaEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateNetezzaEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateNetezzaEngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<NetezzaEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetezzaEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of spark engines.
   *
   * Get list of spark engines.
   *
   * @param listSparkEnginesOptions the {@link ListSparkEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineCollection}
   */
  public ServiceCall<SparkEngineCollection> listSparkEngines(ListSparkEnginesOptions listSparkEnginesOptions) {
    if (listSparkEnginesOptions == null) {
      listSparkEnginesOptions = new ListSparkEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSparkEngines");
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
   * Get list of spark engines.
   *
   * Get list of spark engines.
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", createSparkEngineOptions.displayName());
    contentJson.addProperty("origin", createSparkEngineOptions.origin());
    if (createSparkEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.associatedCatalogs()));
    }
    if (createSparkEngineOptions.configuration() != null) {
      contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.configuration()));
    }
    if (createSparkEngineOptions.description() != null) {
      contentJson.addProperty("description", createSparkEngineOptions.description());
    }
    if (createSparkEngineOptions.id() != null) {
      contentJson.addProperty("id", createSparkEngineOptions.id());
    }
    if (createSparkEngineOptions.status() != null) {
      contentJson.addProperty("status", createSparkEngineOptions.status());
    }
    if (createSparkEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.tags()));
    }
    if (createSparkEngineOptions.type() != null) {
      contentJson.addProperty("type", createSparkEngineOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get spark engine catalog.
   *
   * Get catalog attached to spark engine.
   *
   * @param getSparkEngineCatalogOptions the {@link GetSparkEngineCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> getSparkEngineCatalog(GetSparkEngineCatalogOptions getSparkEngineCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineCatalogOptions,
      "getSparkEngineCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineCatalogOptions.engineId());
    pathParamsMap.put("id", getSparkEngineCatalogOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{engine_id}/catalogs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineCatalogOptions.authInstanceId());
    }
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get spark engine.
   *
   * Get spark engine by ID.
   *
   * @param getSparkEngineOptions the {@link GetSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngine}
   */
  public ServiceCall<SparkEngine> getSparkEngine(GetSparkEngineOptions getSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineOptions,
      "getSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineOptions.authInstanceId());
    }
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
    pathParamsMap.put("id", deleteSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSparkEngine");
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
    pathParamsMap.put("id", updateSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSparkEngineOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSparkEngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<SparkEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get spark engine catalogs.
   *
   * Get list of all catalogs attached to a spark engine.
   *
   * @param listSparkEngineCatalogsOptions the {@link ListSparkEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listSparkEngineCatalogs(ListSparkEngineCatalogsOptions listSparkEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSparkEngineCatalogsOptions,
      "listSparkEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSparkEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSparkEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkEngineCatalogsOptions.authInstanceId());
    }
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate catalogs to spark engine.
   *
   * Associate one or more catalogs to a spark engine.
   *
   * @param createSparkEngineCatalogsOptions the {@link CreateSparkEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> createSparkEngineCatalogs(CreateSparkEngineCatalogsOptions createSparkEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineCatalogsOptions,
      "createSparkEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSparkEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSparkEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("catalog_names", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineCatalogsOptions.catalogNames()));
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate catalogs from a spark engine.
   *
   * Disassociate one or more catalogs from a spark engine.
   *
   * @param deleteSparkEngineCatalogsOptions the {@link DeleteSparkEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngineCatalogs(DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineCatalogsOptions,
      "deleteSparkEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSparkEngineCatalogsOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSparkEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineCatalogsOptions.authInstanceId());
    }
    builder.query("catalog_names", String.valueOf(deleteSparkEngineCatalogsOptions.catalogNames()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Pause engine.
   *
   * Pause engine. this feature is only available in SAAS.
   *
   * @param pauseSparkEngineOptions the {@link PauseSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> pauseSparkEngine(PauseSparkEngineOptions pauseSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pauseSparkEngineOptions,
      "pauseSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", pauseSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "pauseSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (pauseSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", pauseSparkEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (pauseSparkEngineOptions.force() != null) {
      contentJson.addProperty("force", pauseSparkEngineOptions.force());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume engine. This feature is only available in SAAS.
   *
   * Resume engine. This feature is only available in SAAS.
   *
   * @param resumeSparkEngineOptions the {@link ResumeSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> resumeSparkEngine(ResumeSparkEngineOptions resumeSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumeSparkEngineOptions,
      "resumeSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", resumeSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "resumeSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (resumeSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", resumeSparkEngineOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale engine. This feature is only available in SAAS.
   *
   * Scale engine. This feature is only available in SAAS.
   *
   * @param scaleSparkEngineOptions the {@link ScaleSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> scaleSparkEngine(ScaleSparkEngineOptions scaleSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scaleSparkEngineOptions,
      "scaleSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", scaleSparkEngineOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "scaleSparkEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (scaleSparkEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", scaleSparkEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (scaleSparkEngineOptions.numberOfNodes() != null) {
      contentJson.addProperty("number_of_nodes", scaleSparkEngineOptions.numberOfNodes());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get spark engine application details.
   *
   * Get spark engine application details.
   *
   * @param getSparkEngineApplicationStatusOptions the {@link GetSparkEngineApplicationStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationResponse}
   */
  public ServiceCall<SparkEngineApplicationResponse> getSparkEngineApplicationStatus(GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineApplicationStatusOptions,
      "getSparkEngineApplicationStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineApplicationStatusOptions.engineId());
    pathParamsMap.put("id", getSparkEngineApplicationStatusOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{engine_id}/applications/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineApplicationStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineApplicationStatusOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineApplicationStatusOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineApplicationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop Spark Applications.
   *
   * Stop a running spark application.
   *
   * @param deleteSparkEngineApplicationOptions the {@link DeleteSparkEngineApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngineApplication(DeleteSparkEngineApplicationOptions deleteSparkEngineApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineApplicationOptions,
      "deleteSparkEngineApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteSparkEngineApplicationOptions.engineId());
    pathParamsMap.put("id", deleteSparkEngineApplicationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{engine_id}/applications/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSparkEngineApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineApplicationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineApplicationOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Redirect to spark UI.
   *
   * Redirect to spark UI.
   *
   * @param getSparkEngineApplicationUiOptions the {@link GetSparkEngineApplicationUiOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getSparkEngineApplicationUi(GetSparkEngineApplicationUiOptions getSparkEngineApplicationUiOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineApplicationUiOptions,
      "getSparkEngineApplicationUiOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineApplicationUiOptions.engineId());
    pathParamsMap.put("id", getSparkEngineApplicationUiOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{engine_id}/applications/{id}/ui", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineApplicationUi");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getSparkEngineApplicationUiOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineApplicationUiOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all applications in a spark engine.
   *
   * List all applications in a spark engine.
   *
   * @param listSparkEngineApplicationsOptions the {@link ListSparkEngineApplicationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationCollection}
   */
  public ServiceCall<SparkEngineApplicationCollection> listSparkEngineApplications(ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSparkEngineApplicationsOptions,
      "listSparkEngineApplicationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSparkEngineApplicationsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/applications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSparkEngineApplications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkEngineApplicationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkEngineApplicationsOptions.authInstanceId());
    }
    if (listSparkEngineApplicationsOptions.state() != null) {
      builder.query("state", RequestUtils.join(listSparkEngineApplicationsOptions.state(), ","));
    }
    if (listSparkEngineApplicationsOptions.submissionTimeInterval() != null) {
      builder.query("submission_time_interval", String.valueOf(listSparkEngineApplicationsOptions.submissionTimeInterval()));
    }
    if (listSparkEngineApplicationsOptions.startTimeInterval() != null) {
      builder.query("start_time_interval", String.valueOf(listSparkEngineApplicationsOptions.startTimeInterval()));
    }
    if (listSparkEngineApplicationsOptions.endTimeInterval() != null) {
      builder.query("end_time_interval", String.valueOf(listSparkEngineApplicationsOptions.endTimeInterval()));
    }
    if (listSparkEngineApplicationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSparkEngineApplicationsOptions.limit()));
    }
    if (listSparkEngineApplicationsOptions.start() != null) {
      builder.query("start", String.valueOf(listSparkEngineApplicationsOptions.start()));
    }
    ResponseConverter<SparkEngineApplicationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create spark engine application.
   *
   * Create spark engine application.
   *
   * @param createSparkEngineApplicationOptions the {@link CreateSparkEngineApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineApplicationSummary}
   */
  public ServiceCall<SparkEngineApplicationSummary> createSparkEngineApplication(CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineApplicationOptions,
      "createSparkEngineApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSparkEngineApplicationOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/applications", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSparkEngineApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineApplicationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineApplicationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("application_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.applicationDetails()));
    if (createSparkEngineApplicationOptions.callback() != null) {
      contentJson.add("callback", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.callback()));
    }
    if (createSparkEngineApplicationOptions.contextId() != null) {
      contentJson.addProperty("context_id", createSparkEngineApplicationOptions.contextId());
    }
    if (createSparkEngineApplicationOptions.contextType() != null) {
      contentJson.addProperty("context_type", createSparkEngineApplicationOptions.contextType());
    }
    if (createSparkEngineApplicationOptions.deployMode() != null) {
      contentJson.addProperty("deploy_mode", createSparkEngineApplicationOptions.deployMode());
    }
    if (createSparkEngineApplicationOptions.idempotencyKey() != null) {
      contentJson.addProperty("idempotency_key", createSparkEngineApplicationOptions.idempotencyKey());
    }
    if (createSparkEngineApplicationOptions.initScripts() != null) {
      contentJson.add("init_scripts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.initScripts()));
    }
    if (createSparkEngineApplicationOptions.jobEndpoint() != null) {
      contentJson.addProperty("job_endpoint", createSparkEngineApplicationOptions.jobEndpoint());
    }
    if (createSparkEngineApplicationOptions.maxRetries() != null) {
      contentJson.addProperty("max_retries", createSparkEngineApplicationOptions.maxRetries());
    }
    if (createSparkEngineApplicationOptions.minRetryIntervalInSeconds() != null) {
      contentJson.addProperty("min_retry_interval_in_seconds", createSparkEngineApplicationOptions.minRetryIntervalInSeconds());
    }
    if (createSparkEngineApplicationOptions.serviceInstanceId() != null) {
      contentJson.addProperty("service_instance_id", createSparkEngineApplicationOptions.serviceInstanceId());
    }
    if (createSparkEngineApplicationOptions.timeoutInSeconds() != null) {
      contentJson.addProperty("timeout_in_seconds", createSparkEngineApplicationOptions.timeoutInSeconds());
    }
    if (createSparkEngineApplicationOptions.type() != null) {
      contentJson.addProperty("type", createSparkEngineApplicationOptions.type());
    }
    if (createSparkEngineApplicationOptions.volumes() != null) {
      contentJson.add("volumes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.volumes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkEngineApplicationSummary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineApplicationSummary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Spark history server details.
   *
   * Get Spark history server details.
   *
   * @param getSparkEngineHistoryServerOptions the {@link GetSparkEngineHistoryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkHistoryServer}
   */
  public ServiceCall<SparkHistoryServer> getSparkEngineHistoryServer(GetSparkEngineHistoryServerOptions getSparkEngineHistoryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineHistoryServerOptions,
      "getSparkEngineHistoryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSparkEngineHistoryServerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineHistoryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineHistoryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineHistoryServerOptions.authInstanceId());
    }
    ResponseConverter<SparkHistoryServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkHistoryServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start spark history server.
   *
   * Start spark history server.
   *
   * @param startSparkEngineHistoryServerOptions the {@link StartSparkEngineHistoryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkHistoryServer}
   */
  public ServiceCall<SparkHistoryServer> startSparkEngineHistoryServer(StartSparkEngineHistoryServerOptions startSparkEngineHistoryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(startSparkEngineHistoryServerOptions,
      "startSparkEngineHistoryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", startSparkEngineHistoryServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "startSparkEngineHistoryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (startSparkEngineHistoryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", startSparkEngineHistoryServerOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (startSparkEngineHistoryServerOptions.cores() != null) {
      contentJson.addProperty("cores", startSparkEngineHistoryServerOptions.cores());
    }
    if (startSparkEngineHistoryServerOptions.memory() != null) {
      contentJson.addProperty("memory", startSparkEngineHistoryServerOptions.memory());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkHistoryServer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkHistoryServer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop spark history server.
   *
   * Stop spark history server.
   *
   * @param deleteSparkEngineHistoryServerOptions the {@link DeleteSparkEngineHistoryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngineHistoryServer(DeleteSparkEngineHistoryServerOptions deleteSparkEngineHistoryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineHistoryServerOptions,
      "deleteSparkEngineHistoryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSparkEngineHistoryServerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSparkEngineHistoryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineHistoryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineHistoryServerOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Redirect to spark history server UI.
   *
   * Redirect to spark history server UI.
   *
   * @param getSparkEngineHistoryServerUiOptions the {@link GetSparkEngineHistoryServerUiOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getSparkEngineHistoryServerUi(GetSparkEngineHistoryServerUiOptions getSparkEngineHistoryServerUiOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineHistoryServerUiOptions,
      "getSparkEngineHistoryServerUiOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSparkEngineHistoryServerUiOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/spark_engines/{id}/history_server/ui", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineHistoryServerUi");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getSparkEngineHistoryServerUiOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineHistoryServerUiOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * To validate an integration.
   *
   * To validate the details of an integration.
   *
   * @param validateIntegrationOptions the {@link ValidateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValidateIntegration}
   */
  public ServiceCall<ValidateIntegration> validateIntegration(ValidateIntegrationOptions validateIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(validateIntegrationOptions,
      "validateIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integration_validation"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "validateIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (validateIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", validateIntegrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", validateIntegrationOptions.type());
    if (validateIntegrationOptions.accessToken() != null) {
      contentJson.addProperty("access_token", validateIntegrationOptions.accessToken());
    }
    if (validateIntegrationOptions.apikey() != null) {
      contentJson.addProperty("apikey", validateIntegrationOptions.apikey());
    }
    if (validateIntegrationOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateIntegrationOptions.catalogs()));
    }
    if (validateIntegrationOptions.certificate() != null) {
      contentJson.addProperty("certificate", validateIntegrationOptions.certificate());
    }
    if (validateIntegrationOptions.password() != null) {
      contentJson.addProperty("password", validateIntegrationOptions.password());
    }
    if (validateIntegrationOptions.ssl() != null) {
      contentJson.addProperty("ssl", validateIntegrationOptions.ssl());
    }
    if (validateIntegrationOptions.url() != null) {
      contentJson.addProperty("url", validateIntegrationOptions.url());
    }
    if (validateIntegrationOptions.username() != null) {
      contentJson.addProperty("username", validateIntegrationOptions.username());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ValidateIntegration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValidateIntegration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List integrations.
   *
   * List all existing integrations (can be filtered based on `type`).
   *
   * @param listAllIntegrationsOptions the {@link ListAllIntegrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationCollection}
   */
  public ServiceCall<IntegrationCollection> listAllIntegrations(ListAllIntegrationsOptions listAllIntegrationsOptions) {
    if (listAllIntegrationsOptions == null) {
      listAllIntegrationsOptions = new ListAllIntegrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listAllIntegrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllIntegrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listAllIntegrationsOptions.authInstanceId());
    }
    if (listAllIntegrationsOptions.secret() != null) {
      builder.header("Secret", listAllIntegrationsOptions.secret());
    }
    if (listAllIntegrationsOptions.type() != null) {
      builder.query("type", RequestUtils.join(listAllIntegrationsOptions.type(), ","));
    }
    if (listAllIntegrationsOptions.state() != null) {
      builder.query("state", RequestUtils.join(listAllIntegrationsOptions.state(), ","));
    }
    ResponseConverter<IntegrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List integrations.
   *
   * List all existing integrations (can be filtered based on `type`).
   *
   * @return a {@link ServiceCall} with a result of type {@link IntegrationCollection}
   */
  public ServiceCall<IntegrationCollection> listAllIntegrations() {
    return listAllIntegrations(null);
  }

  /**
   * Create an integration.
   *
   * To create an integration of type Apache Ranger, IBM Knowlege Catalog, IBM Manta Data lineage or IBM Data
   * Observability by Databand.
   *
   * @param createIntegrationOptions the {@link CreateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> createIntegration(CreateIntegrationOptions createIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIntegrationOptions,
      "createIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createIntegrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createIntegrationOptions.accessToken() != null) {
      contentJson.addProperty("access_token", createIntegrationOptions.accessToken());
    }
    if (createIntegrationOptions.apikey() != null) {
      contentJson.addProperty("apikey", createIntegrationOptions.apikey());
    }
    if (createIntegrationOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIntegrationOptions.catalogs()));
    }
    if (createIntegrationOptions.certificate() != null) {
      contentJson.addProperty("certificate", createIntegrationOptions.certificate());
    }
    if (createIntegrationOptions.certificateExtension() != null) {
      contentJson.addProperty("certificate_extension", createIntegrationOptions.certificateExtension());
    }
    if (createIntegrationOptions.connectionMode() != null) {
      contentJson.addProperty("connection_mode", createIntegrationOptions.connectionMode());
    }
    if (createIntegrationOptions.crossAccountIntegration() != null) {
      contentJson.addProperty("cross_account_integration", createIntegrationOptions.crossAccountIntegration());
    }
    if (createIntegrationOptions.enableDataPolicyWithinWxd() != null) {
      contentJson.addProperty("enable_data_policy_within_wxd", createIntegrationOptions.enableDataPolicyWithinWxd());
    }
    if (createIntegrationOptions.ikcUserAccountId() != null) {
      contentJson.addProperty("ikc_user_account_id", createIntegrationOptions.ikcUserAccountId());
    }
    if (createIntegrationOptions.password() != null) {
      contentJson.addProperty("password", createIntegrationOptions.password());
    }
    if (createIntegrationOptions.policyCacheTimeConfiguration() != null) {
      contentJson.addProperty("policy_cache_time_configuration", createIntegrationOptions.policyCacheTimeConfiguration());
    }
    if (createIntegrationOptions.resource() != null) {
      contentJson.addProperty("resource", createIntegrationOptions.resource());
    }
    if (createIntegrationOptions.ssl() != null) {
      contentJson.addProperty("ssl", createIntegrationOptions.ssl());
    }
    if (createIntegrationOptions.type() != null) {
      contentJson.addProperty("type", createIntegrationOptions.type());
    }
    if (createIntegrationOptions.url() != null) {
      contentJson.addProperty("url", createIntegrationOptions.url());
    }
    if (createIntegrationOptions.username() != null) {
      contentJson.addProperty("username", createIntegrationOptions.username());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Integration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Integration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an integration.
   *
   * To create an integration of type Apache Ranger, IBM Knowlege Catalog, IBM Manta Data lineage or IBM Data
   * Observability by Databand.
   *
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> createIntegration() {
    return createIntegration(null);
  }

  /**
   * Get an Integration.
   *
   * To get the details of an integration.
   *
   * @param getIntegrationsOptions the {@link GetIntegrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> getIntegrations(GetIntegrationsOptions getIntegrationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIntegrationsOptions,
      "getIntegrationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getIntegrationsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getIntegrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getIntegrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getIntegrationsOptions.authInstanceId());
    }
    ResponseConverter<Integration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Integration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an Integration.
   *
   * Deletes an existing integration completely from WatsonX.data.
   *
   * @param deleteIntegrationOptions the {@link DeleteIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteIntegration(DeleteIntegrationOptions deleteIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIntegrationOptions,
      "deleteIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteIntegrationOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteIntegrationOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an Integration.
   *
   * To Update information details and state of an existing integration.
   *
   * @param updateIntegrationOptions the {@link UpdateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> updateIntegration(UpdateIntegrationOptions updateIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateIntegrationOptions,
      "updateIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateIntegrationOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/integrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateIntegrationOptions.authInstanceId());
    }
    if (updateIntegrationOptions.secret() != null) {
      builder.header("Secret", updateIntegrationOptions.secret());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateIntegrationOptions.body()), "application/merge-patch+json");
    ResponseConverter<Integration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Integration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_id}/schemas/{schema_id}/register", pathParamsMap));
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
   * Load delta and hudi tables metadata.
   *
   * Load delta and hudi tables metadata.
   *
   * @param loadTableOptions the {@link LoadTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadTableResponse}
   */
  public ServiceCall<LoadTableResponse> loadTable(LoadTableOptions loadTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(loadTableOptions,
      "loadTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", loadTableOptions.catalogId());
    pathParamsMap.put("schema_id", loadTableOptions.schemaId());
    pathParamsMap.put("table_id", loadTableOptions.tableId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "loadTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (loadTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", loadTableOptions.authInstanceId());
    }
    ResponseConverter<LoadTableResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadTableResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of catalogs.
   *
   * Get list of catalogs.
   *
   * @param listCatalogsOptions the {@link ListCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogCollection}
   */
  public ServiceCall<CatalogCollection> listCatalogs(ListCatalogsOptions listCatalogsOptions) {
    if (listCatalogsOptions == null) {
      listCatalogsOptions = new ListCatalogsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs"));
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
   * Get list of catalogs.
   *
   * Get list of catalogs.
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/engines", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}", pathParamsMap));
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
    pathParamsMap.put("catalog_name", listColumnsOptions.catalogName());
    pathParamsMap.put("schema_name", listColumnsOptions.schemaName());
    pathParamsMap.put("table_name", listColumnsOptions.tableName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listColumns");
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
    pathParamsMap.put("catalog_name", createColumnsOptions.catalogName());
    pathParamsMap.put("schema_name", createColumnsOptions.schemaName());
    pathParamsMap.put("table_name", createColumnsOptions.tableName());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createColumns");
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
    pathParamsMap.put("catalog_name", deleteColumnOptions.catalogName());
    pathParamsMap.put("schema_name", deleteColumnOptions.schemaName());
    pathParamsMap.put("table_name", deleteColumnOptions.tableName());
    pathParamsMap.put("column_name", deleteColumnOptions.columnName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns/{column_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteColumn");
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
    pathParamsMap.put("catalog_name", updateColumnOptions.catalogName());
    pathParamsMap.put("schema_name", updateColumnOptions.schemaName());
    pathParamsMap.put("table_name", updateColumnOptions.tableName());
    pathParamsMap.put("column_name", updateColumnOptions.columnName());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns/{column_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateColumn");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateColumnOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateColumnOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(updateColumnOptions.engineId()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateColumnOptions.body()), "application/merge-patch+json");
    ResponseConverter<Column> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Column>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rollback snapshot.
   *
   * Rollback table to snapshot.
   *
   * @param rollbackTableOptions the {@link RollbackTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponsePrototype}
   */
  public ServiceCall<SuccessResponsePrototype> rollbackTable(RollbackTableOptions rollbackTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(rollbackTableOptions,
      "rollbackTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", rollbackTableOptions.catalogName());
    pathParamsMap.put("schema_name", rollbackTableOptions.schemaName());
    pathParamsMap.put("table_name", rollbackTableOptions.tableName());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/rollback", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "rollbackTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (rollbackTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", rollbackTableOptions.authInstanceId());
    }
    if (rollbackTableOptions.engineId() != null) {
      builder.query("engine_id", String.valueOf(rollbackTableOptions.engineId()));
    }
    final JsonObject contentJson = new JsonObject();
    if (rollbackTableOptions.snapshotId() != null) {
      contentJson.addProperty("snapshot_id", rollbackTableOptions.snapshotId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponsePrototype> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponsePrototype>() { }.getType());
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
    pathParamsMap.put("catalog_name", listTableSnapshotsOptions.catalogName());
    pathParamsMap.put("schema_name", listTableSnapshotsOptions.schemaName());
    pathParamsMap.put("table_name", listTableSnapshotsOptions.tableName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/snapshots", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listTableSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTableSnapshotsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listTableSnapshotsOptions.authInstanceId());
    }
    if (listTableSnapshotsOptions.engineId() != null) {
      builder.query("engine_id", String.valueOf(listTableSnapshotsOptions.engineId()));
    }
    ResponseConverter<TableSnapshotCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableSnapshotCollection>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{id}/schemas", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{id}/schemas", pathParamsMap));
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
   * External Iceberg table registration.
   *
   * Synchronize the external Iceberg table registration for a catalog identified by catalog_id.
   *
   * @param updateSyncCatalogOptions the {@link UpdateSyncCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponsePrototype}
   */
  public ServiceCall<SuccessResponsePrototype> updateSyncCatalog(UpdateSyncCatalogOptions updateSyncCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSyncCatalogOptions,
      "updateSyncCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSyncCatalogOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{id}/sync", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateSyncCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSyncCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSyncCatalogOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateSyncCatalogOptions.autoAddNewTables() != null) {
      contentJson.addProperty("auto_add_new_tables", updateSyncCatalogOptions.autoAddNewTables());
    }
    if (updateSyncCatalogOptions.registerNewTables() != null) {
      contentJson.addProperty("register_new_tables", updateSyncCatalogOptions.registerNewTables());
    }
    if (updateSyncCatalogOptions.syncExistingTables() != null) {
      contentJson.addProperty("sync_existing_tables", updateSyncCatalogOptions.syncExistingTables());
    }
    if (updateSyncCatalogOptions.syncIcebergMd() != null) {
      contentJson.addProperty("sync_iceberg_md", updateSyncCatalogOptions.syncIcebergMd());
    }
    if (updateSyncCatalogOptions.syncPath() != null) {
      contentJson.addProperty("sync_path", updateSyncCatalogOptions.syncPath());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponsePrototype> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponsePrototype>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/catalogs/{name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listMilvusServices");
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", createMilvusServiceOptions.displayName());
    contentJson.addProperty("origin", createMilvusServiceOptions.origin());
    contentJson.addProperty("root_path", createMilvusServiceOptions.rootPath());
    contentJson.addProperty("tshirt_size", createMilvusServiceOptions.tshirtSize());
    if (createMilvusServiceOptions.dcCpu() != null) {
      contentJson.addProperty("dc_cpu", createMilvusServiceOptions.dcCpu());
    }
    if (createMilvusServiceOptions.dcMemory() != null) {
      contentJson.addProperty("dc_memory", createMilvusServiceOptions.dcMemory());
    }
    if (createMilvusServiceOptions.dcReplicas() != null) {
      contentJson.addProperty("dc_replicas", createMilvusServiceOptions.dcReplicas());
    }
    if (createMilvusServiceOptions.description() != null) {
      contentJson.addProperty("description", createMilvusServiceOptions.description());
    }
    if (createMilvusServiceOptions.dwCpu() != null) {
      contentJson.addProperty("dw_cpu", createMilvusServiceOptions.dwCpu());
    }
    if (createMilvusServiceOptions.dwMemory() != null) {
      contentJson.addProperty("dw_memory", createMilvusServiceOptions.dwMemory());
    }
    if (createMilvusServiceOptions.dwReplicas() != null) {
      contentJson.addProperty("dw_replicas", createMilvusServiceOptions.dwReplicas());
    }
    if (createMilvusServiceOptions.etcdCpu() != null) {
      contentJson.addProperty("etcd_cpu", createMilvusServiceOptions.etcdCpu());
    }
    if (createMilvusServiceOptions.etcdMemory() != null) {
      contentJson.addProperty("etcd_memory", createMilvusServiceOptions.etcdMemory());
    }
    if (createMilvusServiceOptions.id() != null) {
      contentJson.addProperty("id", createMilvusServiceOptions.id());
    }
    if (createMilvusServiceOptions.indexType() != null) {
      contentJson.addProperty("index_type", createMilvusServiceOptions.indexType());
    }
    if (createMilvusServiceOptions.iwCpu() != null) {
      contentJson.addProperty("iw_cpu", createMilvusServiceOptions.iwCpu());
    }
    if (createMilvusServiceOptions.iwMemory() != null) {
      contentJson.addProperty("iw_memory", createMilvusServiceOptions.iwMemory());
    }
    if (createMilvusServiceOptions.iwReplicas() != null) {
      contentJson.addProperty("iw_replicas", createMilvusServiceOptions.iwReplicas());
    }
    if (createMilvusServiceOptions.kafkaCpu() != null) {
      contentJson.addProperty("kafka_cpu", createMilvusServiceOptions.kafkaCpu());
    }
    if (createMilvusServiceOptions.kafkaMemory() != null) {
      contentJson.addProperty("kafka_memory", createMilvusServiceOptions.kafkaMemory());
    }
    if (createMilvusServiceOptions.proxyCpu() != null) {
      contentJson.addProperty("proxy_cpu", createMilvusServiceOptions.proxyCpu());
    }
    if (createMilvusServiceOptions.proxyMemory() != null) {
      contentJson.addProperty("proxy_memory", createMilvusServiceOptions.proxyMemory());
    }
    if (createMilvusServiceOptions.proxyReplicas() != null) {
      contentJson.addProperty("proxy_replicas", createMilvusServiceOptions.proxyReplicas());
    }
    if (createMilvusServiceOptions.qcCpu() != null) {
      contentJson.addProperty("qc_cpu", createMilvusServiceOptions.qcCpu());
    }
    if (createMilvusServiceOptions.qcMemory() != null) {
      contentJson.addProperty("qc_memory", createMilvusServiceOptions.qcMemory());
    }
    if (createMilvusServiceOptions.qcReplicas() != null) {
      contentJson.addProperty("qc_replicas", createMilvusServiceOptions.qcReplicas());
    }
    if (createMilvusServiceOptions.qwCpu() != null) {
      contentJson.addProperty("qw_cpu", createMilvusServiceOptions.qwCpu());
    }
    if (createMilvusServiceOptions.qwMemory() != null) {
      contentJson.addProperty("qw_memory", createMilvusServiceOptions.qwMemory());
    }
    if (createMilvusServiceOptions.qwReplicas() != null) {
      contentJson.addProperty("qw_replicas", createMilvusServiceOptions.qwReplicas());
    }
    if (createMilvusServiceOptions.rcCpu() != null) {
      contentJson.addProperty("rc_cpu", createMilvusServiceOptions.rcCpu());
    }
    if (createMilvusServiceOptions.rcMemory() != null) {
      contentJson.addProperty("rc_memory", createMilvusServiceOptions.rcMemory());
    }
    if (createMilvusServiceOptions.rcReplicas() != null) {
      contentJson.addProperty("rc_replicas", createMilvusServiceOptions.rcReplicas());
    }
    if (createMilvusServiceOptions.storageName() != null) {
      contentJson.addProperty("storage_name", createMilvusServiceOptions.storageName());
    }
    if (createMilvusServiceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMilvusServiceOptions.tags()));
    }
    if (createMilvusServiceOptions.vector() != null) {
      contentJson.addProperty("vector", createMilvusServiceOptions.vector());
    }
    if (createMilvusServiceOptions.vectorDimension() != null) {
      contentJson.addProperty("vector_dimension", createMilvusServiceOptions.vectorDimension());
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
    pathParamsMap.put("id", getMilvusServiceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getMilvusService");
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
    pathParamsMap.put("id", deleteMilvusServiceOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteMilvusService");
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
    pathParamsMap.put("id", updateMilvusServiceOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateMilvusService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMilvusServiceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMilvusServiceOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateMilvusServiceOptions.body()), "application/merge-patch+json");
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Pause milvus service.
   *
   * Pause a running milvus service.
   *
   * @param createMilvusServicePauseOptions the {@link CreateMilvusServicePauseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createMilvusServicePause(CreateMilvusServicePauseOptions createMilvusServicePauseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMilvusServicePauseOptions,
      "createMilvusServicePauseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createMilvusServicePauseOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServicePause");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServicePauseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServicePauseOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume milvus service.
   *
   * Resume a paused milvus service.
   *
   * @param createMilvusServiceResumeOptions the {@link CreateMilvusServiceResumeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createMilvusServiceResume(CreateMilvusServiceResumeOptions createMilvusServiceResumeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMilvusServiceResumeOptions,
      "createMilvusServiceResumeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createMilvusServiceResumeOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServiceResume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceResumeOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceResumeOptions.authInstanceId());
    }
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Scale a milvus service.
   *
   * Scale an existing milvus service.
   *
   * @param createMilvusServiceScaleOptions the {@link CreateMilvusServiceScaleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createMilvusServiceScale(CreateMilvusServiceScaleOptions createMilvusServiceScaleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMilvusServiceScaleOptions,
      "createMilvusServiceScaleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createMilvusServiceScaleOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServiceScale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceScaleOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceScaleOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("tshirt_size", createMilvusServiceScaleOptions.tshirtSize());
    if (createMilvusServiceScaleOptions.dcCpu() != null) {
      contentJson.addProperty("dc_cpu", createMilvusServiceScaleOptions.dcCpu());
    }
    if (createMilvusServiceScaleOptions.dcMemory() != null) {
      contentJson.addProperty("dc_memory", createMilvusServiceScaleOptions.dcMemory());
    }
    if (createMilvusServiceScaleOptions.dcReplicas() != null) {
      contentJson.addProperty("dc_replicas", createMilvusServiceScaleOptions.dcReplicas());
    }
    if (createMilvusServiceScaleOptions.dwCpu() != null) {
      contentJson.addProperty("dw_cpu", createMilvusServiceScaleOptions.dwCpu());
    }
    if (createMilvusServiceScaleOptions.dwMemory() != null) {
      contentJson.addProperty("dw_memory", createMilvusServiceScaleOptions.dwMemory());
    }
    if (createMilvusServiceScaleOptions.dwReplicas() != null) {
      contentJson.addProperty("dw_replicas", createMilvusServiceScaleOptions.dwReplicas());
    }
    if (createMilvusServiceScaleOptions.etcdCpu() != null) {
      contentJson.addProperty("etcd_cpu", createMilvusServiceScaleOptions.etcdCpu());
    }
    if (createMilvusServiceScaleOptions.etcdMemory() != null) {
      contentJson.addProperty("etcd_memory", createMilvusServiceScaleOptions.etcdMemory());
    }
    if (createMilvusServiceScaleOptions.indexType() != null) {
      contentJson.addProperty("index_type", createMilvusServiceScaleOptions.indexType());
    }
    if (createMilvusServiceScaleOptions.iwCpu() != null) {
      contentJson.addProperty("iw_cpu", createMilvusServiceScaleOptions.iwCpu());
    }
    if (createMilvusServiceScaleOptions.iwMemory() != null) {
      contentJson.addProperty("iw_memory", createMilvusServiceScaleOptions.iwMemory());
    }
    if (createMilvusServiceScaleOptions.iwReplicas() != null) {
      contentJson.addProperty("iw_replicas", createMilvusServiceScaleOptions.iwReplicas());
    }
    if (createMilvusServiceScaleOptions.kafkaCpu() != null) {
      contentJson.addProperty("kafka_cpu", createMilvusServiceScaleOptions.kafkaCpu());
    }
    if (createMilvusServiceScaleOptions.kafkaMemory() != null) {
      contentJson.addProperty("kafka_memory", createMilvusServiceScaleOptions.kafkaMemory());
    }
    if (createMilvusServiceScaleOptions.proxyCpu() != null) {
      contentJson.addProperty("proxy_cpu", createMilvusServiceScaleOptions.proxyCpu());
    }
    if (createMilvusServiceScaleOptions.proxyMemory() != null) {
      contentJson.addProperty("proxy_memory", createMilvusServiceScaleOptions.proxyMemory());
    }
    if (createMilvusServiceScaleOptions.proxyReplicas() != null) {
      contentJson.addProperty("proxy_replicas", createMilvusServiceScaleOptions.proxyReplicas());
    }
    if (createMilvusServiceScaleOptions.qcCpu() != null) {
      contentJson.addProperty("qc_cpu", createMilvusServiceScaleOptions.qcCpu());
    }
    if (createMilvusServiceScaleOptions.qcMemory() != null) {
      contentJson.addProperty("qc_memory", createMilvusServiceScaleOptions.qcMemory());
    }
    if (createMilvusServiceScaleOptions.qcReplicas() != null) {
      contentJson.addProperty("qc_replicas", createMilvusServiceScaleOptions.qcReplicas());
    }
    if (createMilvusServiceScaleOptions.qwCpu() != null) {
      contentJson.addProperty("qw_cpu", createMilvusServiceScaleOptions.qwCpu());
    }
    if (createMilvusServiceScaleOptions.qwMemory() != null) {
      contentJson.addProperty("qw_memory", createMilvusServiceScaleOptions.qwMemory());
    }
    if (createMilvusServiceScaleOptions.qwReplicas() != null) {
      contentJson.addProperty("qw_replicas", createMilvusServiceScaleOptions.qwReplicas());
    }
    if (createMilvusServiceScaleOptions.rcCpu() != null) {
      contentJson.addProperty("rc_cpu", createMilvusServiceScaleOptions.rcCpu());
    }
    if (createMilvusServiceScaleOptions.rcMemory() != null) {
      contentJson.addProperty("rc_memory", createMilvusServiceScaleOptions.rcMemory());
    }
    if (createMilvusServiceScaleOptions.rcReplicas() != null) {
      contentJson.addProperty("rc_replicas", createMilvusServiceScaleOptions.rcReplicas());
    }
    if (createMilvusServiceScaleOptions.vector() != null) {
      contentJson.addProperty("vector", createMilvusServiceScaleOptions.vector());
    }
    if (createMilvusServiceScaleOptions.vectorDimension() != null) {
      contentJson.addProperty("vector_dimension", createMilvusServiceScaleOptions.vectorDimension());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get milvus service databases.
   *
   * Get milvus service databases.
   *
   * @param listMilvusServiceDatabasesOptions the {@link ListMilvusServiceDatabasesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusServiceDatabases}
   */
  public ServiceCall<MilvusServiceDatabases> listMilvusServiceDatabases(ListMilvusServiceDatabasesOptions listMilvusServiceDatabasesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMilvusServiceDatabasesOptions,
      "listMilvusServiceDatabasesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", listMilvusServiceDatabasesOptions.serviceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{service_id}/databases", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listMilvusServiceDatabases");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMilvusServiceDatabasesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listMilvusServiceDatabasesOptions.authInstanceId());
    }
    ResponseConverter<MilvusServiceDatabases> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusServiceDatabases>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get milvus database collections.
   *
   * Get milvus database collections.
   *
   * @param listMilvusDatabaseCollectionsOptions the {@link ListMilvusDatabaseCollectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusDatabaseCollections}
   */
  public ServiceCall<MilvusDatabaseCollections> listMilvusDatabaseCollections(ListMilvusDatabaseCollectionsOptions listMilvusDatabaseCollectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMilvusDatabaseCollectionsOptions,
      "listMilvusDatabaseCollectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", listMilvusDatabaseCollectionsOptions.serviceId());
    pathParamsMap.put("database_id", listMilvusDatabaseCollectionsOptions.databaseId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{service_id}/databases/{database_id}/collections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listMilvusDatabaseCollections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMilvusDatabaseCollectionsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listMilvusDatabaseCollectionsOptions.authInstanceId());
    }
    ResponseConverter<MilvusDatabaseCollections> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusDatabaseCollections>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get milvus database collection partitions.
   *
   * Get milvus database collection partitions.
   *
   * @param listMilvusDatabasePartitionsOptions the {@link ListMilvusDatabasePartitionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusDatabasePartitions}
   */
  public ServiceCall<MilvusDatabasePartitions> listMilvusDatabasePartitions(ListMilvusDatabasePartitionsOptions listMilvusDatabasePartitionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMilvusDatabasePartitionsOptions,
      "listMilvusDatabasePartitionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", listMilvusDatabasePartitionsOptions.serviceId());
    pathParamsMap.put("database_id", listMilvusDatabasePartitionsOptions.databaseId());
    pathParamsMap.put("collection_name", listMilvusDatabasePartitionsOptions.collectionName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{service_id}/databases/{database_id}/collections/{collection_name}/partitions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listMilvusDatabasePartitions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMilvusDatabasePartitionsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listMilvusDatabasePartitionsOptions.authInstanceId());
    }
    ResponseConverter<MilvusDatabasePartitions> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusDatabasePartitions>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update milvus service storage.
   *
   * Update details of milvus service bucket.
   *
   * @param updateMilvusServiceBucketOptions the {@link UpdateMilvusServiceBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusService}
   */
  public ServiceCall<MilvusService> updateMilvusServiceBucket(UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMilvusServiceBucketOptions,
      "updateMilvusServiceBucketOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", updateMilvusServiceBucketOptions.serviceId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/milvus_services/{service_id}/storage", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateMilvusServiceBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMilvusServiceBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMilvusServiceBucketOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateMilvusServiceBucketOptions.body()), "application/json-patch+json");
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic automation layer Integration of the instance.
   *
   * Get basic details of the semantic automation layer(SAL) integration with IBM Knowledge Catalog(IKC).
   *
   * @param getSalIntegrationOptions the {@link GetSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration(GetSalIntegrationOptions getSalIntegrationOptions) {
    if (getSalIntegrationOptions == null) {
      getSalIntegrationOptions = new GetSalIntegrationOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationOptions.authInstanceId());
    }
    ResponseConverter<SalIntegration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic automation layer Integration of the instance.
   *
   * Get basic details of the semantic automation layer(SAL) integration with IBM Knowledge Catalog(IKC).
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration() {
    return getSalIntegration(null);
  }

  /**
   * Create semantic automation layer integration with IBM Knowledge Catalog.
   *
   * Create semantic automation layer integration(SAL) with IBM Knowledge Catalog(IKC).
   *
   * @param createSalIntegrationOptions the {@link CreateSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> createSalIntegration(CreateSalIntegrationOptions createSalIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationOptions,
      "createSalIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSalIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("apikey", createSalIntegrationOptions.apikey());
    contentJson.addProperty("engine_id", createSalIntegrationOptions.engineId());
    if (createSalIntegrationOptions.storageResourceCrn() != null) {
      contentJson.addProperty("storage_resource_crn", createSalIntegrationOptions.storageResourceCrn());
    }
    if (createSalIntegrationOptions.storageType() != null) {
      contentJson.addProperty("storage_type", createSalIntegrationOptions.storageType());
    }
    if (createSalIntegrationOptions.trialPlan() != null) {
      contentJson.addProperty("trial_plan", createSalIntegrationOptions.trialPlan());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SalIntegration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Semantic Automation Layer(SAL) integration.
   *
   * Remove Semantic automation layer integration.
   *
   * @param deleteSalIntegrationOptions the {@link DeleteSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalIntegration(DeleteSalIntegrationOptions deleteSalIntegrationOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Semantic Automation Layer(SAL) integration.
   *
   * Remove Semantic automation layer integration.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalIntegration() {
    return deleteSalIntegration(null);
  }

  /**
   * Patch Semantic automation layer integration.
   *
   * Update Semantic automation layer(SAL) integration properties.
   *
   * @param updateSalIntegrationOptions the {@link UpdateSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> updateSalIntegration(UpdateSalIntegrationOptions updateSalIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSalIntegrationOptions,
      "updateSalIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSalIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSalIntegrationOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSalIntegrationOptions.salIntegrationPatch()), "application/merge-patch+json");
    ResponseConverter<SalIntegration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * create enrichment jobs of schema(or tables in schema).
   *
   * create enrichment job of schemas, notifing the schema(tables) changes to IBM Knowledge Catalog(IKC) and kick off an
   * import and metadata enrichment job.
   *
   * @param createSalIntegrationEnrichmentOptions the {@link CreateSalIntegrationEnrichmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationEnrichmentOptions,
      "createSalIntegrationEnrichmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSalIntegrationEnrichment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (createSalIntegrationEnrichmentOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationEnrichmentOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createSalIntegrationEnrichmentOptions.changes() != null) {
      contentJson.add("changes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentOptions.changes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * create enrichment jobs of schema(or tables in schema).
   *
   * create enrichment job of schemas, notifing the schema(tables) changes to IBM Knowledge Catalog(IKC) and kick off an
   * import and metadata enrichment job.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment() {
    return createSalIntegrationEnrichment(null);
  }

  /**
   * List semantic enriched data_assets in IBM Knowledge catalog.
   *
   * List semantic enrichment data_assets(enriched tables) associated with the schema by IBM Knowledge Catalog project
   * id, which can be fetched from /sal_integration/mappings.
   *
   * @param listSalIntegrationEnrichmentAssetsOptions the {@link ListSalIntegrationEnrichmentAssetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentDataAssetCollection}
   */
  public ServiceCall<SalEnrichmentDataAssetCollection> listSalIntegrationEnrichmentAssets(ListSalIntegrationEnrichmentAssetsOptions listSalIntegrationEnrichmentAssetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentAssetsOptions,
      "listSalIntegrationEnrichmentAssetsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/data_assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationEnrichmentAssets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationEnrichmentAssetsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationEnrichmentAssetsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(listSalIntegrationEnrichmentAssetsOptions.projectId()));
    ResponseConverter<SalEnrichmentDataAssetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentDataAssetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment data_asset associated with the table.
   *
   * Get semantic enrichment data_asset associated with the table by IBM Knowledge Catalog project id and asset id,
   * which can be retrived by /sal_integration/enrichement/data_assets.
   *
   * @param getSalIntegrationEnrichmentAssetsByIdOptions the {@link GetSalIntegrationEnrichmentAssetsByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentDataAsset}
   */
  public ServiceCall<SalEnrichmentDataAsset> getSalIntegrationEnrichmentAssetsById(GetSalIntegrationEnrichmentAssetsByIdOptions getSalIntegrationEnrichmentAssetsByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationEnrichmentAssetsByIdOptions,
      "getSalIntegrationEnrichmentAssetsByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSalIntegrationEnrichmentAssetsByIdOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/data_assets/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationEnrichmentAssetsById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentAssetsByIdOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentAssetsByIdOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentAssetsByIdOptions.projectId()));
    ResponseConverter<SalEnrichmentDataAsset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentDataAsset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get metadata enrichment global settings.
   *
   * Get metadata enrichment global settings.
   *
   * @param getSalIntegrationEnrichmentGlobalSettingsOptions the {@link GetSalIntegrationEnrichmentGlobalSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentSettings}
   */
  public ServiceCall<SalEnrichmentSettings> getSalIntegrationEnrichmentGlobalSettings(GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptions) {
    if (getSalIntegrationEnrichmentGlobalSettingsOptions == null) {
      getSalIntegrationEnrichmentGlobalSettingsOptions = new GetSalIntegrationEnrichmentGlobalSettingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/global_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationEnrichmentGlobalSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId());
    }
    ResponseConverter<SalEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get metadata enrichment global settings.
   *
   * Get metadata enrichment global settings.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentSettings}
   */
  public ServiceCall<SalEnrichmentSettings> getSalIntegrationEnrichmentGlobalSettings() {
    return getSalIntegrationEnrichmentGlobalSettings(null);
  }

  /**
   * Create or update metadata enrichment global settings.
   *
   * Create or update metadata enrichment global settings.
   *
   * @param replaceSalIntegrationEnrichmentGlobalSettingsOptions the {@link ReplaceSalIntegrationEnrichmentGlobalSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentSettings}
   */
  public ServiceCall<SalEnrichmentSettings> replaceSalIntegrationEnrichmentGlobalSettings(ReplaceSalIntegrationEnrichmentGlobalSettingsOptions replaceSalIntegrationEnrichmentGlobalSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSalIntegrationEnrichmentGlobalSettingsOptions,
      "replaceSalIntegrationEnrichmentGlobalSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/global_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "replaceSalIntegrationEnrichmentGlobalSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replaceSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("expansion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSalIntegrationEnrichmentGlobalSettingsOptions.expansion()));
    contentJson.add("term_assignment", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSalIntegrationEnrichmentGlobalSettingsOptions.termAssignment()));
    builder.bodyJson(contentJson);
    ResponseConverter<SalEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List semantic enrichment jobs associated with the schema.
   *
   * List semantic enrichment jobs in wkc that associated with the schema by project id(in the given project from IBM
   * Knowledge Catalog perspective).
   *
   * @param listSalIntegrationEnrichmentJobsOptions the {@link ListSalIntegrationEnrichmentJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentJobs}
   */
  public ServiceCall<SalEnrichmentJobs> listSalIntegrationEnrichmentJobs(ListSalIntegrationEnrichmentJobsOptions listSalIntegrationEnrichmentJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentJobsOptions,
      "listSalIntegrationEnrichmentJobsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationEnrichmentJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationEnrichmentJobsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationEnrichmentJobsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(listSalIntegrationEnrichmentJobsOptions.projectId()));
    ResponseConverter<SalEnrichmentJobs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentJobs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List semantic enrichment job runs associated with the schema.
   *
   * List runs of an SAL enrichement job associated with the schema(project in IBM Knowledge Catalog perspective).
   *
   * @param listSalIntegrationEnrichmentJobRunsOptions the {@link ListSalIntegrationEnrichmentJobRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentJobRuns}
   */
  public ServiceCall<SalEnrichmentJobRuns> listSalIntegrationEnrichmentJobRuns(ListSalIntegrationEnrichmentJobRunsOptions listSalIntegrationEnrichmentJobRunsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentJobRunsOptions,
      "listSalIntegrationEnrichmentJobRunsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listSalIntegrationEnrichmentJobRunsOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/jobs/{job_id}/runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationEnrichmentJobRuns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationEnrichmentJobRunsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationEnrichmentJobRunsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(listSalIntegrationEnrichmentJobRunsOptions.projectId()));
    ResponseConverter<SalEnrichmentJobRuns> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentJobRuns>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment job run logs associated with the job run.
   *
   * Get semantic enrichment job run logs associated with the job run.
   *
   * @param getSalIntegrationEnrichmentJobRunLogsOptions the {@link GetSalIntegrationEnrichmentJobRunLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentJobRunLogs}
   */
  public ServiceCall<SalEnrichmentJobRunLogs> getSalIntegrationEnrichmentJobRunLogs(GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationEnrichmentJobRunLogsOptions,
      "getSalIntegrationEnrichmentJobRunLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getSalIntegrationEnrichmentJobRunLogsOptions.jobId());
    pathParamsMap.put("run_id", getSalIntegrationEnrichmentJobRunLogsOptions.runId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/jobs/{job_id}/runs/{run_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationEnrichmentJobRunLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentJobRunLogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentJobRunLogsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentJobRunLogsOptions.projectId()));
    ResponseConverter<SalEnrichmentJobRunLogs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentJobRunLogs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * get metadata enrichment settings for a IBM Knowledge Catalog project(schema).
   *
   * get metadata enrichment settings for a IBM Knowledge Catalog project(schema).
   *
   * @param getSalIntegrationEnrichmentProjectSettingsOptions the {@link GetSalIntegrationEnrichmentProjectSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentSettings}
   */
  public ServiceCall<SalEnrichmentSettings> getSalIntegrationEnrichmentProjectSettings(GetSalIntegrationEnrichmentProjectSettingsOptions getSalIntegrationEnrichmentProjectSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationEnrichmentProjectSettingsOptions,
      "getSalIntegrationEnrichmentProjectSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/project_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationEnrichmentProjectSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentProjectSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentProjectSettingsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentProjectSettingsOptions.projectId()));
    ResponseConverter<SalEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or update project level metadata enrichment settings.
   *
   * Create or update metadata enrichment settings for a IBM Knowledge Catalog project(enriched schema).
   *
   * @param replaceSalIntegrationEnrichmentProjectSettingsOptions the {@link ReplaceSalIntegrationEnrichmentProjectSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> replaceSalIntegrationEnrichmentProjectSettings(ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSalIntegrationEnrichmentProjectSettingsOptions,
      "replaceSalIntegrationEnrichmentProjectSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/enrichment/project_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "replaceSalIntegrationEnrichmentProjectSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (replaceSalIntegrationEnrichmentProjectSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replaceSalIntegrationEnrichmentProjectSettingsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(replaceSalIntegrationEnrichmentProjectSettingsOptions.projectId()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("expansion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSalIntegrationEnrichmentProjectSettingsOptions.expansion()));
    contentJson.add("term_assignment", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceSalIntegrationEnrichmentProjectSettingsOptions.termAssignment()));
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of uploaded glossary terms.
   *
   * Get list of uploaded glossary terms.
   *
   * @param getSalIntegrationGlossaryTermsOptions the {@link GetSalIntegrationGlossaryTermsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryTerms}
   */
  public ServiceCall<SalGlossaryTerms> getSalIntegrationGlossaryTerms(GetSalIntegrationGlossaryTermsOptions getSalIntegrationGlossaryTermsOptions) {
    if (getSalIntegrationGlossaryTermsOptions == null) {
      getSalIntegrationGlossaryTermsOptions = new GetSalIntegrationGlossaryTermsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/glossary/terms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationGlossaryTerms");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationGlossaryTermsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationGlossaryTermsOptions.authInstanceId());
    }
    ResponseConverter<SalGlossaryTerms> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalGlossaryTerms>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of uploaded glossary terms.
   *
   * Get list of uploaded glossary terms.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryTerms}
   */
  public ServiceCall<SalGlossaryTerms> getSalIntegrationGlossaryTerms() {
    return getSalIntegrationGlossaryTerms(null);
  }

  /**
   * Upload semantic enrichment business terms glossary.
   *
   * Upload semantic enrichment business terms glossary.
   *
   * @param createSalIntegrationUploadGlossaryOptions the {@link CreateSalIntegrationUploadGlossaryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryUploadProcess}
   */
  public ServiceCall<SalGlossaryUploadProcess> createSalIntegrationUploadGlossary(CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationUploadGlossaryOptions,
      "createSalIntegrationUploadGlossaryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/glossary/upload_processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSalIntegrationUploadGlossary");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSalIntegrationUploadGlossaryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationUploadGlossaryOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("replace_option", createSalIntegrationUploadGlossaryOptions.replaceOption());
    if (createSalIntegrationUploadGlossaryOptions.glossaryCsv() != null) {
      okhttp3.RequestBody glossaryCsvBody = RequestUtils.inputStreamBody(createSalIntegrationUploadGlossaryOptions.glossaryCsv(), createSalIntegrationUploadGlossaryOptions.glossaryCsvContentType());
      multipartBuilder.addFormDataPart("glossary_csv", "filename", glossaryCsvBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<SalGlossaryUploadProcess> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalGlossaryUploadProcess>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get status of glossary uploading process(job).
   *
   * Get status of glossary uploading process(job).
   *
   * @param getSalIntegrationUploadGlossaryStatusOptions the {@link GetSalIntegrationUploadGlossaryStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryUploadStatus}
   */
  public ServiceCall<SalGlossaryUploadStatus> getSalIntegrationUploadGlossaryStatus(GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationUploadGlossaryStatusOptions,
      "getSalIntegrationUploadGlossaryStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSalIntegrationUploadGlossaryStatusOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/glossary/upload_processes/{id}/status", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationUploadGlossaryStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationUploadGlossaryStatusOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationUploadGlossaryStatusOptions.authInstanceId());
    }
    ResponseConverter<SalGlossaryUploadStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalGlossaryUploadStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Post watsonx.data schema to fetch mapped catalog and project.
   *
   * use the list of watsonx.data catalog and schema to fetch mapped IKC project id and catalog id.
   *
   * @param listSalIntegrationEnrichmentMappingsOptions the {@link ListSalIntegrationEnrichmentMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationMappings}
   */
  public ServiceCall<SalIntegrationMappings> listSalIntegrationEnrichmentMappings(ListSalIntegrationEnrichmentMappingsOptions listSalIntegrationEnrichmentMappingsOptions) {
    if (listSalIntegrationEnrichmentMappingsOptions == null) {
      listSalIntegrationEnrichmentMappingsOptions = new ListSalIntegrationEnrichmentMappingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationEnrichmentMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationEnrichmentMappingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationEnrichmentMappingsOptions.authInstanceId());
    }
    if (listSalIntegrationEnrichmentMappingsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listSalIntegrationEnrichmentMappingsOptions.catalogName()));
    }
    if (listSalIntegrationEnrichmentMappingsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(listSalIntegrationEnrichmentMappingsOptions.schemaName()));
    }
    if (listSalIntegrationEnrichmentMappingsOptions.next() != null) {
      builder.query("next", String.valueOf(listSalIntegrationEnrichmentMappingsOptions.next()));
    }
    ResponseConverter<SalIntegrationMappings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationMappings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Post watsonx.data schema to fetch mapped catalog and project.
   *
   * use the list of watsonx.data catalog and schema to fetch mapped IKC project id and catalog id.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationMappings}
   */
  public ServiceCall<SalIntegrationMappings> listSalIntegrationEnrichmentMappings() {
    return listSalIntegrationEnrichmentMappings(null);
  }

  /**
   * List Semantic Search queries snapshot.
   *
   * List Semantic Search queries snapshot.
   *
   * @param listSemanticSearchQueriesOptions the {@link ListSemanticSearchQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SemanticSearchList}
   */
  public ServiceCall<SemanticSearchList> listSemanticSearchQueries(ListSemanticSearchQueriesOptions listSemanticSearchQueriesOptions) {
    if (listSemanticSearchQueriesOptions == null) {
      listSemanticSearchQueriesOptions = new ListSemanticSearchQueriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/semantic_search/queries"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSemanticSearchQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSemanticSearchQueriesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSemanticSearchQueriesOptions.authInstanceId());
    }
    if (listSemanticSearchQueriesOptions.engineId() != null) {
      builder.query("engine_id", String.valueOf(listSemanticSearchQueriesOptions.engineId()));
    }
    if (listSemanticSearchQueriesOptions.schemaSearchEnabled() != null) {
      builder.query("schema_search_enabled", String.valueOf(listSemanticSearchQueriesOptions.schemaSearchEnabled()));
    }
    if (listSemanticSearchQueriesOptions.columnSearchEnabled() != null) {
      builder.query("column_search_enabled", String.valueOf(listSemanticSearchQueriesOptions.columnSearchEnabled()));
    }
    if (listSemanticSearchQueriesOptions.maxResultNumber() != null) {
      builder.query("max_result_number", String.valueOf(listSemanticSearchQueriesOptions.maxResultNumber()));
    }
    if (listSemanticSearchQueriesOptions.runSearch() != null) {
      builder.query("run_search", String.valueOf(listSemanticSearchQueriesOptions.runSearch()));
    }
    ResponseConverter<SemanticSearchList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SemanticSearchList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Semantic Search queries snapshot.
   *
   * List Semantic Search queries snapshot.
   *
   * @return a {@link ServiceCall} with a result of type {@link SemanticSearchList}
   */
  public ServiceCall<SemanticSearchList> listSemanticSearchQueries() {
    return listSemanticSearchQueries(null);
  }

  /**
   * Trigger a global search among IBM Knowledge Catalog metadata by given query.
   *
   * Execute a query of global search among IBM Knowledge Catalog metadata.
   *
   * @param createSemanticSearchQueriesOptions the {@link CreateSemanticSearchQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SemanticSearch}
   */
  public ServiceCall<SemanticSearch> createSemanticSearchQueries(CreateSemanticSearchQueriesOptions createSemanticSearchQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSemanticSearchQueriesOptions,
      "createSemanticSearchQueriesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/semantic_search/queries"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSemanticSearchQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSemanticSearchQueriesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSemanticSearchQueriesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", createSemanticSearchQueriesOptions.engineId());
    contentJson.addProperty("query_input", createSemanticSearchQueriesOptions.queryInput());
    if (createSemanticSearchQueriesOptions.searchConfig() != null) {
      contentJson.add("search_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSemanticSearchQueriesOptions.searchConfig()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SemanticSearch> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SemanticSearch>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Clear semantic search query history.
   *
   * Delete the history records of semantic search in batch, if no batch_size given, entire semantic search history list
   * will be removed.
   *
   * @param deleteSemanticSearchQueriesOptions the {@link DeleteSemanticSearchQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSemanticSearchQueries(DeleteSemanticSearchQueriesOptions deleteSemanticSearchQueriesOptions) {
    if (deleteSemanticSearchQueriesOptions == null) {
      deleteSemanticSearchQueriesOptions = new DeleteSemanticSearchQueriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/semantic_search/queries"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSemanticSearchQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSemanticSearchQueriesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSemanticSearchQueriesOptions.authInstanceId());
    }
    if (deleteSemanticSearchQueriesOptions.batchSize() != null) {
      builder.query("batch_size", String.valueOf(deleteSemanticSearchQueriesOptions.batchSize()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Clear semantic search query history.
   *
   * Delete the history records of semantic search in batch, if no batch_size given, entire semantic search history list
   * will be removed.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSemanticSearchQueries() {
    return deleteSemanticSearchQueries(null);
  }

  /**
   * Delete semantic search query history by record id.
   *
   * Delete the history records of semantic search by record id.
   *
   * @param deleteSemanticSearchQueriesByIdOptions the {@link DeleteSemanticSearchQueriesByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSemanticSearchQueriesById(DeleteSemanticSearchQueriesByIdOptions deleteSemanticSearchQueriesByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSemanticSearchQueriesByIdOptions,
      "deleteSemanticSearchQueriesByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSemanticSearchQueriesByIdOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_integration/semantic_search/queries/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSemanticSearchQueriesById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSemanticSearchQueriesByIdOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSemanticSearchQueriesByIdOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Semantic automation layer(SAL) integration metadata.
   *
   * Delete SAL integration metadata.
   *
   * @param deleteSalMetadataOptions the {@link DeleteSalMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalMetadata(DeleteSalMetadataOptions deleteSalMetadataOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/sal_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSalMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Semantic automation layer(SAL) integration metadata.
   *
   * Delete SAL integration metadata.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalMetadata() {
    return deleteSalMetadata(null);
  }

  /**
   * List ingestion jobs.
   *
   * Get list of ingestion jobs.
   *
   * @param listIngestionJobsOptions the {@link ListIngestionJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJobCollection}
   */
  public ServiceCall<IngestionJobCollection> listIngestionJobs(ListIngestionJobsOptions listIngestionJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listIngestionJobsOptions,
      "listIngestionJobsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/lhingestion/api/v1/ingestion/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listIngestionJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", listIngestionJobsOptions.authInstanceId());
    if (listIngestionJobsOptions.start() != null) {
      builder.query("start", String.valueOf(listIngestionJobsOptions.start()));
    }
    if (listIngestionJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listIngestionJobsOptions.limit()));
    }
    ResponseConverter<IngestionJobCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJobCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit ingestion job.
   *
   * Submit an ingestion job with the provided source and target details.
   *
   * @param createIngestionJobOptions the {@link CreateIngestionJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJob}
   */
  public ServiceCall<IngestionJob> createIngestionJob(CreateIngestionJobOptions createIngestionJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIngestionJobOptions,
      "createIngestionJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/lhingestion/api/v1/ingestion/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createIngestionJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", createIngestionJobOptions.authInstanceId());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("id", createIngestionJobOptions.id());
    contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.source()));
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.target()));
    if (createIngestionJobOptions.engine() != null) {
      contentJson.add("engine", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.engine()));
    }
    if (createIngestionJobOptions.engineId() != null) {
      contentJson.addProperty("engine_id", createIngestionJobOptions.engineId());
    }
    if (createIngestionJobOptions.executeConfig() != null) {
      contentJson.add("execute_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.executeConfig()));
    }
    if (createIngestionJobOptions.sourceIcebergTable() != null) {
      contentJson.add("source_iceberg_table", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.sourceIcebergTable()));
    }
    if (createIngestionJobOptions.partitionBy() != null) {
      contentJson.addProperty("partition_by", createIngestionJobOptions.partitionBy());
    }
    if (createIngestionJobOptions.capacity() != null) {
      contentJson.add("capacity", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobOptions.capacity()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<IngestionJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get ingestion job by ID.
   *
   * Get ingestion job by ID.
   *
   * @param getIngestionJobOptions the {@link GetIngestionJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJob}
   */
  public ServiceCall<IngestionJob> getIngestionJob(GetIngestionJobOptions getIngestionJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIngestionJobOptions,
      "getIngestionJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getIngestionJobOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v3/lhingestion/api/v1/ingestion/jobs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getIngestionJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", getIngestionJobOptions.authInstanceId());
    ResponseConverter<IngestionJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Resource Access Policies.
   *
   * Retrieves a comprehensive list of access control policies that define permissions granted to users and user groups
   * for various watsonx.data resources. This endpoint allows you to query access policies by resource type, resource
   * identifiers, or resource names. The response includes detailed information about subjects (users/groups),
   * resources, permissions, and policy states.
   *
   * @param listResourceAccessPoliciesOptions the {@link ListResourceAccessPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicies}
   */
  public ServiceCall<AccessPolicies> listResourceAccessPolicies(ListResourceAccessPoliciesOptions listResourceAccessPoliciesOptions) {
    if (listResourceAccessPoliciesOptions == null) {
      listResourceAccessPoliciesOptions = new ListResourceAccessPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/access_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listResourceAccessPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourceAccessPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listResourceAccessPoliciesOptions.authInstanceId());
    }
    if (listResourceAccessPoliciesOptions.resourceType() != null) {
      builder.query("resource_type", String.valueOf(listResourceAccessPoliciesOptions.resourceType()));
    }
    if (listResourceAccessPoliciesOptions.resourceId() != null) {
      builder.query("resource_id", RequestUtils.join(listResourceAccessPoliciesOptions.resourceId(), ","));
    }
    if (listResourceAccessPoliciesOptions.resourceName() != null) {
      builder.query("resource_name", RequestUtils.join(listResourceAccessPoliciesOptions.resourceName(), ","));
    }
    ResponseConverter<AccessPolicies> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicies>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Resource Access Policies.
   *
   * Retrieves a comprehensive list of access control policies that define permissions granted to users and user groups
   * for various watsonx.data resources. This endpoint allows you to query access policies by resource type, resource
   * identifiers, or resource names. The response includes detailed information about subjects (users/groups),
   * resources, permissions, and policy states.
   *
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicies}
   */
  public ServiceCall<AccessPolicies> listResourceAccessPolicies() {
    return listResourceAccessPolicies(null);
  }

  /**
   * Bulk Update Resource Access Policies.
   *
   * This API enables bulk updates of resource access policies, which define user access and permissions for specific
   * resources.
   *
   * @param bulkUpdateResourceAccessPoliciesOptions the {@link BulkUpdateResourceAccessPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicyBulkUpdateResponse}
   */
  public ServiceCall<AccessPolicyBulkUpdateResponse> bulkUpdateResourceAccessPolicies(BulkUpdateResourceAccessPoliciesOptions bulkUpdateResourceAccessPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(bulkUpdateResourceAccessPoliciesOptions,
      "bulkUpdateResourceAccessPoliciesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/access_policies/bulk_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "bulkUpdateResourceAccessPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (bulkUpdateResourceAccessPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", bulkUpdateResourceAccessPoliciesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (bulkUpdateResourceAccessPoliciesOptions.accessPolicies() != null) {
      contentJson.add("access_policies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(bulkUpdateResourceAccessPoliciesOptions.accessPolicies()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessPolicyBulkUpdateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicyBulkUpdateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk Update Resource Access Policies.
   *
   * This API enables bulk updates of resource access policies, which define user access and permissions for specific
   * resources.
   *
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicyBulkUpdateResponse}
   */
  public ServiceCall<AccessPolicyBulkUpdateResponse> bulkUpdateResourceAccessPolicies() {
    return bulkUpdateResourceAccessPolicies(null);
  }

  /**
   * Revoke Resource Access Policies.
   *
   * Remove users and user groups from the access policy for the resource id or name provided. You require
   * `can_administer` permission to perform this action.
   *
   * @param revokeResourceAccessPoliciesOptions the {@link RevokeResourceAccessPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> revokeResourceAccessPolicies(RevokeResourceAccessPoliciesOptions revokeResourceAccessPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(revokeResourceAccessPoliciesOptions,
      "revokeResourceAccessPoliciesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/access_policies/revoke"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "revokeResourceAccessPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (revokeResourceAccessPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", revokeResourceAccessPoliciesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (revokeResourceAccessPoliciesOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(revokeResourceAccessPoliciesOptions.resources()));
    }
    if (revokeResourceAccessPoliciesOptions.subjects() != null) {
      contentJson.add("subjects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(revokeResourceAccessPoliciesOptions.subjects()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke Resource Access Policies.
   *
   * Remove users and user groups from the access policy for the resource id or name provided. You require
   * `can_administer` permission to perform this action.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> revokeResourceAccessPolicies() {
    return revokeResourceAccessPolicies(null);
  }

  /**
   * Filter Resource Access Policies On Users And User Groups.
   *
   * Retrieve the permissions that have been granted to users and user groups for the resource types with specified ids
   * and names and given users or usergroups.
   *
   * @param filterResourceAccessPoliciesOnUsersAndUsergroupsOptions the {@link FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicies}
   */
  public ServiceCall<AccessPolicies> filterResourceAccessPoliciesOnUsersAndUsergroups(FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions filterResourceAccessPoliciesOnUsersAndUsergroupsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(filterResourceAccessPoliciesOnUsersAndUsergroupsOptions,
      "filterResourceAccessPoliciesOnUsersAndUsergroupsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/advanced_policy_search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "filterResourceAccessPoliciesOnUsersAndUsergroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (filterResourceAccessPoliciesOnUsersAndUsergroupsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", filterResourceAccessPoliciesOnUsersAndUsergroupsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("access_policies_search", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(filterResourceAccessPoliciesOnUsersAndUsergroupsOptions.accessPoliciesSearch()));
    builder.bodyJson(contentJson);
    ResponseConverter<AccessPolicies> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicies>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List data policies.
   *
   * Get a list of all the data policies defined on the data to define, extend, limit, and deny access created by the
   * user with admin privileges.
   *
   * @param listDataPoliciesOptions the {@link ListDataPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2Collection}
   */
  public ServiceCall<PolicyV2Collection> listDataPolicies(ListDataPoliciesOptions listDataPoliciesOptions) {
    if (listDataPoliciesOptions == null) {
      listDataPoliciesOptions = new ListDataPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listDataPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listDataPoliciesOptions.authInstanceId());
    }
    if (listDataPoliciesOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listDataPoliciesOptions.catalogName()));
    }
    if (listDataPoliciesOptions.resourceId() != null) {
      builder.query("resource_id", String.valueOf(listDataPoliciesOptions.resourceId()));
    }
    if (listDataPoliciesOptions.status() != null) {
      builder.query("status", String.valueOf(listDataPoliciesOptions.status()));
    }
    if (listDataPoliciesOptions.includeMetadata() != null) {
      builder.query("include_metadata", String.valueOf(listDataPoliciesOptions.includeMetadata()));
    }
    if (listDataPoliciesOptions.includeRules() != null) {
      builder.query("include_rules", String.valueOf(listDataPoliciesOptions.includeRules()));
    }
    if (listDataPoliciesOptions.bucketName() != null) {
      builder.query("bucket_name", String.valueOf(listDataPoliciesOptions.bucketName()));
    }
    if (listDataPoliciesOptions.serviceName() != null) {
      builder.query("service_name", String.valueOf(listDataPoliciesOptions.serviceName()));
    }
    if (listDataPoliciesOptions.dataArtifact() != null) {
      builder.query("data_artifact", String.valueOf(listDataPoliciesOptions.dataArtifact()));
    }
    ResponseConverter<PolicyV2Collection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyV2Collection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List data policies.
   *
   * Get a list of all the data policies defined on the data to define, extend, limit, and deny access created by the
   * user with admin privileges.
   *
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2Collection}
   */
  public ServiceCall<PolicyV2Collection> listDataPolicies() {
    return listDataPolicies(null);
  }

  /**
   * Create a new data policy.
   *
   * This api is used to create a new data policy, which is L3 access policy. This policy defines the users and their
   * permissions on the data level.
   *
   * @param createDataPolicyOptions the {@link CreateDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2}
   */
  public ServiceCall<PolicyV2> createDataPolicy(CreateDataPolicyOptions createDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataPolicyOptions,
      "createDataPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDataPolicyOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("data_artifact", createDataPolicyOptions.dataArtifact());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataPolicyOptions.rules()));
    if (createDataPolicyOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", createDataPolicyOptions.catalogName());
    }
    if (createDataPolicyOptions.catalogType() != null) {
      contentJson.addProperty("catalog_type", createDataPolicyOptions.catalogType());
    }
    if (createDataPolicyOptions.description() != null) {
      contentJson.addProperty("description", createDataPolicyOptions.description());
    }
    if (createDataPolicyOptions.policyName() != null) {
      contentJson.addProperty("policy_name", createDataPolicyOptions.policyName());
    }
    if (createDataPolicyOptions.resourceId() != null) {
      contentJson.addProperty("resource_id", createDataPolicyOptions.resourceId());
    }
    if (createDataPolicyOptions.status() != null) {
      contentJson.addProperty("status", createDataPolicyOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyV2> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyV2>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk delete data policies.
   *
   * Delete multiple data policies together. You require catalog `can_administer` permission to perform this action.
   *
   * @param deleteDataPoliciesOptions the {@link DeleteDataPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicies(DeleteDataPoliciesOptions deleteDataPoliciesOptions) {
    if (deleteDataPoliciesOptions == null) {
      deleteDataPoliciesOptions = new DeleteDataPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteDataPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDataPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDataPoliciesOptions.authInstanceId());
    }
    if (deleteDataPoliciesOptions.policies() != null) {
      builder.query("policies", String.valueOf(deleteDataPoliciesOptions.policies()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk delete data policies.
   *
   * Delete multiple data policies together. You require catalog `can_administer` permission to perform this action.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicies() {
    return deleteDataPolicies(null);
  }

  /**
   * Get data policy.
   *
   * Get a data policy details by passing data policy name as path param.
   *
   * @param getDataPolicyOptions the {@link GetDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2}
   */
  public ServiceCall<PolicyV2> getDataPolicy(GetDataPolicyOptions getDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataPolicyOptions,
      "getDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getDataPolicyOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDataPolicyOptions.authInstanceId());
    }
    ResponseConverter<PolicyV2> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyV2>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace data policy.
   *
   * Replaces existing data policy details with the specified details. You require catalog `can_administer` permission
   * to perform this action.
   *
   * @param replaceDataPolicyOptions the {@link ReplaceDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2}
   */
  public ServiceCall<PolicyV2> replaceDataPolicy(ReplaceDataPolicyOptions replaceDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataPolicyOptions,
      "replaceDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", replaceDataPolicyOptions.name());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "replaceDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replaceDataPolicyOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("data_artifact", replaceDataPolicyOptions.dataArtifact());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataPolicyOptions.rules()));
    if (replaceDataPolicyOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", replaceDataPolicyOptions.catalogName());
    }
    if (replaceDataPolicyOptions.catalogType() != null) {
      contentJson.addProperty("catalog_type", replaceDataPolicyOptions.catalogType());
    }
    if (replaceDataPolicyOptions.description() != null) {
      contentJson.addProperty("description", replaceDataPolicyOptions.description());
    }
    if (replaceDataPolicyOptions.policyName() != null) {
      contentJson.addProperty("policy_name", replaceDataPolicyOptions.policyName());
    }
    if (replaceDataPolicyOptions.resourceId() != null) {
      contentJson.addProperty("resource_id", replaceDataPolicyOptions.resourceId());
    }
    if (replaceDataPolicyOptions.status() != null) {
      contentJson.addProperty("status", replaceDataPolicyOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyV2> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyV2>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data policy.
   *
   * Delete a data policy by passing data policy name. You require catalog `can_administer` permission to perform this
   * action.
   *
   * @param deleteDataPolicyOptions the {@link DeleteDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicy(DeleteDataPolicyOptions deleteDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataPolicyOptions,
      "deleteDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", deleteDataPolicyOptions.name());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDataPolicyOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update data policy.
   *
   * Update data policy. Currently, you can update only users/groups in the data policy rules. You require
   * `can_administer` permission to perform this action.
   *
   * @param updateDataPolicyOptions the {@link UpdateDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyV2}
   */
  public ServiceCall<PolicyV2> updateDataPolicy(UpdateDataPolicyOptions updateDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataPolicyOptions,
      "updateDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", updateDataPolicyOptions.name());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/access/data_policies/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDataPolicyOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataPolicyOptions.body()), "application/json-patch+json");
    ResponseConverter<PolicyV2> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyV2>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
