package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Category2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);
        ArrayAdapter<Book> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Book.books2);
        ListView listBooks = (ListView) findViewById(R.id.list_books);
        listBooks.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listBooks, View view, int position, long id) {
                        Intent intent = new Intent(Category2.this, BookCategory2.class);
                        intent.putExtra("bookId",  position);
                        startActivity(intent);
                    }
                };
        listBooks.setOnItemClickListener(itemClickListener);
    }
}