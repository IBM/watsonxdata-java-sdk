/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.AddBucketCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketObjectProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnsResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDriverRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEnginePauseCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineRestartCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineResumeCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineScaleCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateExecuteQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateHdfsStorageOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIngestionJobsLocalFilesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIngestionJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServicePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePreviewIngestionFileOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationEnrichmentOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationEnrichmentSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationUploadGlossaryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineCatalogsOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDriverEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDriverRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteIngestionJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DriverRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DriverRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DriverRegistrationEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EndpointCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginesServicesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ExecuteQueryCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetAllColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetBucketObjectPropertiesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetEndpointsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetIngestionJobOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetIntegrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentAssetsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentDataAssetOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentJobRunLogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentJobRunsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationEnrichmentSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationGlossaryTermsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationMappingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSalIntegrationUploadGlossaryStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSchemaDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetServiceDetailOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetServicesDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetTableDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Integration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IntegrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllIntegrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDriverRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListIngestionJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListInstanceDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListInstanceServiceDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListMilvusDatabaseCollectionsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListMilvusServiceDatabasesOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkVersionsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkVersionsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.LoadTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.LoadTableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusDatabaseCollections;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PreviewIngestionFile;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RestartPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RestartPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResumePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResumePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResumeSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RollbackTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentAssets;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentDataAsset;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobRun;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobRunLogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobs;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettings;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationGlossaryTerms;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationMappings;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationUploadGlossary;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationUploadGlossaryStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SchemaResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SchemaResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ServicesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkHistoryServer;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDriverEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.WatsonxInstanceDetailsCollection;
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
    contentJson.addProperty("bucket_type", createBucketRegistrationOptions.bucketType());
    contentJson.addProperty("description", createBucketRegistrationOptions.description());
    contentJson.addProperty("managed_by", createBucketRegistrationOptions.managedBy());
    if (createBucketRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.associatedCatalog()));
    }
    if (createBucketRegistrationOptions.bucketDetails() != null) {
      contentJson.add("bucket_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.bucketDetails()));
    }
    if (createBucketRegistrationOptions.bucketDisplayName() != null) {
      contentJson.addProperty("bucket_display_name", createBucketRegistrationOptions.bucketDisplayName());
    }
    if (createBucketRegistrationOptions.region() != null) {
      contentJson.addProperty("region", createBucketRegistrationOptions.region());
    }
    if (createBucketRegistrationOptions.storageDetails() != null) {
      contentJson.add("storage_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketRegistrationOptions.storageDetails()));
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
   * Deregister Bucket.
   *
   * Deregister a bucket.
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateBucketRegistrationOptions.body()), "application/merge-patch+json");
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
   * Add bucket catalog.
   *
   * Add bucket catalog.
   *
   * @param addBucketCatalogOptions the {@link AddBucketCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> addBucketCatalog(AddBucketCatalogOptions addBucketCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addBucketCatalogOptions,
      "addBucketCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", addBucketCatalogOptions.bucketId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "addBucketCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addBucketCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", addBucketCatalogOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (addBucketCatalogOptions.basePath() != null) {
      contentJson.addProperty("base_path", addBucketCatalogOptions.basePath());
    }
    if (addBucketCatalogOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", addBucketCatalogOptions.catalogName());
    }
    if (addBucketCatalogOptions.catalogTags() != null) {
      contentJson.add("catalog_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addBucketCatalogOptions.catalogTags()));
    }
    if (addBucketCatalogOptions.catalogType() != null) {
      contentJson.addProperty("catalog_type", addBucketCatalogOptions.catalogType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
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
    if (listBucketObjectsOptions.path() != null) {
      builder.query("path", String.valueOf(listBucketObjectsOptions.path()));
    }
    ResponseConverter<BucketRegistrationObjectCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketRegistrationObjectCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get bucket object properties.
   *
   * Get bucket object properties.
   *
   * @param getBucketObjectPropertiesOptions the {@link GetBucketObjectPropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketObjectProperties}
   */
  public ServiceCall<BucketObjectProperties> getBucketObjectProperties(GetBucketObjectPropertiesOptions getBucketObjectPropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBucketObjectPropertiesOptions,
      "getBucketObjectPropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", getBucketObjectPropertiesOptions.bucketId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/bucket_registrations/{bucket_id}/object_properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getBucketObjectProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBucketObjectPropertiesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getBucketObjectPropertiesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (getBucketObjectPropertiesOptions.paths() != null) {
      contentJson.add("paths", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getBucketObjectPropertiesOptions.paths()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BucketObjectProperties> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketObjectProperties>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_hdfs_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createHdfsStorage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createHdfsStorageOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createHdfsStorageOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("bucket_display_name", createHdfsStorageOptions.bucketDisplayName());
    multipartBuilder.addFormDataPart("bucket_type", createHdfsStorageOptions.bucketType());
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
    if (createHdfsStorageOptions.createdOn() != null) {
      multipartBuilder.addFormDataPart("created_on", createHdfsStorageOptions.createdOn());
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<HdfsStorageRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HdfsStorageRegistration>() { }.getType());
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDatabaseOptions.body()), "application/merge-patch+json");
    ResponseConverter<DatabaseRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get drivers.
   *
   * Get all driver details.
   *
   * @param listDriverRegistrationOptions the {@link ListDriverRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DriverRegistrationCollection}
   */
  public ServiceCall<DriverRegistrationCollection> listDriverRegistration(ListDriverRegistrationOptions listDriverRegistrationOptions) {
    if (listDriverRegistrationOptions == null) {
      listDriverRegistrationOptions = new ListDriverRegistrationOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/driver_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listDriverRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDriverRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listDriverRegistrationOptions.authInstanceId());
    }
    ResponseConverter<DriverRegistrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DriverRegistrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get drivers.
   *
   * Get all driver details.
   *
   * @return a {@link ServiceCall} with a result of type {@link DriverRegistrationCollection}
   */
  public ServiceCall<DriverRegistrationCollection> listDriverRegistration() {
    return listDriverRegistration(null);
  }

  /**
   * Register driver.
   *
   * Register a new driver.
   *
   * @param createDriverRegistrationOptions the {@link CreateDriverRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DriverRegistration}
   */
  public ServiceCall<DriverRegistration> createDriverRegistration(CreateDriverRegistrationOptions createDriverRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDriverRegistrationOptions,
      "createDriverRegistrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/driver_registrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createDriverRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDriverRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDriverRegistrationOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody driverBody = RequestUtils.inputStreamBody(createDriverRegistrationOptions.driver(), createDriverRegistrationOptions.driverContentType());
    multipartBuilder.addFormDataPart("driver", "filename", driverBody);
    multipartBuilder.addFormDataPart("driver_name", createDriverRegistrationOptions.driverName());
    multipartBuilder.addFormDataPart("connection_type", createDriverRegistrationOptions.connectionType());
    if (createDriverRegistrationOptions.version() != null) {
      multipartBuilder.addFormDataPart("version", createDriverRegistrationOptions.version());
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<DriverRegistration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DriverRegistration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete driver.
   *
   * Delete a driver.
   *
   * @param deleteDriverRegistrationOptions the {@link DeleteDriverRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDriverRegistration(DeleteDriverRegistrationOptions deleteDriverRegistrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDriverRegistrationOptions,
      "deleteDriverRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("driver_id", deleteDriverRegistrationOptions.driverId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/driver_registrations/{driver_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteDriverRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDriverRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDriverRegistrationOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Disassociate engines from driver.
   *
   * Disassociate one or more engines from a driver.
   *
   * @param deleteDriverEnginesOptions the {@link DeleteDriverEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDriverEngines(DeleteDriverEnginesOptions deleteDriverEnginesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDriverEnginesOptions,
      "deleteDriverEnginesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("driver_id", deleteDriverEnginesOptions.driverId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/driver_registrations/{driver_id}/engines", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteDriverEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDriverEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDriverEnginesOptions.authInstanceId());
    }
    builder.query("engine_ids", String.valueOf(deleteDriverEnginesOptions.engineIds()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Associate engines to driver.
   *
   * Associate one or more engines to a driver.
   *
   * @param updateDriverEnginesOptions the {@link UpdateDriverEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DriverRegistrationEngine}
   */
  public ServiceCall<DriverRegistrationEngine> updateDriverEngines(UpdateDriverEnginesOptions updateDriverEnginesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDriverEnginesOptions,
      "updateDriverEnginesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("driver_id", updateDriverEnginesOptions.driverId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/driver_registrations/{driver_id}/engines", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateDriverEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDriverEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDriverEnginesOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDriverEnginesOptions.body()), "application/merge-patch+json");
    ResponseConverter<DriverRegistrationEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DriverRegistrationEngine>() { }.getType());
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
   * Get all existing Integrations.
   *
   * Get all existing Integrations.
   *
   * @param listAllIntegrationsOptions the {@link ListAllIntegrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IntegrationCollection}
   */
  public ServiceCall<IntegrationCollection> listAllIntegrations(ListAllIntegrationsOptions listAllIntegrationsOptions) {
    if (listAllIntegrationsOptions == null) {
      listAllIntegrationsOptions = new ListAllIntegrationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listAllIntegrations");
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
    if (listAllIntegrationsOptions.serviceType() != null) {
      builder.query("service_type", String.valueOf(listAllIntegrationsOptions.serviceType()));
    }
    if (listAllIntegrationsOptions.state() != null) {
      builder.query("state", RequestUtils.join(listAllIntegrationsOptions.state(), ","));
    }
    ResponseConverter<IntegrationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IntegrationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all existing Integrations.
   *
   * Get all existing Integrations.
   *
   * @return a {@link ServiceCall} with a result of type {@link IntegrationCollection}
   */
  public ServiceCall<IntegrationCollection> listAllIntegrations() {
    return listAllIntegrations(null);
  }

  /**
   * To register an integration.
   *
   * To register an integration.
   *
   * @param createIntegrationOptions the {@link CreateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> createIntegration(CreateIntegrationOptions createIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIntegrationOptions,
      "createIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createIntegration");
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
    if (createIntegrationOptions.resource() != null) {
      contentJson.addProperty("resource", createIntegrationOptions.resource());
    }
    if (createIntegrationOptions.serviceType() != null) {
      contentJson.addProperty("service_type", createIntegrationOptions.serviceType());
    }
    if (createIntegrationOptions.storageCatalogs() != null) {
      contentJson.add("storage_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIntegrationOptions.storageCatalogs()));
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
   * To register an integration.
   *
   * To register an integration.
   *
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> createIntegration() {
    return createIntegration(null);
  }

  /**
   * Get an Integration.
   *
   * Get an Integration.
   *
   * @param getIntegrationsOptions the {@link GetIntegrationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> getIntegrations(GetIntegrationsOptions getIntegrationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIntegrationsOptions,
      "getIntegrationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("integration_id", getIntegrationsOptions.integrationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/integrations/{integration_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getIntegrations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getIntegrationsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getIntegrationsOptions.authInstanceId());
    }
    if (getIntegrationsOptions.secret() != null) {
      builder.header("Secret", getIntegrationsOptions.secret());
    }
    ResponseConverter<Integration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Integration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove an Integration.
   *
   * Remove an Integration.
   *
   * @param deleteIntegrationOptions the {@link DeleteIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteIntegration(DeleteIntegrationOptions deleteIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIntegrationOptions,
      "deleteIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("integration_id", deleteIntegrationOptions.integrationId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/integrations/{integration_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteIntegration");
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
   * Update an existing Integration.
   *
   * Update an existing Integration.
   *
   * @param updateIntegrationOptions the {@link UpdateIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Integration}
   */
  public ServiceCall<Integration> updateIntegration(UpdateIntegrationOptions updateIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateIntegrationOptions,
      "updateIntegrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("integration_id", updateIntegrationOptions.integrationId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/integrations/{integration_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateIntegrationOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateIntegrationOptions.integrationPatch()), "application/merge-patch+json");
    ResponseConverter<Integration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Integration>() { }.getType());
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateDb2EngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<Db2Engine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Db2Engine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateNetezzaEngineOptions.body()), "application/merge-patch+json");
    ResponseConverter<NetezzaEngine> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NetezzaEngine>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Execute a query.
   *
   * Execute a query.
   *
   * @param createExecuteQueryOptions the {@link CreateExecuteQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExecuteQueryCreatedBody}
   */
  public ServiceCall<ExecuteQueryCreatedBody> createExecuteQuery(CreateExecuteQueryOptions createExecuteQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createExecuteQueryOptions,
      "createExecuteQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createExecuteQueryOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/queries/execute/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createExecuteQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createExecuteQueryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createExecuteQueryOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("sql_string", createExecuteQueryOptions.sqlString());
    if (createExecuteQueryOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", createExecuteQueryOptions.catalogName());
    }
    if (createExecuteQueryOptions.schemaName() != null) {
      contentJson.addProperty("schema_name", createExecuteQueryOptions.schemaName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExecuteQueryCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExecuteQueryCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all instance details.
   *
   * Get all engine details.
   *
   * @param listInstanceDetailsOptions the {@link ListInstanceDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WatsonxInstanceDetailsCollection}
   */
  public ServiceCall<WatsonxInstanceDetailsCollection> listInstanceDetails(ListInstanceDetailsOptions listInstanceDetailsOptions) {
    if (listInstanceDetailsOptions == null) {
      listInstanceDetailsOptions = new ListInstanceDetailsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_details"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listInstanceDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInstanceDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listInstanceDetailsOptions.authInstanceId());
    }
    ResponseConverter<WatsonxInstanceDetailsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WatsonxInstanceDetailsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all instance details.
   *
   * Get all engine details.
   *
   * @return a {@link ServiceCall} with a result of type {@link WatsonxInstanceDetailsCollection}
   */
  public ServiceCall<WatsonxInstanceDetailsCollection> listInstanceDetails() {
    return listInstanceDetails(null);
  }

  /**
   * Get engines and services detail.
   *
   * Get engines and services detail.
   *
   * @param listInstanceServiceDetailsOptions the {@link ListInstanceServiceDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnginesServicesDetails}
   */
  public ServiceCall<EnginesServicesDetails> listInstanceServiceDetails(ListInstanceServiceDetailsOptions listInstanceServiceDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceServiceDetailsOptions,
      "listInstanceServiceDetailsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_details/engines_services"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listInstanceServiceDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInstanceServiceDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listInstanceServiceDetailsOptions.authInstanceId());
    }
    builder.query("target", String.valueOf(listInstanceServiceDetailsOptions.target()));
    if (listInstanceServiceDetailsOptions.internalHost() != null) {
      builder.query("internal_host", String.valueOf(listInstanceServiceDetailsOptions.internalHost()));
    }
    ResponseConverter<EnginesServicesDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnginesServicesDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get services details.
   *
   * Get services details for a given engine or service type.
   *
   * @param getServicesDetailsOptions the {@link GetServicesDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServicesDetails}
   */
  public ServiceCall<ServicesDetails> getServicesDetails(GetServicesDetailsOptions getServicesDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getServicesDetailsOptions,
      "getServicesDetailsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_or_service_type", getServicesDetailsOptions.engineOrServiceType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_details/engines_services/{engine_or_service_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getServicesDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getServicesDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getServicesDetailsOptions.authInstanceId());
    }
    builder.query("target", String.valueOf(getServicesDetailsOptions.target()));
    if (getServicesDetailsOptions.internalHost() != null) {
      builder.query("internal_host", String.valueOf(getServicesDetailsOptions.internalHost()));
    }
    ResponseConverter<ServicesDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServicesDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Milvus service detail.
   *
   * Get Milvus service detail.
   *
   * @param getServiceDetailOptions the {@link GetServiceDetailOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConnectionPropertiesDetails}
   */
  public ServiceCall<ConnectionPropertiesDetails> getServiceDetail(GetServiceDetailOptions getServiceDetailOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getServiceDetailOptions,
      "getServiceDetailOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_or_service_type", getServiceDetailOptions.engineOrServiceType());
    pathParamsMap.put("id", getServiceDetailOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_details/engines_services/{engine_or_service_type}/id/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getServiceDetail");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getServiceDetailOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getServiceDetailOptions.authInstanceId());
    }
    builder.query("target", String.valueOf(getServiceDetailOptions.target()));
    if (getServiceDetailOptions.database() != null) {
      builder.query("database", String.valueOf(getServiceDetailOptions.database()));
    }
    if (getServiceDetailOptions.internalHost() != null) {
      builder.query("internal_host", String.valueOf(getServiceDetailOptions.internalHost()));
    }
    ResponseConverter<ConnectionPropertiesDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConnectionPropertiesDetails>() { }.getType());
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
   * @param createPrestissimoEngineCatalogsOptions the {@link CreatePrestissimoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> createPrestissimoEngineCatalogs(CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestissimoEngineCatalogsOptions,
      "createPrestissimoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestissimoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestissimoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestissimoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestissimoEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPrestissimoEngineCatalogsOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", createPrestissimoEngineCatalogsOptions.catalogName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
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
   * @param pausePrestissimoEngineOptions the {@link PausePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> pausePrestissimoEngine(PausePrestissimoEngineOptions pausePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pausePrestissimoEngineOptions,
      "pausePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", pausePrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "pausePrestissimoEngine");
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
   * @param restartPrestissimoEngineOptions the {@link RestartPrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> restartPrestissimoEngine(RestartPrestissimoEngineOptions restartPrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restartPrestissimoEngineOptions,
      "restartPrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", restartPrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "restartPrestissimoEngine");
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
   * Resume a paused prestissimo engine.
   *
   * @param resumePrestissimoEngineOptions the {@link ResumePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> resumePrestissimoEngine(ResumePrestissimoEngineOptions resumePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumePrestissimoEngineOptions,
      "resumePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", resumePrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "resumePrestissimoEngine");
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
   * Scale an existing prestissimo engine.
   *
   * @param scalePrestissimoEngineOptions the {@link ScalePrestissimoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> scalePrestissimoEngine(ScalePrestissimoEngineOptions scalePrestissimoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scalePrestissimoEngineOptions,
      "scalePrestissimoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", scalePrestissimoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "scalePrestissimoEngine");
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updatePrestoEngineOptions.body()), "application/merge-patch+json");
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
   * @param createPrestoEngineCatalogsOptions the {@link CreatePrestoEngineCatalogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> createPrestoEngineCatalogs(CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrestoEngineCatalogsOptions,
      "createPrestoEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createPrestoEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPrestoEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPrestoEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createPrestoEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPrestoEngineCatalogsOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", createPrestoEngineCatalogsOptions.catalogName());
    }
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
   * @param pausePrestoEngineOptions the {@link PausePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEnginePauseCreatedBody}
   */
  public ServiceCall<CreateEnginePauseCreatedBody> pausePrestoEngine(PausePrestoEngineOptions pausePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pausePrestoEngineOptions,
      "pausePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", pausePrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "pausePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (pausePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", pausePrestoEngineOptions.authInstanceId());
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
   * @param restartPrestoEngineOptions the {@link RestartPrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineRestartCreatedBody}
   */
  public ServiceCall<CreateEngineRestartCreatedBody> restartPrestoEngine(RestartPrestoEngineOptions restartPrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restartPrestoEngineOptions,
      "restartPrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", restartPrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/restart", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "restartPrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (restartPrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", restartPrestoEngineOptions.authInstanceId());
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
   * @param resumePrestoEngineOptions the {@link ResumePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineResumeCreatedBody}
   */
  public ServiceCall<CreateEngineResumeCreatedBody> resumePrestoEngine(ResumePrestoEngineOptions resumePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumePrestoEngineOptions,
      "resumePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", resumePrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "resumePrestoEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (resumePrestoEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", resumePrestoEngineOptions.authInstanceId());
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
   * @param scalePrestoEngineOptions the {@link ScalePrestoEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateEngineScaleCreatedBody}
   */
  public ServiceCall<CreateEngineScaleCreatedBody> scalePrestoEngine(ScalePrestoEngineOptions scalePrestoEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scalePrestoEngineOptions,
      "scalePrestoEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", scalePrestoEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "scalePrestoEngine");
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
    ResponseConverter<CreateEngineScaleCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateEngineScaleCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get SAL Integrations.
   *
   * Get SAL Integration.
   *
   * @param getSalIntegrationOptions the {@link GetSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration(GetSalIntegrationOptions getSalIntegrationOptions) {
    if (getSalIntegrationOptions == null) {
      getSalIntegrationOptions = new GetSalIntegrationOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegration");
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
   * Get SAL Integrations.
   *
   * Get SAL Integration.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration() {
    return getSalIntegration(null);
  }

  /**
   * Create sal integration with wxd.
   *
   * Add or create a new sal integration.
   *
   * @param createSalIntegrationOptions the {@link CreateSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> createSalIntegration(CreateSalIntegrationOptions createSalIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationOptions,
      "createSalIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSalIntegration");
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
   * Delete sal-wxd integration.
   *
   * Delete a sal-wxd integration.
   *
   * @param deleteSalIntegrationOptions the {@link DeleteSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalIntegration(DeleteSalIntegrationOptions deleteSalIntegrationOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete sal-wxd integration.
   *
   * Delete a sal-wxd integration.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSalIntegration() {
    return deleteSalIntegration(null);
  }

  /**
   * Update sal-wxd integration.
   *
   * Update sal-wxd integration details.
   *
   * @param updateSalIntegrationOptions the {@link UpdateSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> updateSalIntegration(UpdateSalIntegrationOptions updateSalIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSalIntegrationOptions,
      "updateSalIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateSalIntegration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateSalIntegrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateSalIntegrationOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSalIntegrationOptions.body()), "application/merge-patch+json");
    ResponseConverter<SalIntegration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Trigger enrichment jobs on schemas and tables.
   *
   * Trigger enrichment jobs on schemas and tables.
   *
   * @param createSalIntegrationEnrichmentOptions the {@link CreateSalIntegrationEnrichmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationEnrichmentOptions,
      "createSalIntegrationEnrichmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSalIntegrationEnrichment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (createSalIntegrationEnrichmentOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationEnrichmentOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createSalIntegrationEnrichmentOptions.enrichmentPrototype() != null) {
      contentJson.add("enrichment_prototype", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentOptions.enrichmentPrototype()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Trigger enrichment jobs on schemas and tables.
   *
   * Trigger enrichment jobs on schemas and tables.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment() {
    return createSalIntegrationEnrichment(null);
  }

  /**
   * Get semantic enrichment assets associated with the schema.
   *
   * Get semantic enrichment job runs associated with the schema.
   *
   * @param getSalIntegrationEnrichmentAssetsOptions the {@link GetSalIntegrationEnrichmentAssetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentAssets}
   */
  public ServiceCall<SalIntegrationEnrichmentAssets> getSalIntegrationEnrichmentAssets(GetSalIntegrationEnrichmentAssetsOptions getSalIntegrationEnrichmentAssetsOptions) {
    if (getSalIntegrationEnrichmentAssetsOptions == null) {
      getSalIntegrationEnrichmentAssetsOptions = new GetSalIntegrationEnrichmentAssetsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment_assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentAssets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentAssetsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentAssetsOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentAssetsOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentAssetsOptions.projectId()));
    }
    ResponseConverter<SalIntegrationEnrichmentAssets> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentAssets>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment assets associated with the schema.
   *
   * Get semantic enrichment job runs associated with the schema.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentAssets}
   */
  public ServiceCall<SalIntegrationEnrichmentAssets> getSalIntegrationEnrichmentAssets() {
    return getSalIntegrationEnrichmentAssets(null);
  }

  /**
   * Get semantic enrichment data asset associated with the table.
   *
   * Get semantic enrichment data asset associated with the table.
   *
   * @param getSalIntegrationEnrichmentDataAssetOptions the {@link GetSalIntegrationEnrichmentDataAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentDataAsset}
   */
  public ServiceCall<SalIntegrationEnrichmentDataAsset> getSalIntegrationEnrichmentDataAsset(GetSalIntegrationEnrichmentDataAssetOptions getSalIntegrationEnrichmentDataAssetOptions) {
    if (getSalIntegrationEnrichmentDataAssetOptions == null) {
      getSalIntegrationEnrichmentDataAssetOptions = new GetSalIntegrationEnrichmentDataAssetOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment_data_asset"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentDataAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentDataAssetOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentDataAssetOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentDataAssetOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentDataAssetOptions.projectId()));
    }
    if (getSalIntegrationEnrichmentDataAssetOptions.assetId() != null) {
      builder.query("asset_id", String.valueOf(getSalIntegrationEnrichmentDataAssetOptions.assetId()));
    }
    ResponseConverter<SalIntegrationEnrichmentDataAsset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentDataAsset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment data asset associated with the table.
   *
   * Get semantic enrichment data asset associated with the table.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentDataAsset}
   */
  public ServiceCall<SalIntegrationEnrichmentDataAsset> getSalIntegrationEnrichmentDataAsset() {
    return getSalIntegrationEnrichmentDataAsset(null);
  }

  /**
   * Get semantic enrichment job run logs associated with the job run.
   *
   * Get semantic enrichment job run logs associated with the job run.
   *
   * @param getSalIntegrationEnrichmentJobRunLogsOptions the {@link GetSalIntegrationEnrichmentJobRunLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobRunLogs}
   */
  public ServiceCall<SalIntegrationEnrichmentJobRunLogs> getSalIntegrationEnrichmentJobRunLogs(GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptions) {
    if (getSalIntegrationEnrichmentJobRunLogsOptions == null) {
      getSalIntegrationEnrichmentJobRunLogsOptions = new GetSalIntegrationEnrichmentJobRunLogsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment_job_run_logs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentJobRunLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentJobRunLogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentJobRunLogsOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentJobRunLogsOptions.jobId() != null) {
      builder.query("job_id", String.valueOf(getSalIntegrationEnrichmentJobRunLogsOptions.jobId()));
    }
    if (getSalIntegrationEnrichmentJobRunLogsOptions.jobRunId() != null) {
      builder.query("job_run_id", String.valueOf(getSalIntegrationEnrichmentJobRunLogsOptions.jobRunId()));
    }
    if (getSalIntegrationEnrichmentJobRunLogsOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentJobRunLogsOptions.projectId()));
    }
    ResponseConverter<SalIntegrationEnrichmentJobRunLogs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentJobRunLogs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment job run logs associated with the job run.
   *
   * Get semantic enrichment job run logs associated with the job run.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobRunLogs}
   */
  public ServiceCall<SalIntegrationEnrichmentJobRunLogs> getSalIntegrationEnrichmentJobRunLogs() {
    return getSalIntegrationEnrichmentJobRunLogs(null);
  }

  /**
   * Get semantic enrichment job runs associated with the schema.
   *
   * Get semantic enrichment job runs associated with the schema.
   *
   * @param getSalIntegrationEnrichmentJobRunsOptions the {@link GetSalIntegrationEnrichmentJobRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobRun}
   */
  public ServiceCall<SalIntegrationEnrichmentJobRun> getSalIntegrationEnrichmentJobRuns(GetSalIntegrationEnrichmentJobRunsOptions getSalIntegrationEnrichmentJobRunsOptions) {
    if (getSalIntegrationEnrichmentJobRunsOptions == null) {
      getSalIntegrationEnrichmentJobRunsOptions = new GetSalIntegrationEnrichmentJobRunsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment_job_runs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentJobRuns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentJobRunsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentJobRunsOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentJobRunsOptions.jobId() != null) {
      builder.query("job_id", String.valueOf(getSalIntegrationEnrichmentJobRunsOptions.jobId()));
    }
    if (getSalIntegrationEnrichmentJobRunsOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentJobRunsOptions.projectId()));
    }
    ResponseConverter<SalIntegrationEnrichmentJobRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentJobRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment job runs associated with the schema.
   *
   * Get semantic enrichment job runs associated with the schema.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobRun}
   */
  public ServiceCall<SalIntegrationEnrichmentJobRun> getSalIntegrationEnrichmentJobRuns() {
    return getSalIntegrationEnrichmentJobRuns(null);
  }

  /**
   * Get semantic enrichment jobs associated with the schema.
   *
   * Get semantic enrichment jobs associated with the schema.
   *
   * @param getSalIntegrationEnrichmentJobsOptions the {@link GetSalIntegrationEnrichmentJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobs}
   */
  public ServiceCall<SalIntegrationEnrichmentJobs> getSalIntegrationEnrichmentJobs(GetSalIntegrationEnrichmentJobsOptions getSalIntegrationEnrichmentJobsOptions) {
    if (getSalIntegrationEnrichmentJobsOptions == null) {
      getSalIntegrationEnrichmentJobsOptions = new GetSalIntegrationEnrichmentJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/enrichment_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentJobsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentJobsOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentJobsOptions.wkcProjectId() != null) {
      builder.query("wkc_project_id", String.valueOf(getSalIntegrationEnrichmentJobsOptions.wkcProjectId()));
    }
    ResponseConverter<SalIntegrationEnrichmentJobs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentJobs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment jobs associated with the schema.
   *
   * Get semantic enrichment jobs associated with the schema.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentJobs}
   */
  public ServiceCall<SalIntegrationEnrichmentJobs> getSalIntegrationEnrichmentJobs() {
    return getSalIntegrationEnrichmentJobs(null);
  }

  /**
   * Get list of uploaded glossary terms.
   *
   * Get list of uploaded glossary terms.
   *
   * @param getSalIntegrationGlossaryTermsOptions the {@link GetSalIntegrationGlossaryTermsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationGlossaryTerms}
   */
  public ServiceCall<SalIntegrationGlossaryTerms> getSalIntegrationGlossaryTerms(GetSalIntegrationGlossaryTermsOptions getSalIntegrationGlossaryTermsOptions) {
    if (getSalIntegrationGlossaryTermsOptions == null) {
      getSalIntegrationGlossaryTermsOptions = new GetSalIntegrationGlossaryTermsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/glossary_terms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationGlossaryTerms");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationGlossaryTermsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationGlossaryTermsOptions.authInstanceId());
    }
    ResponseConverter<SalIntegrationGlossaryTerms> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationGlossaryTerms>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get list of uploaded glossary terms.
   *
   * Get list of uploaded glossary terms.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationGlossaryTerms}
   */
  public ServiceCall<SalIntegrationGlossaryTerms> getSalIntegrationGlossaryTerms() {
    return getSalIntegrationGlossaryTerms(null);
  }

  /**
   * Get wkc catalog and project mapped to the schema.
   *
   * Get wkc catalog and project mapped to the schema.
   *
   * @param getSalIntegrationMappingsOptions the {@link GetSalIntegrationMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationMappings}
   */
  public ServiceCall<SalIntegrationMappings> getSalIntegrationMappings(GetSalIntegrationMappingsOptions getSalIntegrationMappingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationMappingsOptions,
      "getSalIntegrationMappingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationMappingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationMappingsOptions.authInstanceId());
    }
    builder.query("catalog_name", String.valueOf(getSalIntegrationMappingsOptions.catalogName()));
    builder.query("schema_name", String.valueOf(getSalIntegrationMappingsOptions.schemaName()));
    ResponseConverter<SalIntegrationMappings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationMappings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get metadata enrichment global settings.
   *
   * Get metadata enrichment global settings.
   *
   * @param getSalIntegrationEnrichmentGlobalSettingsOptions the {@link GetSalIntegrationEnrichmentGlobalSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> getSalIntegrationEnrichmentGlobalSettings(GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptions) {
    if (getSalIntegrationEnrichmentGlobalSettingsOptions == null) {
      getSalIntegrationEnrichmentGlobalSettingsOptions = new GetSalIntegrationEnrichmentGlobalSettingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/metadata_enrichment_global_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentGlobalSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId());
    }
    ResponseConverter<SalIntegrationEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get metadata enrichment global settings.
   *
   * Get metadata enrichment global settings.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> getSalIntegrationEnrichmentGlobalSettings() {
    return getSalIntegrationEnrichmentGlobalSettings(null);
  }

  /**
   * Add metadata enrichment global settings.
   *
   * Add metadata enrichment global settings.
   *
   * @param createSalIntegrationEnrichmentGlobalSettingsOptions the {@link CreateSalIntegrationEnrichmentGlobalSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> createSalIntegrationEnrichmentGlobalSettings(CreateSalIntegrationEnrichmentGlobalSettingsOptions createSalIntegrationEnrichmentGlobalSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationEnrichmentGlobalSettingsOptions,
      "createSalIntegrationEnrichmentGlobalSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/metadata_enrichment_global_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSalIntegrationEnrichmentGlobalSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createSalIntegrationEnrichmentGlobalSettingsOptions.semanticExpansion() != null) {
      contentJson.add("semantic_expansion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentGlobalSettingsOptions.semanticExpansion()));
    }
    if (createSalIntegrationEnrichmentGlobalSettingsOptions.termAssignment() != null) {
      contentJson.add("term_assignment", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentGlobalSettingsOptions.termAssignment()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SalIntegrationEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add metadata enrichment global settings.
   *
   * Add metadata enrichment global settings.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> createSalIntegrationEnrichmentGlobalSettings() {
    return createSalIntegrationEnrichmentGlobalSettings(null);
  }

  /**
   * get metadata enrichment settings for a project.
   *
   * get metadata enrichment settings for a project.
   *
   * @param getSalIntegrationEnrichmentSettingsOptions the {@link GetSalIntegrationEnrichmentSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> getSalIntegrationEnrichmentSettings(GetSalIntegrationEnrichmentSettingsOptions getSalIntegrationEnrichmentSettingsOptions) {
    if (getSalIntegrationEnrichmentSettingsOptions == null) {
      getSalIntegrationEnrichmentSettingsOptions = new GetSalIntegrationEnrichmentSettingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/metadata_enrichment_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationEnrichmentSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentSettingsOptions.authInstanceId());
    }
    if (getSalIntegrationEnrichmentSettingsOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentSettingsOptions.projectId()));
    }
    ResponseConverter<SalIntegrationEnrichmentSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationEnrichmentSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * get metadata enrichment settings for a project.
   *
   * get metadata enrichment settings for a project.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationEnrichmentSettings}
   */
  public ServiceCall<SalIntegrationEnrichmentSettings> getSalIntegrationEnrichmentSettings() {
    return getSalIntegrationEnrichmentSettings(null);
  }

  /**
   * Add metadata enrichment settings for a project.
   *
   * Add metadata enrichment settings for a project.
   *
   * @param createSalIntegrationEnrichmentSettingsOptions the {@link CreateSalIntegrationEnrichmentSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichmentSettings(CreateSalIntegrationEnrichmentSettingsOptions createSalIntegrationEnrichmentSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationEnrichmentSettingsOptions,
      "createSalIntegrationEnrichmentSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/metadata_enrichment_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSalIntegrationEnrichmentSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (createSalIntegrationEnrichmentSettingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationEnrichmentSettingsOptions.authInstanceId());
    }
    if (createSalIntegrationEnrichmentSettingsOptions.projectId() != null) {
      builder.query("project_id", String.valueOf(createSalIntegrationEnrichmentSettingsOptions.projectId()));
    }
    final JsonObject contentJson = new JsonObject();
    if (createSalIntegrationEnrichmentSettingsOptions.semanticExpansion() != null) {
      contentJson.add("semantic_expansion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentSettingsOptions.semanticExpansion()));
    }
    if (createSalIntegrationEnrichmentSettingsOptions.termAssignment() != null) {
      contentJson.add("term_assignment", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSalIntegrationEnrichmentSettingsOptions.termAssignment()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add metadata enrichment settings for a project.
   *
   * Add metadata enrichment settings for a project.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichmentSettings() {
    return createSalIntegrationEnrichmentSettings(null);
  }

  /**
   * Upload semantic enrichment business terms glossary.
   *
   * Upload semantic enrichment business terms glossary.
   *
   * @param createSalIntegrationUploadGlossaryOptions the {@link CreateSalIntegrationUploadGlossaryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationUploadGlossary}
   */
  public ServiceCall<SalIntegrationUploadGlossary> createSalIntegrationUploadGlossary(CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationUploadGlossaryOptions,
      "createSalIntegrationUploadGlossaryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/upload_glossary"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSalIntegrationUploadGlossary");
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
    ResponseConverter<SalIntegrationUploadGlossary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationUploadGlossary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get status of upload glossary job.
   *
   * Get status of upload glossary job.
   *
   * @param getSalIntegrationUploadGlossaryStatusOptions the {@link GetSalIntegrationUploadGlossaryStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationUploadGlossaryStatus}
   */
  public ServiceCall<SalIntegrationUploadGlossaryStatus> getSalIntegrationUploadGlossaryStatus(GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptions) {
    if (getSalIntegrationUploadGlossaryStatusOptions == null) {
      getSalIntegrationUploadGlossaryStatusOptions = new GetSalIntegrationUploadGlossaryStatusOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integrations/upload_glossary_status"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSalIntegrationUploadGlossaryStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationUploadGlossaryStatusOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationUploadGlossaryStatusOptions.authInstanceId());
    }
    if (getSalIntegrationUploadGlossaryStatusOptions.processId() != null) {
      builder.query("process_id", String.valueOf(getSalIntegrationUploadGlossaryStatusOptions.processId()));
    }
    ResponseConverter<SalIntegrationUploadGlossaryStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationUploadGlossaryStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get status of upload glossary job.
   *
   * Get status of upload glossary job.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationUploadGlossaryStatus}
   */
  public ServiceCall<SalIntegrationUploadGlossaryStatus> getSalIntegrationUploadGlossaryStatus() {
    return getSalIntegrationUploadGlossaryStatus(null);
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
    if (createSparkEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.associatedCatalogs()));
    }
    if (createSparkEngineOptions.description() != null) {
      contentJson.addProperty("description", createSparkEngineOptions.description());
    }
    if (createSparkEngineOptions.engineDetails() != null) {
      contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineOptions.engineDetails()));
    }
    if (createSparkEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createSparkEngineOptions.engineDisplayName());
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
    pathParamsMap.put("engine_id", getSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSparkEngine");
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSparkEngineOptions.body()), "application/merge-patch+json");
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
    if (listSparkEngineApplicationsOptions.state() != null) {
      builder.query("state", RequestUtils.join(listSparkEngineApplicationsOptions.state(), ","));
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
    if (createSparkEngineApplicationOptions.state() != null) {
      builder.query("state", RequestUtils.join(createSparkEngineApplicationOptions.state(), ","));
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
    if (createSparkEngineApplicationOptions.volumes() != null) {
      contentJson.add("volumes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineApplicationOptions.volumes()));
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
    if (deleteSparkEngineApplicationsOptions.state() != null) {
      builder.query("state", RequestUtils.join(deleteSparkEngineApplicationsOptions.state(), ","));
    }
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
    pathParamsMap.put("engine_id", listSparkEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listSparkEngineCatalogs");
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
   * @return a {@link ServiceCall} with a result of type {@link Catalog}
   */
  public ServiceCall<Catalog> createSparkEngineCatalogs(CreateSparkEngineCatalogsOptions createSparkEngineCatalogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineCatalogsOptions,
      "createSparkEngineCatalogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", createSparkEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createSparkEngineCatalogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineCatalogsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineCatalogsOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createSparkEngineCatalogsOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", createSparkEngineCatalogsOptions.catalogName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Catalog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Catalog>() { }.getType());
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
    pathParamsMap.put("engine_id", deleteSparkEngineCatalogsOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSparkEngineCatalogs");
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
    pathParamsMap.put("catalog_id", getSparkEngineCatalogOptions.catalogId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/catalogs/{catalog_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSparkEngineCatalog");
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
   * Get spark history server.
   *
   * Get spark history server.
   *
   * @param getSparkEngineHistoryServerOptions the {@link GetSparkEngineHistoryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkHistoryServer}
   */
  public ServiceCall<SparkHistoryServer> getSparkEngineHistoryServer(GetSparkEngineHistoryServerOptions getSparkEngineHistoryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineHistoryServerOptions,
      "getSparkEngineHistoryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineHistoryServerOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSparkEngineHistoryServer");
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
    pathParamsMap.put("engine_id", startSparkEngineHistoryServerOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "startSparkEngineHistoryServer");
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
    pathParamsMap.put("engine_id", deleteSparkEngineHistoryServerOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/history_server", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteSparkEngineHistoryServer");
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
   * Pause engine.
   *
   * Pause engine.
   *
   * @param pauseSparkEngineOptions the {@link PauseSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> pauseSparkEngine(PauseSparkEngineOptions pauseSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pauseSparkEngineOptions,
      "pauseSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", pauseSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "pauseSparkEngine");
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
   * Resume engine.
   *
   * Resume engine.
   *
   * @param resumeSparkEngineOptions the {@link ResumeSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> resumeSparkEngine(ResumeSparkEngineOptions resumeSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumeSparkEngineOptions,
      "resumeSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", resumeSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "resumeSparkEngine");
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
   * Scale Spark engine.
   *
   * Scale Saprk engine.
   *
   * @param scaleSparkEngineOptions the {@link ScaleSparkEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> scaleSparkEngine(ScaleSparkEngineOptions scaleSparkEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(scaleSparkEngineOptions,
      "scaleSparkEngineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", scaleSparkEngineOptions.engineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "scaleSparkEngine");
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
   * List spark version.
   *
   * List spark version.
   *
   * @param listSparkVersionsOptions the {@link ListSparkVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListSparkVersionsOKBody}
   */
  public ServiceCall<ListSparkVersionsOKBody> listSparkVersions(ListSparkVersionsOptions listSparkVersionsOptions) {
    if (listSparkVersionsOptions == null) {
      listSparkVersionsOptions = new ListSparkVersionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listSparkVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkVersionsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkVersionsOptions.authInstanceId());
    }
    ResponseConverter<ListSparkVersionsOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSparkVersionsOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List spark version.
   *
   * List spark version.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListSparkVersionsOKBody}
   */
  public ServiceCall<ListSparkVersionsOKBody> listSparkVersions() {
    return listSparkVersions(null);
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
    if (createSchemaOptions.hostname() != null) {
      contentJson.addProperty("hostname", createSchemaOptions.hostname());
    }
    if (createSchemaOptions.port() != null) {
      contentJson.addProperty("port", createSchemaOptions.port());
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateColumnOptions.body()), "application/merge-patch+json");
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
   * Rollback table to snapshot.
   *
   * Rollback table to a snapshot.
   *
   * @param rollbackTableOptions the {@link RollbackTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReplaceSnapshotCreatedBody}
   */
  public ServiceCall<ReplaceSnapshotCreatedBody> rollbackTable(RollbackTableOptions rollbackTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(rollbackTableOptions,
      "rollbackTableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_id", rollbackTableOptions.catalogId());
    pathParamsMap.put("schema_id", rollbackTableOptions.schemaId());
    pathParamsMap.put("table_id", rollbackTableOptions.tableId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/rollback", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "rollbackTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (rollbackTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", rollbackTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(rollbackTableOptions.engineId()));
    final JsonObject contentJson = new JsonObject();
    if (rollbackTableOptions.snapshotId() != null) {
      contentJson.addProperty("snapshot_id", rollbackTableOptions.snapshotId());
    }
    builder.bodyJson(contentJson);
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateSyncCatalogOptions.body()), "application/merge-patch+json");
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
    contentJson.addProperty("bucket_name", createMilvusServiceOptions.bucketName());
    contentJson.addProperty("origin", createMilvusServiceOptions.origin());
    contentJson.addProperty("root_path", createMilvusServiceOptions.rootPath());
    contentJson.addProperty("service_display_name", createMilvusServiceOptions.serviceDisplayName());
    if (createMilvusServiceOptions.bucketType() != null) {
      contentJson.addProperty("bucket_type", createMilvusServiceOptions.bucketType());
    }
    if (createMilvusServiceOptions.description() != null) {
      contentJson.addProperty("description", createMilvusServiceOptions.description());
    }
    if (createMilvusServiceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMilvusServiceOptions.tags()));
    }
    if (createMilvusServiceOptions.tshirtSize() != null) {
      contentJson.addProperty("tshirt_size", createMilvusServiceOptions.tshirtSize());
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateMilvusServiceOptions.body()), "application/merge-patch+json");
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update milvus service bucket.
   *
   * Update details of milvus service bucket. Note that the improper use of the API could result in potential data loss.
   *
   * @param updateMilvusServiceBucketOptions the {@link UpdateMilvusServiceBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusService}
   */
  public ServiceCall<MilvusService> updateMilvusServiceBucket(UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMilvusServiceBucketOptions,
      "updateMilvusServiceBucketOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("service_id", updateMilvusServiceBucketOptions.serviceId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/bucket", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "updateMilvusServiceBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMilvusServiceBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMilvusServiceBucketOptions.authInstanceId());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateMilvusServiceBucketOptions.body()), "application/merge-patch+json");
    ResponseConverter<MilvusService> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusService>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/databases", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listMilvusServiceDatabases");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/databases/{database_id}/collections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listMilvusDatabaseCollections");
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
    pathParamsMap.put("service_id", createMilvusServicePauseOptions.serviceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createMilvusServicePause");
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
    pathParamsMap.put("service_id", createMilvusServiceResumeOptions.serviceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createMilvusServiceResume");
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
    pathParamsMap.put("service_id", createMilvusServiceScaleOptions.serviceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/scale", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createMilvusServiceScale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceScaleOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceScaleOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createMilvusServiceScaleOptions.tshirtSize() != null) {
      contentJson.addProperty("tshirt_size", createMilvusServiceScaleOptions.tshirtSize());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get ingestion jobs.
   *
   * Get list of ingestion jobs.
   *
   * @param listIngestionJobsOptions the {@link ListIngestionJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJobCollection}
   */
  public ServiceCall<IngestionJobCollection> listIngestionJobs(ListIngestionJobsOptions listIngestionJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listIngestionJobsOptions,
      "listIngestionJobsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ingestion_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listIngestionJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", listIngestionJobsOptions.authInstanceId());
    if (listIngestionJobsOptions.start() != null) {
      builder.query("start", String.valueOf(listIngestionJobsOptions.start()));
    }
    if (listIngestionJobsOptions.jobsPerPage() != null) {
      builder.query("jobs_per_page", String.valueOf(listIngestionJobsOptions.jobsPerPage()));
    }
    ResponseConverter<IngestionJobCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJobCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an ingestion job.
   *
   * Create an ingestion job.
   *
   * @param createIngestionJobsOptions the {@link CreateIngestionJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJob}
   */
  public ServiceCall<IngestionJob> createIngestionJobs(CreateIngestionJobsOptions createIngestionJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIngestionJobsOptions,
      "createIngestionJobsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ingestion_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createIngestionJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", createIngestionJobsOptions.authInstanceId());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("job_id", createIngestionJobsOptions.jobId());
    contentJson.addProperty("source_data_files", createIngestionJobsOptions.sourceDataFiles());
    contentJson.addProperty("target_table", createIngestionJobsOptions.targetTable());
    contentJson.addProperty("username", createIngestionJobsOptions.username());
    if (createIngestionJobsOptions.createIfNotExist() != null) {
      contentJson.addProperty("create_if_not_exist", createIngestionJobsOptions.createIfNotExist());
    }
    if (createIngestionJobsOptions.csvProperty() != null) {
      contentJson.add("csv_property", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobsOptions.csvProperty()));
    }
    if (createIngestionJobsOptions.engineId() != null) {
      contentJson.addProperty("engine_id", createIngestionJobsOptions.engineId());
    }
    if (createIngestionJobsOptions.executeConfig() != null) {
      contentJson.add("execute_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createIngestionJobsOptions.executeConfig()));
    }
    if (createIngestionJobsOptions.partitionBy() != null) {
      contentJson.addProperty("partition_by", createIngestionJobsOptions.partitionBy());
    }
    if (createIngestionJobsOptions.schema() != null) {
      contentJson.addProperty("schema", createIngestionJobsOptions.schema());
    }
    if (createIngestionJobsOptions.sourceFileType() != null) {
      contentJson.addProperty("source_file_type", createIngestionJobsOptions.sourceFileType());
    }
    if (createIngestionJobsOptions.validateCsvHeader() != null) {
      contentJson.addProperty("validate_csv_header", createIngestionJobsOptions.validateCsvHeader());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<IngestionJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an ingestion job for user local files.
   *
   * Create an ingestion job for user local files.
   *
   * @param createIngestionJobsLocalFilesOptions the {@link CreateIngestionJobsLocalFilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJob}
   */
  public ServiceCall<IngestionJob> createIngestionJobsLocalFiles(CreateIngestionJobsLocalFilesOptions createIngestionJobsLocalFilesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createIngestionJobsLocalFilesOptions,
      "createIngestionJobsLocalFilesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ingestion_jobs_local_files"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createIngestionJobsLocalFiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", createIngestionJobsLocalFilesOptions.authInstanceId());
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody sourceDataFileBody = RequestUtils.inputStreamBody(createIngestionJobsLocalFilesOptions.sourceDataFile(), createIngestionJobsLocalFilesOptions.sourceDataFileContentType());
    multipartBuilder.addFormDataPart("source_data_file", "filename", sourceDataFileBody);
    multipartBuilder.addFormDataPart("target_table", createIngestionJobsLocalFilesOptions.targetTable());
    multipartBuilder.addFormDataPart("job_id", createIngestionJobsLocalFilesOptions.jobId());
    multipartBuilder.addFormDataPart("username", createIngestionJobsLocalFilesOptions.username());
    if (createIngestionJobsLocalFilesOptions.sourceFileType() != null) {
      multipartBuilder.addFormDataPart("source_file_type", createIngestionJobsLocalFilesOptions.sourceFileType());
    }
    if (createIngestionJobsLocalFilesOptions.csvProperty() != null) {
      multipartBuilder.addFormDataPart("csv_property", createIngestionJobsLocalFilesOptions.csvProperty());
    }
    if (createIngestionJobsLocalFilesOptions.createIfNotExist() != null) {
      multipartBuilder.addFormDataPart("create_if_not_exist", String.valueOf(createIngestionJobsLocalFilesOptions.createIfNotExist()));
    }
    if (createIngestionJobsLocalFilesOptions.validateCsvHeader() != null) {
      multipartBuilder.addFormDataPart("validate_csv_header", String.valueOf(createIngestionJobsLocalFilesOptions.validateCsvHeader()));
    }
    if (createIngestionJobsLocalFilesOptions.executeConfig() != null) {
      multipartBuilder.addFormDataPart("execute_config", createIngestionJobsLocalFilesOptions.executeConfig());
    }
    if (createIngestionJobsLocalFilesOptions.engineId() != null) {
      multipartBuilder.addFormDataPart("engine_id", createIngestionJobsLocalFilesOptions.engineId());
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<IngestionJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IngestionJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get ingestion job.
   *
   * Get a submitted ingestion job.
   *
   * @param getIngestionJobOptions the {@link GetIngestionJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IngestionJob}
   */
  public ServiceCall<IngestionJob> getIngestionJob(GetIngestionJobOptions getIngestionJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIngestionJobOptions,
      "getIngestionJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getIngestionJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ingestion_jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getIngestionJob");
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
   * Delete an ingestion job.
   *
   * Delete an ingestion job.
   *
   * @param deleteIngestionJobsOptions the {@link DeleteIngestionJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteIngestionJobs(DeleteIngestionJobsOptions deleteIngestionJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIngestionJobsOptions,
      "deleteIngestionJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", deleteIngestionJobsOptions.jobId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ingestion_jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "deleteIngestionJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("AuthInstanceId", deleteIngestionJobsOptions.authInstanceId());
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generate a preview of source file(s).
   *
   * Generate a preview of source file(s).
   *
   * @param createPreviewIngestionFileOptions the {@link CreatePreviewIngestionFileOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PreviewIngestionFile}
   */
  public ServiceCall<PreviewIngestionFile> createPreviewIngestionFile(CreatePreviewIngestionFileOptions createPreviewIngestionFileOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPreviewIngestionFileOptions,
      "createPreviewIngestionFileOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/preview_ingestion_file"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "createPreviewIngestionFile");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("AuthInstanceId", createPreviewIngestionFileOptions.authInstanceId());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("source_data_files", createPreviewIngestionFileOptions.sourceDataFiles());
    if (createPreviewIngestionFileOptions.csvProperty() != null) {
      contentJson.add("csv_property", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPreviewIngestionFileOptions.csvProperty()));
    }
    if (createPreviewIngestionFileOptions.sourceFileType() != null) {
      contentJson.addProperty("source_file_type", createPreviewIngestionFileOptions.sourceFileType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PreviewIngestionFile> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PreviewIngestionFile>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get CPG and DAS endpoints.
   *
   * Get Common policy gateway (CPG) and  Data Access Service(DAS) endpoints.
   *
   * @param getEndpointsOptions the {@link GetEndpointsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EndpointCollection}
   */
  public ServiceCall<EndpointCollection> getEndpoints(GetEndpointsOptions getEndpointsOptions) {
    if (getEndpointsOptions == null) {
      getEndpointsOptions = new GetEndpointsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/endpoints"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getEndpoints");
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
   * Get CPG and DAS endpoints.
   *
   * Get Common policy gateway (CPG) and  Data Access Service(DAS) endpoints.
   *
   * @return a {@link ServiceCall} with a result of type {@link EndpointCollection}
   */
  public ServiceCall<EndpointCollection> getEndpoints() {
    return getEndpoints(null);
  }

  /**
   * Register table.
   *
   * Register table.
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "registerTable");
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
   * Load table metadata.
   *
   * Load table metadata.
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "loadTable");
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
   * Get all columns.
   *
   * Get all columns.
   *
   * @param getAllColumnsOptions the {@link GetAllColumnsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ColumnsResponse}
   */
  public ServiceCall<ColumnsResponse> getAllColumns(GetAllColumnsOptions getAllColumnsOptions) {
    if (getAllColumnsOptions == null) {
      getAllColumnsOptions = new GetAllColumnsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/columns"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getAllColumns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAllColumnsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getAllColumnsOptions.authInstanceId());
    }
    if (getAllColumnsOptions.tableName() != null) {
      builder.query("table_name", String.valueOf(getAllColumnsOptions.tableName()));
    }
    if (getAllColumnsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(getAllColumnsOptions.catalogName()));
    }
    if (getAllColumnsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(getAllColumnsOptions.schemaName()));
    }
    ResponseConverter<ColumnsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ColumnsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all columns.
   *
   * Get all columns.
   *
   * @return a {@link ServiceCall} with a result of type {@link ColumnsResponse}
   */
  public ServiceCall<ColumnsResponse> getAllColumns() {
    return getAllColumns(null);
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listAllSchemas");
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
   * Get schema details.
   *
   * Get schema details.
   *
   * @param getSchemaDetailsOptions the {@link GetSchemaDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchemaResponse}
   */
  public ServiceCall<SchemaResponse> getSchemaDetails(GetSchemaDetailsOptions getSchemaDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchemaDetailsOptions,
      "getSchemaDetailsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("schema_name", getSchemaDetailsOptions.schemaName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/schemas/{schema_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getSchemaDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchemaDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSchemaDetailsOptions.authInstanceId());
    }
    if (getSchemaDetailsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(getSchemaDetailsOptions.catalogName()));
    }
    ResponseConverter<SchemaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchemaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    if (listAllTablesOptions == null) {
      listAllTablesOptions = new ListAllTablesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "listAllTables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllTablesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listAllTablesOptions.authInstanceId());
    }
    if (listAllTablesOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listAllTablesOptions.catalogName()));
    }
    if (listAllTablesOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(listAllTablesOptions.schemaName()));
    }
    ResponseConverter<TableResponseCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableResponseCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all tables.
   *
   * Get all tables.
   *
   * @return a {@link ServiceCall} with a result of type {@link TableResponseCollection}
   */
  public ServiceCall<TableResponseCollection> listAllTables() {
    return listAllTables(null);
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v2", "getTableDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTableDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTableDetailsOptions.authInstanceId());
    }
    if (getTableDetailsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(getTableDetailsOptions.catalogName()));
    }
    if (getTableDetailsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(getTableDetailsOptions.schemaName()));
    }
    ResponseConverter<TableResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TableResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
