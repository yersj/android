package com.example.listview;

public class Book {
 private String name;
 private String description;
 private int imageId;
 private String price;
    public Book(String name, String description, int imageId,String price) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
        this.price=price;
    }

    public static final Book[] books={
         new Book("Shoe dog","Bill Gates named Shoe Dog one of his five favorite books of 2016 and called it “an amazing tale, a refreshingly honest reminder of what the path to business success really looks like. It’s a messy, perilous, and chaotic journey, riddled with mistakes, endless struggles, and sacrifice. Phil Knight opens up in ways few CEOs are willing to do.”",R.drawable.nike,"9$"),
         new Book("Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future","Elon Musk spotlights the technology and vision of Elon Musk, the renowned entrepreneur and innovator behind SpaceX, Tesla, and SolarCity, who sold one of his Internet companies, PayPal, for $1.5 billion. Ashlee Vance captures the full spectacle and arc of the genius's life and work, from his tumultuous upbringing in South Africa and flight to the United States to his dramatic technical innovations and entrepreneurial pursuits.",R.drawable.ilon,"12$")
    };
    public static final Book[] books2={
     new Book("Guinnes world records","Get ready for a new decade of record-breaking with Guinness World Records 2020. Fully updated and redesigned, GWR2020 celebrates the latest record-breaking achievements, covering topics from the classic - amazing animals, jaw-dropping geography and spectacular sporting achievements - to the cutting-edge - including viral sports and robots and AI.",R.drawable.guinnes,"29$"),
            new Book("Harry Potter","Harry Potter has no idea how famous he is. That's because he's being raised by his miserable aunt and uncle who are terrified Harry will learn that he's really a wizard, just as his parents were. But everything changes when Harry is summoned to attend an infamous school for wizards, and he begins to discover some clues about his illustrious birthright. From the surprising way he is greeted by a lovable giant, to the unique curriculum and colorful faculty at his unusual school, Harry finds himself drawn deep inside a mystical world he never knew existed and closer to his own noble destiny.",R.drawable.harrypotter,"48$")
    };
    public static final Book[] books3={
            new Book("World cuisine. 500 recipes. Step by step","This unusual edition includes the best recipes from around the world - Italian, French, Indian, Chinese, Arabic, Japanese, English ... The most successful, delicious, easy-to-use, honed by centuries-old tradition and always relevant dishes that have become international are collected here under one cover.",R.drawable.cooking1,"80$"),
            new Book("Professional chef","The third edition of the \"Chef's Handbook\" entitled \"The Professional Chef\" from the American Culinary Institute in Russian (translation of the revised and updated ninth edition) is a testament to his success and popularity in our country. The book is aimed at people who are professionally involved in this business and want to know more about various products, cooking technologies, measures, recipes, spices and ingredients, sauces, their use in various cuisines of the world.",R.drawable.cooking2,"92$")
    };

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }



    public String getDescription() {
        return description;
    }



    public int getImageId() {
        return imageId;
    }



    @Override
    public String toString() {
        return this.name;
    }
}