package com.ngamolsky.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.materialme.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView sportsTitle = (TextView)findViewById(R.id.titleDetail);
        ImageView sportsImage = (ImageView)findViewById(R.id.sportsImageDetail);


        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        sportsTitle.setText(title);


        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).into(sportsImage);

    }
}
