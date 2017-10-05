package com.example.surbhimiglani.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent j=new Intent(this,MyService.class);
        startService(j);
    }
    public void onClick(View view){
        Intent i=new Intent(this,Activity2.class);

        final EditText editText=(EditText) findViewById(R.id.editText);
        String userMessage=editText.getText().toString();
        i.putExtra("message",userMessage);

        startActivity(i);
    }
}
