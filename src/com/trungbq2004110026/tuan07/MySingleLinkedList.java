package com.trungbq2004110026.tuan07;

public class MySingleLinkedList {
    Node head = null;
    Node tail = null;

    public MySingleLinkedList() {
    }

    void addNode(int data) { // Hàm thêm phần tử
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addNodeHead(int data) { // Hàm thêm vào đầu các phần tử
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void display() { // Hàm hiển thị các phần tử trong mảng
        Node current = head;
        if (head == null) {
            System.out.println("DANH SÁCH RỖNG!");
        } else {
            System.out.println("Các nút trong danh sách liên kết đơn: ");
            while (current != null) {
                System.out.print(current.info + " ");
                current = current.next;
            }
        }
    }

    boolean find(int key) { // Hàm tìm kiếm một phần tử có trong mảng không 
        Node current = head;
        while (current != null) {
            if (key == current.info)
                return true;
            current = current.next;
        }
        return false;
    }

    public void addFront(int key, int data) { //Hàm thêm một phần tử trước một phần tử
        // Node ban đầu.....
        Node current = head;

        if(head.info == key){
            addNodeHead(data);
        }

        while (current.next != null) {
            if (current.next.info == key) {
                Node n = new Node(data);
                n.next = current.next;
                current.next = n;
                return;
            }
            current = current.next;
        }
    }

    public void removeHead() { //Hàm xoá đầu
        if(head == null){
            return;
        }
        head = head.next;
    }

    public void removeTail(){ //Hàm xoá đuôi
        Node current = head;
        if(head.next == null){
            removeHead();
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

    public void remove(int key) { // Hàm xoá thông tin một phần tử
        //Nếu head = key thì xoá head
        if(head.info == key){
            removeHead();
            return;
        }
        //Nếu key = tail thì xoá tail.
        if(tail.info == key){
            removeTail();
            return;
        }  
        
        Node current = head, temp = null;
        while (current != null && current.info != key) {
            temp = current;
            current = current.next;
        }
        temp.next = current.next;
    }

    public void edit(int key, int data){ //Hàm sửa thông tin một phần tử
        Node current = head;
        while(current != null){
            Node n = new Node(data);
            if(current.info == key){
                current.info = n.info;
                return;
            }
            current = current.next;
        }
    }    
}
