/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.pojo;

/**
 *
 * @author nehal0323
 */
public class CompanyPojo {

      public CompanyPojo(String companyId, String companyName, String ownerName, String password, String emailId, String securitykey) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.password = password;
        this.emailId = emailId;
        this.securitykey = securitykey;
    }
    public CompanyPojo(){
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSecuritykey() {
        return securitykey;
    }

    public void setSecuritykey(String securitykey) {
        this.securitykey = securitykey;
    }
    private String companyId;
    private String companyName;
    private String ownerName;
    private String password;
    private String emailId;
    private String securitykey;
    
    
}
