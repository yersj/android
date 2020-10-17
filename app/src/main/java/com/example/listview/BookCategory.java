package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookCategory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_category);
        int bookId = (Integer) getIntent().getExtras().get("bookId");
        Book book;
        book = Book.books[bookId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(book.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(book.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(book.getImageId());
        photo.setContentDescription(book.getName());

        TextView price = (TextView)findViewById(R.id.price);
        price.setText("Price:"+book.getPrice());

    }

}