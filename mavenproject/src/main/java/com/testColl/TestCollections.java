package com.testColl;

import java.util.Map;
import java.util.TreeMap;

public class TestCollections {

    public static void main(String[] args ){
        Map<BookOfMormon, String> bookofMormonPersonages = new TreeMap<>();
        bookofMormonPersonages.put(new BookOfMormon("Alma"), "Prophet" );
        bookofMormonPersonages.put(new BookOfMormon("Nephi"), "Prophet" );
        bookofMormonPersonages.put(new BookOfMormon("Laman"), "Lamanite" );
        bookofMormonPersonages.put(new BookOfMormon("Lemuel"), "Lamanite" );

        for (Map.Entry<BookOfMormon, String> element : bookofMormonPersonages.entrySet()){
            System.out.println(element.getKey().name + element.getValue());
        }
    }
}
