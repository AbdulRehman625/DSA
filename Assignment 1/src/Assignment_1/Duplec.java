public class Duplec {
    int data;
    Node1 head;
    int size=0;
     void Add(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            size++;
        }
        else{
            Node1 temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }
    }
    void print(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node1 temp=head;
            System.out.println("Original linked list is here:");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
     void removeDuplicates(){
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        Node1 temp1 = head;
        while (temp1!= null) {
            Node1 temp2 = temp1;
            while (temp2.next != null) {
                if (temp2.next.data == temp1.data) {

                    temp2.next = temp2.next.next;
                } else {
                    temp2 = temp2.next;
                }
            }
            temp1=temp1.next;
        }

        Node1 n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;}

    }
    public static void main(String[] args) {
         Duplec d1=new Duplec();

       d1. Add(5);
        d1. Add(3);
        d1. Add(9);
        d1. Add(3);
        d1. Add(9);
        d1. Add(5);

       d1. print();
        System.out.println();
        d1.removeDuplicates();

    }
}