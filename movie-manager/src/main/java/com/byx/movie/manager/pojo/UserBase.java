/**
 * Copyright(C) 2006-2016 安普利科技
 * All rights reserved
 * 2018-09-12 16:29:36 Created
 * 
 */
package com.byx.movie.manager.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserBase implements Serializable {
    /**
     * 用户id
     */
    private BigDecimal userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户状态（0禁止，1正常，2废除）
     */
    private Short userStatus;

    /**
     * 用户注册时间
     */
    private Date joinDate;

    private static final long serialVersionUID = 1L;

    /**
     * <pre>
     * 获取：用户id
     * 表字段：USER_BASE.USER_ID
     * </pre>
     *
     * @return USER_BASE.USER_ID：用户id
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * <pre>
     * 设置：用户id
     * 表字段：USER_BASE.USER_ID
     * </pre>
     *
     * @param userId
     *            USER_BASE.USER_ID：用户id
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * <pre>
     * 获取：用户名
     * 表字段：USER_BASE.USER_NAME
     * </pre>
     *
     * @return USER_BASE.USER_NAME：用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <pre>
     * 设置：用户名
     * 表字段：USER_BASE.USER_NAME
     * </pre>
     *
     * @param userName
     *            USER_BASE.USER_NAME：用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * <pre>
     * 获取：用户密码
     * 表字段：USER_BASE.USER_PASSWORD
     * </pre>
     *
     * @return USER_BASE.USER_PASSWORD：用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * <pre>
     * 设置：用户密码
     * 表字段：USER_BASE.USER_PASSWORD
     * </pre>
     *
     * @param userPassword
     *            USER_BASE.USER_PASSWORD：用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * <pre>
     * 获取：用户状态（0禁止，1正常，2废除）
     * 表字段：USER_BASE.USER_STATUS
     * </pre>
     *
     * @return USER_BASE.USER_STATUS：用户状态（0禁止，1正常，2废除）
     */
    public Short getUserStatus() {
        return userStatus;
    }

    /**
     * <pre>
     * 设置：用户状态（0禁止，1正常，2废除）
     * 表字段：USER_BASE.USER_STATUS
     * </pre>
     *
     * @param userStatus
     *            USER_BASE.USER_STATUS：用户状态（0禁止，1正常，2废除）
     */
    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <pre>
     * 获取：用户注册时间
     * 表字段：USER_BASE.JOIN_DATE
     * </pre>
     *
     * @return USER_BASE.JOIN_DATE：用户注册时间
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * <pre>
     * 设置：用户注册时间
     * 表字段：USER_BASE.JOIN_DATE
     * </pre>
     *
     * @param joinDate
     *            USER_BASE.JOIN_DATE：用户注册时间
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     *
     * @param that
     */
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
        UserBase other = (UserBase) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getJoinDate() == null ? other.getJoinDate() == null : this.getJoinDate().equals(other.getJoinDate()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getJoinDate() == null) ? 0 : getJoinDate().hashCode());
        return result;
    }

    /**
     *
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", joinDate=").append(joinDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}