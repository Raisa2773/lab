package com.example.networklab.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText  et1 , et2 , et3 , et4,et5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1=findViewById(R.id.name);
        et2=findViewById(R.id.phn);
        et3=findViewById(R.id.email);
        et4=findViewById(R.id.pass);
        et5=findViewById(R.id.pass2);
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}
