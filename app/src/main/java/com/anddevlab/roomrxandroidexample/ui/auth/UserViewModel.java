package com.anddevlab.roomrxandroidexample.ui.auth;

import android.arch.lifecycle.ViewModel;
import com.anddevlab.roomrxandroidexample.presistence.UserDataSource;
import com.anddevlab.roomrxandroidexample.presistence.model.User;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.operators.completable.CompletableFromAction;

/**
 * Created by anddev on 17/09/2017.
 */

public class UserViewModel extends ViewModel{
  private final UserDataSource userDataSource;
  private User mUser;

  public UserViewModel(UserDataSource userDataSource) {
    this.userDataSource = userDataSource;

  }
  public Flowable<String>getUserName(){
   return userDataSource.getUser().map(
        user -> {
          mUser = user;
          return user.getName();
        });
  }

  public Completable updateUserName(final String name) {
    return new CompletableFromAction(() -> {
      // if there's no use, create a new user.
      // if we already have a user, then, since the user object is immutable,
      // create a new user, with the id of the previous user and the updated user name.
      mUser = mUser == null
          ? new User(name)
          : new User(mUser.getUid(), name);

      userDataSource.insertOrUpdateUser(mUser);
    });
  }
}

