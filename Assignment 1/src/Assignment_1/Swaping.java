public class Swaping {
    int data;
    Node1 head;
   static int size=0;
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
void print2(){
    if(head==null){
        System.out.println("linkedlist is empty");

    }
    else{
        System.out.println("Original linked lsit is here:");
        Node1 temp=head;
        while(temp!=null){
            size++;
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
}
void sort(){
        int i=0;
        int arr[]=new int [size];
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node1 temp=head;
            while(temp!=null){
                arr[i++]=temp.data;
                temp=temp.next;
            }

        }
        for( int k=0; k<size; k++){
            for(int j=0; j<size-1-k; j++){
                if(arr[j]>arr[j+1]){
                    int temp2=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp2;

                }
            }
        }
        Node1 temp3=head;
        for(int v=0; v<size; v++){
            temp3.data=arr[v];
            temp3=temp3.next;
        }
        Node1 temp5=head;
    System.out.println("Sorted arry is here: ");
        while(temp5!=null){
            System.out.print(temp5.data+" ");
            temp5=temp5.next;

        }
}

    public static void main(String[] args) {
        Swaping ss=new Swaping();
        ss.add(17);
        ss.add(9);
        ss.add(13);
        ss.add(5);
        ss.add(3);
        ss.print2();
        ss.sort();


    }
}

