package com.kodilla.modul75.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory  = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberBooksAfter2007 = 0;
        for(Book book: books){
            if(book.getYearOfPublication() > 2007){
                numberBooksAfter2007++;
            }
        }
        Assert.assertEquals(3, numberBooksAfter2007);
    }

    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        /*int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();*/
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();

        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
