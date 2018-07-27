package org.eurekaclinical.useragreement.client.comm;



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
