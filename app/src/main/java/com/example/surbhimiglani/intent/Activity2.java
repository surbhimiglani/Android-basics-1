package com.example.surbhimiglani.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle data=getIntent().getExtras();
        if(data==null){
            return;
        }
        String message=data.getString("message");
        final TextView textView2=(TextView) findViewById(R.id.textView2);
        textView2.setText(message);
    }
    public void onClick(View view){
        Intent i2=new Intent(this,Activity1.class);
        startActivity(i2);}
}
