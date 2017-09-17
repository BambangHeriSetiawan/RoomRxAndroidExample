package com.anddevlab.roomrxandroidexample.presistence;

import com.anddevlab.roomrxandroidexample.presistence.model.User;
import io.reactivex.Flowable;

/**
 * Created by anddev on 17/09/2017.
 */

public interface UserDataSource {
  Flowable<User> getUser();
  void insertOrUpdateUser(User user);
  void deleteAllUsers();
}
