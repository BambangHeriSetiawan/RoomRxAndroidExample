package com.anddevlab.roomrxandroidexample.ui.auth;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.anddevlab.roomrxandroidexample.presistence.UserDataSource;

/**
 * Created by anddev on 17/09/2017.
 */

public class UserViewModelFactory implements ViewModelProvider.Factory {
  private final UserDataSource mDataSource;

  public UserViewModelFactory(UserDataSource mDataSource) {
    this.mDataSource = mDataSource;
  }

  @Override
  public <T extends ViewModel> T create(Class<T> modelClass) {
    if (modelClass.isAssignableFrom(UserViewModel.class)){
      return (T) new UserViewModel(mDataSource);
    }
    throw new IllegalArgumentException("Unknow View model");
  }
}
