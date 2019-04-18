package com.example.alligator.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          user = (EditText)findViewById(R.id.userrname);
          pass = (EditText)findViewById(R.id.password);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(user.getText().toString(),pass.getText().toString());
            }
        });
    }
 private void login (String username , String password){
        if (username.equals("admin")  && (password.equals("1234")))
        {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();
        }
 }
}
