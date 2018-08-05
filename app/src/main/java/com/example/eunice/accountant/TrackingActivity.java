package com.example.eunice.accountant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TrackingActivity extends AppCompatActivity {

    private CardView Daily;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        Daily = (CardView)findViewById(R.id.view_daily_plans);

        Daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrackingActivity.this, Dashboard.class);
                startActivity(i);
            }
        });

    }
}
