package LinkedLists;

public class Node <T>{
    public T data;
    public Node next = null;

    public Node (T data){
        this.data=data;
    }

    void printNodeInfo(){
        System.out.println(data.toString());
    }

}
