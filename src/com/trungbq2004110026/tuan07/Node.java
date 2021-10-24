package com.trungbq2004110026.tuan07;

public class Node {
    int info;
    Node next;
    
    public Node() {
    }
    
    public Node(int data){
        info = data;
    }

    public Node(int x, Node p){
        info = x;
        next = p;
    }

}
