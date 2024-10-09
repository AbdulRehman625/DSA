public class Trial2 {

        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }}
   public static int size;


       public static Node head;
       // public static Node tail;
        public void  addfrist(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=newnode;
                return;
            }
            else{

                newnode.next=head;
                head=newnode;
            }}
        public void addlast(int data){
            Node newnode=new Node(data);
            size++;
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

            }}
    public void addat(int index,int data){
        Node newnode=new Node(data);
            if(head==null){
                head=newnode;
            }

            Node temp=head;
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
    }
     void removefrist(){
            if(size==0){
                System.out.println("Linked list is empty");
                return ;
            }
            head=head.next;
     }
     void removelast(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
              temp.next=null;
         size--;
     }
     public void Reversed(){
            Node previous=null;
            Node current=head;
            Node next;
            while(current!=null){
                next=current.next;
                current.next=previous;
                previous=current;
                current=next;
            }
            head=previous;
     }
     void removenth( int n){
            int size=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                size++;
            }
            if(n==size){
                head=head.next; //remove frist
                return;
            }
            int i=1;
            int index=size-n;
            Node prev=head;
            while(i<index){
                prev=prev.next;
                i++;

            }
     prev.next=prev.next.next;
            return;
     }
     //slow fast approch
     public Node findmid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next; //step 1
                fast=fast.next.next;
            }
            return slow;
     }
     public boolean cheakPilndrome(){
            if(head==null || head.next==null){
                return true;
            }
            Node midnode=findmid(head);
            Node pre=null;
            Node curr=midnode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=pre;
                pre=curr;
                curr=next;

            }
            Node Rigth=pre; // rigth half head;
         Node left=head;
         while(Rigth!=null){
             if(left.data!=Rigth.data){
                 return false;
             }
             left=left.next;
             Rigth=Rigth.next; //updata  here
         }
         return true;
     }
        public void Print(){
            if(head==null){
                System.out.println("linked list is empty");
                return ;
            }

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("->");
        }


        public static void main(String[] args) {
            Trial2 tt=new Trial2();
            tt.Print();
            tt.addlast(1);
            tt.addlast(2);
            tt.addlast(3);
           tt.addlast(4);
           tt.addlast(5);
            tt.Print();
          //  System.out.println(tt.cheakPilndrome()); //cheaked it is working.


           // tt.Print();
         /*   tt.removefrist();
            tt.Print();
            tt.removelast();
            tt.Print();*/

          //  System.out.println("size is here"+size); //should be 5
            System.out.println("Reversed liinked list is here"+" ");
            tt.Reversed();
            tt.Print();
          //  tt.removenth(3);
            //tt.Print();





        }
    }


