/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.websecurityscanner.v1.samples;

// [START websecurityscanner_v1_generated_websecurityscannerclient_getscanconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.websecurityscanner.v1.GetScanConfigRequest;
import com.google.cloud.websecurityscanner.v1.ScanConfig;
import com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient;

public class AsyncGetScanConfig {

  public static void main(String[] args) throws Exception {
    asyncGetScanConfig();
  }

  public static void asyncGetScanConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      GetScanConfigRequest request =
          GetScanConfigRequest.newBuilder().setName("name3373707").build();
      ApiFuture<ScanConfig> future =
          webSecurityScannerClient.getScanConfigCallable().futureCall(request);
      // Do something.
      ScanConfig response = future.get();
    }
  }
}
// [END websecurityscanner_v1_generated_websecurityscannerclient_getscanconfig_async]