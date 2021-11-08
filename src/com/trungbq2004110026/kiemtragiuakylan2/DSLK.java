package com.trungbq2004110026.kiemtragiuakylan2;

public class DSLK {
    Node head = null;
    Node tail = null;
    Book book;

    public void addFirst(){ // Hàm thêm đầu dslk
        Book book = new Book();
        Node newBook = new Node(book);
        newBook.book.nhapThongTin();
        if(head == null){
            head = newBook;
            tail = newBook;
        }
        else{
            newBook.next = head;
            head = newBook;
        }
    }

    public void addLast(){ // hàm thêm cuối danh sách liên kết
        Book book = new Book();
        Node newBook = new Node(book);
        newBook.book.nhapThongTin();
        if(head == null){
            head = newBook;
            tail = newBook;
        } 
        else{
            tail.next = newBook;
            tail = newBook;
        }
    }

    public void display(){ // Hàm in danh sách
        Node current = head;
        if(head == null){
            System.out.println("DANH SÁCH RỖNG!");
        }
        else{
            while(current != null){
                current.book.inThongTin();
                current = current.next;
            }
        }
    }

    Node find(int key) { // Hàm tìm kiếm một phần tử có trong linkedlist không 
        Node current = head;
        if(head.book.id == key){
            return head;
        }
        while (current != null) {
            if (key == current.next.book.id)
                return current;
            current = current.next;
        }
        return null;
    }

    public void addPreivous(){
        Book book = new Book();
        Node NewBook = new Node(book);
        if(find(NewBook.book.id) == null )
            return;
        Node temp = find(NewBook.book.id);    
        NewBook.book.nhapThongTin();
        NewBook.next = temp.next;
        temp.next = NewBook;
    }

    public void removeFirst() { //Hàm xoá đầu
        if(head == null){
            System.out.println("Danh sách rỗng!");
            return;
        }
        head = head.next;
    }

    public void removeLast(){ //Hàm xoá cuối
        Node current = head;
        if(head.next == null){
            removeFirst();
            return;
        }
        while(current != null){
            if(current.next == tail){
                tail = current;
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

}
