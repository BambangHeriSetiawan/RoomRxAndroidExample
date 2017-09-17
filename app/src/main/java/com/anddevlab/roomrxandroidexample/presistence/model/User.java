package com.anddevlab.roomrxandroidexample.presistence.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import java.util.UUID;

/**
 * Created by anddev on 17/09/2017.
 */
@Entity(tableName = "users")
public class User {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "uid")
  String uid;

  @ColumnInfo(name = "name")
  String name;

  @ColumnInfo(name = "phone")
  String phone;

  @ColumnInfo(name = "email")
  String email;

  @ColumnInfo(name = "pass")
  String pass;
  @Ignore
  public User(String name){
    uid = UUID.randomUUID().toString();
    name = name;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }
}
