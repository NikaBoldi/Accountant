package com.example.eunice.accountant;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class SignActivity extends AppCompatActivity  implements SignInFragment.SignInListener {

    private SignInFragment signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        signin = new SignInFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentContainer, signin).commit();
    }

    @Override
    public void onSignIn(AutoCompleteTextView Email, EditText Password) {

    }

    @Override
    public void onSignUp() {

    }

    @Override
    public void onForgotPassword(AutoCompleteTextView Email) {

    }
}
