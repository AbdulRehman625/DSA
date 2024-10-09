
 /*class Node2 {
     int data;

     Node head;

    *//* Node2(int data) {
         this.data = data;
         this.next = null;
     }*//*
 }*/
public class ReversedLink {
    int data;
    Node1 head;
    int size=0;
    void add(int  data){
        Node1 newnode=new Node1(data);
        if(head==null){
            head=newnode;
            size++;

        }
        else{
            Node1 temp=head;
            while(temp.next!=null){

                temp=temp.next;

            }
            temp.next=newnode;
            size++;
        }
    }
    void ptint(){
        if(head==null){
            System.out.println("linkedlist is empty");

        }
        else{
            Node1 temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();
        }
    }
    void nth(int n){
        Node1 temp=head;
        while(size!=n){
            temp=temp.next;
            size--;
        }
        System.out.println("from the last secod node contain the data "+temp.data);
    }

    public static void main(String[] args) {
        ReversedLink l1=new ReversedLink();
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(10);
        l1.add(12);
        l1.nth(2);


        l1.ptint();


    }


}
