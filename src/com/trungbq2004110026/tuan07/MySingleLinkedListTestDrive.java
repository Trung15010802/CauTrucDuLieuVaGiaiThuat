package com.trungbq2004110026.tuan07;

public class MySingleLinkedListTestDrive {
    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.addNode(1);
        mySingleLinkedList.addNode(2);
        mySingleLinkedList.addNode(3);
        mySingleLinkedList.addNode(4);
        mySingleLinkedList.addFront(4, 0);
        mySingleLinkedList.display();
 
    }
}
