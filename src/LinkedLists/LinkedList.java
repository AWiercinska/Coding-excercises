package LinkedLists;

public class LinkedList <T>{
    private Node head;

    public LinkedList(){
        head=null;
    }

    void addToFront(T data){
        Node newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    void addToTail(T data){
        Node newNode = new Node(data);

    }

    void displayList(){
        Node tmp = head;
        while (tmp.next != null){
            System.out.print(tmp.data.toString()+" - ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    static void removeDuplicates(Node head){
        if(head == null)
            return;

        Node previous = head;
        Node current = previous.next;

        while(current != null){
            Node runner = head;
            while (runner != current){
                if(runner.data == current.data){
                    Node tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }

                runner = runner.next;
            }

            if(runner == current){
                previous = current;
                current = current.next;
            }
        }
    }

    static Node findMiddleNode(Node head){
        if(head == null)
            return null;

        Node tmp = head;
        int howManyNodes = 0;
        while (tmp.next != null){
            howManyNodes++;
            tmp = tmp.next;
        }

        tmp = head;
        Node nodeToReturn = null;
        int currentNode = 0;
        while (tmp.next != null){
            currentNode++;
            if(currentNode == (howManyNodes/2+1)){
                nodeToReturn = tmp;
                break;
            }
            tmp = tmp.next;
        }

        return nodeToReturn;
    }

    static boolean removeMiddleNode(Node middleNode){
        if(middleNode == null || middleNode.next == null){return false;}
        else{
            Node next = middleNode.next;
            middleNode.data = next.data;
            middleNode.next = next.next;
        }
        return true;

    }

    static void addRandomValuesInteger(int howManyValues, LinkedList<Integer> list){
        for(int i=0; i<=howManyValues; i++){
            list.addToFront((int)(Math.random()*10)+1);
        }
    }

    static void addRandomValuesChar(int howManyValues, LinkedList<Character> list){
        for(int i=0; i<=howManyValues; i++){
            char tmp;
            do{
                tmp = (char)((int)(Math.random()*90)+65);
            }while (tmp < 'A' || tmp >'Z');

            list.addToFront(tmp);
        }
    }

    static LinkedList addListNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2){
        int num1=0,num2=0;

        Node tmp = list1.head;
        int digits = 1, tmpVal;
        while(tmp != null){
            tmpVal = (int)tmp.data * digits;
            num1 += tmpVal;
            digits *= 10;
        }

        tmp = list2.head;
        digits = 1;
        while(tmp != null){
            tmpVal = (int)tmp.data * digits;
            num2 += tmpVal;
            digits *= 10;
        }

        int sum = num2 + num1;
        LinkedList result = new LinkedList<Integer>();

        return result;

    }

    static LinkedList returnFromN(int n, Node head){

        LinkedList result = new LinkedList<Integer>();
        Node tmp = head;
        int counter = 0;

        while (tmp.next != null){
            if(counter == n)
                break;
            counter++;
            tmp = tmp.next;
        }

        while (tmp.next != null){
            result.addToFront(tmp.data);
            tmp = tmp.next;
        }

        return  result;

    }

    public static void main(String[] args) {
        //=======duplicate removal========
        LinkedList testList = new LinkedList<Integer>();
        addRandomValuesInteger(10,testList);
        testList.displayList();

        System.out.println("List after duplicate removal");
        removeDuplicates(testList.head);
        testList.displayList();

        //=========deleting middle Node=======
        System.out.println("");
        LinkedList testList2 = new LinkedList<Character>();
        addRandomValuesChar(5, testList2);
        testList2.displayList();

        Node tmpNode = findMiddleNode(testList2.head);
        removeMiddleNode(tmpNode);
        System.out.println("After deleting middle node");
        testList2.displayList();

        //======Linked List numbers addition====
        LinkedList number1 = new LinkedList<Integer>();
        number1.addToFront(3);
        number1.addToFront(4);
        number1.addToFront(5);
        LinkedList number2 = new LinkedList<Integer>();
        number2.addToFront(1);
        number2.addToFront(2);
        number2.addToFront(9);
        System.out.println("");

        //=======snip the list in given point======
        System.out.println("list before snipping");
        testList.displayList();
        System.out.println("List after snipping");
        testList =  returnFromN(2,testList.head);
        testList.displayList();



    }
}
