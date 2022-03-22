package com.grnroom.playeralphaserver.pojo;


public class UserActivity {

  private long userId;
  private long activityId;
  private java.sql.Timestamp time;
  private long duration;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getActivityId() {
    return activityId;
  }

  public void setActivityId(long activityId) {
    this.activityId = activityId;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }

}
