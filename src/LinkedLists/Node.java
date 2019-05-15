package LinkedLists;

public class Node <T>{
    T data;
    Node next = null;

    public Node (T data){
        this.data=data;
    }

    void printNodeInfo(){
        System.out.println(data.toString());
    }

}
