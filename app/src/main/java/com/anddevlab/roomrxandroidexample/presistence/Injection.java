package com.anddevlab.roomrxandroidexample.presistence;

import android.content.Context;
import com.anddevlab.roomrxandroidexample.presistence.database.UserDatabase;
import com.anddevlab.roomrxandroidexample.ui.auth.UserViewModel;
import com.anddevlab.roomrxandroidexample.ui.auth.UserViewModelFactory;

/**
 * Created by anddev on 17/09/2017.
 */

public class Injection {
  public static UserDataSource provideUserDataSource(Context context){
    UserDatabase userDatabase = UserDatabase.getInstance(context);
    return new LocalDataSource(userDatabase.userDAO);
  }
  public static UserViewModelFactory ProvideUserViewModelFactory(Context context){
    UserDataSource userDataSource = provideUserDataSource(context);
    return new UserViewModelFactory(userDataSource);
  }
}
