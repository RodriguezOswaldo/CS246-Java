package com.testColl;

public class BookOfMormon  implements  Comparable<BookOfMormon>{

    String name;
    BookOfMormon(String name){
        this.name = name;
    }

    @Override
    public int compareTo(BookOfMormon o) {
        return 0;
    }
}
