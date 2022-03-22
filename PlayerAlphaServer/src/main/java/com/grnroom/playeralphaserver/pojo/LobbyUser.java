package com.grnroom.playeralphaserver.pojo;


public class LobbyUser {

  private long lobbyId;
  private long userId;
  private java.sql.Timestamp joinTime;


  public long getLobbyId() {
    return lobbyId;
  }

  public void setLobbyId(long lobbyId) {
    this.lobbyId = lobbyId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(java.sql.Timestamp joinTime) {
    this.joinTime = joinTime;
  }

}
