package com.umer.andriod.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    TextView tv_user , tv_password;
    String userName , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Bundle bundle = getIntent().getExtras();
        userName = bundle.getString("UserName");
        password = bundle.getString(("Pasword"));
        tv_user = (TextView)findViewById(R.id.et_userShow);
        tv_user.setText(userName);
        tv_user = (TextView)findViewById(R.id.et_passwordShow);
        tv_user.setText(password);






    }
}
