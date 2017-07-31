package com.example.parktaejun.memojang;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.parktaejun.memojang.Adapter.ListAdapter;
import com.example.parktaejun.memojang.Data.Data;

public class MainActivity extends AppCompatActivity {

    ListView listview ;
    ListAdapter adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adapter 생성
        adapter = new ListAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);
        button = (Button)findViewById(R.id.add);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.fuck_one), "DongGeun", "qudtls") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.fuck_two), "Fuck", "tlqkf") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.fuck_three), "Hello", "qbdtls");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Data item = (Data) adapterView.getItemAtPosition(i) ;

                Intent listIntent = new Intent(MainActivity.this, ItemActivity.class);
                listIntent.putExtra("image", String.valueOf(item.getImage()));
                listIntent.putExtra("title", item.getTitle());
                listIntent.putExtra("content", item.getContent());

                startActivity(listIntent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent memoIntent = new Intent(MainActivity.this, AddMemoActivity.class);
                startActivity(memoIntent);
            }
        });

    }
}
