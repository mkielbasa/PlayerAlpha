package com.grnroom.playeralphaserver.pojo;


public class UserRelation {

  private long userId;
  private long otherUserId;
  private long relationTypeId;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOtherUserId() {
    return otherUserId;
  }

  public void setOtherUserId(long otherUserId) {
    this.otherUserId = otherUserId;
  }


  public long getRelationTypeId() {
    return relationTypeId;
  }

  public void setRelationTypeId(long relationTypeId) {
    this.relationTypeId = relationTypeId;
  }

}
