package com.anddevlab.roomrxandroidexample.ui;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.anddevlab.roomrxandroidexample.R;

public class AuthActivity extends AppCompatActivity {


  @BindView(R.id.login_progress)
  ProgressBar loginProgress;
  @BindView(R.id.email)
  TextInputEditText email;
  @BindView(R.id.password)
  EditText password;
  @BindView(R.id.lytSingIn)
  LinearLayout lytSingIn;
  @BindView(R.id.etName)
  TextInputEditText etName;
  @BindView(R.id.etPhone)
  TextInputEditText etPhone;
  @BindView(R.id.etEmail)
  TextInputEditText etEmail;
  @BindView(R.id.etPass)
  EditText etPass;
  @BindView(R.id.lytRegister)
  LinearLayout lytRegister;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    ButterKnife.bind(this);

  }

  @OnClick({R.id.btnSingIn, R.id.btnRegister,R.id.tvRegister})
  public void onViewClicked(View view) {
    switch (view.getId()) {
      case R.id.btnSingIn:

        break;
      case R.id.btnRegister:

        break;
      case R.id.tvRegister:
        lytRegister.setVisibility(View.VISIBLE);
        lytSingIn.setVisibility(View.GONE);
        break;
    }
  }


}

