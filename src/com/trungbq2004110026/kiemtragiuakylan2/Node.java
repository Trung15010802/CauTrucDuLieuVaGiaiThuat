package com.trungbq2004110026.kiemtragiuakylan2;

public class Node {
    Book book;
    Node next;

    public Node() {
        book = null;
        next = null;
    }

    public Node(Book newBook){
        book = newBook;
        next = null;
    }

    public Node(Book newBook, Node node){
        book = newBook;
        next = node;
    }

}
