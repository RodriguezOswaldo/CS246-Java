package com.testColl;

import java.util.*;

public class TestCollections {

//    public static void main(String[] args ){
//        Map<BookOfMormon, String> bookofMormonPersonages = new TreeMap<>();
//        bookofMormonPersonages.put(new BookOfMormon("Alma"), "Prophet" );
//        bookofMormonPersonages.put(new BookOfMormon("Nephi"), "Prophet" );
//        bookofMormonPersonages.put(new BookOfMormon("Laman"), "Lamanite" );
//        bookofMormonPersonages.put(new BookOfMormon("Lemuel"), "Lamanite" );
//
//        for (Map.Entry<BookOfMormon, String> element : bookofMormonPersonages.entrySet()){
//            System.out.println(element.getKey().name + element.getValue());
//        }
//    }

    public static void main(String[] args ){
        List<BookOfMormon> bookofMormonPersonages = new ArrayList<>();
        bookofMormonPersonages.add(new BookOfMormon("Alma"));
        bookofMormonPersonages.add(new BookOfMormon("Nephi") );
        bookofMormonPersonages.add(new BookOfMormon("Laman") );
        bookofMormonPersonages.add(new BookOfMormon("Lemuel"));
        //two different ways to iterate
        //This one
        Iterator<BookOfMormon> iterator = bookofMormonPersonages.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().name);
        }
        //And this one
        Collections.sort(bookofMormonPersonages);
        System.out.println("");
        for(BookOfMormon element : bookofMormonPersonages){
            System.out.println(element.name);
        }
    }
}
