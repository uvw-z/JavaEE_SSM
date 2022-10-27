package com.cqust.entity;

import org.springframework.stereotype.Component;

@Component("mybook") //Annotation
public class Book {
    @Override
    public String toString() {
        return "Book{}";
    }
}
