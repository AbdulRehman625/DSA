public class QueueArr {
    // Class for queue


        private int arr[];
        private int front;
        private int rear;
        private int capacity;
        private int count;

        // Constructor to initialize queue
        QueueArr(int size)
        {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = 0;
            count = 0;
        }

        // Utility function to remove front element from the queue
       // and check for Queue Underflow
        public int dequeue()
        {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }


            else{
                int data=arr[front];
                front=(front+1)% capacity;
                count--;
                return data;



            }


            // Write your code here
        }

        // Utility function to add an item to the queue and check
//for queue overflow
        public void  enqueue(int item)
        {
            if(isFull()){
                System.out.println("Queue is full");

            }



            else{
                arr[rear]=item;
                rear=(rear+1)% capacity;
                count++;
            }
            // Write your code here
        }

        // Utility function to return front element in the queue and
     //   check for Queue Underflow
        public int peek()
        {

            return arr[front];
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
            return(count==0);
            /*f(capacity< arr.length){
                return true;

            }
            return false;*/
            // Write your code here
        }

        // Utility function to check if the queue is empty or not
        public boolean isFull()
        {
            return (count==capacity);
            // Write your code here
        }


  /*public  class MainOne
    {*/
        // main function
        public static void main (String[] args)
        {
            // create a queue of capacity 5
            QueueArr q = new QueueArr(5);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            System.out.println("Front element is: " + q.peek());
            q.dequeue();
            System.out.println("Front element is: " + q.peek());

            System.out.println("Queue size is " + q.size());

            q.dequeue();
            q.dequeue();
            if (q.isEmpty())
                System.out.println("Queue Is Empty");
            else
              System.out.println("Queue Is Not Empty");
        }
    }


