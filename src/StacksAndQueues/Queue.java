package StacksAndQueues;

import LinkedLists.Node;

public class Queue {

    Node first,last;
    int capacity, currentSize;

    public Queue(int capacity, Node first){
        this.capacity=capacity;
        currentSize = 0;
        this.first=first;
    }

    void enqueue(Object item) {

        if(first.next == null){
            Node t = new Node(item);
            first.next = t;
            last = t;
        }

        if(currentSize < capacity){
            Node t = new Node(item);
            last.next = t;
            last = t;

        }else{
            System.out.println("Queue is full");
        }
    }

}
