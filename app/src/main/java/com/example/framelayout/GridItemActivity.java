package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {

    TextView n1;
    ImageView n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        n1=findViewById(R.id.griddata);
        n2=findViewById(R.id.image);

        Intent intent = getIntent();
        n1.setText(intent.getStringExtra("name"));
        n2.setImageResource(intent.getIntExtra("image",0));
    }
}
