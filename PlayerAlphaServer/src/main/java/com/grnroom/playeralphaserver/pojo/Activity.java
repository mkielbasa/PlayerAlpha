package com.grnroom.playeralphaserver.pojo;

public class Activity {

  private long id;
  private long typeId;
  private String name;
  private String active;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

}
