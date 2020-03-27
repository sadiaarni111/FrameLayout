package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.framelayout.R.id.imageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView i1;
    ImageView i2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView)findViewById(imageView);
        i2=(ImageView)findViewById(R.id.imageView2);
        b1=(Button)findViewById(R.id.button1);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {

        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== imageView)
        {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        }
        else
        {
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }

    }
}
