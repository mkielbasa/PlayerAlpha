package com.grnroom.playeralphaserver.pojo;


public class Song {

  private long id;
  private long addedById;
  private String author;
  private String title;
  private String copyrighted;
  private String url;
  private String path;
  private long duration;
  private long genreId;
  private long playedCounter;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAddedById() {
    return addedById;
  }

  public void setAddedById(long addedById) {
    this.addedById = addedById;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getCopyrighted() {
    return copyrighted;
  }

  public void setCopyrighted(String copyrighted) {
    this.copyrighted = copyrighted;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }


  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }


  public long getPlayedCounter() {
    return playedCounter;
  }

  public void setPlayedCounter(long playedCounter) {
    this.playedCounter = playedCounter;
  }

}
