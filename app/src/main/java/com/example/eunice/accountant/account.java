package com.example.eunice.accountant;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.fragment;

public class account extends AppCompatActivity {

    private Button next;

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
//        FragmentTransaction transaction
//                = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.fragmentContainer, signin).commit();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(account.this, SignActivity.class);
                startActivity(i);
            }
        }, 2000);

        next= (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(account.this, SignActivity.class);
                startActivity(i);

            }
        });
    }
}
