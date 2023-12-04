/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Platform options.
 */
public class DeploymentPlatformOptions extends GenericModel {

  @SerializedName("backup_encryption_key_crn")
  protected String backupEncryptionKeyCrn;
  @SerializedName("disk_encryption_key_crn")
  protected String diskEncryptionKeyCrn;
  @SerializedName("key_protect_key_id")
  protected String keyProtectKeyId;

  protected DeploymentPlatformOptions() { }

  /**
   * Gets the backupEncryptionKeyCrn.
   *
   * Backup encryption key crn.
   *
   * @return the backupEncryptionKeyCrn
   */
  public String getBackupEncryptionKeyCrn() {
    return backupEncryptionKeyCrn;
  }

  /**
   * Gets the diskEncryptionKeyCrn.
   *
   * Disk encryption key crn.
   *
   * @return the diskEncryptionKeyCrn
   */
  public String getDiskEncryptionKeyCrn() {
    return diskEncryptionKeyCrn;
  }

  /**
   * Gets the keyProtectKeyId.
   *
   * Key protect key id.
   *
   * @return the keyProtectKeyId
   */
  public String getKeyProtectKeyId() {
    return keyProtectKeyId;
  }
}

