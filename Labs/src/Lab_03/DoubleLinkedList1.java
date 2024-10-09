/*
public class DoubleLinkedList1 {

        public static Node head;
        public static void insertAtBeginning(String name)
        {
            Node newNode=new Node(name);
            if(head==null){
                head=newNode;
            }
            else{

                newNode.next=head;
                head.previous=newNode;
                head=newNode;
            }
        }
        public static Node insertAtBeginning(String name,Node head)
        {
            Node newNode=new Node(name);
            if(head==null){
                head=newNode;
                return head;
            }
            else{
                Node temp=head;
                newNode.next=temp;
                temp.previous=newNode;
                head=newNode;
                return head;
            }
        }
        public static void insertAtEnd(String name)
        {
            Node newNode=new Node(name);
            if(head==null){
                head=newNode;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
                newNode.previous=temp;
            }
        }
        public static Node insertAtEnd(String name,Node head1)
        {
            Node newNode=new Node(name);
            if(head1==null){
                head1=newNode;
                return head1;
            }
            else{
                Node temp=head1;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
                newNode.previous=temp;
                return head1;
            }
        }
public static void Print(Node head){
           if (head==null){
               System.out.println("Linked List is empty");
           }
           else{
               Node temp=head;
               while(temp!=null){
                   System.out.print(temp.name+" ");
                   temp=temp.next;
               }
           }
        }
        public static void Print(){
           if (head==null){
               System.out.println("Linked List is empty");
           }
           else{
               Node temp=head;
               while(temp!=null){
                   System.out.print(temp.name+" ");
                   temp=temp.next;
               }
           }
        }

        public static Node insertAfterName(String name, Node head ,String name1)
        {
            Node newNode =new Node(name1);
            int index=1;
            Node temp=head;
            Node temp1=head;
            while(temp1.next!=null){
                if(temp1.name==name){
                    break;
                }
                index++;
                temp1=temp1.next;
            }
            if(temp1.next==null&&temp1.name!=name){
                System.out.println("Name not found");
                return head;
            }

            for(int i=1;i<index;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            return head;
        }
        public static Node insertBeforeName(String name, Node head,String name1)
        {
            Node newNode =new Node(name1);
            int index=1;
            Node temp=head;
            Node temp1=head;
            while(temp1.next!=null){
                if(temp1.name==name){
                    break;
                }
                index++;
                temp1=temp1.next;
            }
            if(temp1.next==null&&temp1.name!=name){
                System.out.println("Name not found");
                return head;
            }

            for(int i=1;i<index-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            return head;
        }
        // Make double linkedlist as Circular Double LinkedList
        public static void makeCircular()
        {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
            head.previous=temp;
            Node temp1=head;
        }
        public static void printAll(Node head1){
            if(head==null){
                System.out.println("Linked list is empty");
            }
            else{
                Node temp=head;
                System.out.print("Circular Linked List is : ");
                while(temp.next!=head){
                    System.out.print(temp.name+" ");
                    temp=temp.next;
                }
                System.out.print(temp.name+" ");
                System.out.println();
            }
            if(head1==null){
                System.out.println("Linked List is empty");
            }
            else{
                System.out.print("Other Linked list is : ");
                Node temp1=head1;
                while(temp1!=null){
                    System.out.print(temp1.name+" ");
                    temp1=temp1.next;
                }
            }
        }
        public static void main(String[] args) {
            Node head1=null;
            head1=insertAtBeginning("Rehman",head1);
            head1=insertAtBeginning("Ali", head1);
            head1=insertAtBeginning("GM", head1);
            insertAtBeginning("Rehman Ali");
            insertAtBeginning("Abdul");
            insertAtEnd("Mirani");
            head1=insertAtEnd("Momal", head1);
            //  Print();
            System.out.println();
            //  Print(head1);
            System.out.println();
            head1=insertAfterName("Ali", head1, "Ameen");
            // Print(head1);
            System.out.println();
            head1=insertBeforeName("Ameen", head1, "Mujtaba");
            //Print(head1);
            makeCircular();
            printAll(head1);
        }
    }


*/
