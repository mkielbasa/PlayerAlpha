package com.grnroom.playeralphaserver.pojo;


public class Lobby {

  private long id;
  private long ownerId;
  private long serverId;
  private long activityId;
  private long channelId;
  private String active;
  private java.sql.Timestamp timeCreated;
  private String name;
  private long accessType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }


  public long getServerId() {
    return serverId;
  }

  public void setServerId(long serverId) {
    this.serverId = serverId;
  }


  public long getActivityId() {
    return activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }


  public long getChannelId() {
    return channelId;
  }

  public void setChannelId(long channelId) {
    this.channelId = channelId;
  }


  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }


  public java.sql.Timestamp getTimeCreated() {
    return timeCreated;
  }

  public void setTimeCreated(java.sql.Timestamp timeCreated) {
    this.timeCreated = timeCreated;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAccessType() {
    return accessType;
  }

  public void setAccessType(long accessType) {
    this.accessType = accessType;
  }

}
