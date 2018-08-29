package com.shopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * customer_login
 * @author 
 */
public class CustomerLogin implements Serializable {
    private Integer loginId;

    private String loginName;

    private String loginPwd;

    private Date loginTime;

    private String loginIp;

    private Date preLoginTime;

    private Integer loginStatus;

    private String custId;

    public CustomerLogin(){

    }

    public CustomerLogin(Integer loginId, String loginName, String loginPwd, Date loginTime, String loginIp, Date preLoginTime, Integer loginStatus, String custId) {
        this.loginId = loginId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
        this.preLoginTime = preLoginTime;
        this.loginStatus = loginStatus;
        this.custId = custId;
    }

    private static final long serialVersionUID = 1L;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getPreLoginTime() {
        return preLoginTime;
    }

    public void setPreLoginTime(Date preLoginTime) {
        this.preLoginTime = preLoginTime;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustomerLogin other = (CustomerLogin) that;
        return (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getLoginPwd() == null ? other.getLoginPwd() == null : this.getLoginPwd().equals(other.getLoginPwd()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getPreLoginTime() == null ? other.getPreLoginTime() == null : this.getPreLoginTime().equals(other.getPreLoginTime()))
            && (this.getLoginStatus() == null ? other.getLoginStatus() == null : this.getLoginStatus().equals(other.getLoginStatus()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getLoginPwd() == null) ? 0 : getLoginPwd().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getPreLoginTime() == null) ? 0 : getPreLoginTime().hashCode());
        result = prime * result + ((getLoginStatus() == null) ? 0 : getLoginStatus().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginId=").append(loginId);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", preLoginTime=").append(preLoginTime);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append(", custId=").append(custId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}