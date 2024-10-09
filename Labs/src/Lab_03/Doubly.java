class Node1 {
int data;
        Node1 previous, next;
        Node1 head,tail;


Node1 (int  data)
{
    this.previous = null;
    this.next = null;
    this.data = data;
}
}






public class Doubly {
    int data;
   public static Node1 previous;
   public static Node1 head,tail;
    public void insertAtBeginning(int data) {
        Node1 newnode = new Node1(data);
        Node1 temp = head;
        if (head == null) {
            head =tail= newnode;
        } else {
            head.previous= newnode;
            newnode.next = head;
            head = newnode;

        }}
    public void insertAtEnd(int data) {
        Node1 newnode = new Node1(data);
        if (head == null) {
            head = tail=newnode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newnode;
            newnode.previous = temp;
        }
    }


        public void DeleteFront()
        {
            Node1 n=new Node1(data);
            if(head==null)
            {
                System.out.println("LL is empty ");
            }
            else{
                head=head.next;
                head.previous=null;
            }
        }

    public void DeleteBack()
    {
        Node1 n=new Node1(data);
        if(head==null)
        {
            System.out.println("LL is empty ");
        }
        else{
           Node1 temp=head;
           while(temp.next.next!=null)
           {
               temp=temp.next;
           }


            temp.next=null;
           tail=temp;
        }
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
        Doubly d1=new Doubly();
      //  d1.insertAtBeginning(String.valueOf(1));
        d1.insertAtBeginning(1);
        d1.insertAtEnd(2);
        d1.insertAtEnd(3);
        d1.insertAtEnd(4);
        d1.insertAtEnd(5);
        d1.DeleteFront();
        d1.DeleteBack();
        d1.print();
    }
}
