package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener=
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                            if(position==0){
                                 Intent intent=new Intent(MainActivity.this,Category.class);
                                  startActivity(intent);
                            }
                            if(position==1){
                                Intent intent2=new Intent(MainActivity.this,Category2.class);
                                startActivity(intent2);
                            }
                            if(position==2){
                                Intent intent3=new Intent(MainActivity.this,Category3.class);
                                startActivity(intent3);
                            }

                    }
                };
        ListView listView=(ListView)findViewById(R.id.list_types);
        listView.setOnItemClickListener(itemClickListener);
    }
}