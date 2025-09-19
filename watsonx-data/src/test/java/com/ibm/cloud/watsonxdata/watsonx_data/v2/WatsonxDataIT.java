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

package com.ibm.cloud.watsonxdata.watsonx_data.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.watsonxdata.test.SdkIntegrationTestBase;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Bandwidth;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BenchmarkData;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BenchmarkStatusResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketObjectProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketObjectSizePathsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationObjectSizeCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnsResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetailsProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetailsPropertiesConnectionItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDb2EngineOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseCatalogPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDeactivateBucketOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Details;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Driver;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Endpoint;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EndpointCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesLogConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Configuration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EngineServiceDetailsCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginesServicesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnrichmentAsset;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnrichmentObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ErrorObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ExecuteQueryCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ExternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateBenchmarkReportOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateBenchmarkReportOKBodyResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateBenchmarkReportOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateBenchmarkReportStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateEngineDumpOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateEngineDumpOKBodyResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateEngineDumpOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GlossaryObject;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobCollectionPage;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobsPager;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Integration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IntegrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.InternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.JdbcThriftUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllIntegrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListAllTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDb2EnginesOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceBucketPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServicePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Milvusdbcollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesVelox;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePatchRemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesEventListener;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesGlobal;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesJMX;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PreviewIngestionFile;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PreviewIngestionFilePrototypeCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PreviewIngestionFileRows;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesPrestissimoOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RestartPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RestartPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultExecuteQuery;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Results;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItem;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItemEntity;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItemEntityJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItemEntityJobConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItemEntityTaskCredentialsSupport;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentJobsResultItemMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettings;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansion;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationGlossaryTerms;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationMappings;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationUploadGlossary;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationUploadGlossaryStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ScheduleInfo;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SchemaResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SchemaResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SchemaResponseSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ServicesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationEnv;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkDefaultConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusStateDetailsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkHistoryServer;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkScaleConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVersions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVersionsInfoResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SyncCatalogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableColumDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableColumDetailColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TablePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshot;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineBodyEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.WatsonxInstanceDetailsCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the WatsonxData service.
 */
public class WatsonxDataIT extends SdkIntegrationTestBase {
  public WatsonxData service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../watsonx_data_v2.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = WatsonxData.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(WatsonxData.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListBucketRegistrations() throws Exception {
    try {
      ListBucketRegistrationsOptions listBucketRegistrationsOptions = new ListBucketRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketRegistrationCollection> response = service.listBucketRegistrations(listBucketRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistrationCollection bucketRegistrationCollectionResult = response.getResult();
      assertNotNull(bucketRegistrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBucketRegistrations" })
  public void testCreateBucketRegistration() throws Exception {
    try {
      BucketCatalog bucketCatalogModel = new BucketCatalog.Builder()
        .catalogName("sampleCatalog")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .catalogType("iceberg")
        .build();

      BucketDetails bucketDetailsModel = new BucketDetails.Builder()
        .accessKey("<access_key>")
        .bucketName("sample-bucket")
        .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
        .keyFile("key_file")
        .provider("ibm-cos")
        .region("us-south")
        .secretKey("secret_key")
        .build();

      StorageDetails storageDetailsModel = new StorageDetails.Builder()
        .accessKey("<access_key>")
        .applicationId("<application_id>")
        .authMode("<account_key/sas/service_principle>")
        .containerName("sample-container")
        .directoryId("<directory_id>")
        .endpoint("abfss://<container_name>@<storage_account_name>.dfs.core.windows.net/")
        .sasToken("<sas_token>")
        .secretKey("secret_key")
        .storageAccountName("sample-storage")
        .build();

      CreateBucketRegistrationOptions createBucketRegistrationOptions = new CreateBucketRegistrationOptions.Builder()
        .bucketDisplayName("sample-bucket-displayname")
        .bucketType("ibm_cos")
        .description("COS bucket for customer data")
        .managedBy("ibm")
        .associatedCatalog(bucketCatalogModel)
        .bucketDetails(bucketDetailsModel)
        .region("us-south")
        .storageDetails(storageDetailsModel)
        .tags(java.util.Arrays.asList("bucket-tag1", "bucket-tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketRegistration> response = service.createBucketRegistration(createBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BucketRegistration bucketRegistrationResult = response.getResult();
      assertNotNull(bucketRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBucketRegistration" })
  public void testGetBucketRegistration() throws Exception {
    try {
      GetBucketRegistrationOptions getBucketRegistrationOptions = new GetBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketRegistration> response = service.getBucketRegistration(getBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistration bucketRegistrationResult = response.getResult();
      assertNotNull(bucketRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBucketRegistration" })
  public void testUpdateBucketRegistration() throws Exception {
    try {
      BucketDetails bucketDetailsModel = new BucketDetails.Builder()
        .accessKey("<access_key>")
        .bucketName("sample-bucket")
        .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
        .keyFile("key_file")
        .provider("ibm-cos")
        .region("us-south")
        .secretKey("secret_key")
        .build();

      BucketRegistrationPatch bucketRegistrationPatchModel = new BucketRegistrationPatch.Builder()
        .bucketDetails(bucketDetailsModel)
        .bucketDisplayName("sample-bucket-displayname")
        .description("COS bucket for customer data")
        .systemBucketUpdateCredentials(true)
        .tags(java.util.Arrays.asList("testbucket", "userbucket"))
        .build();
      Map<String, Object> bucketRegistrationPatchModelAsPatch = bucketRegistrationPatchModel.asPatch();

      UpdateBucketRegistrationOptions updateBucketRegistrationOptions = new UpdateBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .body(bucketRegistrationPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketRegistration> response = service.updateBucketRegistration(updateBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistration bucketRegistrationResult = response.getResult();
      assertNotNull(bucketRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBucketRegistration" })
  public void testCreateActivateBucket() throws Exception {
    try {
      CreateActivateBucketOptions createActivateBucketOptions = new CreateActivateBucketOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateActivateBucketCreatedBody> response = service.createActivateBucket(createActivateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateActivateBucketCreatedBody createActivateBucketCreatedBodyResult = response.getResult();
      assertNotNull(createActivateBucketCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateActivateBucket" })
  public void testListBucketObjects() throws Exception {
    try {
      ListBucketObjectsOptions listBucketObjectsOptions = new ListBucketObjectsOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .path("testString")
        .build();

      // Invoke operation
      Response<BucketRegistrationObjectCollection> response = service.listBucketObjects(listBucketObjectsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistrationObjectCollection bucketRegistrationObjectCollectionResult = response.getResult();
      assertNotNull(bucketRegistrationObjectCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBucketObjects" })
  public void testGetBucketObjectProperties() throws Exception {
    try {
      BucketObjectSizePathsItems bucketObjectSizePathsItemsModel = new BucketObjectSizePathsItems.Builder()
        .path("testString")
        .build();

      GetBucketObjectPropertiesOptions getBucketObjectPropertiesOptions = new GetBucketObjectPropertiesOptions.Builder()
        .bucketId("testString")
        .paths(java.util.Arrays.asList(bucketObjectSizePathsItemsModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketObjectProperties> response = service.getBucketObjectProperties(getBucketObjectPropertiesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BucketObjectProperties bucketObjectPropertiesResult = response.getResult();
      assertNotNull(bucketObjectPropertiesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBucketObjectProperties" })
  public void testGenerateBenchmarkReport() throws Exception {
    try {
      GenerateBenchmarkReportOptions generateBenchmarkReportOptions = new GenerateBenchmarkReportOptions.Builder()
        .bucketName("testString")
        .engineId("testString")
        .podName("testString")
        .fileCount("testString")
        .fileSize("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GenerateBenchmarkReportOKBody> response = service.generateBenchmarkReport(generateBenchmarkReportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GenerateBenchmarkReportOKBody generateBenchmarkReportOkBodyResult = response.getResult();
      assertNotNull(generateBenchmarkReportOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGenerateBenchmarkReport" })
  public void testGenerateBenchmarkReportStatus() throws Exception {
    try {
      GenerateBenchmarkReportStatusOptions generateBenchmarkReportStatusOptions = new GenerateBenchmarkReportStatusOptions.Builder()
        .reqId("testString")
        .engineId("testString")
        .bucketName("testString")
        .podName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BenchmarkStatusResponse> response = service.generateBenchmarkReportStatus(generateBenchmarkReportStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BenchmarkStatusResponse benchmarkStatusResponseResult = response.getResult();
      assertNotNull(benchmarkStatusResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGenerateBenchmarkReportStatus" })
  public void testCreateHdfsStorage() throws Exception {
    try {
      CreateHdfsStorageOptions createHdfsStorageOptions = new CreateHdfsStorageOptions.Builder()
        .bucketDisplayName("testString")
        .bucketType("testString")
        .hmsThriftUri("testString")
        .hmsThriftPort(Long.valueOf("1"))
        .coreSite("testString")
        .hdfsSite("testString")
        .kerberos("testString")
        .catalogName("testString")
        .catalogType("testString")
        .krb5Config("testString")
        .hiveKeytab(TestUtilities.createMockStream("This is a mock file."))
        .hiveKeytabContentType("testString")
        .hdfsKeytab(TestUtilities.createMockStream("This is a mock file."))
        .hdfsKeytabContentType("testString")
        .hiveServerPrincipal("testString")
        .hiveClientPrincipal("testString")
        .hdfsPrincipal("testString")
        .description("testString")
        .createdOn("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<HdfsStorageRegistration> response = service.createHdfsStorage(createHdfsStorageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      HdfsStorageRegistration hdfsStorageRegistrationResult = response.getResult();
      assertNotNull(hdfsStorageRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateHdfsStorage" })
  public void testListDatabaseRegistrations() throws Exception {
    try {
      ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptions = new ListDatabaseRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistrationCollection> response = service.listDatabaseRegistrations(listDatabaseRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistrationCollection databaseRegistrationCollectionResult = response.getResult();
      assertNotNull(databaseRegistrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDatabaseRegistrations" })
  public void testCreateDatabaseRegistration() throws Exception {
    try {
      DatabaseCatalogPrototype databaseCatalogPrototypeModel = new DatabaseCatalogPrototype.Builder()
        .catalogName("sampleCatalog")
        .catalogType("iceberg")
        .build();

      DatabaseDetails databaseDetailsModel = new DatabaseDetails.Builder()
        .authenticationType("LDAP")
        .authenticationValue("LDAP")
        .brokerAuthenticationPassword("samplepassword")
        .brokerAuthenticationType("PASSWORD")
        .brokerAuthenticationUser("sampleuser")
        .brokerHost("samplehost")
        .brokerPort(Long.valueOf("4553"))
        .certificate("exampleCertificate")
        .certificateExtension("pem")
        .connectionMethod("basic, apikey")
        .connectionMode("service_name")
        .connectionModeValue("orclpdb")
        .connectionType("JDBC, Arrow flight")
        .controllerAuthenticationPassword("samplepassword")
        .controllerAuthenticationType("PASSWORD")
        .controllerAuthenticationUser("sampleuser")
        .coordinatorHost("samplehost")
        .coordinatorPort(Long.valueOf("4553"))
        .cpdHostname("samplecpdhostname")
        .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
        .databaseName("new_database")
        .hostname("http://db2@localhost:9900.com")
        .hostnameInCertificate("samplehostname")
        .hosts("abc.com:1234,xyz.com:4321")
        .informixServer("ol_informix1410")
        .password("samplepassword")
        .port(Long.valueOf("4553"))
        .projectId("conops-bigquery")
        .sasl(true)
        .saslMechanism("plain")
        .schemaName("sampleSchema")
        .schemas("redis__name")
        .serviceApiKey("sampleapikey")
        .serviceHostname("api.dataplatform.dev.cloud.ibm.com")
        .servicePassword("samplepassword")
        .servicePort(Long.valueOf("443"))
        .serviceSsl(true)
        .serviceTokenUrl("sampletoakenurl")
        .serviceUsername("sampleusername")
        .ssl(true)
        .tables("kafka_table_name, redis_table_name")
        .username("sampleuser")
        .validateServerCertificate(true)
        .verifyHostName(true)
        .warehouseName("samplewrehouse")
        .build();

      DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions = new CreateDatabaseRegistrationOptions.Builder()
        .databaseDisplayName("new_database")
        .databaseType("db2")
        .associatedCatalog(databaseCatalogPrototypeModel)
        .createdOn("1686792721")
        .databaseDetails(databaseDetailsModel)
        .databaseProperties(java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel))
        .description("db2 extenal database description")
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.createDatabaseRegistration(createDatabaseRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDatabaseRegistration" })
  public void testGetDatabase() throws Exception {
    try {
      GetDatabaseOptions getDatabaseOptions = new GetDatabaseOptions.Builder()
        .databaseId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.getDatabase(getDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDatabase" })
  public void testUpdateDatabase() throws Exception {
    try {
      DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
        .authenticationValue("LDAP")
        .brokerAuthenticationPassword("samplepassword")
        .brokerAuthenticationType("PASSWORD")
        .brokerAuthenticationUser("sampleuser")
        .controllerAuthenticationPassword("samplepassword")
        .controllerAuthenticationType("PASSWORD")
        .controllerAuthenticationUser("sampleuser")
        .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
        .databaseProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
        .password("samplepassword")
        .username("sampleuser")
        .build();

      DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
        .createdOn("1686792721")
        .fileContents("sample file content")
        .fileName("test.json")
        .schemaName("customer")
        .tableName("customer")
        .build();

      DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
        .createdOn("1686792721")
        .fileContents("sample file contents")
        .fileName("test.json")
        .topicName("customer")
        .build();

      DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
        .databaseDetails(databaseRegistrationPatchDatabaseDetailsModel)
        .databaseDisplayName("new_database")
        .description("External database description")
        .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
        .build();
      Map<String, Object> databaseRegistrationPatchModelAsPatch = databaseRegistrationPatchModel.asPatch();

      UpdateDatabaseOptions updateDatabaseOptions = new UpdateDatabaseOptions.Builder()
        .databaseId("testString")
        .body(databaseRegistrationPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.updateDatabase(updateDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDatabase" })
  public void testGenerateEngineDump() throws Exception {
    try {
      GenerateEngineDumpOptions generateEngineDumpOptions = new GenerateEngineDumpOptions.Builder()
        .dumpFileName("prestodump")
        .dumpType("heat")
        .engineId("presto-123")
        .podName("presto")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GenerateEngineDumpOKBody> response = service.generateEngineDump(generateEngineDumpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GenerateEngineDumpOKBody generateEngineDumpOkBodyResult = response.getResult();
      assertNotNull(generateEngineDumpOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGenerateEngineDump" })
  public void testListOtherEngines() throws Exception {
    try {
      ListOtherEnginesOptions listOtherEnginesOptions = new ListOtherEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<OtherEngineCollection> response = service.listOtherEngines(listOtherEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OtherEngineCollection otherEngineCollectionResult = response.getResult();
      assertNotNull(otherEngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListOtherEngines" })
  public void testCreateOtherEngine() throws Exception {
    try {
      OtherEngineDetailsBody otherEngineDetailsBodyModel = new OtherEngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .engineType("netezza")
        .build();

      CreateOtherEngineOptions createOtherEngineOptions = new CreateOtherEngineOptions.Builder()
        .engineDetails(otherEngineDetailsBodyModel)
        .engineDisplayName("sampleEngine01")
        .description("external engine description")
        .origin("external")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<OtherEngine> response = service.createOtherEngine(createOtherEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      OtherEngine otherEngineResult = response.getResult();
      assertNotNull(otherEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateOtherEngine" })
  public void testListAllIntegrations() throws Exception {
    try {
      ListAllIntegrationsOptions listAllIntegrationsOptions = new ListAllIntegrationsOptions.Builder()
        .authInstanceId("testString")
        .secret("testString")
        .serviceType("testString")
        .state(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<IntegrationCollection> response = service.listAllIntegrations(listAllIntegrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IntegrationCollection integrationCollectionResult = response.getResult();
      assertNotNull(integrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllIntegrations" })
  public void testCreateIntegration() throws Exception {
    try {
      CreateIntegrationOptions createIntegrationOptions = new CreateIntegrationOptions.Builder()
        .accessToken("testString")
        .apikey("testString")
        .crossAccountIntegration(true)
        .enableDataPolicyWithinWxd(false)
        .ikcUserAccountId("testString")
        .password("password")
        .resource("resource_name")
        .serviceType("ranger")
        .storageCatalogs(java.util.Arrays.asList("testString"))
        .url("http://abcd.efgh.com:9876/")
        .username("username")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Integration> response = service.createIntegration(createIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Integration integrationResult = response.getResult();
      assertNotNull(integrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIntegration" })
  public void testGetIntegrations() throws Exception {
    try {
      GetIntegrationsOptions getIntegrationsOptions = new GetIntegrationsOptions.Builder()
        .integrationId("testString")
        .authInstanceId("testString")
        .secret("testString")
        .build();

      // Invoke operation
      Response<Integration> response = service.getIntegrations(getIntegrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Integration integrationResult = response.getResult();
      assertNotNull(integrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetIntegrations" })
  public void testUpdateIntegration() throws Exception {
    try {
      IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
        .accessToken("uiOO90kklop")
        .apikey("apikey")
        .crossAccountIntegration(false)
        .enableDataPolicyWithinWxd(true)
        .ikcUserAccountId("abcdefghijklmnopqrstuvwxyz")
        .password("password")
        .resource("resource_name")
        .state("active")
        .storageCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .url("http://abcd.efgh.com:9876/")
        .username("username")
        .build();
      Map<String, Object> integrationPatchModelAsPatch = integrationPatchModel.asPatch();

      UpdateIntegrationOptions updateIntegrationOptions = new UpdateIntegrationOptions.Builder()
        .integrationId("testString")
        .integrationPatch(integrationPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Integration> response = service.updateIntegration(updateIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Integration integrationResult = response.getResult();
      assertNotNull(integrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateIntegration" })
  public void testListDb2Engines() throws Exception {
    try {
      ListDb2EnginesOptions listDb2EnginesOptions = new ListDb2EnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Db2EngineCollection> response = service.listDb2Engines(listDb2EnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Db2EngineCollection db2EngineCollectionResult = response.getResult();
      assertNotNull(db2EngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDb2Engines" })
  public void testCreateDb2Engine() throws Exception {
    try {
      Db2EngineDetailsBody db2EngineDetailsBodyModel = new Db2EngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateDb2EngineOptions createDb2EngineOptions = new CreateDb2EngineOptions.Builder()
        .origin("external")
        .description("db2 engine description")
        .engineDetails(db2EngineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Db2Engine> response = service.createDb2Engine(createDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Db2Engine db2EngineResult = response.getResult();
      assertNotNull(db2EngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDb2Engine" })
  public void testUpdateDb2Engine() throws Exception {
    try {
      Db2EnginePatch db2EnginePatchModel = new Db2EnginePatch.Builder()
        .description("db2 engine updated description")
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> db2EnginePatchModelAsPatch = db2EnginePatchModel.asPatch();

      UpdateDb2EngineOptions updateDb2EngineOptions = new UpdateDb2EngineOptions.Builder()
        .engineId("testString")
        .body(db2EnginePatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Db2Engine> response = service.updateDb2Engine(updateDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Db2Engine db2EngineResult = response.getResult();
      assertNotNull(db2EngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDb2Engine" })
  public void testListNetezzaEngines() throws Exception {
    try {
      ListNetezzaEnginesOptions listNetezzaEnginesOptions = new ListNetezzaEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<NetezzaEngineCollection> response = service.listNetezzaEngines(listNetezzaEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetezzaEngineCollection netezzaEngineCollectionResult = response.getResult();
      assertNotNull(netezzaEngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetezzaEngines" })
  public void testCreateNetezzaEngine() throws Exception {
    try {
      NetezzaEngineDetailsBody netezzaEngineDetailsBodyModel = new NetezzaEngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateNetezzaEngineOptions createNetezzaEngineOptions = new CreateNetezzaEngineOptions.Builder()
        .origin("external")
        .description("netezza engine description")
        .engineDetails(netezzaEngineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<NetezzaEngine> response = service.createNetezzaEngine(createNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetezzaEngine netezzaEngineResult = response.getResult();
      assertNotNull(netezzaEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateNetezzaEngine" })
  public void testUpdateNetezzaEngine() throws Exception {
    try {
      NetezzaEnginePatch netezzaEnginePatchModel = new NetezzaEnginePatch.Builder()
        .description("netezza engine updated description")
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> netezzaEnginePatchModelAsPatch = netezzaEnginePatchModel.asPatch();

      UpdateNetezzaEngineOptions updateNetezzaEngineOptions = new UpdateNetezzaEngineOptions.Builder()
        .engineId("testString")
        .body(netezzaEnginePatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<NetezzaEngine> response = service.updateNetezzaEngine(updateNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetezzaEngine netezzaEngineResult = response.getResult();
      assertNotNull(netezzaEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateNetezzaEngine" })
  public void testCreateExecuteQuery() throws Exception {
    try {
      CreateExecuteQueryOptions createExecuteQueryOptions = new CreateExecuteQueryOptions.Builder()
        .engineId("testString")
        .sqlString("select expenses from expenditure")
        .catalogName("sampleCatalog")
        .schemaName("SampleSchema1")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ExecuteQueryCreatedBody> response = service.createExecuteQuery(createExecuteQueryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ExecuteQueryCreatedBody executeQueryCreatedBodyResult = response.getResult();
      assertNotNull(executeQueryCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateExecuteQuery" })
  public void testListInstanceDetails() throws Exception {
    try {
      ListInstanceDetailsOptions listInstanceDetailsOptions = new ListInstanceDetailsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<WatsonxInstanceDetailsCollection> response = service.listInstanceDetails(listInstanceDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WatsonxInstanceDetailsCollection watsonxInstanceDetailsCollectionResult = response.getResult();
      assertNotNull(watsonxInstanceDetailsCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceDetails" })
  public void testListInstanceServiceDetails() throws Exception {
    try {
      ListInstanceServiceDetailsOptions listInstanceServiceDetailsOptions = new ListInstanceServiceDetailsOptions.Builder()
        .target("testString")
        .internalHost(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<EnginesServicesDetails> response = service.listInstanceServiceDetails(listInstanceServiceDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EnginesServicesDetails enginesServicesDetailsResult = response.getResult();
      assertNotNull(enginesServicesDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceServiceDetails" })
  public void testGetServicesDetails() throws Exception {
    try {
      GetServicesDetailsOptions getServicesDetailsOptions = new GetServicesDetailsOptions.Builder()
        .target("testString")
        .engineOrServiceType("testString")
        .internalHost(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ServicesDetails> response = service.getServicesDetails(getServicesDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServicesDetails servicesDetailsResult = response.getResult();
      assertNotNull(servicesDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetServicesDetails" })
  public void testGetServiceDetail() throws Exception {
    try {
      GetServiceDetailOptions getServiceDetailOptions = new GetServiceDetailOptions.Builder()
        .target("testString")
        .engineOrServiceType("testString")
        .id("testString")
        .database("testString")
        .internalHost(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ConnectionPropertiesDetails> response = service.getServiceDetail(getServiceDetailOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConnectionPropertiesDetails connectionPropertiesDetailsResult = response.getResult();
      assertNotNull(connectionPropertiesDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetServiceDetail" })
  public void testListPrestissimoEngines() throws Exception {
    try {
      ListPrestissimoEnginesOptions listPrestissimoEnginesOptions = new ListPrestissimoEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngineCollection> response = service.listPrestissimoEngines(listPrestissimoEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngineCollection prestissimoEngineCollectionResult = response.getResult();
      assertNotNull(prestissimoEngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestissimoEngines" })
  public void testCreatePrestissimoEngine() throws Exception {
    try {
      PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      PrestissimoEndpoints prestissimoEndpointsModel = new PrestissimoEndpoints.Builder()
        .applicationsApi("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>")
        .historyServerEndpoint("$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server")
        .sparkAccessEndpoint("$HOST/analytics-engine/details/spark-<instance_id>")
        .sparkJobsV4Endpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications")
        .sparkKernelEndpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels")
        .viewHistoryServer("testString")
        .wxdApplicationEndpoint("$HOST/v1/1698311655308796/engines/spark817/applications")
        .build();

      PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
        .apiKey("<api_key>")
        .connectionString("1.2.3.4")
        .coordinator(prestissimoNodeDescriptionBodyModel)
        .endpoints(prestissimoEndpointsModel)
        .instanceId("instance_id")
        .managedBy("fully/self")
        .metastoreHost("1.2.3.4")
        .sizeConfig("starter")
        .worker(prestissimoNodeDescriptionBodyModel)
        .build();

      CreatePrestissimoEngineOptions createPrestissimoEngineOptions = new CreatePrestissimoEngineOptions.Builder()
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("hive_data"))
        .description("prestissimo engine description")
        .engineDetails(prestissimoEngineDetailsModel)
        .engineDisplayName("sampleEngine")
        .region("us-south")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .version("1.2.3")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.createPrestissimoEngine(createPrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrestissimoEngine prestissimoEngineResult = response.getResult();
      assertNotNull(prestissimoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestissimoEngine" })
  public void testGetPrestissimoEngine() throws Exception {
    try {
      GetPrestissimoEngineOptions getPrestissimoEngineOptions = new GetPrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.getPrestissimoEngine(getPrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngine prestissimoEngineResult = response.getResult();
      assertNotNull(prestissimoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestissimoEngine" })
  public void testUpdatePrestissimoEngine() throws Exception {
    try {
      PrestissimoEnginePropertiesCatalog prestissimoEnginePropertiesCatalogModel = new PrestissimoEnginePropertiesCatalog.Builder()
        .catalogName(java.util.Arrays.asList("testString"))
        .build();

      PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      EnginePropertiesOaiGenConfiguration enginePropertiesOaiGenConfigurationModel = new EnginePropertiesOaiGenConfiguration.Builder()
        .coordinator(prestissimoNodeDescriptionBodyModel)
        .worker(prestissimoNodeDescriptionBodyModel)
        .build();

      PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVeloxModel = new PrestissimoEnginePropertiesVelox.Builder()
        .veloxProperty(java.util.Arrays.asList("testString"))
        .build();

      NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      PrestissimoEnginePropertiesOaiGen1Jvm prestissimoEnginePropertiesOaiGen1JvmModel = new PrestissimoEnginePropertiesOaiGen1Jvm.Builder()
        .coordinator(nodeDescriptionBodyModel)
        .build();

      PrestissimoEngineEngineProperties prestissimoEngineEnginePropertiesModel = new PrestissimoEngineEngineProperties.Builder()
        .catalog(prestissimoEnginePropertiesCatalogModel)
        .configuration(enginePropertiesOaiGenConfigurationModel)
        .velox(prestissimoEnginePropertiesVeloxModel)
        .jvm(prestissimoEnginePropertiesOaiGen1JvmModel)
        .build();

      RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemoveEnginePropertiesPrestissimoOaiGenJvm removeEnginePropertiesPrestissimoOaiGenJvmModel = new RemoveEnginePropertiesPrestissimoOaiGenJvm.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .build();

      RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
        .catalog(prestissimoEnginePropertiesCatalogModel)
        .configuration(removeEnginePropertiesConfigurationModel)
        .jvm(removeEnginePropertiesPrestissimoOaiGenJvmModel)
        .velox(java.util.Arrays.asList("testString"))
        .build();

      PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
        .description("updated description for prestissimo engine")
        .engineDisplayName("sampleEngine")
        .engineProperties(prestissimoEngineEnginePropertiesModel)
        .engineRestart("force")
        .removeEngineProperties(removeEnginePropertiesModel)
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestissimoEnginePatchModelAsPatch = prestissimoEnginePatchModel.asPatch();

      UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions = new UpdatePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .body(prestissimoEnginePatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.updatePrestissimoEngine(updatePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngine prestissimoEngineResult = response.getResult();
      assertNotNull(prestissimoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestissimoEngine" })
  public void testListPrestissimoEngineCatalogs() throws Exception {
    try {
      ListPrestissimoEngineCatalogsOptions listPrestissimoEngineCatalogsOptions = new ListPrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listPrestissimoEngineCatalogs(listPrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestissimoEngineCatalogs" })
  public void testCreatePrestissimoEngineCatalogs() throws Exception {
    try {
      CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions = new CreatePrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.createPrestissimoEngineCatalogs(createPrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineCatalogs" })
  public void testGetPrestissimoEngineCatalog() throws Exception {
    try {
      GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptions = new GetPrestissimoEngineCatalogOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.getPrestissimoEngineCatalog(getPrestissimoEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestissimoEngineCatalog" })
  public void testPausePrestissimoEngine() throws Exception {
    try {
      PausePrestissimoEngineOptions pausePrestissimoEngineOptions = new PausePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.pausePrestissimoEngine(pausePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPausePrestissimoEngine" })
  public void testRunPrestissimoExplainStatement() throws Exception {
    try {
      RunPrestissimoExplainStatementOptions runPrestissimoExplainStatementOptions = new RunPrestissimoExplainStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .format("json")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ResultPrestissimoExplainStatement> response = service.runPrestissimoExplainStatement(runPrestissimoExplainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResultPrestissimoExplainStatement resultPrestissimoExplainStatementResult = response.getResult();
      assertNotNull(resultPrestissimoExplainStatementResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunPrestissimoExplainStatement" })
  public void testRunPrestissimoExplainAnalyzeStatement() throws Exception {
    try {
      RunPrestissimoExplainAnalyzeStatementOptions runPrestissimoExplainAnalyzeStatementOptions = new RunPrestissimoExplainAnalyzeStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ResultRunPrestissimoExplainAnalyzeStatement> response = service.runPrestissimoExplainAnalyzeStatement(runPrestissimoExplainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResultRunPrestissimoExplainAnalyzeStatement resultRunPrestissimoExplainAnalyzeStatementResult = response.getResult();
      assertNotNull(resultRunPrestissimoExplainAnalyzeStatementResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunPrestissimoExplainAnalyzeStatement" })
  public void testRestartPrestissimoEngine() throws Exception {
    try {
      RestartPrestissimoEngineOptions restartPrestissimoEngineOptions = new RestartPrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.restartPrestissimoEngine(restartPrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRestartPrestissimoEngine" })
  public void testResumePrestissimoEngine() throws Exception {
    try {
      ResumePrestissimoEngineOptions resumePrestissimoEngineOptions = new ResumePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.resumePrestissimoEngine(resumePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResumePrestissimoEngine" })
  public void testScalePrestissimoEngine() throws Exception {
    try {
      PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      ScalePrestissimoEngineOptions scalePrestissimoEngineOptions = new ScalePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .coordinator(prestissimoNodeDescriptionBodyModel)
        .worker(prestissimoNodeDescriptionBodyModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.scalePrestissimoEngine(scalePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testScalePrestissimoEngine" })
  public void testListPrestoEngines() throws Exception {
    try {
      ListPrestoEnginesOptions listPrestoEnginesOptions = new ListPrestoEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineCollection> response = service.listPrestoEngines(listPrestoEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngineCollection prestoEngineCollectionResult = response.getResult();
      assertNotNull(prestoEngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestoEngines" })
  public void testCreatePrestoEngine() throws Exception {
    try {
      NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
        .apiKey("<api_key>")
        .connectionString("1.2.3.4")
        .coordinator(nodeDescriptionBodyModel)
        .instanceId("instance_id")
        .managedBy("fully/self")
        .sizeConfig("starter")
        .worker(nodeDescriptionBodyModel)
        .build();

      CreatePrestoEngineOptions createPrestoEngineOptions = new CreatePrestoEngineOptions.Builder()
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("iceberg-data", "hive-data"))
        .description("presto engine for running sql queries")
        .engineDetails(engineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .region("us-south")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .version("1.2.3")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.createPrestoEngine(createPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrestoEngine prestoEngineResult = response.getResult();
      assertNotNull(prestoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestoEngine" })
  public void testGetPrestoEngine() throws Exception {
    try {
      GetPrestoEngineOptions getPrestoEngineOptions = new GetPrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.getPrestoEngine(getPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngine prestoEngineResult = response.getResult();
      assertNotNull(prestoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngine" })
  public void testUpdatePrestoEngine() throws Exception {
    try {
      PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalogModel = new PrestoEnginePropertiesCatalog.Builder()
        .catalogName("testString")
        .build();

      NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1ConfigurationModel = new EnginePropertiesOaiGen1Configuration.Builder()
        .coordinator(nodeDescriptionBodyModel)
        .worker(nodeDescriptionBodyModel)
        .build();

      PrestoEnginePropertiesEventListener prestoEnginePropertiesEventListenerModel = new PrestoEnginePropertiesEventListener.Builder()
        .eventListenerProperty("testString")
        .build();

      PrestoEnginePropertiesGlobal prestoEnginePropertiesGlobalModel = new PrestoEnginePropertiesGlobal.Builder()
        .globalProperty("enable-mixed-case-support:true")
        .build();

      EnginePropertiesOaiGen1Jvm enginePropertiesOaiGen1JvmModel = new EnginePropertiesOaiGen1Jvm.Builder()
        .coordinator(nodeDescriptionBodyModel)
        .worker(nodeDescriptionBodyModel)
        .build();

      PrestoEnginePropertiesJMX prestoEnginePropertiesJmxModel = new PrestoEnginePropertiesJMX.Builder()
        .globalProperty("watsonx_data_presto_cluster_memory_manager_cluster_memory_bytes:presto.memory<name=ClusterMemoryManager><>ClusterMemoryBytes")
        .build();

      EnginePropertiesLogConfiguration enginePropertiesLogConfigurationModel = new EnginePropertiesLogConfiguration.Builder()
        .coordinator(nodeDescriptionBodyModel)
        .worker(nodeDescriptionBodyModel)
        .build();

      PrestoEngineEngineProperties prestoEngineEnginePropertiesModel = new PrestoEngineEngineProperties.Builder()
        .catalog(prestoEnginePropertiesCatalogModel)
        .configuration(enginePropertiesOaiGen1ConfigurationModel)
        .eventListener(prestoEnginePropertiesEventListenerModel)
        .global(prestoEnginePropertiesGlobalModel)
        .jvm(enginePropertiesOaiGen1JvmModel)
        .jmxExporterConfig(prestoEnginePropertiesJmxModel)
        .logConfig(enginePropertiesLogConfigurationModel)
        .build();

      RemoveEnginePropertiesOaiGenConfiguration removeEnginePropertiesOaiGenConfigurationModel = new RemoveEnginePropertiesOaiGenConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemoveEnginePropertiesOaiGenJvm removeEnginePropertiesOaiGenJvmModel = new RemoveEnginePropertiesOaiGenJvm.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEnginePropertiesModel = new PrestoEnginePatchRemoveEngineProperties.Builder()
        .catalog(prestoEnginePropertiesCatalogModel)
        .configuration(removeEnginePropertiesOaiGenConfigurationModel)
        .jvm(removeEnginePropertiesOaiGenJvmModel)
        .eventListener(java.util.Arrays.asList("testString"))
        .global(java.util.Arrays.asList("testString"))
        .jmxExporterConfig(java.util.Arrays.asList("testString"))
        .logConfig(removeEnginePropertiesLogConfigModel)
        .build();

      PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
        .description("updated description for presto engine")
        .engineDisplayName("sampleEngine")
        .engineProperties(prestoEngineEnginePropertiesModel)
        .engineRestart("force")
        .removeEngineProperties(prestoEnginePatchRemoveEnginePropertiesModel)
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestoEnginePatchModelAsPatch = prestoEnginePatchModel.asPatch();

      UpdatePrestoEngineOptions updatePrestoEngineOptions = new UpdatePrestoEngineOptions.Builder()
        .engineId("testString")
        .body(prestoEnginePatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.updatePrestoEngine(updatePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngine prestoEngineResult = response.getResult();
      assertNotNull(prestoEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestoEngine" })
  public void testListPrestoEngineCatalogs() throws Exception {
    try {
      ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptions = new ListPrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestoEngineCatalogs" })
  public void testCreatePrestoEngineCatalogs() throws Exception {
    try {
      CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptions = new CreatePrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.createPrestoEngineCatalogs(createPrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestoEngineCatalogs" })
  public void testGetPrestoEngineCatalog() throws Exception {
    try {
      GetPrestoEngineCatalogOptions getPrestoEngineCatalogOptions = new GetPrestoEngineCatalogOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.getPrestoEngineCatalog(getPrestoEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngineCatalog" })
  public void testPausePrestoEngine() throws Exception {
    try {
      PausePrestoEngineOptions pausePrestoEngineOptions = new PausePrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEnginePauseCreatedBody> response = service.pausePrestoEngine(pausePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreateEnginePauseCreatedBody createEnginePauseCreatedBodyResult = response.getResult();
      assertNotNull(createEnginePauseCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPausePrestoEngine" })
  public void testRunExplainStatement() throws Exception {
    try {
      RunExplainStatementOptions runExplainStatementOptions = new RunExplainStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .format("json")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RunExplainStatementOKBody> response = service.runExplainStatement(runExplainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RunExplainStatementOKBody runExplainStatementOkBodyResult = response.getResult();
      assertNotNull(runExplainStatementOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainStatement" })
  public void testRunExplainAnalyzeStatement() throws Exception {
    try {
      RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptions = new RunExplainAnalyzeStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RunExplainAnalyzeStatementOKBody> response = service.runExplainAnalyzeStatement(runExplainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RunExplainAnalyzeStatementOKBody runExplainAnalyzeStatementOkBodyResult = response.getResult();
      assertNotNull(runExplainAnalyzeStatementOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainAnalyzeStatement" })
  public void testRestartPrestoEngine() throws Exception {
    try {
      RestartPrestoEngineOptions restartPrestoEngineOptions = new RestartPrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineRestartCreatedBody> response = service.restartPrestoEngine(restartPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreateEngineRestartCreatedBody createEngineRestartCreatedBodyResult = response.getResult();
      assertNotNull(createEngineRestartCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRestartPrestoEngine" })
  public void testResumePrestoEngine() throws Exception {
    try {
      ResumePrestoEngineOptions resumePrestoEngineOptions = new ResumePrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineResumeCreatedBody> response = service.resumePrestoEngine(resumePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreateEngineResumeCreatedBody createEngineResumeCreatedBodyResult = response.getResult();
      assertNotNull(createEngineResumeCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResumePrestoEngine" })
  public void testScalePrestoEngine() throws Exception {
    try {
      NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      ScalePrestoEngineOptions scalePrestoEngineOptions = new ScalePrestoEngineOptions.Builder()
        .engineId("testString")
        .coordinator(nodeDescriptionModel)
        .worker(nodeDescriptionModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineScaleCreatedBody> response = service.scalePrestoEngine(scalePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      CreateEngineScaleCreatedBody createEngineScaleCreatedBodyResult = response.getResult();
      assertNotNull(createEngineScaleCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testScalePrestoEngine" })
  public void testGetSalIntegration() throws Exception {
    try {
      GetSalIntegrationOptions getSalIntegrationOptions = new GetSalIntegrationOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegration> response = service.getSalIntegration(getSalIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegration salIntegrationResult = response.getResult();
      assertNotNull(salIntegrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegration" })
  public void testCreateSalIntegration() throws Exception {
    try {
      CreateSalIntegrationOptions createSalIntegrationOptions = new CreateSalIntegrationOptions.Builder()
        .apikey("12efd3raq")
        .engineId("presto-01")
        .storageResourceCrn("crn:v1:staging:public:cloud-object-storage:global:a/a7026b374f39f570d20984c1ac6ecf63:5778e94f-c8c7-46a8-9878-d5eeadb51161")
        .storageType("bmcos_object_storage")
        .trialPlan(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegration> response = service.createSalIntegration(createSalIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SalIntegration salIntegrationResult = response.getResult();
      assertNotNull(salIntegrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegration" })
  public void testUpdateSalIntegration() throws Exception {
    try {
      SalIntegrationPatch salIntegrationPatchModel = new SalIntegrationPatch.Builder()
        .op("add")
        .path("storage")
        .value("new-apikey")
        .build();
      Map<String, Object> salIntegrationPatchModelAsPatch = salIntegrationPatchModel.asPatch();

      UpdateSalIntegrationOptions updateSalIntegrationOptions = new UpdateSalIntegrationOptions.Builder()
        .body(salIntegrationPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegration> response = service.updateSalIntegration(updateSalIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegration salIntegrationResult = response.getResult();
      assertNotNull(salIntegrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSalIntegration" })
  public void testCreateSalIntegrationEnrichment() throws Exception {
    try {
      EnrichmentObj enrichmentObjModel = new EnrichmentObj.Builder()
        .catalog("iceberg_data")
        .operation("create")
        .schema("testString")
        .tables(java.util.Arrays.asList("testString"))
        .build();

      CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions = new CreateSalIntegrationEnrichmentOptions.Builder()
        .enrichmentPrototype(enrichmentObjModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.createSalIntegrationEnrichment(createSalIntegrationEnrichmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegrationEnrichment" })
  public void testGetSalIntegrationEnrichmentAssets() throws Exception {
    try {
      GetSalIntegrationEnrichmentAssetsOptions getSalIntegrationEnrichmentAssetsOptions = new GetSalIntegrationEnrichmentAssetsOptions.Builder()
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentAssets> response = service.getSalIntegrationEnrichmentAssets(getSalIntegrationEnrichmentAssetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentAssets salIntegrationEnrichmentAssetsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentAssetsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentAssets" })
  public void testGetSalIntegrationEnrichmentDataAsset() throws Exception {
    try {
      GetSalIntegrationEnrichmentDataAssetOptions getSalIntegrationEnrichmentDataAssetOptions = new GetSalIntegrationEnrichmentDataAssetOptions.Builder()
        .projectId("testString")
        .assetId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentDataAsset> response = service.getSalIntegrationEnrichmentDataAsset(getSalIntegrationEnrichmentDataAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentDataAsset salIntegrationEnrichmentDataAssetResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentDataAssetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentDataAsset" })
  public void testGetSalIntegrationEnrichmentJobRunLogs() throws Exception {
    try {
      GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptions = new GetSalIntegrationEnrichmentJobRunLogsOptions.Builder()
        .jobId("testString")
        .jobRunId("testString")
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentJobRunLogs> response = service.getSalIntegrationEnrichmentJobRunLogs(getSalIntegrationEnrichmentJobRunLogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentJobRunLogs salIntegrationEnrichmentJobRunLogsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentJobRunLogsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentJobRunLogs" })
  public void testGetSalIntegrationEnrichmentJobRuns() throws Exception {
    try {
      GetSalIntegrationEnrichmentJobRunsOptions getSalIntegrationEnrichmentJobRunsOptions = new GetSalIntegrationEnrichmentJobRunsOptions.Builder()
        .jobId("testString")
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentJobRun> response = service.getSalIntegrationEnrichmentJobRuns(getSalIntegrationEnrichmentJobRunsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentJobRun salIntegrationEnrichmentJobRunResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentJobRunResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentJobRuns" })
  public void testGetSalIntegrationEnrichmentJobs() throws Exception {
    try {
      GetSalIntegrationEnrichmentJobsOptions getSalIntegrationEnrichmentJobsOptions = new GetSalIntegrationEnrichmentJobsOptions.Builder()
        .wkcProjectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentJobs> response = service.getSalIntegrationEnrichmentJobs(getSalIntegrationEnrichmentJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentJobs salIntegrationEnrichmentJobsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentJobsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentJobs" })
  public void testGetSalIntegrationGlossaryTerms() throws Exception {
    try {
      GetSalIntegrationGlossaryTermsOptions getSalIntegrationGlossaryTermsOptions = new GetSalIntegrationGlossaryTermsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationGlossaryTerms> response = service.getSalIntegrationGlossaryTerms(getSalIntegrationGlossaryTermsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationGlossaryTerms salIntegrationGlossaryTermsResult = response.getResult();
      assertNotNull(salIntegrationGlossaryTermsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationGlossaryTerms" })
  public void testGetSalIntegrationMappings() throws Exception {
    try {
      GetSalIntegrationMappingsOptions getSalIntegrationMappingsOptions = new GetSalIntegrationMappingsOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationMappings> response = service.getSalIntegrationMappings(getSalIntegrationMappingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationMappings salIntegrationMappingsResult = response.getResult();
      assertNotNull(salIntegrationMappingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationMappings" })
  public void testGetSalIntegrationEnrichmentGlobalSettings() throws Exception {
    try {
      GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptions = new GetSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentSettings> response = service.getSalIntegrationEnrichmentGlobalSettings(getSalIntegrationEnrichmentGlobalSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettingsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentGlobalSettings" })
  public void testCreateSalIntegrationEnrichmentGlobalSettings() throws Exception {
    try {
      SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.14"))
        .suggestionThreshold(Double.valueOf("0.9"))
        .build();

      SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.1"))
        .suggestionThreshold(Double.valueOf("0.1"))
        .build();

      SalIntegrationEnrichmentSettingsSemanticExpansion salIntegrationEnrichmentSettingsSemanticExpansionModel = new SalIntegrationEnrichmentSettingsSemanticExpansion.Builder()
        .descriptionGeneration(true)
        .descriptionGenerationConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel)
        .nameExpansion(true)
        .nameExpansionConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel)
        .build();

      SalIntegrationEnrichmentSettingsTermAssignment salIntegrationEnrichmentSettingsTermAssignmentModel = new SalIntegrationEnrichmentSettingsTermAssignment.Builder()
        .classBasedAssignments(false)
        .evaluateNegativeAssignments(false)
        .llmBasedAssignments(false)
        .mlBasedAssignmentsCustom(false)
        .mlBasedAssignmentsDefault(false)
        .nameMatching(false)
        .termAssignmentThreshold(Double.valueOf("0.3"))
        .termSuggestionThreshold(Double.valueOf("0.4"))
        .build();

      CreateSalIntegrationEnrichmentGlobalSettingsOptions createSalIntegrationEnrichmentGlobalSettingsOptions = new CreateSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
        .semanticExpansion(salIntegrationEnrichmentSettingsSemanticExpansionModel)
        .termAssignment(salIntegrationEnrichmentSettingsTermAssignmentModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentSettings> response = service.createSalIntegrationEnrichmentGlobalSettings(createSalIntegrationEnrichmentGlobalSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettingsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegrationEnrichmentGlobalSettings" })
  public void testGetSalIntegrationEnrichmentSettings() throws Exception {
    try {
      GetSalIntegrationEnrichmentSettingsOptions getSalIntegrationEnrichmentSettingsOptions = new GetSalIntegrationEnrichmentSettingsOptions.Builder()
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationEnrichmentSettings> response = service.getSalIntegrationEnrichmentSettings(getSalIntegrationEnrichmentSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettingsResult = response.getResult();
      assertNotNull(salIntegrationEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentSettings" })
  public void testCreateSalIntegrationEnrichmentSettings() throws Exception {
    try {
      SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.14"))
        .suggestionThreshold(Double.valueOf("0.9"))
        .build();

      SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.1"))
        .suggestionThreshold(Double.valueOf("0.1"))
        .build();

      SalIntegrationEnrichmentSettingsSemanticExpansion salIntegrationEnrichmentSettingsSemanticExpansionModel = new SalIntegrationEnrichmentSettingsSemanticExpansion.Builder()
        .descriptionGeneration(true)
        .descriptionGenerationConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel)
        .nameExpansion(true)
        .nameExpansionConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel)
        .build();

      SalIntegrationEnrichmentSettingsTermAssignment salIntegrationEnrichmentSettingsTermAssignmentModel = new SalIntegrationEnrichmentSettingsTermAssignment.Builder()
        .classBasedAssignments(false)
        .evaluateNegativeAssignments(false)
        .llmBasedAssignments(false)
        .mlBasedAssignmentsCustom(false)
        .mlBasedAssignmentsDefault(false)
        .nameMatching(false)
        .termAssignmentThreshold(Double.valueOf("0.3"))
        .termSuggestionThreshold(Double.valueOf("0.4"))
        .build();

      CreateSalIntegrationEnrichmentSettingsOptions createSalIntegrationEnrichmentSettingsOptions = new CreateSalIntegrationEnrichmentSettingsOptions.Builder()
        .semanticExpansion(salIntegrationEnrichmentSettingsSemanticExpansionModel)
        .termAssignment(salIntegrationEnrichmentSettingsTermAssignmentModel)
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.createSalIntegrationEnrichmentSettings(createSalIntegrationEnrichmentSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegrationEnrichmentSettings" })
  public void testCreateSalIntegrationUploadGlossary() throws Exception {
    try {
      CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptions = new CreateSalIntegrationUploadGlossaryOptions.Builder()
        .replaceOption("all")
        .glossaryCsv(TestUtilities.createMockStream("This is a mock file."))
        .glossaryCsvContentType("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationUploadGlossary> response = service.createSalIntegrationUploadGlossary(createSalIntegrationUploadGlossaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SalIntegrationUploadGlossary salIntegrationUploadGlossaryResult = response.getResult();
      assertNotNull(salIntegrationUploadGlossaryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegrationUploadGlossary" })
  public void testGetSalIntegrationUploadGlossaryStatus() throws Exception {
    try {
      GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptions = new GetSalIntegrationUploadGlossaryStatusOptions.Builder()
        .processId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationUploadGlossaryStatus> response = service.getSalIntegrationUploadGlossaryStatus(getSalIntegrationUploadGlossaryStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalIntegrationUploadGlossaryStatus salIntegrationUploadGlossaryStatusResult = response.getResult();
      assertNotNull(salIntegrationUploadGlossaryStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationUploadGlossaryStatus" })
  public void testListSparkEngines() throws Exception {
    try {
      ListSparkEnginesOptions listSparkEnginesOptions = new ListSparkEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngineCollection> response = service.listSparkEngines(listSparkEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineCollection sparkEngineCollectionResult = response.getResult();
      assertNotNull(sparkEngineCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngines" })
  public void testCreateSparkEngine() throws Exception {
    try {
      SparkDefaultConfig sparkDefaultConfigModel = new SparkDefaultConfig.Builder()
        .config1("testString")
        .config2("testString")
        .build();

      SparkScaleConfig sparkScaleConfigModel = new SparkScaleConfig.Builder()
        .autoScaleEnabled(true)
        .currentNumberOfNodes(Long.valueOf("2"))
        .maximumNumberOfNodes(Long.valueOf("5"))
        .minimumNumberOfNodes(Long.valueOf("1"))
        .nodeType("small")
        .numberOfNodes(Long.valueOf("5"))
        .build();

      SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
        .apiKey("apikey")
        .connectionString("1.2.3.4")
        .defaultConfig(sparkDefaultConfigModel)
        .defaultVersion("3.3")
        .engineHomeBucketDisplayName("test-spark-bucket")
        .engineHomeBucketName("4fec0f8b-888a-4c16-8f38-250c8499e6ce-customer")
        .engineHomePath("spark/spark1234")
        .engineHomeVolumeId("1704979825978585")
        .engineHomeVolumeName("my-volume")
        .engineHomeVolumeStorageClass("nfs-client")
        .engineHomeVolumeStorageSize("5Gi")
        .engineSubType("java/cpp")
        .instanceId("spark-id")
        .managedBy("fully/self")
        .scaleConfig(sparkScaleConfigModel)
        .build();

      CreateSparkEngineOptions createSparkEngineOptions = new CreateSparkEngineOptions.Builder()
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("iceberg-data"))
        .description("testString")
        .engineDetails(sparkEngineDetailsPrototypeModel)
        .engineDisplayName("test-native")
        .status("testString")
        .tags(java.util.Arrays.asList("testString"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngine> response = service.createSparkEngine(createSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      SparkEngine sparkEngineResult = response.getResult();
      assertNotNull(sparkEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngine" })
  public void testGetSparkEngine() throws Exception {
    try {
      GetSparkEngineOptions getSparkEngineOptions = new GetSparkEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngine> response = service.getSparkEngine(getSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngine sparkEngineResult = response.getResult();
      assertNotNull(sparkEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngine" })
  public void testUpdateSparkEngine() throws Exception {
    try {
      SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
        .cores("1")
        .memory("4G")
        .build();

      UpdateSparkEngineBodyEngineDetails updateSparkEngineBodyEngineDetailsModel = new UpdateSparkEngineBodyEngineDetails.Builder()
        .defaultConfig(java.util.Collections.singletonMap("key1", "testString"))
        .defaultVersion("3.4")
        .engineHomeBucketName("test-spark-bucket")
        .resourceLimitEnabled(true)
        .resourceLimits(sparkEngineResourceLimitModel)
        .build();

      UpdateSparkEngineBody updateSparkEngineBodyModel = new UpdateSparkEngineBody.Builder()
        .description("Updated Description")
        .engineDetails(updateSparkEngineBodyEngineDetailsModel)
        .engineDisplayName("Updated Display Name")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> updateSparkEngineBodyModelAsPatch = updateSparkEngineBodyModel.asPatch();

      UpdateSparkEngineOptions updateSparkEngineOptions = new UpdateSparkEngineOptions.Builder()
        .engineId("testString")
        .body(updateSparkEngineBodyModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngine> response = service.updateSparkEngine(updateSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngine sparkEngineResult = response.getResult();
      assertNotNull(sparkEngineResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSparkEngine" })
  public void testListSparkEngineApplications() throws Exception {
    try {
      ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions = new ListSparkEngineApplicationsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .state(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<SparkEngineApplicationStatusCollection> response = service.listSparkEngineApplications(listSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationStatusCollection sparkEngineApplicationStatusCollectionResult = response.getResult();
      assertNotNull(sparkEngineApplicationStatusCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineApplications" })
  public void testCreateSparkEngineApplication() throws Exception {
    try {
      SparkApplicationConfig sparkApplicationConfigModel = new SparkApplicationConfig.Builder()
        .sparkSampleConfigProperpty("testString")
        .build();

      SparkApplicationEnv sparkApplicationEnvModel = new SparkApplicationEnv.Builder()
        .sampleEnvKey("testString")
        .build();

      SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
        .application("/opt/ibm/spark/examples/src/main/python/wordcount.py")
        .arguments(java.util.Arrays.asList("/opt/ibm/spark/examples/src/main/resources/people.txt"))
        .xClass("org.apache.spark.examples.SparkPi")
        .conf(sparkApplicationConfigModel)
        .env(sparkApplicationEnvModel)
        .files("s3://mybucket/myfile.txt")
        .jars("testString")
        .name("SparkApplicaton1")
        .packages("org.apache.spark:example_1.2.3")
        .repositories("https://repo1.maven.org/maven2/")
        .sparkVersion("3.3")
        .build();

      SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
        .mountPath("/mount/path")
        .name("my-volume")
        .readOnly(true)
        .sourceSubPath("/source/path")
        .build();

      CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions = new CreateSparkEngineApplicationOptions.Builder()
        .engineId("testString")
        .applicationDetails(sparkApplicationDetailsModel)
        .jobEndpoint("testString")
        .serviceInstanceId("testString")
        .type("iae")
        .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
        .authInstanceId("testString")
        .state(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<SparkEngineApplicationStatus> response = service.createSparkEngineApplication(createSparkEngineApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SparkEngineApplicationStatus sparkEngineApplicationStatusResult = response.getResult();
      assertNotNull(sparkEngineApplicationStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngineApplication" })
  public void testGetSparkEngineApplicationStatus() throws Exception {
    try {
      GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptions = new GetSparkEngineApplicationStatusOptions.Builder()
        .engineId("testString")
        .applicationId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngineApplicationStatus> response = service.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationStatus sparkEngineApplicationStatusResult = response.getResult();
      assertNotNull(sparkEngineApplicationStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineApplicationStatus" })
  public void testListSparkEngineCatalogs() throws Exception {
    try {
      ListSparkEngineCatalogsOptions listSparkEngineCatalogsOptions = new ListSparkEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listSparkEngineCatalogs(listSparkEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineCatalogs" })
  public void testCreateSparkEngineCatalogs() throws Exception {
    try {
      CreateSparkEngineCatalogsOptions createSparkEngineCatalogsOptions = new CreateSparkEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.createSparkEngineCatalogs(createSparkEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngineCatalogs" })
  public void testGetSparkEngineCatalog() throws Exception {
    try {
      GetSparkEngineCatalogOptions getSparkEngineCatalogOptions = new GetSparkEngineCatalogOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.getSparkEngineCatalog(getSparkEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineCatalog" })
  public void testGetSparkEngineHistoryServer() throws Exception {
    try {
      GetSparkEngineHistoryServerOptions getSparkEngineHistoryServerOptions = new GetSparkEngineHistoryServerOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkHistoryServer> response = service.getSparkEngineHistoryServer(getSparkEngineHistoryServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkHistoryServer sparkHistoryServerResult = response.getResult();
      assertNotNull(sparkHistoryServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineHistoryServer" })
  public void testStartSparkEngineHistoryServer() throws Exception {
    try {
      StartSparkEngineHistoryServerOptions startSparkEngineHistoryServerOptions = new StartSparkEngineHistoryServerOptions.Builder()
        .engineId("testString")
        .cores("1")
        .memory("4G")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkHistoryServer> response = service.startSparkEngineHistoryServer(startSparkEngineHistoryServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SparkHistoryServer sparkHistoryServerResult = response.getResult();
      assertNotNull(sparkHistoryServerResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStartSparkEngineHistoryServer" })
  public void testPauseSparkEngine() throws Exception {
    try {
      PauseSparkEngineOptions pauseSparkEngineOptions = new PauseSparkEngineOptions.Builder()
        .engineId("testString")
        .force(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.pauseSparkEngine(pauseSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPauseSparkEngine" })
  public void testResumeSparkEngine() throws Exception {
    try {
      ResumeSparkEngineOptions resumeSparkEngineOptions = new ResumeSparkEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.resumeSparkEngine(resumeSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResumeSparkEngine" })
  public void testScaleSparkEngine() throws Exception {
    try {
      ScaleSparkEngineOptions scaleSparkEngineOptions = new ScaleSparkEngineOptions.Builder()
        .engineId("testString")
        .numberOfNodes(Long.valueOf("2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.scaleSparkEngine(scaleSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testScaleSparkEngine" })
  public void testListSparkVersions() throws Exception {
    try {
      ListSparkVersionsOptions listSparkVersionsOptions = new ListSparkVersionsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListSparkVersionsOKBody> response = service.listSparkVersions(listSparkVersionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSparkVersionsOKBody listSparkVersionsOkBodyResult = response.getResult();
      assertNotNull(listSparkVersionsOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkVersions" })
  public void testListCatalogs() throws Exception {
    try {
      ListCatalogsOptions listCatalogsOptions = new ListCatalogsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listCatalogs(listCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListCatalogs" })
  public void testGetCatalog() throws Exception {
    try {
      GetCatalogOptions getCatalogOptions = new GetCatalogOptions.Builder()
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.getCatalog(getCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();
      assertNotNull(catalogResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCatalog" })
  public void testListSchemas() throws Exception {
    try {
      ListSchemasOptions listSchemasOptions = new ListSchemasOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListSchemasOKBody> response = service.listSchemas(listSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSchemasOKBody listSchemasOkBodyResult = response.getResult();
      assertNotNull(listSchemasOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSchemas" })
  public void testCreateSchema() throws Exception {
    try {
      CreateSchemaOptions createSchemaOptions = new CreateSchemaOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .customPath("sample-path")
        .schemaName("SampleSchema1")
        .bucketName("sample-bucket")
        .hostname("db2@hostname.com")
        .port(Long.valueOf("4553"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateSchemaCreatedBody> response = service.createSchema(createSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateSchemaCreatedBody createSchemaCreatedBodyResult = response.getResult();
      assertNotNull(createSchemaCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSchema" })
  public void testListTables() throws Exception {
    try {
      ListTablesOptions listTablesOptions = new ListTablesOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableCollection> response = service.listTables(listTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableCollection tableCollectionResult = response.getResult();
      assertNotNull(tableCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListTables" })
  public void testGetTable() throws Exception {
    try {
      GetTableOptions getTableOptions = new GetTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .type("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Table> response = service.getTable(getTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Table tableResult = response.getResult();
      assertNotNull(tableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTable" })
  public void testUpdateTable() throws Exception {
    try {
      TablePatch tablePatchModel = new TablePatch.Builder()
        .tableName("updated_table_name")
        .build();
      Map<String, Object> tablePatchModelAsPatch = tablePatchModel.asPatch();

      UpdateTableOptions updateTableOptions = new UpdateTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .body(tablePatchModelAsPatch)
        .type("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Table> response = service.updateTable(updateTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Table tableResult = response.getResult();
      assertNotNull(tableResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateTable" })
  public void testListColumns() throws Exception {
    try {
      ListColumnsOptions listColumnsOptions = new ListColumnsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnCollection> response = service.listColumns(listColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ColumnCollection columnCollectionResult = response.getResult();
      assertNotNull(columnCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListColumns" })
  public void testCreateColumns() throws Exception {
    try {
      Column columnModel = new Column.Builder()
        .columnName("expenses")
        .comment("expenses column")
        .extra("varchar")
        .length("30")
        .precision("10")
        .scale("2")
        .type("varchar")
        .build();

      CreateColumnsOptions createColumnsOptions = new CreateColumnsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columns(java.util.Arrays.asList(columnModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnCollection> response = service.createColumns(createColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ColumnCollection columnCollectionResult = response.getResult();
      assertNotNull(columnCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateColumns" })
  public void testUpdateColumn() throws Exception {
    try {
      ColumnPatch columnPatchModel = new ColumnPatch.Builder()
        .columnName("expenses")
        .build();
      Map<String, Object> columnPatchModelAsPatch = columnPatchModel.asPatch();

      UpdateColumnOptions updateColumnOptions = new UpdateColumnOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columnId("testString")
        .body(columnPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Column> response = service.updateColumn(updateColumnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Column columnResult = response.getResult();
      assertNotNull(columnResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateColumn" })
  public void testListTableSnapshots() throws Exception {
    try {
      ListTableSnapshotsOptions listTableSnapshotsOptions = new ListTableSnapshotsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableSnapshotCollection> response = service.listTableSnapshots(listTableSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableSnapshotCollection tableSnapshotCollectionResult = response.getResult();
      assertNotNull(tableSnapshotCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListTableSnapshots" })
  public void testRollbackTable() throws Exception {
    try {
      RollbackTableOptions rollbackTableOptions = new RollbackTableOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .snapshotId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ReplaceSnapshotCreatedBody> response = service.rollbackTable(rollbackTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReplaceSnapshotCreatedBody replaceSnapshotCreatedBodyResult = response.getResult();
      assertNotNull(replaceSnapshotCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRollbackTable" })
  public void testUpdateSyncCatalog() throws Exception {
    try {
      SyncCatalogs syncCatalogsModel = new SyncCatalogs.Builder()
        .autoAddNewTables(true)
        .syncIcebergMd(true)
        .build();
      Map<String, Object> syncCatalogsModelAsPatch = syncCatalogsModel.asPatch();

      UpdateSyncCatalogOptions updateSyncCatalogOptions = new UpdateSyncCatalogOptions.Builder()
        .catalogId("testString")
        .body(syncCatalogsModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateSyncCatalogOKBody> response = service.updateSyncCatalog(updateSyncCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateSyncCatalogOKBody updateSyncCatalogOkBodyResult = response.getResult();
      assertNotNull(updateSyncCatalogOkBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSyncCatalog" })
  public void testListMilvusServices() throws Exception {
    try {
      ListMilvusServicesOptions listMilvusServicesOptions = new ListMilvusServicesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusServiceCollection> response = service.listMilvusServices(listMilvusServicesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusServiceCollection milvusServiceCollectionResult = response.getResult();
      assertNotNull(milvusServiceCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMilvusServices" })
  public void testCreateMilvusService() throws Exception {
    try {
      CreateMilvusServiceOptions createMilvusServiceOptions = new CreateMilvusServiceOptions.Builder()
        .bucketName("Sample bucket name")
        .origin("native")
        .rootPath("Sample path")
        .serviceDisplayName("sampleService")
        .bucketType("Sample bucket type")
        .description("milvus service for running sql queries")
        .indexType("FLAT")
        .iwCpu(Long.valueOf("1"))
        .iwMemory(Long.valueOf("1"))
        .iwReplicas(Long.valueOf("1"))
        .managedBy("customer")
        .qwCpu(Long.valueOf("1"))
        .qwMemory(Long.valueOf("1"))
        .qwReplicas(Long.valueOf("1"))
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .tshirtSize("small")
        .vectorDimension(Long.valueOf("384"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.createMilvusService(createMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      MilvusService milvusServiceResult = response.getResult();
      assertNotNull(milvusServiceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMilvusService" })
  public void testGetMilvusService() throws Exception {
    try {
      GetMilvusServiceOptions getMilvusServiceOptions = new GetMilvusServiceOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.getMilvusService(getMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusService milvusServiceResult = response.getResult();
      assertNotNull(milvusServiceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMilvusService" })
  public void testUpdateMilvusService() throws Exception {
    try {
      MilvusServicePatch milvusServicePatchModel = new MilvusServicePatch.Builder()
        .description("updated description for milvus service")
        .serviceDisplayName("sampleService")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> milvusServicePatchModelAsPatch = milvusServicePatchModel.asPatch();

      UpdateMilvusServiceOptions updateMilvusServiceOptions = new UpdateMilvusServiceOptions.Builder()
        .serviceId("testString")
        .body(milvusServicePatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.updateMilvusService(updateMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusService milvusServiceResult = response.getResult();
      assertNotNull(milvusServiceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMilvusService" })
  public void testUpdateMilvusServiceBucket() throws Exception {
    try {
      MilvusServiceBucketPatch milvusServiceBucketPatchModel = new MilvusServiceBucketPatch.Builder()
        .bucketName("Sample bucket name")
        .managedBy("customer")
        .rootPath("Sample path")
        .tshirtSize("small")
        .build();
      Map<String, Object> milvusServiceBucketPatchModelAsPatch = milvusServiceBucketPatchModel.asPatch();

      UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptions = new UpdateMilvusServiceBucketOptions.Builder()
        .serviceId("testString")
        .body(milvusServiceBucketPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.updateMilvusServiceBucket(updateMilvusServiceBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusService milvusServiceResult = response.getResult();
      assertNotNull(milvusServiceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMilvusServiceBucket" })
  public void testListMilvusServiceDatabases() throws Exception {
    try {
      ListMilvusServiceDatabasesOptions listMilvusServiceDatabasesOptions = new ListMilvusServiceDatabasesOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusServiceDatabases> response = service.listMilvusServiceDatabases(listMilvusServiceDatabasesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusServiceDatabases milvusServiceDatabasesResult = response.getResult();
      assertNotNull(milvusServiceDatabasesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMilvusServiceDatabases" })
  public void testListMilvusDatabaseCollections() throws Exception {
    try {
      ListMilvusDatabaseCollectionsOptions listMilvusDatabaseCollectionsOptions = new ListMilvusDatabaseCollectionsOptions.Builder()
        .serviceId("testString")
        .databaseId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusDatabaseCollections> response = service.listMilvusDatabaseCollections(listMilvusDatabaseCollectionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusDatabaseCollections milvusDatabaseCollectionsResult = response.getResult();
      assertNotNull(milvusDatabaseCollectionsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMilvusDatabaseCollections" })
  public void testCreateMilvusServicePause() throws Exception {
    try {
      CreateMilvusServicePauseOptions createMilvusServicePauseOptions = new CreateMilvusServicePauseOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createMilvusServicePause(createMilvusServicePauseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMilvusServicePause" })
  public void testCreateMilvusServiceResume() throws Exception {
    try {
      CreateMilvusServiceResumeOptions createMilvusServiceResumeOptions = new CreateMilvusServiceResumeOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createMilvusServiceResume(createMilvusServiceResumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMilvusServiceResume" })
  public void testCreateMilvusServiceScale() throws Exception {
    try {
      CreateMilvusServiceScaleOptions createMilvusServiceScaleOptions = new CreateMilvusServiceScaleOptions.Builder()
        .serviceId("testString")
        .tshirtSize("testString")
        .indexType("FLAT")
        .iwCpu(Long.valueOf("1"))
        .iwMemory(Long.valueOf("1"))
        .iwReplicas(Long.valueOf("1"))
        .milvusName("milvus123")
        .qwCpu(Long.valueOf("1"))
        .qwMemory(Long.valueOf("1"))
        .qwReplicas(Long.valueOf("1"))
        .vectorDimension(Long.valueOf("384"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createMilvusServiceScale(createMilvusServiceScaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMilvusServiceScale" })
  public void testListIngestionJobs() throws Exception {
    try {
      ListIngestionJobsOptions listIngestionJobsOptions = new ListIngestionJobsOptions.Builder()
        .authInstanceId("testString")
        .start("1")
        .jobsPerPage(Long.valueOf("1"))
        .build();

      // Invoke operation
      Response<IngestionJobCollection> response = service.listIngestionJobs(listIngestionJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IngestionJobCollection ingestionJobCollectionResult = response.getResult();
      assertNotNull(ingestionJobCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIngestionJobs" })
  public void testListIngestionJobsWithPager() throws Exception {
    try {
      ListIngestionJobsOptions options = new ListIngestionJobsOptions.Builder()
        .authInstanceId("testString")
        .jobsPerPage(Long.valueOf("1"))
        .build();

      // Test getNext().
      List<IngestionJob> allResults = new ArrayList<>();
      IngestionJobsPager pager = new IngestionJobsPager(service, options);
      while (pager.hasNext()) {
        List<IngestionJob> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new IngestionJobsPager(service, options);
      List<IngestionJob> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListIngestionJobs" })
  public void testCreateIngestionJobs() throws Exception {
    try {
      IngestionJobPrototypeCsvProperty ingestionJobPrototypeCsvPropertyModel = new IngestionJobPrototypeCsvProperty.Builder()
        .encoding("utf-8")
        .escapeCharacter("\\\\")
        .fieldDelimiter(",")
        .header(true)
        .lineDelimiter("\\n")
        .build();

      IngestionJobPrototypeExecuteConfig ingestionJobPrototypeExecuteConfigModel = new IngestionJobPrototypeExecuteConfig.Builder()
        .driverCores(Long.valueOf("1"))
        .driverMemory("2G")
        .executorCores(Long.valueOf("1"))
        .executorMemory("2G")
        .numExecutors(Long.valueOf("1"))
        .build();

      CreateIngestionJobsOptions createIngestionJobsOptions = new CreateIngestionJobsOptions.Builder()
        .authInstanceId("testString")
        .jobId("ingestion-1699459946935")
        .sourceDataFiles("s3://demobucket/data/yellow_tripdata_2022-01.parquet")
        .targetTable("demodb.test.targettable")
        .username("user1")
        .createIfNotExist(false)
        .csvProperty(ingestionJobPrototypeCsvPropertyModel)
        .engineId("spark123")
        .executeConfig(ingestionJobPrototypeExecuteConfigModel)
        .partitionBy("col1, col2")
        .schema("{\"type\":\"struct\",\"schema-id\":0,\"fields\":[{\"id\":1,\"name\":\"ID\",\"required\":true,\"type\":\"int\"},{\"id\":2,\"name\":\"Name\",\"required\":true,\"type\":\"string\"}]}")
        .sourceFileType("csv")
        .validateCsvHeader(false)
        .build();

      // Invoke operation
      Response<IngestionJob> response = service.createIngestionJobs(createIngestionJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      IngestionJob ingestionJobResult = response.getResult();
      assertNotNull(ingestionJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIngestionJobs" })
  public void testCreateIngestionJobsLocalFiles() throws Exception {
    try {
      CreateIngestionJobsLocalFilesOptions createIngestionJobsLocalFilesOptions = new CreateIngestionJobsLocalFilesOptions.Builder()
        .authInstanceId("testString")
        .sourceDataFile(TestUtilities.createMockStream("This is a mock file."))
        .targetTable("testString")
        .jobId("testString")
        .username("testString")
        .sourceDataFileContentType("testString")
        .sourceFileType("csv")
        .csvProperty("testString")
        .createIfNotExist(false)
        .validateCsvHeader(false)
        .executeConfig("testString")
        .engineId("testString")
        .build();

      // Invoke operation
      Response<IngestionJob> response = service.createIngestionJobsLocalFiles(createIngestionJobsLocalFilesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      IngestionJob ingestionJobResult = response.getResult();
      assertNotNull(ingestionJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIngestionJobsLocalFiles" })
  public void testGetIngestionJob() throws Exception {
    try {
      GetIngestionJobOptions getIngestionJobOptions = new GetIngestionJobOptions.Builder()
        .jobId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<IngestionJob> response = service.getIngestionJob(getIngestionJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IngestionJob ingestionJobResult = response.getResult();
      assertNotNull(ingestionJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetIngestionJob" })
  public void testCreatePreviewIngestionFile() throws Exception {
    try {
      PreviewIngestionFilePrototypeCsvProperty previewIngestionFilePrototypeCsvPropertyModel = new PreviewIngestionFilePrototypeCsvProperty.Builder()
        .encoding("utf-8")
        .escapeCharacter("\\\\")
        .fieldDelimiter(",")
        .header(true)
        .lineDelimiter("\\n")
        .build();

      CreatePreviewIngestionFileOptions createPreviewIngestionFileOptions = new CreatePreviewIngestionFileOptions.Builder()
        .authInstanceId("testString")
        .sourceDataFiles("s3://demobucket/data/yellow_tripdata_2022-01.parquet")
        .csvProperty(previewIngestionFilePrototypeCsvPropertyModel)
        .sourceFileType("csv")
        .build();

      // Invoke operation
      Response<PreviewIngestionFile> response = service.createPreviewIngestionFile(createPreviewIngestionFileOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PreviewIngestionFile previewIngestionFileResult = response.getResult();
      assertNotNull(previewIngestionFileResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePreviewIngestionFile" })
  public void testGetEndpoints() throws Exception {
    try {
      GetEndpointsOptions getEndpointsOptions = new GetEndpointsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<EndpointCollection> response = service.getEndpoints(getEndpointsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EndpointCollection endpointCollectionResult = response.getResult();
      assertNotNull(endpointCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEndpoints" })
  public void testRegisterTable() throws Exception {
    try {
      RegisterTableOptions registerTableOptions = new RegisterTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .metadataLocation("s3a://bucketname/path/to/table/metadata_location/_delta_log")
        .tableName("table1")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RegisterTableCreatedBody> response = service.registerTable(registerTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RegisterTableCreatedBody registerTableCreatedBodyResult = response.getResult();
      assertNotNull(registerTableCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRegisterTable" })
  public void testLoadTable() throws Exception {
    try {
      LoadTableOptions loadTableOptions = new LoadTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<LoadTableResponse> response = service.loadTable(loadTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LoadTableResponse loadTableResponseResult = response.getResult();
      assertNotNull(loadTableResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testLoadTable" })
  public void testGetAllColumns() throws Exception {
    try {
      GetAllColumnsOptions getAllColumnsOptions = new GetAllColumnsOptions.Builder()
        .tableName("testString")
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnsResponse> response = service.getAllColumns(getAllColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ColumnsResponse columnsResponseResult = response.getResult();
      assertNotNull(columnsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllColumns" })
  public void testListAllSchemas() throws Exception {
    try {
      ListAllSchemasOptions listAllSchemasOptions = new ListAllSchemasOptions.Builder()
        .catalogName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemaResponseCollection> response = service.listAllSchemas(listAllSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchemaResponseCollection schemaResponseCollectionResult = response.getResult();
      assertNotNull(schemaResponseCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllSchemas" })
  public void testGetSchemaDetails() throws Exception {
    try {
      GetSchemaDetailsOptions getSchemaDetailsOptions = new GetSchemaDetailsOptions.Builder()
        .schemaName("testString")
        .catalogName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemaResponse> response = service.getSchemaDetails(getSchemaDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchemaResponse schemaResponseResult = response.getResult();
      assertNotNull(schemaResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSchemaDetails" })
  public void testListAllTables() throws Exception {
    try {
      ListAllTablesOptions listAllTablesOptions = new ListAllTablesOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableResponseCollection> response = service.listAllTables(listAllTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableResponseCollection tableResponseCollectionResult = response.getResult();
      assertNotNull(tableResponseCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllTables" })
  public void testGetTableDetails() throws Exception {
    try {
      GetTableDetailsOptions getTableDetailsOptions = new GetTableDetailsOptions.Builder()
        .tableName("testString")
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableResponse> response = service.getTableDetails(getTableDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableResponse tableResponseResult = response.getResult();
      assertNotNull(tableResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTableDetails" })
  public void testDeleteBucketRegistration() throws Exception {
    try {
      DeleteBucketRegistrationOptions deleteBucketRegistrationOptions = new DeleteBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBucketRegistration(deleteBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBucketRegistration" })
  public void testDeleteDeactivateBucket() throws Exception {
    try {
      DeleteDeactivateBucketOptions deleteDeactivateBucketOptions = new DeleteDeactivateBucketOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDeactivateBucket(deleteDeactivateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDeactivateBucket" })
  public void testDeleteDatabaseCatalog() throws Exception {
    try {
      DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions = new DeleteDatabaseCatalogOptions.Builder()
        .databaseId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDatabaseCatalog(deleteDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDatabaseCatalog" })
  public void testDeleteOtherEngine() throws Exception {
    try {
      DeleteOtherEngineOptions deleteOtherEngineOptions = new DeleteOtherEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteOtherEngine(deleteOtherEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteOtherEngine" })
  public void testDeleteIntegration() throws Exception {
    try {
      DeleteIntegrationOptions deleteIntegrationOptions = new DeleteIntegrationOptions.Builder()
        .integrationId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteIntegration(deleteIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteIntegration" })
  public void testDeleteDb2Engine() throws Exception {
    try {
      DeleteDb2EngineOptions deleteDb2EngineOptions = new DeleteDb2EngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDb2Engine(deleteDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDb2Engine" })
  public void testDeleteNetezzaEngine() throws Exception {
    try {
      DeleteNetezzaEngineOptions deleteNetezzaEngineOptions = new DeleteNetezzaEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteNetezzaEngine(deleteNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteNetezzaEngine" })
  public void testDeletePrestissimoEngine() throws Exception {
    try {
      DeletePrestissimoEngineOptions deletePrestissimoEngineOptions = new DeletePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestissimoEngine(deletePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestissimoEngine" })
  public void testDeletePrestissimoEngineCatalogs() throws Exception {
    try {
      DeletePrestissimoEngineCatalogsOptions deletePrestissimoEngineCatalogsOptions = new DeletePrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestissimoEngineCatalogs(deletePrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestissimoEngineCatalogs" })
  public void testDeleteEngine() throws Exception {
    try {
      DeleteEngineOptions deleteEngineOptions = new DeleteEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteEngine(deleteEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteEngine" })
  public void testDeletePrestoEngineCatalogs() throws Exception {
    try {
      DeletePrestoEngineCatalogsOptions deletePrestoEngineCatalogsOptions = new DeletePrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestoEngineCatalogs(deletePrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestoEngineCatalogs" })
  public void testDeleteSalIntegration() throws Exception {
    try {
      DeleteSalIntegrationOptions deleteSalIntegrationOptions = new DeleteSalIntegrationOptions();

      // Invoke operation
      Response<Void> response = service.deleteSalIntegration(deleteSalIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSalIntegration" })
  public void testDeleteSparkEngine() throws Exception {
    try {
      DeleteSparkEngineOptions deleteSparkEngineOptions = new DeleteSparkEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngine(deleteSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngine" })
  public void testDeleteSparkEngineApplications() throws Exception {
    try {
      DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptions = new DeleteSparkEngineApplicationsOptions.Builder()
        .engineId("testString")
        .applicationId("testString")
        .authInstanceId("testString")
        .state(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngineApplications(deleteSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngineApplications" })
  public void testDeleteSparkEngineCatalogs() throws Exception {
    try {
      DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptions = new DeleteSparkEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngineCatalogs(deleteSparkEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngineCatalogs" })
  public void testDeleteSparkEngineHistoryServer() throws Exception {
    try {
      DeleteSparkEngineHistoryServerOptions deleteSparkEngineHistoryServerOptions = new DeleteSparkEngineHistoryServerOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngineHistoryServer(deleteSparkEngineHistoryServerOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngineHistoryServer" })
  public void testDeleteSchema() throws Exception {
    try {
      DeleteSchemaOptions deleteSchemaOptions = new DeleteSchemaOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSchema(deleteSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSchema" })
  public void testDeleteTable() throws Exception {
    try {
      DeleteTableOptions deleteTableOptions = new DeleteTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .type("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteTable(deleteTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteTable" })
  public void testDeleteColumn() throws Exception {
    try {
      DeleteColumnOptions deleteColumnOptions = new DeleteColumnOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columnId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteColumn(deleteColumnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteColumn" })
  public void testDeleteMilvusService() throws Exception {
    try {
      DeleteMilvusServiceOptions deleteMilvusServiceOptions = new DeleteMilvusServiceOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteMilvusService(deleteMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteMilvusService" })
  public void testDeleteIngestionJobs() throws Exception {
    try {
      DeleteIngestionJobsOptions deleteIngestionJobsOptions = new DeleteIngestionJobsOptions.Builder()
        .jobId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteIngestionJobs(deleteIngestionJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
