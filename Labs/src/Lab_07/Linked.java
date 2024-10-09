public class Linked {
   public  static class Node{
        int data;

        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }


    }
    public static Node head;
    public void add(int data){

       Node newnode=new Node(data);
       if(head==null){
           head=newnode;
           return;
       }
       else{
       Node temp=head;

       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=newnode;
       temp=newnode;
    }
}
void print(Node head){
        if(head==null){
            return;
        }
    System.out.print(head.data+" ");

            print(head.next);


}

public void Display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }


        }



    public static void main(String[] args) {
        Linked ll=new Linked();
        long stime=System.nanoTime();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        long ett=System.nanoTime();
        long ttt=ett-stime;


        System.out.print("display here through itretive is: ");
        ll.Display();
        System.out.println();
        System.out.println("Tiime taken by itretive  is "+ttt);

       System.out.println();
        System.out.print("display through recusrsion is :  ");
        ll.print(head);
        long ee=System.nanoTime();
        long tl=ee-stime;
        System.out.println();
        System.out.println("time taken by through recursion is here "+tl);


    }
}
