package com.grnroom.playeralphaserver.pojo;


public class UserDiscordServer {

  private long userId;
  private long serverId;
  private java.sql.Timestamp joinTime;


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


  public java.sql.Timestamp getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(java.sql.Timestamp joinTime) {
    this.joinTime = joinTime;
  }

}
