/*
 class Node {
    String name;
    Node previous, next;
    Node head,tail;

 
    Node (String  name)
    { 
        this.previous = null;
        this.next = null; 
        this.name = name;
    } 
}  
 
public class DoubleLinkedList {

    Node head;

    // Add node with name in beginning of linkedlist, name as 
    //parameter
    public void insertAtBeginning(String name) {
        Node newnode = new Node(name);
        Node temp = head;
        if (head == null) {
            head = newnode;
        } else {
            head.previous = newnode;
            newnode.next = head;
            head = newnode;

        }


    }

    // Add node in beginning of linkedlist, node as parameter   
    public void insertAtBeginning(Node node) {


        if (head == null) {
            head = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }

    }

    // Add node in end of linkedlist, name as parameter   
    public void insertAtEnd(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newnode;
            newnode.previous = temp;
        }
    }

    // Add node in end of linkedlist, node as parameter   
    public void insertAtEnd(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = node;
            node.previous=temp;
        }

    }

    // Add node after name which is provided as param , name and 
//node as params   
    public void insertAfterName(String name, Node node,String name1) {
        int index=1;
        Node newnode=new Node(name1);

        Node temp=head;
        while(temp.next!=null){
            if(temp.name == name){

                break;
            }
            index++;
            temp=temp.next;


        }
        if(temp.next==null){
            System.out.println("name not found soory");

        }
        Node temp1=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        newnode.next=temp1.next;
        temp1.next=newnode;

    }

    // Add node before name which is provided as param , name 
//and node as params   
    public void insertBeforeName(String name, Node node,String name1) {
        int index=1;
        Node newnode=new Node(name1);

        Node temp=head;
        while(temp.next!=null){
            if(temp.name == name){

                break;
            }
            index++;
            temp=temp.next;

        }
        if(temp.next==null){
            System.out.println("name not found soory");

        }
        Node temp1=head;
        for(int i=1; i<index-1; i++){
            temp1=temp1.next;
        }
        newnode.next=temp1.next;
        temp1.next=newnode;


    }

    // Make double linkedlist as Circular Double LinkedList
     void makeCircular() {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
         temp.next=head;
         head.previous=temp;

         Node temp1=head;
 head.previous=temp.next;
          temp.next=head;


    }



    // Print all the nodes in linkedlist, make sure it works on 
//circular double linkedlist   
    public void printAll() {
        Node temp1=head;
        while(temp1.next!=head){
            System.out.println(temp1.name);
            temp1=temp1.next;
        }
        System.out.println(temp1.name);

        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name+"-->");
            temp = temp.next;
        }

        System.out.println("null");

    }


    // Test the class          
    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
       Node head=null;
        Node n1=new Node("daradrada");
        ll.insertAtBeginning(n1);
        ll.insertAtBeginning("Ahmed");
        ll.insertAtEnd("Ali");
        Node n2=new Node("xyz");
        ll.insertAtEnd(n2);
        ll.insertAfterName("Ahmed",head,"zubir");
        ll.insertBeforeName("zubir",head,"GM");
        ll.makeCircular();


        ll.printAll();}



    }

*/
