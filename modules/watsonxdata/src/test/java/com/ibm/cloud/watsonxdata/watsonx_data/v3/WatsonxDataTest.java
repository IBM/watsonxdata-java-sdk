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

package com.ibm.cloud.watsonxdata.watsonx_data.v3;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.WatsonxData;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPoliciesSearch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicy;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicyBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicyBulkUpdateData;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicyBulkUpdateResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddStorageCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AutoScalingConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AutoScalingConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BulkUpdateResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CapacityDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogSyncMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ColumnPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ConfigurationProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CoordinatorNodeDescriptionBody;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseCatalogPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2EngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Db2EnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DbConnectionModel;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Driver;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnrichmentObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ErrorObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.FileFormatProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDataPolicyMetadata;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GlossaryObject;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.HdfsStorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IcebergSourceTable;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJobCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJobsPager;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionSchemaResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Integration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IntegrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JsonPatchOperation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JvmProperties;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.LogConfigProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MdsConnectionInfo;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Metadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDBPartition;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDatabaseCollections;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDatabasePartitions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusDbcollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusServiceDatabases;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MilvusServicePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Milvusdb;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngineConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEngineConfigurationBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NetezzaEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngineConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.OtherEngineConfigurationBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PagedResultsLink;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PaginationLink;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PatchAutoscalingConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PatchAutoscalingSuccess;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Path;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PausePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PausePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PauseSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Permission;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyRuleV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyV2Collection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEnginePropertiesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineSuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoQueryExplain;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RangerDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RangerResource;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentGlobalSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceDetailsBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceGroupForEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RestartPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RestartPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResumeSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RevokeResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RollbackTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RowFilterProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleV2;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansion;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansionDescriptionConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansionNameConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryTerms;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryUploadProcess;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalGlossaryUploadStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegrationMappingObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegrationMappings;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalIntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScalePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScalePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ScaleSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaTransformation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchBodySearchConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchList;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchResultsItem;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchResultsItemMatchedColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SourceDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationStateDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationCallback;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationsPager;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineHome;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineHomePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEnginePatchEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceUtilisation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkHistoryServer;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkScaleConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkVscodeConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageCatalogPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetailsAccesskeyVault;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageObjectProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationObjectSizeCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Subject;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SubjectBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SubjectBulkUpdateData;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SubjectRevoke;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponsePrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TablePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableSnapshot;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TargetDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TransformColumnProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TransformColumnResponseProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateAutoScalingRequest;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.WorkerNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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

  // Test the createHdfsStorage operation with a valid options model parameter
  @Test
  public void testCreateHdfsStorageWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"HDFS description for storage\", \"display_name\": \"sample hdfs displayname\", \"id\": \"hdfs123\", \"managed_by\": \"customer\", \"state\": \"active\", \"tags\": [\"tags\"], \"type\": \"hdfs\"}";
    String createHdfsStoragePath = "/v3/storage_hdfs_registrations";
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
    String mockResponseBody = "{\"storage_registrations\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"type\": \"ibm_cos\", \"vault_enabled\": true}]}";
    String listStorageRegistrationsPath = "/v3/storage_registrations";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String createStorageRegistrationPath = "/v3/storage_registrations";
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

    // Construct an instance of the StorageDetailsAccesskeyVault model
    StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModel = new StorageDetailsAccesskeyVault.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the StorageDetails model
    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("<access_key>")
      .accessKeyVault(storageDetailsAccesskeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("iam")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9")
      .sasToken("<sas-token>")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccesskeyVaultModel)
      .vaultEnabled(true)
      .build();

    // Construct an instance of the CreateStorageRegistrationOptions model
    CreateStorageRegistrationOptions createStorageRegistrationOptionsModel = new CreateStorageRegistrationOptions.Builder()
      .description("COS storage for customer data")
      .displayName("sample-storage-displayname")
      .managedBy("ibm")
      .type("ibm_cos")
      .associatedCatalog(storageCatalogPrototypeModel)
      .connection(storageDetailsModel)
      .region("us-south")
      .storageUse("acl")
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String getStorageRegistrationPath = "/v3/storage_registrations/testString";
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
    String deleteStorageRegistrationPath = "/v3/storage_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteStorageRegistrationOptions model
    DeleteStorageRegistrationOptions deleteStorageRegistrationOptionsModel = new DeleteStorageRegistrationOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .skipMdsCall(false)
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"associated_catalog\": {\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String updateStorageRegistrationPath = "/v3/storage_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the StorageDetailsAccesskeyVault model
    StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModel = new StorageDetailsAccesskeyVault.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the StorageDetails model
    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("<access_key>")
      .accessKeyVault(storageDetailsAccesskeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("iam")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9")
      .sasToken("<sas-token>")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccesskeyVaultModel)
      .vaultEnabled(true)
      .build();

    // Construct an instance of the StorageRegistrationPatch model
    StorageRegistrationPatch storageRegistrationPatchModel = new StorageRegistrationPatch.Builder()
      .connection(storageDetailsModel)
      .description("COS storage for customer data")
      .displayName("sample-storage-displayname")
      .systemStorageUpdateCredentials(true)
      .tags(java.util.Arrays.asList("teststorage", "userstorage"))
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
    String addStorageCatalogPath = "/v3/storage_registrations/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddStorageCatalogOptions model
    AddStorageCatalogOptions addStorageCatalogOptionsModel = new AddStorageCatalogOptions.Builder()
      .storageId("testString")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .basePath("/abc/def")
      .catalogName("sampleCatalog")
      .catalogType("iceberg")
      .skipMdsCall(false)
      .authInstanceId("testString")
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
    String getStorageObjectPropertiesPath = "/v3/storage_registrations/testString/object_properties";
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
    String mockResponseBody = "{\"objects\": [\"objects\"]}";
    String listStorageRegistrationsObjectsPath = "/v3/storage_registrations/testString/objects";
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

  // Test the listDatabaseRegistrations operation with a valid options model parameter
  @Test
  public void testListDatabaseRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_registrations\": [{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"authentication_value_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"password_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"sslcertificate_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true, \"username_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"target_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"source_asset_id\": \"cc85d899-9ec3-496a-be36-99cabc62f123\", \"source_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff962f000\", \"source_project_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}]}";
    String listDatabaseRegistrationsPath = "/v3/database_registrations";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"authentication_value_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"password_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"sslcertificate_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true, \"username_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"target_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"source_asset_id\": \"cc85d899-9ec3-496a-be36-99cabc62f123\", \"source_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff962f000\", \"source_project_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String createDatabaseRegistrationPath = "/v3/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DatabaseCatalogPrototype model
    DatabaseCatalogPrototype databaseCatalogPrototypeModel = new DatabaseCatalogPrototype.Builder()
      .catalogName("sampleCatalog")
      .catalogType("iceberg")
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
      .hostname("http://db2@localhost:9900.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .name("new_database")
      .password("samplepassword")
      .passwordKeyVault(secretDetailsModel)
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
    String addDatabaseCatalogPath = "/v3/database_registrations/testString/catalogs";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"authentication_value_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"password_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"sslcertificate_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true, \"username_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"target_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"source_asset_id\": \"cc85d899-9ec3-496a-be36-99cabc62f123\", \"source_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff962f000\", \"source_project_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String getDatabasePath = "/v3/database_registrations/testString";
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
    String deleteDatabaseCatalogPath = "/v3/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDatabaseCatalogOptions model
    DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptionsModel = new DeleteDatabaseCatalogOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"authentication_value_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"password_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"sslcertificate_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true, \"username_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"target_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"source_asset_id\": \"cc85d899-9ec3-496a-be36-99cabc62f123\", \"source_catalog_id\": \"cc85d899-9ec3-496a-be36-99cff962f000\", \"source_project_id\": \"cc85d899-9ec3-496a-be36-99cff9000116\", \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String updateDatabasePath = "/v3/database_registrations/testString";
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

  // Test the listPrestoEngines operation with a valid options model parameter
  @Test
  public void testListPrestoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"presto_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"configuration\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"event_listener\": [\"property_name\"], \"global\": [\"property_name\"], \"jmx_exporter_config\": [\"jmxExporterConfig\"], \"jvm\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"log_config\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"restart_type\": \"force\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"presto123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}]}";
    String listPrestoEnginesPath = "/v3/presto_engines";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"configuration\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"event_listener\": [\"property_name\"], \"global\": [\"property_name\"], \"jmx_exporter_config\": [\"jmxExporterConfig\"], \"jvm\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"log_config\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"restart_type\": \"force\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"presto123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}";
    String createPrestoEnginePath = "/v3/presto_engines";
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

    // Construct an instance of the AutoScalingConfig model
    AutoScalingConfig autoscalingConfigModel = new AutoScalingConfig.Builder()
      .type("cpu")
      .target(Long.valueOf("40"))
      .minWorkerQuantity(Long.valueOf("1"))
      .maxWorkerQuantity(Long.valueOf("18"))
      .queryTerminationGracePeriodMin(Long.valueOf("1"))
      .scaleInStabilizationWindowMin(Long.valueOf("5"))
      .scalingStepSize(Long.valueOf("1"))
      .build();

    // Construct an instance of the EngineDetails model
    EngineDetails engineDetailsModel = new EngineDetails.Builder()
      .coordinator(coordinatorNodeDescriptionBodyModel)
      .sizeConfig("starter")
      .worker(workerNodeDescriptionBodyModel)
      .autoscalingEnabled(true)
      .autoscalingConfig(autoscalingConfigModel)
      .build();

    // Construct an instance of the CreatePrestoEngineOptions model
    CreatePrestoEngineOptions createPrestoEngineOptionsModel = new CreatePrestoEngineOptions.Builder()
      .configuration(engineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine for running sql queries")
      .id("presto123")
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

  // Test the updatePrestoEngineAutoscaling operation with a valid options model parameter
  @Test
  public void testUpdatePrestoEngineAutoscalingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"autoscaling_enabled\": true, \"autoscaling_config\": {\"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}";
    String updatePrestoEngineAutoscalingPath = "/v3/presto_engines/testString/autoscaling";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AutoScalingConfig model
    AutoScalingConfig autoScalingConfigModel = new AutoScalingConfig.Builder()
      .type("cpu")
      .target(Long.valueOf("40"))
      .minWorkerQuantity(Long.valueOf("1"))
      .maxWorkerQuantity(Long.valueOf("1"))
      .queryTerminationGracePeriodMin(Long.valueOf("1"))
      .scaleInStabilizationWindowMin(Long.valueOf("5"))
      .scalingStepSize(Long.valueOf("1"))
      .build();

    // Construct an instance of the UpdateAutoScalingRequest model
    UpdateAutoScalingRequest updateAutoScalingRequestModel = new UpdateAutoScalingRequest.Builder()
      .autoscalingConfig(autoScalingConfigModel)
      .build();
    Map<String, Object> updateAutoScalingRequestModelAsPatch = updateAutoScalingRequestModel.asPatch();

    // Construct an instance of the UpdatePrestoEngineAutoscalingOptions model
    UpdatePrestoEngineAutoscalingOptions updatePrestoEngineAutoscalingOptionsModel = new UpdatePrestoEngineAutoscalingOptions.Builder()
      .engineId("testString")
      .updateAutoScalingRequestPatch(updateAutoScalingRequestModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updatePrestoEngineAutoscaling() with a valid options model and verify the result
    Response<PatchAutoscalingSuccess> response = watsonxDataService.updatePrestoEngineAutoscaling(updatePrestoEngineAutoscalingOptionsModel).execute();
    assertNotNull(response);
    PatchAutoscalingSuccess responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestoEngineAutoscalingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestoEngineAutoscaling operation with and without retries enabled
  @Test
  public void testUpdatePrestoEngineAutoscalingWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestoEngineAutoscalingWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestoEngineAutoscalingWOptions();
  }

  // Test the updatePrestoEngineAutoscaling operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestoEngineAutoscalingNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestoEngineAutoscaling(null).execute();
  }

  // Test the listPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String listPrestoEngineCatalogsPath = "/v3/presto_engines/testString/catalogs";
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
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}";
    String createPrestoEngineCatalogsPath = "/v3/presto_engines/testString/catalogs";
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
    Response<Catalog> response = watsonxDataService.createPrestoEngineCatalogs(createPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
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
    String deletePrestoEngineCatalogsPath = "/v3/presto_engines/testString/catalogs";
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
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}";
    String getPrestoEngineCatalogPath = "/v3/presto_engines/testString/catalogs/testString";
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

  // Test the getPrestoEngineConfig operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineConfigWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"log_config_property_value\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}}";
    String getPrestoEngineConfigPath = "/v3/presto_engines/presto860/config";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineConfigOptions model
    GetPrestoEngineConfigOptions getPrestoEngineConfigOptionsModel = new GetPrestoEngineConfigOptions.Builder()
      .engineId("presto860")
      .authInstanceId("crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::")
      .sections("catalog,configuration,jvm")
      .build();

    // Invoke getPrestoEngineConfig() with a valid options model and verify the result
    Response<PrestoEnginePropertiesDetails> response = watsonxDataService.getPrestoEngineConfig(getPrestoEngineConfigOptionsModel).execute();
    assertNotNull(response);
    PrestoEnginePropertiesDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestoEngineConfigPath);
    // Verify header parameters
    assertEquals(request.getHeader("Authinstanceid"), "crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("sections"), "catalog,configuration,jvm");
  }

  // Test the getPrestoEngineConfig operation with and without retries enabled
  @Test
  public void testGetPrestoEngineConfigWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestoEngineConfigWOptions();

    watsonxDataService.disableRetries();
    testGetPrestoEngineConfigWOptions();
  }

  // Test the getPrestoEngineConfig operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestoEngineConfigNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestoEngineConfig(null).execute();
  }

  // Test the updatePrestoEngineConfig operation with a valid options model parameter
  @Test
  public void testUpdatePrestoEngineConfigWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String updatePrestoEngineConfigPath = "/v3/presto_engines/presto93/config";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CatalogProperties model
    CatalogProperties catalogPropertiesModel = new CatalogProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the ConfigurationProperties model
    ConfigurationProperties configurationPropertiesModel = new ConfigurationProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();

    // Construct an instance of the JvmProperties model
    JvmProperties jvmPropertiesModel = new JvmProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();

    // Construct an instance of the LogConfigProperties model
    LogConfigProperties logConfigPropertiesModel = new LogConfigProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();

    // Construct an instance of the PrestoEngineProperties model
    PrestoEngineProperties prestoEnginePropertiesModel = new PrestoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", catalogPropertiesModel))
      .configuration(configurationPropertiesModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(jvmPropertiesModel)
      .logConfig(logConfigPropertiesModel)
      .build();

    // Construct an instance of the PrestoEnginePropertiesDetails model
    PrestoEnginePropertiesDetails prestoEnginePropertiesDetailsModel = new PrestoEnginePropertiesDetails.Builder()
      .engineProperties(prestoEnginePropertiesModel)
      .build();
    Map<String, Object> prestoEnginePropertiesDetailsModelAsPatch = prestoEnginePropertiesDetailsModel.asPatch();

    // Construct an instance of the UpdatePrestoEngineConfigOptions model
    UpdatePrestoEngineConfigOptions updatePrestoEngineConfigOptionsModel = new UpdatePrestoEngineConfigOptions.Builder()
      .engineId("presto93")
      .authInstanceId("crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::")
      .prestoEnginePropertiesDetailsPatch(prestoEnginePropertiesDetailsModelAsPatch)
      .build();

    // Invoke updatePrestoEngineConfig() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.updatePrestoEngineConfig(updatePrestoEngineConfigOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestoEngineConfigPath);
    // Verify header parameters
    assertEquals(request.getHeader("Authinstanceid"), "crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestoEngineConfig operation with and without retries enabled
  @Test
  public void testUpdatePrestoEngineConfigWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestoEngineConfigWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestoEngineConfigWOptions();
  }

  // Test the updatePrestoEngineConfig operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestoEngineConfigNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestoEngineConfig(null).execute();
  }

  // Test the getPrestoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"configuration\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"event_listener\": [\"property_name\"], \"global\": [\"property_name\"], \"jmx_exporter_config\": [\"jmxExporterConfig\"], \"jvm\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"log_config\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"restart_type\": \"force\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"presto123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}";
    String getPrestoEnginePath = "/v3/presto_engines/testString";
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
    String deleteEnginePath = "/v3/presto_engines/testString";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"configuration\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"event_listener\": [\"property_name\"], \"global\": [\"property_name\"], \"jmx_exporter_config\": [\"jmxExporterConfig\"], \"jvm\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}, \"log_config\": {\"coordinator\": [\"property_name\"], \"worker\": [\"property_name\"]}}, \"restart_type\": \"force\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"presto123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}, \"autoscaling_enabled\": true, \"autoscaling_config\": {\"type\": \"cpu\", \"target\": 40, \"min_worker_quantity\": 1, \"max_worker_quantity\": 18, \"query_termination_grace_period_min\": 1, \"scale_in_stabilization_window_min\": 5, \"scaling_step_size\": 1}}";
    String updatePrestoEnginePath = "/v3/presto_engines/testString";
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
    String pausePrestoEnginePath = "/v3/presto_engines/testString/pause";
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
    String runExplainStatementPath = "/v3/presto_engines/testString/query_explain";
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
    String runExplainAnalyzeStatementPath = "/v3/presto_engines/testString/query_explain_analyze";
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
    String restartPrestoEnginePath = "/v3/presto_engines/testString/restart";
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
    String resumePrestoEnginePath = "/v3/presto_engines/testString/resume";
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
    String scalePrestoEnginePath = "/v3/presto_engines/testString/scale";
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

  // Test the listPrestissimoEngines operation with a valid options model parameter
  @Test
  public void testListPrestissimoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"prestissimo_engines\": [{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo123\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}}, \"configuration\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"global\": [\"global\"], \"jvm\": {\"coordinator\": [\"coordinator\"]}, \"log_config\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"optimizer_properties\": [\"optimizerProperties\"], \"velox\": [\"velox\"]}, \"restart_type\": \"force\", \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}]}";
    String listPrestissimoEnginesPath = "/v3/prestissimo_engines";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo123\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}}, \"configuration\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"global\": [\"global\"], \"jvm\": {\"coordinator\": [\"coordinator\"]}, \"log_config\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"optimizer_properties\": [\"optimizerProperties\"], \"velox\": [\"velox\"]}, \"restart_type\": \"force\", \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String createPrestissimoEnginePath = "/v3/prestissimo_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescription model
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoEngineDetails model
    PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
      .coordinator(nodeDescriptionModel)
      .sizeConfig("starter")
      .worker(nodeDescriptionModel)
      .build();

    // Construct an instance of the CreatePrestissimoEngineOptions model
    CreatePrestissimoEngineOptions createPrestissimoEngineOptionsModel = new CreatePrestissimoEngineOptions.Builder()
      .configuration(prestissimoEngineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("hive_data"))
      .description("prestissimo engine description")
      .id("prestissimo123")
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
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}";
    String getPrestissimoEngineCatalogPath = "/v3/prestissimo_engines/testString/catalogs/testString";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo123\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}}, \"configuration\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"global\": [\"global\"], \"jvm\": {\"coordinator\": [\"coordinator\"]}, \"log_config\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"optimizer_properties\": [\"optimizerProperties\"], \"velox\": [\"velox\"]}, \"restart_type\": \"force\", \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String getPrestissimoEnginePath = "/v3/prestissimo_engines/testString";
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
    String deletePrestissimoEnginePath = "/v3/prestissimo_engines/testString";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo123\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"remove_engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}}, \"configuration\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"global\": [\"global\"], \"jvm\": {\"coordinator\": [\"coordinator\"]}, \"log_config\": {\"coordinator\": [\"coordinator\"], \"worker\": [\"worker\"]}, \"optimizer_properties\": [\"optimizerProperties\"], \"velox\": [\"velox\"]}, \"restart_type\": \"force\", \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String updatePrestissimoEnginePath = "/v3/prestissimo_engines/testString";
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
      .global(java.util.Collections.singletonMap("key1", "testString"))
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
      .global(java.util.Arrays.asList("testString"))
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
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String listPrestissimoEngineCatalogsPath = "/v3/prestissimo_engines/testString/catalogs";
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
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String createPrestissimoEngineCatalogsPath = "/v3/prestissimo_engines/testString/catalogs";
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
    String deletePrestissimoEngineCatalogsPath = "/v3/prestissimo_engines/testString/catalogs";
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
    String pausePrestissimoEnginePath = "/v3/prestissimo_engines/testString/pause";
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
    String runPrestissimoExplainStatementPath = "/v3/prestissimo_engines/testString/query_explain";
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
    String runPrestissimoExplainAnalyzeStatementPath = "/v3/prestissimo_engines/testString/query_explain_analyze";
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
    String restartPrestissimoEnginePath = "/v3/prestissimo_engines/testString/restart";
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
    String resumePrestissimoEnginePath = "/v3/prestissimo_engines/testString/resume";
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
    String scalePrestissimoEnginePath = "/v3/prestissimo_engines/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescription model
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the ScalePrestissimoEngineOptions model
    ScalePrestissimoEngineOptions scalePrestissimoEngineOptionsModel = new ScalePrestissimoEngineOptions.Builder()
      .id("testString")
      .coordinator(nodeDescriptionModel)
      .worker(nodeDescriptionModel)
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

  // Test the listDb2Engines operation with a valid options model parameter
  @Test
  public void testListDb2EnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"db2_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"db2 engine to run sql queries\", \"display_name\": \"sample-engine\", \"host_name\": \"xyz-db2-01-db2-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 1, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}]}";
    String listDb2EnginesPath = "/v3/db2_engines";
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
    String createDb2EnginePath = "/v3/db2_engines";
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
    String deleteDb2EnginePath = "/v3/db2_engines/testString";
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
    String updateDb2EnginePath = "/v3/db2_engines/testString";
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

  // Test the listOtherEngines operation with a valid options model parameter
  @Test
  public void testListOtherEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"other_engines\": [{\"actions\": [\"actions\"], \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\", \"type\": \"netezza\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"engine for running sql queries\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"registered\", \"tags\": [\"tags\"], \"type\": \"external\"}]}";
    String listOtherEnginesPath = "/v3/other_engines";
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
    String createOtherEnginePath = "/v3/other_engines";
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
    String deleteOtherEnginePath = "/v3/other_engines/testString";
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

  // Test the listNetezzaEngines operation with a valid options model parameter
  @Test
  public void testListNetezzaEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"netezza_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"netezza engine description\", \"display_name\": \"sampleEngine\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"id\": \"sampleEngine123\", \"origin\": \"ibm\", \"port\": 0, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}]}";
    String listNetezzaEnginesPath = "/v3/netezza_engines";
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
    String createNetezzaEnginePath = "/v3/netezza_engines";
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
    String deleteNetezzaEnginePath = "/v3/netezza_engines/testString";
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
    String updateNetezzaEnginePath = "/v3/netezza_engines/testString";
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

  // Test the listSparkEngines operation with a valid options model parameter
  @Test
  public void testListSparkEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"spark_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-instance_id\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine description\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"provisioning\", \"tags\": [\"tags\"], \"type\": \"spark\"}]}";
    String listSparkEnginesPath = "/v3/spark_engines";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-instance_id\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine description\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"provisioning\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String createSparkEnginePath = "/v3/spark_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkEndpoints model
    SparkEndpoints sparkEndpointsModel = new SparkEndpoints.Builder()
      .applicationsApi("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id")
      .historyServerEndpoint("$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server")
      .sparkAccessEndpoint("$HOST/analytics-engine/details/spark-instance_id")
      .sparkJobsV4Endpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications")
      .sparkKernelEndpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels")
      .viewHistoryServer("testString")
      .wxdApplicationEndpoint("$HOST/v1/1698311655308796/engines/spark817/applications")
      .wxdEngineEndpoint("$HOST/v1/1698311655308796/engines/spark817")
      .wxdHistoryServerEndpoint("$HOST/v1/1698311655308796/engines/spark817/history_server")
      .wxdHistoryServerUiEndpoint("$HOST/v1/1698311655308796/engines/spark817/history_server/ui")
      .build();

    // Construct an instance of the SparkEngineHome model
    SparkEngineHome sparkEngineHomeModel = new SparkEngineHome.Builder()
      .path("spark/spark1234")
      .storageName("test-spark-storage")
      .volume("test-spark-volume")
      .volumeId("1704979825978585")
      .volumeName("my-volume")
      .build();

    // Construct an instance of the SparkEngineResourceLimit model
    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();

    // Construct an instance of the SparkEngineResourceUtilisation model
    SparkEngineResourceUtilisation sparkEngineResourceUtilisationModel = new SparkEngineResourceUtilisation.Builder()
      .cores("1m")
      .memory("4Gi")
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

    // Construct an instance of the SparkVscodeConfig model
    SparkVscodeConfig sparkVscodeConfigModel = new SparkVscodeConfig.Builder()
      .crn("crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2")
      .environmentType("SaaS")
      .host("us-south.lakehouse.dev.cloud.ibm.com")
      .userName("user@example.com")
      .build();

    // Construct an instance of the SparkEngineDetails model
    SparkEngineDetails sparkEngineDetailsModel = new SparkEngineDetails.Builder()
      .apiKey("apikey")
      .connectionString("https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id")
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .endpoints(sparkEndpointsModel)
      .engineHome(sparkEngineHomeModel)
      .engineSubType("java")
      .instanceId("spark-id")
      .managedBy("fully")
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .resourceUtilisation(sparkEngineResourceUtilisationModel)
      .scaleConfig(sparkScaleConfigModel)
      .vscodeConfig(sparkVscodeConfigModel)
      .build();

    // Construct an instance of the CreateSparkEngineOptions model
    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .displayName("sampleEngine")
      .origin("external")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .configuration(sparkEngineDetailsModel)
      .description("spark engine description")
      .id("spark123")
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

  // Test the getSparkEngineCatalog operation with a valid options model parameter
  @Test
  public void testGetSparkEngineCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}";
    String getSparkEngineCatalogPath = "/v3/spark_engines/testString/catalogs/testString";
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

  // Test the getSparkEngine operation with a valid options model parameter
  @Test
  public void testGetSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-instance_id\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine description\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"provisioning\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String getSparkEnginePath = "/v3/spark_engines/testString";
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
    String deleteSparkEnginePath = "/v3/spark_engines/testString";
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
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"api_key\": \"apikey\", \"connection_string\": \"https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id\", \"default_config\": {\"mapKey\": \"configuration\"}, \"default_version\": \"4.8.3\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-instance_id\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\", \"wxd_engine_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817\", \"wxd_history_server_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server\", \"wxd_history_server_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/history_server/ui\"}, \"engine_home\": {\"path\": \"spark/spark1234\", \"storage_name\": \"test-spark-storage\", \"volume\": \"test-spark-volume\", \"volume_id\": \"1704979825978585\", \"volume_name\": \"my-volume\"}, \"engine_sub_type\": \"java\", \"instance_id\": \"spark-id\", \"managed_by\": \"fully\", \"resource_limit_enabled\": true, \"resource_limits\": {\"cores\": \"1\", \"memory\": \"4G\"}, \"resource_utilisation\": {\"cores\": \"1m\", \"memory\": \"4Gi\"}, \"scale_config\": {\"auto_scale_enabled\": true, \"current_number_of_nodes\": 2, \"maximum_number_of_nodes\": 5, \"minimum_number_of_nodes\": 1, \"node_type\": \"medium\", \"number_of_nodes\": 2}, \"vscode_config\": {\"crn\": \"crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2\", \"environment_type\": \"SaaS\", \"host\": \"us-south.lakehouse.dev.cloud.ibm.com\", \"user_name\": \"user@example.com\"}}, \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"description\": \"spark engine description\", \"display_name\": \"sampleEngine\", \"id\": \"spark123\", \"mode\": \"serverless\", \"origin\": \"external\", \"status\": \"provisioning\", \"tags\": [\"tags\"], \"type\": \"spark\"}";
    String updateSparkEnginePath = "/v3/spark_engines/testString";
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

  // Test the listSparkEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListSparkEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String listSparkEngineCatalogsPath = "/v3/spark_engines/testString/catalogs";
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
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String createSparkEngineCatalogsPath = "/v3/spark_engines/testString/catalogs";
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
    String deleteSparkEngineCatalogsPath = "/v3/spark_engines/testString/catalogs";
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

  // Test the pauseSparkEngine operation with a valid options model parameter
  @Test
  public void testPauseSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String pauseSparkEnginePath = "/v3/spark_engines/testString/pause";
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

  // Test the resumeSparkEngine operation with a valid options model parameter
  @Test
  public void testResumeSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String resumeSparkEnginePath = "/v3/spark_engines/testString/resume";
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
    String scaleSparkEnginePath = "/v3/spark_engines/testString/scale";
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

  // Test the getSparkEngineApplicationStatus operation with a valid options model parameter
  @Test
  public void testGetSparkEngineApplicationStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"application_details\": {\"application\": \"s3://mybucket/wordcount.py\", \"archives\": \"s3://mybucket/myarchive.zip\", \"arguments\": [\"people.txt\"], \"class\": \"org.apache.spark.examples.SparkPi\", \"conf\": {\"mapKey\": \"configuration\"}, \"env\": {\"mapKey\": \"configuration\"}, \"files\": \"s3://mybucket/myfile.txt\", \"jars\": \"jars\", \"name\": \"SparkApplicaton1\", \"packages\": \"org.apache.spark:example_1.2.3\", \"repositories\": \"https://repo1.maven.org/maven2/\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_version\": \"3.3\"}, \"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"init_scripts\": [\"file://init_scripts/test.sh\"], \"max_retries\": \"3\", \"min_retry_interval_in_seconds\": \"30\", \"retry_attempt\": \"2\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"spark_ui\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\", \"spark_version\": \"3.4\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\", \"wxd_application_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}";
    String getSparkEngineApplicationStatusPath = "/v3/spark_engines/testString/applications/testString";
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
    String deleteSparkEngineApplicationPath = "/v3/spark_engines/testString/applications/testString";
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
    String getSparkEngineApplicationUiPath = "/v3/spark_engines/testString/applications/testString/ui";
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

  // Test the listSparkEngineApplications operation with a valid options model parameter
  @Test
  public void testListSparkEngineApplicationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applications\": [{\"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"idempotency_key\": \"idempotencyKey\", \"init_scripts\": [\"file://init_scripts/test.sh\"], \"max_retries\": \"3\", \"min_retry_interval_in_seconds\": \"30\", \"retry_attempt\": \"2\", \"runtime\": {\"spark_version\": \"3.4\"}, \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"spark_ui\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\", \"spark_version\": \"3.4\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\", \"timeout_in_seconds\": \"60\", \"wxd_application_ui_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications/c7b3fccf-badb-46b0-b1ef-9b3154424021/ui\"}], \"first\": {\"href\": \"https://example.com/v1/applications?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://example.com/v1/applications?limit=100\"}}";
    String listSparkEngineApplicationsPath = "/v3/spark_engines/testString/applications";
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
    String createSparkEngineApplicationPath = "/v3/spark_engines/testString/applications";
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

  // Test the getSparkEngineHistoryServer operation with a valid options model parameter
  @Test
  public void testGetSparkEngineHistoryServerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_termination_time\": \"2022-02-24T07:37:47Z\", \"cores\": \"1\", \"memory\": \"4G\", \"start_time\": \"2022-02-21T07:37:47Z\", \"state\": \"started\"}";
    String getSparkEngineHistoryServerPath = "/v3/spark_engines/testString/history_server";
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
    String startSparkEngineHistoryServerPath = "/v3/spark_engines/testString/history_server";
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
    String deleteSparkEngineHistoryServerPath = "/v3/spark_engines/testString/history_server";
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
    String getSparkEngineHistoryServerUiPath = "/v3/spark_engines/testString/history_server/ui";
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

  // Test the validateIntegration operation with a valid options model parameter
  @Test
  public void testValidateIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\", \"ranger_details\": {\"resources\": [{\"name\": \"presto01\", \"type\": \"presto\"}]}}";
    String validateIntegrationPath = "/v3/integration_validation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Catalogs model
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();

    // Construct an instance of the ValidateIntegrationOptions model
    ValidateIntegrationOptions validateIntegrationOptionsModel = new ValidateIntegrationOptions.Builder()
      .type("ranger")
      .accessToken("Header.Payload.Signature")
      .apikey("apikey")
      .catalogs(catalogsModel)
      .certificate("certificate_content_base64_encoded")
      .password("password")
      .ssl(true)
      .url("https://www.abcd.com")
      .username("username")
      .authInstanceId("testString")
      .build();

    // Invoke validateIntegration() with a valid options model and verify the result
    Response<ValidateIntegration> response = watsonxDataService.validateIntegration(validateIntegrationOptionsModel).execute();
    assertNotNull(response);
    ValidateIntegration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the validateIntegration operation with and without retries enabled
  @Test
  public void testValidateIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testValidateIntegrationWOptions();

    watsonxDataService.disableRetries();
    testValidateIntegrationWOptions();
  }

  // Test the validateIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.validateIntegration(null).execute();
  }

  // Test the listAllIntegrations operation with a valid options model parameter
  @Test
  public void testListAllIntegrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"integrations\": [{\"access_token\": \"Header.Payload.Signature\", \"apikey\": \"apikey\", \"auth_url\": \"https://iam.abc.com\", \"catalogs\": {\"catalog_names\": [\"catalogNames\"]}, \"certificate\": \"certificate_content_base64_encoded\", \"certificate_extension\": \"pem\", \"config_properties\": \"properties\", \"connection_mode\": \"external\", \"cross_account_integration\": false, \"enable_data_policy_within_wxd\": false, \"governance_properties\": \"query-governance.name=external\", \"id\": \"presto01\", \"ikc_user_account_id\": \"ikc_user_account_id\", \"manta_url\": \"https://abcd.com/gov_lineage/v2/lineage_events/openlineage\", \"modified_at\": 0, \"modified_by\": \"<username>@<domain>.com\", \"password\": \"password\", \"policy_cache_time_configuration\": \"123456789\", \"resource\": \"presto01\", \"ssl\": true, \"state\": \"active\", \"type\": \"ranger\", \"url\": \"https://www.abcd.com\", \"username\": \"username\", \"zen_apikey\": \"zen_apikey\"}]}";
    String listAllIntegrationsPath = "/v3/integrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllIntegrationsOptions model
    ListAllIntegrationsOptions listAllIntegrationsOptionsModel = new ListAllIntegrationsOptions.Builder()
      .authInstanceId("testString")
      .secret("testString")
      .type(java.util.Arrays.asList("testString"))
      .state(java.util.Arrays.asList("active"))
      .build();

    // Invoke listAllIntegrations() with a valid options model and verify the result
    Response<IntegrationCollection> response = watsonxDataService.listAllIntegrations(listAllIntegrationsOptionsModel).execute();
    assertNotNull(response);
    IntegrationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllIntegrationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("type"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("state"), RequestUtils.join(java.util.Arrays.asList("active"), ","));
  }

  // Test the listAllIntegrations operation with and without retries enabled
  @Test
  public void testListAllIntegrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListAllIntegrationsWOptions();

    watsonxDataService.disableRetries();
    testListAllIntegrationsWOptions();
  }

  // Test the createIntegration operation with a valid options model parameter
  @Test
  public void testCreateIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_token\": \"Header.Payload.Signature\", \"apikey\": \"apikey\", \"auth_url\": \"https://iam.abc.com\", \"catalogs\": {\"catalog_names\": [\"catalogNames\"]}, \"certificate\": \"certificate_content_base64_encoded\", \"certificate_extension\": \"pem\", \"config_properties\": \"properties\", \"connection_mode\": \"external\", \"cross_account_integration\": false, \"enable_data_policy_within_wxd\": false, \"governance_properties\": \"query-governance.name=external\", \"id\": \"presto01\", \"ikc_user_account_id\": \"ikc_user_account_id\", \"manta_url\": \"https://abcd.com/gov_lineage/v2/lineage_events/openlineage\", \"modified_at\": 0, \"modified_by\": \"<username>@<domain>.com\", \"password\": \"password\", \"policy_cache_time_configuration\": \"123456789\", \"resource\": \"presto01\", \"ssl\": true, \"state\": \"active\", \"type\": \"ranger\", \"url\": \"https://www.abcd.com\", \"username\": \"username\", \"zen_apikey\": \"zen_apikey\"}";
    String createIntegrationPath = "/v3/integrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Catalogs model
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();

    // Construct an instance of the CreateIntegrationOptions model
    CreateIntegrationOptions createIntegrationOptionsModel = new CreateIntegrationOptions.Builder()
      .accessToken("Header.Payload.Signature")
      .apikey("apikey")
      .catalogs(catalogsModel)
      .certificate("certificate_content_base64_encoded")
      .certificateExtension("pem")
      .connectionMode("external")
      .crossAccountIntegration(false)
      .enableDataPolicyWithinWxd(false)
      .ikcUserAccountId("ikc_user_account_id")
      .password("password")
      .policyCacheTimeConfiguration("123456789")
      .resource("presto01")
      .ssl(true)
      .type("ranger")
      .url("https://abcd.efgh.com")
      .username("username")
      .authInstanceId("testString")
      .build();

    // Invoke createIntegration() with a valid options model and verify the result
    Response<Integration> response = watsonxDataService.createIntegration(createIntegrationOptionsModel).execute();
    assertNotNull(response);
    Integration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createIntegration operation with and without retries enabled
  @Test
  public void testCreateIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateIntegrationWOptions();

    watsonxDataService.disableRetries();
    testCreateIntegrationWOptions();
  }

  // Test the getIntegrations operation with a valid options model parameter
  @Test
  public void testGetIntegrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_token\": \"Header.Payload.Signature\", \"apikey\": \"apikey\", \"auth_url\": \"https://iam.abc.com\", \"catalogs\": {\"catalog_names\": [\"catalogNames\"]}, \"certificate\": \"certificate_content_base64_encoded\", \"certificate_extension\": \"pem\", \"config_properties\": \"properties\", \"connection_mode\": \"external\", \"cross_account_integration\": false, \"enable_data_policy_within_wxd\": false, \"governance_properties\": \"query-governance.name=external\", \"id\": \"presto01\", \"ikc_user_account_id\": \"ikc_user_account_id\", \"manta_url\": \"https://abcd.com/gov_lineage/v2/lineage_events/openlineage\", \"modified_at\": 0, \"modified_by\": \"<username>@<domain>.com\", \"password\": \"password\", \"policy_cache_time_configuration\": \"123456789\", \"resource\": \"presto01\", \"ssl\": true, \"state\": \"active\", \"type\": \"ranger\", \"url\": \"https://www.abcd.com\", \"username\": \"username\", \"zen_apikey\": \"zen_apikey\"}";
    String getIntegrationsPath = "/v3/integrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetIntegrationsOptions model
    GetIntegrationsOptions getIntegrationsOptionsModel = new GetIntegrationsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getIntegrations() with a valid options model and verify the result
    Response<Integration> response = watsonxDataService.getIntegrations(getIntegrationsOptionsModel).execute();
    assertNotNull(response);
    Integration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIntegrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getIntegrations operation with and without retries enabled
  @Test
  public void testGetIntegrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetIntegrationsWOptions();

    watsonxDataService.disableRetries();
    testGetIntegrationsWOptions();
  }

  // Test the getIntegrations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetIntegrationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getIntegrations(null).execute();
  }

  // Test the deleteIntegration operation with a valid options model parameter
  @Test
  public void testDeleteIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteIntegrationPath = "/v3/integrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteIntegrationOptions model
    DeleteIntegrationOptions deleteIntegrationOptionsModel = new DeleteIntegrationOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteIntegration() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteIntegration(deleteIntegrationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteIntegration operation with and without retries enabled
  @Test
  public void testDeleteIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteIntegrationWOptions();

    watsonxDataService.disableRetries();
    testDeleteIntegrationWOptions();
  }

  // Test the deleteIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteIntegration(null).execute();
  }

  // Test the updateIntegration operation with a valid options model parameter
  @Test
  public void testUpdateIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_token\": \"Header.Payload.Signature\", \"apikey\": \"apikey\", \"auth_url\": \"https://iam.abc.com\", \"catalogs\": {\"catalog_names\": [\"catalogNames\"]}, \"certificate\": \"certificate_content_base64_encoded\", \"certificate_extension\": \"pem\", \"config_properties\": \"properties\", \"connection_mode\": \"external\", \"cross_account_integration\": false, \"enable_data_policy_within_wxd\": false, \"governance_properties\": \"query-governance.name=external\", \"id\": \"presto01\", \"ikc_user_account_id\": \"ikc_user_account_id\", \"manta_url\": \"https://abcd.com/gov_lineage/v2/lineage_events/openlineage\", \"modified_at\": 0, \"modified_by\": \"<username>@<domain>.com\", \"password\": \"password\", \"policy_cache_time_configuration\": \"123456789\", \"resource\": \"presto01\", \"ssl\": true, \"state\": \"active\", \"type\": \"ranger\", \"url\": \"https://www.abcd.com\", \"username\": \"username\", \"zen_apikey\": \"zen_apikey\"}";
    String updateIntegrationPath = "/v3/integrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Catalogs model
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();

    // Construct an instance of the IntegrationPatch model
    IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
      .accessToken("Header.Payload.Signature")
      .apikey("apikey")
      .catalogs(catalogsModel)
      .certificate("certificate_content_base64_encoded")
      .certificateExtension("pem")
      .connectionMode("external")
      .crossAccountIntegration(false)
      .enableDataPolicyWithinWxd(false)
      .ikcUserAccountId("ikc_user_account_id")
      .password("password")
      .policyCacheTimeConfiguration("123456789")
      .resource("presto01")
      .ssl(true)
      .state("active")
      .url("https://abcd.efgh.com")
      .username("username")
      .build();
    Map<String, Object> integrationPatchModelAsPatch = integrationPatchModel.asPatch();

    // Construct an instance of the UpdateIntegrationOptions model
    UpdateIntegrationOptions updateIntegrationOptionsModel = new UpdateIntegrationOptions.Builder()
      .id("testString")
      .body(integrationPatchModelAsPatch)
      .authInstanceId("testString")
      .secret("testString")
      .build();

    // Invoke updateIntegration() with a valid options model and verify the result
    Response<Integration> response = watsonxDataService.updateIntegration(updateIntegrationOptionsModel).execute();
    assertNotNull(response);
    Integration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIntegrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateIntegration operation with and without retries enabled
  @Test
  public void testUpdateIntegrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateIntegrationWOptions();

    watsonxDataService.disableRetries();
    testUpdateIntegrationWOptions();
  }

  // Test the updateIntegration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateIntegrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateIntegration(null).execute();
  }

  // Test the registerTable operation with a valid options model parameter
  @Test
  public void testRegisterTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String registerTablePath = "/v3/catalogs/testString/schemas/testString/register";
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
    String loadTablePath = "/v3/catalogs/testString/schemas/testString/tables/testString/metadata";
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

  // Test the listCatalogs operation with a valid options model parameter
  @Test
  public void testListCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}]}";
    String listCatalogsPath = "/v3/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCatalogsOptions model
    ListCatalogsOptions listCatalogsOptionsModel = new ListCatalogsOptions.Builder()
      .authInstanceId("testString")
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

  // Test the getCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testGetCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\"}";
    String getCatalogEngineAssociationPath = "/v3/catalogs/testString/engines";
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
    String deleteSchemaPath = "/v3/catalogs/testString/schemas/testString";
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
    String listTablesPath = "/v3/catalogs/testString/schemas/testString/tables";
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
    String getTablePath = "/v3/catalogs/testString/schemas/testString/tables/testString";
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
    String deleteTablePath = "/v3/catalogs/testString/schemas/testString/tables/testString";
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
    String updateTablePath = "/v3/catalogs/testString/schemas/testString/tables/testString";
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
    String listColumnsPath = "/v3/catalogs/testString/schemas/testString/tables/testString/columns";
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
    String createColumnsPath = "/v3/catalogs/testString/schemas/testString/tables/testString/columns";
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
    String deleteColumnPath = "/v3/catalogs/testString/schemas/testString/tables/testString/columns/testString";
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
    String updateColumnPath = "/v3/catalogs/testString/schemas/testString/tables/testString/columns/testString";
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

  // Test the rollbackTable operation with a valid options model parameter
  @Test
  public void testRollbackTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String rollbackTablePath = "/v3/catalogs/testString/schemas/testString/tables/testString/rollback";
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
      .engineId("testString")
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
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
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
    String listTableSnapshotsPath = "/v3/catalogs/testString/schemas/testString/tables/testString/snapshots";
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
    String listSchemasPath = "/v3/catalogs/testString/schemas";
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
    String createSchemaPath = "/v3/catalogs/testString/schemas";
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
    String updateSyncCatalogPath = "/v3/catalogs/testString/sync";
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
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"catalog_names\": [\"iceberg_catalog\"], \"type\": \"iceberg\"}";
    String getCatalogPath = "/v3/catalogs/testString";
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
    String deleteCatalogPath = "/v3/catalogs/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCatalogOptions model
    DeleteCatalogOptions deleteCatalogOptionsModel = new DeleteCatalogOptions.Builder()
      .name("testString")
      .authInstanceId("testString")
      .skipMdsCall(false)
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
    String mockResponseBody = "{\"milvus_services\": [{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"milvus123\", \"index_type\": \"hnsw\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"Sample/path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"Sample_storage_name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}]}";
    String listMilvusServicesPath = "/v3/milvus_services";
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
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"milvus123\", \"index_type\": \"hnsw\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"Sample/path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"Sample_storage_name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String createMilvusServicePath = "/v3/milvus_services";
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
      .id("milvus123")
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
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"milvus123\", \"index_type\": \"hnsw\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"Sample/path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"Sample_storage_name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String getMilvusServicePath = "/v3/milvus_services/testString";
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
    String deleteMilvusServicePath = "/v3/milvus_services/testString";
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
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"milvus123\", \"index_type\": \"hnsw\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"Sample/path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"Sample_storage_name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String updateMilvusServicePath = "/v3/milvus_services/testString";
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
    String createMilvusServicePausePath = "/v3/milvus_services/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServicePauseOptions model
    CreateMilvusServicePauseOptions createMilvusServicePauseOptionsModel = new CreateMilvusServicePauseOptions.Builder()
      .id("testString")
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
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
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
    String createMilvusServiceResumePath = "/v3/milvus_services/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMilvusServiceResumeOptions model
    CreateMilvusServiceResumeOptions createMilvusServiceResumeOptionsModel = new CreateMilvusServiceResumeOptions.Builder()
      .id("testString")
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
    String createMilvusServiceScalePath = "/v3/milvus_services/testString/scale";
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
    String listMilvusServiceDatabasesPath = "/v3/milvus_services/testString/databases";
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
    String listMilvusDatabaseCollectionsPath = "/v3/milvus_services/testString/databases/testString/collections";
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
    String listMilvusDatabasePartitionsPath = "/v3/milvus_services/testString/databases/testString/collections/testString/partitions";
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
    String mockResponseBody = "{\"access_key\": \"Sample storage access key\", \"actions\": [\"actions\"], \"created_at\": 1, \"created_by\": \"<username>@<domain>.com\", \"dc_cpu\": 0.01, \"dc_memory\": 0.01, \"dc_replicas\": 1, \"description\": \"milvus service for running sql queries\", \"display_name\": \"sampleService\", \"dw_cpu\": 0.01, \"dw_memory\": 0.01, \"dw_replicas\": 1, \"endpoint\": \"endpoint\", \"etcd_cpu\": 0.01, \"etcd_memory\": 0.01, \"failure_message\": \"Failed to start engine\", \"grpc_host\": \"example.grpc.host\", \"grpc_port\": 1, \"host_name\": \"sampleMilvus\", \"https_host\": \"example.https.host\", \"https_port\": 1, \"id\": \"milvus123\", \"index_type\": \"hnsw\", \"iw_cpu\": 0.01, \"iw_memory\": 0.01, \"iw_replicas\": 1, \"kafka_cpu\": 0.01, \"kafka_memory\": 0.01, \"managed_by\": \"customer\", \"origin\": \"native\", \"proxy_cpu\": 0.01, \"proxy_host\": \"example.proxy.host\", \"proxy_memory\": 0.01, \"proxy_port\": 1, \"proxy_replicas\": 1, \"qc_cpu\": 0.01, \"qc_memory\": 0.01, \"qc_replicas\": 1, \"qw_cpu\": 0.01, \"qw_memory\": 0.01, \"qw_replicas\": 1, \"rc_cpu\": 0.01, \"rc_memory\": 0.01, \"rc_replicas\": 1, \"root_path\": \"Sample/path\", \"secret_key\": \"Sample storage secret access key\", \"status\": \"running\", \"status_code\": 1, \"storage_name\": \"Sample_storage_name\", \"tags\": [\"tags\"], \"tshirt_size\": \"small\", \"type\": \"milvus\", \"vector\": 1, \"vector_dimension\": 384, \"version\": \"3.5\"}";
    String updateMilvusServiceBucketPath = "/v3/milvus_services/testString/storage";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateMilvusServiceBucketOptions model
    UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptionsModel = new UpdateMilvusServiceBucketOptions.Builder()
      .serviceId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
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

  // Test the getSalIntegration operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"category_id\": \"10e64285-bf37-4d5d-b759-bc6a46589234\", \"created_at_epoch\": \"1715056266\", \"engine_id\": \"presto-01\", \"errors\": [{\"code\": \"unable_to_perform\", \"message\": \"Failed to process integration settings for watsonx.data instance\"}], \"instance_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"status\": \"provisioning\", \"storage_resource_crn\": \"crn:v1:staging:public:cloud-object-storage:global:a/04e9bc47612523rr19ac22759cb69bebd:asd23df-6ada-45ff-bfe8-4343222\", \"storage_type\": \"bmcos_object_storage\", \"trial_plan\": false, \"username\": \"xyz@abc.com\"}";
    String getSalIntegrationPath = "/v3/sal_integration";
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
    String createSalIntegrationPath = "/v3/sal_integration";
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
    String deleteSalIntegrationPath = "/v3/sal_integration";
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
    String updateSalIntegrationPath = "/v3/sal_integration";
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
      .salIntegrationPatch(salIntegrationPatchModelAsPatch)
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
    String createSalIntegrationEnrichmentPath = "/v3/sal_integration/enrichment";
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

  // Test the listSalIntegrationEnrichmentAssets operation with a valid options model parameter
  @Test
  public void testListSalIntegrationEnrichmentAssetsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_assets\": [{\"attributes\": [\"attributes\"], \"id\": \"ee0383b9-dcab-4c1a-b03d-bf521837b6ed\", \"name\": \"newtable\", \"resource_key\": \"0000:0000:0000:0000:0000:FFFF:9EB0:04E2|31134|:/iceberg_data/new_schema/sampletable\", \"schema_name\": \"sampleschema\"}]}";
    String listSalIntegrationEnrichmentAssetsPath = "/v3/sal_integration/enrichment/data_assets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationEnrichmentAssetsOptions model
    ListSalIntegrationEnrichmentAssetsOptions listSalIntegrationEnrichmentAssetsOptionsModel = new ListSalIntegrationEnrichmentAssetsOptions.Builder()
      .projectId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationEnrichmentAssets() with a valid options model and verify the result
    Response<SalEnrichmentDataAssetCollection> response = watsonxDataService.listSalIntegrationEnrichmentAssets(listSalIntegrationEnrichmentAssetsOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentDataAssetCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationEnrichmentAssetsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the listSalIntegrationEnrichmentAssets operation with and without retries enabled
  @Test
  public void testListSalIntegrationEnrichmentAssetsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationEnrichmentAssetsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationEnrichmentAssetsWOptions();
  }

  // Test the listSalIntegrationEnrichmentAssets operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSalIntegrationEnrichmentAssetsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSalIntegrationEnrichmentAssets(null).execute();
  }

  // Test the getSalIntegrationEnrichmentAssetsById operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentAssetsByIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"attributes\": [\"attributes\"], \"id\": \"ee0383b9-dcab-4c1a-b03d-bf521837b6ed\", \"name\": \"newtable\", \"resource_key\": \"0000:0000:0000:0000:0000:FFFF:9EB0:04E2|31134|:/iceberg_data/new_schema/sampletable\", \"schema_name\": \"sampleschema\"}";
    String getSalIntegrationEnrichmentAssetsByIdPath = "/v3/sal_integration/enrichment/data_assets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationEnrichmentAssetsByIdOptions model
    GetSalIntegrationEnrichmentAssetsByIdOptions getSalIntegrationEnrichmentAssetsByIdOptionsModel = new GetSalIntegrationEnrichmentAssetsByIdOptions.Builder()
      .projectId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationEnrichmentAssetsById() with a valid options model and verify the result
    Response<SalEnrichmentDataAsset> response = watsonxDataService.getSalIntegrationEnrichmentAssetsById(getSalIntegrationEnrichmentAssetsByIdOptionsModel).execute();
    assertNotNull(response);
    SalEnrichmentDataAsset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationEnrichmentAssetsByIdPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the getSalIntegrationEnrichmentAssetsById operation with and without retries enabled
  @Test
  public void testGetSalIntegrationEnrichmentAssetsByIdWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationEnrichmentAssetsByIdWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationEnrichmentAssetsByIdWOptions();
  }

  // Test the getSalIntegrationEnrichmentAssetsById operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationEnrichmentAssetsByIdNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationEnrichmentAssetsById(null).execute();
  }

  // Test the getSalIntegrationEnrichmentGlobalSettings operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationEnrichmentGlobalSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"expansion\": {\"description\": true, \"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name\": true, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"class_based_assignments\": false, \"evaluate_negative_assignments\": false, \"llm_based_assignments\": false, \"ml_based_assignments_custom\": false, \"ml_based_assignments_default\": false, \"name_matching\": false, \"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String getSalIntegrationEnrichmentGlobalSettingsPath = "/v3/sal_integration/enrichment/global_settings";
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
    String mockResponseBody = "{\"expansion\": {\"description\": true, \"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name\": true, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"class_based_assignments\": false, \"evaluate_negative_assignments\": false, \"llm_based_assignments\": false, \"ml_based_assignments_custom\": false, \"ml_based_assignments_default\": false, \"name_matching\": false, \"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String replaceSalIntegrationEnrichmentGlobalSettingsPath = "/v3/sal_integration/enrichment/global_settings";
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
      .description(true)
      .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
      .name(true)
      .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
      .build();

    // Construct an instance of the SalEnrichmentSettingsTermAssignment model
    SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignmentModel = new SalEnrichmentSettingsTermAssignment.Builder()
      .classBasedAssignments(false)
      .evaluateNegativeAssignments(false)
      .llmBasedAssignments(false)
      .mlBasedAssignmentsCustom(false)
      .mlBasedAssignmentsDefault(false)
      .nameMatching(false)
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
    String listSalIntegrationEnrichmentJobsPath = "/v3/sal_integration/enrichment/jobs";
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
    String listSalIntegrationEnrichmentJobRunsPath = "/v3/sal_integration/enrichment/jobs/testString/runs";
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
    String getSalIntegrationEnrichmentJobRunLogsPath = "/v3/sal_integration/enrichment/jobs/testString/runs/testString/logs";
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
    String mockResponseBody = "{\"expansion\": {\"description\": true, \"description_configuration\": {\"assignment_threshold\": 0.14, \"suggestion_threshold\": 0.9}, \"name\": true, \"name_configuration\": {\"assignment_threshold\": 0.1, \"suggestion_threshold\": 0.1}}, \"term_assignment\": {\"class_based_assignments\": false, \"evaluate_negative_assignments\": false, \"llm_based_assignments\": false, \"ml_based_assignments_custom\": false, \"ml_based_assignments_default\": false, \"name_matching\": false, \"term_assignment_threshold\": 0.3, \"term_suggestion_threshold\": 0.4}}";
    String getSalIntegrationEnrichmentProjectSettingsPath = "/v3/sal_integration/enrichment/project_settings";
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
    String replaceSalIntegrationEnrichmentProjectSettingsPath = "/v3/sal_integration/enrichment/project_settings";
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
      .description(true)
      .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
      .name(true)
      .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
      .build();

    // Construct an instance of the SalEnrichmentSettingsTermAssignment model
    SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignmentModel = new SalEnrichmentSettingsTermAssignment.Builder()
      .classBasedAssignments(false)
      .evaluateNegativeAssignments(false)
      .llmBasedAssignments(false)
      .mlBasedAssignmentsCustom(false)
      .mlBasedAssignmentsDefault(false)
      .nameMatching(false)
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
    String getSalIntegrationGlossaryTermsPath = "/v3/sal_integration/glossary/terms";
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

  // Test the createSalIntegrationUploadGlossary operation with a valid options model parameter
  @Test
  public void testCreateSalIntegrationUploadGlossaryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\"}";
    String createSalIntegrationUploadGlossaryPath = "/v3/sal_integration/glossary/upload_processes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSalIntegrationUploadGlossaryOptions model
    CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptionsModel = new CreateSalIntegrationUploadGlossaryOptions.Builder()
      .replaceOption("all")
      .glossaryCsv(TestUtilities.createMockStream("This is a mock file."))
      .glossaryCsvContentType("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createSalIntegrationUploadGlossary() with a valid options model and verify the result
    Response<SalGlossaryUploadProcess> response = watsonxDataService.createSalIntegrationUploadGlossary(createSalIntegrationUploadGlossaryOptionsModel).execute();
    assertNotNull(response);
    SalGlossaryUploadProcess responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSalIntegrationUploadGlossaryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSalIntegrationUploadGlossary operation with and without retries enabled
  @Test
  public void testCreateSalIntegrationUploadGlossaryWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSalIntegrationUploadGlossaryWOptions();

    watsonxDataService.disableRetries();
    testCreateSalIntegrationUploadGlossaryWOptions();
  }

  // Test the createSalIntegrationUploadGlossary operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSalIntegrationUploadGlossaryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSalIntegrationUploadGlossary(null).execute();
  }

  // Test the getSalIntegrationUploadGlossaryStatus operation with a valid options model parameter
  @Test
  public void testGetSalIntegrationUploadGlossaryStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": \"completed\"}";
    String getSalIntegrationUploadGlossaryStatusPath = "/v3/sal_integration/glossary/upload_processes/testString/status";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSalIntegrationUploadGlossaryStatusOptions model
    GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptionsModel = new GetSalIntegrationUploadGlossaryStatusOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSalIntegrationUploadGlossaryStatus() with a valid options model and verify the result
    Response<SalGlossaryUploadStatus> response = watsonxDataService.getSalIntegrationUploadGlossaryStatus(getSalIntegrationUploadGlossaryStatusOptionsModel).execute();
    assertNotNull(response);
    SalGlossaryUploadStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSalIntegrationUploadGlossaryStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSalIntegrationUploadGlossaryStatus operation with and without retries enabled
  @Test
  public void testGetSalIntegrationUploadGlossaryStatusWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSalIntegrationUploadGlossaryStatusWOptions();

    watsonxDataService.disableRetries();
    testGetSalIntegrationUploadGlossaryStatusWOptions();
  }

  // Test the getSalIntegrationUploadGlossaryStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSalIntegrationUploadGlossaryStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSalIntegrationUploadGlossaryStatus(null).execute();
  }

  // Test the listSalIntegrationEnrichmentMappings operation with a valid options model parameter
  @Test
  public void testListSalIntegrationEnrichmentMappingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mappings\": [{\"wkc_catalog_id\": \"18b49d7a-9519-4539-8db5-ff080623c226\", \"wkc_project_id\": \"9519bd7a-9519-8db5-4539-ff080623c226\", \"wxd_catalog_name\": \"iceberg_data\", \"wxd_schema_name\": \"test_schema\"}], \"next\": \"g2wAAAABaANkACpkYmNvcmVAZGIxOC5ibS1jYy11cy1zb3V0aC0yOC5jbG91ZGFudC5uZXRsAAAAAm4EAAAAAKBuBAD___-vamwAAAACbQAAABQyMDI1LTA2LTExVDAyOjA0OjU1WmEAamo\"}";
    String listSalIntegrationEnrichmentMappingsPath = "/v3/sal_integration/mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSalIntegrationEnrichmentMappingsOptions model
    ListSalIntegrationEnrichmentMappingsOptions listSalIntegrationEnrichmentMappingsOptionsModel = new ListSalIntegrationEnrichmentMappingsOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .next("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSalIntegrationEnrichmentMappings() with a valid options model and verify the result
    Response<SalIntegrationMappings> response = watsonxDataService.listSalIntegrationEnrichmentMappings(listSalIntegrationEnrichmentMappingsOptionsModel).execute();
    assertNotNull(response);
    SalIntegrationMappings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSalIntegrationEnrichmentMappingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
    assertEquals(query.get("next"), "testString");
  }

  // Test the listSalIntegrationEnrichmentMappings operation with and without retries enabled
  @Test
  public void testListSalIntegrationEnrichmentMappingsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSalIntegrationEnrichmentMappingsWOptions();

    watsonxDataService.disableRetries();
    testListSalIntegrationEnrichmentMappingsWOptions();
  }

  // Test the listSemanticSearchQueries operation with a valid options model parameter
  @Test
  public void testListSemanticSearchQueriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"queries\": [{\"id\": \"1\", \"last_search_time\": \"2024-09-15T14:30:00.000Z\", \"results\": [{\"artifact_type\": \"data_asset\", \"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9\", \"catalog_name\": \"iceberg\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"matched_columns\": [{\"asset_id\": \"7f9d8270-496f-4bda-96b9-9891b35c80e9:customer_id\", \"description\": \"description\", \"highlight\": {\"mapKey\": [\"inner\"]}, \"name\": \"customer_id\", \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\"}], \"name\": \"table1\", \"path\": \"/iceberg/california_school/table1\", \"project_id\": \"b94b3f1c-3808-44d2-b7e6-4df8d5861950\", \"provider_type\": \"cams\", \"schema_name\": \"california_school\", \"search_score\": 11, \"semantic_description\": \"semanticDescription\", \"semantic_name\": \"semanticName\", \"state\": \"active\", \"table_name\": \"table1\", \"tags\": [\"tags\"], \"terms\": [\"terms\"]}], \"search_query\": \"catalog_table\"}]}";
    String listSemanticSearchQueriesPath = "/v3/sal_integration/semantic_search/queries";
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
    String createSemanticSearchQueriesPath = "/v3/sal_integration/semantic_search/queries";
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
    String deleteSemanticSearchQueriesPath = "/v3/sal_integration/semantic_search/queries";
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
    String deleteSemanticSearchQueriesByIdPath = "/v3/sal_integration/semantic_search/queries/testString";
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
    String deleteSalMetadataPath = "/v3/sal_metadata";
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

  // Test the listIngestionJobs operation with a valid options model parameter
  @Test
  public void testListIngestionJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 0, \"offset\": 0, \"total_count\": 0, \"jobs\": [{\"instance_id\": \"instanceId\", \"job_id\": \"jobId\", \"application_id\": \"applicationId\", \"username\": \"username\", \"start_timestamp\": \"2019-01-01T12:00:00.000Z\", \"end_timestamp\": \"2019-01-01T12:00:00.000Z\", \"status\": \"status\", \"source_data_files\": \"sourceDataFiles\", \"target_table\": \"targetTable\", \"details\": \"details\", \"engine_logs\": \"engineLogs\", \"engine_id\": \"engineId\", \"engine_name\": \"engineName\", \"partition_by\": \"column1,column2\", \"is_new_schema\": false, \"is_new_table\": false}], \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}}";
    String listIngestionJobsPath = "/v3/lhingestion/api/v1/ingestion/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListIngestionJobsOptions model
    ListIngestionJobsOptions listIngestionJobsOptionsModel = new ListIngestionJobsOptions.Builder()
      .authInstanceId("testString")
      .start("testString")
      .limit(Long.valueOf("10"))
      .build();

    // Invoke listIngestionJobs() with a valid options model and verify the result
    Response<IngestionJobCollection> response = watsonxDataService.listIngestionJobs(listIngestionJobsOptionsModel).execute();
    assertNotNull(response);
    IngestionJobCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listIngestionJobsPath);
    // Verify header parameters
    assertEquals(request.getHeader("Authinstanceid"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the listIngestionJobs operation with and without retries enabled
  @Test
  public void testListIngestionJobsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListIngestionJobsWOptions();

    watsonxDataService.disableRetries();
    testListIngestionJobsWOptions();
  }

  // Test the listIngestionJobs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListIngestionJobsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listIngestionJobs(null).execute();
  }

  // Test the listIngestionJobs operation using the IngestionJobsPager.getNext() method
  @Test
  public void testListIngestionJobsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?start=1\"},\"total_count\":2,\"jobs\":[{\"instance_id\":\"instanceId\",\"job_id\":\"jobId\",\"application_id\":\"applicationId\",\"username\":\"username\",\"start_timestamp\":\"2019-01-01T12:00:00.000Z\",\"end_timestamp\":\"2019-01-01T12:00:00.000Z\",\"status\":\"status\",\"source_data_files\":\"sourceDataFiles\",\"target_table\":\"targetTable\",\"details\":\"details\",\"engine_logs\":\"engineLogs\",\"engine_id\":\"engineId\",\"engine_name\":\"engineName\",\"partition_by\":\"column1,column2\",\"is_new_schema\":false,\"is_new_table\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"instance_id\":\"instanceId\",\"job_id\":\"jobId\",\"application_id\":\"applicationId\",\"username\":\"username\",\"start_timestamp\":\"2019-01-01T12:00:00.000Z\",\"end_timestamp\":\"2019-01-01T12:00:00.000Z\",\"status\":\"status\",\"source_data_files\":\"sourceDataFiles\",\"target_table\":\"targetTable\",\"details\":\"details\",\"engine_logs\":\"engineLogs\",\"engine_id\":\"engineId\",\"engine_name\":\"engineName\",\"partition_by\":\"column1,column2\",\"is_new_schema\":false,\"is_new_table\":false}],\"limit\":1}";
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

    ListIngestionJobsOptions listIngestionJobsOptions = new ListIngestionJobsOptions.Builder()
      .authInstanceId("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<IngestionJob> allResults = new ArrayList<>();
    IngestionJobsPager pager = new IngestionJobsPager(watsonxDataService, listIngestionJobsOptions);
    while (pager.hasNext()) {
      List<IngestionJob> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listIngestionJobs operation using the IngestionJobsPager.getAll() method
  @Test
  public void testListIngestionJobsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?start=1\"},\"total_count\":2,\"jobs\":[{\"instance_id\":\"instanceId\",\"job_id\":\"jobId\",\"application_id\":\"applicationId\",\"username\":\"username\",\"start_timestamp\":\"2019-01-01T12:00:00.000Z\",\"end_timestamp\":\"2019-01-01T12:00:00.000Z\",\"status\":\"status\",\"source_data_files\":\"sourceDataFiles\",\"target_table\":\"targetTable\",\"details\":\"details\",\"engine_logs\":\"engineLogs\",\"engine_id\":\"engineId\",\"engine_name\":\"engineName\",\"partition_by\":\"column1,column2\",\"is_new_schema\":false,\"is_new_table\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"instance_id\":\"instanceId\",\"job_id\":\"jobId\",\"application_id\":\"applicationId\",\"username\":\"username\",\"start_timestamp\":\"2019-01-01T12:00:00.000Z\",\"end_timestamp\":\"2019-01-01T12:00:00.000Z\",\"status\":\"status\",\"source_data_files\":\"sourceDataFiles\",\"target_table\":\"targetTable\",\"details\":\"details\",\"engine_logs\":\"engineLogs\",\"engine_id\":\"engineId\",\"engine_name\":\"engineName\",\"partition_by\":\"column1,column2\",\"is_new_schema\":false,\"is_new_table\":false}],\"limit\":1}";
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

    ListIngestionJobsOptions listIngestionJobsOptions = new ListIngestionJobsOptions.Builder()
      .authInstanceId("testString")
      .limit(Long.valueOf("10"))
      .build();

    IngestionJobsPager pager = new IngestionJobsPager(watsonxDataService, listIngestionJobsOptions);
    List<IngestionJob> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createIngestionJob operation with a valid options model parameter
  @Test
  public void testCreateIngestionJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"instance_id\": \"instanceId\", \"job_id\": \"jobId\", \"application_id\": \"applicationId\", \"username\": \"username\", \"start_timestamp\": \"2019-01-01T12:00:00.000Z\", \"end_timestamp\": \"2019-01-01T12:00:00.000Z\", \"status\": \"status\", \"source_data_files\": \"sourceDataFiles\", \"target_table\": \"targetTable\", \"details\": \"details\", \"engine_logs\": \"engineLogs\", \"engine_id\": \"engineId\", \"engine_name\": \"engineName\", \"partition_by\": \"column1,column2\", \"is_new_schema\": false, \"is_new_table\": false}";
    String createIngestionJobPath = "/v3/lhingestion/api/v1/ingestion/jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SchemaTransformation model
    SchemaTransformation schemaTransformationModel = new SchemaTransformation.Builder()
      .oldColumn("old_column_name")
      .newColumn("new_column_name")
      .newType("string")
      .build();

    // Construct an instance of the BucketDetails model
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("testString")
      .accountName("testString")
      .applicationId("testString")
      .containerName("testString")
      .directoryId("testString")
      .endpoint("testString")
      .region("testString")
      .secretKey("testString")
      .authMode("aws_assume_role")
      .roleArn("testString")
      .managedBy("testString")
      .name("testString")
      .type("adls_gen1")
      .build();

    // Construct an instance of the IcebergSourceTable model
    IcebergSourceTable icebergSourceTableModel = new IcebergSourceTable.Builder()
      .schemaName("testString")
      .tableName("testString")
      .catalogName("testString")
      .warehouseName("testString")
      .snapshotId(Long.valueOf("0"))
      .build();

    // Construct an instance of the DbConnectionModel model
    DbConnectionModel dbConnectionModelModel = new DbConnectionModel.Builder()
      .databaseId("testString")
      .dbType("testString")
      .host("testString")
      .port("testString")
      .dbName("testString")
      .dbUsername("testString")
      .password("testString")
      .authenticationValue("testString")
      .isSsl(false)
      .certExtension("testString")
      .certContent("testString")
      .connectionMode("testString")
      .connectionModeValue("testString")
      .jdbcUrl("testString")
      .build();

    // Construct an instance of the FileFormatProperties model
    FileFormatProperties fileFormatPropertiesModel = new FileFormatProperties.Builder()
      .encoding("testString")
      .escapeCharacter("testString")
      .fieldDelimiter("testString")
      .header(true)
      .lineDelimiter("testString")
      .build();

    // Construct an instance of the SourceDetails model
    SourceDetails sourceDetailsModel = new SourceDetails.Builder()
      .filePaths("testString")
      .fileType("csv")
      .sourceType("STORAGE")
      .schemaTransformations(java.util.Arrays.asList(schemaTransformationModel))
      .schemaName("testString")
      .tableName("testString")
      .bucketDetails(bucketDetailsModel)
      .icebergSourceTable(icebergSourceTableModel)
      .sourceDatabase(dbConnectionModelModel)
      .fileFormatProperties(fileFormatPropertiesModel)
      .isLocalIngestion(false)
      .build();

    // Construct an instance of the TargetDetails model
    TargetDetails targetDetailsModel = new TargetDetails.Builder()
      .catalog("testString")
      .schema("testString")
      .table("testString")
      .writeMode("testString")
      .mergeOnRead(false)
      .schemaMode("testString")
      .schemaInfer(true)
      .catalogUri("testString")
      .bucketDetails(bucketDetailsModel)
      .location("testString")
      .isNewSchema(false)
      .isNewTable(false)
      .build();

    // Construct an instance of the ExecuteConfig model
    ExecuteConfig executeConfigModel = new ExecuteConfig.Builder()
      .driverMemory("testString")
      .driverCores(Long.valueOf("1"))
      .executorMemory("testString")
      .executorCores(Long.valueOf("1"))
      .numExecutors(Long.valueOf("1"))
      .build();

    // Construct an instance of the IngestionEngine model
    IngestionEngine ingestionEngineModel = new IngestionEngine.Builder()
      .engineId("testString")
      .name("testString")
      .endpoint("testString")
      .origin("testString")
      .executeConfig(executeConfigModel)
      .bucketDetails(bucketDetailsModel)
      .logPath("testString")
      .build();

    // Construct an instance of the CapacityDetails model
    CapacityDetails capacityDetailsModel = new CapacityDetails.Builder()
      .id("6f51248a-4cda-459a-b141-eb9b76bb6689")
      .build();

    // Construct an instance of the CreateIngestionJobOptions model
    CreateIngestionJobOptions createIngestionJobOptionsModel = new CreateIngestionJobOptions.Builder()
      .authInstanceId("testString")
      .id("testString")
      .source(sourceDetailsModel)
      .target(targetDetailsModel)
      .engine(ingestionEngineModel)
      .engineId("spark123")
      .executeConfig(executeConfigModel)
      .sourceIcebergTable(icebergSourceTableModel)
      .partitionBy("column1,column2")
      .capacity(capacityDetailsModel)
      .build();

    // Invoke createIngestionJob() with a valid options model and verify the result
    Response<IngestionJob> response = watsonxDataService.createIngestionJob(createIngestionJobOptionsModel).execute();
    assertNotNull(response);
    IngestionJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createIngestionJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Authinstanceid"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createIngestionJob operation with and without retries enabled
  @Test
  public void testCreateIngestionJobWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateIngestionJobWOptions();

    watsonxDataService.disableRetries();
    testCreateIngestionJobWOptions();
  }

  // Test the createIngestionJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIngestionJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createIngestionJob(null).execute();
  }

  // Test the getIngestionJob operation with a valid options model parameter
  @Test
  public void testGetIngestionJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"instance_id\": \"instanceId\", \"job_id\": \"jobId\", \"application_id\": \"applicationId\", \"username\": \"username\", \"start_timestamp\": \"2019-01-01T12:00:00.000Z\", \"end_timestamp\": \"2019-01-01T12:00:00.000Z\", \"status\": \"status\", \"source_data_files\": \"sourceDataFiles\", \"target_table\": \"targetTable\", \"details\": \"details\", \"engine_logs\": \"engineLogs\", \"engine_id\": \"engineId\", \"engine_name\": \"engineName\", \"partition_by\": \"column1,column2\", \"is_new_schema\": false, \"is_new_table\": false}";
    String getIngestionJobPath = "/v3/lhingestion/api/v1/ingestion/jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetIngestionJobOptions model
    GetIngestionJobOptions getIngestionJobOptionsModel = new GetIngestionJobOptions.Builder()
      .authInstanceId("testString")
      .id("testString")
      .build();

    // Invoke getIngestionJob() with a valid options model and verify the result
    Response<IngestionJob> response = watsonxDataService.getIngestionJob(getIngestionJobOptionsModel).execute();
    assertNotNull(response);
    IngestionJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIngestionJobPath);
    // Verify header parameters
    assertEquals(request.getHeader("Authinstanceid"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getIngestionJob operation with and without retries enabled
  @Test
  public void testGetIngestionJobWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetIngestionJobWOptions();

    watsonxDataService.disableRetries();
    testGetIngestionJobWOptions();
  }

  // Test the getIngestionJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetIngestionJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getIngestionJob(null).execute();
  }

  // Test the listResourceAccessPolicies operation with a valid options model parameter
  @Test
  public void testListResourceAccessPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_policies\": [{\"metadata\": {\"created_at\": \"2025-08-05T12:34:56.000Z\", \"created_by\": \"creator\", \"last_modified_at\": \"2025-08-05T12:34:56.000Z\", \"last_modified_by\": \"modifier\"}, \"permissions\": [{\"action\": \"can_administer\", \"permission_type\": \"explicit\"}], \"resource\": {\"id\": \"presto01\", \"name\": \"hive_data\", \"type\": \"presto\"}, \"state\": \"active\", \"subject\": {\"type\": \"user\", \"value\": \"user1\"}}], \"account_id\": \"accountId\", \"instance_id\": \"instanceId\", \"limit\": 20, \"offset\": 2, \"total_count\": 200}";
    String listResourceAccessPoliciesPath = "/v1/access/access_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListResourceAccessPoliciesOptions model
    ListResourceAccessPoliciesOptions listResourceAccessPoliciesOptionsModel = new ListResourceAccessPoliciesOptions.Builder()
      .authInstanceId("testString")
      .resourceType("catalog")
      .resourceId(java.util.Arrays.asList("testString"))
      .resourceName(java.util.Arrays.asList("testString"))
      .build();

    // Invoke listResourceAccessPolicies() with a valid options model and verify the result
    Response<AccessPolicies> response = watsonxDataService.listResourceAccessPolicies(listResourceAccessPoliciesOptionsModel).execute();
    assertNotNull(response);
    AccessPolicies responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceAccessPoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("resource_type"), "catalog");
    assertEquals(query.get("resource_id"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("resource_name"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
  }

  // Test the listResourceAccessPolicies operation with and without retries enabled
  @Test
  public void testListResourceAccessPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListResourceAccessPoliciesWOptions();

    watsonxDataService.disableRetries();
    testListResourceAccessPoliciesWOptions();
  }

  // Test the bulkUpdateResourceAccessPolicies operation with a valid options model parameter
  @Test
  public void testBulkUpdateResourceAccessPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_policies\": [{\"metadata\": {\"created_at\": \"2025-08-05T12:34:56.000Z\", \"created_by\": \"creator\", \"last_modified_at\": \"2025-08-05T12:34:56.000Z\", \"last_modified_by\": \"modifier\"}, \"permissions\": [{\"action\": \"can_administer\", \"permission_type\": \"explicit\"}], \"resource\": {\"id\": \"presto01\", \"name\": \"hive_data\", \"type\": \"presto\"}, \"state\": \"active\", \"subject\": {\"type\": \"user\", \"value\": \"user1\"}}], \"account_id\": \"accountId\", \"instance_id\": \"instanceId\"}";
    String bulkUpdateResourceAccessPoliciesPath = "/v1/access/access_policies/bulk_update";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourceDetailsBulkUpdate model
    ResourceDetailsBulkUpdate resourceDetailsBulkUpdateModel = new ResourceDetailsBulkUpdate.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();

    // Construct an instance of the Subject model
    Subject subjectModel = new Subject.Builder()
      .type("user")
      .value("user1")
      .build();

    // Construct an instance of the SubjectBulkUpdate model
    SubjectBulkUpdate subjectBulkUpdateModel = new SubjectBulkUpdate.Builder()
      .permissions(java.util.Arrays.asList("testString"))
      .subject(subjectModel)
      .build();

    // Construct an instance of the AccessPolicyBulkUpdate model
    AccessPolicyBulkUpdate accessPolicyBulkUpdateModel = new AccessPolicyBulkUpdate.Builder()
      .resources(java.util.Arrays.asList(resourceDetailsBulkUpdateModel))
      .subjects(java.util.Arrays.asList(subjectBulkUpdateModel))
      .build();

    // Construct an instance of the BulkUpdateResourceAccessPoliciesOptions model
    BulkUpdateResourceAccessPoliciesOptions bulkUpdateResourceAccessPoliciesOptionsModel = new BulkUpdateResourceAccessPoliciesOptions.Builder()
      .accessPolicies(java.util.Arrays.asList(accessPolicyBulkUpdateModel))
      .authInstanceId("testString")
      .build();

    // Invoke bulkUpdateResourceAccessPolicies() with a valid options model and verify the result
    Response<AccessPolicyBulkUpdateResponse> response = watsonxDataService.bulkUpdateResourceAccessPolicies(bulkUpdateResourceAccessPoliciesOptionsModel).execute();
    assertNotNull(response);
    AccessPolicyBulkUpdateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, bulkUpdateResourceAccessPoliciesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the bulkUpdateResourceAccessPolicies operation with and without retries enabled
  @Test
  public void testBulkUpdateResourceAccessPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testBulkUpdateResourceAccessPoliciesWOptions();

    watsonxDataService.disableRetries();
    testBulkUpdateResourceAccessPoliciesWOptions();
  }

  // Test the revokeResourceAccessPolicies operation with a valid options model parameter
  @Test
  public void testRevokeResourceAccessPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String revokeResourceAccessPoliciesPath = "/v1/access/access_policies/revoke";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourceDetails model
    ResourceDetails resourceDetailsModel = new ResourceDetails.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();

    // Construct an instance of the Subject model
    Subject subjectModel = new Subject.Builder()
      .type("user")
      .value("user1")
      .build();

    // Construct an instance of the SubjectRevoke model
    SubjectRevoke subjectRevokeModel = new SubjectRevoke.Builder()
      .permissions(java.util.Arrays.asList("testString"))
      .subject(subjectModel)
      .build();

    // Construct an instance of the RevokeResourceAccessPoliciesOptions model
    RevokeResourceAccessPoliciesOptions revokeResourceAccessPoliciesOptionsModel = new RevokeResourceAccessPoliciesOptions.Builder()
      .resources(java.util.Arrays.asList(resourceDetailsModel))
      .subjects(java.util.Arrays.asList(subjectRevokeModel))
      .authInstanceId("testString")
      .build();

    // Invoke revokeResourceAccessPolicies() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.revokeResourceAccessPolicies(revokeResourceAccessPoliciesOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, revokeResourceAccessPoliciesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the revokeResourceAccessPolicies operation with and without retries enabled
  @Test
  public void testRevokeResourceAccessPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRevokeResourceAccessPoliciesWOptions();

    watsonxDataService.disableRetries();
    testRevokeResourceAccessPoliciesWOptions();
  }

  // Test the filterResourceAccessPoliciesOnUsersAndUsergroups operation with a valid options model parameter
  @Test
  public void testFilterResourceAccessPoliciesOnUsersAndUsergroupsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_policies\": [{\"metadata\": {\"created_at\": \"2025-08-05T12:34:56.000Z\", \"created_by\": \"creator\", \"last_modified_at\": \"2025-08-05T12:34:56.000Z\", \"last_modified_by\": \"modifier\"}, \"permissions\": [{\"action\": \"can_administer\", \"permission_type\": \"explicit\"}], \"resource\": {\"id\": \"presto01\", \"name\": \"hive_data\", \"type\": \"presto\"}, \"state\": \"active\", \"subject\": {\"type\": \"user\", \"value\": \"user1\"}}], \"account_id\": \"accountId\", \"instance_id\": \"instanceId\", \"limit\": 20, \"offset\": 2, \"total_count\": 200}";
    String filterResourceAccessPoliciesOnUsersAndUsergroupsPath = "/v1/access/advanced_policy_search";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourceDetails model
    ResourceDetails resourceDetailsModel = new ResourceDetails.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();

    // Construct an instance of the Subject model
    Subject subjectModel = new Subject.Builder()
      .type("user")
      .value("user1")
      .build();

    // Construct an instance of the AccessPoliciesSearch model
    AccessPoliciesSearch accessPoliciesSearchModel = new AccessPoliciesSearch.Builder()
      .resources(java.util.Arrays.asList(resourceDetailsModel))
      .subjectsToSearch(java.util.Arrays.asList(subjectModel))
      .build();

    // Construct an instance of the FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions model
    FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions filterResourceAccessPoliciesOnUsersAndUsergroupsOptionsModel = new FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions.Builder()
      .accessPoliciesSearch(java.util.Arrays.asList(accessPoliciesSearchModel))
      .authInstanceId("testString")
      .build();

    // Invoke filterResourceAccessPoliciesOnUsersAndUsergroups() with a valid options model and verify the result
    Response<AccessPolicies> response = watsonxDataService.filterResourceAccessPoliciesOnUsersAndUsergroups(filterResourceAccessPoliciesOnUsersAndUsergroupsOptionsModel).execute();
    assertNotNull(response);
    AccessPolicies responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, filterResourceAccessPoliciesOnUsersAndUsergroupsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the filterResourceAccessPoliciesOnUsersAndUsergroups operation with and without retries enabled
  @Test
  public void testFilterResourceAccessPoliciesOnUsersAndUsergroupsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testFilterResourceAccessPoliciesOnUsersAndUsergroupsWOptions();

    watsonxDataService.disableRetries();
    testFilterResourceAccessPoliciesOnUsersAndUsergroupsWOptions();
  }

  // Test the filterResourceAccessPoliciesOnUsersAndUsergroups operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFilterResourceAccessPoliciesOnUsersAndUsergroupsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.filterResourceAccessPoliciesOnUsersAndUsergroups(null).execute();
  }

  // Test the listDataPolicies operation with a valid options model parameter
  @Test
  public void testListDataPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_policies\": [{\"catalog_name\": \"catalog1\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"This is a data policy\", \"metadata\": {\"created_at\": \"timestamp\", \"creator\": \"creator\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"updated_at\": \"timestamp\", \"version\": \"version\"}, \"policy_name\": \"policy1\", \"resource_id\": \"services/milvus/milvus1\", \"rule_count\": 26, \"rules\": [{\"actions\": [\"actions\"], \"effect\": \"allow\", \"grantees\": [{\"key\": \"user_name\", \"type\": \"user_identity\", \"value\": \"user1\"}], \"transform_columns\": {\"mask_condition\": \"NIL\", \"mask_type\": \"mask_show_last_4\", \"mask_value\": \"NIL\"}, \"transform_rows\": {\"filter_condition\": \"NIL\", \"row_filter\": \"addr_country='US'\"}}], \"status\": \"active\"}], \"total_count\": 2}";
    String listDataPoliciesPath = "/v1/access/data_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataPoliciesOptions model
    ListDataPoliciesOptions listDataPoliciesOptionsModel = new ListDataPoliciesOptions.Builder()
      .authInstanceId("testString")
      .catalogName("testString")
      .resourceId("testString")
      .status("testString")
      .includeMetadata(true)
      .includeRules(true)
      .bucketName("testString")
      .serviceName("testString")
      .dataArtifact("testString")
      .build();

    // Invoke listDataPolicies() with a valid options model and verify the result
    Response<PolicyV2Collection> response = watsonxDataService.listDataPolicies(listDataPoliciesOptionsModel).execute();
    assertNotNull(response);
    PolicyV2Collection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataPoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("resource_id"), "testString");
    assertEquals(query.get("status"), "testString");
    assertEquals(Boolean.valueOf(query.get("include_metadata")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("include_rules")), Boolean.valueOf(true));
    assertEquals(query.get("bucket_name"), "testString");
    assertEquals(query.get("service_name"), "testString");
    assertEquals(query.get("data_artifact"), "testString");
  }

  // Test the listDataPolicies operation with and without retries enabled
  @Test
  public void testListDataPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDataPoliciesWOptions();

    watsonxDataService.disableRetries();
    testListDataPoliciesWOptions();
  }

  // Test the createDataPolicy operation with a valid options model parameter
  @Test
  public void testCreateDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_name\": \"catalog1\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"This is a data policy\", \"metadata\": {\"created_at\": \"timestamp\", \"creator\": \"creator\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"updated_at\": \"timestamp\", \"version\": \"version\"}, \"policy_name\": \"policy1\", \"resource_id\": \"services/milvus/milvus1\", \"rule_count\": 26, \"rules\": [{\"actions\": [\"actions\"], \"effect\": \"allow\", \"grantees\": [{\"key\": \"user_name\", \"type\": \"user_identity\", \"value\": \"user1\"}], \"transform_columns\": {\"mask_condition\": \"NIL\", \"mask_type\": \"mask_show_last_4\", \"mask_value\": \"NIL\"}, \"transform_rows\": {\"filter_condition\": \"NIL\", \"row_filter\": \"addr_country='US'\"}}], \"status\": \"active\"}";
    String createDataPolicyPath = "/v1/access/data_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RuleGrantee model
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .key("user_name")
      .type("user_identity")
      .value("user1")
      .build();

    // Construct an instance of the TransformColumnProperties model
    TransformColumnProperties transformColumnPropertiesModel = new TransformColumnProperties.Builder()
      .maskCondition("NIL")
      .maskType("mask_show_last_4")
      .maskValue("NIL")
      .build();

    // Construct an instance of the RowFilterProperties model
    RowFilterProperties rowFilterPropertiesModel = new RowFilterProperties.Builder()
      .filterCondition("NIL")
      .rowFilter("addr_country='US'")
      .build();

    // Construct an instance of the RuleV2 model
    RuleV2 ruleV2Model = new RuleV2.Builder()
      .actions(java.util.Arrays.asList("alter", "create"))
      .effect("allow")
      .grantees(java.util.Arrays.asList(ruleGranteeModel))
      .transformColumns(transformColumnPropertiesModel)
      .transformRows(rowFilterPropertiesModel)
      .build();

    // Construct an instance of the CreateDataPolicyOptions model
    CreateDataPolicyOptions createDataPolicyOptionsModel = new CreateDataPolicyOptions.Builder()
      .dataArtifact("schema1/table1/(column1|column2)")
      .rules(java.util.Arrays.asList(ruleV2Model))
      .catalogName("catalog1")
      .catalogType("catalog1")
      .description("policy description")
      .policyName("policy1")
      .resourceId("catalog1")
      .status("active")
      .authInstanceId("testString")
      .build();

    // Invoke createDataPolicy() with a valid options model and verify the result
    Response<PolicyV2> response = watsonxDataService.createDataPolicy(createDataPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyV2 responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataPolicy operation with and without retries enabled
  @Test
  public void testCreateDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testCreateDataPolicyWOptions();
  }

  // Test the createDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDataPolicy(null).execute();
  }

  // Test the deleteDataPolicies operation with a valid options model parameter
  @Test
  public void testDeleteDataPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataPoliciesPath = "/v1/access/data_policies";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataPoliciesOptions model
    DeleteDataPoliciesOptions deleteDataPoliciesOptionsModel = new DeleteDataPoliciesOptions.Builder()
      .authInstanceId("testString")
      .policies("testString")
      .build();

    // Invoke deleteDataPolicies() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDataPolicies(deleteDataPoliciesOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataPoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("policies"), "testString");
  }

  // Test the deleteDataPolicies operation with and without retries enabled
  @Test
  public void testDeleteDataPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDataPoliciesWOptions();

    watsonxDataService.disableRetries();
    testDeleteDataPoliciesWOptions();
  }

  // Test the getDataPolicy operation with a valid options model parameter
  @Test
  public void testGetDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_name\": \"catalog1\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"This is a data policy\", \"metadata\": {\"created_at\": \"timestamp\", \"creator\": \"creator\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"updated_at\": \"timestamp\", \"version\": \"version\"}, \"policy_name\": \"policy1\", \"resource_id\": \"services/milvus/milvus1\", \"rule_count\": 26, \"rules\": [{\"actions\": [\"actions\"], \"effect\": \"allow\", \"grantees\": [{\"key\": \"user_name\", \"type\": \"user_identity\", \"value\": \"user1\"}], \"transform_columns\": {\"mask_condition\": \"NIL\", \"mask_type\": \"mask_show_last_4\", \"mask_value\": \"NIL\"}, \"transform_rows\": {\"filter_condition\": \"NIL\", \"row_filter\": \"addr_country='US'\"}}], \"status\": \"active\"}";
    String getDataPolicyPath = "/v1/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataPolicyOptions model
    GetDataPolicyOptions getDataPolicyOptionsModel = new GetDataPolicyOptions.Builder()
      .name("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDataPolicy() with a valid options model and verify the result
    Response<PolicyV2> response = watsonxDataService.getDataPolicy(getDataPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyV2 responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataPolicy operation with and without retries enabled
  @Test
  public void testGetDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testGetDataPolicyWOptions();
  }

  // Test the getDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDataPolicy(null).execute();
  }

  // Test the replaceDataPolicy operation with a valid options model parameter
  @Test
  public void testReplaceDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_name\": \"catalog1\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"This is a data policy\", \"metadata\": {\"created_at\": \"timestamp\", \"creator\": \"creator\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"updated_at\": \"timestamp\", \"version\": \"version\"}, \"policy_name\": \"policy1\", \"resource_id\": \"services/milvus/milvus1\", \"rule_count\": 26, \"rules\": [{\"actions\": [\"actions\"], \"effect\": \"allow\", \"grantees\": [{\"key\": \"user_name\", \"type\": \"user_identity\", \"value\": \"user1\"}], \"transform_columns\": {\"mask_condition\": \"NIL\", \"mask_type\": \"mask_show_last_4\", \"mask_value\": \"NIL\"}, \"transform_rows\": {\"filter_condition\": \"NIL\", \"row_filter\": \"addr_country='US'\"}}], \"status\": \"active\"}";
    String replaceDataPolicyPath = "/v1/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RuleGrantee model
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .key("user_name")
      .type("user_identity")
      .value("user1")
      .build();

    // Construct an instance of the TransformColumnProperties model
    TransformColumnProperties transformColumnPropertiesModel = new TransformColumnProperties.Builder()
      .maskCondition("NIL")
      .maskType("mask_show_last_4")
      .maskValue("NIL")
      .build();

    // Construct an instance of the RowFilterProperties model
    RowFilterProperties rowFilterPropertiesModel = new RowFilterProperties.Builder()
      .filterCondition("NIL")
      .rowFilter("addr_country='US'")
      .build();

    // Construct an instance of the RuleV2 model
    RuleV2 ruleV2Model = new RuleV2.Builder()
      .actions(java.util.Arrays.asList("alter", "create"))
      .effect("allow")
      .grantees(java.util.Arrays.asList(ruleGranteeModel))
      .transformColumns(transformColumnPropertiesModel)
      .transformRows(rowFilterPropertiesModel)
      .build();

    // Construct an instance of the ReplaceDataPolicyOptions model
    ReplaceDataPolicyOptions replaceDataPolicyOptionsModel = new ReplaceDataPolicyOptions.Builder()
      .name("testString")
      .dataArtifact("schema1/table1/(column1|column2)")
      .rules(java.util.Arrays.asList(ruleV2Model))
      .catalogName("catalog1")
      .catalogType("catalog1")
      .description("policy description")
      .policyName("policy1")
      .resourceId("catalog1")
      .status("active")
      .authInstanceId("testString")
      .build();

    // Invoke replaceDataPolicy() with a valid options model and verify the result
    Response<PolicyV2> response = watsonxDataService.replaceDataPolicy(replaceDataPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyV2 responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceDataPolicy operation with and without retries enabled
  @Test
  public void testReplaceDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testReplaceDataPolicyWOptions();
  }

  // Test the replaceDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceDataPolicy(null).execute();
  }

  // Test the deleteDataPolicy operation with a valid options model parameter
  @Test
  public void testDeleteDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataPolicyPath = "/v1/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataPolicyOptions model
    DeleteDataPolicyOptions deleteDataPolicyOptionsModel = new DeleteDataPolicyOptions.Builder()
      .name("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDataPolicy() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDataPolicy(deleteDataPolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDataPolicy operation with and without retries enabled
  @Test
  public void testDeleteDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testDeleteDataPolicyWOptions();
  }

  // Test the deleteDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDataPolicy(null).execute();
  }

  // Test the updateDataPolicy operation with a valid options model parameter
  @Test
  public void testUpdateDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_name\": \"catalog1\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"This is a data policy\", \"metadata\": {\"created_at\": \"timestamp\", \"creator\": \"creator\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"updated_at\": \"timestamp\", \"version\": \"version\"}, \"policy_name\": \"policy1\", \"resource_id\": \"services/milvus/milvus1\", \"rule_count\": 26, \"rules\": [{\"actions\": [\"actions\"], \"effect\": \"allow\", \"grantees\": [{\"key\": \"user_name\", \"type\": \"user_identity\", \"value\": \"user1\"}], \"transform_columns\": {\"mask_condition\": \"NIL\", \"mask_type\": \"mask_show_last_4\", \"mask_value\": \"NIL\"}, \"transform_rows\": {\"filter_condition\": \"NIL\", \"row_filter\": \"addr_country='US'\"}}], \"status\": \"active\"}";
    String updateDataPolicyPath = "/v1/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDataPolicyOptions model
    UpdateDataPolicyOptions updateDataPolicyOptionsModel = new UpdateDataPolicyOptions.Builder()
      .name("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateDataPolicy() with a valid options model and verify the result
    Response<PolicyV2> response = watsonxDataService.updateDataPolicy(updateDataPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyV2 responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDataPolicy operation with and without retries enabled
  @Test
  public void testUpdateDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testUpdateDataPolicyWOptions();
  }

  // Test the updateDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDataPolicy(null).execute();
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