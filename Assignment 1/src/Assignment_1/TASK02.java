public class TASK02 {
    int data;
    Node1 head;
    void add(int data){
        Node1 newnode=new Node1(data);
        if(head==null){
            head=newnode;
    }
        else{

            Node1 temp=head;
            while(temp.next!=null){

                temp=temp.next;

            }
            temp.next=newnode;
        }
    }
    int arr[]=new int[5];
    void print(){
        if(head==null){
            System.out.println("linkedlist is empty");

        }
        else{
            System.out.println("Original linked lsit is here:");
            Node1 temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();
        }
    }
    void Reversed(){
            if(head==null){
                System.out.println("linkedlist is empty");
            }
            else{
                int i=0;
                Node1 temp=head;
                while(temp!=null){
                    arr[i++]=temp.data;
                    temp=temp.next;
                }
                System.out.println();
            }
            Node1 temp1=head;
            for(int j=4; j>=0; j--){
                temp1.data=arr[j];
                temp1=temp1.next;
            }
        Node1 temp3=head;
        System.out.println("Reversed linked list is here");
        while(temp3!=null){
            System.out.print(temp3.data+" ");
            temp3=temp3.next;

        }

    }

    public static void main(String[] args) {
        TASK02 tt=new TASK02();
        tt.add(1);
        tt.add(3);
        tt.add(5);
        tt.add(7);
        tt.add(9);
        tt.print();
        tt.Reversed();

    }
}
