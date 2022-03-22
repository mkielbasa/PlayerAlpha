package com.grnroom.playeralphaserver.pojo;


public class UserAttribute {

  private long userId;
  private long serverId;
  private String value;
  private java.sql.Timestamp creationTime;
  private long type;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getServerId() {
    return serverId;
  }

  public void setServerId(long serverId) {
    this.serverId = serverId;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public java.sql.Timestamp getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(java.sql.Timestamp creationTime) {
    this.creationTime = creationTime;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
