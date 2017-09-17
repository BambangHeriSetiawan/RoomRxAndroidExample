package com.anddevlab.roomrxandroidexample.presistence.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.anddevlab.roomrxandroidexample.presistence.model.User;
import io.reactivex.Flowable;

/**
 * Created by anddev on 17/09/2017.
 */
@Dao
public interface UserDAO {
  @Query("SELECT * FROM Users LIMIT 1")
  Flowable<User> getUser();

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  void insertUser(User user);

  @Query("DELETE FROM Users")
  void deleteAllUsers();
}
