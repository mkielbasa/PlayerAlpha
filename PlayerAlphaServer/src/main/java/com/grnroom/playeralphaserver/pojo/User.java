package com.grnroom.playeralphaserver.pojo;


public class User {

  private long id;
  private long _DiscordId;
  private long twitchId;
  private long reputation;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long get_DiscordId() {
    return _DiscordId;
  }

  public void set_DiscordId(long _DiscordId) {
    this._DiscordId = _DiscordId;
  }


  public long getTwitchId() {
    return twitchId;
  }

  public void setTwitchId(long twitchId) {
    this.twitchId = twitchId;
  }


  public long getReputation() {
    return reputation;
  }

  public void setReputation(long reputation) {
    this.reputation = reputation;
  }

}
