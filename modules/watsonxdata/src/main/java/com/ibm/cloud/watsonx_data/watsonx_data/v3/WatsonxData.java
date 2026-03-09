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

package com.ibm.cloud.watsonx_data.watsonx_data.v3;

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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.AddStorageCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociation;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateColumnsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateHdfsStorageOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceBillingOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServicePauseOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceResumeOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceScaleOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreatePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreatePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSalIntegrationEnrichmentOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSalIntegrationGlossaryUploadProcessesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSalIntegrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSchemaOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineQueryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateStorageRegistrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabasePropertiesCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2Engine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2EngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteColumnOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteMilvusServiceOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSalIntegrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSalMetadataOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSemanticSearchQueriesByIdOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSparkEngineApplicationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteSparkEngineQueryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteStorageRegistrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DeleteTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetAllColumnsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetDatabaseOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetDatabasePropertiesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetInstanceConfigurationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetInstanceConfigurationResourceOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetMaskedColumnsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetMilvusServiceOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetPrestissimoEngineCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationEnrichmentDataAssetsByIdOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationEnrichmentJobRunLogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationGlossaryTermsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationGlossaryUploadProcessesStatusOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSalIntegrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSchemaDetailsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineApplicationUiOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineHistoryServerUiOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetSparkEngineQueryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetStorageObjectPropertiesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetStorageRegistrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetTableDetailsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GetTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListAllSchemasOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListAllTablesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListColumnsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListInstanceConfigurationResourcesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListMilvusDatabaseCollectionsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListMilvusDatabasePartitionsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListMilvusServiceDatabasesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListMilvusServicesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListNetezzaEnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListOtherEnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSalIntegrationEnrichmentDataAssetsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSalIntegrationEnrichmentJobRunsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSalIntegrationEnrichmentJobsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSalIntegrationMappingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSchemasOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSemanticSearchQueriesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSparkEngineQueryServersOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListStorageRegistrationsObjectsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListStorageRegistrationsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ListTablesOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.LoadTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.LoadTableResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MaskedColumnCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusBillingSuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDatabaseCollections;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDatabasePartitions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusService;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngineSuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoQueryExplain;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetailsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RestartPrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RestartPrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResumePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResumePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResumeSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RollbackTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RunPrestissimoExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RunPrestissimoExplainStatementOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobRunLogs;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobRuns;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobs;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettings;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryTerms;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryUploadProcess;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryUploadStatus;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegrationMappings;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaResponseCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearchList;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationSummary;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetailsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkHistoryServer;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageObjectProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationObjectCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SuccessResponsePrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableResponseCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableSnapshotCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TestDatabaseConnectionResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateColumnOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateMilvusServiceBucketOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateSalIntegrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateStorageRegistrationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.UpdateTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.WatsonxInstanceDetails;
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines"));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/db2_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines"));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines"));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/netezza_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/other_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{engine_id}/catalogs/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/pause", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/query_explain", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/query_explain_analyze", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/restart", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/resume", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/prestissimo_engines/{id}/scale", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{engine_id}/catalogs/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/pause", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/query_explain", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/query_explain_analyze", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/restart", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/resume", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/presto_engines/{id}/scale", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/applications/{id}/ui", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/catalogs/{id}", pathParamsMap));
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
   * Get Spark Query Server.
   *
   * Get Spark Query Server.
   *
   * @param getSparkEngineQueryServerOptions the {@link GetSparkEngineQueryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineQueryServerDetails}
   */
  public ServiceCall<SparkEngineQueryServerDetails> getSparkEngineQueryServer(GetSparkEngineQueryServerOptions getSparkEngineQueryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSparkEngineQueryServerOptions,
      "getSparkEngineQueryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getSparkEngineQueryServerOptions.engineId());
    pathParamsMap.put("id", getSparkEngineQueryServerOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/query_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSparkEngineQueryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSparkEngineQueryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSparkEngineQueryServerOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineQueryServerDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineQueryServerDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Spark Query Server.
   *
   * Delete a Spark Query Server.
   *
   * @param deleteSparkEngineQueryServerOptions the {@link DeleteSparkEngineQueryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSparkEngineQueryServer(DeleteSparkEngineQueryServerOptions deleteSparkEngineQueryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSparkEngineQueryServerOptions,
      "deleteSparkEngineQueryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteSparkEngineQueryServerOptions.engineId());
    pathParamsMap.put("id", deleteSparkEngineQueryServerOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{engine_id}/query_servers/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteSparkEngineQueryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSparkEngineQueryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSparkEngineQueryServerOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/applications", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/applications", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/catalogs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/history_server", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/history_server", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/history_server", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/history_server/ui", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/pause", pathParamsMap));
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
   * Retrieve all Spark Query Servers.
   *
   * List all Spark Query Servers submitted in an instance.
   *
   * @param listSparkEngineQueryServersOptions the {@link ListSparkEngineQueryServersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineQueryServerDetailsCollection}
   */
  public ServiceCall<SparkEngineQueryServerDetailsCollection> listSparkEngineQueryServers(ListSparkEngineQueryServersOptions listSparkEngineQueryServersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSparkEngineQueryServersOptions,
      "listSparkEngineQueryServersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listSparkEngineQueryServersOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/query_servers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSparkEngineQueryServers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSparkEngineQueryServersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSparkEngineQueryServersOptions.authInstanceId());
    }
    ResponseConverter<SparkEngineQueryServerDetailsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineQueryServerDetailsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create Spark Query Server.
   *
   * Create Spark Query Server.
   *
   * @param createSparkEngineQueryServerOptions the {@link CreateSparkEngineQueryServerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SparkEngineQueryServerDetails}
   */
  public ServiceCall<SparkEngineQueryServerDetails> createSparkEngineQueryServer(CreateSparkEngineQueryServerOptions createSparkEngineQueryServerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSparkEngineQueryServerOptions,
      "createSparkEngineQueryServerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createSparkEngineQueryServerOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/query_servers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSparkEngineQueryServer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSparkEngineQueryServerOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSparkEngineQueryServerOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createSparkEngineQueryServerOptions.queryServerDetails() != null) {
      contentJson.add("query_server_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineQueryServerOptions.queryServerDetails()));
    }
    if (createSparkEngineQueryServerOptions.volumes() != null) {
      contentJson.add("volumes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSparkEngineQueryServerOptions.volumes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SparkEngineQueryServerDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SparkEngineQueryServerDetails>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/resume", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/spark_engines/{id}/scale", pathParamsMap));
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
    if (listCatalogsOptions.accountId() != null) {
      builder.header("AccountId", listCatalogsOptions.accountId());
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
   * To get a catalogs associated with an engine.
   *
   * To get a catalogs associated with an engine.
   *
   * @param listCatalogEngineAssociationOptions the {@link ListCatalogEngineAssociationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogEngineAssociation}
   */
  public ServiceCall<CatalogEngineAssociation> listCatalogEngineAssociation(ListCatalogEngineAssociationOptions listCatalogEngineAssociationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCatalogEngineAssociationOptions,
      "listCatalogEngineAssociationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/engine_association"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listCatalogEngineAssociation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("Secret", listCatalogEngineAssociationOptions.secret());
    if (listCatalogEngineAssociationOptions.engineId() != null) {
      builder.query("engine_id", String.valueOf(listCatalogEngineAssociationOptions.engineId()));
    }
    ResponseConverter<CatalogEngineAssociation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogEngineAssociation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * To update a catalog association with an engine.
   *
   * To update a catalog association with an engine.
   *
   * @param replaceCatalogEngineAssociationOptions the {@link ReplaceCatalogEngineAssociationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogEngineAssociation}
   */
  public ServiceCall<CatalogEngineAssociation> replaceCatalogEngineAssociation(ReplaceCatalogEngineAssociationOptions replaceCatalogEngineAssociationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceCatalogEngineAssociationOptions,
      "replaceCatalogEngineAssociationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/engine_association"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "replaceCatalogEngineAssociation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("Secret", replaceCatalogEngineAssociationOptions.secret());
    final JsonObject contentJson = new JsonObject();
    if (replaceCatalogEngineAssociationOptions.catalogEngineAssociation() != null) {
      contentJson.add("catalog_engine_association", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceCatalogEngineAssociationOptions.catalogEngineAssociation()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogEngineAssociation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogEngineAssociation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * To create a catalog association with an engine.
   *
   * To create a catalog association with an engine.
   *
   * @param createCatalogEngineAssociationOptions the {@link CreateCatalogEngineAssociationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogEngineAssociation}
   */
  public ServiceCall<CatalogEngineAssociation> createCatalogEngineAssociation(CreateCatalogEngineAssociationOptions createCatalogEngineAssociationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCatalogEngineAssociationOptions,
      "createCatalogEngineAssociationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/engine_association"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createCatalogEngineAssociation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("Secret", createCatalogEngineAssociationOptions.secret());
    final JsonObject contentJson = new JsonObject();
    if (createCatalogEngineAssociationOptions.catalogEngineAssociation() != null) {
      contentJson.add("catalog_engine_association", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCatalogEngineAssociationOptions.catalogEngineAssociation()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogEngineAssociation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogEngineAssociation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * To delete a catalog association with an engine.
   *
   * To delete a catalog association with an engine.
   *
   * @param deleteCatalogEngineAssociationOptions the {@link DeleteCatalogEngineAssociationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCatalogEngineAssociation(DeleteCatalogEngineAssociationOptions deleteCatalogEngineAssociationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCatalogEngineAssociationOptions,
      "deleteCatalogEngineAssociationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteCatalogEngineAssociationOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/engine_association/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteCatalogEngineAssociation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Secret", deleteCatalogEngineAssociationOptions.secret());
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns/{column_name}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/columns/{column_name}", pathParamsMap));
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
   * List all masked columns of a table.
   *
   * List all masked columns of a table in a given a schema for a given catalog.
   *
   * @param getMaskedColumnsOptions the {@link GetMaskedColumnsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MaskedColumnCollection}
   */
  public ServiceCall<MaskedColumnCollection> getMaskedColumns(GetMaskedColumnsOptions getMaskedColumnsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMaskedColumnsOptions,
      "getMaskedColumnsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", getMaskedColumnsOptions.catalogName());
    pathParamsMap.put("schema_name", getMaskedColumnsOptions.schemaName());
    pathParamsMap.put("table_name", getMaskedColumnsOptions.tableName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/masked/columns", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getMaskedColumns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMaskedColumnsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getMaskedColumnsOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getMaskedColumnsOptions.engineId()));
    ResponseConverter<MaskedColumnCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MaskedColumnCollection>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/rollback", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "rollbackTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (rollbackTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", rollbackTableOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("snapshot_id", rollbackTableOptions.snapshotId());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_name}/schemas/{schema_name}/tables/{table_name}/snapshots", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{id}/sync", pathParamsMap));
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
    if (deleteCatalogOptions.accountId() != null) {
      builder.header("AccountId", deleteCatalogOptions.accountId());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services"));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services"));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}/pause", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServicePause");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServicePauseOptions.secret() != null) {
      builder.header("Secret", createMilvusServicePauseOptions.secret());
    }
    if (createMilvusServicePauseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServicePauseOptions.authInstanceId());
    }
    if (createMilvusServicePauseOptions.milvusPause() != null) {
      builder.query("milvus_pause", String.valueOf(createMilvusServicePauseOptions.milvusPause()));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}/resume", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServiceResume");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceResumeOptions.secret() != null) {
      builder.header("Secret", createMilvusServiceResumeOptions.secret());
    }
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{id}/scale", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/databases", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/databases/{database_id}/collections", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/databases/{database_id}/collections/{collection_name}/partitions", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services/{service_id}/storage", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateMilvusServiceBucket");
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
   * calculate billing of a milvus service.
   *
   * calculate the cost of an existing milvus service.
   *
   * @param createMilvusServiceBillingOptions the {@link CreateMilvusServiceBillingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MilvusBillingSuccessResponse}
   */
  public ServiceCall<MilvusBillingSuccessResponse> createMilvusServiceBilling(CreateMilvusServiceBillingOptions createMilvusServiceBillingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMilvusServiceBillingOptions,
      "createMilvusServiceBillingOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/milvus_services_billing"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createMilvusServiceBilling");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMilvusServiceBillingOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMilvusServiceBillingOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("iw_cpu", createMilvusServiceBillingOptions.iwCpu());
    contentJson.addProperty("iw_memory", createMilvusServiceBillingOptions.iwMemory());
    contentJson.addProperty("iw_replicas", createMilvusServiceBillingOptions.iwReplicas());
    contentJson.addProperty("qw_cpu", createMilvusServiceBillingOptions.qwCpu());
    contentJson.addProperty("qw_memory", createMilvusServiceBillingOptions.qwMemory());
    contentJson.addProperty("qw_replicas", createMilvusServiceBillingOptions.qwReplicas());
    if (createMilvusServiceBillingOptions.dcCpu() != null) {
      contentJson.addProperty("dc_cpu", createMilvusServiceBillingOptions.dcCpu());
    }
    if (createMilvusServiceBillingOptions.dcMemory() != null) {
      contentJson.addProperty("dc_memory", createMilvusServiceBillingOptions.dcMemory());
    }
    if (createMilvusServiceBillingOptions.dcReplicas() != null) {
      contentJson.addProperty("dc_replicas", createMilvusServiceBillingOptions.dcReplicas());
    }
    if (createMilvusServiceBillingOptions.dwCpu() != null) {
      contentJson.addProperty("dw_cpu", createMilvusServiceBillingOptions.dwCpu());
    }
    if (createMilvusServiceBillingOptions.dwMemory() != null) {
      contentJson.addProperty("dw_memory", createMilvusServiceBillingOptions.dwMemory());
    }
    if (createMilvusServiceBillingOptions.dwReplicas() != null) {
      contentJson.addProperty("dw_replicas", createMilvusServiceBillingOptions.dwReplicas());
    }
    if (createMilvusServiceBillingOptions.etcdCpu() != null) {
      contentJson.addProperty("etcd_cpu", createMilvusServiceBillingOptions.etcdCpu());
    }
    if (createMilvusServiceBillingOptions.etcdMemory() != null) {
      contentJson.addProperty("etcd_memory", createMilvusServiceBillingOptions.etcdMemory());
    }
    if (createMilvusServiceBillingOptions.kafkaCpu() != null) {
      contentJson.addProperty("kafka_cpu", createMilvusServiceBillingOptions.kafkaCpu());
    }
    if (createMilvusServiceBillingOptions.kafkaMemory() != null) {
      contentJson.addProperty("kafka_memory", createMilvusServiceBillingOptions.kafkaMemory());
    }
    if (createMilvusServiceBillingOptions.proxyCpu() != null) {
      contentJson.addProperty("proxy_cpu", createMilvusServiceBillingOptions.proxyCpu());
    }
    if (createMilvusServiceBillingOptions.proxyMemory() != null) {
      contentJson.addProperty("proxy_memory", createMilvusServiceBillingOptions.proxyMemory());
    }
    if (createMilvusServiceBillingOptions.proxyReplicas() != null) {
      contentJson.addProperty("proxy_replicas", createMilvusServiceBillingOptions.proxyReplicas());
    }
    if (createMilvusServiceBillingOptions.qcCpu() != null) {
      contentJson.addProperty("qc_cpu", createMilvusServiceBillingOptions.qcCpu());
    }
    if (createMilvusServiceBillingOptions.qcMemory() != null) {
      contentJson.addProperty("qc_memory", createMilvusServiceBillingOptions.qcMemory());
    }
    if (createMilvusServiceBillingOptions.qcReplicas() != null) {
      contentJson.addProperty("qc_replicas", createMilvusServiceBillingOptions.qcReplicas());
    }
    if (createMilvusServiceBillingOptions.rcCpu() != null) {
      contentJson.addProperty("rc_cpu", createMilvusServiceBillingOptions.rcCpu());
    }
    if (createMilvusServiceBillingOptions.rcMemory() != null) {
      contentJson.addProperty("rc_memory", createMilvusServiceBillingOptions.rcMemory());
    }
    if (createMilvusServiceBillingOptions.rcReplicas() != null) {
      contentJson.addProperty("rc_replicas", createMilvusServiceBillingOptions.rcReplicas());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MilvusBillingSuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MilvusBillingSuccessResponse>() { }.getType());
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
    if (getInstanceConfigurationOptions.secret() != null) {
      builder.header("Secret", getInstanceConfigurationOptions.secret());
    }
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
   * List the instance configuration resources.
   *
   * Lists the different resources (engines and services) present in the current instance.
   *
   * @param listInstanceConfigurationResourcesOptions the {@link ListInstanceConfigurationResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceDetailsCollection}
   */
  public ServiceCall<ResourceDetailsCollection> listInstanceConfigurationResources(ListInstanceConfigurationResourcesOptions listInstanceConfigurationResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceConfigurationResourcesOptions,
      "listInstanceConfigurationResourcesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_configuration/resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listInstanceConfigurationResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInstanceConfigurationResourcesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listInstanceConfigurationResourcesOptions.authInstanceId());
    }
    builder.query("target", String.valueOf(listInstanceConfigurationResourcesOptions.target()));
    if (listInstanceConfigurationResourcesOptions.internalHost() != null) {
      builder.query("internal_host", String.valueOf(listInstanceConfigurationResourcesOptions.internalHost()));
    }
    if (listInstanceConfigurationResourcesOptions.type() != null) {
      builder.query("type", RequestUtils.join(listInstanceConfigurationResourcesOptions.type(), ","));
    }
    ResponseConverter<ResourceDetailsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceDetailsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a resource.
   *
   * Displays the details of a particular resource in Watsonx.Data.
   *
   * @param getInstanceConfigurationResourceOptions the {@link GetInstanceConfigurationResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceDetails}
   */
  public ServiceCall<ResourceDetails> getInstanceConfigurationResource(GetInstanceConfigurationResourceOptions getInstanceConfigurationResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceConfigurationResourceOptions,
      "getInstanceConfigurationResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getInstanceConfigurationResourceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance_configuration/resources/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getInstanceConfigurationResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getInstanceConfigurationResourceOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getInstanceConfigurationResourceOptions.authInstanceId());
    }
    builder.query("target", String.valueOf(getInstanceConfigurationResourceOptions.target()));
    if (getInstanceConfigurationResourceOptions.database() != null) {
      builder.query("database", String.valueOf(getInstanceConfigurationResourceOptions.database()));
    }
    if (getInstanceConfigurationResourceOptions.internalHost() != null) {
      builder.query("internal_host", String.valueOf(getInstanceConfigurationResourceOptions.internalHost()));
    }
    if (getInstanceConfigurationResourceOptions.privateHost() != null) {
      builder.query("private_host", String.valueOf(getInstanceConfigurationResourceOptions.privateHost()));
    }
    ResponseConverter<ResourceDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic automation layer Integration of the instance.
   *
   * Get basic details of the semantic automation layer(SAL) integration with Watsonx.data Intelligence.
   *
   * @param getSalIntegrationOptions the {@link GetSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration(GetSalIntegrationOptions getSalIntegrationOptions) {
    if (getSalIntegrationOptions == null) {
      getSalIntegrationOptions = new GetSalIntegrationOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration"));
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
   * Get basic details of the semantic automation layer(SAL) integration with Watsonx.data Intelligence.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> getSalIntegration() {
    return getSalIntegration(null);
  }

  /**
   * Create semantic automation layer integration with Watsonx.data Intelligence.
   *
   * Create semantic automation layer integration(SAL) with Watsonx.data Intelligence.
   *
   * @param createSalIntegrationOptions the {@link CreateSalIntegrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegration}
   */
  public ServiceCall<SalIntegration> createSalIntegration(CreateSalIntegrationOptions createSalIntegrationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationOptions,
      "createSalIntegrationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration"));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration"));
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "updateSalIntegration");
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
   * create enrichment jobs of schema(or tables in schema).
   *
   * create enrichment job of schemas, notifing the schema(tables) changes to Watsonx.data Intelligence and kick off an
   * import and metadata enrichment job.
   *
   * @param createSalIntegrationEnrichmentOptions the {@link CreateSalIntegrationEnrichmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationEnrichmentOptions,
      "createSalIntegrationEnrichmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment"));
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
   * create enrichment job of schemas, notifing the schema(tables) changes to Watsonx.data Intelligence and kick off an
   * import and metadata enrichment job.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createSalIntegrationEnrichment() {
    return createSalIntegrationEnrichment(null);
  }

  /**
   * List semantic enriched data_assets in Watsonx.data Intelligence.
   *
   * List semantic enrichment data_assets(enriched tables) associated with the schema by Watsonx.data Intelligence
   * project id, which can be fetched from /sal_integration/mappings.
   *
   * @param listSalIntegrationEnrichmentDataAssetsOptions the {@link ListSalIntegrationEnrichmentDataAssetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentDataAssetCollection}
   */
  public ServiceCall<SalEnrichmentDataAssetCollection> listSalIntegrationEnrichmentDataAssets(ListSalIntegrationEnrichmentDataAssetsOptions listSalIntegrationEnrichmentDataAssetsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentDataAssetsOptions,
      "listSalIntegrationEnrichmentDataAssetsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/data_assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationEnrichmentDataAssets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationEnrichmentDataAssetsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationEnrichmentDataAssetsOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(listSalIntegrationEnrichmentDataAssetsOptions.projectId()));
    ResponseConverter<SalEnrichmentDataAssetCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentDataAssetCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get semantic enrichment data_asset associated with the table.
   *
   * Get semantic enrichment data_asset associated with the table by Watsonx.data Intelligence project id and asset id,
   * which can be retrived by /sal_integration/enrichement/data_assets.
   *
   * @param getSalIntegrationEnrichmentDataAssetsByIdOptions the {@link GetSalIntegrationEnrichmentDataAssetsByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentDataAssetDetail}
   */
  public ServiceCall<SalEnrichmentDataAssetDetail> getSalIntegrationEnrichmentDataAssetsById(GetSalIntegrationEnrichmentDataAssetsByIdOptions getSalIntegrationEnrichmentDataAssetsByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationEnrichmentDataAssetsByIdOptions,
      "getSalIntegrationEnrichmentDataAssetsByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSalIntegrationEnrichmentDataAssetsByIdOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/data_assets/{id}/details", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationEnrichmentDataAssetsById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationEnrichmentDataAssetsByIdOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationEnrichmentDataAssetsByIdOptions.authInstanceId());
    }
    builder.query("project_id", String.valueOf(getSalIntegrationEnrichmentDataAssetsByIdOptions.projectId()));
    ResponseConverter<SalEnrichmentDataAssetDetail> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalEnrichmentDataAssetDetail>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/global_settings"));
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/global_settings"));
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
   * List semantic enrichment jobs in wkc that associated with the schema by project id(in the given project from
   * Watsonx.data Intelligence perspective).
   *
   * @param listSalIntegrationEnrichmentJobsOptions the {@link ListSalIntegrationEnrichmentJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentJobs}
   */
  public ServiceCall<SalEnrichmentJobs> listSalIntegrationEnrichmentJobs(ListSalIntegrationEnrichmentJobsOptions listSalIntegrationEnrichmentJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentJobsOptions,
      "listSalIntegrationEnrichmentJobsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/jobs"));
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
   * List runs of an SAL enrichement job associated with the schema(project in Watsonx.data Intelligence perspective).
   *
   * @param listSalIntegrationEnrichmentJobRunsOptions the {@link ListSalIntegrationEnrichmentJobRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentJobRuns}
   */
  public ServiceCall<SalEnrichmentJobRuns> listSalIntegrationEnrichmentJobRuns(ListSalIntegrationEnrichmentJobRunsOptions listSalIntegrationEnrichmentJobRunsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSalIntegrationEnrichmentJobRunsOptions,
      "listSalIntegrationEnrichmentJobRunsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listSalIntegrationEnrichmentJobRunsOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/jobs/{job_id}/runs", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/jobs/{job_id}/runs/{run_id}/logs", pathParamsMap));
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
   * get metadata enrichment settings for a Watsonx.data Intelligence project(schema).
   *
   * get metadata enrichment settings for a Watsonx.data Intelligence project(schema).
   *
   * @param getSalIntegrationEnrichmentProjectSettingsOptions the {@link GetSalIntegrationEnrichmentProjectSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalEnrichmentSettings}
   */
  public ServiceCall<SalEnrichmentSettings> getSalIntegrationEnrichmentProjectSettings(GetSalIntegrationEnrichmentProjectSettingsOptions getSalIntegrationEnrichmentProjectSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationEnrichmentProjectSettingsOptions,
      "getSalIntegrationEnrichmentProjectSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/project_settings"));
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
   * Create or update metadata enrichment settings for a Watsonx.data Intelligence project(enriched schema).
   *
   * @param replaceSalIntegrationEnrichmentProjectSettingsOptions the {@link ReplaceSalIntegrationEnrichmentProjectSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> replaceSalIntegrationEnrichmentProjectSettings(ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceSalIntegrationEnrichmentProjectSettingsOptions,
      "replaceSalIntegrationEnrichmentProjectSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/enrichment/project_settings"));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/glossary/terms"));
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
   * @param createSalIntegrationGlossaryUploadProcessesOptions the {@link CreateSalIntegrationGlossaryUploadProcessesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryUploadProcess}
   */
  public ServiceCall<SalGlossaryUploadProcess> createSalIntegrationGlossaryUploadProcesses(CreateSalIntegrationGlossaryUploadProcessesOptions createSalIntegrationGlossaryUploadProcessesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSalIntegrationGlossaryUploadProcessesOptions,
      "createSalIntegrationGlossaryUploadProcessesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/glossary/upload_processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "createSalIntegrationGlossaryUploadProcesses");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSalIntegrationGlossaryUploadProcessesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSalIntegrationGlossaryUploadProcessesOptions.authInstanceId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    okhttp3.RequestBody glossaryCsvBody = RequestUtils.inputStreamBody(createSalIntegrationGlossaryUploadProcessesOptions.glossaryCsv(), createSalIntegrationGlossaryUploadProcessesOptions.glossaryCsvContentType());
    multipartBuilder.addFormDataPart("glossary_csv", "filename", glossaryCsvBody);
    multipartBuilder.addFormDataPart("replace_option", createSalIntegrationGlossaryUploadProcessesOptions.replaceOption());
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
   * @param getSalIntegrationGlossaryUploadProcessesStatusOptions the {@link GetSalIntegrationGlossaryUploadProcessesStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalGlossaryUploadStatus}
   */
  public ServiceCall<SalGlossaryUploadStatus> getSalIntegrationGlossaryUploadProcessesStatus(GetSalIntegrationGlossaryUploadProcessesStatusOptions getSalIntegrationGlossaryUploadProcessesStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSalIntegrationGlossaryUploadProcessesStatusOptions,
      "getSalIntegrationGlossaryUploadProcessesStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSalIntegrationGlossaryUploadProcessesStatusOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/glossary/upload_processes/{id}/status", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSalIntegrationGlossaryUploadProcessesStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSalIntegrationGlossaryUploadProcessesStatusOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSalIntegrationGlossaryUploadProcessesStatusOptions.authInstanceId());
    }
    ResponseConverter<SalGlossaryUploadStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalGlossaryUploadStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get watsonx.data schema to fetch mapped catalog and project.
   *
   * use the list of watsonx.data catalog and schema to fetch mapped Watsonx.data Intelligence project id and catalog
   * id.
   *
   * @param listSalIntegrationMappingsOptions the {@link ListSalIntegrationMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationMappings}
   */
  public ServiceCall<SalIntegrationMappings> listSalIntegrationMappings(ListSalIntegrationMappingsOptions listSalIntegrationMappingsOptions) {
    if (listSalIntegrationMappingsOptions == null) {
      listSalIntegrationMappingsOptions = new ListSalIntegrationMappingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "listSalIntegrationMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listSalIntegrationMappingsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listSalIntegrationMappingsOptions.authInstanceId());
    }
    if (listSalIntegrationMappingsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listSalIntegrationMappingsOptions.catalogName()));
    }
    if (listSalIntegrationMappingsOptions.schemaName() != null) {
      builder.query("schema_name", String.valueOf(listSalIntegrationMappingsOptions.schemaName()));
    }
    if (listSalIntegrationMappingsOptions.next() != null) {
      builder.query("next", String.valueOf(listSalIntegrationMappingsOptions.next()));
    }
    if (listSalIntegrationMappingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listSalIntegrationMappingsOptions.limit()));
    }
    ResponseConverter<SalIntegrationMappings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SalIntegrationMappings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get watsonx.data schema to fetch mapped catalog and project.
   *
   * use the list of watsonx.data catalog and schema to fetch mapped Watsonx.data Intelligence project id and catalog
   * id.
   *
   * @return a {@link ServiceCall} with a result of type {@link SalIntegrationMappings}
   */
  public ServiceCall<SalIntegrationMappings> listSalIntegrationMappings() {
    return listSalIntegrationMappings(null);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/semantic_search/queries"));
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
   * Trigger a global search among Watsonx.data Intelligence metadata by given query.
   *
   * Execute a query of global search among Watsonx.data Intelligence metadata.
   *
   * @param createSemanticSearchQueriesOptions the {@link CreateSemanticSearchQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SemanticSearch}
   */
  public ServiceCall<SemanticSearch> createSemanticSearchQueries(CreateSemanticSearchQueriesOptions createSemanticSearchQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSemanticSearchQueriesOptions,
      "createSemanticSearchQueriesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/semantic_search/queries"));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/semantic_search/queries"));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_integration/semantic_search/queries/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/sal_metadata"));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{catalog_id}/schemas/{schema_id}/tables/{table_id}/metadata", pathParamsMap));
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "getSchemaDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchemaDetailsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSchemaDetailsOptions.authInstanceId());
    }
    builder.query("catalog_name", String.valueOf(getSchemaDetailsOptions.catalogName()));
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
    contentJson.addProperty("display_name", createStorageRegistrationOptions.displayName());
    contentJson.addProperty("managed_by", createStorageRegistrationOptions.managedBy());
    contentJson.addProperty("type", createStorageRegistrationOptions.type());
    if (createStorageRegistrationOptions.associatedCatalog() != null) {
      contentJson.add("associated_catalog", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createStorageRegistrationOptions.associatedCatalog()));
    }
    if (createStorageRegistrationOptions.connection() != null) {
      contentJson.add("connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createStorageRegistrationOptions.connection()));
    }
    if (createStorageRegistrationOptions.description() != null) {
      contentJson.addProperty("description", createStorageRegistrationOptions.description());
    }
    if (createStorageRegistrationOptions.pathStyleEnabled() != null) {
      contentJson.addProperty("path_style_enabled", createStorageRegistrationOptions.pathStyleEnabled());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "deleteStorageRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteStorageRegistrationOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteStorageRegistrationOptions.authInstanceId());
    }
    if (deleteStorageRegistrationOptions.accountId() != null) {
      builder.header("AccountId", deleteStorageRegistrationOptions.accountId());
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{id}", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{storage_id}/catalogs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v3", "addStorageCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addStorageCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", addStorageCatalogOptions.authInstanceId());
    }
    if (addStorageCatalogOptions.accountId() != null) {
      builder.header("AccountId", addStorageCatalogOptions.accountId());
    }
    if (addStorageCatalogOptions.skipMdsCall() != null) {
      builder.query("skip_mds_call", String.valueOf(addStorageCatalogOptions.skipMdsCall()));
    }
    final JsonObject contentJson = new JsonObject();
    if (addStorageCatalogOptions.basePath() != null) {
      contentJson.addProperty("base_path", addStorageCatalogOptions.basePath());
    }
    if (addStorageCatalogOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", addStorageCatalogOptions.catalogName());
    }
    if (addStorageCatalogOptions.catalogTags() != null) {
      contentJson.add("catalog_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addStorageCatalogOptions.catalogTags()));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{storage_id}/object_properties", pathParamsMap));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/storage_registrations/{storage_id}/objects", pathParamsMap));
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

}
