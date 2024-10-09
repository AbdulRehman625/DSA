public class SingleLinkedList {
    Node1 head;
    Node1 tail;
    int data;
    void addfront(int data){
        Node1 newnode=new Node1(data);
        if(head==null){
            head=tail=newnode;


        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void addback(int data){
        Node1 newnode=new Node1(data);
        if(head==null){
            head=tail=newnode;

        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }

    void deltestart(){
        head=head.next;
    }
    void deletelast(){
       /* if(head==null){
            System.out.println("linked list is empty");
        } else if (size==1) {
            deltestart();

        }*/
        Node1 temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList ll=new SingleLinkedList();
        ll.addfront(1);
        ll.addback(2);
        ll.addback(3);
        ll.addback(4);
        ll.addback(5);
        ll.deltestart();
        ll.deletelast();
        ll.print();

    }

}
