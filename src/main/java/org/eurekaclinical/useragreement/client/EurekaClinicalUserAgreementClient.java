package org.eurekaclinical.useragreement.client;

/*-
 * #%L
 * Eureka! Clinical User Agreement Webapp
 * %%
 * Copyright (C) 2016 Emory University
 * %%
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
 * #L%
 */

import java.net.URI;
import org.eurekaclinical.common.comm.clients.AuthorizingEurekaClinicalClient;
import org.eurekaclinical.common.comm.clients.ClientException;
import org.eurekaclinical.useragreement.client.comm.Status;
import org.eurekaclinical.useragreement.client.comm.UserAgreementStatus;

/**
 * EurekaClinicalUserAgreementInternalClient is an internal client that should be used only by user-agreement-webapp
 * 
 * @author Andrew Post
 */
public final class EurekaClinicalUserAgreementClient extends AuthorizingEurekaClinicalClient {

    private final URI serviceUrl;

    public EurekaClinicalUserAgreementClient(String inUserAgreementServiceUrl) {
        super(null);
        this.serviceUrl = URI.create(inUserAgreementServiceUrl);
    }

    @Override
    protected URI getResourceUrl() {
        return this.serviceUrl;
    }

    public UserAgreementStatus getUserAgreementStatus(Status status) throws ClientException {
        if (status != null) {
            return doGet("/api/protected/useragreementstatuses/me?status=" + status.name(), UserAgreementStatus.class);
        } else {
            return getUserAgreementStatus();
        }
    }

    public UserAgreementStatus getUserAgreementStatus() throws ClientException {
        return doGet("/api/protected/useragreementstatuses/me", UserAgreementStatus.class);
    }

    public Long submitUserAgreement(UserAgreementStatus userAgreementStatus) throws ClientException {
        URI uri = doPostCreate("/api/protected/useragreementstatuses", userAgreementStatus);
        return extractId(uri);
    }
}
