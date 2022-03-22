package com.grnroom.playeralphaserver.pojo;


public class DiscordServer {

  private long id;
  private long discordId;
  private String name;
  private String icon;
  private String banner;
  private String invitation;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDiscordId() {
    return discordId;
  }

  public void setDiscordId(long discordId) {
    this.discordId = discordId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }


  public String getInvitation() {
    return invitation;
  }

  public void setInvitation(String invitation) {
    this.invitation = invitation;
  }

}
