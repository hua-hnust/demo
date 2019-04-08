package com.hnust.hua.algorithm;

public class SqlserverBlockTable {
    private Integer id;

    private Long sid;

    private String tableName;

    private String eventInfo;

    private String clientNetAddress;

    private Long connectTime;

    private String hostName;

    private String programName;

    private String loginName;

    private Integer dbConfigId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo == null ? null : eventInfo.trim();
    }

    public String getClientNetAddress() {
        return clientNetAddress;
    }

    public void setClientNetAddress(String clientNetAddress) {
        this.clientNetAddress = clientNetAddress == null ? null : clientNetAddress.trim();
    }

    public Long getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Long connectTime) {
        this.connectTime = connectTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Integer getDbConfigId() {
        return dbConfigId;
    }

    public void setDbConfigId(Integer dbConfigId) {
        this.dbConfigId = dbConfigId;
    }
}