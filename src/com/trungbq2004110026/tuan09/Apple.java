package com.trungbq2004110026.tuan09;

public class Apple {
    Node head = null;
    Node tail = null;

    
    void addTail(){     
        Node newApple = new Node();
        newApple.nhapThongTin();
        if(head == null){
            head = newApple;
            tail = newApple;
        }
        else{
            tail.next = newApple;
            tail = newApple;
        }
    }

    void addHead(){
        Node newApple = new Node();
        newApple.nhapThongTin();
        if(head == null){
            head = newApple;
            tail = newApple;
        }
        else{
            newApple.next = head;
            head = newApple;
        }
    }

    Node find(int key) { // Hàm tìm kiếm một phần tử có trong linkedlist không 
        Node current = head;
        while (current != null) {
            if (key == current.next.id)
                return current;
            current = current.next;
        }
        return null;
    }

    void addFrontApple(int id){
        Node newApple = new Node();
        if(find(id) == null )
            return;
        Node temp = find(id);    
        newApple.nhapThongTin();
        newApple.next = temp.next;
        temp.next = newApple;
    }

    void removeTail(){
        Node current = head;
        if(head.next == null){
            head = null;
            return;
        }
        while(current != null){
            if(current.next == tail){
                current.next = null;
                return;
            }
            current = current.next;
        }
        
    }

    void display(){
        Node current = head;
        if(head == null){
            System.out.println("DANH SÁCH RỖNG!");
        }
        else{
            while(current != null){
                current.inThongTin();
                current = current.next;
            }
        }
    }

    void selectionSort(){
        Node current = head;
        Node index;
        if(head == null)
            return;
        while(current != null){
            index = current.next;
            while(index != null){
                if(index.weight < current.weight){
                    //Hoán vị id
                    int temp = index.id;
                    index.id = current.id;
                    current.id = temp;
                    //Hoán vị weight
                    double temp1 = index.weight;
                    index.weight = current.weight;
                    current.weight = temp1;
                    //Hoán vị color
                    String temp2 = index.color;
                    index.color = current.color;
                    current.color = temp2;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    void search(int keyId){
        Node current = head;
        while(current != null){
            if(current.id == keyId){
                System.out.println("Táo đã tìm: ");
                current.inThongTin();
                return;
            }
            current = current.next;
        }
        System.out.println("Không tìm thấy táo!!!");
    }

}
