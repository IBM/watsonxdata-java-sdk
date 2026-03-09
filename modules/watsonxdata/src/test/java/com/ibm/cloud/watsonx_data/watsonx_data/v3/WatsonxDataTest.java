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

package com.ibm.cloud.watsonx_data.watsonx_data.v3;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.WatsonxData;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.AddStorageCatalogOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociation;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociationObject;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociationObjectPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociationPatchObjectPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogSyncMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnInfoAdditionalProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnInfoAdditionalPropertiesSemanticDescription;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnInfoAdditionalPropertiesSemanticName;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnPatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ColumnsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ConnectionResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CoordinatorNodeDescriptionBody;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseCatalog;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseCatalogPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseDetailsPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabasePropertiesCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationTablesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2Engine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2EngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2EngineDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Db2EnginePatch;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Driver;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EngineDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EngineProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EnginePropertiesConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EnginePropertiesJvm;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EnginePropertiesLogConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.EnrichmentObj;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ErrorObj;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.GlossaryObject;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.InstanceResourceEndpoint;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.JdbcThriftUrls;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MDSRestUrls;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MaskedColumn;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MaskedColumnCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MdsConnectionInfo;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusBillingSuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusBillingSuccessResponseCost;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDBPartition;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDatabaseCollections;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDatabasePartitions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusDbcollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusService;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServicePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceStoragePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Milvusdb;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngineConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEngineConfigurationBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NetezzaEnginePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.NodeDescription;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngineConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngineConfigurationBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PaginationLink;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Path;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoCoordinatorNodeDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEngineProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesEventListner;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesJmxExporterConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoWorkerNodeDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEnginePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoEngineSuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestoQueryExplain;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemoveEngineProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemoveEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemoveEnginePropertiesJvm;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEngineJmxExporterConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEngineProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesEventListner;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Resource;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetailsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetailsProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceDetailsPropertiesConnectionItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ResourceGroupForEngine;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAsset;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntity;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntityAssetTerms;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntityDataAsset;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntityDataAssetSemanticDescription;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntityDataAssetSemanticName;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailEntityMetadataEnrichmentPublishInfo;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentDataAssetDetailMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobRunLogs;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobRuns;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentJobs;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettings;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettingsExpansion;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettingsExpansionDescriptionConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettingsExpansionNameConfiguration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryTerms;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryUploadProcess;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalGlossaryUploadStatus;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegrationMappingObj;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegrationMappings;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SalIntegrationPatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaResponseCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemaResponseSummary;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearchBodySearchConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearchList;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearchResultsItem;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SemanticSearchResultsItemMatchedColumnsItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationStateDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEndpoints;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngine;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationCallback;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationSummary;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineApplicationsPager;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineHome;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineHomePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEnginePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEnginePatchEngineDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetailsCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetailsPrototypes;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineResourceUtilisation;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkHistoryServer;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkScaleConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkVolumeDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkVscodeConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageCatalog;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageCatalogPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageDetailsAccessKeyVault;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageObjectProperties;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationObjectCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationObjectSizeCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationPatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SuccessResponsePrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableColumDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableColumDetailColumnsItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TablePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableResponse;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableResponseCollection;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableResponseSummary;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.TableSnapshot;
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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.WatsonxInstanceDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.WorkerNodeDescriptionBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WatsonxData service.
 */
public class WatsonxDataTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WatsonxData watsonxDataService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new WatsonxData(serviceName, null);
  }

  // Test the getDatabaseProperties operation with a valid options model parameter
  @Test
  public void testGetDatabasePropertiesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_properties\": [{\"authentication_value\": \"sampleapikey\", \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"database_id\": \"database1234\", \"database_type\": \"netezza\", \"hostname\": \"db2@hostname.com\", \"is_ssl\": true, \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"schema_name\": \"sampleSchema\", \"username\": \"sampleuser\", \"warehouse_name\": \"samplewarehouse\"}]}";
    String getDatabasePropertiesPath = "/database_properties";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabasePropertiesOptions model
    GetDatabasePropertiesOptions getDatabasePropertiesOptionsModel = new GetDatabasePropertiesOptions.Builder()
      .secret("testString")
      .databaseIds("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabaseProperties() with a valid options model and verify the result
    Response<DatabasePropertiesCollection> response = watsonxDataService.getDatabaseProperties(getDatabasePropertiesOptionsModel).execute();
    assertNotNull(response);
    DatabasePropertiesCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatabasePropertiesPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("database_ids"), "testString");
  }

  // Test the getDatabaseProperties operation with and without retries enabled
  @Test
  public void testGetDatabasePropertiesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDatabasePropertiesWOptions();

    watsonxDataService.disableRetries();
    testGetDatabasePropertiesWOptions();
  }

  // Test the getDatabaseProperties operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatabasePropertiesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDatabaseProperties(null).execute();
  }

  // Test the listDatabaseRegistrations operation with a valid options model parameter
  @Test
  public void testListDatabaseRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_registrations\": [{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}]}";
    String listDatabaseRegistrationsPath = "/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDatabaseRegistrationsOptions model
    ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptionsModel = new ListDatabaseRegistrationsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listDatabaseRegistrations() with a valid options model and verify the result
    Response<DatabaseRegistrationCollection> response = watsonxDataService.listDatabaseRegistrations(listDatabaseRegistrationsOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistrationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDatabaseRegistrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listDatabaseRegistrations operation with and without retries enabled
  @Test
  public void testListDatabaseRegistrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDatabaseRegistrationsWOptions();

    watsonxDataService.disableRetries();
    testListDatabaseRegistrationsWOptions();
  }

  // Test the createDatabaseRegistration operation with a valid options model parameter
  @Test
  public void testCreateDatabaseRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String createDatabaseRegistrationPath = "/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DatabaseCatalogPrototype model
    DatabaseCatalogPrototype databaseCatalogPrototypeModel = new DatabaseCatalogPrototype.Builder()
      .catalogName("sampleCatalog")
      .catalogType("iceberg")
      .isGfs(false)
      .build();

    // Construct an instance of the SecretDetails model
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the DatabaseDetailsPrototype model
    DatabaseDetailsPrototype databaseDetailsPrototypeModel = new DatabaseDetailsPrototype.Builder()
      .authenticationType("LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword")
      .authenticationValue("LDAP")
      .authenticationValueKeyVault(secretDetailsModel)
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
      .domainName("conops-mssql.conops.local")
      .driverUris("/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...")
      .hostname("http://db2@localhost:9900.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .locationName("ABCD")
      .name("new_database")
      .password("samplepassword")
      .passwordKeyVault(secretDetailsModel)
      .port(Long.valueOf("4553"))
      .privateKey("privatekey")
      .privateKeyPassphrase("passphrase")
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
      .sslcertificateKeyVault(secretDetailsModel)
      .tables("kafka_table_name, redis_table_name")
      .username("sampleuser")
      .usernameKeyVault(secretDetailsModel)
      .validateServerCertificate(true)
      .vaultEnabled(true)
      .verifyHostName(true)
      .warehouseName("samplewrehouse")
      .build();

    // Construct an instance of the DatabaseRegistrationPrototypeDatabasePropertiesItems model
    DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    // Construct an instance of the CreateDatabaseRegistrationOptions model
    CreateDatabaseRegistrationOptions createDatabaseRegistrationOptionsModel = new CreateDatabaseRegistrationOptions.Builder()
      .displayName("new_database")
      .type("db2")
      .associatedCatalog(databaseCatalogPrototypeModel)
      .connection(databaseDetailsPrototypeModel)
      .createdAt("1686792721")
      .description("db2 extenal database description")
      .xProperties(java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel))
      .sourceAssetId("cc85d899-9ec3-496a-be36-99cabc62f123")
      .sourceCatalogId("cc85d899-9ec3-496a-be36-99cff962f000")
      .sourceProjectId("cc85d899-9ec3-496a-be36-99cff9000116")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .targetCatalogId("cc85d899-9ec3-496a-be36-99cff9000116")
      .authInstanceId("testString")
      .build();

    // Invoke createDatabaseRegistration() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.createDatabaseRegistration(createDatabaseRegistrationOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDatabaseRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDatabaseRegistration operation with and without retries enabled
  @Test
  public void testCreateDatabaseRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDatabaseRegistrationWOptions();

    watsonxDataService.disableRetries();
    testCreateDatabaseRegistrationWOptions();
  }

  // Test the createDatabaseRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDatabaseRegistration(null).execute();
  }

  // Test the addDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testAddDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String addDatabaseCatalogPath = "/database_registrations/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddDatabaseCatalogOptions model
    AddDatabaseCatalogOptions addDatabaseCatalogOptionsModel = new AddDatabaseCatalogOptions.Builder()
      .databaseId("testString")
      .catalogName("sampleCatalog")
      .authInstanceId("testString")
      .build();

    // Invoke addDatabaseCatalog() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.addDatabaseCatalog(addDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the addDatabaseCatalog operation with and without retries enabled
  @Test
  public void testAddDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testAddDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testAddDatabaseCatalogWOptions();
  }

  // Test the addDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.addDatabaseCatalog(null).execute();
  }

  // Test the getDatabase operation with a valid options model parameter
  @Test
  public void testGetDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String getDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabaseOptions model
    GetDatabaseOptions getDatabaseOptionsModel = new GetDatabaseOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabase() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.getDatabase(getDatabaseOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatabasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDatabase operation with and without retries enabled
  @Test
  public void testGetDatabaseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDatabaseWOptions();

    watsonxDataService.disableRetries();
    testGetDatabaseWOptions();
  }

  // Test the getDatabase operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatabaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDatabase(null).execute();
  }

  // Test the deleteDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testDeleteDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDatabaseCatalogPath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDatabaseCatalogOptions model
    DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptionsModel = new DeleteDatabaseCatalogOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .secret("testString")
      .build();

    // Invoke deleteDatabaseCatalog() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDatabaseCatalog(deleteDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDatabaseCatalog operation with and without retries enabled
  @Test
  public void testDeleteDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testDeleteDatabaseCatalogWOptions();
  }

  // Test the deleteDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDatabaseCatalog(null).execute();
  }

  // Test the updateDatabase operation with a valid options model parameter
  @Test
  public void testUpdateDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String updateDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems model
    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    // Construct an instance of the DatabaseRegistrationPatchDatabaseDetails model
    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
      .authenticationValue("LDAP")
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .password("samplepassword")
      .xProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
      .username("sampleuser")
      .build();

    // Construct an instance of the DatabaseRegistrationPatchTablesItems model
    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();

    // Construct an instance of the DatabaseRegistrationPatchTopicsItems model
    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();

    // Construct an instance of the DatabaseRegistrationPatch model
    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .connection(databaseRegistrationPatchDatabaseDetailsModel)
      .description("External database description")
      .displayName("new_database")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();
    Map<String, Object> databaseRegistrationPatchModelAsPatch = databaseRegistrationPatchModel.asPatch();

    // Construct an instance of the UpdateDatabaseOptions model
    UpdateDatabaseOptions updateDatabaseOptionsModel = new UpdateDatabaseOptions.Builder()
      .id("testString")
      .body(databaseRegistrationPatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateDatabase() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.updateDatabase(updateDatabaseOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDatabasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDatabase operation with and without retries enabled
  @Test
  public void testUpdateDatabaseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDatabaseWOptions();

    watsonxDataService.disableRetries();
    testUpdateDatabaseWOptions();
  }

  // Test the updateDatabase operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDatabaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDatabase(null).execute();
  }

  // Test the validateDatabaseConnection operation with a valid options model parameter
  @Test
  public void testValidateDatabaseConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connection_response\": {\"state\": false, \"state_message\": \"stateMessage\"}}";
    String validateDatabaseConnectionPath = "/test_database_connection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretDetails model
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the ValidateDatabaseBodyDatabaseDetails model
    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModel = new ValidateDatabaseBodyDatabaseDetails.Builder()
      .authenticationType("LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword")
      .authenticationValue("sampleapikey")
      .authenticationValueKeyVault(secretDetailsModel)
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .brokerHost("db2@hostname.com")
      .brokerPort(Long.valueOf("4553"))
      .connectionMode("service_name")
      .connectionModeValue("orclpdb")
      .connectionType("JDBC, Arrow flight")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .coordinatorHost("samplehost")
      .coordinatorPort(Long.valueOf("4553"))
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .domainName("conops-mssql.conops.local")
      .driverUris("/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...")
      .hostname("db2@hostname.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .locationName("ABCD")
      .name("sampledatabase")
      .password("samplepassword")
      .passwordKeyVault(secretDetailsModel)
      .port(Long.valueOf("4553"))
      .privateKey("privatekey")
      .privateKeyPassphrase("passphrase")
      .projectId("sampleprojectId")
      .sasl(true)
      .saslMechanism("plain")
      .serviceApiKey("sampleapikey")
      .serviceHostname("api.dataplatform.dev.cloud.ibm.com")
      .servicePort(Long.valueOf("443"))
      .serviceSsl(true)
      .serviceTokenUrl("sampletokenurl")
      .ssl(true)
      .sslcertificateKeyVault(secretDetailsModel)
      .tables("kafka_table_name")
      .username("sampleuser")
      .usernameKeyVault(secretDetailsModel)
      .validateServerCertificate(true)
      .vaultEnabled(true)
      .verifyHostName(true)
      .warehouseName("samplewarehouse")
      .build();

    // Construct an instance of the ValidateDatabaseConnectionOptions model
    ValidateDatabaseConnectionOptions validateDatabaseConnectionOptionsModel = new ValidateDatabaseConnectionOptions.Builder()
      .type("netezza")
      .certificate("exampleCertificate")
      .certificateExtension("pem")
      .connection(validateDatabaseBodyDatabaseDetailsModel)
      .id("sampledatabaseID")
      .sourceAssetId("cc85d899-9ec3-496a-be36-99cabc62f123")
      .sourceCatalogId("cc85d899-9ec3-496a-be36-99cff962f000")
      .sourceProjectId("cc85d899-9ec3-496a-be36-99cff9000116")
      .targetCatalogId("cc85d899-9ec3-496a-be36-99cff9000116")
      .authInstanceId("testString")
      .build();

    // Invoke validateDatabaseConnection() with a valid options model and verify the result
    Response<TestDatabaseConnectionResponse> response = watsonxDataService.validateDatabaseConnection(validateDatabaseConnectionOptionsModel).execute();
    assertNotNull(response);
    TestDatabaseConnectionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateDatabaseConnectionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the validateDatabaseConnection operation with and without retries enabled
  @Test
  public void testValidateDatabaseConnectionWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testValidateDatabaseConnectionWOptions();

    watsonxDataService.disableRetries();
    testValidateDatabaseConnectionWOptions();
  }

  // Test the validateDatabaseConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateDatabaseConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.validateDatabaseConnection(null).execute();
  }

  // Test the listDb2Engines operation with a valid options model parameter
  @Test
  public void testListDb2EnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"db2_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"db2 engine to run sql queries\", \"display_name\": \"sample-engine\", \"host_name\": \"xyz-db2-01-db2-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 1, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}]}";
    String listDb2EnginesPath = "/db2_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDb2EnginesOptions model
    ListDb2EnginesOptions listDb2EnginesOptionsModel = new ListDb2EnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listDb2Engines() with a valid options model and verify the result
    Response<Db2EngineCollection> response = watsonxDataService.listDb2Engines(listDb2EnginesOptionsModel).execute();
    assertNotNull(response);
    Db2EngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDb2EnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listDb2Engines operation with and without retries enabled
  @Test
  public void testListDb2EnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDb2EnginesWOptions();

    watsonxDataService.disableRetries();
    testListDb2EnginesWOptions();
  }

  // Test the createDb2Engine operation with a valid options model parameter
  @Test
  public void testCreateDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"db2 engine to run sql queries\", \"display_name\": \"sample-engine\", \"host_name\": \"xyz-db2-01-db2-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 1, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}";
    String createDb2EnginePath = "/db2_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Db2EngineDetailsBody model
    Db2EngineDetailsBody db2EngineDetailsBodyModel = new Db2EngineDetailsBody.Builder()
      .connectionString("1.2.3.4")
      .build();

    // Construct an instance of the CreateDb2EngineOptions model
    CreateDb2EngineOptions createDb2EngineOptionsModel = new CreateDb2EngineOptions.Builder()
      .configuration(db2EngineDetailsBodyModel)
      .displayName("sampleEngine")
      .origin("external")
      .description("db2 engine description")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createDb2Engine() with a valid options model and verify the result
    Response<Db2Engine> response = watsonxDataService.createDb2Engine(createDb2EngineOptionsModel).execute();
    assertNotNull(response);
    Db2Engine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDb2Engine operation with and without retries enabled
  @Test
  public void testCreateDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testCreateDb2EngineWOptions();
  }

  // Test the createDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDb2Engine(null).execute();
  }

  // Test the deleteDb2Engine operation with a valid options model parameter
  @Test
  public void testDeleteDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDb2EnginePath = "/db2_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDb2EngineOptions model
    DeleteDb2EngineOptions deleteDb2EngineOptionsModel = new DeleteDb2EngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDb2Engine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDb2Engine(deleteDb2EngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDb2Engine operation with and without retries enabled
  @Test
  public void testDeleteDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteDb2EngineWOptions();
  }

  // Test the deleteDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDb2Engine(null).execute();
  }

  // Test the updateDb2Engine operation with a valid options model parameter
  @Test
  public void testUpdateDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"db2 engine to run sql queries\", \"display_name\": \"sample-engine\", \"host_name\": \"xyz-db2-01-db2-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 1, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}";
    String updateDb2EnginePath = "/db2_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Db2EnginePatch model
    Db2EnginePatch db2EnginePatchModel = new Db2EnginePatch.Builder()
      .description("db2 engine updated description")
      .displayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> db2EnginePatchModelAsPatch = db2EnginePatchModel.asPatch();

    // Construct an instance of the UpdateDb2EngineOptions model
    UpdateDb2EngineOptions updateDb2EngineOptionsModel = new UpdateDb2EngineOptions.Builder()
      .id("testString")
      .body(db2EnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateDb2Engine() with a valid options model and verify the result
    Response<Db2Engine> response = watsonxDataService.updateDb2Engine(updateDb2EngineOptionsModel).execute();
    assertNotNull(response);
    Db2Engine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDb2Engine operation with and without retries enabled
  @Test
  public void testUpdateDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateDb2EngineWOptions();
  }

  // Test the updateDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDb2Engine(null).execute();
  }

  // Test the listNetezzaEngines operation with a valid options model parameter
  @Test
  public void testListNetezzaEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"netezza_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"netezza engine description\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}]}";
    String listNetezzaEnginesPath = "/netezza_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListNetezzaEnginesOptions model
    ListNetezzaEnginesOptions listNetezzaEnginesOptionsModel = new ListNetezzaEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listNetezzaEngines() with a valid options model and verify the result
    Response<NetezzaEngineCollection> response = watsonxDataService.listNetezzaEngines(listNetezzaEnginesOptionsModel).execute();
    assertNotNull(response);
    NetezzaEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listNetezzaEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listNetezzaEngines operation with and without retries enabled
  @Test
  public void testListNetezzaEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListNetezzaEnginesWOptions();

    watsonxDataService.disableRetries();
    testListNetezzaEnginesWOptions();
  }

  // Test the createNetezzaEngine operation with a valid options model parameter
  @Test
  public void testCreateNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"netezza engine description\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}";
    String createNetezzaEnginePath = "/netezza_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NetezzaEngineConfigurationBody model
    NetezzaEngineConfigurationBody netezzaEngineConfigurationBodyModel = new NetezzaEngineConfigurationBody.Builder()
      .connectionString("1.2.3.4")
      .build();

    // Construct an instance of the CreateNetezzaEngineOptions model
    CreateNetezzaEngineOptions createNetezzaEngineOptionsModel = new CreateNetezzaEngineOptions.Builder()
      .configuration(netezzaEngineConfigurationBodyModel)
      .displayName("sampleEngine")
      .origin("external")
      .description("netezza engine description")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createNetezzaEngine() with a valid options model and verify the result
    Response<NetezzaEngine> response = watsonxDataService.createNetezzaEngine(createNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    NetezzaEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createNetezzaEngine operation with and without retries enabled
  @Test
  public void testCreateNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateNetezzaEngineWOptions();
  }

  // Test the createNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createNetezzaEngine(null).execute();
  }

  // Test the deleteNetezzaEngine operation with a valid options model parameter
  @Test
  public void testDeleteNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteNetezzaEnginePath = "/netezza_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteNetezzaEngineOptions model
    DeleteNetezzaEngineOptions deleteNetezzaEngineOptionsModel = new DeleteNetezzaEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteNetezzaEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteNetezzaEngine(deleteNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteNetezzaEngine operation with and without retries enabled
  @Test
  public void testDeleteNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteNetezzaEngineWOptions();
  }

  // Test the deleteNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteNetezzaEngine(null).execute();
  }

  // Test the updateNetezzaEngine operation with a valid options model parameter
  @Test
  public void testUpdateNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"netezza engine description\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}";
    String updateNetezzaEnginePath = "/netezza_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the NetezzaEnginePatch model
    NetezzaEnginePatch netezzaEnginePatchModel = new NetezzaEnginePatch.Builder()
      .description("netezza engine updated description")
      .displayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> netezzaEnginePatchModelAsPatch = netezzaEnginePatchModel.asPatch();

    // Construct an instance of the UpdateNetezzaEngineOptions model
    UpdateNetezzaEngineOptions updateNetezzaEngineOptionsModel = new UpdateNetezzaEngineOptions.Builder()
      .id("testString")
      .body(netezzaEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateNetezzaEngine() with a valid options model and verify the result
    Response<NetezzaEngine> response = watsonxDataService.updateNetezzaEngine(updateNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    NetezzaEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateNetezzaEngine operation with and without retries enabled
  @Test
  public void testUpdateNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateNetezzaEngineWOptions();
  }

  // Test the updateNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateNetezzaEngine(null).execute();
  }

  // Test the listOtherEngines operation with a valid options model parameter
  @Test
  public void testListOtherEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"other_engines\": [{\"actions\": [\"actions\"], \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\", \"type\": \"netezza\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"engine for running sql queries\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"registered\", \"tags\": [\"tags\"], \"type\": \"external\"}]}";
    String listOtherEnginesPath = "/other_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListOtherEnginesOptions model
    ListOtherEnginesOptions listOtherEnginesOptionsModel = new ListOtherEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listOtherEngines() with a valid options model and verify the result
    Response<OtherEngineCollection> response = watsonxDataService.listOtherEngines(listOtherEnginesOptionsModel).execute();
    assertNotNull(response);
    OtherEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOtherEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listOtherEngines operation with and without retries enabled
  @Test
  public void testListOtherEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListOtherEnginesWOptions();

    watsonxDataService.disableRetries();
    testListOtherEnginesWOptions();
  }

  // Test the createOtherEngine operation with a valid options model parameter
  @Test
  public void testCreateOtherEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\", \"type\": \"netezza\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"engine for running sql queries\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"registered\", \"tags\": [\"tags\"], \"type\": \"external\"}";
    String createOtherEnginePath = "/other_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the OtherEngineConfigurationBody model
    OtherEngineConfigurationBody otherEngineConfigurationBodyModel = new OtherEngineConfigurationBody.Builder()
      .connectionString("1.2.3.4")
      .type("netezza")
      .build();

    // Construct an instance of the CreateOtherEngineOptions model
    CreateOtherEngineOptions createOtherEngineOptionsModel = new CreateOtherEngineOptions.Builder()
      .configuration(otherEngineConfigurationBodyModel)
      .displayName("sampleEngine01")
      .origin("external")
      .description("external engine description")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createOtherEngine() with a valid options model and verify the result
    Response<OtherEngine> response = watsonxDataService.createOtherEngine(createOtherEngineOptionsModel).execute();
    assertNotNull(response);
    OtherEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createOtherEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createOtherEngine operation with and without retries enabled
  @Test
  public void testCreateOtherEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateOtherEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateOtherEngineWOptions();
  }

  // Test the createOtherEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateOtherEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createOtherEngine(null).execute();
  }

  // Test the deleteOtherEngine operation with a valid options model parameter
  @Test
  public void testDeleteOtherEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteOtherEnginePath = "/other_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteOtherEngineOptions model
    DeleteOtherEngineOptions deleteOtherEngineOptionsModel = new DeleteOtherEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteOtherEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteOtherEngine(deleteOtherEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteOtherEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteOtherEngine operation with and without retries enabled
  @Test
  public void testDeleteOtherEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteOtherEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteOtherEngineWOptions();
  }

  // Test the deleteOtherEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteOtherEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteOtherEngine(null).execute();
  }

  // Test the listPrestissimoEngines operation with a valid options model parameter
  @Test
  public void testListPrestissimoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"prestissimo_engines\": [{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"event_listener\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jmx_exporter_config\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}]}";
    String listPrestissimoEnginesPath = "/prestissimo_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestissimoEnginesOptions model
    ListPrestissimoEnginesOptions listPrestissimoEnginesOptionsModel = new ListPrestissimoEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listPrestissimoEngines() with a valid options model and verify the result
    Response<PrestissimoEngineCollection> response = watsonxDataService.listPrestissimoEngines(listPrestissimoEnginesOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestissimoEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestissimoEngines operation with and without retries enabled
  @Test
  public void testListPrestissimoEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestissimoEnginesWOptions();

    watsonxDataService.disableRetries();
    testListPrestissimoEnginesWOptions();
  }

  // Test the createPrestissimoEngine operation with a valid options model parameter
  @Test
  public void testCreatePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"event_listener\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jmx_exporter_config\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String createPrestissimoEnginePath = "/prestissimo_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PrestissimoCoordinatorNodeDetails model
    PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoWorkerNodeDetails model
    PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoEngineDetails model
    PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
      .coordinator(prestissimoCoordinatorNodeDetailsModel)
      .sizeConfig("starter")
      .worker(prestissimoWorkerNodeDetailsModel)
      .build();

    // Construct an instance of the CreatePrestissimoEngineOptions model
    CreatePrestissimoEngineOptions createPrestissimoEngineOptionsModel = new CreatePrestissimoEngineOptions.Builder()
      .configuration(prestissimoEngineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("hive_data"))
      .description("prestissimo engine description")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.createPrestissimoEngine(createPrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestissimoEngine operation with and without retries enabled
  @Test
  public void testCreatePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestissimoEngineWOptions();
  }

  // Test the createPrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestissimoEngine(null).execute();
  }

  // Test the getPrestissimoEngineCatalog operation with a valid options model parameter
  @Test
  public void testGetPrestissimoEngineCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}";
    String getPrestissimoEngineCatalogPath = "/prestissimo_engines/testString/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestissimoEngineCatalogOptions model
    GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptionsModel = new GetPrestissimoEngineCatalogOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestissimoEngineCatalog() with a valid options model and verify the result
    Response<Catalog> response = watsonxDataService.getPrestissimoEngineCatalog(getPrestissimoEngineCatalogOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestissimoEngineCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestissimoEngineCatalog operation with and without retries enabled
  @Test
  public void testGetPrestissimoEngineCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestissimoEngineCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetPrestissimoEngineCatalogWOptions();
  }

  // Test the getPrestissimoEngineCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestissimoEngineCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestissimoEngineCatalog(null).execute();
  }

  // Test the getPrestissimoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"event_listener\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jmx_exporter_config\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String getPrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestissimoEngineOptions model
    GetPrestissimoEngineOptions getPrestissimoEngineOptionsModel = new GetPrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.getPrestissimoEngine(getPrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestissimoEngine operation with and without retries enabled
  @Test
  public void testGetPrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testGetPrestissimoEngineWOptions();
  }

  // Test the getPrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestissimoEngine(null).execute();
  }

  // Test the deletePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testDeletePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestissimoEngineOptions model
    DeletePrestissimoEngineOptions deletePrestissimoEngineOptionsModel = new DeletePrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestissimoEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestissimoEngine(deletePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePrestissimoEngine operation with and without retries enabled
  @Test
  public void testDeletePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestissimoEngineWOptions();
  }

  // Test the deletePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestissimoEngine(null).execute();
  }

  // Test the updatePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testUpdatePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"event_listener\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jmx_exporter_config\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String updatePrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PrestissimoEnginePropertiesCatalogAdditionalProperties model
    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesConfiguration model
    PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesEventListner model
    PrestissimoEnginePropertiesEventListner prestissimoEnginePropertiesEventListnerModel = new PrestissimoEnginePropertiesEventListner.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesJmxExporterConfig model
    PrestissimoEnginePropertiesJmxExporterConfig prestissimoEnginePropertiesJmxExporterConfigModel = new PrestissimoEnginePropertiesJmxExporterConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesJvm model
    PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesLogConfig model
    PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEngineProperties model
    PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(prestissimoEnginePropertiesConfigurationModel)
      .eventListener(prestissimoEnginePropertiesEventListnerModel)
      .global(java.util.Collections.singletonMap("key1", "testString"))
      .jmxExporterConfig(prestissimoEnginePropertiesJmxExporterConfigModel)
      .jvm(prestissimoEnginePropertiesJvmModel)
      .logConfig(prestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
      .velox(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesCatalogAdditionalProperties model
    RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesConfiguration model
    RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesEventListner model
    RemovePrestissimoEnginePropertiesEventListner removePrestissimoEnginePropertiesEventListnerModel = new RemovePrestissimoEnginePropertiesEventListner.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEngineJmxExporterConfig model
    RemovePrestissimoEngineJmxExporterConfig removePrestissimoEngineJmxExporterConfigModel = new RemovePrestissimoEngineJmxExporterConfig.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesJvm model
    RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesLogConfig model
    RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEngineProperties model
    RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removePrestissimoEnginePropertiesConfigurationModel)
      .eventListener(removePrestissimoEnginePropertiesEventListnerModel)
      .global(java.util.Arrays.asList("testString"))
      .jmxExporterConfig(removePrestissimoEngineJmxExporterConfigModel)
      .jvm(removePrestissimoEnginePropertiesJvmModel)
      .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Arrays.asList("testString"))
      .velox(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePatch model
    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .displayName("sampleEngine")
      .xProperties(prestissimoEnginePropertiesModel)
      .removeEngineProperties(removePrestissimoEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> prestissimoEnginePatchModelAsPatch = prestissimoEnginePatchModel.asPatch();

    // Construct an instance of the UpdatePrestissimoEngineOptions model
    UpdatePrestissimoEngineOptions updatePrestissimoEngineOptionsModel = new UpdatePrestissimoEngineOptions.Builder()
      .id("testString")
      .body(prestissimoEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updatePrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.updatePrestissimoEngine(updatePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestissimoEngine operation with and without retries enabled
  @Test
  public void testUpdatePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestissimoEngineWOptions();
  }

  // Test the updatePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestissimoEngine(null).execute();
  }

  // Test the listPrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listPrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestissimoEngineCatalogsOptions model
    ListPrestissimoEngineCatalogsOptions listPrestissimoEngineCatalogsOptionsModel = new ListPrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listPrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listPrestissimoEngineCatalogs(listPrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestissimoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testListPrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListPrestissimoEngineCatalogsWOptions();
  }

  // Test the listPrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listPrestissimoEngineCatalogs(null).execute();
  }

  // Test the createPrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testCreatePrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String createPrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePrestissimoEngineCatalogsOptions model
    CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptionsModel = new CreatePrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.createPrestissimoEngineCatalogs(createPrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestissimoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testCreatePrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestissimoEngineCatalogsWOptions();
  }

  // Test the createPrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestissimoEngineCatalogs(null).execute();
  }

  // Test the deletePrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testDeletePrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestissimoEngineCatalogsOptions model
    DeletePrestissimoEngineCatalogsOptions deletePrestissimoEngineCatalogsOptionsModel = new DeletePrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestissimoEngineCatalogs(deletePrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestissimoEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the deletePrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testDeletePrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestissimoEngineCatalogsWOptions();
  }

  // Test the deletePrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestissimoEngineCatalogs(null).execute();
  }

  // Test the pausePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testPausePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String pausePrestissimoEnginePath = "/prestissimo_engines/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PausePrestissimoEngineOptions model
    PausePrestissimoEngineOptions pausePrestissimoEngineOptionsModel = new PausePrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke pausePrestissimoEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.pausePrestissimoEngine(pausePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, pausePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the pausePrestissimoEngine operation with and without retries enabled
  @Test
  public void testPausePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testPausePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testPausePrestissimoEngineWOptions();
  }

  // Test the pausePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPausePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.pausePrestissimoEngine(null).execute();
  }

  // Test the runPrestissimoExplainStatement operation with a valid options model parameter
  @Test
  public void testRunPrestissimoExplainStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": \"result\"}";
    String runPrestissimoExplainStatementPath = "/prestissimo_engines/testString/query_explain";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunPrestissimoExplainStatementOptions model
    RunPrestissimoExplainStatementOptions runPrestissimoExplainStatementOptionsModel = new RunPrestissimoExplainStatementOptions.Builder()
      .id("testString")
      .statement("show schemas in catalog_name")
      .catalog("catalog_name")
      .format("json")
      .schema("schema_name")
      .type("io")
      .authInstanceId("testString")
      .build();

    // Invoke runPrestissimoExplainStatement() with a valid options model and verify the result
    Response<ResultPrestissimoExplainStatement> response = watsonxDataService.runPrestissimoExplainStatement(runPrestissimoExplainStatementOptionsModel).execute();
    assertNotNull(response);
    ResultPrestissimoExplainStatement responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runPrestissimoExplainStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runPrestissimoExplainStatement operation with and without retries enabled
  @Test
  public void testRunPrestissimoExplainStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunPrestissimoExplainStatementWOptions();

    watsonxDataService.disableRetries();
    testRunPrestissimoExplainStatementWOptions();
  }

  // Test the runPrestissimoExplainStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunPrestissimoExplainStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runPrestissimoExplainStatement(null).execute();
  }

  // Test the runPrestissimoExplainAnalyzeStatement operation with a valid options model parameter
  @Test
  public void testRunPrestissimoExplainAnalyzeStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": \"result\"}";
    String runPrestissimoExplainAnalyzeStatementPath = "/prestissimo_engines/testString/query_explain_analyze";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunPrestissimoExplainAnalyzeStatementOptions model
    RunPrestissimoExplainAnalyzeStatementOptions runPrestissimoExplainAnalyzeStatementOptionsModel = new RunPrestissimoExplainAnalyzeStatementOptions.Builder()
      .id("testString")
      .statement("show schemas in catalog_name")
      .verbose(true)
      .authInstanceId("testString")
      .build();

    // Invoke runPrestissimoExplainAnalyzeStatement() with a valid options model and verify the result
    Response<ResultRunPrestissimoExplainAnalyzeStatement> response = watsonxDataService.runPrestissimoExplainAnalyzeStatement(runPrestissimoExplainAnalyzeStatementOptionsModel).execute();
    assertNotNull(response);
    ResultRunPrestissimoExplainAnalyzeStatement responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runPrestissimoExplainAnalyzeStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runPrestissimoExplainAnalyzeStatement operation with and without retries enabled
  @Test
  public void testRunPrestissimoExplainAnalyzeStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunPrestissimoExplainAnalyzeStatementWOptions();

    watsonxDataService.disableRetries();
    testRunPrestissimoExplainAnalyzeStatementWOptions();
  }

  // Test the runPrestissimoExplainAnalyzeStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunPrestissimoExplainAnalyzeStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runPrestissimoExplainAnalyzeStatement(null).execute();
  }

  // Test the restartPrestissimoEngine operation with a valid options model parameter
  @Test
  public void testRestartPrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String restartPrestissimoEnginePath = "/prestissimo_engines/testString/restart";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RestartPrestissimoEngineOptions model
    RestartPrestissimoEngineOptions restartPrestissimoEngineOptionsModel = new RestartPrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke restartPrestissimoEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.restartPrestissimoEngine(restartPrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, restartPrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the restartPrestissimoEngine operation with and without retries enabled
  @Test
  public void testRestartPrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRestartPrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testRestartPrestissimoEngineWOptions();
  }

  // Test the restartPrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRestartPrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.restartPrestissimoEngine(null).execute();
  }

  // Test the resumePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testResumePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String resumePrestissimoEnginePath = "/prestissimo_engines/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResumePrestissimoEngineOptions model
    ResumePrestissimoEngineOptions resumePrestissimoEngineOptionsModel = new ResumePrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke resumePrestissimoEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.resumePrestissimoEngine(resumePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resumePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the resumePrestissimoEngine operation with and without retries enabled
  @Test
  public void testResumePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testResumePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testResumePrestissimoEngineWOptions();
  }

  // Test the resumePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResumePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.resumePrestissimoEngine(null).execute();
  }

  // Test the scalePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testScalePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String scalePrestissimoEnginePath = "/prestissimo_engines/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the PrestissimoCoordinatorNodeDetails model
    PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoWorkerNodeDetails model
    PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the ScalePrestissimoEngineOptions model
    ScalePrestissimoEngineOptions scalePrestissimoEngineOptionsModel = new ScalePrestissimoEngineOptions.Builder()
      .id("testString")
      .coordinator(prestissimoCoordinatorNodeDetailsModel)
      .worker(prestissimoWorkerNodeDetailsModel)
      .authInstanceId("testString")
      .build();

    // Invoke scalePrestissimoEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.scalePrestissimoEngine(scalePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, scalePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the scalePrestissimoEngine operation with and without retries enabled
  @Test
  public void testScalePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testScalePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testScalePrestissimoEngineWOptions();
  }

  // Test the scalePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testScalePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.scalePrestissimoEngine(null).execute();
  }

  // Test the listPrestoEngines operation with a valid options model parameter
  @Test
  public void testListPrestoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"presto_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"new_arch\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}]}";
    String listPrestoEnginesPath = "/presto_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestoEnginesOptions model
    ListPrestoEnginesOptions listPrestoEnginesOptionsModel = new ListPrestoEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listPrestoEngines() with a valid options model and verify the result
    Response<PrestoEngineCollection> response = watsonxDataService.listPrestoEngines(listPrestoEnginesOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestoEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestoEngines operation with and without retries enabled
  @Test
  public void testListPrestoEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestoEnginesWOptions();

    watsonxDataService.disableRetries();
    testListPrestoEnginesWOptions();
  }

  // Test the createPrestoEngine operation with a valid options model parameter
  @Test
  public void testCreatePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"new_arch\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String createPrestoEnginePath = "/presto_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CoordinatorNodeDescriptionBody model
    CoordinatorNodeDescriptionBody coordinatorNodeDescriptionBodyModel = new CoordinatorNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the WorkerNodeDescriptionBody model
    WorkerNodeDescriptionBody workerNodeDescriptionBodyModel = new WorkerNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the EngineDetails model
    EngineDetails engineDetailsModel = new EngineDetails.Builder()
      .coordinator(coordinatorNodeDescriptionBodyModel)
      .sizeConfig("starter")
      .worker(workerNodeDescriptionBodyModel)
      .build();

    // Construct an instance of the CreatePrestoEngineOptions model
    CreatePrestoEngineOptions createPrestoEngineOptionsModel = new CreatePrestoEngineOptions.Builder()
      .configuration(engineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine for running sql queries")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.createPrestoEngine(createPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestoEngine operation with and without retries enabled
  @Test
  public void testCreatePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestoEngineWOptions();
  }

  // Test the createPrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestoEngine(null).execute();
  }

  // Test the listPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listPrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestoEngineCatalogsOptions model
    ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptionsModel = new ListPrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listPrestoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testListPrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListPrestoEngineCatalogsWOptions();
  }

  // Test the listPrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listPrestoEngineCatalogs(null).execute();
  }

  // Test the createPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testCreatePrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String createPrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePrestoEngineCatalogsOptions model
    CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptionsModel = new CreatePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.createPrestoEngineCatalogs(createPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testCreatePrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestoEngineCatalogsWOptions();
  }

  // Test the createPrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestoEngineCatalogs(null).execute();
  }

  // Test the deletePrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testDeletePrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestoEngineCatalogsOptions model
    DeletePrestoEngineCatalogsOptions deletePrestoEngineCatalogsOptionsModel = new DeletePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestoEngineCatalogs() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestoEngineCatalogs(deletePrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestoEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the deletePrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testDeletePrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestoEngineCatalogsWOptions();
  }

  // Test the deletePrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestoEngineCatalogs(null).execute();
  }

  // Test the getPrestoEngineCatalog operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}";
    String getPrestoEngineCatalogPath = "/presto_engines/testString/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineCatalogOptions model
    GetPrestoEngineCatalogOptions getPrestoEngineCatalogOptionsModel = new GetPrestoEngineCatalogOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestoEngineCatalog() with a valid options model and verify the result
    Response<Catalog> response = watsonxDataService.getPrestoEngineCatalog(getPrestoEngineCatalogOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestoEngineCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestoEngineCatalog operation with and without retries enabled
  @Test
  public void testGetPrestoEngineCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestoEngineCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetPrestoEngineCatalogWOptions();
  }

  // Test the getPrestoEngineCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestoEngineCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestoEngineCatalog(null).execute();
  }

  // Test the getPrestoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"new_arch\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String getPrestoEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineOptions model
    GetPrestoEngineOptions getPrestoEngineOptionsModel = new GetPrestoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.getPrestoEngine(getPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestoEngine operation with and without retries enabled
  @Test
  public void testGetPrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testGetPrestoEngineWOptions();
  }

  // Test the getPrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestoEngine(null).execute();
  }

  // Test the deleteEngine operation with a valid options model parameter
  @Test
  public void testDeleteEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteEngineOptions model
    DeleteEngineOptions deleteEngineOptionsModel = new DeleteEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteEngine(deleteEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteEngine operation with and without retries enabled
  @Test
  public void testDeleteEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteEngineWOptions();
  }

  // Test the deleteEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteEngine(null).execute();
  }

  // Test the updatePrestoEngine operation with a valid options model parameter
  @Test
  public void testUpdatePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"new_arch\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String updatePrestoEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EnginePropertiesCatalogAdditionalProperties model
    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the EnginePropertiesConfiguration model
    EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();

    // Construct an instance of the EnginePropertiesJvm model
    EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();

    // Construct an instance of the EnginePropertiesLogConfig model
    EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();

    // Construct an instance of the EngineProperties model
    EngineProperties enginePropertiesModel = new EngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(enginePropertiesConfigurationModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(enginePropertiesJvmModel)
      .logConfig(enginePropertiesLogConfigModel)
      .build();

    // Construct an instance of the RemoveEnginePropertiesCatalogAdditionalProperties model
    RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesConfiguration model
    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesJvm model
    RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesLogConfig model
    RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEngineProperties model
    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removeEnginePropertiesConfigurationModel)
      .eventListener(java.util.Arrays.asList("property_name"))
      .global(java.util.Arrays.asList("property_name"))
      .jmxExporterConfig(java.util.Arrays.asList("testString"))
      .jvm(removeEnginePropertiesJvmModel)
      .logConfig(removeEnginePropertiesLogConfigModel)
      .build();

    // Construct an instance of the PrestoEnginePatch model
    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .displayName("sampleEngine")
      .xProperties(enginePropertiesModel)
      .removeEngineProperties(removeEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> prestoEnginePatchModelAsPatch = prestoEnginePatchModel.asPatch();

    // Construct an instance of the UpdatePrestoEngineOptions model
    UpdatePrestoEngineOptions updatePrestoEngineOptionsModel = new UpdatePrestoEngineOptions.Builder()
      .id("testString")
      .body(prestoEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updatePrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.updatePrestoEngine(updatePrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestoEngine operation with and without retries enabled
  @Test
  public void testUpdatePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestoEngineWOptions();
  }

  // Test the updatePrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestoEngine(null).execute();
  }

  // Test the pausePrestoEngine operation with a valid options model parameter
  @Test
  public void testPausePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String pausePrestoEnginePath = "/presto_engines/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PausePrestoEngineOptions model
    PausePrestoEngineOptions pausePrestoEngineOptionsModel = new PausePrestoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke pausePrestoEngine() with a valid options model and verify the result
    Response<PrestoEngineSuccessResponse> response = watsonxDataService.pausePrestoEngine(pausePrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineSuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, pausePrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the pausePrestoEngine operation with and without retries enabled
  @Test
  public void testPausePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testPausePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testPausePrestoEngineWOptions();
  }

  // Test the pausePrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPausePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.pausePrestoEngine(null).execute();
  }

  // Test the runExplainStatement operation with a valid options model parameter
  @Test
  public void testRunExplainStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}, \"result\": \"result\"}";
    String runExplainStatementPath = "/presto_engines/testString/query_explain";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunExplainStatementOptions model
    RunExplainStatementOptions runExplainStatementOptionsModel = new RunExplainStatementOptions.Builder()
      .id("testString")
      .statement("show schemas in catalog_name")
      .catalog("catalog_name")
      .format("json")
      .schema("schema_name")
      .type("io")
      .authInstanceId("testString")
      .build();

    // Invoke runExplainStatement() with a valid options model and verify the result
    Response<PrestoQueryExplain> response = watsonxDataService.runExplainStatement(runExplainStatementOptionsModel).execute();
    assertNotNull(response);
    PrestoQueryExplain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runExplainStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runExplainStatement operation with and without retries enabled
  @Test
  public void testRunExplainStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunExplainStatementWOptions();

    watsonxDataService.disableRetries();
    testRunExplainStatementWOptions();
  }

  // Test the runExplainStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunExplainStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runExplainStatement(null).execute();
  }

  // Test the runExplainAnalyzeStatement operation with a valid options model parameter
  @Test
  public void testRunExplainAnalyzeStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}, \"result\": \"result\"}";
    String runExplainAnalyzeStatementPath = "/presto_engines/testString/query_explain_analyze";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunExplainAnalyzeStatementOptions model
    RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptionsModel = new RunExplainAnalyzeStatementOptions.Builder()
      .id("testString")
      .statement("show schemas in catalog_name")
      .verbose(true)
      .authInstanceId("testString")
      .build();

    // Invoke runExplainAnalyzeStatement() with a valid options model and verify the result
    Response<PrestoQueryExplain> response = watsonxDataService.runExplainAnalyzeStatement(runExplainAnalyzeStatementOptionsModel).execute();
    assertNotNull(response);
    PrestoQueryExplain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runExplainAnalyzeStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runExplainAnalyzeStatement operation with and without retries enabled
  @Test
  public void testRunExplainAnalyzeStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunExplainAnalyzeStatementWOptions();

    watsonxDataService.disableRetries();
    testRunExplainAnalyzeStatementWOptions();
  }

  // Test the runExplainAnalyzeStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunExplainAnalyzeStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runExplainAnalyzeStatement(null).execute();
  }

  // Test the restartPrestoEngine operation with a valid options model parameter
  @Test
  public void testRestartPrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String restartPrestoEnginePath = "/presto_engines/testString/restart";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RestartPrestoEngineOptions model
    RestartPrestoEngineOptions restartPrestoEngineOptionsModel = new RestartPrestoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke restartPrestoEngine() with a valid options model and verify the result
    Response<PrestoEngineSuccessResponse> response = watsonxDataService.restartPrestoEngine(restartPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineSuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, restartPrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the restartPrestoEngine operation with and without retries enabled
  @Test
  public void testRestartPrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRestartPrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testRestartPrestoEngineWOptions();
  }

  // Test the restartPrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRestartPrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.restartPrestoEngine(null).execute();
  }

  // Test the resumePrestoEngine operation with a valid options model parameter
  @Test
  public void testResumePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String resumePrestoEnginePath = "/presto_engines/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResumePrestoEngineOptions model
    ResumePrestoEngineOptions resumePrestoEngineOptionsModel = new ResumePrestoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke resumePrestoEngine() with a valid options model and verify the result
    Response<PrestoEngineSuccessResponse> response = watsonxDataService.resumePrestoEngine(resumePrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineSuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resumePrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the resumePrestoEngine operation with and without retries enabled
  @Test
  public void testResumePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testResumePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testResumePrestoEngineWOptions();
  }

  // Test the resumePrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResumePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.resumePrestoEngine(null).execute();
  }

  // Test the scalePrestoEngine operation with a valid options model parameter
  @Test
  public void testScalePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String scalePrestoEnginePath = "/presto_engines/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescription model
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the ScalePrestoEngineOptions model
    ScalePrestoEngineOptions scalePrestoEngineOptionsModel = new ScalePrestoEngineOptions.Builder()
      .id("testString")
      .coordinator(nodeDescriptionModel)
      .worker(nodeDescriptionModel)
      .authInstanceId("testString")
      .build();

    // Invoke scalePrestoEngine() with a valid options model and verify the result
    Response<PrestoEngineSuccessResponse> response = watsonxDataService.scalePrestoEngine(scalePrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineSuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, scalePrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the scalePrestoEngine operation with and without retries enabled
  @Test
  public void testScalePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testScalePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testScalePrestoEngineWOptions();
  }

  // Test the scalePrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testScalePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.scalePrestoEngine(null).execute();
  }

  // Test the listSparkEngines operation with a valid options model parameter
  @Test
  public void testListSparkEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"spark_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\", \"volume_storage_class\": \"nfs-client\", \"volume_storage_size\": \"5Gi\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine for running sql queries\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"is_capacity_supported\": true, \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}]}";
    String listSparkEnginesPath = "/spark_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEnginesOptions model
    ListSparkEnginesOptions listSparkEnginesOptionsModel = new ListSparkEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listSparkEngines() with a valid options model and verify the result
    Response<SparkEngineCollection> response = watsonxDataService.listSparkEngines(listSparkEnginesOptionsModel).execute();
    assertNotNull(response);
    SparkEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSparkEngines operation with and without retries enabled
  @Test
  public void testListSparkEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEnginesWOptions();

    watsonxDataService.disableRetries();
    testListSparkEnginesWOptions();
  }

  // Test the createSparkEngine operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\", \"volume_storage_class\": \"nfs-client\", \"volume_storage_size\": \"5Gi\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine for running sql queries\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"is_capacity_supported\": true, \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String createSparkEnginePath = "/spark_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkEngineHome model
    SparkEngineHome sparkEngineHomeModel = new SparkEngineHome.Builder()
      .path("spark/spark1234")
      .storageName("test-spark-storage")
      .volume("test-spark-volume")
      .volumeId("1704979825978585")
      .volumeName("my-volume")
      .volumeStorageClass("nfs-client")
      .volumeStorageSize("5Gi")
      .build();

    // Construct an instance of the SparkScaleConfig model
    SparkScaleConfig sparkScaleConfigModel = new SparkScaleConfig.Builder()
      .autoScaleEnabled(true)
      .currentNumberOfNodes(Long.valueOf("2"))
      .maximumNumberOfNodes(Long.valueOf("5"))
      .minimumNumberOfNodes(Long.valueOf("1"))
      .nodeType("medium")
      .numberOfNodes(Long.valueOf("2"))
      .build();

    // Construct an instance of the SparkEngineDetailsPrototype model
    SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
      .apiKey("apikey")
      .connectionString("1.2.3.4")
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .engineHome(sparkEngineHomeModel)
      .instanceId("spark-id")
      .managedBy("fully")
      .scaleConfig(sparkScaleConfigModel)
      .build();

    // Construct an instance of the CreateSparkEngineOptions model
    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .displayName("sampleEngine")
      .origin("external")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .configuration(sparkEngineDetailsPrototypeModel)
      .description("spark engine description")
      .id("sampleEngine123")
      .status("provisioning")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .type("spark")
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngine() with a valid options model and verify the result
    Response<SparkEngine> response = watsonxDataService.createSparkEngine(createSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SparkEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngine operation with and without retries enabled
  @Test
  public void testCreateSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineWOptions();
  }

  // Test the createSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngine(null).execute();
  }

  // Test the getSparkEngineApplicationStatus operation with a valid options model parameter
  @Test
  public void testGetSparkEngineApplicationStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"application_details\": {\"application\": \"s3://mybucket/wordcount.py\", \"archives\": \"s3://mybucket/myarchive.zip\", \"arguments\": [\"people.txt\"], \"class\": \"org.apache.spark.examples.SparkPi\", \"conf\": {\"mapKey\": \"configuration\"}, \"env\": {\"mapKey\": \"configuration\"}, \"files\": \"s3://mybucket/myfile.txt\", \"jars\": \"jars\", \"name\": \"SparkApplicaton1\", \"packages\": \"org.apache.spark:example_1.2.3\", \"repositories\": \"https://repo1.maven.org/maven2/\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_version\": \"3.3\"}, \"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"init_scripts\": [\"file://init_scripts/test.sh\"], \"max_retries\": \"3\", \"min_retry_interval_in_seconds\": \"30\", \"retry_attempt\": \"2\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"spark_ui\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\", \"spark_version\": \"3.4\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\", \"wxd_application_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}";
    String getSparkEngineApplicationStatusPath = "/spark_engines/testString/applications/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineApplicationStatusOptions model
    GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptionsModel = new GetSparkEngineApplicationStatusOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineApplicationStatus() with a valid options model and verify the result
    Response<SparkEngineApplicationResponse> response = watsonxDataService.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptionsModel).execute();
    assertNotNull(response);
    SparkEngineApplicationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineApplicationStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineApplicationStatus operation with and without retries enabled
  @Test
  public void testGetSparkEngineApplicationStatusWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineApplicationStatusWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineApplicationStatusWOptions();
  }

  // Test the getSparkEngineApplicationStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineApplicationStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineApplicationStatus(null).execute();
  }

  // Test the deleteSparkEngineApplication operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEngineApplicationPath = "/spark_engines/testString/applications/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineApplicationOptions model
    DeleteSparkEngineApplicationOptions deleteSparkEngineApplicationOptionsModel = new DeleteSparkEngineApplicationOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngineApplication() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngineApplication(deleteSparkEngineApplicationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEngineApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSparkEngineApplication operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineApplicationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineApplicationWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineApplicationWOptions();
  }

  // Test the deleteSparkEngineApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngineApplication(null).execute();
  }

  // Test the getSparkEngineApplicationUi operation with a valid options model parameter
  @Test
  public void testGetSparkEngineApplicationUiWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String getSparkEngineApplicationUiPath = "/spark_engines/testString/applications/testString/ui";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineApplicationUiOptions model
    GetSparkEngineApplicationUiOptions getSparkEngineApplicationUiOptionsModel = new GetSparkEngineApplicationUiOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineApplicationUi() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.getSparkEngineApplicationUi(getSparkEngineApplicationUiOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineApplicationUiPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineApplicationUi operation with and without retries enabled
  @Test
  public void testGetSparkEngineApplicationUiWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineApplicationUiWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineApplicationUiWOptions();
  }

  // Test the getSparkEngineApplicationUi operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineApplicationUiNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineApplicationUi(null).execute();
  }

  // Test the getSparkEngineCatalog operation with a valid options model parameter
  @Test
  public void testGetSparkEngineCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}";
    String getSparkEngineCatalogPath = "/spark_engines/testString/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineCatalogOptions model
    GetSparkEngineCatalogOptions getSparkEngineCatalogOptionsModel = new GetSparkEngineCatalogOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineCatalog() with a valid options model and verify the result
    Response<Catalog> response = watsonxDataService.getSparkEngineCatalog(getSparkEngineCatalogOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineCatalog operation with and without retries enabled
  @Test
  public void testGetSparkEngineCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineCatalogWOptions();
  }

  // Test the getSparkEngineCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineCatalog(null).execute();
  }

  // Test the getSparkEngineQueryServer operation with a valid options model parameter
  @Test
  public void testGetSparkEngineQueryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"creation_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"failed_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"finish_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"query_server_details\": {\"conf\": {\"mapKey\": \"configuration\"}, \"env\": {\"mapKey\": \"configuration\"}, \"name\": \"spark-sql-server\", \"spark_version\": \"3.3\"}, \"runtime\": {\"spark_version\": \"3.4\"}, \"server_endpoint\": \"jdbc:hive2://<CPD Host/SaaS Host>:443?hive.server2.transport.mode=http;hive.server2.thrift.http.path=/v3/analytics_engines/{instance_id}/spark_sql_server/{sql_server_id>}/connect,ssl=true;\", \"start_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"state\": \"ACTIVE\"}";
    String getSparkEngineQueryServerPath = "/spark_engines/testString/query_servers/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineQueryServerOptions model
    GetSparkEngineQueryServerOptions getSparkEngineQueryServerOptionsModel = new GetSparkEngineQueryServerOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineQueryServer() with a valid options model and verify the result
    Response<SparkEngineQueryServerDetails> response = watsonxDataService.getSparkEngineQueryServer(getSparkEngineQueryServerOptionsModel).execute();
    assertNotNull(response);
    SparkEngineQueryServerDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineQueryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineQueryServer operation with and without retries enabled
  @Test
  public void testGetSparkEngineQueryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineQueryServerWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineQueryServerWOptions();
  }

  // Test the getSparkEngineQueryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineQueryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineQueryServer(null).execute();
  }

  // Test the deleteSparkEngineQueryServer operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineQueryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEngineQueryServerPath = "/spark_engines/testString/query_servers/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineQueryServerOptions model
    DeleteSparkEngineQueryServerOptions deleteSparkEngineQueryServerOptionsModel = new DeleteSparkEngineQueryServerOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngineQueryServer() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngineQueryServer(deleteSparkEngineQueryServerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEngineQueryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSparkEngineQueryServer operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineQueryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineQueryServerWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineQueryServerWOptions();
  }

  // Test the deleteSparkEngineQueryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineQueryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngineQueryServer(null).execute();
  }

  // Test the getSparkEngine operation with a valid options model parameter
  @Test
  public void testGetSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\", \"volume_storage_class\": \"nfs-client\", \"volume_storage_size\": \"5Gi\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine for running sql queries\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"is_capacity_supported\": true, \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String getSparkEnginePath = "/spark_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineOptions model
    GetSparkEngineOptions getSparkEngineOptionsModel = new GetSparkEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngine() with a valid options model and verify the result
    Response<SparkEngine> response = watsonxDataService.getSparkEngine(getSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SparkEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngine operation with and without retries enabled
  @Test
  public void testGetSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineWOptions();
  }

  // Test the getSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngine(null).execute();
  }

  // Test the deleteSparkEngine operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEnginePath = "/spark_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineOptions model
    DeleteSparkEngineOptions deleteSparkEngineOptionsModel = new DeleteSparkEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngine(deleteSparkEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSparkEngine operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineWOptions();
  }

  // Test the deleteSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngine(null).execute();
  }

  // Test the updateSparkEngine operation with a valid options model parameter
  @Test
  public void testUpdateSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\", \"volume_storage_class\": \"nfs-client\", \"volume_storage_size\": \"5Gi\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine for running sql queries\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"is_capacity_supported\": true, \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String updateSparkEnginePath = "/spark_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkEngineHomePatch model
    SparkEngineHomePatch sparkEngineHomePatchModel = new SparkEngineHomePatch.Builder()
      .storageName("test-spark-storage")
      .build();

    // Construct an instance of the SparkEngineResourceLimit model
    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();

    // Construct an instance of the SparkEnginePatchEngineDetails model
    SparkEnginePatchEngineDetails sparkEnginePatchEngineDetailsModel = new SparkEnginePatchEngineDetails.Builder()
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .engineHome(sparkEngineHomePatchModel)
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .build();

    // Construct an instance of the SparkEnginePatch model
    SparkEnginePatch sparkEnginePatchModel = new SparkEnginePatch.Builder()
      .configuration(sparkEnginePatchEngineDetailsModel)
      .description("updated description for spark engine")
      .displayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> sparkEnginePatchModelAsPatch = sparkEnginePatchModel.asPatch();

    // Construct an instance of the UpdateSparkEngineOptions model
    UpdateSparkEngineOptions updateSparkEngineOptionsModel = new UpdateSparkEngineOptions.Builder()
      .id("testString")
      .body(sparkEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateSparkEngine() with a valid options model and verify the result
    Response<SparkEngine> response = watsonxDataService.updateSparkEngine(updateSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SparkEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSparkEngine operation with and without retries enabled
  @Test
  public void testUpdateSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateSparkEngineWOptions();
  }

  // Test the updateSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateSparkEngine(null).execute();
  }

  // Test the listSparkEngineApplications operation with a valid options model parameter
  @Test
  public void testListSparkEngineApplicationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applications\": [{\"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"idempotency_key\": \"idempotencyKey\", \"init_scripts\": [\"file://init_scripts/test.sh\"], \"max_retries\": \"3\", \"min_retry_interval_in_seconds\": \"30\", \"retry_attempt\": \"2\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"spark_ui\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\", \"spark_version\": \"3.4\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\", \"timeout_in_seconds\": \"60\", \"wxd_application_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}], \"first\": {\"href\": \"https://example.com/v1/applications?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://example.com/v1/applications?limit=100\"}}";
    String listSparkEngineApplicationsPath = "/spark_engines/testString/applications";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEngineApplicationsOptions model
    ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptionsModel = new ListSparkEngineApplicationsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .submissionTimeInterval("testString")
      .startTimeInterval("testString")
      .endTimeInterval("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listSparkEngineApplications() with a valid options model and verify the result
    Response<SparkEngineApplicationCollection> response = watsonxDataService.listSparkEngineApplications(listSparkEngineApplicationsOptionsModel).execute();
    assertNotNull(response);
    SparkEngineApplicationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEngineApplicationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("submission_time_interval"), "testString");
    assertEquals(query.get("start_time_interval"), "testString");
    assertEquals(query.get("end_time_interval"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listSparkEngineApplications operation with and without retries enabled
  @Test
  public void testListSparkEngineApplicationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEngineApplicationsWOptions();

    watsonxDataService.disableRetries();
    testListSparkEngineApplicationsWOptions();
  }

  // Test the listSparkEngineApplications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSparkEngineApplicationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSparkEngineApplications(null).execute();
  }

  // Test the listSparkEngineApplications operation using the SparkEngineApplicationsPager.getNext() method
  @Test
  public void testListSparkEngineApplicationsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?start=1\"},\"total_count\":2,\"limit\":1,\"applications\":[{\"auto_termination_time\":\"2020-12-08T10:00:00.000Z\",\"creation_time\":\"Saturday 28 October 2023 07:17:06.856+0000\",\"deploy_mode\":\"stand-alone\",\"end_time\":\"2020-12-08T10:00:00.000Z\",\"failed_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"finish_time\":\"Saturday 28 October 2023 07:17:38.966+0000\",\"id\":\"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\",\"idempotency_key\":\"idempotencyKey\",\"init_scripts\":[\"file://init_scripts/test.sh\"],\"max_retries\":\"3\",\"min_retry_interval_in_seconds\":\"30\",\"retry_attempt\":\"2\",\"runtime\":{\"spark_version\":\"3.4\"},\"spark_application_id\":\"app-20231028071726-0000\",\"spark_application_name\":\"PythonWordCount\",\"spark_ui\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\",\"spark_version\":\"3.4\",\"start_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"state\":\"FINISHED\",\"state_details\":[{\"code\":\"code\",\"message\":\"message\",\"type\":\"type\"}],\"submission_time\":\"2023-11-01T11:18:49.758Z\",\"template_id\":\"spark-3.3-jaas-v2-cp4d-template\",\"timeout_in_seconds\":\"60\",\"wxd_application_ui_endpoint\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"applications\":[{\"auto_termination_time\":\"2020-12-08T10:00:00.000Z\",\"creation_time\":\"Saturday 28 October 2023 07:17:06.856+0000\",\"deploy_mode\":\"stand-alone\",\"end_time\":\"2020-12-08T10:00:00.000Z\",\"failed_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"finish_time\":\"Saturday 28 October 2023 07:17:38.966+0000\",\"id\":\"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\",\"idempotency_key\":\"idempotencyKey\",\"init_scripts\":[\"file://init_scripts/test.sh\"],\"max_retries\":\"3\",\"min_retry_interval_in_seconds\":\"30\",\"retry_attempt\":\"2\",\"runtime\":{\"spark_version\":\"3.4\"},\"spark_application_id\":\"app-20231028071726-0000\",\"spark_application_name\":\"PythonWordCount\",\"spark_ui\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\",\"spark_version\":\"3.4\",\"start_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"state\":\"FINISHED\",\"state_details\":[{\"code\":\"code\",\"message\":\"message\",\"type\":\"type\"}],\"submission_time\":\"2023-11-01T11:18:49.758Z\",\"template_id\":\"spark-3.3-jaas-v2-cp4d-template\",\"timeout_in_seconds\":\"60\",\"wxd_application_ui_endpoint\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions = new ListSparkEngineApplicationsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .submissionTimeInterval("testString")
      .startTimeInterval("testString")
      .endTimeInterval("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<SparkEngineApplicationSummary> allResults = new ArrayList<>();
    SparkEngineApplicationsPager pager = new SparkEngineApplicationsPager(watsonxDataService, listSparkEngineApplicationsOptions);
    while (pager.hasNext()) {
      List<SparkEngineApplicationSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listSparkEngineApplications operation using the SparkEngineApplicationsPager.getAll() method
  @Test
  public void testListSparkEngineApplicationsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?start=1\"},\"total_count\":2,\"limit\":1,\"applications\":[{\"auto_termination_time\":\"2020-12-08T10:00:00.000Z\",\"creation_time\":\"Saturday 28 October 2023 07:17:06.856+0000\",\"deploy_mode\":\"stand-alone\",\"end_time\":\"2020-12-08T10:00:00.000Z\",\"failed_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"finish_time\":\"Saturday 28 October 2023 07:17:38.966+0000\",\"id\":\"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\",\"idempotency_key\":\"idempotencyKey\",\"init_scripts\":[\"file://init_scripts/test.sh\"],\"max_retries\":\"3\",\"min_retry_interval_in_seconds\":\"30\",\"retry_attempt\":\"2\",\"runtime\":{\"spark_version\":\"3.4\"},\"spark_application_id\":\"app-20231028071726-0000\",\"spark_application_name\":\"PythonWordCount\",\"spark_ui\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\",\"spark_version\":\"3.4\",\"start_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"state\":\"FINISHED\",\"state_details\":[{\"code\":\"code\",\"message\":\"message\",\"type\":\"type\"}],\"submission_time\":\"2023-11-01T11:18:49.758Z\",\"template_id\":\"spark-3.3-jaas-v2-cp4d-template\",\"timeout_in_seconds\":\"60\",\"wxd_application_ui_endpoint\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"applications\":[{\"auto_termination_time\":\"2020-12-08T10:00:00.000Z\",\"creation_time\":\"Saturday 28 October 2023 07:17:06.856+0000\",\"deploy_mode\":\"stand-alone\",\"end_time\":\"2020-12-08T10:00:00.000Z\",\"failed_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"finish_time\":\"Saturday 28 October 2023 07:17:38.966+0000\",\"id\":\"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\",\"idempotency_key\":\"idempotencyKey\",\"init_scripts\":[\"file://init_scripts/test.sh\"],\"max_retries\":\"3\",\"min_retry_interval_in_seconds\":\"30\",\"retry_attempt\":\"2\",\"runtime\":{\"spark_version\":\"3.4\"},\"spark_application_id\":\"app-20231028071726-0000\",\"spark_application_name\":\"PythonWordCount\",\"spark_ui\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\",\"spark_version\":\"3.4\",\"start_time\":\"Saturday 28 October 2023 07:17:26.649+0000\",\"state\":\"FINISHED\",\"state_details\":[{\"code\":\"code\",\"message\":\"message\",\"type\":\"type\"}],\"submission_time\":\"2023-11-01T11:18:49.758Z\",\"template_id\":\"spark-3.3-jaas-v2-cp4d-template\",\"timeout_in_seconds\":\"60\",\"wxd_application_ui_endpoint\":\"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions = new ListSparkEngineApplicationsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .submissionTimeInterval("testString")
      .startTimeInterval("testString")
      .endTimeInterval("testString")
      .limit(Long.valueOf("10"))
      .build();

    SparkEngineApplicationsPager pager = new SparkEngineApplicationsPager(watsonxDataService, listSparkEngineApplicationsOptions);
    List<SparkEngineApplicationSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createSparkEngineApplication operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"idempotency_key\": \"idempotencyKey\", \"init_scripts\": [\"file://init_scripts/test.sh\"], \"max_retries\": \"3\", \"min_retry_interval_in_seconds\": \"30\", \"retry_attempt\": \"2\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"spark_ui\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\", \"spark_version\": \"3.4\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\", \"timeout_in_seconds\": \"60\", \"wxd_application_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}";
    String createSparkEngineApplicationPath = "/spark_engines/testString/applications";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkApplicationRuntime model
    SparkApplicationRuntime sparkApplicationRuntimeModel = new SparkApplicationRuntime.Builder()
      .sparkVersion("3.4")
      .build();

    // Construct an instance of the SparkApplicationDetails model
    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .archives("s3://mybucket/myarchive.zip")
      .arguments(java.util.Arrays.asList("people.txt"))
      .xClass("org.apache.spark.examples.SparkPi")
      .conf(java.util.Collections.singletonMap("key1", "configuration"))
      .env(java.util.Collections.singletonMap("key1", "configuration"))
      .files("s3://mybucket/myfile.txt")
      .jars("testString")
      .name("SparkApplicaton1")
      .packages("org.apache.spark:example_1.2.3")
      .repositories("https://repo1.maven.org/maven2/")
      .runtime(sparkApplicationRuntimeModel)
      .sparkVersion("3.3")
      .build();

    // Construct an instance of the SparkEngineApplicationCallback model
    SparkEngineApplicationCallback sparkEngineApplicationCallbackModel = new SparkEngineApplicationCallback.Builder()
      .url("testString")
      .build();

    // Construct an instance of the SparkVolumeDetails model
    SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
      .mountPath("/mount/path")
      .name("my-volume")
      .readOnly(true)
      .sourceSubPath("/source/path")
      .build();

    // Construct an instance of the CreateSparkEngineApplicationOptions model
    CreateSparkEngineApplicationOptions createSparkEngineApplicationOptionsModel = new CreateSparkEngineApplicationOptions.Builder()
      .id("testString")
      .applicationDetails(sparkApplicationDetailsModel)
      .callback(sparkEngineApplicationCallbackModel)
      .contextId("testString")
      .contextType("project")
      .deployMode("local")
      .idempotencyKey("testString")
      .initScripts(java.util.Arrays.asList("file://init_scripts/test.sh"))
      .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
      .maxRetries("3")
      .minRetryIntervalInSeconds("30")
      .serviceInstanceId("iae")
      .timeoutInSeconds("60")
      .type("spark")
      .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngineApplication() with a valid options model and verify the result
    Response<SparkEngineApplicationSummary> response = watsonxDataService.createSparkEngineApplication(createSparkEngineApplicationOptionsModel).execute();
    assertNotNull(response);
    SparkEngineApplicationSummary responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEngineApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngineApplication operation with and without retries enabled
  @Test
  public void testCreateSparkEngineApplicationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineApplicationWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineApplicationWOptions();
  }

  // Test the createSparkEngineApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngineApplication(null).execute();
  }

  // Test the listSparkEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListSparkEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listSparkEngineCatalogsPath = "/spark_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEngineCatalogsOptions model
    ListSparkEngineCatalogsOptions listSparkEngineCatalogsOptionsModel = new ListSparkEngineCatalogsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSparkEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listSparkEngineCatalogs(listSparkEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSparkEngineCatalogs operation with and without retries enabled
  @Test
  public void testListSparkEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListSparkEngineCatalogsWOptions();
  }

  // Test the listSparkEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSparkEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSparkEngineCatalogs(null).execute();
  }

  // Test the createSparkEngineCatalogs operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String createSparkEngineCatalogsPath = "/spark_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSparkEngineCatalogsOptions model
    CreateSparkEngineCatalogsOptions createSparkEngineCatalogsOptionsModel = new CreateSparkEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.createSparkEngineCatalogs(createSparkEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngineCatalogs operation with and without retries enabled
  @Test
  public void testCreateSparkEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineCatalogsWOptions();
  }

  // Test the createSparkEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngineCatalogs(null).execute();
  }

  // Test the deleteSparkEngineCatalogs operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEngineCatalogsPath = "/spark_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineCatalogsOptions model
    DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptionsModel = new DeleteSparkEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngineCatalogs() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngineCatalogs(deleteSparkEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the deleteSparkEngineCatalogs operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineCatalogsWOptions();
  }

  // Test the deleteSparkEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngineCatalogs(null).execute();
  }

  // Test the getSparkEngineHistoryServer operation with a valid options model parameter
  @Test
  public void testGetSparkEngineHistoryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_termination_time\": \"2022-02-24T07:37:47Z\", \"cores\": \"1\", \"memory\": \"4G\", \"start_time\": \"2022-02-21T07:37:47Z\", \"state\": \"started\"}";
    String getSparkEngineHistoryServerPath = "/spark_engines/testString/history_server";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineHistoryServerOptions model
    GetSparkEngineHistoryServerOptions getSparkEngineHistoryServerOptionsModel = new GetSparkEngineHistoryServerOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineHistoryServer() with a valid options model and verify the result
    Response<SparkHistoryServer> response = watsonxDataService.getSparkEngineHistoryServer(getSparkEngineHistoryServerOptionsModel).execute();
    assertNotNull(response);
    SparkHistoryServer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineHistoryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineHistoryServer operation with and without retries enabled
  @Test
  public void testGetSparkEngineHistoryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineHistoryServerWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineHistoryServerWOptions();
  }

  // Test the getSparkEngineHistoryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineHistoryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineHistoryServer(null).execute();
  }

  // Test the startSparkEngineHistoryServer operation with a valid options model parameter
  @Test
  public void testStartSparkEngineHistoryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_termination_time\": \"2022-02-24T07:37:47Z\", \"cores\": \"1\", \"memory\": \"4G\", \"start_time\": \"2022-02-21T07:37:47Z\", \"state\": \"started\"}";
    String startSparkEngineHistoryServerPath = "/spark_engines/testString/history_server";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the StartSparkEngineHistoryServerOptions model
    StartSparkEngineHistoryServerOptions startSparkEngineHistoryServerOptionsModel = new StartSparkEngineHistoryServerOptions.Builder()
      .id("testString")
      .cores("1")
      .memory("4G")
      .authInstanceId("testString")
      .build();

    // Invoke startSparkEngineHistoryServer() with a valid options model and verify the result
    Response<SparkHistoryServer> response = watsonxDataService.startSparkEngineHistoryServer(startSparkEngineHistoryServerOptionsModel).execute();
    assertNotNull(response);
    SparkHistoryServer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, startSparkEngineHistoryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the startSparkEngineHistoryServer operation with and without retries enabled
  @Test
  public void testStartSparkEngineHistoryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testStartSparkEngineHistoryServerWOptions();

    watsonxDataService.disableRetries();
    testStartSparkEngineHistoryServerWOptions();
  }

  // Test the startSparkEngineHistoryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartSparkEngineHistoryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.startSparkEngineHistoryServer(null).execute();
  }

  // Test the deleteSparkEngineHistoryServer operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineHistoryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEngineHistoryServerPath = "/spark_engines/testString/history_server";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineHistoryServerOptions model
    DeleteSparkEngineHistoryServerOptions deleteSparkEngineHistoryServerOptionsModel = new DeleteSparkEngineHistoryServerOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngineHistoryServer() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngineHistoryServer(deleteSparkEngineHistoryServerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEngineHistoryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSparkEngineHistoryServer operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineHistoryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineHistoryServerWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineHistoryServerWOptions();
  }

  // Test the deleteSparkEngineHistoryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineHistoryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngineHistoryServer(null).execute();
  }

  // Test the getSparkEngineHistoryServerUi operation with a valid options model parameter
  @Test
  public void testGetSparkEngineHistoryServerUiWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String getSparkEngineHistoryServerUiPath = "/spark_engines/testString/history_server/ui";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineHistoryServerUiOptions model
    GetSparkEngineHistoryServerUiOptions getSparkEngineHistoryServerUiOptionsModel = new GetSparkEngineHistoryServerUiOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineHistoryServerUi() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.getSparkEngineHistoryServerUi(getSparkEngineHistoryServerUiOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineHistoryServerUiPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineHistoryServerUi operation with and without retries enabled
  @Test
  public void testGetSparkEngineHistoryServerUiWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineHistoryServerUiWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineHistoryServerUiWOptions();
  }

  // Test the getSparkEngineHistoryServerUi operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineHistoryServerUiNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineHistoryServerUi(null).execute();
  }

  // Test the pauseSparkEngine operation with a valid options model parameter
  @Test
  public void testPauseSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String pauseSparkEnginePath = "/spark_engines/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PauseSparkEngineOptions model
    PauseSparkEngineOptions pauseSparkEngineOptionsModel = new PauseSparkEngineOptions.Builder()
      .id("testString")
      .force(true)
      .authInstanceId("testString")
      .build();

    // Invoke pauseSparkEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.pauseSparkEngine(pauseSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, pauseSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the pauseSparkEngine operation with and without retries enabled
  @Test
  public void testPauseSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testPauseSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testPauseSparkEngineWOptions();
  }

  // Test the pauseSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPauseSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.pauseSparkEngine(null).execute();
  }

  // Test the listSparkEngineQueryServers operation with a valid options model parameter
  @Test
  public void testListSparkEngineQueryServersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"query_servers\": [{\"creation_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"failed_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"finish_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"query_server_details\": {\"conf\": {\"mapKey\": \"configuration\"}, \"env\": {\"mapKey\": \"configuration\"}, \"name\": \"spark-sql-server\", \"spark_version\": \"3.3\"}, \"runtime\": {\"spark_version\": \"3.4\"}, \"server_endpoint\": \"jdbc:hive2://<CPD Host/SaaS Host>:443?hive.server2.transport.mode=http;hive.server2.thrift.http.path=/v3/analytics_engines/{instance_id}/spark_sql_server/{sql_server_id>}/connect,ssl=true;\", \"start_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"state\": \"ACTIVE\"}]}";
    String listSparkEngineQueryServersPath = "/spark_engines/testString/query_servers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEngineQueryServersOptions model
    ListSparkEngineQueryServersOptions listSparkEngineQueryServersOptionsModel = new ListSparkEngineQueryServersOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSparkEngineQueryServers() with a valid options model and verify the result
    Response<SparkEngineQueryServerDetailsCollection> response = watsonxDataService.listSparkEngineQueryServers(listSparkEngineQueryServersOptionsModel).execute();
    assertNotNull(response);
    SparkEngineQueryServerDetailsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEngineQueryServersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSparkEngineQueryServers operation with and without retries enabled
  @Test
  public void testListSparkEngineQueryServersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEngineQueryServersWOptions();

    watsonxDataService.disableRetries();
    testListSparkEngineQueryServersWOptions();
  }

  // Test the listSparkEngineQueryServers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSparkEngineQueryServersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSparkEngineQueryServers(null).execute();
  }

  // Test the createSparkEngineQueryServer operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineQueryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"creation_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"failed_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"finish_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"query_server_details\": {\"conf\": {\"mapKey\": \"configuration\"}, \"env\": {\"mapKey\": \"configuration\"}, \"name\": \"spark-sql-server\", \"spark_version\": \"3.3\"}, \"runtime\": {\"spark_version\": \"3.4\"}, \"server_endpoint\": \"jdbc:hive2://<CPD Host/SaaS Host>:443?hive.server2.transport.mode=http;hive.server2.thrift.http.path=/v3/analytics_engines/{instance_id}/spark_sql_server/{sql_server_id>}/connect,ssl=true;\", \"start_time\": \"Wednesday 25 November 2020 14:14:31.311+0000\", \"state\": \"ACTIVE\"}";
    String createSparkEngineQueryServerPath = "/spark_engines/testString/query_servers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkApplicationRuntime model
    SparkApplicationRuntime sparkApplicationRuntimeModel = new SparkApplicationRuntime.Builder()
      .sparkVersion("3.4")
      .build();

    // Construct an instance of the SparkEngineQueryServerDetailsPrototypes model
    SparkEngineQueryServerDetailsPrototypes sparkEngineQueryServerDetailsPrototypesModel = new SparkEngineQueryServerDetailsPrototypes.Builder()
      .conf(java.util.Collections.singletonMap("key1", "configuration"))
      .env(java.util.Collections.singletonMap("key1", "configuration"))
      .name("spark-sql-server")
      .runtime(sparkApplicationRuntimeModel)
      .build();

    // Construct an instance of the SparkVolumeDetails model
    SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
      .mountPath("/mount/path")
      .name("my-volume")
      .readOnly(true)
      .sourceSubPath("/source/path")
      .build();

    // Construct an instance of the CreateSparkEngineQueryServerOptions model
    CreateSparkEngineQueryServerOptions createSparkEngineQueryServerOptionsModel = new CreateSparkEngineQueryServerOptions.Builder()
      .id("testString")
      .queryServerDetails(sparkEngineQueryServerDetailsPrototypesModel)
      .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngineQueryServer() with a valid options model and verify the result
    Response<SparkEngineQueryServerDetails> response = watsonxDataService.createSparkEngineQueryServer(createSparkEngineQueryServerOptionsModel).execute();
    assertNotNull(response);
    SparkEngineQueryServerDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEngineQueryServerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngineQueryServer operation with and without retries enabled
  @Test
  public void testCreateSparkEngineQueryServerWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineQueryServerWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineQueryServerWOptions();
  }

  // Test the createSparkEngineQueryServer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineQueryServerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngineQueryServer(null).execute();
  }

  // Test the resumeSparkEngine operation with a valid options model parameter
  @Test
  public void testResumeSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String resumeSparkEnginePath = "/spark_engines/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResumeSparkEngineOptions model
    ResumeSparkEngineOptions resumeSparkEngineOptionsModel = new ResumeSparkEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke resumeSparkEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.resumeSparkEngine(resumeSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resumeSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the resumeSparkEngine operation with and without retries enabled
  @Test
  public void testResumeSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testResumeSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testResumeSparkEngineWOptions();
  }

  // Test the resumeSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResumeSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.resumeSparkEngine(null).execute();
  }

  // Test the scaleSparkEngine operation with a valid options model parameter
  @Test
  public void testScaleSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String scaleSparkEnginePath = "/spark_engines/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the ScaleSparkEngineOptions model
    ScaleSparkEngineOptions scaleSparkEngineOptionsModel = new ScaleSparkEngineOptions.Builder()
      .id("testString")
      .numberOfNodes(Long.valueOf("2"))
      .authInstanceId("testString")
      .build();

    // Invoke scaleSparkEngine() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.scaleSparkEngine(scaleSparkEngineOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, scaleSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the scaleSparkEngine operation with and without retries enabled
  @Test
  public void testScaleSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testScaleSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testScaleSparkEngineWOptions();
  }

  // Test the scaleSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testScaleSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.scaleSparkEngine(null).execute();
  }

  // Test the listCatalogs operation with a valid options model parameter
  @Test
  public void testListCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listCatalogsPath = "/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCatalogsOptions model
    ListCatalogsOptions listCatalogsOptionsModel = new ListCatalogsOptions.Builder()
      .authInstanceId("testString")
      .accountId("testString")
      .secret("testString")
      .defaultCatalogs(false)
      .view("testString")
      .build();

    // Invoke listCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listCatalogs(listCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("default_catalogs")), Boolean.valueOf(false));
    assertEquals(query.get("view"), "testString");
  }

  // Test the listCatalogs operation with and without retries enabled
  @Test
  public void testListCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListCatalogsWOptions();
  }

  // Test the listCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testListCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine_association\": [{\"catalog_name\": \"hive_data\", \"engine_id\": \"spark762\"}]}";
    String listCatalogEngineAssociationPath = "/catalogs/engine_association";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCatalogEngineAssociationOptions model
    ListCatalogEngineAssociationOptions listCatalogEngineAssociationOptionsModel = new ListCatalogEngineAssociationOptions.Builder()
      .secret("testString")
      .engineId("testString")
      .build();

    // Invoke listCatalogEngineAssociation() with a valid options model and verify the result
    Response<CatalogEngineAssociation> response = watsonxDataService.listCatalogEngineAssociation(listCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    CatalogEngineAssociation responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCatalogEngineAssociationPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testListCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testListCatalogEngineAssociationWOptions();
  }

  // Test the listCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listCatalogEngineAssociation(null).execute();
  }

  // Test the replaceCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testReplaceCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine_association\": [{\"catalog_name\": \"hive_data\", \"engine_id\": \"spark762\"}]}";
    String replaceCatalogEngineAssociationPath = "/catalogs/engine_association";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CatalogEngineAssociationPatchObjectPrototype model
    CatalogEngineAssociationPatchObjectPrototype catalogEngineAssociationPatchObjectPrototypeModel = new CatalogEngineAssociationPatchObjectPrototype.Builder()
      .action("add")
      .catalogName("hive_data")
      .engineId("spark762")
      .build();

    // Construct an instance of the ReplaceCatalogEngineAssociationOptions model
    ReplaceCatalogEngineAssociationOptions replaceCatalogEngineAssociationOptionsModel = new ReplaceCatalogEngineAssociationOptions.Builder()
      .secret("testString")
      .catalogEngineAssociation(java.util.Arrays.asList(catalogEngineAssociationPatchObjectPrototypeModel))
      .build();

    // Invoke replaceCatalogEngineAssociation() with a valid options model and verify the result
    Response<CatalogEngineAssociation> response = watsonxDataService.replaceCatalogEngineAssociation(replaceCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    CatalogEngineAssociation responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceCatalogEngineAssociationPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testReplaceCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testReplaceCatalogEngineAssociationWOptions();
  }

  // Test the replaceCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceCatalogEngineAssociation(null).execute();
  }

  // Test the createCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testCreateCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine_association\": [{\"catalog_name\": \"hive_data\", \"engine_id\": \"spark762\"}]}";
    String createCatalogEngineAssociationPath = "/catalogs/engine_association";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CatalogEngineAssociationObjectPrototype model
    CatalogEngineAssociationObjectPrototype catalogEngineAssociationObjectPrototypeModel = new CatalogEngineAssociationObjectPrototype.Builder()
      .catalogName("hive_data")
      .engineId("spark762")
      .build();

    // Construct an instance of the CreateCatalogEngineAssociationOptions model
    CreateCatalogEngineAssociationOptions createCatalogEngineAssociationOptionsModel = new CreateCatalogEngineAssociationOptions.Builder()
      .secret("testString")
      .catalogEngineAssociation(java.util.Arrays.asList(catalogEngineAssociationObjectPrototypeModel))
      .build();

    // Invoke createCatalogEngineAssociation() with a valid options model and verify the result
    Response<CatalogEngineAssociation> response = watsonxDataService.createCatalogEngineAssociation(createCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    CatalogEngineAssociation responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCatalogEngineAssociationPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testCreateCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testCreateCatalogEngineAssociationWOptions();
  }

  // Test the createCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createCatalogEngineAssociation(null).execute();
  }

  // Test the deleteCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testDeleteCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCatalogEngineAssociationPath = "/catalogs/engine_association/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCatalogEngineAssociationOptions model
    DeleteCatalogEngineAssociationOptions deleteCatalogEngineAssociationOptionsModel = new DeleteCatalogEngineAssociationOptions.Builder()
      .secret("testString")
      .engineId("testString")
      .build();

    // Invoke deleteCatalogEngineAssociation() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteCatalogEngineAssociation(deleteCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCatalogEngineAssociationPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testDeleteCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testDeleteCatalogEngineAssociationWOptions();
  }

  // Test the deleteCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteCatalogEngineAssociation(null).execute();
  }

  // Test the getCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testGetCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\"}";
    String getCatalogEngineAssociationPath = "/catalogs/testString/engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogEngineAssociationOptions model
    GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptionsModel = new GetCatalogEngineAssociationOptions.Builder()
      .catalogName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalogEngineAssociation() with a valid options model and verify the result
    Response<CatalogEngineResponse> response = watsonxDataService.getCatalogEngineAssociation(getCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    CatalogEngineResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogEngineAssociationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testGetCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testGetCatalogEngineAssociationWOptions();
  }

  // Test the getCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getCatalogEngineAssociation(null).execute();
  }

  // Test the deleteSchema operation with a valid options model parameter
  @Test
  public void testDeleteSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSchemaPath = "/catalogs/testString/schemas/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSchemaOptions model
    DeleteSchemaOptions deleteSchemaOptionsModel = new DeleteSchemaOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSchema() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSchema(deleteSchemaOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSchemaPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the deleteSchema operation with and without retries enabled
  @Test
  public void testDeleteSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSchemaWOptions();

    watsonxDataService.disableRetries();
    testDeleteSchemaWOptions();
  }

  // Test the deleteSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSchema(null).execute();
  }

  // Test the listTables operation with a valid options model parameter
  @Test
  public void testListTablesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"tables\": [\"tables\"]}";
    String listTablesPath = "/catalogs/testString/schemas/testString/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTablesOptions model
    ListTablesOptions listTablesOptionsModel = new ListTablesOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listTables() with a valid options model and verify the result
    Response<TableCollection> response = watsonxDataService.listTables(listTablesOptionsModel).execute();
    assertNotNull(response);
    TableCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTablesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listTables operation with and without retries enabled
  @Test
  public void testListTablesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListTablesWOptions();

    watsonxDataService.disableRetries();
    testListTablesWOptions();
  }

  // Test the listTables operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTablesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listTables(null).execute();
  }

  // Test the getTable operation with a valid options model parameter
  @Test
  public void testGetTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}], \"name\": \"name\"}";
    String getTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableOptions model
    GetTableOptions getTableOptionsModel = new GetTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .type("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTable() with a valid options model and verify the result
    Response<Table> response = watsonxDataService.getTable(getTableOptionsModel).execute();
    assertNotNull(response);
    Table responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("type"), "testString");
  }

  // Test the getTable operation with and without retries enabled
  @Test
  public void testGetTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTableWOptions();

    watsonxDataService.disableRetries();
    testGetTableWOptions();
  }

  // Test the getTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTable(null).execute();
  }

  // Test the deleteTable operation with a valid options model parameter
  @Test
  public void testDeleteTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTableOptions model
    DeleteTableOptions deleteTableOptionsModel = new DeleteTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .type("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteTable() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteTable(deleteTableOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("type"), "testString");
  }

  // Test the deleteTable operation with and without retries enabled
  @Test
  public void testDeleteTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteTableWOptions();

    watsonxDataService.disableRetries();
    testDeleteTableWOptions();
  }

  // Test the deleteTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteTable(null).execute();
  }

  // Test the updateTable operation with a valid options model parameter
  @Test
  public void testUpdateTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}], \"name\": \"name\"}";
    String updateTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TablePatch model
    TablePatch tablePatchModel = new TablePatch.Builder()
      .name("updated_table_name")
      .build();
    Map<String, Object> tablePatchModelAsPatch = tablePatchModel.asPatch();

    // Construct an instance of the UpdateTableOptions model
    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .body(tablePatchModelAsPatch)
      .type("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateTable() with a valid options model and verify the result
    Response<Table> response = watsonxDataService.updateTable(updateTableOptionsModel).execute();
    assertNotNull(response);
    Table responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("type"), "testString");
  }

  // Test the updateTable operation with and without retries enabled
  @Test
  public void testUpdateTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateTableWOptions();

    watsonxDataService.disableRetries();
    testUpdateTableWOptions();
  }

  // Test the updateTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateTable(null).execute();
  }

  // Test the listColumns operation with a valid options model parameter
  @Test
  public void testListColumnsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}]}";
    String listColumnsPath = "/catalogs/testString/schemas/testString/tables/testString/columns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListColumnsOptions model
    ListColumnsOptions listColumnsOptionsModel = new ListColumnsOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listColumns() with a valid options model and verify the result
    Response<ColumnCollection> response = watsonxDataService.listColumns(listColumnsOptionsModel).execute();
    assertNotNull(response);
    ColumnCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listColumnsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listColumns operation with and without retries enabled
  @Test
  public void testListColumnsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListColumnsWOptions();

    watsonxDataService.disableRetries();
    testListColumnsWOptions();
  }

  // Test the listColumns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListColumnsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listColumns(null).execute();
  }

  // Test the createColumns operation with a valid options model parameter
  @Test
  public void testCreateColumnsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}]}";
    String createColumnsPath = "/catalogs/testString/schemas/testString/tables/testString/columns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Column model
    Column columnModel = new Column.Builder()
      .comment("Expenses column for each department")
      .extra("AUTO_INCREMENT")
      .length("30")
      .name("expenses")
      .precision("10")
      .scale("2")
      .type("varchar")
      .build();

    // Construct an instance of the CreateColumnsOptions model
    CreateColumnsOptions createColumnsOptionsModel = new CreateColumnsOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .columns(java.util.Arrays.asList(columnModel))
      .authInstanceId("testString")
      .build();

    // Invoke createColumns() with a valid options model and verify the result
    Response<ColumnCollection> response = watsonxDataService.createColumns(createColumnsOptionsModel).execute();
    assertNotNull(response);
    ColumnCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createColumnsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the createColumns operation with and without retries enabled
  @Test
  public void testCreateColumnsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateColumnsWOptions();

    watsonxDataService.disableRetries();
    testCreateColumnsWOptions();
  }

  // Test the createColumns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateColumnsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createColumns(null).execute();
  }

  // Test the deleteColumn operation with a valid options model parameter
  @Test
  public void testDeleteColumnWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteColumnPath = "/catalogs/testString/schemas/testString/tables/testString/columns/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteColumnOptions model
    DeleteColumnOptions deleteColumnOptionsModel = new DeleteColumnOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .columnName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteColumn() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteColumn(deleteColumnOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteColumnPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the deleteColumn operation with and without retries enabled
  @Test
  public void testDeleteColumnWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteColumnWOptions();

    watsonxDataService.disableRetries();
    testDeleteColumnWOptions();
  }

  // Test the deleteColumn operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteColumnNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteColumn(null).execute();
  }

  // Test the updateColumn operation with a valid options model parameter
  @Test
  public void testUpdateColumnWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}";
    String updateColumnPath = "/catalogs/testString/schemas/testString/tables/testString/columns/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ColumnPatch model
    ColumnPatch columnPatchModel = new ColumnPatch.Builder()
      .name("expenses")
      .build();
    Map<String, Object> columnPatchModelAsPatch = columnPatchModel.asPatch();

    // Construct an instance of the UpdateColumnOptions model
    UpdateColumnOptions updateColumnOptionsModel = new UpdateColumnOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .columnName("testString")
      .body(columnPatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateColumn() with a valid options model and verify the result
    Response<Column> response = watsonxDataService.updateColumn(updateColumnOptionsModel).execute();
    assertNotNull(response);
    Column responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateColumnPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the updateColumn operation with and without retries enabled
  @Test
  public void testUpdateColumnWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateColumnWOptions();

    watsonxDataService.disableRetries();
    testUpdateColumnWOptions();
  }

  // Test the updateColumn operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateColumnNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateColumn(null).execute();
  }

  // Test the getMaskedColumns operation with a valid options model parameter
  @Test
  public void testGetMaskedColumnsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"masked_columns\": [{\"name\": \"email\", \"operation\": \"redact\"}]}";
    String getMaskedColumnsPath = "/catalogs/testString/schemas/testString/tables/testString/masked/columns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMaskedColumnsOptions model
    GetMaskedColumnsOptions getMaskedColumnsOptionsModel = new GetMaskedColumnsOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getMaskedColumns() with a valid options model and verify the result
    Response<MaskedColumnCollection> response = watsonxDataService.getMaskedColumns(getMaskedColumnsOptionsModel).execute();
    assertNotNull(response);
    MaskedColumnCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMaskedColumnsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the getMaskedColumns operation with and without retries enabled
  @Test
  public void testGetMaskedColumnsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetMaskedColumnsWOptions();

    watsonxDataService.disableRetries();
    testGetMaskedColumnsWOptions();
  }

  // Test the getMaskedColumns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMaskedColumnsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getMaskedColumns(null).execute();
  }

  // Test the rollbackTable operation with a valid options model parameter
  @Test
  public void testRollbackTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String rollbackTablePath = "/catalogs/testString/schemas/testString/tables/testString/rollback";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RollbackTableOptions model
    RollbackTableOptions rollbackTableOptionsModel = new RollbackTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .snapshotId("12357647")
      .authInstanceId("testString")
      .build();

    // Invoke rollbackTable() with a valid options model and verify the result
    Response<SuccessResponsePrototype> response = watsonxDataService.rollbackTable(rollbackTableOptionsModel).execute();
    assertNotNull(response);
    SuccessResponsePrototype responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, rollbackTablePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the rollbackTable operation with and without retries enabled
  @Test
  public void testRollbackTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRollbackTableWOptions();

    watsonxDataService.disableRetries();
    testRollbackTableWOptions();
  }

  // Test the rollbackTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRollbackTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.rollbackTable(null).execute();
  }

  // Test the listTableSnapshots operation with a valid options model parameter
  @Test
  public void testListTableSnapshotsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"snapshots\": [{\"added_data_files\": \"1\", \"added_files_size\": \"17425\", \"added_records\": \"3277\", \"changed_partition_count\": \"1\", \"committed_at\": \"2025-01-29T08:36:21.717Z\", \"is_current_snapshot\": true, \"operation\": \"alter\", \"snapshot_id\": \"2332342122211222\", \"total_data_files\": \"2\", \"total_delete_files\": \"0\", \"total_equality_deletes\": \"0\", \"total_position_deletes\": \"0\", \"total_records\": \"5000\"}]}";
    String listTableSnapshotsPath = "/catalogs/testString/schemas/testString/tables/testString/snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTableSnapshotsOptions model
    ListTableSnapshotsOptions listTableSnapshotsOptionsModel = new ListTableSnapshotsOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listTableSnapshots() with a valid options model and verify the result
    Response<TableSnapshotCollection> response = watsonxDataService.listTableSnapshots(listTableSnapshotsOptionsModel).execute();
    assertNotNull(response);
    TableSnapshotCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTableSnapshotsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listTableSnapshots operation with and without retries enabled
  @Test
  public void testListTableSnapshotsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListTableSnapshotsWOptions();

    watsonxDataService.disableRetries();
    testListTableSnapshotsWOptions();
  }

  // Test the listTableSnapshots operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTableSnapshotsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listTableSnapshots(null).execute();
  }

  // Test the listSchemas operation with a valid options model parameter
  @Test
  public void testListSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"schemas\": [\"schemas\"]}";
    String listSchemasPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSchemasOptions model
    ListSchemasOptions listSchemasOptionsModel = new ListSchemasOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSchemas() with a valid options model and verify the result
    Response<SchemasCollection> response = watsonxDataService.listSchemas(listSchemasOptionsModel).execute();
    assertNotNull(response);
    SchemasCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSchemasPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listSchemas operation with and without retries enabled
  @Test
  public void testListSchemasWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSchemasWOptions();

    watsonxDataService.disableRetries();
    testListSchemasWOptions();
  }

  // Test the listSchemas operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSchemasNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSchemas(null).execute();
  }

  // Test the createSchema operation with a valid options model parameter
  @Test
  public void testCreateSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"custom_path\": \"sample-path\", \"hostname\": \"db2@hostname.com\", \"name\": \"SampleSchema1\", \"port\": 4553, \"storage_name\": \"sample-bucket\"}";
    String createSchemaPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSchemaOptions model
    CreateSchemaOptions createSchemaOptionsModel = new CreateSchemaOptions.Builder()
      .engineId("testString")
      .id("testString")
      .customPath("sample-path")
      .name("SampleSchema1")
      .hostname("db2@hostname.com")
      .port(Long.valueOf("4553"))
      .storageName("sample-bucket")
      .authInstanceId("testString")
      .build();

    // Invoke createSchema() with a valid options model and verify the result
    Response<SchemaPrototype> response = watsonxDataService.createSchema(createSchemaOptionsModel).execute();
    assertNotNull(response);
    SchemaPrototype responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSchemaPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the createSchema operation with and without retries enabled
  @Test
  public void testCreateSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSchemaWOptions();

    watsonxDataService.disableRetries();
    testCreateSchemaWOptions();
  }

  // Test the createSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSchema(null).execute();
  }

  // Test the updateSyncCatalog operation with a valid options model parameter
  @Test
  public void testUpdateSyncCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String updateSyncCatalogPath = "/catalogs/testString/sync";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSyncCatalogOptions model
    UpdateSyncCatalogOptions updateSyncCatalogOptionsModel = new UpdateSyncCatalogOptions.Builder()
      .id("testString")
      .autoAddNewTables(true)
      .registerNewTables(true)
      .syncExistingTables(true)
      .syncIcebergMd(true)
      .syncPath("sample-path")
      .authInstanceId("testString")
      .build();

    // Invoke updateSyncCatalog() with a valid options model and verify the result
    Response<SuccessResponsePrototype> response = watsonxDataService.updateSyncCatalog(updateSyncCatalogOptionsModel).execute();
    assertNotNull(response);
    SuccessResponsePrototype responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSyncCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSyncCatalog operation with and without retries enabled
  @Test
  public void testUpdateSyncCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateSyncCatalogWOptions();

    watsonxDataService.disableRetries();
    testUpdateSyncCatalogWOptions();
  }

  // Test the updateSyncCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSyncCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateSyncCatalog(null).execute();
  }

  // Test the getCatalog operation with a valid options model parameter
  @Test
  public void testGetCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"scope\": \"account\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}";
    String getCatalogPath = "/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogOptions model
    GetCatalogOptions getCatalogOptionsModel = new GetCatalogOptions.Builder()
      .name("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalog() with a valid options model and verify the result
    Response<Catalog> response = watsonxDataService.getCatalog(getCatalogOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalog operation with and without retries enabled
  @Test
  public void testGetCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetCatalogWOptions();
  }

  // Test the getCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getCatalog(null).execute();
  }

  // Test the deleteCatalog operation with a valid options model parameter
  @Test
  public void testDeleteCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCatalogPath = "/catalogs/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCatalogOptions model
    DeleteCatalogOptions deleteCatalogOptionsModel = new DeleteCatalogOptions.Builder()
      .name("testString")
      .skipMdsCall(false)
      .authInstanceId("testString")
      .accountId("testString")
      .build();

    // Invoke deleteCatalog() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteCatalog(deleteCatalogOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCatalogPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the deleteCatalog operation with and without retries enabled
  @Test
  public void testDeleteCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteCatalogWOptions();

    watsonxDataService.disableRetries();
    testDeleteCatalogWOptions();
  }

  // Test the deleteCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteCatalog(null).execute();
  }

  // Test the listMilvusServices operation with a valid options model parameter
  @Test
  public void testListMilvusServicesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"milvus_services\": [{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"sampleService123\", \"index_type\": \"flat\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"milvus_pause_reason\": \"force\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"sample root path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"storage name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}]}";
    String listMilvusServicesPath = "/milvus_services";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMilvusServicesOptions model
    ListMilvusServicesOptions listMilvusServicesOptionsModel = new ListMilvusServicesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listMilvusServices() with a valid options model and verify the result
    Response<MilvusServiceCollection> response = watsonxDataService.listMilvusServices(listMilvusServicesOptionsModel).execute();
    assertNotNull(response);
    MilvusServiceCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMilvusServicesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listMilvusServices operation with and without retries enabled
  @Test
  public void testListMilvusServicesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListMilvusServicesWOptions();

    watsonxDataService.disableRetries();
    testListMilvusServicesWOptions();
  }

  // Test the createMilvusService operation with a valid options model parameter
  @Test
  public void testCreateMilvusServiceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"sampleService123\", \"index_type\": \"flat\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"milvus_pause_reason\": \"force\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"sample root path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"storage name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String createMilvusServicePath = "/milvus_services";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServiceOptions model
    CreateMilvusServiceOptions createMilvusServiceOptionsModel = new CreateMilvusServiceOptions.Builder()
      .displayName("sampleService")
      .origin("native")
      .rootPath("Sample/path")
      .tshirtSize("small")
      .dcCpu(Double.valueOf("0.01"))
      .dcMemory(Double.valueOf("0.01"))
      .dcReplicas(Long.valueOf("1"))
      .description("milvus service for running sql queries")
      .dwCpu(Double.valueOf("0.01"))
      .dwMemory(Double.valueOf("0.01"))
      .dwReplicas(Long.valueOf("1"))
      .etcdCpu(Double.valueOf("0.01"))
      .etcdMemory(Double.valueOf("0.01"))
      .id("sampleEngine123")
      .indexType("ivf_sq8")
      .iwCpu(Double.valueOf("0.01"))
      .iwMemory(Double.valueOf("0.01"))
      .iwReplicas(Long.valueOf("1"))
      .kafkaCpu(Double.valueOf("0.01"))
      .kafkaMemory(Double.valueOf("0.01"))
      .proxyCpu(Double.valueOf("0.01"))
      .proxyMemory(Double.valueOf("0.01"))
      .proxyReplicas(Long.valueOf("1"))
      .qcCpu(Double.valueOf("0.01"))
      .qcMemory(Double.valueOf("0.01"))
      .qcReplicas(Long.valueOf("1"))
      .qwCpu(Double.valueOf("0.01"))
      .qwMemory(Double.valueOf("0.01"))
      .qwReplicas(Long.valueOf("1"))
      .rcCpu(Double.valueOf("0.01"))
      .rcMemory(Double.valueOf("0.01"))
      .rcReplicas(Long.valueOf("1"))
      .storageName("Sample_storage_name")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .vector(Long.valueOf("1"))
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();

    // Invoke createMilvusService() with a valid options model and verify the result
    Response<MilvusService> response = watsonxDataService.createMilvusService(createMilvusServiceOptionsModel).execute();
    assertNotNull(response);
    MilvusService responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMilvusServicePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMilvusService operation with and without retries enabled
  @Test
  public void testCreateMilvusServiceWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMilvusServiceWOptions();

    watsonxDataService.disableRetries();
    testCreateMilvusServiceWOptions();
  }

  // Test the createMilvusService operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMilvusService(null).execute();
  }

  // Test the getMilvusService operation with a valid options model parameter
  @Test
  public void testGetMilvusServiceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"sampleService123\", \"index_type\": \"flat\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"milvus_pause_reason\": \"force\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"sample root path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"storage name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String getMilvusServicePath = "/milvus_services/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMilvusServiceOptions model
    GetMilvusServiceOptions getMilvusServiceOptionsModel = new GetMilvusServiceOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getMilvusService() with a valid options model and verify the result
    Response<MilvusService> response = watsonxDataService.getMilvusService(getMilvusServiceOptionsModel).execute();
    assertNotNull(response);
    MilvusService responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMilvusServicePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMilvusService operation with and without retries enabled
  @Test
  public void testGetMilvusServiceWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetMilvusServiceWOptions();

    watsonxDataService.disableRetries();
    testGetMilvusServiceWOptions();
  }

  // Test the getMilvusService operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMilvusServiceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getMilvusService(null).execute();
  }

  // Test the deleteMilvusService operation with a valid options model parameter
  @Test
  public void testDeleteMilvusServiceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteMilvusServicePath = "/milvus_services/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteMilvusServiceOptions model
    DeleteMilvusServiceOptions deleteMilvusServiceOptionsModel = new DeleteMilvusServiceOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteMilvusService() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteMilvusService(deleteMilvusServiceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMilvusServicePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteMilvusService operation with and without retries enabled
  @Test
  public void testDeleteMilvusServiceWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteMilvusServiceWOptions();

    watsonxDataService.disableRetries();
    testDeleteMilvusServiceWOptions();
  }

  // Test the deleteMilvusService operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMilvusServiceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteMilvusService(null).execute();
  }

  // Test the updateMilvusService operation with a valid options model parameter
  @Test
  public void testUpdateMilvusServiceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"sampleService123\", \"index_type\": \"flat\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"milvus_pause_reason\": \"force\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"sample root path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"storage name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String updateMilvusServicePath = "/milvus_services/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MilvusServicePatch model
    MilvusServicePatch milvusServicePatchModel = new MilvusServicePatch.Builder()
      .description("updated description for milvus service")
      .displayName("sampleService")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> milvusServicePatchModelAsPatch = milvusServicePatchModel.asPatch();

    // Construct an instance of the UpdateMilvusServiceOptions model
    UpdateMilvusServiceOptions updateMilvusServiceOptionsModel = new UpdateMilvusServiceOptions.Builder()
      .id("testString")
      .body(milvusServicePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateMilvusService() with a valid options model and verify the result
    Response<MilvusService> response = watsonxDataService.updateMilvusService(updateMilvusServiceOptionsModel).execute();
    assertNotNull(response);
    MilvusService responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMilvusServicePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMilvusService operation with and without retries enabled
  @Test
  public void testUpdateMilvusServiceWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateMilvusServiceWOptions();

    watsonxDataService.disableRetries();
    testUpdateMilvusServiceWOptions();
  }

  // Test the updateMilvusService operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMilvusServiceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateMilvusService(null).execute();
  }

  // Test the createMilvusServicePause operation with a valid options model parameter
  @Test
  public void testCreateMilvusServicePauseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String createMilvusServicePausePath = "/milvus_services/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServicePauseOptions model
    CreateMilvusServicePauseOptions createMilvusServicePauseOptionsModel = new CreateMilvusServicePauseOptions.Builder()
      .id("testString")
      .secret("testString")
      .milvusPause("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createMilvusServicePause() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createMilvusServicePause(createMilvusServicePauseOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMilvusServicePausePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("milvus_pause"), "testString");
  }

  // Test the createMilvusServicePause operation with and without retries enabled
  @Test
  public void testCreateMilvusServicePauseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMilvusServicePauseWOptions();

    watsonxDataService.disableRetries();
    testCreateMilvusServicePauseWOptions();
  }

  // Test the createMilvusServicePause operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServicePauseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMilvusServicePause(null).execute();
  }

  // Test the createMilvusServiceResume operation with a valid options model parameter
  @Test
  public void testCreateMilvusServiceResumeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String createMilvusServiceResumePath = "/milvus_services/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServiceResumeOptions model
    CreateMilvusServiceResumeOptions createMilvusServiceResumeOptionsModel = new CreateMilvusServiceResumeOptions.Builder()
      .id("testString")
      .secret("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createMilvusServiceResume() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createMilvusServiceResume(createMilvusServiceResumeOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMilvusServiceResumePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMilvusServiceResume operation with and without retries enabled
  @Test
  public void testCreateMilvusServiceResumeWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMilvusServiceResumeWOptions();

    watsonxDataService.disableRetries();
    testCreateMilvusServiceResumeWOptions();
  }

  // Test the createMilvusServiceResume operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceResumeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMilvusServiceResume(null).execute();
  }

  // Test the createMilvusServiceScale operation with a valid options model parameter
  @Test
  public void testCreateMilvusServiceScaleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String createMilvusServiceScalePath = "/milvus_services/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServiceScaleOptions model
    CreateMilvusServiceScaleOptions createMilvusServiceScaleOptionsModel = new CreateMilvusServiceScaleOptions.Builder()
      .id("testString")
      .tshirtSize("small")
      .dcCpu(Double.valueOf("0.01"))
      .dcMemory(Double.valueOf("0.01"))
      .dcReplicas(Long.valueOf("1"))
      .dwCpu(Double.valueOf("0.01"))
      .dwMemory(Double.valueOf("0.01"))
      .dwReplicas(Long.valueOf("1"))
      .etcdCpu(Double.valueOf("0.01"))
      .etcdMemory(Double.valueOf("0.01"))
      .indexType("flat")
      .iwCpu(Double.valueOf("0.01"))
      .iwMemory(Double.valueOf("0.01"))
      .iwReplicas(Long.valueOf("1"))
      .kafkaCpu(Double.valueOf("0.01"))
      .kafkaMemory(Double.valueOf("0.01"))
      .proxyCpu(Double.valueOf("0.01"))
      .proxyMemory(Double.valueOf("0.01"))
      .proxyReplicas(Long.valueOf("1"))
      .qcCpu(Double.valueOf("0.01"))
      .qcMemory(Double.valueOf("0.01"))
      .qcReplicas(Long.valueOf("1"))
      .qwCpu(Double.valueOf("0.01"))
      .qwMemory(Double.valueOf("0.01"))
      .qwReplicas(Long.valueOf("1"))
      .rcCpu(Double.valueOf("0.01"))
      .rcMemory(Double.valueOf("0.01"))
      .rcReplicas(Long.valueOf("1"))
      .vector(Long.valueOf("1"))
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();

    // Invoke createMilvusServiceScale() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createMilvusServiceScale(createMilvusServiceScaleOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMilvusServiceScalePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMilvusServiceScale operation with and without retries enabled
  @Test
  public void testCreateMilvusServiceScaleWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMilvusServiceScaleWOptions();

    watsonxDataService.disableRetries();
    testCreateMilvusServiceScaleWOptions();
  }

  // Test the createMilvusServiceScale operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceScaleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMilvusServiceScale(null).execute();
  }

  // Test the listMilvusServiceDatabases operation with a valid options model parameter
  @Test
  public void testListMilvusServiceDatabasesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"databases\": [{\"id\": \"id\"}]}";
    String listMilvusServiceDatabasesPath = "/milvus_services/testString/databases";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMilvusServiceDatabasesOptions model
    ListMilvusServiceDatabasesOptions listMilvusServiceDatabasesOptionsModel = new ListMilvusServiceDatabasesOptions.Builder()
      .serviceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listMilvusServiceDatabases() with a valid options model and verify the result
    Response<MilvusServiceDatabases> response = watsonxDataService.listMilvusServiceDatabases(listMilvusServiceDatabasesOptionsModel).execute();
    assertNotNull(response);
    MilvusServiceDatabases responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMilvusServiceDatabasesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listMilvusServiceDatabases operation with and without retries enabled
  @Test
  public void testListMilvusServiceDatabasesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListMilvusServiceDatabasesWOptions();

    watsonxDataService.disableRetries();
    testListMilvusServiceDatabasesWOptions();
  }

  // Test the listMilvusServiceDatabases operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMilvusServiceDatabasesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listMilvusServiceDatabases(null).execute();
  }

  // Test the listMilvusDatabaseCollections operation with a valid options model parameter
  @Test
  public void testListMilvusDatabaseCollectionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"collections\": [{\"id\": 1, \"name\": \"col1\", \"physical_channels\": [\"physicalChannels\"], \"virtual_channels\": [\"virtualChannels\"]}]}";
    String listMilvusDatabaseCollectionsPath = "/milvus_services/testString/databases/testString/collections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMilvusDatabaseCollectionsOptions model
    ListMilvusDatabaseCollectionsOptions listMilvusDatabaseCollectionsOptionsModel = new ListMilvusDatabaseCollectionsOptions.Builder()
      .serviceId("testString")
      .databaseId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listMilvusDatabaseCollections() with a valid options model and verify the result
    Response<MilvusDatabaseCollections> response = watsonxDataService.listMilvusDatabaseCollections(listMilvusDatabaseCollectionsOptionsModel).execute();
    assertNotNull(response);
    MilvusDatabaseCollections responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMilvusDatabaseCollectionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listMilvusDatabaseCollections operation with and without retries enabled
  @Test
  public void testListMilvusDatabaseCollectionsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListMilvusDatabaseCollectionsWOptions();

    watsonxDataService.disableRetries();
    testListMilvusDatabaseCollectionsWOptions();
  }

  // Test the listMilvusDatabaseCollections operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMilvusDatabaseCollectionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listMilvusDatabaseCollections(null).execute();
  }

  // Test the listMilvusDatabasePartitions operation with a valid options model parameter
  @Test
  public void testListMilvusDatabasePartitionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"partitions\": [{\"id\": 1, \"name\": \"partition1\"}]}";
    String listMilvusDatabasePartitionsPath = "/milvus_services/testString/databases/testString/collections/testString/partitions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMilvusDatabasePartitionsOptions model
    ListMilvusDatabasePartitionsOptions listMilvusDatabasePartitionsOptionsModel = new ListMilvusDatabasePartitionsOptions.Builder()
      .serviceId("testString")
      .databaseId("testString")
      .collectionName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listMilvusDatabasePartitions() with a valid options model and verify the result
    Response<MilvusDatabasePartitions> response = watsonxDataService.listMilvusDatabasePartitions(listMilvusDatabasePartitionsOptionsModel).execute();
    assertNotNull(response);
    MilvusDatabasePartitions responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMilvusDatabasePartitionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listMilvusDatabasePartitions operation with and without retries enabled
  @Test
  public void testListMilvusDatabasePartitionsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListMilvusDatabasePartitionsWOptions();

    watsonxDataService.disableRetries();
    testListMilvusDatabasePartitionsWOptions();
  }

  // Test the listMilvusDatabasePartitions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMilvusDatabasePartitionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listMilvusDatabasePartitions(null).execute();
  }

  // Test the updateMilvusServiceBucket operation with a valid options model parameter
  @Test
  public void testUpdateMilvusServiceBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"sampleService123\", \"index_type\": \"flat\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"milvus_pause_reason\": \"force\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"sample root path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"storage name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String updateMilvusServiceBucketPath = "/milvus_services/testString/storage";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MilvusServiceStoragePatch model
    MilvusServiceStoragePatch milvusServiceStoragePatchModel = new MilvusServiceStoragePatch.Builder()
      .rootPath("Sample path")
      .storageName("Sample storage name")
      .build();
    Map<String, Object> milvusServiceStoragePatchModelAsPatch = milvusServiceStoragePatchModel.asPatch();

    // Construct an instance of the UpdateMilvusServiceBucketOptions model
    UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptionsModel = new UpdateMilvusServiceBucketOptions.Builder()
      .serviceId("testString")
      .body(milvusServiceStoragePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateMilvusServiceBucket() with a valid options model and verify the result
    Response<MilvusService> response = watsonxDataService.updateMilvusServiceBucket(updateMilvusServiceBucketOptionsModel).execute();
    assertNotNull(response);
    MilvusService responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMilvusServiceBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMilvusServiceBucket operation with and without retries enabled
  @Test
  public void testUpdateMilvusServiceBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateMilvusServiceBucketWOptions();

    watsonxDataService.disableRetries();
    testUpdateMilvusServiceBucketWOptions();
  }

  // Test the updateMilvusServiceBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMilvusServiceBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateMilvusServiceBucket(null).execute();
  }

  // Test the createMilvusServiceBilling operation with a valid options model parameter
  @Test
  public void testCreateMilvusServiceBillingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cost\": {\"cost\": 4, \"memory\": 6, \"vcpu\": 4}}";
    String createMilvusServiceBillingPath = "/milvus_services_billing";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServiceBillingOptions model
    CreateMilvusServiceBillingOptions createMilvusServiceBillingOptionsModel = new CreateMilvusServiceBillingOptions.Builder()
      .iwCpu(Double.valueOf("0"))
      .iwMemory(Double.valueOf("0"))
      .iwReplicas(Long.valueOf("0"))
      .qwCpu(Double.valueOf("0"))
      .qwMemory(Double.valueOf("0"))
      .qwReplicas(Long.valueOf("0"))
      .dcCpu(Double.valueOf("0"))
      .dcMemory(Double.valueOf("0"))
      .dcReplicas(Long.valueOf("0"))
      .dwCpu(Double.valueOf("0"))
      .dwMemory(Double.valueOf("0"))
      .dwReplicas(Long.valueOf("0"))
      .etcdCpu(Double.valueOf("0"))
      .etcdMemory(Double.valueOf("0"))
      .kafkaCpu(Double.valueOf("0"))
      .kafkaMemory(Double.valueOf("0"))
      .proxyCpu(Double.valueOf("0"))
      .proxyMemory(Double.valueOf("0"))
      .proxyReplicas(Long.valueOf("0"))
      .qcCpu(Double.valueOf("0"))
      .qcMemory(Double.valueOf("0"))
      .qcReplicas(Long.valueOf("0"))
      .rcCpu(Double.valueOf("0"))
      .rcMemory(Double.valueOf("0"))
      .rcReplicas(Long.valueOf("0"))
      .authInstanceId("testString")
      .build();

    // Invoke createMilvusServiceBilling() with a valid options model and verify the result
    Response<MilvusBillingSuccessResponse> response = watsonxDataService.createMilvusServiceBilling(createMilvusServiceBillingOptionsModel).execute();
    assertNotNull(response);
    MilvusBillingSuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMilvusServiceBillingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMilvusServiceBilling operation with and without retries enabled
  @Test
  public void testCreateMilvusServiceBillingWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMilvusServiceBillingWOptions();

    watsonxDataService.disableRetries();
    testCreateMilvusServiceBillingWOptions();
  }

  // Test the createMilvusServiceBilling operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceBillingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMilvusServiceBilling(null).execute();
  }

  // Test the getInstanceConfiguration operation with a valid options model parameter
  @Test
  public void testGetInstanceConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"resources\": [{\"details\": [{\"ca_certificate\": \"sample ca certificate\", \"dashboard_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}], \"type\": \"presto\"}], \"watsonx_data_instance\": {\"ca_certificate\": \"sample ca certificate\", \"dashboard_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}}";
    String getInstanceConfigurationPath = "/instance_configuration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceConfigurationOptions model
    GetInstanceConfigurationOptions getInstanceConfigurationOptionsModel = new GetInstanceConfigurationOptions.Builder()
      .secret("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getInstanceConfiguration() with a valid options model and verify the result
    Response<WatsonxInstanceDetails> response = watsonxDataService.getInstanceConfiguration(getInstanceConfigurationOptionsModel).execute();
    assertNotNull(response);
    WatsonxInstanceDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceConfiguration operation with and without retries enabled
  @Test
  public void testGetInstanceConfigurationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetInstanceConfigurationWOptions();

    watsonxDataService.disableRetries();
    testGetInstanceConfigurationWOptions();
  }

  // Test the listInstanceConfigurationResources operation with a valid options model parameter
  @Test
  public void testListInstanceConfigurationResourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"resources\": [{\"connection_name\": \"presto-01\", \"details\": {\"ca_certificate\": \"sample ca certificate\", \"dashboard_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}, \"properties\": {\"connection\": [{\"name\": \"host\", \"value\": \"sample_value\"}]}, \"type\": \"presto\"}]}";
    String listInstanceConfigurationResourcesPath = "/instance_configuration/resources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceConfigurationResourcesOptions model
    ListInstanceConfigurationResourcesOptions listInstanceConfigurationResourcesOptionsModel = new ListInstanceConfigurationResourcesOptions.Builder()
      .target("testString")
      .internalHost(false)
      .type(java.util.Arrays.asList("testString"))
      .authInstanceId("testString")
      .build();

    // Invoke listInstanceConfigurationResources() with a valid options model and verify the result
    Response<ResourceDetailsCollection> response = watsonxDataService.listInstanceConfigurationResources(listInstanceConfigurationResourcesOptionsModel).execute();
    assertNotNull(response);
    ResourceDetailsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceConfigurationResourcesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("target"), "testString");
    assertEquals(Boolean.valueOf(query.get("internal_host")), Boolean.valueOf(false));
    assertEquals(query.get("type"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
  }

  // Test the listInstanceConfigurationResources operation with and without retries enabled
  @Test
  public void testListInstanceConfigurationResourcesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListInstanceConfigurationResourcesWOptions();

    watsonxDataService.disableRetries();
    testListInstanceConfigurationResourcesWOptions();
  }

  // Test the listInstanceConfigurationResources operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceConfigurationResourcesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listInstanceConfigurationResources(null).execute();
  }

  // Test the getInstanceConfigurationResource operation with a valid options model parameter
  @Test
  public void testGetInstanceConfigurationResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connection_name\": \"presto-01\", \"details\": {\"ca_certificate\": \"sample ca certificate\", \"dashboard_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}, \"properties\": {\"connection\": [{\"name\": \"host\", \"value\": \"sample_value\"}]}, \"type\": \"presto\"}";
    String getInstanceConfigurationResourcePath = "/instance_configuration/resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceConfigurationResourceOptions model
    GetInstanceConfigurationResourceOptions getInstanceConfigurationResourceOptionsModel = new GetInstanceConfigurationResourceOptions.Builder()
      .target("testString")
      .id("testString")
      .database("testString")
      .internalHost(false)
      .privateHost(false)
      .authInstanceId("testString")
      .build();

    // Invoke getInstanceConfigurationResource() with a valid options model and verify the result
    Response<ResourceDetails> response = watsonxDataService.getInstanceConfigurationResource(getInstanceConfigurationResourceOptionsModel).execute();
    assertNotNull(response);
    ResourceDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceConfigurationResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("target"), "testString");
    assertEquals(query.get("database"), "testString");
    assertEquals(Boolean.valueOf(query.get("internal_host")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("private_host")), Boolean.valueOf(false));
  }

  // Test the getInstanceConfigurationResource operation with and without retries enabled
  @Test
  public void testGetInstanceConfigurationResourceWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetInstanceConfigurationResourceWOptions();

    watsonxDataService.disableRetries();
    testGetInstanceConfigurationResourceWOptions();
  }

  // Test the getInstanceConfigurationResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceConfigurationResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getInstanceConfigurationResource(null).execute();
  }

  // Test the getSalIntegration operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"category_id\": \"10e64285-bf37-4d5d-b759-bc6a46589234\", \"created_at_epoch\": \"1715056266\", \"engine_id\": \"presto-01\", \"errors\": [{\"code\": \"unable_to_perform\", \"message\": \"Failed to process integration settings for watsonx.data instance\"}], \"instance_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"status\": \"provisioning\", \"storage_resource_crn\": \"crn:v1:staging:public:cloud-object-storage:global:a/04e9bc47612523rr19ac22759cb69bebd:asd23df-6ada-45ff-bfe8-4343222\", \"storage_type\": \"bmcos_object_storage\", \"trial_plan\": false, \"username\": \"xyz@abc.com\"}";
    String getSalIntegrationPath = "/sal_integration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationOptions model
    GetSalIntegrationOptions getSalIntegrationOptionsModel = new GetSalIntegrationOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegration() with a valid options model and verify the result
    Response<SalIntegration> response = watsonxDataService.getSalIntegration(getSalIntegrationOptionsModel).execute();
    assertNotNull(response);
    SalIntegration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSalIntegration operation with and without retries enabled
  @Test
  public void testGetSalIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationWOptions();
  }

  // Test the createSalIntegration operation with a valid options model parameter
  @Test
  public void testCreateSalIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"category_id\": \"10e64285-bf37-4d5d-b759-bc6a46589234\", \"created_at_epoch\": \"1715056266\", \"engine_id\": \"presto-01\", \"errors\": [{\"code\": \"unable_to_perform\", \"message\": \"Failed to process integration settings for watsonx.data instance\"}], \"instance_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"status\": \"provisioning\", \"storage_resource_crn\": \"crn:v1:staging:public:cloud-object-storage:global:a/04e9bc47612523rr19ac22759cb69bebd:asd23df-6ada-45ff-bfe8-4343222\", \"storage_type\": \"bmcos_object_storage\", \"trial_plan\": false, \"username\": \"xyz@abc.com\"}";
    String createSalIntegrationPath = "/sal_integration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSalIntegrationOptions model
    CreateSalIntegrationOptions createSalIntegrationOptionsModel = new CreateSalIntegrationOptions.Builder()
      .apikey("67GveYtUdovRFEfnMLYP8x0S1b2mY1BkEGqBYbJK")
      .engineId("presto-01")
      .storageResourceCrn("crn:v1:staging:public:cloud-object-storage:global:a/a7026b374f39f570d20984c1ac6ecf63:5778e94f-c8c7-46a8-9878-d5eeadb51161")
      .storageType("bmcos_object_storage")
      .trialPlan(true)
      .authInstanceId("testString")
      .build();

    // Invoke createSalIntegration() with a valid options model and verify the result
    Response<SalIntegration> response = watsonxDataService.createSalIntegration(createSalIntegrationOptionsModel).execute();
    assertNotNull(response);
    SalIntegration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSalIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSalIntegration operation with and without retries enabled
  @Test
  public void testCreateSalIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSalIntegrationWOptions();

    watsonxDataService.disableRetries();
    testCreateSalIntegrationWOptions();
  }

  // Test the createSalIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSalIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSalIntegration(null).execute();
  }

  // Test the deleteSalIntegration operation with a valid options model parameter
  @Test
  public void testDeleteSalIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSalIntegrationPath = "/sal_integration";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSalIntegrationOptions model
    DeleteSalIntegrationOptions deleteSalIntegrationOptionsModel = new DeleteSalIntegrationOptions();

    // Invoke deleteSalIntegration() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSalIntegration(deleteSalIntegrationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSalIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSalIntegration operation with and without retries enabled
  @Test
  public void testDeleteSalIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSalIntegrationWOptions();

    watsonxDataService.disableRetries();
    testDeleteSalIntegrationWOptions();
  }

  // Test the updateSalIntegration operation with a valid options model parameter
  @Test
  public void testUpdateSalIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"category_id\": \"10e64285-bf37-4d5d-b759-bc6a46589234\", \"created_at_epoch\": \"1715056266\", \"engine_id\": \"presto-01\", \"errors\": [{\"code\": \"unable_to_perform\", \"message\": \"Failed to process integration settings for watsonx.data instance\"}], \"instance_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"status\": \"provisioning\", \"storage_resource_crn\": \"crn:v1:staging:public:cloud-object-storage:global:a/04e9bc47612523rr19ac22759cb69bebd:asd23df-6ada-45ff-bfe8-4343222\", \"storage_type\": \"bmcos_object_storage\", \"trial_plan\": false, \"username\": \"xyz@abc.com\"}";
    String updateSalIntegrationPath = "/sal_integration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SalIntegrationPatch model
    SalIntegrationPatch salIntegrationPatchModel = new SalIntegrationPatch.Builder()
      .apikey("67GveYtUdovRFEfnMLYP8x0S1b2mY1BkEGqBYbJK")
      .engineId("presto-01")
      .build();
    Map<String, Object> salIntegrationPatchModelAsPatch = salIntegrationPatchModel.asPatch();

    // Construct an instance of the UpdateSalIntegrationOptions model
    UpdateSalIntegrationOptions updateSalIntegrationOptionsModel = new UpdateSalIntegrationOptions.Builder()
      .body(salIntegrationPatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateSalIntegration() with a valid options model and verify the result
    Response<SalIntegration> response = watsonxDataService.updateSalIntegration(updateSalIntegrationOptionsModel).execute();
    assertNotNull(response);
    SalIntegration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSalIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSalIntegration operation with and without retries enabled
  @Test
  public void testUpdateSalIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateSalIntegrationWOptions();

    watsonxDataService.disableRetries();
    testUpdateSalIntegrationWOptions();
  }

  // Test the updateSalIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSalIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateSalIntegration(null).execute();
  }

  // Test the createSalIntegrationEnrichment operation with a valid options model parameter
  @Test
  public void testCreateSalIntegrationEnrichmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String createSalIntegrationEnrichmentPath = "/sal_integration/enrichment";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the EnrichmentObj model
    EnrichmentObj enrichmentObjModel = new EnrichmentObj.Builder()
      .catalog("iceberg_data")
      .operation("create")
      .schema("schema1")
      .tables(java.util.Arrays.asList("table1"))
      .build();

    // Construct an instance of the CreateSalIntegrationEnrichmentOptions model
    CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptionsModel = new CreateSalIntegrationEnrichmentOptions.Builder()
      .changes(java.util.Arrays.asList(enrichmentObjModel))
      .authInstanceId("testString")
      .build();

    // Invoke createSalIntegrationEnrichment() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.createSalIntegrationEnrichment(createSalIntegrationEnrichmentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSalIntegrationEnrichmentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSalIntegrationEnrichment operation with and without retries enabled
  @Test
  public void testCreateSalIntegrationEnrichmentWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSalIntegrationEnrichmentWOptions();

    watsonxDataService.disableRetries();
    testCreateSalIntegrationEnrichmentWOptions();
  }

  // Test the listSalIntegrationEnrichmentDataAssets operation with a valid options model parameter
  @Test
  public void testListSalIntegrationEnrichmentDataAssetsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_assets\": [{\"attributes\": [\"attributes\"], \"id\": \"ee0383b9-dcab-4c1a-b03d-bf521837b6ed\", \"name\": \"newtable\", \"resource_key\": \"0000:0000:0000:0000:0000:FFFF:9EB0:04E2|31134|:/iceberg_data/new_schema/sampletable\", \"schema_name\": \"sampleschema\"}]}";
    String listSalIntegrationEnrichmentDataAssetsPath = "/sal_integration/enrichment/data_assets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationEnrichmentDataAssetsOptions model
    ListSalIntegrationEnrichmentDataAssetsOptions listSalIntegrationEnrichmentDataAssetsOptionsModel = new ListSalIntegrationEnrichmentDataAssetsOptions.Builder()
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationEnrichmentDataAssets() with a valid options model and verify the result
    Response<SalEnrichmentDataAssetCollection> response = watsonxDataService.listSalIntegrationEnrichmentDataAssets(listSalIntegrationEnrichmentDataAssetsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentDataAssetCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationEnrichmentDataAssetsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the listSalIntegrationEnrichmentDataAssets operation with and without retries enabled
  @Test
  public void testListSalIntegrationEnrichmentDataAssetsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationEnrichmentDataAssetsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationEnrichmentDataAssetsWOptions();
  }

  // Test the listSalIntegrationEnrichmentDataAssets operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSalIntegrationEnrichmentDataAssetsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSalIntegrationEnrichmentDataAssets(null).execute();
  }

  // Test the getSalIntegrationEnrichmentDataAssetsById operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentDataAssetsByIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity\": {\"asset_terms\": {\"list\": [{\"mapKey\": \"inner\"}]}, \"column_info\": {\"mapKey\": {\"column_description\": \"columnDescription\", \"column_terms\": [{\"mapKey\": \"inner\"}], \"semantic_description\": {\"generated_description\": \"The unique identifier for the returned product.\", \"status\": \"accepted\"}, \"semantic_name\": {\"expanded_name\": \"expandedName\", \"status\": \"status\"}}}, \"data_asset\": {\"semantic_description\": {\"generated_description\": \"The web returns table  records data on online product returns\"}, \"semantic_name\": {\"expanded_name\": \"web returns\"}}, \"metadata_enrichment_publish_info\": {\"catalog_id\": \"9eea7547-7015-4518-80b1-77a14c23ae6e\", \"last_published_epoch\": \"1752546562212\", \"status\": \"status\"}}, \"metadata\": {\"name\": \"name\", \"tags\": [\"tags\"]}}";
    String getSalIntegrationEnrichmentDataAssetsByIdPath = "/sal_integration/enrichment/data_assets/testString/details";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationEnrichmentDataAssetsByIdOptions model
    GetSalIntegrationEnrichmentDataAssetsByIdOptions getSalIntegrationEnrichmentDataAssetsByIdOptionsModel = new GetSalIntegrationEnrichmentDataAssetsByIdOptions.Builder()
      .projectId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationEnrichmentDataAssetsById() with a valid options model and verify the result
    Response<SalEnrichmentDataAssetDetail> response = watsonxDataService.getSalIntegrationEnrichmentDataAssetsById(getSalIntegrationEnrichmentDataAssetsByIdOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentDataAssetDetail responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationEnrichmentDataAssetsByIdPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the getSalIntegrationEnrichmentDataAssetsById operation with and without retries enabled
  @Test
  public void testGetSalIntegrationEnrichmentDataAssetsByIdWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationEnrichmentDataAssetsByIdWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationEnrichmentDataAssetsByIdWOptions();
  }

  // Test the getSalIntegrationEnrichmentDataAssetsById operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationEnrichmentDataAssetsByIdNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationEnrichmentDataAssetsById(null).execute();
  }

  // Test the getSalIntegrationEnrichmentGlobalSettings operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentGlobalSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"expansion\": {\"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String getSalIntegrationEnrichmentGlobalSettingsPath = "/sal_integration/enrichment/global_settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationEnrichmentGlobalSettingsOptions model
    GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptionsModel = new GetSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationEnrichmentGlobalSettings() with a valid options model and verify the result
    Response<SalEnrichmentSettings> response = watsonxDataService.getSalIntegrationEnrichmentGlobalSettings(getSalIntegrationEnrichmentGlobalSettingsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationEnrichmentGlobalSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSalIntegrationEnrichmentGlobalSettings operation with and without retries enabled
  @Test
  public void testGetSalIntegrationEnrichmentGlobalSettingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationEnrichmentGlobalSettingsWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationEnrichmentGlobalSettingsWOptions();
  }

  // Test the replaceSalIntegrationEnrichmentGlobalSettings operation with a valid options model parameter
  @Test
  public void testReplaceSalIntegrationEnrichmentGlobalSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"expansion\": {\"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String replaceSalIntegrationEnrichmentGlobalSettingsPath = "/sal_integration/enrichment/global_settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SalEnrichmentSettingsExpansionDescriptionConfiguration model
    SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfigurationModel = new SalEnrichmentSettingsExpansionDescriptionConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.14"))
      .suggestionThreshold(Double.valueOf("0.9"))
      .build();

    // Construct an instance of the SalEnrichmentSettingsExpansionNameConfiguration model
    SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();

    // Construct an instance of the SalEnrichmentSettingsExpansion model
    SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansionModel = new SalEnrichmentSettingsExpansion.Builder()
      .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
      .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
      .build();

    // Construct an instance of the SalEnrichmentSettingsTermAssignment model
    SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignmentModel = new SalEnrichmentSettingsTermAssignment.Builder()
      .termAssignmentThreshold(Double.valueOf("0.3"))
      .termSuggestionThreshold(Double.valueOf("0.4"))
      .build();

    // Construct an instance of the ReplaceSalIntegrationEnrichmentGlobalSettingsOptions model
    ReplaceSalIntegrationEnrichmentGlobalSettingsOptions replaceSalIntegrationEnrichmentGlobalSettingsOptionsModel = new ReplaceSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
      .expansion(salEnrichmentSettingsExpansionModel)
      .termAssignment(salEnrichmentSettingsTermAssignmentModel)
      .authInstanceId("testString")
      .build();

    // Invoke replaceSalIntegrationEnrichmentGlobalSettings() with a valid options model and verify the result
    Response<SalEnrichmentSettings> response = watsonxDataService.replaceSalIntegrationEnrichmentGlobalSettings(replaceSalIntegrationEnrichmentGlobalSettingsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSalIntegrationEnrichmentGlobalSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceSalIntegrationEnrichmentGlobalSettings operation with and without retries enabled
  @Test
  public void testReplaceSalIntegrationEnrichmentGlobalSettingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceSalIntegrationEnrichmentGlobalSettingsWOptions();

    watsonxDataService.disableRetries();
    testReplaceSalIntegrationEnrichmentGlobalSettingsWOptions();
  }

  // Test the replaceSalIntegrationEnrichmentGlobalSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSalIntegrationEnrichmentGlobalSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceSalIntegrationEnrichmentGlobalSettings(null).execute();
  }

  // Test the listSalIntegrationEnrichmentJobs operation with a valid options model parameter
  @Test
  public void testListSalIntegrationEnrichmentJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"jobs\": [\"jobs\"]}";
    String listSalIntegrationEnrichmentJobsPath = "/sal_integration/enrichment/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationEnrichmentJobsOptions model
    ListSalIntegrationEnrichmentJobsOptions listSalIntegrationEnrichmentJobsOptionsModel = new ListSalIntegrationEnrichmentJobsOptions.Builder()
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationEnrichmentJobs() with a valid options model and verify the result
    Response<SalEnrichmentJobs> response = watsonxDataService.listSalIntegrationEnrichmentJobs(listSalIntegrationEnrichmentJobsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentJobs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationEnrichmentJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the listSalIntegrationEnrichmentJobs operation with and without retries enabled
  @Test
  public void testListSalIntegrationEnrichmentJobsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationEnrichmentJobsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationEnrichmentJobsWOptions();
  }

  // Test the listSalIntegrationEnrichmentJobs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSalIntegrationEnrichmentJobsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSalIntegrationEnrichmentJobs(null).execute();
  }

  // Test the listSalIntegrationEnrichmentJobRuns operation with a valid options model parameter
  @Test
  public void testListSalIntegrationEnrichmentJobRunsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"runs\": [\"runs\"]}";
    String listSalIntegrationEnrichmentJobRunsPath = "/sal_integration/enrichment/jobs/testString/runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationEnrichmentJobRunsOptions model
    ListSalIntegrationEnrichmentJobRunsOptions listSalIntegrationEnrichmentJobRunsOptionsModel = new ListSalIntegrationEnrichmentJobRunsOptions.Builder()
      .jobId("testString")
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationEnrichmentJobRuns() with a valid options model and verify the result
    Response<SalEnrichmentJobRuns> response = watsonxDataService.listSalIntegrationEnrichmentJobRuns(listSalIntegrationEnrichmentJobRunsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentJobRuns responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationEnrichmentJobRunsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the listSalIntegrationEnrichmentJobRuns operation with and without retries enabled
  @Test
  public void testListSalIntegrationEnrichmentJobRunsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationEnrichmentJobRunsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationEnrichmentJobRunsWOptions();
  }

  // Test the listSalIntegrationEnrichmentJobRuns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSalIntegrationEnrichmentJobRunsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSalIntegrationEnrichmentJobRuns(null).execute();
  }

  // Test the getSalIntegrationEnrichmentJobRunLogs operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentJobRunLogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"results\": [\"results\"], \"total_count\": 12}";
    String getSalIntegrationEnrichmentJobRunLogsPath = "/sal_integration/enrichment/jobs/testString/runs/testString/logs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationEnrichmentJobRunLogsOptions model
    GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptionsModel = new GetSalIntegrationEnrichmentJobRunLogsOptions.Builder()
      .jobId("testString")
      .runId("testString")
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationEnrichmentJobRunLogs() with a valid options model and verify the result
    Response<SalEnrichmentJobRunLogs> response = watsonxDataService.getSalIntegrationEnrichmentJobRunLogs(getSalIntegrationEnrichmentJobRunLogsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentJobRunLogs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationEnrichmentJobRunLogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the getSalIntegrationEnrichmentJobRunLogs operation with and without retries enabled
  @Test
  public void testGetSalIntegrationEnrichmentJobRunLogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationEnrichmentJobRunLogsWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationEnrichmentJobRunLogsWOptions();
  }

  // Test the getSalIntegrationEnrichmentJobRunLogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationEnrichmentJobRunLogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationEnrichmentJobRunLogs(null).execute();
  }

  // Test the getSalIntegrationEnrichmentProjectSettings operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentProjectSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"expansion\": {\"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String getSalIntegrationEnrichmentProjectSettingsPath = "/sal_integration/enrichment/project_settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationEnrichmentProjectSettingsOptions model
    GetSalIntegrationEnrichmentProjectSettingsOptions getSalIntegrationEnrichmentProjectSettingsOptionsModel = new GetSalIntegrationEnrichmentProjectSettingsOptions.Builder()
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationEnrichmentProjectSettings() with a valid options model and verify the result
    Response<SalEnrichmentSettings> response = watsonxDataService.getSalIntegrationEnrichmentProjectSettings(getSalIntegrationEnrichmentProjectSettingsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationEnrichmentProjectSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the getSalIntegrationEnrichmentProjectSettings operation with and without retries enabled
  @Test
  public void testGetSalIntegrationEnrichmentProjectSettingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationEnrichmentProjectSettingsWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationEnrichmentProjectSettingsWOptions();
  }

  // Test the getSalIntegrationEnrichmentProjectSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationEnrichmentProjectSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationEnrichmentProjectSettings(null).execute();
  }

  // Test the replaceSalIntegrationEnrichmentProjectSettings operation with a valid options model parameter
  @Test
  public void testReplaceSalIntegrationEnrichmentProjectSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String replaceSalIntegrationEnrichmentProjectSettingsPath = "/sal_integration/enrichment/project_settings";
    server.enqueue(new MockResponse()
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the SalEnrichmentSettingsExpansionDescriptionConfiguration model
    SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfigurationModel = new SalEnrichmentSettingsExpansionDescriptionConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.14"))
      .suggestionThreshold(Double.valueOf("0.9"))
      .build();

    // Construct an instance of the SalEnrichmentSettingsExpansionNameConfiguration model
    SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();

    // Construct an instance of the SalEnrichmentSettingsExpansion model
    SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansionModel = new SalEnrichmentSettingsExpansion.Builder()
      .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
      .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
      .build();

    // Construct an instance of the SalEnrichmentSettingsTermAssignment model
    SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignmentModel = new SalEnrichmentSettingsTermAssignment.Builder()
      .termAssignmentThreshold(Double.valueOf("0.3"))
      .termSuggestionThreshold(Double.valueOf("0.4"))
      .build();

    // Construct an instance of the ReplaceSalIntegrationEnrichmentProjectSettingsOptions model
    ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptionsModel = new ReplaceSalIntegrationEnrichmentProjectSettingsOptions.Builder()
      .projectId("testString")
      .expansion(salEnrichmentSettingsExpansionModel)
      .termAssignment(salEnrichmentSettingsTermAssignmentModel)
      .authInstanceId("testString")
      .build();

    // Invoke replaceSalIntegrationEnrichmentProjectSettings() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.replaceSalIntegrationEnrichmentProjectSettings(replaceSalIntegrationEnrichmentProjectSettingsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSalIntegrationEnrichmentProjectSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the replaceSalIntegrationEnrichmentProjectSettings operation with and without retries enabled
  @Test
  public void testReplaceSalIntegrationEnrichmentProjectSettingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceSalIntegrationEnrichmentProjectSettingsWOptions();

    watsonxDataService.disableRetries();
    testReplaceSalIntegrationEnrichmentProjectSettingsWOptions();
  }

  // Test the replaceSalIntegrationEnrichmentProjectSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSalIntegrationEnrichmentProjectSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceSalIntegrationEnrichmentProjectSettings(null).execute();
  }

  // Test the getSalIntegrationGlossaryTerms operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationGlossaryTermsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"glossary_terms\": [{\"description\": \"First Name\", \"name\": \"Name\"}]}";
    String getSalIntegrationGlossaryTermsPath = "/sal_integration/glossary/terms";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationGlossaryTermsOptions model
    GetSalIntegrationGlossaryTermsOptions getSalIntegrationGlossaryTermsOptionsModel = new GetSalIntegrationGlossaryTermsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationGlossaryTerms() with a valid options model and verify the result
    Response<SalGlossaryTerms> response = watsonxDataService.getSalIntegrationGlossaryTerms(getSalIntegrationGlossaryTermsOptionsModel).execute();
    assertNotNull(response);
    SalGlossaryTerms responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationGlossaryTermsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSalIntegrationGlossaryTerms operation with and without retries enabled
  @Test
  public void testGetSalIntegrationGlossaryTermsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationGlossaryTermsWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationGlossaryTermsWOptions();
  }

  // Test the createSalIntegrationGlossaryUploadProcesses operation with a valid options model parameter
  @Test
  public void testCreateSalIntegrationGlossaryUploadProcessesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\"}";
    String createSalIntegrationGlossaryUploadProcessesPath = "/sal_integration/glossary/upload_processes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSalIntegrationGlossaryUploadProcessesOptions model
    CreateSalIntegrationGlossaryUploadProcessesOptions createSalIntegrationGlossaryUploadProcessesOptionsModel = new CreateSalIntegrationGlossaryUploadProcessesOptions.Builder()
      .glossaryCsv(TestUtilities.createMockStream("This is a mock file."))
      .replaceOption("all")
      .glossaryCsvContentType("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createSalIntegrationGlossaryUploadProcesses() with a valid options model and verify the result
    Response<SalGlossaryUploadProcess> response = watsonxDataService.createSalIntegrationGlossaryUploadProcesses(createSalIntegrationGlossaryUploadProcessesOptionsModel).execute();
    assertNotNull(response);
    SalGlossaryUploadProcess responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSalIntegrationGlossaryUploadProcessesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSalIntegrationGlossaryUploadProcesses operation with and without retries enabled
  @Test
  public void testCreateSalIntegrationGlossaryUploadProcessesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSalIntegrationGlossaryUploadProcessesWOptions();

    watsonxDataService.disableRetries();
    testCreateSalIntegrationGlossaryUploadProcessesWOptions();
  }

  // Test the createSalIntegrationGlossaryUploadProcesses operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSalIntegrationGlossaryUploadProcessesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSalIntegrationGlossaryUploadProcesses(null).execute();
  }

  // Test the getSalIntegrationGlossaryUploadProcessesStatus operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationGlossaryUploadProcessesStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": \"completed\"}";
    String getSalIntegrationGlossaryUploadProcessesStatusPath = "/sal_integration/glossary/upload_processes/testString/status";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationGlossaryUploadProcessesStatusOptions model
    GetSalIntegrationGlossaryUploadProcessesStatusOptions getSalIntegrationGlossaryUploadProcessesStatusOptionsModel = new GetSalIntegrationGlossaryUploadProcessesStatusOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationGlossaryUploadProcessesStatus() with a valid options model and verify the result
    Response<SalGlossaryUploadStatus> response = watsonxDataService.getSalIntegrationGlossaryUploadProcessesStatus(getSalIntegrationGlossaryUploadProcessesStatusOptionsModel).execute();
    assertNotNull(response);
    SalGlossaryUploadStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationGlossaryUploadProcessesStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSalIntegrationGlossaryUploadProcessesStatus operation with and without retries enabled
  @Test
  public void testGetSalIntegrationGlossaryUploadProcessesStatusWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationGlossaryUploadProcessesStatusWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationGlossaryUploadProcessesStatusWOptions();
  }

  // Test the getSalIntegrationGlossaryUploadProcessesStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationGlossaryUploadProcessesStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationGlossaryUploadProcessesStatus(null).execute();
  }

  // Test the listSalIntegrationMappings operation with a valid options model parameter
  @Test
  public void testListSalIntegrationMappingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mappings\": [{\"wkc_catalog_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"wkc_project_id\": \"9519bd7a-9519-8db5-4539-ff080623c226\", \"wxd_catalog_name\": \"iceberg_data\", \"wxd_schema_name\": \"test_schema\"}], \"next\": \"MTAwCg==\"}";
    String listSalIntegrationMappingsPath = "/sal_integration/mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationMappingsOptions model
    ListSalIntegrationMappingsOptions listSalIntegrationMappingsOptionsModel = new ListSalIntegrationMappingsOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .next("testString")
      .limit(Long.valueOf("1"))
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationMappings() with a valid options model and verify the result
    Response<SalIntegrationMappings> response = watsonxDataService.listSalIntegrationMappings(listSalIntegrationMappingsOptionsModel).execute();
    assertNotNull(response);
    SalIntegrationMappings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationMappingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
    assertEquals(query.get("next"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
  }

  // Test the listSalIntegrationMappings operation with and without retries enabled
  @Test
  public void testListSalIntegrationMappingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationMappingsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationMappingsWOptions();
  }

  // Test the listSemanticSearchQueries operation with a valid options model parameter
  @Test
  public void testListSemanticSearchQueriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"queries\": [{\"id\": \"1\", \"last_search_time\": \"2024-09-15T14:30:00.000Z\", \"results\": [{\"artifact_type\": \"data_asset\", \"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9\", \"catalog_name\": \"iceberg\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"matched_columns\": [{\"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9:customer_id\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"name\": \"customer_id\", \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\"}], \"name\": \"table1\", \"path\": \"/iceberg/california_school/table1\", \"project_id\": \"b94b3f1c-3808-44d2-b7e6-4df8d5861950\", \"provider_type\": \"cams\", \"schema_name\": \"california_school\", \"search_score\": 11, \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\", \"state\": \"active\", \"table_name\": \"table1\", \"tags\": [\"tags\"], \"terms\": [\"terms\"]}], \"search_query\": \"catalog_table\"}]}";
    String listSemanticSearchQueriesPath = "/sal_integration/semantic_search/queries";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSemanticSearchQueriesOptions model
    ListSemanticSearchQueriesOptions listSemanticSearchQueriesOptionsModel = new ListSemanticSearchQueriesOptions.Builder()
      .engineId("testString")
      .schemaSearchEnabled(true)
      .columnSearchEnabled(true)
      .maxResultNumber(Long.valueOf("5"))
      .runSearch(true)
      .authInstanceId("testString")
      .build();

    // Invoke listSemanticSearchQueries() with a valid options model and verify the result
    Response<SemanticSearchList> response = watsonxDataService.listSemanticSearchQueries(listSemanticSearchQueriesOptionsModel).execute();
    assertNotNull(response);
    SemanticSearchList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSemanticSearchQueriesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(Boolean.valueOf(query.get("schema_search_enabled")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("column_search_enabled")), Boolean.valueOf(true));
    assertEquals(Long.valueOf(query.get("max_result_number")), Long.valueOf("5"));
    assertEquals(Boolean.valueOf(query.get("run_search")), Boolean.valueOf(true));
  }

  // Test the listSemanticSearchQueries operation with and without retries enabled
  @Test
  public void testListSemanticSearchQueriesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSemanticSearchQueriesWOptions();

    watsonxDataService.disableRetries();
    testListSemanticSearchQueriesWOptions();
  }

  // Test the createSemanticSearchQueries operation with a valid options model parameter
  @Test
  public void testCreateSemanticSearchQueriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"1\", \"last_search_time\": \"2024-09-15T14:30:00.000Z\", \"results\": [{\"artifact_type\": \"data_asset\", \"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9\", \"catalog_name\": \"iceberg\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"matched_columns\": [{\"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9:customer_id\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"name\": \"customer_id\", \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\"}], \"name\": \"table1\", \"path\": \"/iceberg/california_school/table1\", \"project_id\": \"b94b3f1c-3808-44d2-b7e6-4df8d5861950\", \"provider_type\": \"cams\", \"schema_name\": \"california_school\", \"search_score\": 11, \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\", \"state\": \"active\", \"table_name\": \"table1\", \"tags\": [\"tags\"], \"terms\": [\"terms\"]}], \"search_query\": \"catalog_table\"}";
    String createSemanticSearchQueriesPath = "/sal_integration/semantic_search/queries";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SemanticSearchBodySearchConfig model
    SemanticSearchBodySearchConfig semanticSearchBodySearchConfigModel = new SemanticSearchBodySearchConfig.Builder()
      .columnSearchEnabled(true)
      .fields(java.util.Arrays.asList("metadata.name", "metadata.description", "metadata.tags"))
      .maxResultNumber(Long.valueOf("1"))
      .schemaSearchEnabled(true)
      .build();

    // Construct an instance of the CreateSemanticSearchQueriesOptions model
    CreateSemanticSearchQueriesOptions createSemanticSearchQueriesOptionsModel = new CreateSemanticSearchQueriesOptions.Builder()
      .engineId("presto01")
      .queryInput("catalog_table")
      .searchConfig(semanticSearchBodySearchConfigModel)
      .authInstanceId("testString")
      .build();

    // Invoke createSemanticSearchQueries() with a valid options model and verify the result
    Response<SemanticSearch> response = watsonxDataService.createSemanticSearchQueries(createSemanticSearchQueriesOptionsModel).execute();
    assertNotNull(response);
    SemanticSearch responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSemanticSearchQueriesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSemanticSearchQueries operation with and without retries enabled
  @Test
  public void testCreateSemanticSearchQueriesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSemanticSearchQueriesWOptions();

    watsonxDataService.disableRetries();
    testCreateSemanticSearchQueriesWOptions();
  }

  // Test the createSemanticSearchQueries operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSemanticSearchQueriesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSemanticSearchQueries(null).execute();
  }

  // Test the deleteSemanticSearchQueries operation with a valid options model parameter
  @Test
  public void testDeleteSemanticSearchQueriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSemanticSearchQueriesPath = "/sal_integration/semantic_search/queries";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSemanticSearchQueriesOptions model
    DeleteSemanticSearchQueriesOptions deleteSemanticSearchQueriesOptionsModel = new DeleteSemanticSearchQueriesOptions.Builder()
      .batchSize(Long.valueOf("1"))
      .authInstanceId("testString")
      .build();

    // Invoke deleteSemanticSearchQueries() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSemanticSearchQueries(deleteSemanticSearchQueriesOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSemanticSearchQueriesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("batch_size")), Long.valueOf("1"));
  }

  // Test the deleteSemanticSearchQueries operation with and without retries enabled
  @Test
  public void testDeleteSemanticSearchQueriesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSemanticSearchQueriesWOptions();

    watsonxDataService.disableRetries();
    testDeleteSemanticSearchQueriesWOptions();
  }

  // Test the deleteSemanticSearchQueriesById operation with a valid options model parameter
  @Test
  public void testDeleteSemanticSearchQueriesByIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSemanticSearchQueriesByIdPath = "/sal_integration/semantic_search/queries/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSemanticSearchQueriesByIdOptions model
    DeleteSemanticSearchQueriesByIdOptions deleteSemanticSearchQueriesByIdOptionsModel = new DeleteSemanticSearchQueriesByIdOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSemanticSearchQueriesById() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSemanticSearchQueriesById(deleteSemanticSearchQueriesByIdOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSemanticSearchQueriesByIdPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSemanticSearchQueriesById operation with and without retries enabled
  @Test
  public void testDeleteSemanticSearchQueriesByIdWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSemanticSearchQueriesByIdWOptions();

    watsonxDataService.disableRetries();
    testDeleteSemanticSearchQueriesByIdWOptions();
  }

  // Test the deleteSemanticSearchQueriesById operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSemanticSearchQueriesByIdNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSemanticSearchQueriesById(null).execute();
  }

  // Test the deleteSalMetadata operation with a valid options model parameter
  @Test
  public void testDeleteSalMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSalMetadataPath = "/sal_metadata";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSalMetadataOptions model
    DeleteSalMetadataOptions deleteSalMetadataOptionsModel = new DeleteSalMetadataOptions();

    // Invoke deleteSalMetadata() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSalMetadata(deleteSalMetadataOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSalMetadataPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSalMetadata operation with and without retries enabled
  @Test
  public void testDeleteSalMetadataWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSalMetadataWOptions();

    watsonxDataService.disableRetries();
    testDeleteSalMetadataWOptions();
  }

  // Test the registerTable operation with a valid options model parameter
  @Test
  public void testRegisterTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String registerTablePath = "/catalogs/testString/schemas/testString/register";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RegisterTableOptions model
    RegisterTableOptions registerTableOptionsModel = new RegisterTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .metadataLocation("s3a://storagename/path/to/table/metadata_location/_delta_log")
      .tableName("table1")
      .authInstanceId("testString")
      .build();

    // Invoke registerTable() with a valid options model and verify the result
    Response<RegisterTableCreatedBody> response = watsonxDataService.registerTable(registerTableOptionsModel).execute();
    assertNotNull(response);
    RegisterTableCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, registerTablePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the registerTable operation with and without retries enabled
  @Test
  public void testRegisterTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRegisterTableWOptions();

    watsonxDataService.disableRetries();
    testRegisterTableWOptions();
  }

  // Test the registerTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.registerTable(null).execute();
  }

  // Test the loadTable operation with a valid options model parameter
  @Test
  public void testLoadTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"metadata_location\": \"s3a://storagename/path/to/table/metadata_location/_delta_log\", \"table_path\": \"s3a://storagename/path/to/table\"}";
    String loadTablePath = "/catalogs/testString/schemas/testString/tables/testString/metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the LoadTableOptions model
    LoadTableOptions loadTableOptionsModel = new LoadTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke loadTable() with a valid options model and verify the result
    Response<LoadTableResponse> response = watsonxDataService.loadTable(loadTableOptionsModel).execute();
    assertNotNull(response);
    LoadTableResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, loadTablePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the loadTable operation with and without retries enabled
  @Test
  public void testLoadTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testLoadTableWOptions();

    watsonxDataService.disableRetries();
    testLoadTableWOptions();
  }

  // Test the loadTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.loadTable(null).execute();
  }

  // Test the getAllColumns operation with a valid options model parameter
  @Test
  public void testGetAllColumnsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"catalog\": \"catalog\", \"columns\": [{\"column\": \"column\", \"index\": 0, \"nullable\": true, \"precision\": 0, \"scale\": 0, \"signed\": true, \"type\": \"type\"}], \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}], \"count\": 3}";
    String getAllColumnsPath = "/columns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllColumnsOptions model
    GetAllColumnsOptions getAllColumnsOptionsModel = new GetAllColumnsOptions.Builder()
      .catalogName("testString")
      .tableName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getAllColumns() with a valid options model and verify the result
    Response<ColumnsCollection> response = watsonxDataService.getAllColumns(getAllColumnsOptionsModel).execute();
    assertNotNull(response);
    ColumnsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllColumnsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("table_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the getAllColumns operation with and without retries enabled
  @Test
  public void testGetAllColumnsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetAllColumnsWOptions();

    watsonxDataService.disableRetries();
    testGetAllColumnsWOptions();
  }

  // Test the getAllColumns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllColumnsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getAllColumns(null).execute();
  }

  // Test the listAllSchemas operation with a valid options model parameter
  @Test
  public void testListAllSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 3, \"message\": \"message\", \"message_code\": \"messageCode\", \"schemas\": [{\"catalog\": \"catalog\", \"catalog_type\": \"catalogType\", \"location\": \"location\", \"owner\": \"owner\", \"schema_name\": \"schemaName\", \"storage\": \"storage\"}]}";
    String listAllSchemasPath = "/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllSchemasOptions model
    ListAllSchemasOptions listAllSchemasOptionsModel = new ListAllSchemasOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listAllSchemas() with a valid options model and verify the result
    Response<SchemaResponseCollection> response = watsonxDataService.listAllSchemas(listAllSchemasOptionsModel).execute();
    assertNotNull(response);
    SchemaResponseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllSchemasPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the listAllSchemas operation with and without retries enabled
  @Test
  public void testListAllSchemasWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListAllSchemasWOptions();

    watsonxDataService.disableRetries();
    testListAllSchemasWOptions();
  }

  // Test the getSchemaDetails operation with a valid options model parameter
  @Test
  public void testGetSchemaDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog\": \"catalog\", \"location\": \"location\", \"message\": \"message\", \"message_code\": \"messageCode\", \"owner\": \"owner\", \"schema\": {\"catalog\": \"catalog\", \"catalog_type\": \"catalogType\", \"location\": \"location\", \"owner\": \"owner\", \"schema_name\": \"schemaName\", \"storage\": \"storage\"}, \"schema_name\": \"schemaName\", \"storage\": \"storage\"}";
    String getSchemaDetailsPath = "/schemas/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSchemaDetailsOptions model
    GetSchemaDetailsOptions getSchemaDetailsOptionsModel = new GetSchemaDetailsOptions.Builder()
      .schemaName("testString")
      .catalogName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSchemaDetails() with a valid options model and verify the result
    Response<SchemaResponse> response = watsonxDataService.getSchemaDetails(getSchemaDetailsOptionsModel).execute();
    assertNotNull(response);
    SchemaResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchemaDetailsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
  }

  // Test the getSchemaDetails operation with and without retries enabled
  @Test
  public void testGetSchemaDetailsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSchemaDetailsWOptions();

    watsonxDataService.disableRetries();
    testGetSchemaDetailsWOptions();
  }

  // Test the getSchemaDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSchemaDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSchemaDetails(null).execute();
  }

  // Test the listAllTables operation with a valid options model parameter
  @Test
  public void testListAllTablesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 3, \"message\": \"message\", \"message_code\": \"messageCode\", \"tables\": [{\"catalog\": \"catalog\", \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}]}";
    String listAllTablesPath = "/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllTablesOptions model
    ListAllTablesOptions listAllTablesOptionsModel = new ListAllTablesOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listAllTables() with a valid options model and verify the result
    Response<TableResponseCollection> response = watsonxDataService.listAllTables(listAllTablesOptionsModel).execute();
    assertNotNull(response);
    TableResponseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllTablesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the listAllTables operation with and without retries enabled
  @Test
  public void testListAllTablesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListAllTablesWOptions();

    watsonxDataService.disableRetries();
    testListAllTablesWOptions();
  }

  // Test the listAllTables operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAllTablesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listAllTables(null).execute();
  }

  // Test the getTableDetails operation with a valid options model parameter
  @Test
  public void testGetTableDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog\": \"catalog\", \"message\": \"message\", \"message_code\": \"messageCode\", \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\", \"tables\": [{\"catalog\": \"catalog\", \"columns\": [{\"column\": \"column\", \"index\": 0, \"nullable\": true, \"precision\": 0, \"scale\": 0, \"signed\": true, \"type\": \"type\"}], \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}]}";
    String getTableDetailsPath = "/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableDetailsOptions model
    GetTableDetailsOptions getTableDetailsOptionsModel = new GetTableDetailsOptions.Builder()
      .tableName("testString")
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTableDetails() with a valid options model and verify the result
    Response<TableResponse> response = watsonxDataService.getTableDetails(getTableDetailsOptionsModel).execute();
    assertNotNull(response);
    TableResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTableDetailsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the getTableDetails operation with and without retries enabled
  @Test
  public void testGetTableDetailsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTableDetailsWOptions();

    watsonxDataService.disableRetries();
    testGetTableDetailsWOptions();
  }

  // Test the getTableDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTableDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTableDetails(null).execute();
  }

  // Test the createHdfsStorage operation with a valid options model parameter
  @Test
  public void testCreateHdfsStorageWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"HDFS description for storage\", \"display_name\": \"sample hdfs displayname\", \"id\": \"hdfs123\", \"managed_by\": \"customer\", \"state\": \"active\", \"tags\": [\"tags\"], \"type\": \"hdfs\"}";
    String createHdfsStoragePath = "/storage_hdfs_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateHdfsStorageOptions model
    CreateHdfsStorageOptions createHdfsStorageOptionsModel = new CreateHdfsStorageOptions.Builder()
      .displayName("testString")
      .type("testString")
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
      .createdAt("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createHdfsStorage() with a valid options model and verify the result
    Response<HdfsStorageRegistration> response = watsonxDataService.createHdfsStorage(createHdfsStorageOptionsModel).execute();
    assertNotNull(response);
    HdfsStorageRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createHdfsStoragePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createHdfsStorage operation with and without retries enabled
  @Test
  public void testCreateHdfsStorageWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateHdfsStorageWOptions();

    watsonxDataService.disableRetries();
    testCreateHdfsStorageWOptions();
  }

  // Test the createHdfsStorage operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateHdfsStorageNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createHdfsStorage(null).execute();
  }

  // Test the listStorageRegistrations operation with a valid options model parameter
  @Test
  public void testListStorageRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"storage_registrations\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"access_key\", \"access_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"hmac\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::123456789012:role/my-role-name\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"path_style_enabled\": \"true\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"storageUse\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}]}";
    String listStorageRegistrationsPath = "/storage_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListStorageRegistrationsOptions model
    ListStorageRegistrationsOptions listStorageRegistrationsOptionsModel = new ListStorageRegistrationsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listStorageRegistrations() with a valid options model and verify the result
    Response<StorageRegistrationCollection> response = watsonxDataService.listStorageRegistrations(listStorageRegistrationsOptionsModel).execute();
    assertNotNull(response);
    StorageRegistrationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listStorageRegistrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listStorageRegistrations operation with and without retries enabled
  @Test
  public void testListStorageRegistrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListStorageRegistrationsWOptions();

    watsonxDataService.disableRetries();
    testListStorageRegistrationsWOptions();
  }

  // Test the createStorageRegistration operation with a valid options model parameter
  @Test
  public void testCreateStorageRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"access_key\", \"access_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"hmac\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::123456789012:role/my-role-name\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"path_style_enabled\": \"true\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"storageUse\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String createStorageRegistrationPath = "/storage_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the StorageCatalogPrototype model
    StorageCatalogPrototype storageCatalogPrototypeModel = new StorageCatalogPrototype.Builder()
      .basePath("/abc/def")
      .catalogName("sampleCatalog")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .catalogType("iceberg")
      .build();

    // Construct an instance of the StorageDetailsAccessKeyVault model
    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModel = new StorageDetailsAccessKeyVault.Builder()
      .key("access_key")
      .secretName("my-secret'name123")
      .secretUrn("12345:my-secret'name123")
      .build();

    // Construct an instance of the StorageDetails model
    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("access_key")
      .accessKeyVault(storageDetailsAccessKeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("hmac")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::123456789012:role/my-role-name")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccessKeyVaultModel)
      .vaultEnabled(true)
      .build();

    // Construct an instance of the CreateStorageRegistrationOptions model
    CreateStorageRegistrationOptions createStorageRegistrationOptionsModel = new CreateStorageRegistrationOptions.Builder()
      .displayName("sample-storage-displayname")
      .managedBy("ibm")
      .type("ibm_cos")
      .associatedCatalog(storageCatalogPrototypeModel)
      .connection(storageDetailsModel)
      .description("COS storage for customer data")
      .pathStyleEnabled("true")
      .region("us-south")
      .storageUse("testString")
      .tags(java.util.Arrays.asList("storage-tag1", "storage-tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createStorageRegistration() with a valid options model and verify the result
    Response<StorageRegistration> response = watsonxDataService.createStorageRegistration(createStorageRegistrationOptionsModel).execute();
    assertNotNull(response);
    StorageRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createStorageRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createStorageRegistration operation with and without retries enabled
  @Test
  public void testCreateStorageRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateStorageRegistrationWOptions();

    watsonxDataService.disableRetries();
    testCreateStorageRegistrationWOptions();
  }

  // Test the createStorageRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateStorageRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createStorageRegistration(null).execute();
  }

  // Test the getStorageRegistration operation with a valid options model parameter
  @Test
  public void testGetStorageRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"access_key\", \"access_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"hmac\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::123456789012:role/my-role-name\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"path_style_enabled\": \"true\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"storageUse\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String getStorageRegistrationPath = "/storage_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetStorageRegistrationOptions model
    GetStorageRegistrationOptions getStorageRegistrationOptionsModel = new GetStorageRegistrationOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .skipMdsCall(false)
      .build();

    // Invoke getStorageRegistration() with a valid options model and verify the result
    Response<StorageRegistration> response = watsonxDataService.getStorageRegistration(getStorageRegistrationOptionsModel).execute();
    assertNotNull(response);
    StorageRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getStorageRegistrationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the getStorageRegistration operation with and without retries enabled
  @Test
  public void testGetStorageRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetStorageRegistrationWOptions();

    watsonxDataService.disableRetries();
    testGetStorageRegistrationWOptions();
  }

  // Test the getStorageRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetStorageRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getStorageRegistration(null).execute();
  }

  // Test the deleteStorageRegistration operation with a valid options model parameter
  @Test
  public void testDeleteStorageRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteStorageRegistrationPath = "/storage_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteStorageRegistrationOptions model
    DeleteStorageRegistrationOptions deleteStorageRegistrationOptionsModel = new DeleteStorageRegistrationOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .skipMdsCall(false)
      .accountId("testString")
      .build();

    // Invoke deleteStorageRegistration() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteStorageRegistration(deleteStorageRegistrationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteStorageRegistrationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the deleteStorageRegistration operation with and without retries enabled
  @Test
  public void testDeleteStorageRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteStorageRegistrationWOptions();

    watsonxDataService.disableRetries();
    testDeleteStorageRegistrationWOptions();
  }

  // Test the deleteStorageRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteStorageRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteStorageRegistration(null).execute();
  }

  // Test the updateStorageRegistration operation with a valid options model parameter
  @Test
  public void testUpdateStorageRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"access_key\", \"access_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"hmac\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::123456789012:role/my-role-name\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"access_key\", \"secret_name\": \"my-secret'name123\", \"secret_urn\": \"12345:my-secret'name123\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"path_style_enabled\": \"true\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"storageUse\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String updateStorageRegistrationPath = "/storage_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the StorageDetailsAccessKeyVault model
    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModel = new StorageDetailsAccessKeyVault.Builder()
      .key("access_key")
      .secretName("my-secret'name123")
      .secretUrn("12345:my-secret'name123")
      .build();

    // Construct an instance of the StorageDetails model
    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("access_key")
      .accessKeyVault(storageDetailsAccessKeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("hmac")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::123456789012:role/my-role-name")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccessKeyVaultModel)
      .vaultEnabled(true)
      .build();

    // Construct an instance of the StorageRegistrationPatch model
    StorageRegistrationPatch storageRegistrationPatchModel = new StorageRegistrationPatch.Builder()
      .connection(storageDetailsModel)
      .description("COS storage for customer data")
      .displayName("sample-storage-displayname")
      .systemStorageUpdateCredentials(true)
      .tags(java.util.Arrays.asList("storage-tag1", "storage-tag2"))
      .build();
    Map<String, Object> storageRegistrationPatchModelAsPatch = storageRegistrationPatchModel.asPatch();

    // Construct an instance of the UpdateStorageRegistrationOptions model
    UpdateStorageRegistrationOptions updateStorageRegistrationOptionsModel = new UpdateStorageRegistrationOptions.Builder()
      .id("testString")
      .body(storageRegistrationPatchModelAsPatch)
      .skipMdsCall(false)
      .authInstanceId("testString")
      .build();

    // Invoke updateStorageRegistration() with a valid options model and verify the result
    Response<StorageRegistration> response = watsonxDataService.updateStorageRegistration(updateStorageRegistrationOptionsModel).execute();
    assertNotNull(response);
    StorageRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateStorageRegistrationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the updateStorageRegistration operation with and without retries enabled
  @Test
  public void testUpdateStorageRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateStorageRegistrationWOptions();

    watsonxDataService.disableRetries();
    testUpdateStorageRegistrationWOptions();
  }

  // Test the updateStorageRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateStorageRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateStorageRegistration(null).execute();
  }

  // Test the addStorageCatalog operation with a valid options model parameter
  @Test
  public void testAddStorageCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String addStorageCatalogPath = "/storage_registrations/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddStorageCatalogOptions model
    AddStorageCatalogOptions addStorageCatalogOptionsModel = new AddStorageCatalogOptions.Builder()
      .storageId("testString")
      .basePath("/abc/def")
      .catalogName("sampleCatalog")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .catalogType("iceberg")
      .skipMdsCall(false)
      .authInstanceId("testString")
      .accountId("testString")
      .build();

    // Invoke addStorageCatalog() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.addStorageCatalog(addStorageCatalogOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addStorageCatalogPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the addStorageCatalog operation with and without retries enabled
  @Test
  public void testAddStorageCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testAddStorageCatalogWOptions();

    watsonxDataService.disableRetries();
    testAddStorageCatalogWOptions();
  }

  // Test the addStorageCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddStorageCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.addStorageCatalog(null).execute();
  }

  // Test the getStorageObjectProperties operation with a valid options model parameter
  @Test
  public void testGetStorageObjectPropertiesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"object_properties\": [{\"content_type\": \"string\", \"file_type\": \"string\", \"last_modified\": \"utc-2014-07\", \"metadata\": {\"mapKey\": \"inner\"}, \"path\": \"abc/abc/data\", \"size\": \"1024\"}]}";
    String getStorageObjectPropertiesPath = "/storage_registrations/testString/object_properties";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Path model
    Path pathModel = new Path.Builder()
      .path("testString")
      .build();

    // Construct an instance of the GetStorageObjectPropertiesOptions model
    GetStorageObjectPropertiesOptions getStorageObjectPropertiesOptionsModel = new GetStorageObjectPropertiesOptions.Builder()
      .storageId("testString")
      .paths(java.util.Arrays.asList(pathModel))
      .authInstanceId("testString")
      .build();

    // Invoke getStorageObjectProperties() with a valid options model and verify the result
    Response<StorageObjectProperties> response = watsonxDataService.getStorageObjectProperties(getStorageObjectPropertiesOptionsModel).execute();
    assertNotNull(response);
    StorageObjectProperties responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getStorageObjectPropertiesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getStorageObjectProperties operation with and without retries enabled
  @Test
  public void testGetStorageObjectPropertiesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetStorageObjectPropertiesWOptions();

    watsonxDataService.disableRetries();
    testGetStorageObjectPropertiesWOptions();
  }

  // Test the getStorageObjectProperties operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetStorageObjectPropertiesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getStorageObjectProperties(null).execute();
  }

  // Test the listStorageRegistrationsObjects operation with a valid options model parameter
  @Test
  public void testListStorageRegistrationsObjectsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"isTruncated\": true, \"lastFetched\": \"/abc123\", \"objects\": [\"objects\"]}";
    String listStorageRegistrationsObjectsPath = "/storage_registrations/testString/objects";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListStorageRegistrationsObjectsOptions model
    ListStorageRegistrationsObjectsOptions listStorageRegistrationsObjectsOptionsModel = new ListStorageRegistrationsObjectsOptions.Builder()
      .storageId("testString")
      .authInstanceId("testString")
      .path("testString")
      .paginated(true)
      .pageSize(Long.valueOf("1"))
      .prefix("testString")
      .startAfter("testString")
      .build();

    // Invoke listStorageRegistrationsObjects() with a valid options model and verify the result
    Response<StorageRegistrationObjectCollection> response = watsonxDataService.listStorageRegistrationsObjects(listStorageRegistrationsObjectsOptionsModel).execute();
    assertNotNull(response);
    StorageRegistrationObjectCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listStorageRegistrationsObjectsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("path"), "testString");
    assertEquals(Boolean.valueOf(query.get("paginated")), Boolean.valueOf(true));
    assertEquals(Long.valueOf(query.get("page_size")), Long.valueOf("1"));
    assertEquals(query.get("prefix"), "testString");
    assertEquals(query.get("start_after"), "testString");
  }

  // Test the listStorageRegistrationsObjects operation with and without retries enabled
  @Test
  public void testListStorageRegistrationsObjectsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListStorageRegistrationsObjectsWOptions();

    watsonxDataService.disableRetries();
    testListStorageRegistrationsObjectsWOptions();
  }

  // Test the listStorageRegistrationsObjects operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListStorageRegistrationsObjectsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listStorageRegistrationsObjects(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    watsonxDataService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    watsonxDataService = WatsonxData.newInstance(serviceName);
    String url = server.url("/").toString();
    watsonxDataService.setServiceUrl(url);
  }
}