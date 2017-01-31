package com.example.deepakrattan.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private Button btnLoad, btnPrev;
    private EditText edtName1, edtPswd1;
    private SharedPreferences sp;
    private String name, passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnPrev = (Button) findViewById(R.id.btnPrev);
        edtName1 = (EditText) findViewById(R.id.edtName1);
        edtPswd1 = (EditText) findViewById(R.id.edtPassword1);

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = getSharedPreferences("My_Prefs", Context.MODE_PRIVATE);
                name = sp.getString("name", null);
                passwd = sp.getString("password", null);
                edtName1.setText(name);
                edtPswd1.setText(passwd);

            }
        });
    }
}
