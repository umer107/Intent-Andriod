package com.umer.andriod.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    EditText et_username, et_password;
    Button btn_login1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = (EditText)findViewById(R.id.et_userName);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_login1 = (Button)findViewById(R.id.btn_login);
        btn_login1.setOnClickListener(this);



    }
    public  void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_login:
                Intent intent = new Intent(getBaseContext() ,IntentActivity.class);
                intent.putExtra("UserName" ,et_username.getText().toString() );
                intent.putExtra("Pasword" ,et_password.getText().toString() );
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
    }
}
