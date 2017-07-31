package com.example.parktaejun.memojang;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    ImageView imageView;
    TextView titleView;
    TextView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView = (ImageView)findViewById(R.id.image);
        titleView = (TextView)findViewById(R.id.title);
        contentView = (TextView)findViewById(R.id.content);

        Intent intent = getIntent();

        Drawable imageview = Drawable.createFromPath(intent.getExtras().getString("image"));
        String title = intent.getExtras().getString("title");
        String content = intent.getExtras().getString("content");
        imageView.setImageDrawable(imageview);
        titleView.setText(title);
        contentView.setText(content);

    }
}
