/*
//Queue with help of linkedlist;
 public class Queue
{
   private int arr[];
    private Node front;
    private Node rear;
    private int capacity;
    private int count;

    // Constructor to initialize queue
    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
       // front = 0;
        //rear = 0;
        count = 0;
    }

    // Utility function to remove front element from the queue
  //  and check for Queue Underflow
    public void dequeue()
    {
        if(isEmpty()){
            System.out.println("Queue is underfellow");
        }
        else{
        // Write your code here
        front=front.next;}
        count--;
    }

    // Utility function to add an item to the queue and check
//for queue overflow
    public void enqueue(int item)
    {
        Node newnode=new Node(item);
        if(front==null){
            front=newnode;
            rear=newnode;



        }
        else{
        rear.next=newnode;
        rear=newnode;}
        count++;
        // Write your code here

    }

    // Utility function to return front element in the queue and
  //  check for Queue Underflow
    public int peek()
    {
        return front.data;

        // Write your code here
    }

    // Utility function to return the size of the queue
    public int size()
    {
        return count;


        // Write your code here
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty()
    {
        if(front==null){
            return true;
        }
        return false;
        // Write your code here
    }

    // Utility function to check if the queue is empty or not
    public int isFull()
    {
        return count=capacity;

        // Write your code here
    }
}

class Main
{
    // main function
    public static void main (String[] args)
    {
        // create a queue of capacity 5
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        q.dequeue();




       q.dequeue();
        q.dequeue();
 //       System.out.println(q.size());

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
*/
