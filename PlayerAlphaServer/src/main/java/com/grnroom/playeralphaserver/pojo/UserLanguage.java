package com.grnroom.playeralphaserver.pojo;


public class UserLanguage {

  private long userId;
  private long langId;
  private long advancement;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getLangId() {
    return langId;
  }

  public void setLangId(long langId) {
    this.langId = langId;
  }


  public long getAdvancement() {
    return advancement;
  }

  public void setAdvancement(long advancement) {
    this.advancement = advancement;
  }

}
