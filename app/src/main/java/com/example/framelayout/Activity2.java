package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    GridView gridView;
    String[] movieNames={"AVENGERS","AGE OF ULTRON","INFINITY WAR","ENDGAME","CAPTAIN AMERICA","WINTER SOLDIER","CIVIL WAR","IRONMAN","IRONMAN II","IRONMAN III","THOR","THE DARK WORLD","RAGNAROK","DOCTOR STRANGE","BLACK PANTHER"};
    int[] movieImages={R.drawable.a2012,R.drawable.a2015,R.drawable.a2018,R.drawable.a2019,R.drawable.cap1,R.drawable.cap2,R.drawable.cap3,R.drawable.iron1,R.drawable.iron2,R.drawable.iron3,R.drawable.thor1,R.drawable.thor2,R.drawable.thor3,R.drawable.ds1,R.drawable.bp1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        gridView = findViewById(R.id.Gridview);

        CustomAdapter customAdapter =new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
            intent.putExtra("name",movieNames[i]);
            intent.putExtra("image",movieImages[i]);
            startActivity(intent);

           }
        });

    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return movieImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row,null);
            //getting view in row_data
            TextView n1 = view1.findViewById(R.id.avengers);
            ImageView n2 = view1.findViewById(R.id.imagess);

            n1.setText(movieNames[i]);
            n2.setImageResource(movieImages[i]);
            return view1;



        }
    }
}
