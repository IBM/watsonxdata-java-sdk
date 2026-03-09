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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseDetails model.
 */
public class DatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseDetails() throws Throwable {
    DatabaseDetails databaseDetailsModel = new DatabaseDetails();
    assertNull(databaseDetailsModel.getAuthenticationType());
    assertNull(databaseDetailsModel.getAuthenticationValue());
    assertNull(databaseDetailsModel.getBrokerAuthenticationPassword());
    assertNull(databaseDetailsModel.getBrokerAuthenticationType());
    assertNull(databaseDetailsModel.getBrokerAuthenticationUser());
    assertNull(databaseDetailsModel.getBrokerHost());
    assertNull(databaseDetailsModel.getBrokerPort());
    assertNull(databaseDetailsModel.getCertificate());
    assertNull(databaseDetailsModel.getCertificateExtension());
    assertNull(databaseDetailsModel.getConnectionMethod());
    assertNull(databaseDetailsModel.getConnectionMode());
    assertNull(databaseDetailsModel.getConnectionModeValue());
    assertNull(databaseDetailsModel.getConnectionType());
    assertNull(databaseDetailsModel.getControllerAuthenticationPassword());
    assertNull(databaseDetailsModel.getControllerAuthenticationType());
    assertNull(databaseDetailsModel.getControllerAuthenticationUser());
    assertNull(databaseDetailsModel.getCoordinatorHost());
    assertNull(databaseDetailsModel.getCoordinatorPort());
    assertNull(databaseDetailsModel.getCpdHostname());
    assertNull(databaseDetailsModel.getCredentialsKey());
    assertNull(databaseDetailsModel.getDomainName());
    assertNull(databaseDetailsModel.getHostname());
    assertNull(databaseDetailsModel.getHostnameInCertificate());
    assertNull(databaseDetailsModel.getHosts());
    assertNull(databaseDetailsModel.getInformixServer());
    assertNull(databaseDetailsModel.getName());
    assertNull(databaseDetailsModel.getPassword());
    assertNull(databaseDetailsModel.getPort());
    assertNull(databaseDetailsModel.getProjectId());
    assertNull(databaseDetailsModel.isSasl());
    assertNull(databaseDetailsModel.getSaslMechanism());
    assertNull(databaseDetailsModel.getSchemaName());
    assertNull(databaseDetailsModel.getSchemas());
    assertNull(databaseDetailsModel.getServiceApiKey());
    assertNull(databaseDetailsModel.getServiceHostname());
    assertNull(databaseDetailsModel.getServicePassword());
    assertNull(databaseDetailsModel.getServicePort());
    assertNull(databaseDetailsModel.isServiceSsl());
    assertNull(databaseDetailsModel.getServiceTokenUrl());
    assertNull(databaseDetailsModel.getServiceUsername());
    assertNull(databaseDetailsModel.isSsl());
    assertNull(databaseDetailsModel.getTables());
    assertNull(databaseDetailsModel.getUsername());
    assertNull(databaseDetailsModel.isValidateServerCertificate());
    assertNull(databaseDetailsModel.isVerifyHostName());
    assertNull(databaseDetailsModel.getWarehouseName());
  }
}