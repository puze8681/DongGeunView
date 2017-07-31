package com.example.parktaejun.memojang;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parktaejun.memojang.Adapter.ListAdapter;

public class AddMemoActivity extends AppCompatActivity {

    EditText title;
    EditText content;
    Button button;
    ListAdapter adapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memo);

        adapter = new ListAdapter() ;
        title = (EditText)findViewById(R.id.title);
        content = (EditText)findViewById(R.id.content);
        button = (Button)findViewById(R.id.add);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fuck_one), title.getText().toString(), content.getText().toString()) ;
                finish();
            }
        });
    }
}
