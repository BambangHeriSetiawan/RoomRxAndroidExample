package com.anddevlab.roomrxandroidexample.presistence;

import com.anddevlab.roomrxandroidexample.presistence.dao.UserDAO;
import com.anddevlab.roomrxandroidexample.presistence.model.User;
import io.reactivex.Flowable;

/**
 * Created by anddev on 17/09/2017.
 */

public class LocalDataSource implements UserDataSource {
  private final UserDAO userDAO;

  public LocalDataSource(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public Flowable<User> getUser() {
    return userDAO.getUser();
  }

  @Override
  public void insertOrUpdateUser(User user) {
      userDAO.insertUser(user);
  }

  @Override
  public void deleteAllUsers() {
    userDAO.deleteAllUsers();
  }
}
