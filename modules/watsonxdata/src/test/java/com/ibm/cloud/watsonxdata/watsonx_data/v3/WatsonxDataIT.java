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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.watsonx_data.test.SdkIntegrationTestBase;
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
    return "../../watsonx_data_v3.env";
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
  public void testCreateHdfsStorage() throws Exception {
    try {
      CreateHdfsStorageOptions createHdfsStorageOptions = new CreateHdfsStorageOptions.Builder()
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
  public void testListStorageRegistrations() throws Exception {
    try {
      ListStorageRegistrationsOptions listStorageRegistrationsOptions = new ListStorageRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<StorageRegistrationCollection> response = service.listStorageRegistrations(listStorageRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageRegistrationCollection storageRegistrationCollectionResult = response.getResult();
      assertNotNull(storageRegistrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListStorageRegistrations" })
  public void testCreateStorageRegistration() throws Exception {
    try {
      StorageCatalogPrototype storageCatalogPrototypeModel = new StorageCatalogPrototype.Builder()
        .basePath("/abc/def")
        .catalogName("sampleCatalog")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .catalogType("iceberg")
        .build();

      StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModel = new StorageDetailsAccesskeyVault.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

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

      CreateStorageRegistrationOptions createStorageRegistrationOptions = new CreateStorageRegistrationOptions.Builder()
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

      // Invoke operation
      Response<StorageRegistration> response = service.createStorageRegistration(createStorageRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      StorageRegistration storageRegistrationResult = response.getResult();
      assertNotNull(storageRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateStorageRegistration" })
  public void testGetStorageRegistration() throws Exception {
    try {
      GetStorageRegistrationOptions getStorageRegistrationOptions = new GetStorageRegistrationOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .skipMdsCall(false)
        .build();

      // Invoke operation
      Response<StorageRegistration> response = service.getStorageRegistration(getStorageRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageRegistration storageRegistrationResult = response.getResult();
      assertNotNull(storageRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetStorageRegistration" })
  public void testUpdateStorageRegistration() throws Exception {
    try {
      StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModel = new StorageDetailsAccesskeyVault.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

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

      StorageRegistrationPatch storageRegistrationPatchModel = new StorageRegistrationPatch.Builder()
        .connection(storageDetailsModel)
        .description("COS storage for customer data")
        .displayName("sample-storage-displayname")
        .systemStorageUpdateCredentials(true)
        .tags(java.util.Arrays.asList("teststorage", "userstorage"))
        .build();
      Map<String, Object> storageRegistrationPatchModelAsPatch = storageRegistrationPatchModel.asPatch();

      UpdateStorageRegistrationOptions updateStorageRegistrationOptions = new UpdateStorageRegistrationOptions.Builder()
        .id("testString")
        .body(storageRegistrationPatchModelAsPatch)
        .skipMdsCall(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<StorageRegistration> response = service.updateStorageRegistration(updateStorageRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageRegistration storageRegistrationResult = response.getResult();
      assertNotNull(storageRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateStorageRegistration" })
  public void testAddStorageCatalog() throws Exception {
    try {
      AddStorageCatalogOptions addStorageCatalogOptions = new AddStorageCatalogOptions.Builder()
        .storageId("testString")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .basePath("/abc/def")
        .catalogName("sampleCatalog")
        .catalogType("iceberg")
        .skipMdsCall(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.addStorageCatalog(addStorageCatalogOptions).execute();
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

  @Test(dependsOnMethods = { "testAddStorageCatalog" })
  public void testGetStorageObjectProperties() throws Exception {
    try {
      Path pathModel = new Path.Builder()
        .path("testString")
        .build();

      GetStorageObjectPropertiesOptions getStorageObjectPropertiesOptions = new GetStorageObjectPropertiesOptions.Builder()
        .storageId("testString")
        .paths(java.util.Arrays.asList(pathModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<StorageObjectProperties> response = service.getStorageObjectProperties(getStorageObjectPropertiesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      StorageObjectProperties storageObjectPropertiesResult = response.getResult();
      assertNotNull(storageObjectPropertiesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetStorageObjectProperties" })
  public void testListStorageRegistrationsObjects() throws Exception {
    try {
      ListStorageRegistrationsObjectsOptions listStorageRegistrationsObjectsOptions = new ListStorageRegistrationsObjectsOptions.Builder()
        .storageId("testString")
        .authInstanceId("testString")
        .path("testString")
        .paginated(true)
        .pageSize(Long.valueOf("1"))
        .prefix("testString")
        .startAfter("testString")
        .build();

      // Invoke operation
      Response<StorageRegistrationObjectCollection> response = service.listStorageRegistrationsObjects(listStorageRegistrationsObjectsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageRegistrationObjectCollection storageRegistrationObjectCollectionResult = response.getResult();
      assertNotNull(storageRegistrationObjectCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListStorageRegistrationsObjects" })
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

      SecretDetails secretDetailsModel = new SecretDetails.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

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

      DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions = new CreateDatabaseRegistrationOptions.Builder()
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
  public void testAddDatabaseCatalog() throws Exception {
    try {
      AddDatabaseCatalogOptions addDatabaseCatalogOptions = new AddDatabaseCatalogOptions.Builder()
        .databaseId("testString")
        .catalogName("sampleCatalog")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.addDatabaseCatalog(addDatabaseCatalogOptions).execute();
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

  @Test(dependsOnMethods = { "testAddDatabaseCatalog" })
  public void testGetDatabase() throws Exception {
    try {
      GetDatabaseOptions getDatabaseOptions = new GetDatabaseOptions.Builder()
        .id("testString")
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
        .password("samplepassword")
        .xProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
        .username("sampleuser")
        .build();

      DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
        .createdAt("1686792721")
        .fileContents("sample file content")
        .fileName("test.json")
        .schemaName("customer")
        .tableName("customer")
        .build();

      DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
        .createdAt("1686792721")
        .fileContents("sample file contents")
        .fileName("test.json")
        .topicName("customer")
        .build();

      DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
        .connection(databaseRegistrationPatchDatabaseDetailsModel)
        .description("External database description")
        .displayName("new_database")
        .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
        .build();
      Map<String, Object> databaseRegistrationPatchModelAsPatch = databaseRegistrationPatchModel.asPatch();

      UpdateDatabaseOptions updateDatabaseOptions = new UpdateDatabaseOptions.Builder()
        .id("testString")
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
      CoordinatorNodeDescriptionBody coordinatorNodeDescriptionBodyModel = new CoordinatorNodeDescriptionBody.Builder()
        .nodeType("starter")
        .quantity(Long.valueOf("1"))
        .build();

      WorkerNodeDescriptionBody workerNodeDescriptionBodyModel = new WorkerNodeDescriptionBody.Builder()
        .nodeType("starter")
        .quantity(Long.valueOf("1"))
        .build();

      AutoScalingConfig autoscalingConfigModel = new AutoScalingConfig.Builder()
        .type("cpu")
        .target(Long.valueOf("40"))
        .minWorkerQuantity(Long.valueOf("1"))
        .maxWorkerQuantity(Long.valueOf("18"))
        .queryTerminationGracePeriodMin(Long.valueOf("1"))
        .scaleInStabilizationWindowMin(Long.valueOf("5"))
        .scalingStepSize(Long.valueOf("1"))
        .build();

      EngineDetails engineDetailsModel = new EngineDetails.Builder()
        .coordinator(coordinatorNodeDescriptionBodyModel)
        .sizeConfig("starter")
        .worker(workerNodeDescriptionBodyModel)
        .autoscalingEnabled(true)
        .autoscalingConfig(autoscalingConfigModel)
        .build();

      CreatePrestoEngineOptions createPrestoEngineOptions = new CreatePrestoEngineOptions.Builder()
        .configuration(engineDetailsModel)
        .displayName("sampleEngine")
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .description("presto engine for running sql queries")
        .id("presto123")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
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
  public void testUpdatePrestoEngineAutoscaling() throws Exception {
    try {
      AutoScalingConfig autoScalingConfigModel = new AutoScalingConfig.Builder()
        .target(Long.valueOf("40"))
        .minWorkerQuantity(Long.valueOf("1"))
        .maxWorkerQuantity(Long.valueOf("1"))
        .queryTerminationGracePeriodMin(Long.valueOf("1"))
        .scaleInStabilizationWindowMin(Long.valueOf("5"))
        .scalingStepSize(Long.valueOf("1"))
        .build();

      UpdateAutoScalingRequest updateAutoScalingRequestModel = new UpdateAutoScalingRequest.Builder()
        .autoscalingConfig(autoScalingConfigModel)
        .build();
      Map<String, Object> updateAutoScalingRequestModelAsPatch = updateAutoScalingRequestModel.asPatch();

      UpdatePrestoEngineAutoscalingOptions updatePrestoEngineAutoscalingOptions = new UpdatePrestoEngineAutoscalingOptions.Builder()
        .engineId("testString")
        .updateAutoScalingRequestPatch(updateAutoScalingRequestModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PatchAutoscalingSuccess> response = service.updatePrestoEngineAutoscaling(updatePrestoEngineAutoscalingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PatchAutoscalingSuccess patchAutoscalingSuccessResult = response.getResult();
      assertNotNull(patchAutoscalingSuccessResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestoEngineAutoscaling" })
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
        .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
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
        .id("testString")
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
  public void testGetPrestoEngineConfig() throws Exception {
    try {
      GetPrestoEngineConfigOptions getPrestoEngineConfigOptions = new GetPrestoEngineConfigOptions.Builder()
        .engineId("presto860")
        .authInstanceId("crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::")
        .sections("catalog,configuration,jvm")
        .build();

      // Invoke operation
      Response<PrestoEnginePropertiesDetails> response = service.getPrestoEngineConfig(getPrestoEngineConfigOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEnginePropertiesDetails prestoEnginePropertiesDetailsResult = response.getResult();
      assertNotNull(prestoEnginePropertiesDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngineConfig" })
  public void testUpdatePrestoEngineConfig() throws Exception {
    try {
      CatalogProperties catalogPropertiesModel = new CatalogProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      ConfigurationProperties configurationPropertiesModel = new ConfigurationProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .build();

      JvmProperties jvmPropertiesModel = new JvmProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .build();

      LogConfigProperties logConfigPropertiesModel = new LogConfigProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "log_config_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
        .build();

      PrestoEngineProperties prestoEnginePropertiesModel = new PrestoEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", catalogPropertiesModel))
        .configuration(configurationPropertiesModel)
        .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
        .global(java.util.Collections.singletonMap("key1", "global_property_value"))
        .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
        .jvm(jvmPropertiesModel)
        .logConfig(logConfigPropertiesModel)
        .build();

      PrestoEnginePropertiesDetails prestoEnginePropertiesDetailsModel = new PrestoEnginePropertiesDetails.Builder()
        .engineProperties(prestoEnginePropertiesModel)
        .build();
      Map<String, Object> prestoEnginePropertiesDetailsModelAsPatch = prestoEnginePropertiesDetailsModel.asPatch();

      UpdatePrestoEngineConfigOptions updatePrestoEngineConfigOptions = new UpdatePrestoEngineConfigOptions.Builder()
        .engineId("presto93")
        .authInstanceId("crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::")
        .prestoEnginePropertiesDetailsPatch(prestoEnginePropertiesDetailsModelAsPatch)
        .build();

      // Invoke operation
      Response<Void> response = service.updatePrestoEngineConfig(updatePrestoEngineConfigOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestoEngineConfig" })
  public void testGetPrestoEngine() throws Exception {
    try {
      GetPrestoEngineOptions getPrestoEngineOptions = new GetPrestoEngineOptions.Builder()
        .id("testString")
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
      EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .build();

      EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .build();

      EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
        .build();

      EngineProperties enginePropertiesModel = new EngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(enginePropertiesConfigurationModel)
        .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
        .global(java.util.Collections.singletonMap("key1", "global_property_value"))
        .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
        .jvm(enginePropertiesJvmModel)
        .logConfig(enginePropertiesLogConfigModel)
        .build();

      RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(removeEnginePropertiesConfigurationModel)
        .eventListener(java.util.Arrays.asList("property_name"))
        .global(java.util.Arrays.asList("property_name"))
        .jmxExporterConfig(java.util.Arrays.asList("testString"))
        .jvm(removeEnginePropertiesJvmModel)
        .logConfig(removeEnginePropertiesLogConfigModel)
        .build();

      PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
        .description("updated description for presto engine")
        .displayName("sampleEngine")
        .xProperties(enginePropertiesModel)
        .removeEngineProperties(removeEnginePropertiesModel)
        .restartType("force")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestoEnginePatchModelAsPatch = prestoEnginePatchModel.asPatch();

      UpdatePrestoEngineOptions updatePrestoEngineOptions = new UpdatePrestoEngineOptions.Builder()
        .id("testString")
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
  public void testPausePrestoEngine() throws Exception {
    try {
      PausePrestoEngineOptions pausePrestoEngineOptions = new PausePrestoEngineOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineSuccessResponse> response = service.pausePrestoEngine(pausePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngineSuccessResponse prestoEngineSuccessResponseResult = response.getResult();
      assertNotNull(prestoEngineSuccessResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPausePrestoEngine" })
  public void testRunExplainStatement() throws Exception {
    try {
      RunExplainStatementOptions runExplainStatementOptions = new RunExplainStatementOptions.Builder()
        .id("testString")
        .statement("show schemas in catalog_name")
        .catalog("catalog_name")
        .format("json")
        .schema("schema_name")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoQueryExplain> response = service.runExplainStatement(runExplainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoQueryExplain prestoQueryExplainResult = response.getResult();
      assertNotNull(prestoQueryExplainResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainStatement" })
  public void testRunExplainAnalyzeStatement() throws Exception {
    try {
      RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptions = new RunExplainAnalyzeStatementOptions.Builder()
        .id("testString")
        .statement("show schemas in catalog_name")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoQueryExplain> response = service.runExplainAnalyzeStatement(runExplainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoQueryExplain prestoQueryExplainResult = response.getResult();
      assertNotNull(prestoQueryExplainResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainAnalyzeStatement" })
  public void testRestartPrestoEngine() throws Exception {
    try {
      RestartPrestoEngineOptions restartPrestoEngineOptions = new RestartPrestoEngineOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineSuccessResponse> response = service.restartPrestoEngine(restartPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngineSuccessResponse prestoEngineSuccessResponseResult = response.getResult();
      assertNotNull(prestoEngineSuccessResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRestartPrestoEngine" })
  public void testResumePrestoEngine() throws Exception {
    try {
      ResumePrestoEngineOptions resumePrestoEngineOptions = new ResumePrestoEngineOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineSuccessResponse> response = service.resumePrestoEngine(resumePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngineSuccessResponse prestoEngineSuccessResponseResult = response.getResult();
      assertNotNull(prestoEngineSuccessResponseResult);

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
        .quantity(Long.valueOf("1"))
        .build();

      ScalePrestoEngineOptions scalePrestoEngineOptions = new ScalePrestoEngineOptions.Builder()
        .id("testString")
        .coordinator(nodeDescriptionModel)
        .worker(nodeDescriptionModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineSuccessResponse> response = service.scalePrestoEngine(scalePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PrestoEngineSuccessResponse prestoEngineSuccessResponseResult = response.getResult();
      assertNotNull(prestoEngineSuccessResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testScalePrestoEngine" })
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
      NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("1"))
        .build();

      PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
        .coordinator(nodeDescriptionModel)
        .sizeConfig("starter")
        .worker(nodeDescriptionModel)
        .build();

      CreatePrestissimoEngineOptions createPrestissimoEngineOptions = new CreatePrestissimoEngineOptions.Builder()
        .configuration(prestissimoEngineDetailsModel)
        .displayName("sampleEngine")
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("hive_data"))
        .description("prestissimo engine description")
        .id("prestissimo123")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
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
  public void testGetPrestissimoEngineCatalog() throws Exception {
    try {
      GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptions = new GetPrestissimoEngineCatalogOptions.Builder()
        .engineId("testString")
        .id("testString")
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
  public void testGetPrestissimoEngine() throws Exception {
    try {
      GetPrestissimoEngineOptions getPrestissimoEngineOptions = new GetPrestissimoEngineOptions.Builder()
        .id("testString")
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
      PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(prestissimoEnginePropertiesConfigurationModel)
        .global(java.util.Collections.singletonMap("key1", "testString"))
        .jvm(prestissimoEnginePropertiesJvmModel)
        .logConfig(prestissimoEnginePropertiesLogConfigModel)
        .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
        .velox(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(removePrestissimoEnginePropertiesConfigurationModel)
        .global(java.util.Arrays.asList("testString"))
        .jvm(removePrestissimoEnginePropertiesJvmModel)
        .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
        .optimizerProperties(java.util.Arrays.asList("testString"))
        .velox(java.util.Arrays.asList("testString"))
        .build();

      PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
        .description("updated description for prestissimo engine")
        .displayName("sampleEngine")
        .xProperties(prestissimoEnginePropertiesModel)
        .removeEngineProperties(removePrestissimoEnginePropertiesModel)
        .restartType("force")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestissimoEnginePatchModelAsPatch = prestissimoEnginePatchModel.asPatch();

      UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions = new UpdatePrestissimoEngineOptions.Builder()
        .id("testString")
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
        .id("testString")
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
        .id("testString")
        .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.createPrestissimoEngineCatalogs(createPrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineCatalogs" })
  public void testPausePrestissimoEngine() throws Exception {
    try {
      PausePrestissimoEngineOptions pausePrestissimoEngineOptions = new PausePrestissimoEngineOptions.Builder()
        .id("testString")
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
        .id("testString")
        .statement("show schemas in catalog_name")
        .catalog("catalog_name")
        .format("json")
        .schema("schema_name")
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
        .id("testString")
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
        .id("testString")
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
        .id("testString")
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
      NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("1"))
        .build();

      ScalePrestissimoEngineOptions scalePrestissimoEngineOptions = new ScalePrestissimoEngineOptions.Builder()
        .id("testString")
        .coordinator(nodeDescriptionModel)
        .worker(nodeDescriptionModel)
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
        .configuration(db2EngineDetailsBodyModel)
        .displayName("sampleEngine")
        .origin("external")
        .description("db2 engine description")
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
        .displayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> db2EnginePatchModelAsPatch = db2EnginePatchModel.asPatch();

      UpdateDb2EngineOptions updateDb2EngineOptions = new UpdateDb2EngineOptions.Builder()
        .id("testString")
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
      OtherEngineConfigurationBody otherEngineConfigurationBodyModel = new OtherEngineConfigurationBody.Builder()
        .connectionString("1.2.3.4")
        .type("netezza")
        .build();

      CreateOtherEngineOptions createOtherEngineOptions = new CreateOtherEngineOptions.Builder()
        .configuration(otherEngineConfigurationBodyModel)
        .displayName("sampleEngine01")
        .origin("external")
        .description("external engine description")
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
      NetezzaEngineConfigurationBody netezzaEngineConfigurationBodyModel = new NetezzaEngineConfigurationBody.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateNetezzaEngineOptions createNetezzaEngineOptions = new CreateNetezzaEngineOptions.Builder()
        .configuration(netezzaEngineConfigurationBodyModel)
        .displayName("sampleEngine")
        .origin("external")
        .description("netezza engine description")
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
        .displayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> netezzaEnginePatchModelAsPatch = netezzaEnginePatchModel.asPatch();

      UpdateNetezzaEngineOptions updateNetezzaEngineOptions = new UpdateNetezzaEngineOptions.Builder()
        .id("testString")
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

      SparkEngineHome sparkEngineHomeModel = new SparkEngineHome.Builder()
        .path("spark/spark1234")
        .storageName("test-spark-storage")
        .volume("test-spark-volume")
        .volumeId("1704979825978585")
        .volumeName("my-volume")
        .build();

      SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
        .cores("1")
        .memory("4G")
        .build();

      SparkEngineResourceUtilisation sparkEngineResourceUtilisationModel = new SparkEngineResourceUtilisation.Builder()
        .cores("1m")
        .memory("4Gi")
        .build();

      SparkScaleConfig sparkScaleConfigModel = new SparkScaleConfig.Builder()
        .autoScaleEnabled(true)
        .currentNumberOfNodes(Long.valueOf("2"))
        .maximumNumberOfNodes(Long.valueOf("5"))
        .minimumNumberOfNodes(Long.valueOf("1"))
        .nodeType("medium")
        .numberOfNodes(Long.valueOf("2"))
        .build();

      SparkVscodeConfig sparkVscodeConfigModel = new SparkVscodeConfig.Builder()
        .crn("crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2")
        .environmentType("SaaS")
        .host("us-south.lakehouse.dev.cloud.ibm.com")
        .userName("user@example.com")
        .build();

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

      CreateSparkEngineOptions createSparkEngineOptions = new CreateSparkEngineOptions.Builder()
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
  public void testGetSparkEngineCatalog() throws Exception {
    try {
      GetSparkEngineCatalogOptions getSparkEngineCatalogOptions = new GetSparkEngineCatalogOptions.Builder()
        .engineId("testString")
        .id("testString")
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
  public void testGetSparkEngine() throws Exception {
    try {
      GetSparkEngineOptions getSparkEngineOptions = new GetSparkEngineOptions.Builder()
        .id("testString")
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
      SparkEngineHomePatch sparkEngineHomePatchModel = new SparkEngineHomePatch.Builder()
        .storageName("test-spark-storage")
        .build();

      SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
        .cores("1")
        .memory("4G")
        .build();

      SparkEnginePatchEngineDetails sparkEnginePatchEngineDetailsModel = new SparkEnginePatchEngineDetails.Builder()
        .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
        .defaultVersion("4.8.3")
        .engineHome(sparkEngineHomePatchModel)
        .resourceLimitEnabled(true)
        .resourceLimits(sparkEngineResourceLimitModel)
        .build();

      SparkEnginePatch sparkEnginePatchModel = new SparkEnginePatch.Builder()
        .configuration(sparkEnginePatchEngineDetailsModel)
        .description("updated description for spark engine")
        .displayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> sparkEnginePatchModelAsPatch = sparkEnginePatchModel.asPatch();

      UpdateSparkEngineOptions updateSparkEngineOptions = new UpdateSparkEngineOptions.Builder()
        .id("testString")
        .body(sparkEnginePatchModelAsPatch)
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
  public void testListSparkEngineCatalogs() throws Exception {
    try {
      ListSparkEngineCatalogsOptions listSparkEngineCatalogsOptions = new ListSparkEngineCatalogsOptions.Builder()
        .id("testString")
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
        .id("testString")
        .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.createSparkEngineCatalogs(createSparkEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CatalogCollection catalogCollectionResult = response.getResult();
      assertNotNull(catalogCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngineCatalogs" })
  public void testPauseSparkEngine() throws Exception {
    try {
      PauseSparkEngineOptions pauseSparkEngineOptions = new PauseSparkEngineOptions.Builder()
        .id("testString")
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
        .id("testString")
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
        .id("testString")
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
  public void testGetSparkEngineApplicationStatus() throws Exception {
    try {
      GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptions = new GetSparkEngineApplicationStatusOptions.Builder()
        .engineId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngineApplicationResponse> response = service.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationResponse sparkEngineApplicationResponseResult = response.getResult();
      assertNotNull(sparkEngineApplicationResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineApplicationStatus" })
  public void testGetSparkEngineApplicationUi() throws Exception {
    try {
      GetSparkEngineApplicationUiOptions getSparkEngineApplicationUiOptions = new GetSparkEngineApplicationUiOptions.Builder()
        .engineId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.getSparkEngineApplicationUi(getSparkEngineApplicationUiOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineApplicationUi" })
  public void testListSparkEngineApplications() throws Exception {
    try {
      ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions = new ListSparkEngineApplicationsOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .state(java.util.Arrays.asList("testString"))
        .submissionTimeInterval("testString")
        .startTimeInterval("testString")
        .endTimeInterval("testString")
        .limit(Long.valueOf("10"))
        .start("testString")
        .build();

      // Invoke operation
      Response<SparkEngineApplicationCollection> response = service.listSparkEngineApplications(listSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationCollection sparkEngineApplicationCollectionResult = response.getResult();
      assertNotNull(sparkEngineApplicationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineApplications" })
  public void testListSparkEngineApplicationsWithPager() throws Exception {
    try {
      ListSparkEngineApplicationsOptions options = new ListSparkEngineApplicationsOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .state(java.util.Arrays.asList("testString"))
        .submissionTimeInterval("testString")
        .startTimeInterval("testString")
        .endTimeInterval("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<SparkEngineApplicationSummary> allResults = new ArrayList<>();
      SparkEngineApplicationsPager pager = new SparkEngineApplicationsPager(service, options);
      while (pager.hasNext()) {
        List<SparkEngineApplicationSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new SparkEngineApplicationsPager(service, options);
      List<SparkEngineApplicationSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineApplications" })
  public void testCreateSparkEngineApplication() throws Exception {
    try {
      SparkApplicationRuntime sparkApplicationRuntimeModel = new SparkApplicationRuntime.Builder()
        .sparkVersion("3.4")
        .build();

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

      SparkEngineApplicationCallback sparkEngineApplicationCallbackModel = new SparkEngineApplicationCallback.Builder()
        .url("testString")
        .build();

      SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
        .mountPath("/mount/path")
        .name("my-volume")
        .readOnly(true)
        .sourceSubPath("/source/path")
        .build();

      CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions = new CreateSparkEngineApplicationOptions.Builder()
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

      // Invoke operation
      Response<SparkEngineApplicationSummary> response = service.createSparkEngineApplication(createSparkEngineApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationSummary sparkEngineApplicationSummaryResult = response.getResult();
      assertNotNull(sparkEngineApplicationSummaryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngineApplication" })
  public void testGetSparkEngineHistoryServer() throws Exception {
    try {
      GetSparkEngineHistoryServerOptions getSparkEngineHistoryServerOptions = new GetSparkEngineHistoryServerOptions.Builder()
        .id("testString")
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
        .id("testString")
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
  public void testGetSparkEngineHistoryServerUi() throws Exception {
    try {
      GetSparkEngineHistoryServerUiOptions getSparkEngineHistoryServerUiOptions = new GetSparkEngineHistoryServerUiOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.getSparkEngineHistoryServerUi(getSparkEngineHistoryServerUiOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineHistoryServerUi" })
  public void testValidateIntegration() throws Exception {
    try {
      Catalogs catalogsModel = new Catalogs.Builder()
        .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .build();

      ValidateIntegrationOptions validateIntegrationOptions = new ValidateIntegrationOptions.Builder()
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

      // Invoke operation
      Response<ValidateIntegration> response = service.validateIntegration(validateIntegrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ValidateIntegration validateIntegrationResult = response.getResult();
      assertNotNull(validateIntegrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testValidateIntegration" })
  public void testListAllIntegrations() throws Exception {
    try {
      ListAllIntegrationsOptions listAllIntegrationsOptions = new ListAllIntegrationsOptions.Builder()
        .authInstanceId("testString")
        .secret("testString")
        .type(java.util.Arrays.asList("testString"))
        .state(java.util.Arrays.asList("active"))
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
      Catalogs catalogsModel = new Catalogs.Builder()
        .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .build();

      CreateIntegrationOptions createIntegrationOptions = new CreateIntegrationOptions.Builder()
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
        .id("testString")
        .authInstanceId("testString")
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
      Catalogs catalogsModel = new Catalogs.Builder()
        .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .build();

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

      UpdateIntegrationOptions updateIntegrationOptions = new UpdateIntegrationOptions.Builder()
        .id("testString")
        .body(integrationPatchModelAsPatch)
        .authInstanceId("testString")
        .secret("testString")
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
  public void testRegisterTable() throws Exception {
    try {
      RegisterTableOptions registerTableOptions = new RegisterTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .metadataLocation("s3a://storagename/path/to/table/metadata_location/_delta_log")
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
  public void testListCatalogs() throws Exception {
    try {
      ListCatalogsOptions listCatalogsOptions = new ListCatalogsOptions.Builder()
        .authInstanceId("testString")
        .secret("testString")
        .defaultCatalogs(false)
        .view("testString")
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
  public void testGetCatalogEngineAssociation() throws Exception {
    try {
      GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptions = new GetCatalogEngineAssociationOptions.Builder()
        .catalogName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogEngineResponse> response = service.getCatalogEngineAssociation(getCatalogEngineAssociationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogEngineResponse catalogEngineResponseResult = response.getResult();
      assertNotNull(catalogEngineResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCatalogEngineAssociation" })
  public void testListTables() throws Exception {
    try {
      ListTablesOptions listTablesOptions = new ListTablesOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
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
        .name("updated_table_name")
        .build();
      Map<String, Object> tablePatchModelAsPatch = tablePatchModel.asPatch();

      UpdateTableOptions updateTableOptions = new UpdateTableOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
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
        .comment("Expenses column for each department")
        .extra("AUTO_INCREMENT")
        .length("30")
        .name("expenses")
        .precision("10")
        .scale("2")
        .type("varchar")
        .build();

      CreateColumnsOptions createColumnsOptions = new CreateColumnsOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
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
        .name("expenses")
        .build();
      Map<String, Object> columnPatchModelAsPatch = columnPatchModel.asPatch();

      UpdateColumnOptions updateColumnOptions = new UpdateColumnOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .columnName("testString")
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
  public void testRollbackTable() throws Exception {
    try {
      RollbackTableOptions rollbackTableOptions = new RollbackTableOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .snapshotId("12357647")
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponsePrototype> response = service.rollbackTable(rollbackTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponsePrototype successResponsePrototypeResult = response.getResult();
      assertNotNull(successResponsePrototypeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRollbackTable" })
  public void testListTableSnapshots() throws Exception {
    try {
      ListTableSnapshotsOptions listTableSnapshotsOptions = new ListTableSnapshotsOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .engineId("testString")
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
  public void testListSchemas() throws Exception {
    try {
      ListSchemasOptions listSchemasOptions = new ListSchemasOptions.Builder()
        .engineId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemasCollection> response = service.listSchemas(listSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchemasCollection schemasCollectionResult = response.getResult();
      assertNotNull(schemasCollectionResult);

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
        .id("testString")
        .customPath("sample-path")
        .name("SampleSchema1")
        .hostname("db2@hostname.com")
        .port(Long.valueOf("4553"))
        .storageName("sample-bucket")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemaPrototype> response = service.createSchema(createSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SchemaPrototype schemaPrototypeResult = response.getResult();
      assertNotNull(schemaPrototypeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSchema" })
  public void testUpdateSyncCatalog() throws Exception {
    try {
      UpdateSyncCatalogOptions updateSyncCatalogOptions = new UpdateSyncCatalogOptions.Builder()
        .id("testString")
        .autoAddNewTables(true)
        .registerNewTables(true)
        .syncExistingTables(true)
        .syncIcebergMd(true)
        .syncPath("sample-path")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponsePrototype> response = service.updateSyncCatalog(updateSyncCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponsePrototype successResponsePrototypeResult = response.getResult();
      assertNotNull(successResponsePrototypeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSyncCatalog" })
  public void testGetCatalog() throws Exception {
    try {
      GetCatalogOptions getCatalogOptions = new GetCatalogOptions.Builder()
        .name("testString")
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

      // Invoke operation
      Response<MilvusService> response = service.createMilvusService(createMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

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
        .id("testString")
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
        .displayName("sampleService")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> milvusServicePatchModelAsPatch = milvusServicePatchModel.asPatch();

      UpdateMilvusServiceOptions updateMilvusServiceOptions = new UpdateMilvusServiceOptions.Builder()
        .id("testString")
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
  public void testCreateMilvusServicePause() throws Exception {
    try {
      CreateMilvusServicePauseOptions createMilvusServicePauseOptions = new CreateMilvusServicePauseOptions.Builder()
        .id("testString")
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
        .id("testString")
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
  public void testListMilvusDatabasePartitions() throws Exception {
    try {
      ListMilvusDatabasePartitionsOptions listMilvusDatabasePartitionsOptions = new ListMilvusDatabasePartitionsOptions.Builder()
        .serviceId("testString")
        .databaseId("testString")
        .collectionName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusDatabasePartitions> response = service.listMilvusDatabasePartitions(listMilvusDatabasePartitionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusDatabasePartitions milvusDatabasePartitionsResult = response.getResult();
      assertNotNull(milvusDatabasePartitionsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMilvusDatabasePartitions" })
  public void testUpdateMilvusServiceBucket() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptions = new UpdateMilvusServiceBucketOptions.Builder()
        .serviceId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
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
        .apikey("67GveYtUdovRFEfnMLYP8x0S1b2mY1BkEGqBYbJK")
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
        .apikey("67GveYtUdovRFEfnMLYP8x0S1b2mY1BkEGqBYbJK")
        .engineId("presto-01")
        .build();
      Map<String, Object> salIntegrationPatchModelAsPatch = salIntegrationPatchModel.asPatch();

      UpdateSalIntegrationOptions updateSalIntegrationOptions = new UpdateSalIntegrationOptions.Builder()
        .salIntegrationPatch(salIntegrationPatchModelAsPatch)
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
        .schema("schema1")
        .tables(java.util.Arrays.asList("table1"))
        .build();

      CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions = new CreateSalIntegrationEnrichmentOptions.Builder()
        .changes(java.util.Arrays.asList(enrichmentObjModel))
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
  public void testListSalIntegrationEnrichmentAssets() throws Exception {
    try {
      ListSalIntegrationEnrichmentAssetsOptions listSalIntegrationEnrichmentAssetsOptions = new ListSalIntegrationEnrichmentAssetsOptions.Builder()
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentDataAssetCollection> response = service.listSalIntegrationEnrichmentAssets(listSalIntegrationEnrichmentAssetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentDataAssetCollection salEnrichmentDataAssetCollectionResult = response.getResult();
      assertNotNull(salEnrichmentDataAssetCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSalIntegrationEnrichmentAssets" })
  public void testGetSalIntegrationEnrichmentAssetsById() throws Exception {
    try {
      GetSalIntegrationEnrichmentAssetsByIdOptions getSalIntegrationEnrichmentAssetsByIdOptions = new GetSalIntegrationEnrichmentAssetsByIdOptions.Builder()
        .projectId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentDataAsset> response = service.getSalIntegrationEnrichmentAssetsById(getSalIntegrationEnrichmentAssetsByIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentDataAsset salEnrichmentDataAssetResult = response.getResult();
      assertNotNull(salEnrichmentDataAssetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentAssetsById" })
  public void testGetSalIntegrationEnrichmentGlobalSettings() throws Exception {
    try {
      GetSalIntegrationEnrichmentGlobalSettingsOptions getSalIntegrationEnrichmentGlobalSettingsOptions = new GetSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentSettings> response = service.getSalIntegrationEnrichmentGlobalSettings(getSalIntegrationEnrichmentGlobalSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentSettings salEnrichmentSettingsResult = response.getResult();
      assertNotNull(salEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentGlobalSettings" })
  public void testReplaceSalIntegrationEnrichmentGlobalSettings() throws Exception {
    try {
      SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfigurationModel = new SalEnrichmentSettingsExpansionDescriptionConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.14"))
        .suggestionThreshold(Double.valueOf("0.9"))
        .build();

      SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.1"))
        .suggestionThreshold(Double.valueOf("0.1"))
        .build();

      SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansionModel = new SalEnrichmentSettingsExpansion.Builder()
        .description(true)
        .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
        .name(true)
        .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
        .build();

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

      ReplaceSalIntegrationEnrichmentGlobalSettingsOptions replaceSalIntegrationEnrichmentGlobalSettingsOptions = new ReplaceSalIntegrationEnrichmentGlobalSettingsOptions.Builder()
        .expansion(salEnrichmentSettingsExpansionModel)
        .termAssignment(salEnrichmentSettingsTermAssignmentModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentSettings> response = service.replaceSalIntegrationEnrichmentGlobalSettings(replaceSalIntegrationEnrichmentGlobalSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentSettings salEnrichmentSettingsResult = response.getResult();
      assertNotNull(salEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceSalIntegrationEnrichmentGlobalSettings" })
  public void testListSalIntegrationEnrichmentJobs() throws Exception {
    try {
      ListSalIntegrationEnrichmentJobsOptions listSalIntegrationEnrichmentJobsOptions = new ListSalIntegrationEnrichmentJobsOptions.Builder()
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentJobs> response = service.listSalIntegrationEnrichmentJobs(listSalIntegrationEnrichmentJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentJobs salEnrichmentJobsResult = response.getResult();
      assertNotNull(salEnrichmentJobsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSalIntegrationEnrichmentJobs" })
  public void testListSalIntegrationEnrichmentJobRuns() throws Exception {
    try {
      ListSalIntegrationEnrichmentJobRunsOptions listSalIntegrationEnrichmentJobRunsOptions = new ListSalIntegrationEnrichmentJobRunsOptions.Builder()
        .jobId("testString")
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentJobRuns> response = service.listSalIntegrationEnrichmentJobRuns(listSalIntegrationEnrichmentJobRunsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentJobRuns salEnrichmentJobRunsResult = response.getResult();
      assertNotNull(salEnrichmentJobRunsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSalIntegrationEnrichmentJobRuns" })
  public void testGetSalIntegrationEnrichmentJobRunLogs() throws Exception {
    try {
      GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptions = new GetSalIntegrationEnrichmentJobRunLogsOptions.Builder()
        .jobId("testString")
        .runId("testString")
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentJobRunLogs> response = service.getSalIntegrationEnrichmentJobRunLogs(getSalIntegrationEnrichmentJobRunLogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentJobRunLogs salEnrichmentJobRunLogsResult = response.getResult();
      assertNotNull(salEnrichmentJobRunLogsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentJobRunLogs" })
  public void testGetSalIntegrationEnrichmentProjectSettings() throws Exception {
    try {
      GetSalIntegrationEnrichmentProjectSettingsOptions getSalIntegrationEnrichmentProjectSettingsOptions = new GetSalIntegrationEnrichmentProjectSettingsOptions.Builder()
        .projectId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalEnrichmentSettings> response = service.getSalIntegrationEnrichmentProjectSettings(getSalIntegrationEnrichmentProjectSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalEnrichmentSettings salEnrichmentSettingsResult = response.getResult();
      assertNotNull(salEnrichmentSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationEnrichmentProjectSettings" })
  public void testReplaceSalIntegrationEnrichmentProjectSettings() throws Exception {
    try {
      SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfigurationModel = new SalEnrichmentSettingsExpansionDescriptionConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.14"))
        .suggestionThreshold(Double.valueOf("0.9"))
        .build();

      SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
        .assignmentThreshold(Double.valueOf("0.1"))
        .suggestionThreshold(Double.valueOf("0.1"))
        .build();

      SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansionModel = new SalEnrichmentSettingsExpansion.Builder()
        .description(true)
        .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
        .name(true)
        .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
        .build();

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

      ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptions = new ReplaceSalIntegrationEnrichmentProjectSettingsOptions.Builder()
        .projectId("testString")
        .expansion(salEnrichmentSettingsExpansionModel)
        .termAssignment(salEnrichmentSettingsTermAssignmentModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.replaceSalIntegrationEnrichmentProjectSettings(replaceSalIntegrationEnrichmentProjectSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceSalIntegrationEnrichmentProjectSettings" })
  public void testGetSalIntegrationGlossaryTerms() throws Exception {
    try {
      GetSalIntegrationGlossaryTermsOptions getSalIntegrationGlossaryTermsOptions = new GetSalIntegrationGlossaryTermsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalGlossaryTerms> response = service.getSalIntegrationGlossaryTerms(getSalIntegrationGlossaryTermsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalGlossaryTerms salGlossaryTermsResult = response.getResult();
      assertNotNull(salGlossaryTermsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationGlossaryTerms" })
  public void testCreateSalIntegrationUploadGlossary() throws Exception {
    try {
      CreateSalIntegrationUploadGlossaryOptions createSalIntegrationUploadGlossaryOptions = new CreateSalIntegrationUploadGlossaryOptions.Builder()
        .replaceOption("all")
        .glossaryCsv(TestUtilities.createMockStream("This is a mock file."))
        .glossaryCsvContentType("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalGlossaryUploadProcess> response = service.createSalIntegrationUploadGlossary(createSalIntegrationUploadGlossaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SalGlossaryUploadProcess salGlossaryUploadProcessResult = response.getResult();
      assertNotNull(salGlossaryUploadProcessResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSalIntegrationUploadGlossary" })
  public void testGetSalIntegrationUploadGlossaryStatus() throws Exception {
    try {
      GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptions = new GetSalIntegrationUploadGlossaryStatusOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalGlossaryUploadStatus> response = service.getSalIntegrationUploadGlossaryStatus(getSalIntegrationUploadGlossaryStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SalGlossaryUploadStatus salGlossaryUploadStatusResult = response.getResult();
      assertNotNull(salGlossaryUploadStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSalIntegrationUploadGlossaryStatus" })
  public void testListSalIntegrationEnrichmentMappings() throws Exception {
    try {
      ListSalIntegrationEnrichmentMappingsOptions listSalIntegrationEnrichmentMappingsOptions = new ListSalIntegrationEnrichmentMappingsOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .next("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SalIntegrationMappings> response = service.listSalIntegrationEnrichmentMappings(listSalIntegrationEnrichmentMappingsOptions).execute();
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

  @Test(dependsOnMethods = { "testListSalIntegrationEnrichmentMappings" })
  public void testListSemanticSearchQueries() throws Exception {
    try {
      ListSemanticSearchQueriesOptions listSemanticSearchQueriesOptions = new ListSemanticSearchQueriesOptions.Builder()
        .engineId("testString")
        .schemaSearchEnabled(true)
        .columnSearchEnabled(true)
        .maxResultNumber(Long.valueOf("5"))
        .runSearch(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SemanticSearchList> response = service.listSemanticSearchQueries(listSemanticSearchQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SemanticSearchList semanticSearchListResult = response.getResult();
      assertNotNull(semanticSearchListResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSemanticSearchQueries" })
  public void testCreateSemanticSearchQueries() throws Exception {
    try {
      SemanticSearchBodySearchConfig semanticSearchBodySearchConfigModel = new SemanticSearchBodySearchConfig.Builder()
        .columnSearchEnabled(true)
        .fields(java.util.Arrays.asList("metadata.name", "metadata.description", "metadata.tags"))
        .maxResultNumber(Long.valueOf("1"))
        .schemaSearchEnabled(true)
        .build();

      CreateSemanticSearchQueriesOptions createSemanticSearchQueriesOptions = new CreateSemanticSearchQueriesOptions.Builder()
        .engineId("presto01")
        .queryInput("catalog_table")
        .searchConfig(semanticSearchBodySearchConfigModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SemanticSearch> response = service.createSemanticSearchQueries(createSemanticSearchQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SemanticSearch semanticSearchResult = response.getResult();
      assertNotNull(semanticSearchResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSemanticSearchQueries" })
  public void testListIngestionJobs() throws Exception {
    try {
      ListIngestionJobsOptions listIngestionJobsOptions = new ListIngestionJobsOptions.Builder()
        .authInstanceId("testString")
        .start("testString")
        .limit(Long.valueOf("10"))
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
        .limit(Long.valueOf("10"))
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
  public void testCreateIngestionJob() throws Exception {
    try {
      SchemaTransformation schemaTransformationModel = new SchemaTransformation.Builder()
        .oldColumn("old_column_name")
        .newColumn("new_column_name")
        .newType("string")
        .build();

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

      IcebergSourceTable icebergSourceTableModel = new IcebergSourceTable.Builder()
        .schemaName("testString")
        .tableName("testString")
        .catalogName("testString")
        .warehouseName("testString")
        .snapshotId(Long.valueOf("0"))
        .build();

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

      FileFormatProperties fileFormatPropertiesModel = new FileFormatProperties.Builder()
        .encoding("testString")
        .escapeCharacter("testString")
        .fieldDelimiter("testString")
        .header(true)
        .lineDelimiter("testString")
        .build();

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

      ExecuteConfig executeConfigModel = new ExecuteConfig.Builder()
        .driverMemory("testString")
        .driverCores(Long.valueOf("1"))
        .executorMemory("testString")
        .executorCores(Long.valueOf("1"))
        .numExecutors(Long.valueOf("1"))
        .build();

      IngestionEngine ingestionEngineModel = new IngestionEngine.Builder()
        .engineId("testString")
        .name("testString")
        .endpoint("testString")
        .origin("testString")
        .executeConfig(executeConfigModel)
        .bucketDetails(bucketDetailsModel)
        .logPath("testString")
        .build();

      CapacityDetails capacityDetailsModel = new CapacityDetails.Builder()
        .id("6f51248a-4cda-459a-b141-eb9b76bb6689")
        .build();

      CreateIngestionJobOptions createIngestionJobOptions = new CreateIngestionJobOptions.Builder()
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

      // Invoke operation
      Response<IngestionJob> response = service.createIngestionJob(createIngestionJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      IngestionJob ingestionJobResult = response.getResult();
      assertNotNull(ingestionJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateIngestionJob" })
  public void testGetIngestionJob() throws Exception {
    try {
      GetIngestionJobOptions getIngestionJobOptions = new GetIngestionJobOptions.Builder()
        .authInstanceId("testString")
        .id("testString")
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
  public void testListResourceAccessPolicies() throws Exception {
    try {
      ListResourceAccessPoliciesOptions listResourceAccessPoliciesOptions = new ListResourceAccessPoliciesOptions.Builder()
        .authInstanceId("testString")
        .resourceType("catalog")
        .resourceId(java.util.Arrays.asList("testString"))
        .resourceName(java.util.Arrays.asList("testString"))
        .build();

      // Invoke operation
      Response<AccessPolicies> response = service.listResourceAccessPolicies(listResourceAccessPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicies accessPoliciesResult = response.getResult();
      assertNotNull(accessPoliciesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListResourceAccessPolicies" })
  public void testBulkUpdateResourceAccessPolicies() throws Exception {
    try {
      ResourceDetailsBulkUpdate resourceDetailsBulkUpdateModel = new ResourceDetailsBulkUpdate.Builder()
        .id("presto01")
        .name("hive_data")
        .type("presto")
        .build();

      Subject subjectModel = new Subject.Builder()
        .type("user")
        .value("user1")
        .build();

      SubjectBulkUpdate subjectBulkUpdateModel = new SubjectBulkUpdate.Builder()
        .permissions(java.util.Arrays.asList("testString"))
        .subject(subjectModel)
        .build();

      AccessPolicyBulkUpdate accessPolicyBulkUpdateModel = new AccessPolicyBulkUpdate.Builder()
        .resources(java.util.Arrays.asList(resourceDetailsBulkUpdateModel))
        .subjects(java.util.Arrays.asList(subjectBulkUpdateModel))
        .build();

      BulkUpdateResourceAccessPoliciesOptions bulkUpdateResourceAccessPoliciesOptions = new BulkUpdateResourceAccessPoliciesOptions.Builder()
        .accessPolicies(java.util.Arrays.asList(accessPolicyBulkUpdateModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<AccessPolicyBulkUpdateResponse> response = service.bulkUpdateResourceAccessPolicies(bulkUpdateResourceAccessPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicyBulkUpdateResponse accessPolicyBulkUpdateResponseResult = response.getResult();
      assertNotNull(accessPolicyBulkUpdateResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testBulkUpdateResourceAccessPolicies" })
  public void testRevokeResourceAccessPolicies() throws Exception {
    try {
      ResourceDetails resourceDetailsModel = new ResourceDetails.Builder()
        .id("presto01")
        .name("hive_data")
        .type("presto")
        .build();

      Subject subjectModel = new Subject.Builder()
        .type("user")
        .value("user1")
        .build();

      SubjectRevoke subjectRevokeModel = new SubjectRevoke.Builder()
        .permissions(java.util.Arrays.asList("testString"))
        .subject(subjectModel)
        .build();

      RevokeResourceAccessPoliciesOptions revokeResourceAccessPoliciesOptions = new RevokeResourceAccessPoliciesOptions.Builder()
        .resources(java.util.Arrays.asList(resourceDetailsModel))
        .subjects(java.util.Arrays.asList(subjectRevokeModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.revokeResourceAccessPolicies(revokeResourceAccessPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRevokeResourceAccessPolicies" })
  public void testFilterResourceAccessPoliciesOnUsersAndUsergroups() throws Exception {
    try {
      ResourceDetails resourceDetailsModel = new ResourceDetails.Builder()
        .id("presto01")
        .name("hive_data")
        .type("presto")
        .build();

      Subject subjectModel = new Subject.Builder()
        .type("user")
        .value("user1")
        .build();

      AccessPoliciesSearch accessPoliciesSearchModel = new AccessPoliciesSearch.Builder()
        .resources(java.util.Arrays.asList(resourceDetailsModel))
        .subjectsToSearch(java.util.Arrays.asList(subjectModel))
        .build();

      FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions filterResourceAccessPoliciesOnUsersAndUsergroupsOptions = new FilterResourceAccessPoliciesOnUsersAndUsergroupsOptions.Builder()
        .accessPoliciesSearch(java.util.Arrays.asList(accessPoliciesSearchModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<AccessPolicies> response = service.filterResourceAccessPoliciesOnUsersAndUsergroups(filterResourceAccessPoliciesOnUsersAndUsergroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccessPolicies accessPoliciesResult = response.getResult();
      assertNotNull(accessPoliciesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testFilterResourceAccessPoliciesOnUsersAndUsergroups" })
  public void testListDataPolicies() throws Exception {
    try {
      ListDataPoliciesOptions listDataPoliciesOptions = new ListDataPoliciesOptions.Builder()
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

      // Invoke operation
      Response<PolicyV2Collection> response = service.listDataPolicies(listDataPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyV2Collection policyV2CollectionResult = response.getResult();
      assertNotNull(policyV2CollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataPolicies" })
  public void testCreateDataPolicy() throws Exception {
    try {
      RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
        .key("user_name")
        .type("user_identity")
        .value("user1")
        .build();

      TransformColumnProperties transformColumnPropertiesModel = new TransformColumnProperties.Builder()
        .maskCondition("NIL")
        .maskType("mask_show_last_4")
        .maskValue("NIL")
        .build();

      RowFilterProperties rowFilterPropertiesModel = new RowFilterProperties.Builder()
        .filterCondition("NIL")
        .rowFilter("addr_country='US'")
        .build();

      RuleV2 ruleV2Model = new RuleV2.Builder()
        .actions(java.util.Arrays.asList("alter", "create"))
        .effect("allow")
        .grantees(java.util.Arrays.asList(ruleGranteeModel))
        .transformColumns(transformColumnPropertiesModel)
        .transformRows(rowFilterPropertiesModel)
        .build();

      CreateDataPolicyOptions createDataPolicyOptions = new CreateDataPolicyOptions.Builder()
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

      // Invoke operation
      Response<PolicyV2> response = service.createDataPolicy(createDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyV2 policyV2Result = response.getResult();
      assertNotNull(policyV2Result);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataPolicy" })
  public void testGetDataPolicy() throws Exception {
    try {
      GetDataPolicyOptions getDataPolicyOptions = new GetDataPolicyOptions.Builder()
        .name("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PolicyV2> response = service.getDataPolicy(getDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyV2 policyV2Result = response.getResult();
      assertNotNull(policyV2Result);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataPolicy" })
  public void testReplaceDataPolicy() throws Exception {
    try {
      RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
        .key("user_name")
        .type("user_identity")
        .value("user1")
        .build();

      TransformColumnProperties transformColumnPropertiesModel = new TransformColumnProperties.Builder()
        .maskCondition("NIL")
        .maskType("mask_show_last_4")
        .maskValue("NIL")
        .build();

      RowFilterProperties rowFilterPropertiesModel = new RowFilterProperties.Builder()
        .filterCondition("NIL")
        .rowFilter("addr_country='US'")
        .build();

      RuleV2 ruleV2Model = new RuleV2.Builder()
        .actions(java.util.Arrays.asList("alter", "create"))
        .effect("allow")
        .grantees(java.util.Arrays.asList(ruleGranteeModel))
        .transformColumns(transformColumnPropertiesModel)
        .transformRows(rowFilterPropertiesModel)
        .build();

      ReplaceDataPolicyOptions replaceDataPolicyOptions = new ReplaceDataPolicyOptions.Builder()
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

      // Invoke operation
      Response<PolicyV2> response = service.replaceDataPolicy(replaceDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyV2 policyV2Result = response.getResult();
      assertNotNull(policyV2Result);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataPolicy" })
  public void testUpdateDataPolicy() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateDataPolicyOptions updateDataPolicyOptions = new UpdateDataPolicyOptions.Builder()
        .name("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PolicyV2> response = service.updateDataPolicy(updateDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyV2 policyV2Result = response.getResult();
      assertNotNull(policyV2Result);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataPolicy" })
  public void testDeleteStorageRegistration() throws Exception {
    try {
      DeleteStorageRegistrationOptions deleteStorageRegistrationOptions = new DeleteStorageRegistrationOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .skipMdsCall(false)
        .build();

      // Invoke operation
      Response<Void> response = service.deleteStorageRegistration(deleteStorageRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteStorageRegistration" })
  public void testDeleteDatabaseCatalog() throws Exception {
    try {
      DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions = new DeleteDatabaseCatalogOptions.Builder()
        .id("testString")
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
  public void testDeleteEngine() throws Exception {
    try {
      DeleteEngineOptions deleteEngineOptions = new DeleteEngineOptions.Builder()
        .id("testString")
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
  public void testDeletePrestissimoEngine() throws Exception {
    try {
      DeletePrestissimoEngineOptions deletePrestissimoEngineOptions = new DeletePrestissimoEngineOptions.Builder()
        .id("testString")
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
        .id("testString")
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
  public void testDeleteDb2Engine() throws Exception {
    try {
      DeleteDb2EngineOptions deleteDb2EngineOptions = new DeleteDb2EngineOptions.Builder()
        .id("testString")
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
  public void testDeleteOtherEngine() throws Exception {
    try {
      DeleteOtherEngineOptions deleteOtherEngineOptions = new DeleteOtherEngineOptions.Builder()
        .id("testString")
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
  public void testDeleteNetezzaEngine() throws Exception {
    try {
      DeleteNetezzaEngineOptions deleteNetezzaEngineOptions = new DeleteNetezzaEngineOptions.Builder()
        .id("testString")
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
  public void testDeleteSparkEngine() throws Exception {
    try {
      DeleteSparkEngineOptions deleteSparkEngineOptions = new DeleteSparkEngineOptions.Builder()
        .id("testString")
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
  public void testDeleteSparkEngineCatalogs() throws Exception {
    try {
      DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptions = new DeleteSparkEngineCatalogsOptions.Builder()
        .id("testString")
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
  public void testDeleteSparkEngineApplication() throws Exception {
    try {
      DeleteSparkEngineApplicationOptions deleteSparkEngineApplicationOptions = new DeleteSparkEngineApplicationOptions.Builder()
        .engineId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngineApplication(deleteSparkEngineApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngineApplication" })
  public void testDeleteSparkEngineHistoryServer() throws Exception {
    try {
      DeleteSparkEngineHistoryServerOptions deleteSparkEngineHistoryServerOptions = new DeleteSparkEngineHistoryServerOptions.Builder()
        .id("testString")
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
  public void testDeleteIntegration() throws Exception {
    try {
      DeleteIntegrationOptions deleteIntegrationOptions = new DeleteIntegrationOptions.Builder()
        .id("testString")
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
  public void testDeleteSchema() throws Exception {
    try {
      DeleteSchemaOptions deleteSchemaOptions = new DeleteSchemaOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .columnName("testString")
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
  public void testDeleteCatalog() throws Exception {
    try {
      DeleteCatalogOptions deleteCatalogOptions = new DeleteCatalogOptions.Builder()
        .name("testString")
        .authInstanceId("testString")
        .skipMdsCall(false)
        .build();

      // Invoke operation
      Response<Void> response = service.deleteCatalog(deleteCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteCatalog" })
  public void testDeleteMilvusService() throws Exception {
    try {
      DeleteMilvusServiceOptions deleteMilvusServiceOptions = new DeleteMilvusServiceOptions.Builder()
        .id("testString")
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
  public void testDeleteSemanticSearchQueries() throws Exception {
    try {
      DeleteSemanticSearchQueriesOptions deleteSemanticSearchQueriesOptions = new DeleteSemanticSearchQueriesOptions.Builder()
        .batchSize(Long.valueOf("1"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSemanticSearchQueries(deleteSemanticSearchQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSemanticSearchQueries" })
  public void testDeleteSemanticSearchQueriesById() throws Exception {
    try {
      DeleteSemanticSearchQueriesByIdOptions deleteSemanticSearchQueriesByIdOptions = new DeleteSemanticSearchQueriesByIdOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSemanticSearchQueriesById(deleteSemanticSearchQueriesByIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSemanticSearchQueriesById" })
  public void testDeleteSalMetadata() throws Exception {
    try {
      DeleteSalMetadataOptions deleteSalMetadataOptions = new DeleteSalMetadataOptions();

      // Invoke operation
      Response<Void> response = service.deleteSalMetadata(deleteSalMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSalMetadata" })
  public void testDeleteDataPolicies() throws Exception {
    try {
      DeleteDataPoliciesOptions deleteDataPoliciesOptions = new DeleteDataPoliciesOptions.Builder()
        .authInstanceId("testString")
        .policies("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataPolicies(deleteDataPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataPolicies" })
  public void testDeleteDataPolicy() throws Exception {
    try {
      DeleteDataPolicyOptions deleteDataPolicyOptions = new DeleteDataPolicyOptions.Builder()
        .name("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataPolicy(deleteDataPolicyOptions).execute();
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
