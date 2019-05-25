package StacksAndQueues;


import LinkedLists.Node;

public class Stack <T>{
    Node top;

    public Stack(){
        top = null;
    };

    Node pop() {
        if (top != null) {
            Object item = top.next;
            top = top.next;
            return (Node)item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
        System.out.print(top.data+" - ");
    }

    boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    //finds smallest value in the stack
    Node min(Stack <Integer> stack){
        Node smallest = stack.top;
        Node tmp = stack.top;
        while (tmp.next != null){
            if((int)tmp.data < (int)smallest.data){
                smallest.data = tmp.data;
            }
            tmp = tmp.next;
        }
        System.out.println("Smallest value found : "+smallest.data);
        return smallest;
    }

    public static Stack<Integer> sortStack(Stack<Integer> s){
        Stack<Integer> res = new Stack<>();
        while(!s.isEmpty()){

        }

        return res;
    }

    public static void main(String[] args) {
        Stack <Integer> intStack = new Stack<>();
        for(int i = 0; i<20 ; i++){
            int add = (int)(Math.random()*20)+1;
            intStack.push(add);
        }
        System.out.println("");
        Node test1Node = intStack.min(intStack);
    }
}
