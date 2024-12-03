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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateHdfsStorageOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateHdfsStorageOptions model.
 */
public class CreateHdfsStorageOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateHdfsStorageOptions() throws Throwable {
    CreateHdfsStorageOptions createHdfsStorageOptionsModel = new CreateHdfsStorageOptions.Builder()
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
    assertEquals(createHdfsStorageOptionsModel.bucketDisplayName(), "testString");
    assertEquals(createHdfsStorageOptionsModel.bucketType(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hmsThriftUri(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hmsThriftPort(), Long.valueOf("1"));
    assertEquals(createHdfsStorageOptionsModel.coreSite(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hdfsSite(), "testString");
    assertEquals(createHdfsStorageOptionsModel.kerberos(), "testString");
    assertEquals(createHdfsStorageOptionsModel.catalogName(), "testString");
    assertEquals(createHdfsStorageOptionsModel.catalogType(), "testString");
    assertEquals(createHdfsStorageOptionsModel.krb5Config(), "testString");
    assertEquals(IOUtils.toString(createHdfsStorageOptionsModel.hiveKeytab()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createHdfsStorageOptionsModel.hiveKeytabContentType(), "testString");
    assertEquals(IOUtils.toString(createHdfsStorageOptionsModel.hdfsKeytab()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createHdfsStorageOptionsModel.hdfsKeytabContentType(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hiveServerPrincipal(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hiveClientPrincipal(), "testString");
    assertEquals(createHdfsStorageOptionsModel.hdfsPrincipal(), "testString");
    assertEquals(createHdfsStorageOptionsModel.description(), "testString");
    assertEquals(createHdfsStorageOptionsModel.createdOn(), "testString");
    assertEquals(createHdfsStorageOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateHdfsStorageOptionsError() throws Throwable {
    new CreateHdfsStorageOptions.Builder().build();
  }

}