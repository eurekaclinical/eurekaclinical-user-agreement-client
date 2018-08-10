package org.eurekaclinical.useragreement.client.comm;

/*-
 * #%L
 * Eureka! Clinical User Agreement Client
 * %%
 * Copyright (C) 2016 - 2018 Emory University
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



import org.eurekaclinical.common.comm.UserTemplate;
 /**
*
* @author Dileep Gunda
*/
public class UserAgreementUserTemplate extends UserTemplate { 
    private boolean autoAuthorize;
    private String criteria;
     public UserAgreementUserTemplate() {
    }
 
 
     public boolean isAutoAuthorize() {
        return autoAuthorize;
    }
     public void setAutoAuthorize(boolean autoAuthorize) {
        this.autoAuthorize = autoAuthorize;
    }
     /**
     * Gets the criteria for triggering auto-authorization. May be
     * <code>null</code>, which means that auto-authorization will always be
     * triggered when requested. The criteria are expressed as an expression in
     * Freemarker syntax.
     */
    public String getCriteria() {
        return criteria;
    }
     /**
     * Sets criteria for triggering auto-authorization. May be
     * <code>null</code>, which means that auto-authorization will always be
     * triggered when requested.
     *
     * @param criteria the criteria for triggering auto-authorization, expressed
     * using Freemarker expression syntax.
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
     @Override
    public String toString() {
        return "UserAgreementUserTemplate{" + ", autoAuthorize=" + autoAuthorize + ", criteria=" + criteria + super.toString() + '}';
    }
 }
