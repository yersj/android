package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ArrayAdapter<Book> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Book.books);
        ListView listBooks = (ListView) findViewById(R.id.list_books);
        listBooks.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listBooks, View view, int position, long id) {
                        Intent intent = new Intent(Category.this, BookCategory.class);
                        intent.putExtra("bookId",  position);
                        startActivity(intent);
                    }
                };
        listBooks.setOnItemClickListener(itemClickListener);
    }


}
