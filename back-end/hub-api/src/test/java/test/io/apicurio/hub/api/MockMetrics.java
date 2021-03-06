/*
 * Copyright 2017 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.io.apicurio.hub.api;

import java.io.IOException;

import io.apicurio.hub.api.beans.LinkedAccountType;
import io.apicurio.hub.api.metrics.IMetrics;

/**
 * @author eric.wittmann@gmail.com
 */
public class MockMetrics implements IMetrics {

    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#getCurrentMetricsInfo()
     */
    @Override
    public String getCurrentMetricsInfo() throws IOException {
        return null;
    }

    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#apiCall(java.lang.String, java.lang.String)
     */
    @Override
    public void apiCall(String endpoint, String method) {
    }
    
    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#accountLinkCompleted(io.apicurio.hub.api.beans.LinkedAccountType)
     */
    @Override
    public void accountLinkCompleted(LinkedAccountType type) {
    }
    
    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#accountLinkInitiated(io.apicurio.hub.api.beans.LinkedAccountType)
     */
    @Override
    public void accountLinkInitiated(LinkedAccountType type) {
    }
    
    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#apiCreate(java.lang.String)
     */
    @Override
    public void apiCreate(String specVersion) {
    }
    
    /**
     * @see io.apicurio.hub.api.metrics.IMetrics#apiImport(io.apicurio.hub.api.beans.LinkedAccountType)
     */
    @Override
    public void apiImport(LinkedAccountType from) {
    }

}
