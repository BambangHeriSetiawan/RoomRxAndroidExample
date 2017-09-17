package com.anddevlab.roomrxandroidexample.presistence.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.anddevlab.roomrxandroidexample.presistence.dao.UserDAO;
import com.anddevlab.roomrxandroidexample.presistence.model.User;

/**
 * Created by anddev on 17/09/2017.
 */
@Database(entities = {User.class},version = 1)
public abstract class UserDatabase extends RoomDatabase {
  private static volatile UserDatabase INSTANCE;
  public UserDAO userDAO;
  public static UserDatabase getInstance (Context context){
    if (INSTANCE==null){
      synchronized (UserDatabase.class){
        if (INSTANCE == null){
          INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
              UserDatabase.class,"user.db").build();
        }
      }
    }
    return INSTANCE;
  }
}
