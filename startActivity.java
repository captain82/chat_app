package com.captain.ak.brochat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startActivity extends AppCompatActivity {

    private Button mRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mRegBtn = (Button)findViewById(R.id.start_reg_btn);

        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg_intent = new Intent(startActivity.this,RegisterActivity.class);
                startActivity(reg_intent);
            }
        });
    }
}
