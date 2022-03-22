package com.grnroom.playeralphaserver.pojo;


public class UserSongAttributes {

  private long userId;
  private long songId;
  private long attributeId;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getSongId() {
    return songId;
  }

  public void setSongId(long songId) {
    this.songId = songId;
  }


  public long getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(long attributeId) {
    this.attributeId = attributeId;
  }

}
